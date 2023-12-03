package com.taskmanagement.app.modules.employeermyprofilepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseActivity
import com.taskmanagement.app.databinding.ActivityEmployeerMyProfilePageBinding
import com.taskmanagement.app.modules.employeermyprofilepage.`data`.viewmodel.EmployeerMyProfilePageVM
import kotlin.String
import kotlin.Unit

class EmployeerMyProfilePageActivity :
    BaseActivity<ActivityEmployeerMyProfilePageBinding>(R.layout.activity_employeer_my_profile_page)
    {
  private val viewModel: EmployeerMyProfilePageVM by viewModels<EmployeerMyProfilePageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.employeerMyProfilePageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "EMPLOYEER_MY_PROFILE_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EmployeerMyProfilePageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
