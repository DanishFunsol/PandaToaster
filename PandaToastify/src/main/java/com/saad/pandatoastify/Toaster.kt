package com.saad.pandatoastify

import android.content.Context
import android.widget.Toast

object Toaster {
    fun showLongToast(context: Context) {
        Toast.makeText(context, "This is long toast", Toast.LENGTH_LONG).show()
    }

    fun showShortToast(context: Context) {
        Toast.makeText(context, "This is short toast", Toast.LENGTH_SHORT).show()
    }
}