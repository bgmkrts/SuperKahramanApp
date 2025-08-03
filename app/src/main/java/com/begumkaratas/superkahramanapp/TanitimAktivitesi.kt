package com.begumkaratas.superkahramanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.begumkaratas.superkahramanapp.databinding.ActivityTanitimAktivitesiBinding

class TanitimAktivitesi : AppCompatActivity() {
    private lateinit var binding: ActivityTanitimAktivitesiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTanitimAktivitesiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

       // val adapterdenGelenIntent=intent
       // val secilenKahraman=adapterdenGelenIntent.getSerializableExtra("SeçilenKahraman",SuperKahraman::class.java)
       // val secilenKahraman=adapterdenGelenIntent.getSerializableExtra("seçilenKahraman") as SuperKahraman

        val secilenKahraman=MySingleton.secilenSuperKahraman
        secilenKahraman?.let {

            binding.imageView.setImageResource(secilenKahraman.gorsel)
            binding.isimTextView.text=secilenKahraman.isim
            binding.meslekTextView.text=secilenKahraman.meslek

        }

    }
}