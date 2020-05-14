package com.ingwilson.migranparte4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class VibrateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Vibrator mVibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        mVibrator.vibrate(5000);
        Toast.makeText(context, "Se ha pulsado el botón.", Toast.LENGTH_SHORT)
                .show();
    }
}