package com.example.helloandroid.extension

import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatCallback

fun AppCompatActivity.alert(msg: String, callback: () -> Unit = {}) {
    val dialog = AlertDialog.Builder(this).create()
    dialog.setTitle("Android")
    dialog.setMessage(msg)
    dialog.setButton(
        AlertDialog.BUTTON_NEUTRAL, "ok"
    ) {_, which ->
        dialog.dismiss()
        callback() //Aqui chama a função Callback
    }
    dialog.show()
}