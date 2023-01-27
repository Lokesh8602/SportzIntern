package com.example.sportzinter.pojo

import com.google.gson.annotations.SerializedName

data class Players(@SerializedName("Players") val player:List< Map<String, PlayerDetail>>) :
    java.io.Serializable


data class PlayerDetail(

    @SerializedName("Position") var Position: String? = null,
    @SerializedName("Name_Full") var NameFull: String? = null,
     @SerializedName("Batting"   ) var Batting  : Batting? = Batting(),
     @SerializedName("Bowling"   ) var Bowling  : Bowling? = Bowling(),
    @SerializedName("Iskeeper") var isKeeper: Boolean? = null,
    @SerializedName("Iscaptain") var isCaptain: Boolean? = null,

) : java.io.Serializable

data class Batting(

    @SerializedName("Style") var style: String? = null,
    @SerializedName("Average") var average: String? = null,
    @SerializedName("Strikerate") var strikeRate: String? = null,
    @SerializedName("Runs") var runs: String? = null

) : java.io.Serializable

data class Bowling(

    @SerializedName("Style") var style: String? = null,
    @SerializedName("Average") var average: String? = null,
    @SerializedName("Economyrate") var economyRate: String? = null,
    @SerializedName("Wickets") var wickets: String? = null

) : java.io.Serializable
