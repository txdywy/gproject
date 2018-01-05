package com.google.android.finsky.instantapps;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

public class PhenotypeUpdateReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), "com.google.android.gms.phenotype.UPDATE") && TextUtils.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.finsky.instantapps")) {
            PhenotypeUpdateService.m16866a(context);
        }
    }
}
