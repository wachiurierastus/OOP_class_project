package com.taskmanagement.app.modules.employeetaskmanagementdashboard.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.taskmanagement.app.R
import com.taskmanagement.app.appcomponents.base.BaseFragment
import com.taskmanagement.app.databinding.FragmentEmployeeTaskManagementDashboardBinding
import com.taskmanagement.app.modules.employeetaskmanagementdashboard.`data`.model.CardRowModel
import com.taskmanagement.app.modules.employeetaskmanagementdashboard.`data`.viewmodel.EmployeeTaskManagementDashboardVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EmployeeTaskManagementDashboardFragment :
    BaseFragment<FragmentEmployeeTaskManagementDashboardBinding>(R.layout.fragment_employee_task_management_dashboard)
    {
  private val viewModel: EmployeeTaskManagementDashboardVM by
      viewModels<EmployeeTaskManagementDashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val cardAdapter = CardAdapter(viewModel.cardList.value?:mutableListOf())
    binding.recyclerCard.adapter = cardAdapter
    cardAdapter.setOnItemClickListener(
    object : CardAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CardRowModel) {
        onClickRecyclerCard(view, position, item)
      }
    }
    )
    viewModel.cardList.observe(requireActivity()) {
      cardAdapter.updateData(it)
    }
    binding.employeeTaskManagementDashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerCard(
    view: View,
    position: Int,
    item: CardRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EMPLOYEE_TASK_MANAGEMENT_DASHBOARD_FRAGMENT"


    fun getInstance(bundle: Bundle?): EmployeeTaskManagementDashboardFragment {
      val fragment = EmployeeTaskManagementDashboardFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
