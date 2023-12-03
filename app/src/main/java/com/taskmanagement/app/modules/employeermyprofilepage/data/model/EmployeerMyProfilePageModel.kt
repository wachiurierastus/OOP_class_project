package com.taskmanagement.app.modules.employeermyprofilepage.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class EmployeerMyProfilePageModel(
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
  var txtInputprimaryd: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nyakimincha_nya2)
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
  var etEmailValue: String? = null
)
