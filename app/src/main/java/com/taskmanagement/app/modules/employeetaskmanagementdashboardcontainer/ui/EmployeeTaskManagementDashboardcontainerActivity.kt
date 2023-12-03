package com.taskmanagement.app.modules.employeetaskmanagementdashboardcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployeeTaskManagementDashboardcontainerBinding
import com.taskmanagement.app.extensions.loadFragment
import com.taskmanagement.app.modules.employeeprofile.ui.EmployeeProfileFragment
import com.taskmanagement.app.modules.employeetaskmanagementdashboard.ui.EmployeeTaskManagementDashboardFragment
import com.taskmanagement.app.modules.employeetaskmanagementdashboardcontainer.`data`.viewmodel.EmployeeTaskManagementDashboardcontainerVM
import kotlin.String
import kotlin.Unit

class EmployeeTaskManagementDashboardcontainerActivity :
    BaseActivity<ActivityEmployeeTaskManagementDashboardcontainerBinding>(R.layout.activity_employee_task_management_dashboardcontainer)
    {
  private val viewModel: EmployeeTaskManagementDashboardcontainerVM by
      viewModels<EmployeeTaskManagementDashboardcontainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.employeeTaskManagementDashboardcontainerVM = viewModel
    val destFragment = EmployeeTaskManagementDashboardFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = EmployeeTaskManagementDashboardFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.imageVectorOne.setOnClickListener {
      val destFragment = EmployeeTaskManagementDashboardFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = EmployeeTaskManagementDashboardFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.imageVectorThree.setOnClickListener {
      val destFragment = EmployeeProfileFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = EmployeeProfileFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.imageVectorTwo.setOnClickListener {
      // TODO please, add your navigation code here
    }
  }

  companion object {
    const val TAG: String = "EMPLOYEE_TASK_MANAGEMENT_DASHBOARDCONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EmployeeTaskManagementDashboardcontainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
