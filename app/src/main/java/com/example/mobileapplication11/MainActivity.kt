package com.example.mobileapplication11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mobileapplication11.fragments.MainFragment
import com.example.mobileapplication11.onBoarding.SignUpFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.placeHolder, SignUpFragment.newInstance())
            .commit()
    }

}