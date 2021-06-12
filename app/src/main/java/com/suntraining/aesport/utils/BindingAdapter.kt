@file:Suppress("UNCHECKED_CAST")

package com.suntraining.aesport.utils

import android.view.View
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.suntraining.aesport.base.UpdateData

@BindingAdapter("app:data")
fun <T> RecyclerView.setDataRecyclerView(data: List<T>?) {
    if (adapter is UpdateData<*>) {
        (adapter as UpdateData<T>).updateData(data)
    }
}

@BindingAdapter("app:visibility")
fun View.setVisibility(visible: Boolean) {
    isVisible = visible
}
