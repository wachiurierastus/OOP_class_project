package com.taskmanagement.app.modules.employeetaskmanagementdashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.taskmanagement.app.R
import com.taskmanagement.app.databinding.RowCardBinding
import com.taskmanagement.app.modules.employeetaskmanagementdashboard.`data`.model.CardRowModel
import kotlin.Int
import kotlin.collections.List

class CardAdapter(
  var list: List<CardRowModel>
) : RecyclerView.Adapter<CardAdapter.RowCardVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCardVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_card,parent,false)
    return RowCardVH(view)
  }

  override fun onBindViewHolder(holder: RowCardVH, position: Int) {
    val cardRowModel = CardRowModel()
    // TODO uncomment following line after integration with data source
    // val cardRowModel = list[position]
    holder.binding.cardRowModel = cardRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CardRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: CardRowModel
    ) {
    }
  }

  inner class RowCardVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCardBinding = RowCardBinding.bind(itemView)
  }
}
