package com.suntraining.aesport.data.model

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Player(
    @SerializedName("idPlayer")
    val id: String,
    @SerializedName("strNationality")
    val strNationality: String,
    @SerializedName("strPlayer")
    val strPlayer: String,
    @SerializedName("strSport")
    val strSport: String,
    @SerializedName("intSoccerXMLTeamID")
    val intSoccerXMLTeamID: String,
    @SerializedName("dateBorn")
    val dateBorn: String,
    @SerializedName("strNumber")
    val strNumber: String,
    @SerializedName("dateSigned")
    val dateSigned: String,
    @SerializedName("strSigning")
    val strSigning: String,
    @SerializedName("strWage")
    val strWage: String,
    @SerializedName("strAgent")
    val strAgent: String,
    @SerializedName("strBirthLocation")
    val strBirthLocation: String,
    @SerializedName("strGender")
    val strGender: String,
    @SerializedName("strSide")
    val strSide: String,
    @SerializedName("strPosition")
    val strPosition: String,
    @SerializedName("strFacebook")
    val strFacebook: String,
    @SerializedName("strTwitter")
    val strTwitter: String,
    @SerializedName("strInstagram")
    val strInstagram: String,
    @SerializedName("strHeight")
    val strHeight: String,
    @SerializedName("strWeight")
    val strWeight: String,
    @SerializedName("strThumb")
    val strThumb: String,
    @SerializedName("strCutout")
    val strCutout: String,
    @SerializedName("strRender")
    val strRender: String,
    @SerializedName("strBanner")
    val strBanner: String,
) : Parcelable {
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Player>() {
            override fun areItemsTheSame(oldItem: Player, newItem: Player) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Player, newItem: Player) =
                oldItem == newItem
        }
    }
}
