package com.taskmanagement.app.modules.employereditdailytasktaskmanagement.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employereditdailytasktaskmanagement.`data`.model.EmployerEditDailyTaskTaskManagementModel
import org.koin.core.KoinComponent

class EmployerEditDailyTaskTaskManagementVM : ViewModel(), KoinComponent {
  val employerEditDailyTaskTaskManagementModel:
      MutableLiveData<EmployerEditDailyTaskTaskManagementModel> =
      MutableLiveData(EmployerEditDailyTaskTaskManagementModel())

  var navArguments: Bundle? = null
}
