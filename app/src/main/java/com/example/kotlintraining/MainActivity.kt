package com.example.kotlintraining

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {

    val consts : Constants = Constants()
    val collect : CollectionsTasks = CollectionsTasks()
    val controlFlowTask = ControlFlowTask()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(consts.floatToDouble(999f))
        /*println(consts.doubleToFloat(4567.0))
        println(consts.decimalToString(BigDecimal(123456789)))
        println(consts.stringToDecimal("987654321000"))

        collect.iterateThroughList(collect.list)
        collect.iterateThroughList(collect.mutableList)

        //чтобы сунуть элемент внутрь списка
        //придется сдвинуть все элементы с нужного индекса
        //на 1 право
        collect.mutableList.add(6)
        collect.mutableList.remove(6)

        collect.iterateThroughSet(collect.mutableSet)
        collect.iterateThroughSet(collect.set)

        //если пытаться добавить уже существующий элемент
        //то он не появится в set
        //после добавления элементы сортироваться не будут
        collect.mutableSet.add(0)
        collect.mutableSet.remove(0)

        collect.iterateThroughMap(collect.map)
        collect.iterateThroughMutableMap(collect.mutableMap)

        //put - метод добавления элемента в мапу
        collect.mutableMap.put(null, "qwerty")
        collect.mutableMap.remove(null)

        //при этом везде еще можно добавление и удаление через + и - сделать

        //поиск производится через getIndex, first()/find(), contains() (либо in, но этот оператор под капотом имеет contains),
        //binarySearch, Match-методы

        val intArray = intArrayOf(2, 10, 9, 4, 15, 67, 1, 17, 8, 4, 4)
        val testFor = controlFlowTask.forBubbleSort(intArray)
        val testWhile = controlFlowTask.whileBubbleSort(intArray)

        testFor.forEach { print("$it ") }
        println("\n")
        testWhile.forEach { print("$it ") }*/
    }
}