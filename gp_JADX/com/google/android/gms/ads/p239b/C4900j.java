package com.google.android.gms.ads.p239b;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.C5105f;

final class C4900j {
    public SharedPreferences f25260a;

    C4900j(Context context) {
        try {
            Context h = C5105f.m23698h(context);
            this.f25260a = h == null ? null : h.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f25260a = null;
        }
    }

    final boolean m22924a(String str) {
        boolean z = false;
        try {
            if (this.f25260a != null) {
                z = this.f25260a.getBoolean(str, false);
            }
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
        }
        return z;
    }

    final float m22925b(String str) {
        float f = 0.0f;
        try {
            if (this.f25260a != null) {
                f = this.f25260a.getFloat(str, 0.0f);
            }
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
        }
        return f;
    }
}
