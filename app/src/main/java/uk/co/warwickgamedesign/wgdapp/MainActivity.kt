package uk.co.warwickgamedesign.wgdapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val logoView = findViewById<ImageView>(R.id.imageLogo)
        logoView.setImageResource(R.drawable.ic_wgd)

        val mashupBtn = findViewById<Button>(R.id.btnMashup)

        mashupBtn.setOnClickListener {
            startActivity(Intent(this, GenreMashup::class.java))
        }
    }
}
