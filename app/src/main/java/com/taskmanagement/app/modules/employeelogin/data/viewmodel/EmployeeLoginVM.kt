package com.taskmanagement.app.modules.employeelogin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employeelogin.`data`.model.EmployeeLoginModel
import org.koin.core.KoinComponent

class EmployeeLoginVM : ViewModel(), KoinComponent {
  val employeeLoginModel: MutableLiveData<EmployeeLoginModel> =
      MutableLiveData(EmployeeLoginModel())

  var navArguments: Bundle? = null
}
