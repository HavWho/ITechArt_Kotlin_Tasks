package com.example.kotlintraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    val consts : Constants = Constants()
    val collect : CollectionsTasks = CollectionsTasks()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(consts.floatToDouble(999f))
        println(consts.doubleToFloat(4567.0))
        println(consts.decimalToString(BigDecimal(123456789)))
        println(consts.stringToDecimal("987654321000"))

        collect.iterateThroughList(collect.list)
        collect.iterateThroughList(collect.mutableList)

        collect.iterateThroughSet(collect.mutableSet)
        collect.iterateThroughSet(collect.set)

        collect.iterateThroughMap(collect.map)

        println(collect.x == collect.y)
        println(collect.x.equals(collect.y))

        collect.iterateThroughMutableMap(collect.mutableMap)

    }
}