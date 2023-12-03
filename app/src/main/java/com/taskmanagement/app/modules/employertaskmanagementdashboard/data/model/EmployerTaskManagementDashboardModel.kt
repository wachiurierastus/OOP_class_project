package com.taskmanagement.app.modules.employertaskmanagementdashboard.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class EmployerTaskManagementDashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.msg_wednesday_20_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_welcome_nyamban)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubheaderpara: String? =
      MyApp.getInstance().resources.getString(R.string.msg_have_a_nice_day)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_mvp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryce: String? = MyApp.getInstance().resources.getString(R.string.lbl_janet_kamau2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixtyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_65)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_complete)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToDo: String? = MyApp.getInstance().resources.getString(R.string.lbl_to_do)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInProgress: String? = MyApp.getInstance().resources.getString(R.string.lbl_in_progress)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompleted: String? = MyApp.getInstance().resources.getString(R.string.lbl_completed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_today_s_tasks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_tien_tom)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_tien_tom)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_tien_tom)

)
