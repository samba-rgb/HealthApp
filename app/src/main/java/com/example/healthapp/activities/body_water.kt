package com.example.healthapp.activities

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.healthapp.R
import me.itangqi.waveloadingview.WaveLoadingView


class body_water : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.healthapp.R.layout.activity_body_water)
        val mWaveLoadingView = findViewById<View>(R.id.waveLoadingView) as WaveLoadingView
        mWaveLoadingView.progressValue = 50
        mWaveLoadingView.setAmplitudeRatio(5)
        mWaveLoadingView.waveColor = Color.BLUE
        mWaveLoadingView.borderColor = Color.BLUE
        mWaveLoadingView.setAnimDuration(500)
        mWaveLoadingView.pauseAnimation()
        mWaveLoadingView.resumeAnimation()
        mWaveLoadingView.cancelAnimation()
        mWaveLoadingView.startAnimation()
    }
}