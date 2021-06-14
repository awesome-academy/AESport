package com.suntraining.aesport.data.model

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Countries(
    @SerializedName("name_en")
    val name: String
) : Parcelable {

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Countries>() {
            override fun areItemsTheSame(oldItem: Countries, newItem: Countries) =
                oldItem.name == newItem.name

            override fun areContentsTheSame(oldItem: Countries, newItem: Countries) =
                oldItem == newItem
        }
    }
}
