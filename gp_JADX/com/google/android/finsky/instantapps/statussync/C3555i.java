package com.google.android.finsky.instantapps.statussync;

import android.content.SharedPreferences;
import com.google.android.finsky.instantappsbackendclient.InstantAppsClient;

public final class C3555i {
    public final C3547a f17820a;
    public final InstantAppsClient f17821b;
    public final SharedPreferences f17822c;
    public final C3550d f17823d;

    public C3555i(C3547a c3547a, InstantAppsClient instantAppsClient, C3550d c3550d, SharedPreferences sharedPreferences) {
        this.f17820a = c3547a;
        this.f17821b = instantAppsClient;
        this.f17823d = c3550d;
        this.f17822c = sharedPreferences;
    }

    static String m17131a(String str) {
        String valueOf = String.valueOf("isInstantAppsEnabled_");
        String valueOf2 = String.valueOf(str);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
