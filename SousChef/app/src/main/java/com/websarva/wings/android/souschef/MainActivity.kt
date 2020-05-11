package com.websarva.wings.android.souschef

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// IDEが自動インポートする場合もありますが
// それぞれ実装が異なる場合があるので、曖昧さを無くすためにここに列挙します
import android.content.Intent
import com.websarva.wings.android.souschef.album.Album
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_database.setOnClickListener{
            val intent = Intent(application, Album::class.java)
            startActivity(intent)
        }

    }
}
