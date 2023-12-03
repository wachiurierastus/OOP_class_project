package com.taskmanagement.app.modules.employertaskspagetaskmanagement.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employertaskspagetaskmanagement.`data`.model.EmployerTasksPagetaskManagementModel
import com.taskmanagement.app.modules.employertaskspagetaskmanagement.`data`.model.ListcardmenutitleTwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class EmployerTasksPagetaskManagementVM : ViewModel(), KoinComponent {
  val employerTasksPagetaskManagementModel: MutableLiveData<EmployerTasksPagetaskManagementModel> =
      MutableLiveData(EmployerTasksPagetaskManagementModel())

  var navArguments: Bundle? = null

  val listcardmenutitleTwoList: MutableLiveData<MutableList<ListcardmenutitleTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
