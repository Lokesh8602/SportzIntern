package com.example.sportzinter.pojo

import com.google.gson.annotations.SerializedName

data class Teams(
    @SerializedName("6") var sa: south? = south(),
    @SerializedName("7") var pak: pakistan? = pakistan()
) : java.io.Serializable

