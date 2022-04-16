package com.malikali.supportallscreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


//generate different layouts from initial layout for each screen size and mode
// Ensure to specify width size

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}