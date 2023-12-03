package com.taskmanagement.app.modules.employeeprofile.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class EmployeeProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryce: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_janet_kamau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaskCompl: String? = MyApp.getInstance().resources.getString(R.string.msg_2653_task_compl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMyProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)

)
