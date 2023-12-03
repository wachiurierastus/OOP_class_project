package com.taskmanagement.app.modules.employereditdailytasktaskmanagement.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class EmployerEditDailyTaskTaskManagementModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryce: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_task)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_wash_clothes2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_ends)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_wash_clothes2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceFour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_involves_washin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaskupdatedsu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_task_updated_su)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etInputprimaryiValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etInputprimarydValue: String? = null
)
