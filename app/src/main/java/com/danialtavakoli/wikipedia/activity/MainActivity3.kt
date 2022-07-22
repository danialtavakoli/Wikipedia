package com.danialtavakoli.wikipedia.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.danialtavakoli.wikipedia.R
import com.danialtavakoli.wikipedia.databinding.ActivityMain3Binding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        Glide.with(this).load(R.drawable.img_translatore)
            .transform(RoundedCornersTransformation(32, 8)).into(binding.imgTranslator)
    }

}