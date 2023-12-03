package com.taskmanagement.app.modules.employerlogin.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class EmployerLoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTASKLinker: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_linker)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_task_management)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogintoyoura: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_to_your_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_login_with)

)
