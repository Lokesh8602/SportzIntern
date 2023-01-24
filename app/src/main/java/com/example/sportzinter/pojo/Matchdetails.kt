package com.example.sportzinter.pojo

import com.google.gson.annotations.SerializedName

data class Matchdetails(

    @SerializedName("Team_Home"    ) var TeamHome    : String?    = null,
    @SerializedName("Team_Away"    ) var TeamAway    : String?    = null,
    @SerializedName("Match"        ) var Match       : Match?     = Match(),
    @SerializedName("Venue"        ) var Venue       : Venue?     = Venue(),
    @SerializedName("Officials"   ) var Officials   : Officials? = Officials(),
    @SerializedName("Weather"      ) var Weather     : String?    = null,
    @SerializedName("Tosswonby"    ) var Tosswonby   : String?    = null,
    @SerializedName("Status"       ) var Status      : String?    = null,
    @SerializedName("Status_Id"    ) var StatusId    : String?    = null,
    @SerializedName("Player_Match" ) var PlayerMatch : String?    = null,
    @SerializedName("Result"       ) var Result      : String?    = null,
    @SerializedName("Winningteam"  ) var Winningteam : String?    = null,
    @SerializedName("Winmargin"    ) var Winmargin   : String?    = null,
    @SerializedName("Equation"     ) var Equation    : String?    = null
): java.io.Serializable
