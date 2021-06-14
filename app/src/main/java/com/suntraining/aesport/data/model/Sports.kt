package com.suntraining.aesport.data.model

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Sports(
    @SerializedName("idSport")
    val id: String,
    @SerializedName("strSport")
    val strSport: String,
    @SerializedName("strSportThumb")
    val strSportThumb: String,
    @SerializedName("strSportDescription")
    val strSportDescription: String
) : Parcelable {

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Sports>() {
            override fun areItemsTheSame(oldItem: Sports, newItem: Sports) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Sports, newItem: Sports) =
                oldItem == newItem
        }
    }
}
