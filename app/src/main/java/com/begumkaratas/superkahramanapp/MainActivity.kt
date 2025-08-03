package com.begumkaratas.superkahramanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.begumkaratas.superkahramanapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var superKahramanList: ArrayList<SuperKahraman>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val superman=SuperKahraman("süperman","gazeteci",R.drawable.superman)
        val batman=SuperKahraman("batman","patron",R.drawable.batman)
        val aquaman=SuperKahraman("aquaman","Kral",R.drawable.aquaman)
        val ironman=SuperKahraman("ironman","holding sahibi", R.drawable.ironman)

        superKahramanList=arrayListOf(superman,batman,aquaman,ironman)


      /*  superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)
        superKahramanList.add(superman)*/


        val adapter=SuperKahramanAdapter(superKahramanList)
        binding.superKahramanRecyclerView.layoutManager=LinearLayoutManager(this)
        binding.superKahramanRecyclerView.adapter=adapter








    }
}