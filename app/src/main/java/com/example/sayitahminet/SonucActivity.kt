package com.example.sayitahminet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_sonuc.*

class SonucActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonuc)

        val sonuc = intent.getBooleanExtra("sonuc",false)

        if (sonuc){

            textViewsonuc.text = "KAZANDINIZ"
            imageViewsonuc.setImageResource(R.drawable.mutlu_resim)
        }else
        {
            textViewsonuc.text = "KAYBETTİNİZ"
            imageViewsonuc.setImageResource(R.drawable.uzgun)
        }

        buttontekrar.setOnClickListener{
           val intent = Intent (this@SonucActivity,TahminActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}