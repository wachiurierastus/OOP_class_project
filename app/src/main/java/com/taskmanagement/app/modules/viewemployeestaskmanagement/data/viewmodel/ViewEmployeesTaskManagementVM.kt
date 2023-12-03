package com.taskmanagement.app.modules.viewemployeestaskmanagement.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.viewemployeestaskmanagement.`data`.model.ListellipseRowModel
import com.taskmanagement.app.modules.viewemployeestaskmanagement.`data`.model.ViewEmployeesTaskManagementModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ViewEmployeesTaskManagementVM : ViewModel(), KoinComponent {
  val viewEmployeesTaskManagementModel: MutableLiveData<ViewEmployeesTaskManagementModel> =
      MutableLiveData(ViewEmployeesTaskManagementModel())

  var navArguments: Bundle? = null

  val listellipseList: MutableLiveData<MutableList<ListellipseRowModel>> =
      MutableLiveData(mutableListOf())
}
