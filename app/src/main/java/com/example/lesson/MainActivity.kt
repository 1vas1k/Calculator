package com.example.lesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var editText : TextView? = null
    var flag = false
    var flagPlus = false
    var flagMinuse = false
    var flagDob = false
    var flagDil = false
    var number1 = ""
    var number2 = ""
    var error = false
    var dot = false


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editText)
    }

    fun onClick_0(view : View) {
        if (flag == false){
            number1 = number1 + "0"
            editText?.text = number1
        }else{
            number2 = number2 + "0"
            editText?.text = number2
        }
    }

    fun onClick_1(view : View) {
        if (flag == false){
            number1 = number1 + "1"
            editText?.text = number1
        }else{
            number2 = number2 + "1"
            editText?.text = number2
        }
    }

    fun onClick_2(view : View) {
        if (flag == false){
            number1 = number1 + "2"
            editText?.text = number1
        }else{
            number2 = number2 + "2"
            editText?.text = number2
        }
    }

    fun onClick_3(view : View) {
        if (flag == false){
            number1 = number1 + "3"
            editText?.text = number1
        }else{
            number2 = number2 + "3"
            editText?.text = number2
        }
    }

    fun onClick_4(view: View) {
        if (flag == false){
            number1 = number1 + "4"
            editText?.text = number1
        }else{
            number2 = number2 + "4"
            editText?.text = number2
        }
    }

    fun onClick_5(view : View) {
        if (flag == false){
            number1 = number1 + "5"
            editText?.text = number1
        }else{
            number2 = number2 + "5"
            editText?.text = number2
        }
    }

    fun onClick_6(view : View) {
        if (flag == false){
            number1 = number1 + "6"
            editText?.text = number1
        }else{
            number2 = number2 + "6"
            editText?.text = number2
        }
    }

    fun onClick_7(view : View) {
        if (flag == false){
            number1 = number1 + "7"
            editText?.text = number1
        }else{
            number2 = number2 + "7"
            editText?.text = number2
        }
    }

    fun onClick_8(view : View) {
        if (flag == false){
            number1 = number1 + "8"
            editText?.text = number1
        }else{
            number2 = number2 + "8"
            editText?.text = number2
        }
    }

    fun onClick_9(view : View) {
        if (flag == false){
            number1 = number1 + "9"
            editText?.text = number1
        }else{
            number2 = number2 + "9"
            editText?.text = number2
        }
    }

    fun onClick_delete(view: View) {
        editText?.text = "Введіть значення"
        number1 = ""
        number2 = ""
        flag = false
        dot = false
    }
    var operation = false
    fun onClick_plus(view: View){
        if (number1 != "" && number1 != "-"){
            if (operation == false){
                if (number2 == ""){
                    flag = true
                    dot = false
                    flagPlus = true
                    flagMinuse = false
                    flagDob = false
                    flagDil = false
                    operation = true
                }else{
                    val n1 = number1.toDouble()
                    val n2 = number2.toDouble()
                    var result = 0.0
                    if (flagPlus == true){
                        result = n1 + n2
                    }else if (flagMinuse == true){
                        result = n1 - n2
                    }else if (flagDob == true){
                        result = n1 * n2
                    }else if (flagDil == true){
                        if (n2 != 0.0){
                            result = n1 / n2
                        }else{
                            error = true
                            number1 = ""
                            dot = false
                        }
                    }
                    if (error == true){
                        editText?.text = "На нуль не можна ділити"
                        number1 = ""
                        dot = false
                        flag = false
                    }else{
                        val res_Int = result.toInt()
                        val res_double = res_Int.toDouble()
                        if (result / res_double == 1.0){
                            editText?.text = result.toString().replace(".0", "")
                        }else{
                            editText?.text = result.toString()
                        }
                        number1 = result.toString()
                    }
                    number2 = ""
                    dot = false
                    operation = true
                    flagPlus = true
                    flagMinuse = false
                    flagDob = false
                    flagDil = false
                    error = false
                }
            }
            if (editText?.text != number1){
                operation = false
            }
        }else{
            editText?.text = "Error"
            number1 = ""
            dot = false
        }
    }

    fun onClick_minuse(view: View){
        if (number1 != ""){
            if (number1 != "-"){
                if (operation == false){
                    if (number2 == ""){
                        flag = true
                        dot = false
                        flagPlus = false
                        flagMinuse = true
                        flagDob = false
                        flagDil = false
                        operation = true
                    }else {
                        val n1 = number1.toDouble()
                        val n2 = number2.toDouble()
                        var result = 0.0
                        if (flagPlus == true){
                            result = n1 + n2
                        }else if (flagMinuse == true){
                            result = n1 - n2
                        }else if (flagDob == true){
                            result = n1 * n2
                        }else if (flagDil == true){
                            if (n2 != 0.0){
                                result = n1 / n2
                            }else{
                                error = true
                                number1 = ""
                                dot = false
                            }
                        }
                        if (error == true){
                            editText?.text = "На нуль не можна ділити"
                            number1 = ""
                            dot = false
                            flag = false
                        }else{
                            val res_Int = result.toInt()
                            val res_double = res_Int.toDouble()
                            if (result / res_double == 1.0){
                                editText?.text = result.toString().replace(".0", "")
                            }else{
                                editText?.text = result.toString()
                            }
                            number1 = result.toString()
                        }
                        number2 = ""
                        dot = false
                        operation = true
                        flagPlus = false
                        flagMinuse = true
                        flagDob = false
                        flagDil = false
                        error = false
                    }
                }
            }
            if (editText?.text != number1){
                operation = false
            }
        }else{
            number1 = "-"
            editText?.text = number1
        }
    }

    fun onClick_dob(view: View){
        if (number1 != "" && number1 != "-"){
            if (operation == false){
                if (number2 == ""){
                    flag = true
                    dot = false
                    flagPlus = false
                    flagMinuse = false
                    flagDob = true
                    flagDil = false
                    operation = true
                }else{
                    val n1 = number1.toDouble()
                    val n2 = number2.toDouble()
                    var result = 0.0
                    if (flagPlus == true){
                        result = n1 + n2
                    }else if (flagMinuse == true){
                        result = n1 - n2
                    }else if (flagDob == true){
                        result = n1 * n2
                    }else if (flagDil == true){
                        if (n2 != 0.0){
                            result = n1 / n2
                        }else{
                            error = true
                            number1 = ""
                            dot = false
                        }
                    }
                    if (error == true){
                        editText?.text = "На нуль не можна ділити"
                        number1 = ""
                        dot = false
                        flag = false
                    }else{
                        val res_Int = result.toInt()
                        val res_double = res_Int.toDouble()
                        if (result / res_double == 1.0){
                            editText?.text = result.toString().replace(".0", "")
                        }else{
                            editText?.text = result.toString()
                        }
                        number1 = result.toString()
                    }
                    number2 = ""
                    dot = false
                    operation = true
                    flagPlus = false
                    flagMinuse = false
                    flagDob = true
                    flagDil = false
                    error = false
                }
            }
            if (editText?.text != number1){
                operation = false
            }
        }else{
            editText?.text = "Error"
            number1 = ""
            dot = false
        }
    }

    fun onClick_dil(view: View){
        if (number1 != "" && number1 != "-"){
            if (operation == false){
                if (number2 == ""){
                    flag = true
                    dot = false
                    flagPlus = false
                    flagMinuse = false
                    flagDob = false
                    flagDil = true
                    operation = true
                }else if (number2 != "0.0" && number2 != "0"){
                    val n1 = number1.toDouble()
                    val n2 = number2.toDouble()
                    var result = 0.0
                    if (flagPlus == true){
                        result = n1 + n2
                    }else if (flagMinuse == true){
                        result = n1 - n2
                    }else if (flagDob == true){
                        result = n1 * n2
                    }else if (flagDil == true){
                        if (n2 != 0.0){
                            result = n1 / n2
                        }else{
                            error = true
                            number1 = ""
                            dot = false
                        }
                    }
                    if (error == true){
                        editText?.text = "На нуль не можна ділити"
                        number1 = ""
                        dot = false
                        flag = false
                    }else{
                        val res_Int = result.toInt()
                        val res_double = res_Int.toDouble()
                        if (result / res_double == 1.0){
                            editText?.text = result.toString().replace(".0", "")
                        }else{
                            editText?.text = result.toString()
                        }
                        number1 = result.toString()
                    }
                    number2 = ""
                    dot = false
                    operation = true
                    flagPlus = false
                    flagMinuse = false
                    flagDob = false
                    flagDil = true
                    error = false
                }else{
                    editText?.text = "Бездарь, на ноль нельзя делить"
                }
            }
            if (editText?.text != number1){
                operation = false
            }
        }else{
            editText?.text = "Error"
            number1 = ""
            dot = false
        }
    }

    fun onClick_dot(view: View){
        if (flagPlus == false && flagMinuse == false && flagDob == false && flagDil ==false && dot == false){
            if (number1 != "" && number1 != "-"){
                number1 = number1 + "."
                editText?.text = number1
                dot =true
            }
        }else if (number2 != "" && dot == false){
            number2 = number2 + "."
            editText?.text = number2
            dot = true
        }
    }

    fun onClick_del_last(view: View){
        if (number2 == ""){
            if (number1 != ""){
                number1 = number1.replace(".$".toRegex(), "")
                editText?.text = number1
            }
        }else{
            number2 = number2.replace(".$".toRegex(), "")
            editText?.text = number2
        }
    }

    fun onClick_eq(view: View){
        if (number2 != ""){
            val n1 = number1.toDouble()
            val n2 = number2.toDouble()
            if(flagPlus == true){
                val sum = n1 + n2
                val sum_Int = sum.toInt()
                val sum_double = sum_Int.toDouble()
                if (sum / sum_double == 1.0){
                    editText?.text = sum.toString().replace(".0", "")
                }else{
                    editText?.text = sum.toString()
                }
                number1 = sum.toString()
            }
            if(flagMinuse == true){
                val sum = n1 - n2
                val sum_Int = sum.toInt()
                val sum_double = sum_Int.toDouble()
                if (sum / sum_double == 1.0){
                    editText?.text = sum.toString().replace(".0", "")
                }else{
                    editText?.text = sum.toString()
                }
                number1 = sum.toString()
                number1 = sum.toString()
            }
            if (flagDob == true){
                val sum = n1 * n2
                val sum_Int = sum.toInt()
                val sum_double = sum_Int.toDouble()
                if (sum / sum_double == 1.0){
                    editText?.text = sum.toString().replace(".0", "")
                }else{
                    editText?.text = sum.toString()
                }
                number1 = sum.toString()
                number1 = sum.toString()
            }
            if (flagDil == true){
                if (number2 != "0.0" && number2 != "0"){
                    val sum = n1 / n2
                    val sum_Int = sum.toInt()
                    val sum_double = sum_Int.toDouble()
                    if (sum / sum_double == 1.0){
                        editText?.text = sum.toString().replace(".0", "")
                    }else{
                        editText?.text = sum.toString()
                    }
                    number1 = sum.toString()
                    number1 = sum.toString()
                }else{
                    editText?.text = "Бездарь, на ноль нельзя делить"
                    number1 = ""
                }
            }
            number2 = ""
            flag = false
            dot = false
            flagPlus = false
            flagMinuse = false
            flagDil = false
            flagDob = false
        }else{
            editText?.text = number1
        }
    }
}