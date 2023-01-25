package com.example.sportzinter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportzinter.R
import com.example.sportzinter.databinding.MatchDataBinding
import com.example.sportzinter.pojo.MatchData


class MatchDataAdapter(context: Context, val list: List<MatchData>, val click: Click) :
    RecyclerView.Adapter<MatchDataAdapter.MatchViewHolder>() {

    class MatchViewHolder(val binding: MatchDataBinding) : RecyclerView.ViewHolder(binding.root) {
        val tvVenue = itemView.findViewById<TextView>(R.id.textvenue)
        val tvTime = itemView.findViewById<TextView>(R.id.txttime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchViewHolder {
        return MatchViewHolder(
            MatchDataBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        val matchData = list[position]
        holder.apply {
            binding.textvenue.text = matchData.Matchdetail?.Venue?.Name
            binding.txttime.text = matchData.Matchdetail?.Match?.Time.toString()
            binding.date.text = matchData.Matchdetail?.Match?.Date
            binding.result.text = matchData.Matchdetail?.Result
            binding.status.text = matchData.Matchdetail?.Status
            binding.playerofthematch.text = matchData.Matchdetail?.PlayerMatch
            if (matchData.Teams?.nz != null &&
                matchData.Teams?.nz?.NameFull.toString().isNotEmpty()
            ) {
                binding.txtpak.text = matchData.Teams?.nz?.NameFull
                binding.textView.text = matchData.Teams?.ind?.NameFull
            } else {
                binding.txtpak.text = matchData.Teams?.pak?.NameFull
                binding.textView.text = matchData.Teams?.sa?.NameFull
            }

            binding.score.text =
                matchData.Innings.get(1).Total + "/" + matchData.Innings.get(1).Wickets + " " + "(" + matchData.Innings.get(
                    1
                ).Overs + ")"
            binding.score2.text =
                matchData.Innings.get(0).Total + "/" + matchData.Innings.get(0).Wickets + " " + "(" + matchData.Innings.get(
                    0
                ).Overs + ")"
            binding.button.setOnClickListener {
                click.onclick(matchData)

            }
        }
    }

    override fun getItemCount() = list.size
}

interface Click {
    fun onclick(data: MatchData)
}
