package com.google.android.finsky.installapi.p206a;

import android.accounts.Account;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dv.C2903e;
import com.google.android.finsky.dv.C2906h;
import com.google.android.finsky.installapi.C3272g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

final class C3261f implements Runnable {
    public final /* synthetic */ C3272g f16805a;
    public final /* synthetic */ C3260e f16806b;

    C3261f(C3260e c3260e, C3272g c3272g) {
        this.f16806b = c3260e;
        this.f16805a = c3272g;
    }

    public final void run() {
        C3260e c3260e = this.f16806b;
        C3272g c3272g = this.f16805a;
        Map hashMap = new HashMap();
        for (Account account : c3260e.f16802f.mo1188d()) {
            hashMap.put(account.name, new HashSet(Arrays.asList(new String[]{c3260e.f16803g})));
        }
        C2906h bA = C1473m.f7980a.bA();
        C2903e c2903e = new C2903e();
        c2903e.f15441e = new HashSet(Arrays.asList(new String[]{c3260e.f16803g}));
        C2335k a = bA.m15161a(c2903e);
        a.m11918a(new C3262g(c3260e, a, c3272g));
        a.m11917a(new C3264i());
        a.m15156a(c3260e.f16801e, hashMap);
        a.m15157a(hashMap);
    }
}
