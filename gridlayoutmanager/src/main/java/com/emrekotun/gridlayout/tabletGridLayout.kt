package com.emrekotun.gridlayout

import android.app.Activity
import androidx.recyclerview.widget.GridLayoutManager

fun tabletGridLayout(mActivity: Activity, spanCount:Int):GridLayoutManager{
    val screenWidth = screenSize(mActivity)
    return when {
        screenWidth >= 720 -> {
            //Device is a 10" tablet
            GridLayoutManager(mActivity.applicationContext, spanCount)
        }
        screenWidth >= 600 -> {
            //Device is a 7" tablet
            GridLayoutManager(mActivity.applicationContext, spanCount)
        }
        else -> {
            //Device is a phone
            GridLayoutManager(mActivity.applicationContext, spanCount-1)
        }
    }

}