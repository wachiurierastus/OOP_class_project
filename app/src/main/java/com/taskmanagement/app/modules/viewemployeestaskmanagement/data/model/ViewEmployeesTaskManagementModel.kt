package com.taskmanagement.app.modules.viewemployeestaskmanagement.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class ViewEmployeesTaskManagementModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryce: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_view_employees)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_employee)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifprimaryd: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)

)
