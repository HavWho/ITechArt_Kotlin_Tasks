package com.example.kotlintraining

import android.util.Log
import java.math.BigDecimal
import java.net.URL
import java.nio.ByteBuffer
import java.nio.ByteOrder
import kotlin.experimental.and
import kotlin.random.Random

class Constants {

    val stringConst = "Hello, World!"
    val intConst = 49
    val urlConst = URL("https://developer.android.com/reference/kotlin/android/net/Uri")

    //для побитовых операций - toRawBits

    fun floatToDouble(float: Float?) : MutableList<Any>{
        try {
            val b = ByteArray(9)

            Random.nextBytes(b)
            for (i in 0..b.size - 1) {
                print(b[i])
                print(" ")
            }

            println("\n")

            val vf = ByteBuffer.allocate(9).put(b)
            val mutList : MutableList<Any> = mutableListOf()
            mutList.add(vf.getFloat(0))
            mutList.add(vf.getShort(4))
            mutList.add(vf.getShort(6))

            val bools = vf.get(8).toInt()

            for (i in 1..8) {
                mutList.add(bools.shl(i).and(0x80) != 0)
            }

            return mutList
        } catch (e : NullPointerException){
            Log.e(e.printStackTrace().toString(), "Null Pointer Float")
            return mutableListOf(0)
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
