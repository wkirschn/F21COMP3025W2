package com.example.f21comp3025w2

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }



    @Test
    fun readOnly(){
        // val means immutable. Once it has a value, it cannot be changed
        //In Java final String flavour = "Peach";
        val flavour = "Strawberry"

        println("The first choice flavour was $flavour")

    }

    @Test
    fun changeVar()
    {
        var flavour = "Black Thunder"
        flavour = "Banana Boat"
        // With var, the variable's value can be changed
        println("The new flavour is $flavour")

    }

    @Test
    fun allowForNull()
    {
        var flavour : String? = null

        // We know that this could possibly be null, expecting a string otherwise
        // Null Pointer Exception Avoidence
        // The String? states that it doesn't know if it will be a null. If not, then it will be a String
        if (flavour.equals("Banana Boat"))
            println("Banana Boat is the flavour")
        else
            println("Wrong. The flavour is $flavour!!!!")


    }


    @Test
    fun elvisOperator(){
        var flavour: String? = null
        //elvis ?: if it's null, assign another value
        //Think of this as a default value as a backup if there is a null

        println(flavour ?: "something else")
        flavour = "beans"
        println(flavour ?: "something else")

    }


    fun multiply(left : Int, right: Int = 10) : Int
    {
        println("left: $left * right: $right = " + left * right)
       return left * right
    }

    fun addition(left: Int, right: Int = 10, another:Int = 20) : Int

    {
        println("left: $left + right $right + $another = " + left + right + another)
        return left + right + another
    }

    @Test
    fun testMultiplyFunction()
    {
        assertEquals(50, multiply(10,5))
        assertEquals(20, multiply(2))

    }

    fun testWithMultipleDefaultValues()
    {
        assertEquals(6, addition(1,2,3))
        assertEquals(23,addition(1,2))
        assertEquals(31,addition(1))
    }

}