package com.example.movies

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.hpp.MoviesAdapter
import com.example.movies.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val movies = listOf(
        Movie.Movies(
            "Clueless",
            8.3,
            imageView = R.drawable.clueless
        ),

        Movie.Movies(
            "10 things i hate about you",
            9.2,
            imageView = R.drawable.tenthingsihateaboutyou
        ),

        Movie.Movies(
            "The best of me",
            9.0,
            imageView = R.drawable.thebestofme
        ),
        Movie.Movies(
            "The notebook",
            9.5,
            imageView = R.drawable.thenotebook
        ),
        Movie.Movies(
            "What a girl want",
            7.3,
            imageView = R.drawable.whatagirlwant
        ),
        Movie.Movies(
            "How to lose a guy in 10 days",
            5.8,
            imageView = R.drawable.howtoloseaguy
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.recyclerView.adapter = MoviesAdapter(movies)

    }
}
