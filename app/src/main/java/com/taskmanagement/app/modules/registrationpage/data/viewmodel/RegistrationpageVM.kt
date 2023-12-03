package com.taskmanagement.app.modules.registrationpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.taskmanagement.app.modules.registrationpage.`data`.model.RegistrationpageModel
import org.koin.core.KoinComponent

class RegistrationpageVM : ViewModel(), KoinComponent {
  val registrationpageModel: MutableLiveData<RegistrationpageModel> =
      MutableLiveData(RegistrationpageModel())

  var navArguments: Bundle? = null
}
