package com.taskmanagement.app.modules.employeradddailytasktaskmanagement.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployerAddDailyTasktaskManagementBinding
import com.taskmanagement.app.modules.employeradddailytasktaskmanagement.`data`.model.SpinnerHeaderModel
import com.taskmanagement.app.modules.employeradddailytasktaskmanagement.`data`.viewmodel.EmployerAddDailyTasktaskManagementVM
import com.taskmanagement.app.modules.employertaskspagetaskmanagement.ui.EmployerTasksPagetaskManagementActivity
import kotlin.String
import kotlin.Unit

class EmployerAddDailyTasktaskManagementActivity :
    BaseActivity<ActivityEmployerAddDailyTasktaskManagementBinding>(R.layout.activity_employer_add_daily_tasktask_management)
    {
  private val viewModel: EmployerAddDailyTasktaskManagementVM by
      viewModels<EmployerAddDailyTasktaskManagementVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerHeaderList.value = mutableListOf(
    SpinnerHeaderModel("Item1"),
    SpinnerHeaderModel("Item2"),
    SpinnerHeaderModel("Item3"),
    SpinnerHeaderModel("Item4"),
    SpinnerHeaderModel("Item5")
    )
    val spinnerHeaderAdapter =
    SpinnerHeaderAdapter(this,R.layout.spinner_item,viewModel.spinnerHeaderList.value?:
    mutableListOf())
    binding.spinnerHeader.adapter = spinnerHeaderAdapter
    binding.employerAddDailyTasktaskManagementVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
    binding.btnCreateTask.setOnClickListener {
      val destIntent = EmployerTasksPagetaskManagementActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EMPLOYER_ADD_DAILY_TASKTASK_MANAGEMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EmployerAddDailyTasktaskManagementActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
