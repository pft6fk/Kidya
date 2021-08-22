package com.example.kidya.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.kidya.MainActivity
import com.example.kidya.R
import com.example.kidya.databinding.ActivityLoginBinding
import com.example.kidya.databinding.ActivityMainBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        beforeNumber()
        binding.getSmsButton.setOnClickListener{
            checkNum()
        }
        binding.authorize.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }



    }



        // Inflate the layout for this fragment

    private fun checkNum(){
        if(binding.getSmsButton.text.toString().isBlank()){
            Toast.makeText(this, R.string.error_num, Toast.LENGTH_SHORT).show()
            beforeNumber()
        }
        else{
            afterNumber()
        }
    }

    private fun beforeNumber(){
        binding.authorize.visibility = View.GONE
        binding.oneMoreSms.visibility = View.GONE
        binding.smsInput.visibility = View.GONE
        binding.getSmsButton.visibility = View.VISIBLE
    }
    private fun afterNumber(){
        binding.authorize.visibility = View.VISIBLE
        binding.oneMoreSms.visibility = View.VISIBLE
        binding.smsInput.visibility = View.VISIBLE
        binding.getSmsButton.visibility = View.GONE
        }
}