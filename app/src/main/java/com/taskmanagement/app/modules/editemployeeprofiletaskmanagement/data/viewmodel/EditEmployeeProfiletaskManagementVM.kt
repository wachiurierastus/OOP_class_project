package com.taskmanagement.app.modules.editemployeeprofiletaskmanagement.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.editemployeeprofiletaskmanagement.`data`.model.EditEmployeeProfiletaskManagementModel
import org.koin.core.KoinComponent

class EditEmployeeProfiletaskManagementVM : ViewModel(), KoinComponent {
  val editEmployeeProfiletaskManagementModel:
      MutableLiveData<EditEmployeeProfiletaskManagementModel> =
      MutableLiveData(EditEmployeeProfiletaskManagementModel())

  var navArguments: Bundle? = null
}
