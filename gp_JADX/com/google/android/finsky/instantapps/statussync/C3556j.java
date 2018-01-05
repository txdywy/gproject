package com.google.android.finsky.instantapps.statussync;

import android.content.SharedPreferences;
import com.google.android.finsky.instantappsbackendclient.InstantAppsClient;
import p000c.p001a.C0000a;

public final class C3556j implements C0000a {
    public final C0000a f17824a;
    public final C0000a f17825b;
    public final C0000a f17826c;
    public final C0000a f17827d;

    public C3556j(C0000a c0000a, C0000a c0000a2, C0000a c0000a3, C0000a c0000a4) {
        this.f17824a = c0000a;
        this.f17825b = c0000a2;
        this.f17826c = c0000a3;
        this.f17827d = c0000a4;
    }

    public final /* synthetic */ Object mo1a() {
        return new C3555i((C3547a) this.f17824a.mo1a(), (InstantAppsClient) this.f17825b.mo1a(), (C3550d) this.f17826c.mo1a(), (SharedPreferences) this.f17827d.mo1a());
    }
}
