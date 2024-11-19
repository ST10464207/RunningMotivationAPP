package com.example.runningmotivationapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Runners(val day:String, val morning:String,val afternoon:String)

class runningAdapter (private val runners:List<Runners>) : RecyclerView.Adapter<runningAdapter.ViewHolder>()
{
    class ViewHolder(view: View): RecyclerView.ViewHolder(view)
    {
        val day:TextView=view.findViewById(R.id.eday)
        val morning:TextView=view.findViewById(R.id.emorning)
        val afternoon:TextView=view.findViewById(R.id.eafternoon)

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.input_data,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val runners=runners[position]
        holder.day.text=runners.day
        holder.morning.text=runners.morning
        holder.afternoon.text=runners.afternoon
    }

    override fun getItemCount(): Int =runners.size

    }








