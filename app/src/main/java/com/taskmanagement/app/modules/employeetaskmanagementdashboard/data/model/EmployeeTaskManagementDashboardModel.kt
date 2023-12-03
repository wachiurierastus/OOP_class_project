package com.taskmanagement.app.modules.employeetaskmanagementdashboard.`data`.model

import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.di.MyApp
import kotlin.String

data class EmployeeTaskManagementDashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHeaderparadef: String? =
      MyApp.getInstance().resources.getString(R.string.msg_saturday_feb_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubheaderpara: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_welcome_janet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubheaderparaOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_have_a_nice_day)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategoryparab: String? =
      MyApp.getInstance().resources.getString(R.string.msg_my_priority_tas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategoryparabOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_daily_task)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_wash_utensils)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParaprimaryceFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_vacuum_the_hous)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_take_trash_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParadefaultce: String? =
      MyApp.getInstance().resources.getString(R.string.msg_prepare_the_bed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParadefaultceOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_assignment_revi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParadefaultceTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_buying_mother_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParadefaultceThree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_check_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtParadefaultceFour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dinner_with_lov)

)
