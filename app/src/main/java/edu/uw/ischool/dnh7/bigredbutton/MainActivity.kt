package edu.uw.ischool.dnh7.bigredbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.big_button)
        button.setOnClickListener {
           clickMe(button)
        }

    }

    private fun clickMe(button: Button) {
        count+= 1

        button.text = getString(R.string.pushed_text, count, if (count > 1) "times" else "time")
    }
}
