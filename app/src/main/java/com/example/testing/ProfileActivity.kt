package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        request.setOnClickListener {
            startActivity(Intent(this,RequestActivity::class.java))
        }
        statics.setOnClickListener {
            startActivity(Intent(this,StaticActivity::class.java))
        }
        savedinfo.setOnClickListener {
            startActivity(Intent(this,SaveActivity::class.java))
        }
        offline.setOnClickListener {
            startActivity(Intent(this,OfflineActivity::class.java))
        }
        settingbtn.setOnClickListener {
            startActivity(Intent(this,SettingActivity::class.java))
        }
        morebtt.setOnClickListener {
            startActivity(Intent(this,MoreActivity::class.java))
        }
        switch1.setOnClickListener{
            if (switched.getVisibility() == View.VISIBLE){
                switched.setVisibility(View.INVISIBLE)
            }else{
                switched.setVisibility(View.VISIBLE)
            }
        }
    }
}
