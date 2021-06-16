package com.suntraining.aesport.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.suntraining.aesport.R

@BindingAdapter("app:imageUrl")
fun ImageView.loadImage(url: String?) {
    Glide.with(context)
        .load(url)
        .error(R.drawable.ic_error)
        .placeholder(R.drawable.ic_loading)
        .into(this)
}

@BindingAdapter("app:imageCornerUrl")
fun ImageView.loadImageCorners(url: String?) {
    Glide.with(context)
        .load(url)
        .apply(RequestOptions.bitmapTransform(RoundedCorners(
            resources.getDimensionPixelSize(R.dimen.dp_6))))
        .error(R.drawable.ic_error)
        .placeholder(R.drawable.ic_loading)
        .into(this)
}

@BindingAdapter("app:imageLocal")
fun ImageView.loadImageLocal(complete: String?) {
    val src = when (complete) {
        resources.getString(R.string.value_yes) -> R.drawable.ic_complete
        resources.getString(R.string.values_no) -> R.drawable.ic_uncomplete
        else -> R.drawable.ic_error
    }
    Glide.with(context).load(src).into(this)
}
