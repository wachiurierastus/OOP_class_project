package com.taskmanagement.app.modules.employeemyprofilepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployeeMyProfilePageBinding
import com.taskmanagement.app.modules.employeemyprofilepage.`data`.viewmodel.EmployeeMyProfilePageVM
import kotlin.String
import kotlin.Unit

class EmployeeMyProfilePageActivity :
    BaseActivity<ActivityEmployeeMyProfilePageBinding>(R.layout.activity_employee_my_profile_page) {
  private val viewModel: EmployeeMyProfilePageVM by viewModels<EmployeeMyProfilePageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.employeeMyProfilePageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EMPLOYEE_MY_PROFILE_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EmployeeMyProfilePageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
