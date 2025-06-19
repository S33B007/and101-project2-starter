package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R

class FavoriteNumber : AppCompatActivity() {

    private val favoriteNumber: TextView get() = findViewById(R.id.favorite_number)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_number)

        val number: Int? = null
        // not sure what I did, but I suppose null was declared wrong. I just clicked the squiggly lines
        // a lot of times they can help you before you help yourself only if you understand
        favoriteNumber.text = "$number"
    }
}