package com.google.android.finsky.p189e;

import android.accounts.Account;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.cs.C2376e;
import com.google.android.finsky.utils.FinskyLog;

final class C2958m {
    public static void m15349a(C2376e c2376e, C0986a c0986a) {
        Account b = c0986a.mo1196b();
        long a = c2376e.mo2875a("SaturnV", "delay_decompress_ms", b == null ? null : b.name);
        if (a > 0) {
            try {
                Thread.sleep(a);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                FinskyLog.m21665c("Wait (experiment delay) interrupted", new Object[0]);
            }
        }
    }
}
