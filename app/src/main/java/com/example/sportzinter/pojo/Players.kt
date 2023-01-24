package com.example.sportzinter.pojo

import com.google.gson.annotations.SerializedName

data class Players(@SerializedName("Players") val player:List< Map<String, PlayerDetail>>) :
    java.io.Serializable


data class PlayerDetail(

    @SerializedName("Position") var Position: String? = null,
    @SerializedName("Name_Full") var NameFull: String? = null,
    /* @SerializedName("Batting"   ) var Batting  : Batting? = Batting(),
     @SerializedName("Bowling"   ) var Bowling  : Bowling? = Bowling()
*/
) : java.io.Serializable