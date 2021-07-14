package com.example.kotlintraining

data class Dot(val x : Float, val y : Float)

class CollectionsTasks {

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    val list = listOf(1, 2, 3, 4, 5)
    val mutableSet = mutableSetOf(1, 2, 3, 4, 4, 5)
    val set = setOf(1, 2, 3, 4, 4, 5)
    val mutableMap = mutableMapOf<Any?, Any?>(1 to "a", 2 to "b")
    val map = mapOf<Any?, Any?>(1 to "hello", null to "android", "itechart" to "remarkable")

    val x = "10"
    val y = "10"

    val testMap = mapOf<Any?, Int>("10" to 100, x to 101, y to 102)

    fun iterateThroughList(list : List<Any?>) {
        //also with forEach
        val iterator = list.iterator()
        while (iterator.hasNext())
            println(iterator.next())

        println(" ")
    }

    fun iterateThroughSet(set : Set<Any?>) {
        for (value in set)
            println(value)

        println(" ")
    }

    fun iterateThroughMap(map : Map<Any?, Any?>) {
        map.keys.forEach{
            println(map[it])
        }
    }

    fun iterateThroughMutableMap(map : MutableMap<Any?, Any?>) {
        val iterator = map.iterator()

        while (iterator.hasNext()){
            println(iterator.next())
        }

    }

}