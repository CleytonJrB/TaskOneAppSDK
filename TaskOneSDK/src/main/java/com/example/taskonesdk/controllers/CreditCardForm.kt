package com.example.taskonesdk.controllers

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import com.example.taskonesdk.R
import com.example.taskonesdk.databinding.PgNewpaymentmethodBinding
import kotlin.properties.Delegates

internal class CreditCardForm(

  private var itemBinding: PgNewpaymentmethodBinding,
) {
//  private var cardSchem: String?= null
//  private var isNumberValid = false
//  private var isCvvValid = false
//  private var isExpiryDateValid = false
//  private var cardSecondaryScheme: String? = null

  var visibility: Boolean by Delegates.observable(true) { property, oldValue, isEnable ->
    itemBinding.cardFormItemSave.text = "${itemBinding.root.context.getString(R.string.save)}"
    if (isEnable) {
      showCardForm()
    } else {
      hideCardForm()
    }
  }

  private fun showCardForm() {

    itemBinding.cardFormItemFlagsImages.visibility = View.GONE
    itemBinding.cardFormItemBody.visibility = View.VISIBLE
    itemBinding.cardFormItemSave.visibility = View.VISIBLE

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
      itemBinding.root.backgroundTintList =
        ColorStateList.valueOf(Color.parseColor("#AAFFAA"))
    }

    TransitionManager.beginDelayedTransition(itemBinding.cardForm, AutoTransition())
    itemBinding.cardForm.refreshDrawableState()

  }

  private fun hideCardForm() {
    itemBinding.cardFormItemFlagsImages.visibility = View.VISIBLE
    itemBinding.cardFormItemBody.visibility = View.GONE
    itemBinding.cardFormItemSave.visibility = View.GONE

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
      itemBinding.root.backgroundTintList = ColorStateList.valueOf(Color.WHITE)
    }
    itemBinding.cardForm.refreshDrawableState()
    TransitionManager.beginDelayedTransition(itemBinding.cardForm, AutoTransition())

  }

}