package com.taskmanagement.app.modules.registrationpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityRegistrationpageBinding
import com.taskmanagement.app.modules.employeelogin.ui.EmployeeLoginActivity
import com.taskmanagement.app.modules.employeetaskmanagementdashboardcontainer.ui.EmployeeTaskManagementDashboardcontainerActivity
import com.taskmanagement.app.modules.registrationpage.`data`.viewmodel.RegistrationpageVM
import com.taskmanagement.app.modules.splash.ui.SplashActivity
import kotlin.String
import kotlin.Unit

class RegistrationpageActivity :
    BaseActivity<ActivityRegistrationpageBinding>(R.layout.activity_registrationpage) {
  private val viewModel: RegistrationpageVM by viewModels<RegistrationpageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registrationpageVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnRegister.setOnClickListener {
        val destIntent = EmployeeTaskManagementDashboardcontainerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtLanguageOne.setOnClickListener {
        val destIntent = EmployeeLoginActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "REGISTRATIONPAGE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, RegistrationpageActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
