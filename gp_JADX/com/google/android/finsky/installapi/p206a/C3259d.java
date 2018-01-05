package com.google.android.finsky.installapi.p206a;

import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.installapi.C3272g;

final /* synthetic */ class C3259d implements Runnable {
    public final C3258c f16794a;
    public final C3272g f16795b;
    public final cv f16796c;

    C3259d(C3258c c3258c, C3272g c3272g, cv cvVar) {
        this.f16794a = c3258c;
        this.f16795b = c3272g;
        this.f16796c = cvVar;
    }

    public final void run() {
        C3258c c3258c = this.f16794a;
        C3272g c3272g = this.f16795b;
        cv cvVar = this.f16796c;
        String str = c3272g.f16843b;
        String str2 = c3272g.f16842a;
        String str3 = cvVar.f12100g;
        C2441n c2441n = cvVar.f12112s.f12048a;
        c3258c.f16788c.mo3440a(str, false, false, false);
        c3258c.f16788c.mo3455i(str);
        c3258c.f16788c.mo3452f(str);
        c3258c.f16788c.mo3433a(str, c2441n.f13163c, null, str3, 1, c2441n.f13153B, str2, c3258c.f16791f.m13184a("device_owner_install"));
    }
}
