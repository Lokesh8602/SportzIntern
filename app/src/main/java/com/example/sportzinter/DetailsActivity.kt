package com.example.sportzinter

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil.setContentView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sportzinter.adapter.DetailsAdapter
import com.example.sportzinter.adapter.MatchDataAdapter
import com.example.sportzinter.api.RetroServices
import com.example.sportzinter.databinding.ActivityDetailsBinding
import com.example.sportzinter.databinding.ActivityMainBinding
import com.example.sportzinter.factory.Matchfactory
import com.example.sportzinter.pojo.MatchData
import com.example.sportzinter.pojo.PlayerDetail
import com.example.sportzinter.pojo.Teams
import com.example.sportzinter.repository.MatchRepository
import com.example.sportzinter.viewmodel.MatchDataViewModel
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity(){
lateinit var binding: ActivityDetailsBinding
var pakPlayerDetailList : MutableList<PlayerDetail> = mutableListOf()
var saPlayerDetailList : MutableList<PlayerDetail> = mutableListOf()

@Suppress("DEPRECATION")
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityDetailsBinding.inflate(layoutInflater)
    setContentView(binding.root)
    val teamsData = intent.extras?.getSerializable("name") as Teams

    val pakPlayerData = teamsData.pak?.Player
    val saPlayerData = teamsData.sa?.Player
    pakPlayerDetailList.clear()
    saPlayerDetailList.clear()

    for (i in 0 until pakPlayerData?.keys?.size!!) {
        pakPlayerData.forEach {
            pakPlayerDetailList.add(it.value)
        }
    }

    for (i in 0 until saPlayerData?.keys?.size!!) {
        saPlayerData.forEach {
            saPlayerDetailList.add(it.value)
        }
    }
    binding.tvTeam1.text = teamsData.pak?.NameFull
    binding.tvTeam2.text = teamsData.sa?.NameFull
    binding.rcvtome.apply {
        this.layoutManager = LinearLayoutManager(this@DetailsActivity, LinearLayoutManager.VERTICAL, false)
        this.adapter = DetailsAdapter(this@DetailsActivity,  pakPlayerDetailList)
    }

    binding.rcvforothers.apply {
        this.layoutManager = LinearLayoutManager(this@DetailsActivity, LinearLayoutManager.VERTICAL, false)
        this.adapter = DetailsAdapter(this@DetailsActivity,  saPlayerDetailList)
    }
}
}