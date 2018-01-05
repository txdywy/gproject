package org.chromium.base;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import org.chromium.base.annotations.CalledByNative;

public class PowerMonitor {
    public static PowerMonitor f40498a;
    public boolean f40499b;

    private PowerMonitor() {
    }

    private static native void nativeOnBatteryChargingChanged();

    static void m37802a(Intent intent) {
        boolean z = true;
        int intExtra = intent.getIntExtra("plugged", -1);
        PowerMonitor powerMonitor = f40498a;
        if (intExtra == 2 || intExtra == 1) {
            z = false;
        }
        powerMonitor.f40499b = z;
        nativeOnBatteryChargingChanged();
    }

    @CalledByNative
    private static boolean isBatteryPower() {
        if (f40498a == null && f40498a == null) {
            Context context = C7888e.f40514a;
            f40498a = new PowerMonitor();
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                m37802a(registerReceiver);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            context.registerReceiver(new C7902o(), intentFilter);
        }
        return f40498a.f40499b;
    }
}
