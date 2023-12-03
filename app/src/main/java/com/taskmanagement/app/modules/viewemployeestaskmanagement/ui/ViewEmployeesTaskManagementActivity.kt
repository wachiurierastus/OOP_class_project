package com.taskmanagement.app.modules.viewemployeestaskmanagement.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityViewEmployeesTaskManagementBinding
import com.taskmanagement.app.modules.viewemployeeprofiletaskmangement.ui.ViewEmployeeProfileTaskMangementActivity
import com.taskmanagement.app.modules.viewemployeestaskmanagement.`data`.model.ListellipseRowModel
import com.taskmanagement.app.modules.viewemployeestaskmanagement.`data`.viewmodel.ViewEmployeesTaskManagementVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ViewEmployeesTaskManagementActivity :
    BaseActivity<ActivityViewEmployeesTaskManagementBinding>(R.layout.activity_view_employees_task_management)
    {
  private val viewModel: ViewEmployeesTaskManagementVM by
      viewModels<ViewEmployeesTaskManagementVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipseAdapter =
    ListellipseAdapter(viewModel.listellipseList.value?:mutableListOf())
    binding.recyclerListellipse.adapter = listellipseAdapter
    listellipseAdapter.setOnItemClickListener(
    object : ListellipseAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipseRowModel) {
        onClickRecyclerListellipse(view, position, item)
      }
    }
    )
    viewModel.listellipseList.observe(this) {
      listellipseAdapter.updateData(it)
    }
    binding.viewEmployeesTaskManagementVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListellipse(
    view: View,
    position: Int,
    item: ListellipseRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowellipse -> {
        val destIntent = ViewEmployeeProfileTaskMangementActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "VIEW_EMPLOYEES_TASK_MANAGEMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ViewEmployeesTaskManagementActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
