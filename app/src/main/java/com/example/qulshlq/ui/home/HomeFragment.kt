package com.example.qulshlq.ui.home
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsetsController
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.qulshlq.R
import com.example.qulshlq.databinding.FragmentHomeBinding
import com.example.qulshlq.ui.MainActivity
import com.example.qulshlq.util.LocaleManager
import com.example.qulshlq.util.viewBinding
import com.orhanobut.hawk.Hawk


class HomeFragment : Fragment(R.layout.fragment_home) {
    private val binding by viewBinding { FragmentHomeBinding.bind(it) }
    private var count = 0
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().window.statusBarColor =
            ContextCompat.getColor(requireActivity(), R.color.white)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            requireActivity().window.decorView.windowInsetsController?.setSystemBarsAppearance(
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
            )
        }
        binding.card1.setOnClickListener {
            val navControl = Navigation.findNavController(requireActivity(), R.id.mainContainer)
            navControl.navigate(R.id.home_to_henMeat)
        }
        binding.card2.setOnClickListener {
            val navControl = Navigation.findNavController(requireActivity(), R.id.mainContainer)
            navControl.navigate(R.id.home_to_henEgg)
        }
        val languageList: List<String> = listOf(getString(R.string.uzbek),getString(R.string.qr))
        setAdapter(binding.spLanguage, languageList)
        if(getLanguage()=="uz"){
           binding.spLanguage.setSelection(0)
        }else{
            binding.spLanguage.setSelection(1)
        }

        binding.spLanguage.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                count++
                if (position==0){
                    setLanguagePref("uz")

                }else{
                    setLanguagePref("")
                }
                if (count>1){
                    findNavController().navigate(R.id.action_home_self)
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        }
    }
    private fun setAdapter(sp: Spinner, list: List<String>) {
        val adapter = ArrayAdapter(requireContext(), R.layout.spinner_item, list)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sp.adapter = adapter
    }
    private fun getLanguage(): String {
        return Hawk.get("pref_lang", "")
    }
    private fun setLanguagePref(id: String) {
        Hawk.put("pref_lang", id)
        LocaleManager.setLocale(requireContext())
    }
}