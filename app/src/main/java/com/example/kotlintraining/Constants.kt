package com.example.kotlintraining

import android.util.Log
import java.math.BigDecimal
import java.net.URL
import java.nio.ByteBuffer
import java.nio.ByteOrder

class Constants {

    val stringConst = "Hello, World!"
    val intConst = 49
    val urlConst = URL("https://developer.android.com/reference/kotlin/android/net/Uri")

    //для побитовых операций - toRawBits

    fun floatToDouble(float: Float?) : Double{
        try {
            return ByteBuffer.allocate(16).order(ByteOrder.LITTLE_ENDIAN).putFloat(float!!)
                .getDouble(0)
        } catch (e : NullPointerException){
            Log.e(e.printStackTrace().toString(), "Null Pointer Float")
            return 0.0
        }
    }

    fun doubleToFloat(double: Double?) : Float{
        try {
            return ByteBuffer.allocate(16).order(ByteOrder.LITTLE_ENDIAN).putDouble(double!!)
                .getFloat(0)
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
