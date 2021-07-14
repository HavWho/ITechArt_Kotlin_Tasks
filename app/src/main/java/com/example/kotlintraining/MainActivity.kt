package com.example.kotlintraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    val consts : Constants = Constants()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(consts.intConst)
        println(consts.stringConst)
        println(consts.urlConst)

        println(consts.floatToDouble(null))
        println(consts.doubleToFloat(4567.0))
        println(consts.decimalToString(BigDecimal(123456789)))
        println(consts.stringToDecimal("987654321000"))
    }
}