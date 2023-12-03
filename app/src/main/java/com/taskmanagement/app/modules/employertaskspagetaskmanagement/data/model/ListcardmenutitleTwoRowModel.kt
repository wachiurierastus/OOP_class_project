package com.taskmanagement.app.modules.employertaskspagetaskmanagement.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class ListcardmenutitleTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_cook_food)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_food_creation_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFebMarTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_feb_21_mar)

)
