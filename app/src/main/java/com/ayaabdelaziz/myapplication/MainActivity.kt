package com.ayaabdelaziz.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.ViewModelProvider
import com.ayaabdelaziz.myapplication.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var activityViewModel: ActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        activityViewModel = ViewModelProvider(this)[ActivityViewModel::class.java]
        binding.activityViewModel = activityViewModel
        binding.lifecycleOwner = this


        val user = User(
            "Aya",
            "Abdelaziz",
            true,
            "https://cdn.elwatannews.com/watan/840x473/16193411411644568805.jpg"
        )
        binding.user=user

//        activityViewModel.messege.observe(this,{
//            binding.tv.text=it
//        })

        binding.edtxt.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                activityViewModel.changeTxt(p0.toString())
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
    }
}