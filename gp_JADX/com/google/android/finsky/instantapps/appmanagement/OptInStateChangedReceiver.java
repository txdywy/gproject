package com.google.android.finsky.instantapps.appmanagement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.instantapps.InstantAppHygieneService;

public class OptInStateChangedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        InstantAppHygieneService.m16862a(context);
    }
}
