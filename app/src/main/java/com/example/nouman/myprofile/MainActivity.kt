package com.example.nouman.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var photo: ImageView? = null
    var eduButton: Button? = null
    var workButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        photo = findViewById(R.id.profilePhoto)
        photo?.setOnClickListener{
            val intent = Intent(this, ProfilePhotoActivity::class.java)
            startActivity(intent)
        }

        eduButton = findViewById(R.id.education)
        eduButton?.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        workButton = findViewById(R.id.experience)
        workButton?.setOnClickListener{
            val intent = Intent(this, ExperienceActivity::class.java)
            startActivity(intent)
        }
    }


}
