package com.taiyabali.basicpianoapp

import android.media.SoundPool
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.taiyabali.basicpianoapp.databinding.ActivityMainBinding

/**
 * Created by Techpass Master on 28-March-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;
    private lateinit var soundPool: SoundPool
    private var sound_a =0
    private var sound_b =0
    private var sound_c =0
    private var sound_d =0
    private var sound_e =0
    private var sound_f =0
    private var sound_g =0
    private var sound_h =0
    private var sound_i =0
    private var sound_j =0
    private var sound_k =0
    private var sound_l =0
    private var sound_m =0
    private var sound_n =0
    private var sound_o =0


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        soundPool=SoundPool.Builder().setMaxStreams(6).build()

        loadSound()
        onButtonClick()
    }

    private fun loadSound(){
        sound_a=soundPool.load(this, R.raw.sound_a,1)
        sound_b=soundPool.load(this,R.raw.sound_b,1)
        sound_c=soundPool.load(this,R.raw.sound_c,1)
        sound_d=soundPool.load(this,R.raw.sound_d,1)
        sound_e=soundPool.load(this,R.raw.sound_e,1)
        sound_f=soundPool.load(this,R.raw.sound_f,1)
        sound_g=soundPool.load(this,R.raw.sound_g,1)
        sound_h=soundPool.load(this,R.raw.sound_g,1)
        sound_i=soundPool.load(this,R.raw.sound_i,1)
        sound_j=soundPool.load(this,R.raw.sound_j,1)
        sound_k=soundPool.load(this,R.raw.sound_k,1)
        sound_l=soundPool.load(this,R.raw.sound_l,1)
        sound_m=soundPool.load(this,R.raw.sound_m,1)
        sound_n=soundPool.load(this,R.raw.sound_n,1)
        sound_o=soundPool.load(this,R.raw.sound_o,1)
    }

    private fun onButtonClick(){

        binding.apply {
            button1.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_a, 1f, 1f, 0, 0, 1f);
            })

            button2.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_b, 1f, 1f, 0, 0, 1f);
            })

            button3.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_c, 1f, 1f, 0, 0, 1f);
            })

            button4.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_d, 1f, 1f, 0, 0, 1f);
            })

            button5.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_e, 1f, 1f, 0, 0, 1f);
            })

            button6.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_f, 1f, 1f, 0, 0, 1f);
            })

            button6.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_g, 1f, 1f, 0, 0, 1f);
            })

            button7.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_h, 1f, 1f, 0, 0, 1f);
            })

            button8.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_i, 1f, 1f, 0, 0, 1f);
            })

            button9.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_j, 1f, 1f, 0, 0, 1f);
            })

            button10.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_k, 1f, 1f, 0, 0, 1f);
            })

            button11.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_l, 1f, 1f, 0, 0, 1f);
            })

            button12.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_m, 1f, 1f, 0, 0, 1f);
            })

            button13.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_n, 1f, 1f, 0, 0, 1f);
            })

            button14.setOnClickListener(View.OnClickListener {
                soundPool.play(sound_o, 1f, 1f, 0, 0, 1f);
            })
        }
    }

}