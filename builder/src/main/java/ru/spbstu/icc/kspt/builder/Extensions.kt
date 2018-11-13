package ru.spbstu.icc.kspt.builder

import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.ViewGroup

fun ViewGroup.inflate(@LayoutRes resource: Int, attachToRoot: Boolean = false) =
        LayoutInflater.from(context).inflate(resource, this, attachToRoot)