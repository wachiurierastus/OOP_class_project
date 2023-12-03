package com.taskmanagement.app.modules.employeetaskmanagementdashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employeetaskmanagementdashboard.`data`.model.CardRowModel
import com.taskmanagement.app.modules.employeetaskmanagementdashboard.`data`.model.EmployeeTaskManagementDashboardModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EmployeeTaskManagementDashboardVM : ViewModel(), KoinComponent {
  val employeeTaskManagementDashboardModel: MutableLiveData<EmployeeTaskManagementDashboardModel> =
      MutableLiveData(EmployeeTaskManagementDashboardModel())

  var navArguments: Bundle? = null

  val cardList: MutableLiveData<MutableList<CardRowModel>> = MutableLiveData(mutableListOf())
}
