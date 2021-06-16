package com.suntraining.aesport.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailLeague(
    @SerializedName("idLeague")
    val idLeague: String,
    @SerializedName("strSport")
    val strSport: String,
    @SerializedName("strLeague")
    val strLeague: String,
    @SerializedName("intFormedYear")
    val intFormedYear : String,
    @SerializedName("idCup")
    val idCup: String,
    @SerializedName("strCurrentSeason")
    val strCurrentSeason: String,
    @SerializedName("strGender")
    val strGender: String,
    @SerializedName("strCountry")
    val strCountry: String,
    @SerializedName("strWebsite")
    val strWebsite: String,
    @SerializedName("strFacebook")
    val strFacebook: String,
    @SerializedName("strTwitter")
    val strTwitter: String,
    @SerializedName("strYoutube")
    val strYoutube: String,
    @SerializedName("strDescriptionEN")
    val strDescriptionEN: String,
    @SerializedName("strBanner")
    val strBanner: String,
    @SerializedName("strBadge")
    val strBadge: String,
    @SerializedName("strLogo")
    val strLogo: String,
    @SerializedName("strTrophy")
    val strTrophy: String,
) : Parcelable
