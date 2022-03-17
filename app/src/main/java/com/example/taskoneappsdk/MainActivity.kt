package com.example.taskoneappsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.taskoneappsdk.databinding.ActivityMainBinding
import com.example.taskonesdk.ModalSDK

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(binding.root)

    binding.btnShow.setOnClickListener { showBottomSheeet() }
    Log.d("dwww","Teste")
    Log.d("dwww","Teste Dois")
    Log.d("dwww","Teste Tres")
    Log.d("dwww","Teste Quatro")
    Log.d("dwww","Teste eita")
    Log.d("dwww","Teste Rynalde")


  }

  private fun showBottomSheeet() {

    ModalSDK.startModal(supportFragmentManager)
//    binding.root.rootView.postDelayed({ ModalSDK.closeModal() }, 6000)

  }

//  private fun addNewMetodPayment(){
//
//    ModalSDK.addNewMatodPayment(supportFragmentManager)
//
//  }

}