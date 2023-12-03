package com.taskmanagement.app.modules.employertaskspagetaskmanagement.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.taskmanagement.app.R
import com.taskmanagement.app.databinding.RowListcardmenutitleTwoBinding
import com.taskmanagement.app.modules.employertaskspagetaskmanagement.`data`.model.ListcardmenutitleTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListcardmenutitleTwoAdapter(
  var list: List<ListcardmenutitleTwoRowModel>
) : RecyclerView.Adapter<ListcardmenutitleTwoAdapter.RowListcardmenutitleTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcardmenutitleTwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcardmenutitle_two,parent,false)
    return RowListcardmenutitleTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListcardmenutitleTwoVH, position: Int) {
    val listcardmenutitleTwoRowModel = ListcardmenutitleTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listcardmenutitleTwoRowModel = list[position]
    holder.binding.listcardmenutitleTwoRowModel = listcardmenutitleTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcardmenutitleTwoRowModel>) {
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
      item: ListcardmenutitleTwoRowModel
    ) {
    }
  }

  inner class RowListcardmenutitleTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcardmenutitleTwoBinding = RowListcardmenutitleTwoBinding.bind(itemView)
  }
}
