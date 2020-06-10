package com.emrekotun.gridlayout

import android.app.Activity
import android.util.DisplayMetrics
import kotlin.math.min

fun screenSize(activity:Activity):Float{
    val metrics = DisplayMetrics()
    activity.windowManager.defaultDisplay.getMetrics(metrics)
    val widthPixels: Int = metrics.widthPixels
    val heightPixels: Int = metrics.heightPixels
    val scaleFactor: Float = metrics.density
    val widthDp: Float = widthPixels / scaleFactor
    val heightDp: Float = heightPixels / scaleFactor
    return min(widthDp, heightDp)
}