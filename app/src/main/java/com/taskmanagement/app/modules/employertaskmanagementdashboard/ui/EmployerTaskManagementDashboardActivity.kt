package com.taskmanagement.app.modules.employertaskmanagementdashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployerTaskManagementDashboardBinding
import com.taskmanagement.app.modules.employertaskmanagementdashboard.`data`.viewmodel.EmployerTaskManagementDashboardVM
import kotlin.String
import kotlin.Unit

class EmployerTaskManagementDashboardActivity :
    BaseActivity<ActivityEmployerTaskManagementDashboardBinding>(R.layout.activity_employer_task_management_dashboard)
    {
  private val viewModel: EmployerTaskManagementDashboardVM by
      viewModels<EmployerTaskManagementDashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.employerTaskManagementDashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EMPLOYER_TASK_MANAGEMENT_DASHBOARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EmployerTaskManagementDashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
