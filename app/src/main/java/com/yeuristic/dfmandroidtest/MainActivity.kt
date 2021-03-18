package com.yeuristic.dfmandroidtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.yeuristic.dfmandroidtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonDynamicActivity.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            binding.buttonDynamicActivity -> startActivity(Intent().setClassName(BuildConfig.APPLICATION_ID, "com.yeuristic.dynamicfeature.DynamicActivity"))
        }
    }
}