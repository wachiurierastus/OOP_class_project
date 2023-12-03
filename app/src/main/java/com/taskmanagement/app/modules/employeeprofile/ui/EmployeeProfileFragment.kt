package com.taskmanagement.app.modules.employeeprofile.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseFragment
import com.taskmanagement.app.databinding.FragmentEmployeeProfileBinding
import com.taskmanagement.app.modules.employeelogin.ui.EmployeeLoginActivity
import com.taskmanagement.app.modules.employeemyprofilepage.ui.EmployeeMyProfilePageActivity
import com.taskmanagement.app.modules.employeeprofile.`data`.viewmodel.EmployeeProfileVM
import com.taskmanagement.app.modules.employeesettings.ui.EmployeesettingsActivity
import kotlin.String
import kotlin.Unit

class EmployeeProfileFragment :
    BaseFragment<FragmentEmployeeProfileBinding>(R.layout.fragment_employee_profile) {
  private val viewModel: EmployeeProfileVM by viewModels<EmployeeProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.employeeProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearButtonprimary2.setOnClickListener {
      val destIntent = EmployeeLoginActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearButtonprimary1.setOnClickListener {
      val destIntent = EmployeesettingsActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
    binding.linearButtonprimary.setOnClickListener {
      val destIntent = EmployeeMyProfilePageActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "EMPLOYEE_PROFILE_FRAGMENT"


    fun getInstance(bundle: Bundle?): EmployeeProfileFragment {
      val fragment = EmployeeProfileFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
