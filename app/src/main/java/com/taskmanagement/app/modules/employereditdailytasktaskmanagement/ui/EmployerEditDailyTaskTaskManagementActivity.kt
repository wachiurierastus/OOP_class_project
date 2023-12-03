package com.taskmanagement.app.modules.employereditdailytasktaskmanagement.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployerEditDailyTaskTaskManagementBinding
import com.taskmanagement.app.modules.employereditdailytasktaskmanagement.`data`.viewmodel.EmployerEditDailyTaskTaskManagementVM
import kotlin.String
import kotlin.Unit

class EmployerEditDailyTaskTaskManagementActivity :
    BaseActivity<ActivityEmployerEditDailyTaskTaskManagementBinding>(R.layout.activity_employer_edit_daily_task_task_management)
    {
  private val viewModel: EmployerEditDailyTaskTaskManagementVM by
      viewModels<EmployerEditDailyTaskTaskManagementVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.employerEditDailyTaskTaskManagementVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EMPLOYER_EDIT_DAILY_TASK_TASK_MANAGEMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EmployerEditDailyTaskTaskManagementActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
