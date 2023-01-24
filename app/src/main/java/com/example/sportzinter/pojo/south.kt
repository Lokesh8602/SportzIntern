package com.example.sportzinter.pojo

import com.google.gson.annotations.SerializedName

data class south(
    @SerializedName("Name_Full") var NameFull: String? = null,
    @SerializedName("Name_Short") var NameShort: String? = null,
    @SerializedName("Players") val Player: Map<String, PlayerDetail>? = null


) : java.io.Serializable
