package com.websarva.wings.android.souchef.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.websarva.wings.android.souchef.album.Album
import com.websarva.wings.android.souchef.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_goAlbum.setOnClickListener {
            val intent = Intent(applicationContext, Album::class.java)
            startActivity(intent)

        }
    }
}
