package com.google.android.finsky.boothandler;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.hygiene.C3178v;
import com.google.android.finsky.p109w.C0989a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.ak;
import com.google.android.finsky.volley.C4774e;

public class BootCompletedReceiver extends C0989a {
    public C0988c f10901a;
    public C1461c f10902b;
    public C3178v f10903c;
    public ak f10904d;
    public C4774e f10905e;

    public final void mo1179a() {
        ((C1360b) C3947d.m18649a(C1360b.class)).mo1776a(this);
    }

    public final void mo1180a(Context context, Intent intent) {
        if (!this.f10902b.dj().mo2294a(12634957)) {
            this.f10904d.m18811a();
        }
        Account cY = this.f10901a.cY();
        if (cY == null) {
            if (((Boolean) C0955b.aA.m28964b()).booleanValue()) {
                m11222b();
            }
        } else if (!this.f10902b.mo2249j(cY.name).mo2294a(12629845) || ((Boolean) C0955b.io.m28964b()).booleanValue()) {
            m11222b();
        } else {
            this.f10903c.mo3366d();
        }
    }

    private final void m11222b() {
        this.f10905e.mo4380a(new C2154a(this), "device_rebooted");
    }
}
