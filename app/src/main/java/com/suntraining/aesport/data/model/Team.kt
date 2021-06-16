package com.suntraining.aesport.data.model

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Team(
    @SerializedName("idTeam")
    val id: String,
    @SerializedName("intLoved")
    val intLoved: String,
    @SerializedName("strTeam")
    val strTeam: String,
    @SerializedName("strTeamShort")
    val strTeamShort: String,
    @SerializedName("intFormedYear")
    val intFormedYear: String,
    @SerializedName("strSport")
    val strSport: String,
    @SerializedName("strManager")
    val strManager: String,
    @SerializedName("strStadium")
    val strStadium: String,
    @SerializedName("strKeywords")
    val strKeywords: String,
    @SerializedName("strStadiumThumb")
    val strStadiumThumb: String,
    @SerializedName("strStadiumDescription")
    val strStadiumDescription: String,
    @SerializedName("strStadiumLocation")
    val strStadiumLocation: String,
    @SerializedName("intStadiumCapacity")
    val intStadiumCapacity: String,
    @SerializedName("strWebsite")
    val strWebsite: String,
    @SerializedName("strFacebook")
    val strFacebook: String,
    @SerializedName("strTwitter")
    val strTwitter: String,
    @SerializedName("strInstagram")
    val strInstagram: String,
    @SerializedName("strDescriptionEN")
    val strDescriptionEN: String,
    @SerializedName("strGender")
    val strGender: String,
    @SerializedName("strCountry")
    val strCountry: String,
    @SerializedName("strTeamBadge")
    val strTeamBadge: String,
    @SerializedName("strTeamJersey")
    val strTeamJersey: String,
    @SerializedName("strTeamLogo")
    val strTeamLogo: String,
    @SerializedName("strTeamBanner")
    val strTeamBanner: String,
) : Parcelable {
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Team>() {
            override fun areItemsTheSame(oldItem: Team, newItem: Team) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Team, newItem: Team) =
                oldItem == newItem
        }
    }
}
