package com.example.dottedprogressbar

import android.app.Dialog
import android.app.ProgressDialog
import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        openDialog.setOnClickListener {
            var progressDialog = Dialog(this@MainActivity)
            progressDialog.setCancelable(true)
            progressDialog.setCanceledOnTouchOutside(false)
            progressDialog.window?.setBackgroundDrawable(ColorDrawable(android.graphics.Color.TRANSPARENT))
            progressDialog.show()
            progressDialog.setContentView(R.layout.progress_layout)
        }
    }
}
