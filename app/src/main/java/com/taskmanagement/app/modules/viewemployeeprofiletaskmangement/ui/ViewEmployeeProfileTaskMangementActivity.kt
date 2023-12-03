package com.taskmanagement.app.modules.viewemployeeprofiletaskmangement.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityViewEmployeeProfileTaskMangementBinding
import com.taskmanagement.app.modules.editemployeeprofiletaskmanagement.ui.EditEmployeeProfiletaskManagementActivity
import com.taskmanagement.app.modules.viewemployeeprofiletaskmangement.`data`.viewmodel.ViewEmployeeProfileTaskMangementVM
import kotlin.String
import kotlin.Unit

class ViewEmployeeProfileTaskMangementActivity :
    BaseActivity<ActivityViewEmployeeProfileTaskMangementBinding>(R.layout.activity_view_employee_profile_task_mangement)
    {
  private val viewModel: ViewEmployeeProfileTaskMangementVM by
      viewModels<ViewEmployeeProfileTaskMangementVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.viewEmployeeProfileTaskMangementVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearButtonprimary.setOnClickListener {
      val destIntent = EditEmployeeProfiletaskManagementActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "VIEW_EMPLOYEE_PROFILE_TASK_MANGEMENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ViewEmployeeProfileTaskMangementActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
