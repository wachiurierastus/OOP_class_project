package com.taskmanagement.app.modules.editemployeeprofiletaskmanagement.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class EditEmployeeProfiletaskManagementModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryce: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_profession)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_date_of_birth)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dec_16_2001)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_jacobkamau_gmai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputprimarydValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputprimarydOneValue: String? = null
)
