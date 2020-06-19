package com.example.android.eggtimernotifications

import android.app.NotificationManager
import android.content.ContentValues.TAG
import android.content.Context
import android.os.Build
import android.util.Log
import androidx.core.content.ContextCompat
import com.example.android.eggtimernotifications.util.sendNotification
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import javax.net.ssl.ManagerFactoryParameters

/**
 * Created on 6/17/20.
 * @author Alan
 */
open class MyFirebaseMessagingService: FirebaseMessagingService() {
    override fun onNewToken(p0: String) {
        super.onNewToken(p0)
        Log.d("Refresh token", "Refreshed token: $p0")
    }

    override fun onMessageReceived(p0: RemoteMessage) {
        super.onMessageReceived(p0)
        p0.notification.let {
            sendNotification(it?.body!!)
        }
    }

    private fun sendNotification(body: String){
        val managner = ContextCompat.getSystemService(applicationContext,NotificationManager::class.java) as NotificationManager
        managner.sendNotification(body, applicationContext)
    }
}