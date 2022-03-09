package com.example.taskonesdk.ui

import android.content.res.Resources
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.taskonesdk.databinding.PgNewpaymentmetodBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

internal class NewPaymentMetod : BottomSheetDialogFragment() {

  private var _binding: PgNewpaymentmetodBinding? = null
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {

    _binding = PgNewpaymentmetodBinding.inflate(inflater, container, false)

    return binding.root

  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)

    requireView().layoutParams.height =
      (Resources.getSystem().displayMetrics.heightPixels * 0.85).toInt()
    requireView().requestLayout()

  }

}