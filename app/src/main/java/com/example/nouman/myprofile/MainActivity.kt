package com.example.nouman.myprofile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profilePhoto.setOnClickListener{
            val intent = Intent(this, ProfilePhotoActivity::class.java)
            startActivity(intent)
        }

        education.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent);
        }

        experience.setOnClickListener{
            val intent = Intent(this, ExperienceActivity::class.java)
            startActivity(intent);
        }
    }


}
