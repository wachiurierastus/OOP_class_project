package com.taskmanagement.app.modules.employerlogin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployerLoginBinding
import com.taskmanagement.app.modules.employerlogin.`data`.viewmodel.EmployerLoginVM
import com.taskmanagement.app.modules.employertaskmanagementdashboard.ui.EmployerTaskManagementDashboardActivity
import kotlin.String
import kotlin.Unit

class EmployerLoginActivity :
    BaseActivity<ActivityEmployerLoginBinding>(R.layout.activity_employer_login) {
  private val viewModel: EmployerLoginVM by viewModels<EmployerLoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.employerLoginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogin.setOnClickListener {
      val destIntent = EmployerTaskManagementDashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "EMPLOYER_LOGIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EmployerLoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
