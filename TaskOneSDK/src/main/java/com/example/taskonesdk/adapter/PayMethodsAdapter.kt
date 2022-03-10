package com.example.taskonesdk.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.taskonesdk.ModalMainSDK
import com.example.taskonesdk.databinding.PgModalBinding
import com.example.taskonesdk.databinding.PgNewpaymentmethodBinding

private const val PAY_METHOD_ADD_NEW_CARD: Int = 0
private const val PAY_METHOD_CREDIT_CARD: Int = 2
private const val PAY_METHOD_IDEAL: Int = 3
private const val PAY_METHOD: Int = 4
private const val ADD_NEW_PAYMENT_METHOD: Int = 5

internal class PayMethodsAdapter(

//  private var clickListener: OnPayMethodClick,
//  private var viewModelSDK: SDKMainViewModel,
  private val mainFragmentBinding: PgModalBinding,
  private val mainFragment: ModalMainSDK
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

  class AddNewPaymentMethod(private val itemBinding: PgNewpaymentmethodBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {
    fun bind(
      payMethod: String,
      clickListener: OnPayMethodClick,
      position: Int,
      lastChecked: Int?
    ) {
      itemView.setOnClickListener {
        clickListener.onItemClose()
        clickListener.onAddNewPaymentMethod()
      }
    }
  }


  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    val addNewPaymentmethod =
      PgNewpaymentmethodBinding.inflate(LayoutInflater.from(parent.context), parent, false)

    return when (viewType) {
      ADD_NEW_PAYMENT_METHOD -> AddNewPaymentMethod(addNewPaymentmethod)
      else -> AddNewPaymentMethod(addNewPaymentmethod)
    }

  }

  override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//
//    if (getItemViewType(position) == ADD_NEW_PAYMENT_METHOD) {
//      (holder as AddNewPaymentMethod).bind(
//        payMethod = "credcar",
//        position = 1
//      )
//    }

  }

  override fun getItemCount(): Int {
    TODO("Not yet implemented")
  }

}


internal interface OnPayMethodClick {
  fun onAddNewPaymentMethod()

  fun onItemClose()
}