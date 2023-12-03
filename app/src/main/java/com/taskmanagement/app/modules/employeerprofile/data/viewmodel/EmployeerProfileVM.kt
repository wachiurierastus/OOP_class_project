package com.taskmanagement.app.modules.employeerprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.employeerprofile.`data`.model.EmployeerProfileModel
import org.koin.core.KoinComponent

class EmployeerProfileVM : ViewModel(), KoinComponent {
  val employeerProfileModel: MutableLiveData<EmployeerProfileModel> =
      MutableLiveData(EmployeerProfileModel())

  var navArguments: Bundle? = null
}
