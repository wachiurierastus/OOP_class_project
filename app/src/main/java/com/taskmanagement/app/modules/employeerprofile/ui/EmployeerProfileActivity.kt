package com.taskmanagement.app.modules.employeerprofile.ui

import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployeerProfileBinding
import com.taskmanagement.app.modules.employeermyprofilepage.ui.EmployeerMyProfilePageActivity
import com.taskmanagement.app.modules.employeerprofile.`data`.viewmodel.EmployeerProfileVM
import com.taskmanagement.app.modules.employerlogin.ui.EmployerLoginActivity
import kotlin.String
import kotlin.Unit

class EmployeerProfileActivity :
    BaseActivity<ActivityEmployeerProfileBinding>(R.layout.activity_employeer_profile) {
  private val viewModel: EmployeerProfileVM by viewModels<EmployeerProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.employeerProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearButtonprimary.setOnClickListener {
      val destIntent = EmployeerMyProfilePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearButtonprimary2.setOnClickListener {
      val destIntent = EmployerLoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EMPLOYEER_PROFILE_ACTIVITY"

  }
}
