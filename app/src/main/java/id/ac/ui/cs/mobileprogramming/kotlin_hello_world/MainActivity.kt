package id.ac.ui.cs.mobileprogramming.kotlin_hello_world

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button_1)
        button.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_DOWN -> showText()
                MotionEvent.ACTION_UP -> hideText()
            }

            v?.onTouchEvent(event) ?: true
        }
    }

    private fun hideText() {
        findViewById<TextView>(R.id.textView_1).visibility = View.GONE
    }

    private fun showText() {
        findViewById<TextView>(R.id.textView_1).visibility = View.VISIBLE
    }
}
