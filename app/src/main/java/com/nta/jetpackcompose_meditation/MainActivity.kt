package com.nta.jetpackcompose_meditation

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nta.jetpackcompose_meditation.ui.HomeScreen
import com.nta.jetpackcompose_meditation.ui.theme.MeditationUIYouTubeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            MeditationUIYouTubeTheme {
                HomeScreen()
            }

        }

    }
}