package com.taskmanagement.app.modules.employeeprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employeeprofile.`data`.model.EmployeeProfileModel
import org.koin.core.KoinComponent

class EmployeeProfileVM : ViewModel(), KoinComponent {
  val employeeProfileModel: MutableLiveData<EmployeeProfileModel> =
      MutableLiveData(EmployeeProfileModel())

  var navArguments: Bundle? = null
}
