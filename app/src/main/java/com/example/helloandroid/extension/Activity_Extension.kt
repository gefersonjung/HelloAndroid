package com.example.helloandroid.extension

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.alert(msg: String) {
    val dialog = AlertDialog.Builder(this).create()
    dialog.setTitle("Android")
    dialog.setMessage(msg)
    dialog.setButton(
        AlertDialog.BUTTON_NEUTRAL, "ok"
    ) {_, which ->
        dialog.dismiss()
    }
    dialog.show()
}