package com.taskmanagement.app.modules.employertaskmanagementdashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employertaskmanagementdashboard.`data`.model.EmployerTaskManagementDashboardModel
import org.koin.core.KoinComponent

class EmployerTaskManagementDashboardVM : ViewModel(), KoinComponent {
  val employerTaskManagementDashboardModel: MutableLiveData<EmployerTaskManagementDashboardModel> =
      MutableLiveData(EmployerTaskManagementDashboardModel())

  var navArguments: Bundle? = null
}
