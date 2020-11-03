package com.example.utsmobile1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.faculty_list.view.*

class FacultyAdapter (val itemFac: List<FacultyData>, val clickListener: (FacultyData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.faculty_list, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemFac[position], clickListener)
    }

    override fun getItemCount() = itemFac.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: FacultyData, clickListener: (FacultyData) -> Unit) {
            itemView.image_fac.setImageResource(data.imgFac)
            itemView.tv_list_fac.text = data.nameFac
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}