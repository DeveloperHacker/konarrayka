package ru.spbstu.icc.kspt.common

import android.app.Activity
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.util.logging.Logger


fun Activity.alert(message: String, title: String = "Alert") {
    val logger = Logger.getLogger(javaClass.name)
    logger.warning(message)
    val alertDialog = AlertDialog.Builder(this).create()
    alertDialog.setTitle(title)
    alertDialog.setMessage(message)
    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK") { dialog, _ ->
        dialog.dismiss()
    }
    alertDialog.show()
}

fun Activity.toast(message: String) {
    val toast = Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT)
    toast.show()
}
