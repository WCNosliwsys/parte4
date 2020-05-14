package com.ingwilson.migranparte4;

import android.app.IntentService;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;

public class IntentServiceOperacion extends IntentService {
    public IntentServiceOperacion() {
        super("IntentServiceOperacion");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        double n = intent.getExtras().getDouble("numero");
        SystemClock.sleep(25000);
        miIntentService.salida.append(n*n + "\n");
        miIntentService.miprogress.setVisibility(View.GONE);
    }
}
