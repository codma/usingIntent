package com.simmariazi.usingintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simmariazi.usingintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setUpUI()
    }
    private fun setUpUI(){
        binding.btnSMS.setOnClickListener{
            val uri = Uri.parse("smsto:" + "01011112222")
            val intent = Intent(Intent.ACTION_SENDTO,uri)
            intent.putExtra("sms_body","문자를 입력하세요")
            startActivity(intent)
        }
        binding.btnInternet.setOnClickListener{
            val uri = Uri.parse("http://www.trenbe.com")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
        binding.btnMap.setOnClickListener{
            val uri = Uri.parse("geo: 37.5310091, 127.0261659")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
        binding.btnGit.setOnClickListener{
            val uri = Uri.parse("https://github.com/codma/usingIntent.git")
            val intent = Intent(Intent.ACTION_VIEW,uri)
            startActivity(intent)
        }
    }
}