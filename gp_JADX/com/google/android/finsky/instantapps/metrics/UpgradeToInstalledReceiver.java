package com.google.android.finsky.instantapps.metrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class UpgradeToInstalledReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        AppUpgradeToInstalledService.m17105a(context, intent);
    }
}
