package com.example.sportzinter.pojo

import com.google.gson.annotations.SerializedName

data class Innings(
    @SerializedName("Number"              ) var Number             : String?                  = null,
    @SerializedName("Battingteam"         ) var Battingteam        : String?                  = null,
    @SerializedName("Total"               ) var Total              : String?                  = null,
    @SerializedName("Wickets"             ) var Wickets            : String?                  = null,
    @SerializedName("Overs"               ) var Overs              : String?                  = null,
    @SerializedName("Runrate"             ) var Runrate            : String?                  = null,
    @SerializedName("Byes"                ) var Byes               : String?                  = null,
    @SerializedName("Legbyes"             ) var Legbyes            : String?                  = null,
    @SerializedName("Wides"               ) var Wides              : String?                  = null,
    @SerializedName("Noballs"             ) var Noballs            : String?                  = null,
    @SerializedName("Penalty"             ) var Penalty            : String?                  = null,
    @SerializedName("AllottedOvers"       ) var AllottedOvers      : String?                  = null,

):java.io.Serializable
