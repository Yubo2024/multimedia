package com.example.multimedia

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var videoView: VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton = findViewById<Button>(R.id.playButton)
        val stopButton = findViewById<Button>(R.id.stopButton)
        videoView = findViewById(R.id.videoView)
        mediaPlayer = MediaPlayer.create(this, R.raw.music)

        val videoUri = Uri.parse("android.resource://"+packageName+"/${R.raw.video}")
        videoView.setVideoURI(videoUri)

        playButton.setOnClickListener {
            if (!mediaPlayer.isPlaying) {
                mediaPlayer.start()
            }
            if (!videoView.isPlaying) {
                videoView.start()
            }
        }
        stopButton.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.stop()
                mediaPlayer.reset()
                mediaPlayer = MediaPlayer.create(this, R.raw.music)
            }
            if (videoView.isPlaying) {
                videoView.pause()
                videoView.seekTo(0)
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}
