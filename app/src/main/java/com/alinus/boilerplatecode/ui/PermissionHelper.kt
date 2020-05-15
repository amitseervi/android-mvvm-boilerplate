package com.alinus.boilerplatecode.ui

import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class PermissionHelper {
    companion object {
        fun requestPermission(activity: Activity, permission: String, requestCode: Int) {
            if (ContextCompat.checkSelfPermission(
                    activity,
                    permission
                ) != PackageManager.PERMISSION_GRANTED
            ) {

                if (ActivityCompat.shouldShowRequestPermissionRationale(
                        activity,
                        permission
                    )
                ) {

                } else {
                    ActivityCompat.requestPermissions(
                        activity,
                        arrayOf(permission),
                        requestCode
                    )
                }
            } else {

            }
        }

        fun hasPermission(activity: Activity, permission: String): Boolean {
            return ContextCompat.checkSelfPermission(
                activity,
                permission
            ) == PackageManager.PERMISSION_GRANTED
        }
    }
}