package com.tutorialsbuzz.androidcheckbox

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkbox01.setOnCheckedChangeListener({ buttonView, isChecked ->
            Toast.makeText(this@MainActivity, buttonView.text.toString()+ ": " + isChecked, Toast.LENGTH_SHORT).show()
        })

        checkbox02.setOnCheckedChangeListener({ buttonView, isChecked ->
            Toast.makeText(this@MainActivity, buttonView.text.toString()+ ": " + isChecked, Toast.LENGTH_SHORT).show()
        })
    }
}
