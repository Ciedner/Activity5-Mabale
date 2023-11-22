package com.test.ciednermabale_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.ciednermabale_activity.databinding.ActivityCiednerMabale5Binding

class Ciedner_Mabale_Activity_5 : AppCompatActivity() {

    private lateinit var binding : ActivityCiednerMabale5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCiednerMabale5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.secondPage.setOnClickListener{
            val intent = Intent(this, NextPage::class.java)
            startActivity(intent);
        }
    }
}