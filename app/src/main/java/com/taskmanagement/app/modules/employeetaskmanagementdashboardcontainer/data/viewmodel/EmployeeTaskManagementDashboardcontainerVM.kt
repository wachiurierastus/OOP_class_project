package com.taskmanagement.app.modules.employeetaskmanagementdashboardcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employeetaskmanagementdashboardcontainer.`data`.model.EmployeeTaskManagementDashboardcontainerModel
import org.koin.core.KoinComponent

class EmployeeTaskManagementDashboardcontainerVM : ViewModel(), KoinComponent {
  val employeeTaskManagementDashboardcontainerModel:
      MutableLiveData<EmployeeTaskManagementDashboardcontainerModel> =
      MutableLiveData(EmployeeTaskManagementDashboardcontainerModel())

  var navArguments: Bundle? = null
}
