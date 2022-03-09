package com.example.taskonesdk

import androidx.fragment.app.FragmentManager
import com.example.taskonesdk.ui.NewPaymentMetod



object ModalSDK {

  private val modal = ModalMainSDK()
//  private val newPaymentMetod = NewPaymentMetod()

  public fun startModal(fragmentManager: FragmentManager){

    modal.show(fragmentManager,"modalsdk")

  }
  public fun closeModal(){

    modal.closeModal()

  }

//  public fun addNewMatodPayment(fragmentManager: FragmentManager){
//
//    newPaymentMetod.show(fragmentManager,"addnewpaymentmetod")
//
//  }

}