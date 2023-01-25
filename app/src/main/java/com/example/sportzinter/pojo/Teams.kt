package com.example.sportzinter.pojo

import com.google.gson.annotations.SerializedName

data class Teams(
    @SerializedName("6") var pak: South? = South(),
    @SerializedName("7") var sa: Pakistan? = Pakistan()
) : java.io.Serializable

