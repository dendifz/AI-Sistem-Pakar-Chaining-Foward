package com.ldendi.chainingfoward

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var A = true
        var B = false
        var C = false
        var D = true

        var E = "Membeli Merek Asus"
        var F = "Membeli Merek Lenovo"
        var G = "Membeli Merek Acer"

        var hasil: TextView = findViewById(R.id.hasilTVMain)

        if (A && C) hasil.text = E
        if (D && C) hasil.text = F
        if (B && D) hasil.text = F
        if (B) hasil.text = "Memilih laptop yang ram-nya besar"  //Karena Fakta Pembeli Hanya Mempunyai Budget 4JT Maka Tree & Object Tidak Dilanjutkan
        if (D) hasil.text = G

    }
}