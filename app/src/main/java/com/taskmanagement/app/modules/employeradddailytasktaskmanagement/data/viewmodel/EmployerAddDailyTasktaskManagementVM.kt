package com.taskmanagement.app.modules.employeradddailytasktaskmanagement.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employeradddailytasktaskmanagement.`data`.model.EmployerAddDailyTasktaskManagementModel
import com.taskmanagement.app.modules.employeradddailytasktaskmanagement.`data`.model.SpinnerHeaderModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EmployerAddDailyTasktaskManagementVM : ViewModel(), KoinComponent {
  val employerAddDailyTasktaskManagementModel:
      MutableLiveData<EmployerAddDailyTasktaskManagementModel> =
      MutableLiveData(EmployerAddDailyTasktaskManagementModel())

  var navArguments: Bundle? = null

  val spinnerHeaderList: MutableLiveData<MutableList<SpinnerHeaderModel>> = MutableLiveData()
}
