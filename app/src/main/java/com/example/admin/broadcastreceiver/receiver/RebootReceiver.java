package com.example.admin.broadcastreceiver.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RebootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        // Calling MyReceiver to start after restarting your mobile device
        Intent in = new Intent(context, MyReceiver.class);
        context.sendBroadcast(in);
    }
}
