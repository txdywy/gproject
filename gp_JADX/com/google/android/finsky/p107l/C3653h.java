package com.google.android.finsky.p107l;

import android.accounts.Account;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import java.util.List;

final /* synthetic */ class C3653h implements C0657w {
    public final C3648c f18056a;
    public final int[] f18057b;
    public final List f18058c;
    public final int[] f18059d;
    public final Account f18060e;

    C3653h(C3648c c3648c, int[] iArr, List list, int[] iArr2, Account account) {
        this.f18056a = c3648c;
        this.f18057b = iArr;
        this.f18058c = list;
        this.f18059d = iArr2;
        this.f18060e = account;
    }

    public final void mo1062a(VolleyError volleyError) {
        C3648c c3648c = this.f18056a;
        int[] iArr = this.f18057b;
        List list = this.f18058c;
        int[] iArr2 = this.f18059d;
        Account account = this.f18060e;
        iArr[0] = iArr[0] + 1;
        c3648c.m17252a(list.size(), iArr[0], iArr2[0]);
        c3648c.m17253a(account, volleyError);
    }
}
