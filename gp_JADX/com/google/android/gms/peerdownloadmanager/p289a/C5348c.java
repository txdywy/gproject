package com.google.android.gms.peerdownloadmanager.p289a;

import android.content.Context;
import java.util.Set;

public final class C5348c {
    public static final String f27860a = null;
    public static final String f27861b = null;
    public static final Set f27862c = null;
    public static final Set f27863d = null;
    public final Context f27864e;

    public C5348c(Context context) {
        this.f27864e = context.getApplicationContext();
    }

    public final void m26077a(boolean z, String str) {
        C5347b.m26073b(this.f27864e).putBoolean("wifi_needs_cleanup", true).putBoolean("wifi_on", z).putString("wifi_ssid", str).apply();
        m26075a(null);
        m26076a(null);
        m26078b(null);
    }

    public final void m26075a(String str) {
        C5347b.m26073b(this.f27864e).putBoolean("wifi_needs_cleanup", true).putString("wifi_mitosis_ssid", str).apply();
    }

    public final void m26076a(Set set) {
        C5347b.m26073b(this.f27864e).putBoolean("wifi_needs_cleanup", true).putStringSet("wifi_original_ssids", set).apply();
    }

    public final void m26078b(Set set) {
        C5347b.m26073b(this.f27864e).putBoolean("wifi_needs_cleanup", true).putStringSet("wifi_expected_ssids", set).apply();
    }
}
