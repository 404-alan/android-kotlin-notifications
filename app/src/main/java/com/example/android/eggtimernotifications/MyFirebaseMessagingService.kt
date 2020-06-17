package com.example.android.eggtimernotifications

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

/**
 * Created on 6/17/20.
 * @author Alan
 */
open class MyFirebaseMessagingService: FirebaseMessagingService() {
    override fun onNewToken(p0: String) {
        super.onNewToken(p0)
        Log.d("Refresh token", "Refreshed token: $p0")
    }
}