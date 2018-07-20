package com.techjini.requestform

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        sendFeedback()
    }

    var button : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.submitButton)
        button?.setOnClickListener(this)
    }

    fun sendFeedback() {
        // Do click handling here

        val requestType = findViewById<EditText>(R.id.productType)
        val name = requestType.text.toString()

        val productType = findViewById<EditText>(R.id.writeYourConcerns)
        val email = productType.text.toString()

        val lanSpinner = findViewById<Spinner>(R.id.requestType)
        val feedbackType = lanSpinner.selectedItem.toString()

        val requestTypeSpinner = findViewById<Spinner>(R.id.loanApplicationNumber)
        val feedbackType1 = requestTypeSpinner.selectedItem.toString()
    }
}