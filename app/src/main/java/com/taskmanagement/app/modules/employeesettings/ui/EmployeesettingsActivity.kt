package com.taskmanagement.app.modules.employeesettings.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployeesettingsBinding
import com.taskmanagement.app.modules.employeesettings.`data`.viewmodel.EmployeesettingsVM
import kotlin.String
import kotlin.Unit

class EmployeesettingsActivity :
    BaseActivity<ActivityEmployeesettingsBinding>(R.layout.activity_employeesettings) {
  private val viewModel: EmployeesettingsVM by viewModels<EmployeesettingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.employeesettingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EMPLOYEESETTINGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EmployeesettingsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
