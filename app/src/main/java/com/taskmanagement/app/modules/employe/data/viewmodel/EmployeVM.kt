package com.taskmanagement.app.modules.employe.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employe.`data`.model.EmployeModel
import org.koin.core.KoinComponent

class EmployeVM : ViewModel(), KoinComponent {
  val employeModel: MutableLiveData<EmployeModel> = MutableLiveData(EmployeModel())

  var navArguments: Bundle? = null
}
