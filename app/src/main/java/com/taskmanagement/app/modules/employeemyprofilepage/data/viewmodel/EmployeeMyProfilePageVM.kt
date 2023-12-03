package com.taskmanagement.app.modules.employeemyprofilepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employeemyprofilepage.`data`.model.EmployeeMyProfilePageModel
import org.koin.core.KoinComponent

class EmployeeMyProfilePageVM : ViewModel(), KoinComponent {
  val employeeMyProfilePageModel: MutableLiveData<EmployeeMyProfilePageModel> =
      MutableLiveData(EmployeeMyProfilePageModel())

  var navArguments: Bundle? = null
}
