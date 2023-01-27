package com.example.sportzinter.adapter

import android.app.AlertDialog
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportzinter.R
import com.example.sportzinter.databinding.DetailsItemBinding
import com.example.sportzinter.databinding.MatchDataBinding
import com.example.sportzinter.databinding.PlayerListBinding
import com.example.sportzinter.pojo.MatchData
import com.example.sportzinter.pojo.PlayerDetail

class DetailsAdapter(val context: Context, val playerDetailData: MutableList<PlayerDetail>) :
    RecyclerView.Adapter<DetailsAdapter.MatchDetailHolder>() {


    class MatchDetailHolder(val binding:PlayerListBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchDetailHolder {
        return MatchDetailHolder(
            PlayerListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MatchDetailHolder, position: Int) {
        val playerData = playerDetailData[position]
        holder.apply {
            binding.playerName.text = playerData.NameFull

            if (playerData.isKeeper == true && playerData.isCaptain == true) {
                binding.playerName.text = playerData.NameFull + "(" + "C/WK" + ")"
            } else if (playerData.isCaptain == true) {
                binding.playerName.text = playerData.NameFull + "(" + "C" + ")"
            } else if (playerData.isKeeper == true) {
                binding.playerName.text = playerData.NameFull + "(" + "WKq" + ")"
            } else {

                binding.playerName.text = playerData.NameFull

            }
            binding.playerName.setOnClickListener {
                val builder = AlertDialog.Builder(context, com.google.android.material.R.style.Base_ThemeOverlay_AppCompat_Dialog).create()
                val view = LayoutInflater.from(context).inflate(R.layout.alert_dialog, null)
                builder.setView(view)
                val customTextView = view.findViewById<TextView>(R.id.tvBatting)
                customTextView.text =  "Name: " + playerData.NameFull
                val customTextView1 = view.findViewById<TextView>(R.id.tvStrikeRate)
                customTextView1.text =  "Strike rate is : " + playerData.Batting?.strikeRate
                val customTextView2 = view.findViewById<TextView>(R.id.tvAverage)
                customTextView2.text = "Average is : "+ playerData.Batting?.average
                val customTextView3 = view.findViewById<TextView>(R.id.tvRuns)
                customTextView3.text = "Total Run is : "+ playerData.Batting?.runs
                val customTextView4 = view.findViewById<TextView>(R.id.tvStyle)
                customTextView4.text = "Batting Style : " + playerData.Batting?.style

                customTextView.setOnClickListener {
                    builder.dismiss()
                }
                builder.setCanceledOnTouchOutside(true)
                builder.show()
            }

        }

    }

    override fun getItemCount() = playerDetailData.size
}
