package com.tutorialsbuzz.androidcheckbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.Toast
import androidx.core.view.setPadding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        checkbox01.setOnCheckedChangeListener({ buttonView, isChecked ->
            Toast.makeText(this@MainActivity, "" + isChecked, Toast.LENGTH_SHORT).show()
        })

        val checkBox = CheckBox(this)
        checkBox.layoutParams =
            ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        checkBox.setText("CheckBox")
        checkBox.setPadding(24)
        checkBox.setTextSize(TypedValue.COMPLEX_UNIT_SP,15f)
        root.addView(checkBox)


    }
}
