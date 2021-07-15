package com.example.kotlintraining

class ControlFlowTask {

    fun swap(intArray : IntArray?, i : Int?, j : Int?) {
        try {
            val temp = intArray!![i!!]
            intArray[i] = intArray[j!!]
            intArray.set(j, temp)
        } catch (e : NullPointerException) {
            return
        }
    }

    fun forBubbleSort (intArray : IntArray?) : IntArray {
        val intArr = intArray
        try {
            for (i in 0 until (intArr!!.size - 1)) {
                for (j in 0 until (intArr.size - 1)) {
                    if (intArr[i] > intArr[j])
                        try {
                            swap(intArray, i, j)
                        } catch (e : StackOverflowError) {
                            e.printStackTrace()
                        }
                }
            }
        } catch (e : NullPointerException) {
            return intArrayOf(0)
        }

        return intArr
    }

    fun whileBubbleSort (intArray: IntArray) : IntArray {
        val intArr = intArray
        var isSwap = true

        try {
            while (isSwap) {
                isSwap = false
                for (i in 0 until (intArr.size - 1)) {
                    if (intArr[i] > intArr[i + 1]) {
                        try {
                            swap(intArr, i, i + 1)
                            isSwap = true
                        } catch (e : StackOverflowError) {
                            e.printStackTrace()
                        }
                    }
                }
            }
        } catch (e : NullPointerException) {
            return intArrayOf(0)
        }
        return intArr
    }

}