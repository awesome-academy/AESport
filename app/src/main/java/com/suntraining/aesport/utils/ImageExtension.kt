package com.suntraining.aesport.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.suntraining.aesport.R

@BindingAdapter("app:imageUrl")
fun ImageView.loadImage(url: String?) {
    Glide.with(context)
        .load(url)
        .error(R.drawable.ic_error)
        .placeholder(R.drawable.ic_loading)
        .into(this)
}
