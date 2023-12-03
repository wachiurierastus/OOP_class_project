package com.taskmanagement.app.modules.employe.ui

import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployeBinding
import com.taskmanagement.app.modules.employe.`data`.viewmodel.EmployeVM
import com.taskmanagement.app.modules.viewemployeestaskmanagement.ui.ViewEmployeesTaskManagementActivity
import kotlin.String
import kotlin.Unit

class EmployeActivity : BaseActivity<ActivityEmployeBinding>(R.layout.activity_employe) {
  private val viewModel: EmployeVM by viewModels<EmployeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.employeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
    binding.linearButtonprimary1.setOnClickListener {
      val destIntent = ViewEmployeesTaskManagementActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EMPLOYE_ACTIVITY"

  }
}
