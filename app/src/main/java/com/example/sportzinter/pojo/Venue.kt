package com.example.sportzinter.pojo

import com.google.gson.annotations.SerializedName

data class Venue(
    @SerializedName("Id"   ) var Id   : String? = null,
    @SerializedName("Name" ) var Name : String? = null
): java.io.Serializable
