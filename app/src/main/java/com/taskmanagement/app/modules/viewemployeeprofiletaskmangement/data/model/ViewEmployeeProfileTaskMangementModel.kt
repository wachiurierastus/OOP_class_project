package com.taskmanagement.app.modules.viewemployeeprofiletaskmangement.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class ViewEmployeeProfileTaskMangementModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryce: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_jacob_kamau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_home_manager)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_nairobi_kenya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaskCompl: String? = MyApp.getInstance().resources.getString(R.string.msg_2653_task_compl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEdit: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTasks: String? = MyApp.getInstance().resources.getString(R.string.lbl_tasks)

)
