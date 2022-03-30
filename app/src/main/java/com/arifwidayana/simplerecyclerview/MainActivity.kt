package com.arifwidayana.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.arifwidayana.simplerecyclerview.databinding.ActivityMainBinding
import com.arifwidayana.simplerecyclerview.model.Contact
import com.arifwidayana.simplerecyclerview.model.ContactAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listData = arrayListOf(
            Contact("Ari", "084846548484"),
            Contact("Araai", "086543318684"),
            Contact("Arai", "0831384313215"),
            Contact("Arrrri", "081346487555"),
            Contact("Aaaari", "086464897444"),
            Contact("Areiiii", "086546466487"),
            Contact("Aariioii", "0818764435154"),
            Contact("Ariiiiiii", "084648465464"),
            Contact("Aaaaari", "089879723134")
        )

        val adapter = ContactAdapter(listData)
        //val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.apply {
            //rvContact.layoutManager = layoutManager
            rvContact.adapter = adapter
        }
    }
}