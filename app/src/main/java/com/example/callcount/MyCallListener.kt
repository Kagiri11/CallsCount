package com.example.callcount

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyCallListener : BroadcastReceiver(){
    val TAG = "MyCallListener"

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeEnabled= intent?.getBooleanExtra("state",false) ?: return
        if (isAirplaneModeEnabled){
            Toast.makeText(context,"Airplane mode enabled",Toast.LENGTH_SHORT).show()
            Log.d(TAG,"I feel so down bana")
        }else{
            Toast.makeText(context,"Airplane mode disabled",Toast.LENGTH_SHORT).show()
            Log.d(TAG,"I feel so down bana again")
        }
    }
}