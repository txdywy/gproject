package com.google.android.finsky.p107l;

import android.accounts.Account;
import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0957n;
import java.util.List;

final /* synthetic */ class C3652g implements C0660x {
    public final C3648c f18047a;
    public final C0957n f18048b;
    public final int f18049c;
    public final C0957n f18050d;
    public final int f18051e;
    public final int[] f18052f;
    public final int[] f18053g;
    public final List f18054h;
    public final Account f18055i;

    C3652g(C3648c c3648c, C0957n c0957n, int i, C0957n c0957n2, int i2, int[] iArr, int[] iArr2, List list, Account account) {
        this.f18047a = c3648c;
        this.f18048b = c0957n;
        this.f18049c = i;
        this.f18050d = c0957n2;
        this.f18051e = i2;
        this.f18052f = iArr;
        this.f18053g = iArr2;
        this.f18054h = list;
        this.f18055i = account;
    }

    public final void b_(Object obj) {
        C3648c c3648c = this.f18047a;
        C0957n c0957n = this.f18048b;
        int i = this.f18049c;
        C0957n c0957n2 = this.f18050d;
        int i2 = this.f18051e;
        int[] iArr = this.f18052f;
        int[] iArr2 = this.f18053g;
        List list = this.f18054h;
        Account account = this.f18055i;
        c0957n.m5763a(Integer.valueOf(i));
        c0957n2.m5763a(Integer.valueOf(i2));
        iArr[0] = iArr[0] + 1;
        iArr2[0] = iArr2[0] + 1;
        c3648c.m17252a(list.size(), iArr[0], iArr2[0]);
        c3648c.m17253a(account, null);
    }
}
