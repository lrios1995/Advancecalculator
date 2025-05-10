package com.advancedcalculator.utils

object MathUtils {
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) throw IllegalArgumentException("Cannot divide by zero")
        return a / b
    }

    fun power(base: Double, exponent: Double): Double {
        return Math.pow(base, exponent)
    }

    fun squareRoot(value: Double): Double {
        if (value < 0) throw IllegalArgumentException("Cannot take square root of a negative number")
        return Math.sqrt(value)
    }

    fun logarithm(value: Double, base: Double = Math.E): Double {
        if (value <= 0) throw IllegalArgumentException("Logarithm undefined for non-positive values")
        return Math.log(value) / Math.log(base)
    }

    fun sin(angle: Double): Double {
        return Math.sin(Math.toRadians(angle))
    }

    fun cos(angle: Double): Double {
        return Math.cos(Math.toRadians(angle))
    }

    fun tan(angle: Double): Double {
        return Math.tan(Math.toRadians(angle))
    }

    fun factorial(n: Int): Long {
        if (n < 0) throw IllegalArgumentException("Factorial is not defined for negative numbers")
        return if (n == 0) 1 else n * factorial(n - 1)
    }
}