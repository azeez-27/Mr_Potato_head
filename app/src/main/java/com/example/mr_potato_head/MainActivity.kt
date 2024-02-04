package com.example.mr_potato_head

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addPart()
    }

    fun addPart(){
        val hat: CheckBox = findViewById(R.id.hatCheckBox)
        val eyes: CheckBox = findViewById(R.id.eyesCheckBox)
        val eyebrow: CheckBox = findViewById(R.id.eyebrowsCheckBox)
        val glasses: CheckBox = findViewById(R.id.glassesCheckBox)
        val nose: CheckBox = findViewById(R.id.NoseCheckBox)
        val mouth: CheckBox = findViewById(R.id.MouthCheckBox)
        val mustache: CheckBox = findViewById(R.id.MustacheCheckBox)
        val ears: CheckBox = findViewById(R.id.EarsCheckBox)
        val hands: CheckBox = findViewById(R.id.ArmsCheckBox)
        val shoes: CheckBox = findViewById(R.id.ShoesCheckBox)

        //for hat
        hat.setOnCheckedChangeListener{ _, isChecked ->
            val img: ImageView = findViewById(R.id.imageView2)
            if(isChecked){
                val img: ImageView = findViewById(R.id.imageView2)
                img.visibility = View.VISIBLE
            }else{
                img.visibility = View.GONE
            }
        }

        //for eyes
        eyes.setOnCheckedChangeListener{ _, isChecked ->
            val img: ImageView = findViewById(R.id.imageView3)
            if(isChecked){
                img.visibility = View.VISIBLE
            }else{
                img.visibility = View.GONE
            }
        }

        //for eyebrow
        eyebrow.setOnCheckedChangeListener{ _, isChecked ->
            val img: ImageView = findViewById(R.id.imageView4)
            if(isChecked){
                img.visibility = View.VISIBLE
            }else{
                img.visibility = View.GONE
            }
        }

        //for glasses
        glasses.setOnCheckedChangeListener{ _, isChecked ->
            val img: ImageView = findViewById(R.id.imageView5)
            if(isChecked){
                img.visibility = View.VISIBLE
            }else{
                img.visibility = View.GONE
            }
        }

        //for nose
        nose.setOnCheckedChangeListener{ _, isChecked ->
            val img: ImageView = findViewById(R.id.imageView6)
            if(isChecked){
                img.visibility = View.VISIBLE
            }else{
                img.visibility = View.GONE
            }
        }

        //for mouth
        mouth.setOnCheckedChangeListener{ _, isChecked ->
            val img: ImageView = findViewById(R.id.imageView7)
            if(isChecked){
                img.visibility = View.VISIBLE
            }else{
                img.visibility = View.GONE
            }
        }

        //for mustache
        mustache.setOnCheckedChangeListener{ _, isChecked ->
            val img: ImageView = findViewById(R.id.imageView8)
            if(isChecked){
                img.visibility = View.VISIBLE
            }else{
                img.visibility = View.GONE
            }
        }

        //for ears
        ears.setOnCheckedChangeListener{ _, isChecked ->
            val img: ImageView = findViewById(R.id.imageView9)
            if(isChecked){
                img.visibility = View.VISIBLE
            }else{
                img.visibility = View.GONE
            }
        }

        //for arms
        hands.setOnCheckedChangeListener{ _, isChecked ->
            val img: ImageView = findViewById(R.id.imageView10)
            if(isChecked){
                img.visibility = View.VISIBLE
            }else{
                img.visibility = View.GONE
            }
        }

        //for shoes
        shoes.setOnCheckedChangeListener{ _, isChecked ->
            val img: ImageView = findViewById(R.id.imageView11)
            if(isChecked){
                img.visibility = View.VISIBLE
            }else{
                img.visibility = View.GONE
            }
        }
    }
}