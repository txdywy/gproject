package com.google.android.finsky.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.support.v4.os.C0327a;
import java.lang.reflect.InvocationTargetException;

public final class ai {
    public final Context f24034a;

    public ai(Context context) {
        this.f24034a = context;
    }

    public final synchronized Boolean m21696a() {
        Boolean bool = null;
        synchronized (this) {
            if (VERSION.SDK_INT >= 23) {
                bool = Boolean.valueOf(((BatteryManager) this.f24034a.getSystemService("batterymanager")).isCharging());
            } else {
                Intent registerReceiver = this.f24034a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver == null) {
                    FinskyLog.m21667d("Battery Status intent is null", new Object[0]);
                } else {
                    int intExtra = registerReceiver.getIntExtra("status", -1);
                    boolean z = intExtra == 2 || intExtra == 5;
                    bool = Boolean.valueOf(z);
                }
            }
        }
        return bool;
    }

    public final synchronized int m21697b() {
        int i = -1;
        synchronized (this) {
            Intent registerReceiver = this.f24034a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 >= 0 && intExtra >= 0 && intExtra2 > 0) {
                i = (intExtra * 100) / intExtra2;
            }
        }
        return i;
    }

    @TargetApi(21)
    public final boolean m21698c() {
        PowerManager powerManager = (PowerManager) this.f24034a.getSystemService("power");
        if (VERSION.SDK_INT >= 21) {
            return powerManager.isInteractive();
        }
        return powerManager.isScreenOn();
    }

    public final boolean m21699d() {
        if (VERSION.SDK_INT >= 23 && ((PowerManager) this.f24034a.getSystemService("power")).isDeviceIdleMode()) {
            return true;
        }
        if (C0327a.m1721a()) {
            PowerManager powerManager = (PowerManager) this.f24034a.getSystemService("power");
            try {
                if (((Boolean) powerManager.getClass().getMethod("isLightDeviceIdleMode", new Class[0]).invoke(powerManager, new Object[0])).booleanValue()) {
                    return true;
                }
            } catch (NoSuchMethodException e) {
                FinskyLog.m21669e("%s", e);
            } catch (IllegalAccessException e2) {
                FinskyLog.m21669e("%s", e2);
            } catch (InvocationTargetException e3) {
                FinskyLog.m21665c("%s", e3);
            }
        }
        return false;
    }
}
