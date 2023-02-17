package com.example.dagger2learning

import android.icu.text.UnicodeSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRegistrationService = DaggerUserRegistrationComponent.builder().build().getUserRegistrationService()
        userRegistrationService.registerUser("abc@gmail.com", "aksnlajf")
    }
}