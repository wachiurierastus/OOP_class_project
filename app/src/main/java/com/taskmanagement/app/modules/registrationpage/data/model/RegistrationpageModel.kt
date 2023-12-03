package com.taskmanagement.app.modules.registrationpage.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class RegistrationpageModel(
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
  var txtCreateyouracc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_acc)
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
  var txtConfirmPasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_confirm_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_registe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrRegisterwit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_register_wit)

)
