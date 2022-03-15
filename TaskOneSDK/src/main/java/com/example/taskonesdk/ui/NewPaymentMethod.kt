package com.example.taskonesdk.ui

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.taskonesdk.controllers.CreditCardForm
import com.example.taskonesdk.databinding.PgNewpaymentmethodBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import java.text.FieldPosition

internal class NewPaymentMethod : BottomSheetDialogFragment() {

  private var _binding: PgNewpaymentmethodBinding? = null
  private val binding get() = _binding!!
  private lateinit var cred: CreditCardForm

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {

    _binding = PgNewpaymentmethodBinding.inflate(inflater, container, false)

    return binding.root

  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)

    binding.dismissAddNewPaymentMethods.setOnClickListener { dismiss() }

    binding.cardForm.setOnClickListener { onClickCreditForm() }

    Log.d("dwww","teste")

    requireView().layoutParams.height =
      (Resources.getSystem().displayMetrics.heightPixels * 0.85).toInt()
    requireView().requestLayout()

  }

  private fun onClickCreditForm() {

    binding.cardForm.setOnClickListener {

    }
  }

}

