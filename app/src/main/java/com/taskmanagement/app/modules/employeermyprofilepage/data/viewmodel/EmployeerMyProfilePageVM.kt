package com.taskmanagement.app.modules.employeermyprofilepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employeermyprofilepage.`data`.model.EmployeerMyProfilePageModel
import org.koin.core.KoinComponent

class EmployeerMyProfilePageVM : ViewModel(), KoinComponent {
  val employeerMyProfilePageModel: MutableLiveData<EmployeerMyProfilePageModel> =
      MutableLiveData(EmployeerMyProfilePageModel())

  var navArguments: Bundle? = null
}
