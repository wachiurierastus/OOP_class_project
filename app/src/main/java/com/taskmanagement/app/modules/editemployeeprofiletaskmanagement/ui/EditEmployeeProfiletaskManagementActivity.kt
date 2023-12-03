package com.taskmanagement.app.modules.editemployeeprofiletaskmanagement.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEditEmployeeProfiletaskManagementBinding
import com.taskmanagement.app.modules.editemployeeprofiletaskmanagement.`data`.viewmodel.EditEmployeeProfiletaskManagementVM
import kotlin.String
import kotlin.Unit

class EditEmployeeProfiletaskManagementActivity :
    BaseActivity<ActivityEditEmployeeProfiletaskManagementBinding>(R.layout.activity_edit_employee_profiletask_management)
    {
  private val viewModel: EditEmployeeProfiletaskManagementVM by
      viewModels<EditEmployeeProfiletaskManagementVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editEmployeeProfiletaskManagementVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EDIT_EMPLOYEE_PROFILETASK_MANAGEMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EditEmployeeProfiletaskManagementActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
