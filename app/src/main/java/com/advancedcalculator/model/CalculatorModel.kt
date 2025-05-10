package com.advancedcalculator.model

class CalculatorModel {

    private var currentInput: String = ""
    private var history: MutableList<String> = mutableListOf()

    fun appendInput(value: String) {
        currentInput += value
    }

    fun clearInput() {
        currentInput = ""
    }

    fun calculate(): Double {
        // Implement basic calculation logic here
        // This is a placeholder for actual calculation logic
        return 0.0
    }

    fun getHistory(): List<String> {
        return history
    }

    fun addToHistory(result: String) {
        history.add(result)
    }

    fun exportResults(): String {
        // Implement logic to export results
        return history.joinToString(separator = "\n")
    }
}