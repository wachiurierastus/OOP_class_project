package com.taskmanagement.app.modules.viewemployeeprofiletaskmangement.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.viewemployeeprofiletaskmangement.`data`.model.ViewEmployeeProfileTaskMangementModel
import org.koin.core.KoinComponent

class ViewEmployeeProfileTaskMangementVM : ViewModel(), KoinComponent {
  val viewEmployeeProfileTaskMangementModel: MutableLiveData<ViewEmployeeProfileTaskMangementModel>
      = MutableLiveData(ViewEmployeeProfileTaskMangementModel())

  var navArguments: Bundle? = null
}
