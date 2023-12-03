package com.taskmanagement.app.modules.employerlogin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employerlogin.`data`.model.EmployerLoginModel
import org.koin.core.KoinComponent

class EmployerLoginVM : ViewModel(), KoinComponent {
  val employerLoginModel: MutableLiveData<EmployerLoginModel> =
      MutableLiveData(EmployerLoginModel())

  var navArguments: Bundle? = null
}
