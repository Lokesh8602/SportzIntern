package com.example.sportzinter.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
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
        }
    }

    override fun getItemCount() = playerDetailData.size
}
