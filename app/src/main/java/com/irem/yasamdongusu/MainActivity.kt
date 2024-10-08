package com.irem.yasamdongusu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.irem.yasamdongusu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        println("onCreate çalıştırıldı.")
    }

    override fun onStart() {
        super.onStart()
        println("onStart çalıştırıldı.")
    }

    override fun onResume() {
        super.onResume()
        println("onResume çalıştırıldı.")
    }

    override fun onPause() {
        super.onPause()
        println("onPause çalıştırıldı.")
    }

    override fun onStop() {
        super.onStop()
        println("onStop çalıştırıldı.")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy çalıştırıldı.")
    }
}