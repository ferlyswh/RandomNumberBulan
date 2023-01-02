package com.example.randomnumber

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1  = findViewById<Button>(R.id.button1)
        val random_angka = findViewById<TextView>(R.id.textView)
        val random_bulan = findViewById<TextView>(R.id.textView2)

        button1.setOnClickListener{
            val a = Random.nextInt(1, 12)
            random_angka.setText(a.toString())

            val jan = "January"
            val feb = "February"
            val mar = "Maret"
            val apr = "April"
            val mei = "Maret"
            val jun = "Juni"
            val jul = "Juli"
            val agt = "Agustus"
            val sep = "September"
            val okt = "Oktober"
            val nov = "November"
            val des = "Desember"


            when (a) {
                1 -> random_bulan.setText(jan)
                2 -> random_bulan.setText(feb)
                3 -> random_bulan.setText(mar)
                4 -> random_bulan.setText(apr)
                5 -> random_bulan.setText(mei)
                6 -> random_bulan.setText(jun)
                7 -> random_bulan.setText(jul)
                8 -> random_bulan.setText(agt)
                9 -> random_bulan.setText(sep)
                10 -> random_bulan.setText(okt)
                11 -> random_bulan.setText(nov)
                else -> {
                    random_bulan.setText(des)
                }
            }

        }



    }

}

