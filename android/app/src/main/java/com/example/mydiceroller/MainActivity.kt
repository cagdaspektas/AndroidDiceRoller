package com.example.mydiceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton:Button = findViewById(R.id.roll_button)

        //rollButton.text="Salla bakalım" yaparak dinamik şekilde kullanılabilinir.
        rollButton.setOnClickListener {
          ZarAt()
        }
        diceImage=findViewById(R.id.dice_image)
    }

    private fun ZarAt() {

    var randomInt=  Random.nextInt(6)+1
      var drawableResource=  when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)


    }
}