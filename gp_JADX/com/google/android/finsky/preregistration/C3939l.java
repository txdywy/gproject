package com.google.android.finsky.preregistration;

import android.accounts.Account;
import android.support.design.widget.C0138g;
import android.support.design.widget.Snackbar;
import android.text.TextUtils;
import android.view.View;
import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.a.a.g;
import com.squareup.leakcanary.C7582R;

final class C3939l implements C0660x {
    public final /* synthetic */ Account f19920a;
    public final /* synthetic */ String f19921b;
    public final /* synthetic */ boolean f19922c;
    public final /* synthetic */ View f19923d;
    public final /* synthetic */ C3934g f19924e;

    C3939l(C3934g c3934g, Account account, String str, boolean z, View view) {
        this.f19924e = c3934g;
        this.f19920a = account;
        this.f19921b = str;
        this.f19922c = z;
        this.f19923d = view;
    }

    public final /* synthetic */ void b_(Object obj) {
        g gVar = (g) obj;
        this.f19924e.m18628a(this.f19920a, this.f19921b, gVar.b);
        if (!TextUtils.isEmpty(gVar.c) && this.f19923d != null) {
            C3932e c3932e = this.f19924e.f19900e;
            C0138g a = Snackbar.m500a(this.f19923d, gVar.c, -2);
            a.m501a((int) C7582R.string.ok, new C3933f(a));
            a.m493a();
        }
    }
}
