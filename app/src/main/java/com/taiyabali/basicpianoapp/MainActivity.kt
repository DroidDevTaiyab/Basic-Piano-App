package com.taiyabali.basicpianoapp

import android.media.SoundPool
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.taiyabali.basicpianoapp.databinding.ActivityMainBinding

/**
 * Created by Techpass Master
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var soundPool: SoundPool
    private var soundA = 0
    private var soundB = 0
    private var soundC = 0
    private var soundD = 0
    private var soundE = 0
    private var soundF = 0
    private var soundG = 0
    private var soundH = 0
    private var soundI = 0
    private var soundJ = 0
    private var soundK = 0
    private var soundL = 0
    private var soundM = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = SoundPool.Builder().setMaxStreams(6).build()
        }

        loadSound()
        onButtonClick()
    }

    private fun loadSound() {
        soundA = soundPool.load(this, R.raw.sound_a, 1)
        soundB = soundPool.load(this, R.raw.sound_b, 1)
        soundC = soundPool.load(this, R.raw.sound_c, 1)
        soundD = soundPool.load(this, R.raw.sound_d, 1)
        soundE = soundPool.load(this, R.raw.sound_e, 1)
        soundF = soundPool.load(this, R.raw.sound_f, 1)
        soundG = soundPool.load(this, R.raw.sound_g, 1)
        soundH = soundPool.load(this, R.raw.sound_g, 1)
        soundI = soundPool.load(this, R.raw.sound_i, 1)
        soundJ = soundPool.load(this, R.raw.sound_j, 1)
        soundK = soundPool.load(this, R.raw.sound_k, 1)
        soundL = soundPool.load(this, R.raw.sound_l, 1)
        soundM = soundPool.load(this, R.raw.sound_m, 1)
    }

    private fun onButtonClick() {

        binding.apply {
            button1.setOnClickListener {
                soundPool.play(soundA, 1f, 1f, 0, 0, 1f)
            }

            button2.setOnClickListener {
                soundPool.play(soundB, 1f, 1f, 0, 0, 1f)
            }

            button3.setOnClickListener {
                soundPool.play(soundC, 1f, 1f, 0, 0, 1f)
            }

            button4.setOnClickListener {
                soundPool.play(soundD, 1f, 1f, 0, 0, 1f)
            }

            button5.setOnClickListener {
                soundPool.play(soundE, 1f, 1f, 0, 0, 1f)
            }

            button6.setOnClickListener {
                soundPool.play(soundF, 1f, 1f, 0, 0, 1f)
            }

            button6.setOnClickListener {
                soundPool.play(soundG, 1f, 1f, 0, 0, 1f)
            }

            button7.setOnClickListener {
                soundPool.play(soundH, 1f, 1f, 0, 0, 1f)
            }

            button8.setOnClickListener {
                soundPool.play(soundI, 1f, 1f, 0, 0, 1f)
            }

            button9.setOnClickListener {
                soundPool.play(soundJ, 1f, 1f, 0, 0, 1f)
            }

            button10.setOnClickListener {
                soundPool.play(soundK, 1f, 1f, 0, 0, 1f)
            }

            button11.setOnClickListener {
                soundPool.play(soundL, 1f, 1f, 0, 0, 1f)
            }

            button12.setOnClickListener {
                soundPool.play(soundM, 1f, 1f, 0, 0, 1f)
            }
        }
    }
}