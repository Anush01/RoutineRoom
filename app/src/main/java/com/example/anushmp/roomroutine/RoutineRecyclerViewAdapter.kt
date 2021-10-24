package com.example.anushmp.roomroutine

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RoutineRecyclerViewAdapter(var con: Context, var data:ArrayList<String>) : RecyclerView.Adapter<RoutineRecyclerViewAdapter.RoutineVH>(){




    inner class RoutineVH(itemView:View): RecyclerView.ViewHolder(itemView){


        var routineText = itemView.findViewById<TextView>(R.id.routineText)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoutineVH {

        var v: View = LayoutInflater.from(con).inflate(R.layout.routine_item_layout,parent,false)
        var rvh = RoutineVH(v)

        return rvh

    }

    override fun onBindViewHolder(holder: RoutineVH, position: Int) {

        var datafromlist = data[position]

        holder.routineText.text = datafromlist


    }

    override fun getItemCount(): Int {
       return data.size
    }


}