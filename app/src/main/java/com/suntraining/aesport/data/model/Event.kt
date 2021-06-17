package com.suntraining.aesport.data.model

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Event(
    @SerializedName("idEvent")
    val id: String,
    @SerializedName("strEvent")
    val strEvent: String,
    @SerializedName("strFilename")
    val strFilename: String,
    @SerializedName("strSport")
    val strSport: String,
    @SerializedName("idLeague")
    val idLeague: String,
    @SerializedName("strLeague")
    val strLeague: String,
    @SerializedName("strSeason")
    val strSeason: String,
    @SerializedName("strDescriptionEN")
    val strDescriptionEN: String,
    @SerializedName("dateEvent")
    val dateEvent: String,
    @SerializedName("strTime")
    val strTime: String,
    @SerializedName("strVenue")
    val strVenue: String,
    @SerializedName("strCountry")
    val strCountry: String,
    @SerializedName("strThumb")
    val strThumb: String,
    @SerializedName("strVideo")
    val strVideo: String,
    @SerializedName("strStatus")
    val strStatus: String,
) : Parcelable {
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Event>() {
            override fun areItemsTheSame(oldItem: Event, newItem: Event) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Event, newItem: Event) =
                oldItem == newItem
        }
    }
}
