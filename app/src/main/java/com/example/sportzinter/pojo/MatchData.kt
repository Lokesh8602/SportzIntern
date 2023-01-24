package com.example.sportzinter.pojo

import com.google.gson.annotations.SerializedName

data class MatchData(
    @SerializedName("Matchdetail") var Matchdetail: Matchdetails? = Matchdetails(),
    @SerializedName("Nuggets") var Nuggets: ArrayList<String> = arrayListOf(),
    @SerializedName("Innings") var Innings: ArrayList<Innings> = arrayListOf(),
    @SerializedName("Teams") var Teams: Teams? = Teams(),


    ) : java.io.Serializable
