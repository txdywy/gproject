package com.google.android.finsky.preregistration;

import android.accounts.Account;
import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.nano.dp;

final class C3940m implements C0660x {
    public final /* synthetic */ Account f19925a;
    public final /* synthetic */ String f19926b;
    public final /* synthetic */ boolean f19927c;
    public final /* synthetic */ C3934g f19928d;

    C3940m(C3934g c3934g, Account account, String str, boolean z) {
        this.f19928d = c3934g;
        this.f19925a = account;
        this.f19926b = str;
        this.f19927c = z;
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f19928d.m18628a(this.f19925a, this.f19926b, ((dp) obj).a);
    }
}
