package com.taskmanagement.app.modules.employeredittasktodolist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployerEditTaskTodolistBinding
import com.taskmanagement.app.modules.employereditdailytasktaskmanagement.ui.EmployerEditDailyTaskTaskManagementActivity
import com.taskmanagement.app.modules.employeredittasktodolist.`data`.viewmodel.EmployerEditTaskTodolistVM
import com.taskmanagement.app.modules.employertaskspagetaskmanagement.ui.EmployerTasksPagetaskManagementActivity
import kotlin.String
import kotlin.Unit

class EmployerEditTaskTodolistActivity :
    BaseActivity<ActivityEmployerEditTaskTodolistBinding>(R.layout.activity_employer_edit_task_todolist)
    {
  private val viewModel: EmployerEditTaskTodolistVM by viewModels<EmployerEditTaskTodolistVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.employerEditTaskTodolistVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDeleteTask.setOnClickListener {
      val destIntent = EmployerTasksPagetaskManagementActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnEditTask.setOnClickListener {
      val destIntent = EmployerEditDailyTaskTaskManagementActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCancel.setOnClickListener {
      val destIntent = EmployerTasksPagetaskManagementActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EMPLOYER_EDIT_TASK_TODOLIST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EmployerEditTaskTodolistActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
