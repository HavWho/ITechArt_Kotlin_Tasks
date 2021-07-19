package com.example.kotlintraining

data class SomeArgs(val first: String, val second: Float, val third: Int)

class FunctionsTasks {

    val string1 = "First String "
    val string2 = "Second String "

    fun someFunc1(vararg params: Int): Int {
        var result = 0
        for (param in params)
            result += param

        return result
    }

    fun someFunc2(s: String, f: Float, i: Int): SomeArgs {
        val first = s
        val second = f
        val third = i

        return SomeArgs(first, second, third)
    }

    fun someFunc3() {
        val first = "Hello "
        val second = "world!"

        fun concat(): String {
            val result = first + second
            return result
        }
    }

    @Synchronized
    fun someFunc4(f : (String, String) -> String) : String {
        return f(this.string1, this.string2)
    }

}