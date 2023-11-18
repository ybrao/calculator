package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

 lateinit var binding: ActivityMainBinding


    private var concatSingleInt=""
    private var case=""

    private var val1=0
    private var val2=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this@MainActivity, R.layout.activity_main)




        binding.one.setOnClickListener {
            concatSingleInt =  binding.editTextNumber.text.toString()+ "1"
            binding.editTextNumber.setText(concatSingleInt)

        }

        binding.two.setOnClickListener {
            concatSingleInt= binding.editTextNumber.text.toString()+ "2"
            binding.editTextNumber.setText(concatSingleInt)

        }
        binding.three.setOnClickListener {
            concatSingleInt= binding.editTextNumber.text.toString()+ "3"
            binding.editTextNumber.setText(concatSingleInt)

        }
        binding.four.setOnClickListener {
            concatSingleInt= binding.editTextNumber.text.toString()+ "4"
            binding.editTextNumber.setText(concatSingleInt)

        }
        binding.five.setOnClickListener {
            concatSingleInt= binding.editTextNumber.text.toString()+ "5"
            binding.editTextNumber.setText(concatSingleInt)

        }
        binding.six.setOnClickListener {
            concatSingleInt= binding.editTextNumber.text.toString()+ "6"
            binding.editTextNumber.setText(concatSingleInt)

        }
        binding.seven.setOnClickListener {
            concatSingleInt= binding.editTextNumber.text.toString()+ "7"
            binding.editTextNumber.setText(concatSingleInt)

        }
        binding.eight.setOnClickListener {
            concatSingleInt= binding.editTextNumber.text.toString()+ "8"
            binding.editTextNumber.setText(concatSingleInt)

        }
        binding.nine.setOnClickListener {
            concatSingleInt= binding.editTextNumber.text.toString()+ "9"
            binding.editTextNumber.setText(concatSingleInt)

        }
        binding.zero.setOnClickListener {
            concatSingleInt= binding.editTextNumber.text.toString()+ "0"
            binding.editTextNumber.setText(concatSingleInt)

        }



        binding.button11.setOnClickListener {
            //   concatSingleInt =  binding.editTextNumber.text.toString()+ ""
            binding.editTextNumber.setText("")
        }

        binding.button17.setOnClickListener {
            case="+"
             val1=binding.editTextNumber.text.toString().toInt()
              binding.editTextNumber.setText("")
        }

        binding.subtraction.setOnClickListener {
            case="-"
            val1=binding.editTextNumber.text.toString().toInt()
            binding.editTextNumber.setText("")
        }


        binding.divide.setOnClickListener {
            case="/"
            val1=binding.editTextNumber.text.toString().toInt()
            binding.editTextNumber.setText("")
        }


        binding.multiply.setOnClickListener {
            case="*"
            val1 = binding.editTextNumber.text.toString().toInt()
            binding.editTextNumber.setText("")

        }


        binding.clear.setOnClickListener {

            val1 = binding.editTextNumber.text.toString().toInt()
            binding.editTextNumber.setText("0")

        }







        binding.equalto.setOnClickListener {
                try {


                    when(case) {

                        "+" -> {
                            val2 = binding.editTextNumber.text.toString().toInt()
                            binding.editTextNumber.setText((val1 + val2).toString())
                        }


                        "-" -> {
                            val2 = binding.editTextNumber.text.toString().toInt()
                            binding.editTextNumber.setText((val1 - val2).toString())
                        }

                        "*" ->{
                            val2 = binding.editTextNumber.text.toString().toInt()
                            binding.editTextNumber.setText((val1 * val2).toString())
                        }

                        "/" ->{
                            val2 = binding.editTextNumber.text.toString().toInt()
                            binding.editTextNumber.setText((val1 / val2).toString())
                        }

                    }


                }
                catch(e:Exception){

                    Toast.makeText(   this@MainActivity,   e.message ,    Toast.LENGTH_LONG  )   .show()                }

        }

    }
}
