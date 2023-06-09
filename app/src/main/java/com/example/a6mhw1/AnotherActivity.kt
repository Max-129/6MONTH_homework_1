package com.example.a6mhw1

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a6mhw1.databinding.ActivityAnotherBinding

class AnotherActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnotherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnotherBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editText2.setText(intent.getStringExtra("text1"))

        binding.button2.setOnClickListener {
            val intent = Intent()
            intent.putExtra("text", binding.editText2.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}