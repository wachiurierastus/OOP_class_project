package com.taskmanagement.app.modules.employeemyprofilepage.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class EmployeeMyProfilePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryce: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputprimaryd: String? = MyApp.getInstance().resources.getString(R.string.lbl_janet_kamau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_role)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInputprimarydOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_house_manager)
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
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_janetkamau_apl)

)
