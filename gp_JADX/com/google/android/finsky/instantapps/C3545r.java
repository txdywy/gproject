package com.google.android.finsky.instantapps;

import android.accounts.Account;
import android.support.v7.widget.em;
import com.google.android.gms.instantapps.C5265d;
import com.google.android.gms.instantapps.internal.OptInInfo;

final class C3545r implements Runnable {
    public final /* synthetic */ C5265d f17804a;
    public final /* synthetic */ C3544q f17805b;

    C3545r(C3544q c3544q, C5265d c5265d) {
        this.f17805b = c3544q;
        this.f17804a = c5265d;
    }

    public final void run() {
        SettingsActivity settingsActivity = this.f17805b.f17803a;
        OptInInfo a = this.f17804a.mo4691a();
        em emVar = settingsActivity.f17325C;
        Account[] accountArr = a.f26427c;
        emVar.f17665d.clear();
        if (accountArr != null) {
            for (Account account : accountArr) {
                emVar.f17665d.add(account.name);
            }
        }
        emVar.f3433a.m3638b();
        if (a.f26425a == 1) {
            settingsActivity.f17328F = a.f26426b;
            settingsActivity.f17325C.m17042a(settingsActivity.f17328F);
            if (settingsActivity.f17330H) {
                settingsActivity.m16871k();
                return;
            }
            return;
        }
        settingsActivity.f17325C.f3433a.m3638b();
    }
}
