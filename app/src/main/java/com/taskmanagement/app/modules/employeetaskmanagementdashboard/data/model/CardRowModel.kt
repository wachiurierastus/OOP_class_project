package com.taskmanagement.app.modules.employeetaskmanagementdashboard.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class CardRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_days)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryce: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_make_breakfast)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_progress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_80)

)
