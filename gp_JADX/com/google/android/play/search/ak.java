package com.google.android.play.search;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

public final class ak extends BroadcastReceiver {
    public static final Intent f32344a = new Intent("android.speech.action.RECOGNIZE_SPEECH");
    public final C6420m f32345b;
    public boolean f32346c;

    public static boolean m29430a(Context context) {
        return context.getPackageManager().queryIntentActivities(f32344a, 0).size() > 0;
    }

    public ak(C6420m c6420m) {
        this.f32345b = c6420m;
    }

    final void m29431b(Context context) {
        if (this.f32346c) {
            context.unregisterReceiver(this);
            this.f32346c = false;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        ArrayList stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        if (stringArrayListExtra != null) {
            stringArrayListExtra = stringArrayListExtra;
            int size = stringArrayListExtra.size();
            int i = 0;
            while (i < size) {
                Object obj = stringArrayListExtra.get(i);
                i++;
                String str = (String) obj;
                if (str != null) {
                    this.f32345b.m29443a(str, true);
                    break;
                }
            }
        }
        m29431b(context);
    }
}
