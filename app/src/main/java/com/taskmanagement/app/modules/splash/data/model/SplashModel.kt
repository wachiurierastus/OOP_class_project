package com.taskmanagement.app.modules.splash.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTASKLinker: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_linker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_task_management)

)
