package com.suntraining.aesport.data.model

import android.os.Parcelable
import androidx.recyclerview.widget.DiffUtil
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "leagues")
data class Leagues(
    @SerializedName("idLeague")
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @SerializedName("strLeague")
    @ColumnInfo(name = "strLeague")
    val strLeague: String,
    @SerializedName("strSport")
    @ColumnInfo(name = "strSport")
    val strSport: String,
    @SerializedName("strDescriptionEN")
    @ColumnInfo(name = "strDescriptionEN")
    val strDescriptionEN : String,
    @SerializedName("strCountry")
    @ColumnInfo(name = "strCountry")
    val strCountry: String,
    @SerializedName("strBadge")
    @ColumnInfo(name = "strBadge")
    val strBadge: String,
    @SerializedName("strComplete")
    @ColumnInfo(name = "strComplete")
    val strComplete: String,
) : Parcelable {
    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<Leagues>() {
            override fun areItemsTheSame(oldItem: Leagues, newItem: Leagues) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Leagues, newItem: Leagues) =
                oldItem == newItem
        }
    }
}
