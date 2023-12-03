package com.taskmanagement.app.modules.employeelogin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployeeLoginBinding
import com.taskmanagement.app.modules.employeelogin.`data`.viewmodel.EmployeeLoginVM
import com.taskmanagement.app.modules.employeemyprofilepage.ui.EmployeeMyProfilePageActivity
import com.taskmanagement.app.modules.employeetaskmanagementdashboardcontainer.ui.EmployeeTaskManagementDashboardcontainerActivity
import com.taskmanagement.app.modules.registrationpage.ui.RegistrationpageActivity
import kotlin.String
import kotlin.Unit

class EmployeeLoginActivity :
    BaseActivity<ActivityEmployeeLoginBinding>(R.layout.activity_employee_login) {
  private val viewModel: EmployeeLoginVM by viewModels<EmployeeLoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.employeeLoginVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = EmployeeMyProfilePageActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnLogin.setOnClickListener {
        val destIntent = EmployeeTaskManagementDashboardcontainerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtLanguageOne.setOnClickListener {
        val destIntent = RegistrationpageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "EMPLOYEE_LOGIN_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, EmployeeLoginActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
