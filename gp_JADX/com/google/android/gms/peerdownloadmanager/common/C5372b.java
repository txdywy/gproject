package com.google.android.gms.peerdownloadmanager.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

public final class C5372b {
    public final float f27937a;
    public final boolean f27938b;

    private C5372b(float f, boolean z) {
        this.f27937a = f;
        this.f27938b = z;
    }

    public static C5372b m26136a(Context context) {
        float f;
        boolean z = false;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver.getIntExtra("level", 0);
        int intExtra2 = registerReceiver.getIntExtra("scale", 0);
        if (intExtra == 0 || intExtra2 == 0) {
            f = 0.0f;
        } else {
            f = 100.0f * (((float) intExtra) / ((float) intExtra2));
        }
        int intExtra3 = registerReceiver.getIntExtra("status", -1);
        if (intExtra3 == 2 || intExtra3 == 5) {
            z = true;
        }
        Log.d("BatteryStatus", "battery level=" + intExtra + ", scale=" + intExtra2 + ", status=" + intExtra3 + ", isCharging=" + z + ", percentage=" + f);
        return new C5372b(f, z);
    }
}
