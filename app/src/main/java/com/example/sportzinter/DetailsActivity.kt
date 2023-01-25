package com.example.sportzinter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sportzinter.adapter.DetailsAdapter
import com.example.sportzinter.databinding.ActivityDetailsBinding
import com.example.sportzinter.pojo.PlayerDetail
import com.example.sportzinter.pojo.Teams
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding
    var pakPlayerDetailList: MutableList<PlayerDetail> = mutableListOf()
    var saPlayerDetailList: MutableList<PlayerDetail> = mutableListOf()
    var indPlayerDetailList: MutableList<PlayerDetail> = mutableListOf()
    var nzPlayerDetailList: MutableList<PlayerDetail> = mutableListOf()

    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val teamsData = intent.extras?.getSerializable("name") as Teams


        var pakPlayerData: Map<String, PlayerDetail>? = null
        var saPlayerData: Map<String, PlayerDetail>? = null
        var indPlayerData: Map<String, PlayerDetail>? = null
        var nzPlayerData: Map<String, PlayerDetail>? = null

        pakPlayerDetailList.clear()
        saPlayerDetailList.clear()
        indPlayerDetailList.clear()
        nzPlayerDetailList.clear()

        if (intent.getStringExtra("match1").equals("savspak")) {
            pakPlayerData = teamsData.pak?.Player
            saPlayerData = teamsData.sa?.Player
            pakPlayerData?.forEach {
                pakPlayerDetailList.add(it.value)
            }
            saPlayerData?.forEach {
                saPlayerDetailList.add(it.value)
            }
            binding.tvTeam1.text = teamsData.pak?.NameFull
            binding.tvTeam2.text = teamsData.sa?.NameFull
            binding.rcvtome.apply {
                this.layoutManager =
                    LinearLayoutManager(this@DetailsActivity, LinearLayoutManager.VERTICAL, false)
                this.adapter = DetailsAdapter(this@DetailsActivity, pakPlayerDetailList)
            }

            binding.rcvforothers.apply {
                this.layoutManager =
                    LinearLayoutManager(this@DetailsActivity, LinearLayoutManager.VERTICAL, false)
                this.adapter = DetailsAdapter(this@DetailsActivity, saPlayerDetailList)
            }
        } else if (intent.getStringExtra("match2").equals("indvsnz")) {
            indPlayerData = teamsData.ind?.Player
            nzPlayerData = teamsData.nz?.Player
            indPlayerData?.forEach {
                indPlayerDetailList.add(it.value)
            }
            nzPlayerData?.forEach {
                nzPlayerDetailList.add(it.value)
            }
            binding.tvTeam1.text = teamsData.ind?.NameFull
            binding.tvTeam2.text = teamsData.nz?.NameFull
            binding.rcvtome.apply {
                this.layoutManager =
                    LinearLayoutManager(this@DetailsActivity, LinearLayoutManager.VERTICAL, false)
                this.adapter = DetailsAdapter(this@DetailsActivity, indPlayerDetailList)
            }

            binding.rcvforothers.apply {
                this.layoutManager =
                    LinearLayoutManager(this@DetailsActivity, LinearLayoutManager.VERTICAL, false)
                this.adapter = DetailsAdapter(this@DetailsActivity, nzPlayerDetailList)
            }
        }

    }
}