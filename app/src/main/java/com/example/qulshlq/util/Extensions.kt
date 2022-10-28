package com.example.qulshlq.util

import android.content.Context
import com.example.qulshlq.R
import com.example.qulshlq.ui.formula.chicken.chicken_ratsion.model.RatsionModel

fun ratsion(context: Context,text:String):List<RatsionModel>{
    var list: ArrayList<RatsionModel> = arrayListOf()
    when(text){
        "1-4k"->{
            list = arrayListOf(
                RatsionModel(context.getString(R.string.energ), "3100\nKkal/kg"),
                RatsionModel(context.getString(R.string.protein), "18%"),
                RatsionModel(context.getString(R.string.klechatka), "2.9%"),
                RatsionModel(context.getString(R.string.oil), "6.5%"),
                RatsionModel(context.getString(R.string.lizin), "0.95%"),
                RatsionModel(context.getString(R.string.metionin), "0.31%"),
                RatsionModel(context.getString(R.string.kalsiy), "0.25%"),
                RatsionModel(context.getString(R.string.fosfor), "0.47%"),
                RatsionModel(context.getString(R.string.natriy), "0.18%")
            )
        }
        "1-4h"->{
            list = arrayListOf(
                RatsionModel(context.getString(R.string.energ), "3100\nKkal/kg"),
                RatsionModel(context.getString(R.string.protein), "22%"),
                RatsionModel(context.getString(R.string.klechatka), "4.5%"),
                RatsionModel(context.getString(R.string.oil), "7.0%"),
                RatsionModel(context.getString(R.string.lizin), "1.15%"),
                RatsionModel(context.getString(R.string.metionin), "0.48%"),
                RatsionModel(context.getString(R.string.kalsiy), "1.00%"),
                RatsionModel(context.getString(R.string.fosfor), "0.8%"),
                RatsionModel(context.getString(R.string.natriy), "0.3%")
            )
        }
        "5+"->{
            list = arrayListOf(
                RatsionModel(context.getString(R.string.energ), "3150\nKkal/kg"),
                RatsionModel(context.getString(R.string.protein), "19.0%"),
                RatsionModel(context.getString(R.string.klechatka), "4.5%"),
                RatsionModel(context.getString(R.string.oil), "7.0%"),
                RatsionModel(context.getString(R.string.lizin), "1.05%"),
                RatsionModel(context.getString(R.string.metionin), "0.44%"),
                RatsionModel(context.getString(R.string.kalsiy), "0.90%"),
                RatsionModel(context.getString(R.string.fosfor), "0.7%"),
                RatsionModel(context.getString(R.string.natriy), "0.3%")
            )
        }
        "6-21"->{
            list = arrayListOf(
                RatsionModel(context.getString(R.string.energ), "2900\nKkal/kg"),
                RatsionModel(context.getString(R.string.protein), "19.5%"),
                RatsionModel(context.getString(R.string.klechatka), "2.5%"),
                RatsionModel(context.getString(R.string.oil), "6.5%"),
                RatsionModel(context.getString(R.string.lizin), "1.0%"),
                RatsionModel(context.getString(R.string.metionin), "0.45%"),
                RatsionModel(context.getString(R.string.kalsiy), "1.1%"),
                RatsionModel(context.getString(R.string.fosfor), "0.8%"),
                RatsionModel(context.getString(R.string.natriy), "0.3%")
            )
        }
        "22-56"->{
            list = arrayListOf(
                RatsionModel(context.getString(R.string.energ), "2825\nKkal/kg"),
                RatsionModel(context.getString(R.string.protein), "17.5%"),
                RatsionModel(context.getString(R.string.klechatka), "3.0%"),
                RatsionModel(context.getString(R.string.oil), "7.0%"),
                RatsionModel(context.getString(R.string.lizin), "1.0%"),
                RatsionModel(context.getString(R.string.metionin), "0.4%"),
                RatsionModel(context.getString(R.string.kalsiy), "1.1%"),
                RatsionModel(context.getString(R.string.fosfor), "0.8%"),
                RatsionModel(context.getString(R.string.natriy), "0.3%")
            )
        }
        "57-112"->{
            list = arrayListOf(
                RatsionModel(context.getString(R.string.energ), "2775\nKkal/kg"),
                RatsionModel(context.getString(R.string.protein), "15.0%"),
                RatsionModel(context.getString(R.string.klechatka), "3.0%"),
                RatsionModel(context.getString(R.string.oil), "7.0%"),
                RatsionModel(context.getString(R.string.lizin), "0.7%"),
                RatsionModel(context.getString(R.string.metionin), "0.34%"),
                RatsionModel(context.getString(R.string.kalsiy), "1.2%"),
                RatsionModel(context.getString(R.string.fosfor), "0.7%"),
                RatsionModel(context.getString(R.string.natriy), "0.3%")
            )
        }
        "113-119"->{
            list = arrayListOf(
                RatsionModel(context.getString(R.string.energ), "2775\nKkal/kg"),
                RatsionModel(context.getString(R.string.protein), "16.5%"),
                RatsionModel(context.getString(R.string.klechatka), "3.5-5.0%"),
                RatsionModel(context.getString(R.string.oil), "7.0%"),
                RatsionModel(context.getString(R.string.lizin), "0.7%"),
                RatsionModel(context.getString(R.string.metionin), "0.38%"),
                RatsionModel(context.getString(R.string.kalsiy), "1.2%"),
                RatsionModel(context.getString(R.string.fosfor), "0.7%"),
                RatsionModel(context.getString(R.string.natriy), "0.3%")
            )
        }
        "17"->{
            list = arrayListOf(
                RatsionModel(context.getString(R.string.energ), "2775\nKkal/kg"),
                RatsionModel(context.getString(R.string.protein), "16.5%"),
                RatsionModel(context.getString(R.string.klechatka), "3.5-5.0%"),
                RatsionModel(context.getString(R.string.oil), "7.0%"),
                RatsionModel(context.getString(R.string.lizin), "0.7%"),
                RatsionModel(context.getString(R.string.metionin), "0.38%"),
                RatsionModel(context.getString(R.string.kalsiy), "1.2%"),
                RatsionModel(context.getString(R.string.fosfor), "0.7%"),
                RatsionModel(context.getString(R.string.natriy), "0.3%")
            )
        }
        "18-45"->{
            list = arrayListOf(
                RatsionModel(context.getString(R.string.energ), "2700\nKkal/kg"),
                RatsionModel(context.getString(R.string.protein), "17%"),
                RatsionModel(context.getString(R.string.klechatka), "5%"),
                RatsionModel(context.getString(R.string.oil), "6.5%"),
                RatsionModel(context.getString(R.string.lizin), "0.75%"),
                RatsionModel(context.getString(R.string.metionin), "0.32%"),
                RatsionModel(context.getString(R.string.kalsiy), "3.1%"),
                RatsionModel(context.getString(R.string.fosfor), "0.7%"),
                RatsionModel(context.getString(R.string.natriy), "0.3%")
            )
        }
        "46-65"->{
            list = arrayListOf(
                RatsionModel(context.getString(R.string.energ), "2600\nKkal/kg"),
                RatsionModel(context.getString(R.string.protein), "16%"),
                RatsionModel(context.getString(R.string.klechatka), "6.0%"),
                RatsionModel(context.getString(R.string.oil), "5.0%"),
                RatsionModel(context.getString(R.string.lizin), "0.7%"),
                RatsionModel(context.getString(R.string.metionin), "0.3%"),
                RatsionModel(context.getString(R.string.kalsiy), "3.1%"),
                RatsionModel(context.getString(R.string.fosfor), "0.7%"),
                RatsionModel(context.getString(R.string.natriy), "0.3%")
            )
        }
        "66+"->{
            list = arrayListOf(
                RatsionModel(context.getString(R.string.energ), "2600\nKkal/kg"),
                RatsionModel(context.getString(R.string.protein), "16%"),
                RatsionModel(context.getString(R.string.klechatka), "6.0%"),
                RatsionModel(context.getString(R.string.oil), "3.5-5.0%"),
                RatsionModel(context.getString(R.string.lizin), "0.7%"),
                RatsionModel(context.getString(R.string.metionin), "0.3%"),
                RatsionModel(context.getString(R.string.kalsiy), "3.1%"),
                RatsionModel(context.getString(R.string.fosfor), "0.7%"),
                RatsionModel(context.getString(R.string.natriy), "0.3%")
            )
        }
    }
   return list
}
val productImageList:List<Int> = listOf(
    R.drawable.ic_wheat,
    R.drawable.ic_corn,
    R.drawable.ic_soybean,
    R.drawable.ic_milk,
    R.drawable.ic_vitamin
)