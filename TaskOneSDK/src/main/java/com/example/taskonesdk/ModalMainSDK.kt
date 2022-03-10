package com.example.taskonesdk

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.taskonesdk.databinding.PgModalBinding
import com.example.taskonesdk.ui.NewPaymentMethod
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

internal class ModalMainSDK : BottomSheetDialogFragment() {

  private var _binding: PgModalBinding? = null
  private val binding get() = _binding!!

  private var paymethod: NewPaymentMethod? = null

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {

    _binding = PgModalBinding.inflate(inflater, container, false)

    return binding.root

  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)

    paymethod = NewPaymentMethod()

    context?.setTheme(R.style.Theme_TaskOneSDK)

    requireView().layoutParams.height =
      (Resources.getSystem().displayMetrics.heightPixels * 0.85).toInt()
    requireView().requestLayout()

    binding.btnCAddnew.setOnClickListener { opennewadd() }

  }

  public fun closeModal() {

    dismiss()

  }

  public fun opennewadd() {

    paymethod?.show(parentFragmentManager, "showpayment")

//    paymethod.apply{
//
//      this?.show(parentFragmentManager, "showpayment")
//
//    }

  }
}