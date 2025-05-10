package com.advancedcalculator.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.advancedcalculator.R
import com.advancedcalculator.model.CalculatorModel
import kotlinx.android.synthetic.main.fragment_calculator.*

class CalculatorFragment : Fragment() {

    private lateinit var calculatorModel: CalculatorModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calculator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        calculatorModel = CalculatorModel()

        setupButtonListeners()
    }

    private fun setupButtonListeners() {
        button_0.setOnClickListener { appendToDisplay("0") }
        button_1.setOnClickListener { appendToDisplay("1") }
        button_2.setOnClickListener { appendToDisplay("2") }
        button_3.setOnClickListener { appendToDisplay("3") }
        button_4.setOnClickListener { appendToDisplay("4") }
        button_5.setOnClickListener { appendToDisplay("5") }
        button_6.setOnClickListener { appendToDisplay("6") }
        button_7.setOnClickListener { appendToDisplay("7") }
        button_8.setOnClickListener { appendToDisplay("8") }
        button_9.setOnClickListener { appendToDisplay("9") }
        button_add.setOnClickListener { performOperation("+") }
        button_subtract.setOnClickListener { performOperation("-") }
        button_multiply.setOnClickListener { performOperation("*") }
        button_divide.setOnClickListener { performOperation("/") }
        button_equals.setOnClickListener { calculateResult() }
        button_clear.setOnClickListener { clearDisplay() }
    }

    private fun appendToDisplay(value: String) {
        display_text_view.append(value)
    }

    private fun performOperation(operator: String) {
        calculatorModel.setOperator(operator)
        calculatorModel.setOperand(display_text_view.text.toString().toDouble())
        display_text_view.text = ""
    }

    private fun calculateResult() {
        val result = calculatorModel.calculate(display_text_view.text.toString().toDouble())
        display_text_view.text = result.toString()
    }

    private fun clearDisplay() {
        display_text_view.text = ""
        calculatorModel.clear()
    }
}