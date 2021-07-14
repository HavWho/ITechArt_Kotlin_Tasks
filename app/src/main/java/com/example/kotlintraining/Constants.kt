package com.example.kotlintraining

import android.util.Log
import java.math.BigDecimal
import java.net.URL

class Constants {

    val stringConst = "Hello, World!"
    val intConst = 49
    val urlConst = URL("https://developer.android.com/reference/kotlin/android/net/Uri")

    fun floatToDouble(float: Float?) : Double{
        try {
            return float!!.toDouble()
        } catch (e : NullPointerException){
            Log.e(e.printStackTrace().toString(), "Null Pointer Float")
            return 0.0
        }
    }

    fun doubleToFloat(double: Double?) : Float{
        try {
            return double!!.toFloat()
        } catch (e : NullPointerException){
            Log.e(e.printStackTrace().toString(), "Null Pointer Double")
            return 0f
        }
    }

    fun decimalToString(decimal: BigDecimal?) : String{
        try {
            return decimal!!.toString()
        } catch (e : NullPointerException) {
            Log.e(e.printStackTrace().toString(), "Null Pointer Float")
            return ""
        }
    }

    fun stringToDecimal(string: String?) : BigDecimal{
        try {
            return string!!.toBigDecimal()
        } catch (e : NullPointerException) {
            Log.e(e.printStackTrace().toString(), "Null Pointer String")
            return BigDecimal(0)
        }

    }

}
