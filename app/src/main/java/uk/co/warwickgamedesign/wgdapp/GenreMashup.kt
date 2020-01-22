package uk.co.warwickgamedesign.wgdapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GenreMashup : AppCompatActivity() {

    val adjectives = listOf(
        "First-Person",
        "Second-Person",
        "Third-Person",
        "Fighting",
        "Platforming",
        "Stealth",
        "Survival",
        "Rhythm",
        "Action",
        "Adventure",
        "Souls-like",
        "Sandbox",
        "Multiplayer",
        "Single-player",
        "Racing",
        "Strategy",
        "Tactical",
        "Tower Defence",
        "Turn-based",
        "Realtime",
        "Serious",
        "Sports",
        "Competitive",
        "Casual",
        "Collectible",
        "Mobile",
        "Incremental",
        "Educational",
        "Party",
        "Life",
        "Dating",
        "MMO",
        "Point-and-click",
        "Text",
        "VR",
        "AR"
    )

    val nouns = listOf(
        "Platformer",
        "Shoot-em-up",
        "Beat-em-up",
        "Visual Novel",
        "Shooter",
        "Fighter",
        "Simulator",
        "Metroidvania",
        "RPG",
        "4X",
        "Auto Battler",
        "MOBA",
        "RTS",
        "MMO",
        "Board Game",
        "Card Game",
        "Idle Game",
        "eSport",
        "Logic Game",
        "Wargame",
        "Roguelike",
        "Roguelite",
        "Adventure",
        "Horror",
        "Battle Royale"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genre_mashup)

        val doMashupBtn = findViewById<Button>(R.id.btnDoMashup)
        val mashupTxt = findViewById<TextView>(R.id.txtMashup)

        doMashupBtn.setOnClickListener {
            val adj = adjectives.random()
            val noun = nouns.random()

            mashupTxt.text = getString(R.string.mashup_template, adj, noun)
        }
    }
}
