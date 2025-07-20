package com.tonnom.enregsonore

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        val command = message.data["command"]
        when (command) {
            "start" -> {
                Log.d("FCM", "Commande START reçue")
                // TODO : Ajouter code pour démarrer l'enregistrement ici
            }
            "stop" -> {
                Log.d("FCM", "Commande STOP reçue")
                // TODO : Ajouter code pour arrêter l'enregistrement ici
            }
        }
    }
}
