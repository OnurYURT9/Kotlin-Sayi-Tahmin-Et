package com.example.sayitahminet
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_tahmin.*
import kotlin.random.Random
class TahminActivity : AppCompatActivity()
{
    private var rasgelesayi = 0
    private var sayac = 5
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tahmin)

        rasgelesayi = Random.nextInt(101)
        Log.e("Rasgele Sayi",rasgelesayi.toString())

        buttontahmin.setOnClickListener()
        {
            sayac = sayac -1
            val tahmin = girdi.text.toString().toInt()
            if(tahmin == rasgelesayi)
            {
                val intent = Intent (this@TahminActivity,SonucActivity::class.java)
                intent.putExtra("sonuc",true)
                finish()
                startActivity(intent)
            }
            if(tahmin > rasgelesayi)
            {
                textViewyardim.text = "Azalt"
                kalan_hak.text = "Kalan Hak: $sayac"
            }
            if(tahmin<rasgelesayi)
            {
                textViewyardim.text = "Arttır"
                kalan_hak.text = "Kalan Hak: $sayac"
            }
            if(sayac == 0)
            {
                startActivity(Intent(this@TahminActivity,SonucActivity::class.java))
                intent.putExtra("sonuc",false)
                finish() }
            girdi.setText("")
        }
    }
}