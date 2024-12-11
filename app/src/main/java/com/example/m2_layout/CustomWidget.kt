package com.example.m2_layout

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.m2_layout.databinding.MyCustomWidgetBinding

class CustomWidget
@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    val binding = MyCustomWidgetBinding.inflate(LayoutInflater.from(context))

    init {
        addView(binding.root)
    }

    fun setTextTop(text: String) {
        if (text != null) {
            binding.textTop.text = text
        }
    }
    fun setTextEnd(text: String) {
        if (text != null) {
            binding.textEnd.text = text
        }
    }
}

