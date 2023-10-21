package edu.uw.ischool.lwong121.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var pushCount: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGo = findViewById<Button>(R.id.btnGo)
        val onClicked: (View) -> Unit = {
            pushCount++

            val btnText: String = when (pushCount) {
                1 -> getString(R.string.pressed_btn_label_one)
                else -> getString(R.string.pressed_btn_label_multi, pushCount)
            }

            btnGo.text = btnText
        }
        btnGo.setOnClickListener(onClicked)
    }
}