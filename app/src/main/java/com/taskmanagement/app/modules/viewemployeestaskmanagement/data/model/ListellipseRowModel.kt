package com.taskmanagement.app.modules.viewemployeestaskmanagement.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipseRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtJacobKamau: String? = MyApp.getInstance().resources.getString(R.string.lbl_jacob_kamau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.msg_254_812_9875)

)
