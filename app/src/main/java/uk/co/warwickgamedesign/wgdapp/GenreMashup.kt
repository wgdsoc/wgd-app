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
        "Dating",
        "MMO",
        "Point-and-click",
        "Text",
        "VR",
        "AR",
        "Physics",
        "QWOP-like",
        "Quicktime",
        "Puzzle",
        "Procedurally-generated",
        "Pinball",
        "Military",
        "Gacha",
        "Trading",
        "Tabletop",
        "Murder Mystery",
        "Open-world",
        "Social",
        "Pen-and-paper",
        "Children's",
        "Cooking",
        "Fishing",
        "Arcade",
        "Maze",
        "Typing",
        "Painting",
        "Experimental",
        "Political"
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
        "Battle Royale",
        "Flight Sim",
        "Bullet Hell",
        "Gambling",
        "Light Gun Game",
        "FMV Game",
        "Game Show",
        "Tycoon",
        "Crafting",
        "God Game",
        "Dress-up",
        "Hero Shooter",
        "Building Sim",
        "Thriller",
        "Life Sim"
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
