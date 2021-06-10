package com.example.mykotlinapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var input: String = input1.text.toString()

            when {
                radioButton.isChecked -> {
                    ans1.text = input
                    ans2.text = (input.toFloat() / 3.28).toString()
                    ans3.text = (input.toFloat() * 12).toString()
                    //in feet
                }
                radioButton2.isChecked -> {
                    ans1.text = (input.toFloat()/0.3048).toString()
                    ans2.text = input
                    ans3.text = (input.toFloat() * 39.37).toString()
                    //in meter
                }
                radioButton3.isChecked -> {
                    ans1.text = (input.toFloat() / 12).toString()
                    ans2.text = (input.toFloat() * 0.025).toString()
                    ans3.text = input
                    //in inch
                }
            }
        }
    }
}
