package com.taskmanagement.app.modules.employertaskspagetaskmanagement.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployerTasksPagetaskManagementBinding
import com.taskmanagement.app.modules.employeradddailytasktaskmanagement.ui.EmployerAddDailyTasktaskManagementActivity
import com.taskmanagement.app.modules.employeredittasktodolist.ui.EmployerEditTaskTodolistActivity
import com.taskmanagement.app.modules.employertaskspagetaskmanagement.`data`.model.ListcardmenutitleTwoRowModel
import com.taskmanagement.app.modules.employertaskspagetaskmanagement.`data`.viewmodel.EmployerTasksPagetaskManagementVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EmployerTasksPagetaskManagementActivity :
    BaseActivity<ActivityEmployerTasksPagetaskManagementBinding>(R.layout.activity_employer_tasks_pagetask_management)
    {
  private val viewModel: EmployerTasksPagetaskManagementVM by
      viewModels<EmployerTasksPagetaskManagementVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listcardmenutitleTwoAdapter =
    ListcardmenutitleTwoAdapter(viewModel.listcardmenutitleTwoList.value?:mutableListOf())
    binding.recyclerListcardmenutitleTwo.adapter = listcardmenutitleTwoAdapter
    listcardmenutitleTwoAdapter.setOnItemClickListener(
    object : ListcardmenutitleTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcardmenutitleTwoRowModel) {
        onClickRecyclerListcardmenutitleTwo(view, position, item)
      }
    }
    )
    viewModel.listcardmenutitleTwoList.observe(this) {
      listcardmenutitleTwoAdapter.updateData(it)
    }
    binding.employerTasksPagetaskManagementVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.etButtonprimary.setOnClickListener {
      val destIntent = EmployerAddDailyTasktaskManagementActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageGroup.setOnClickListener {
      val destIntent = EmployerEditTaskTodolistActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListcardmenutitleTwo(
    view: View,
    position: Int,
    item: ListcardmenutitleTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EMPLOYER_TASKS_PAGETASK_MANAGEMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EmployerTasksPagetaskManagementActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
