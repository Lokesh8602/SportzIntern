package com.example.sportzinter.pojo

import com.google.gson.annotations.SerializedName

data class Match(
    @SerializedName("Livecoverage" ) var Livecoverage : String? = null,
    @SerializedName("Id"           ) var Id           : String? = null,
    @SerializedName("Code"         ) var Code         : String? = null,
    @SerializedName("League"       ) var League       : String? = null,
    @SerializedName("Number"       ) var Number       : String? = null,
    @SerializedName("Type"         ) var Type         : String? = null,
    @SerializedName("Date"         ) var Date         : String? = null,
    @SerializedName("Time"         ) var Time         : String? = null,
    @SerializedName("Offset"       ) var Offset       : String? = null,
    @SerializedName("Daynight"     ) var Daynight     : String? = null
): java.io.Serializable
