package com.websarva.wings.android.souchef.album

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.websarva.wings.android.souchef.R
import kotlinx.android.synthetic.main.activity_album.*

class Album : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_album)

        bt_homeAlbum.setOnClickListener {
            finish()
        }
    }
}
