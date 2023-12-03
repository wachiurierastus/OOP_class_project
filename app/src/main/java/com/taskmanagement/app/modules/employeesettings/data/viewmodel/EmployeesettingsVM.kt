package com.taskmanagement.app.modules.employeesettings.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employeesettings.`data`.model.EmployeesettingsModel
import org.koin.core.KoinComponent

class EmployeesettingsVM : ViewModel(), KoinComponent {
  val employeesettingsModel: MutableLiveData<EmployeesettingsModel> =
      MutableLiveData(EmployeesettingsModel())

  var navArguments: Bundle? = null
}
