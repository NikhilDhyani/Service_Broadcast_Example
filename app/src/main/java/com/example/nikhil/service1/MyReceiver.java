package com.example.nikhil.service1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by NIKHIL on 14-03-2018.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();

        Intent intents = new Intent(context.getApplicationContext(), MyService.class);;
        context.startService(intents);
    }
}
