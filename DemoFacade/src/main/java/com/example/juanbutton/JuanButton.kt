package com.example.juanbutton

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class JuanButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {
    init {
        LayoutInflater.from(context).inflate(R.layout.component_button_juan, this, true)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            Toast.makeText(context, "Mi primera libreria", Toast.LENGTH_LONG).show()
        }
    }
}