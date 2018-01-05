package com.google.android.finsky.billing.lightpurchase.e;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.billing.legacyauth.AuthState;

public final class com.google.android.finsky.billing.lightpurchase.e.d implements com.google.android.play.utils.m
{

    public final com.google.android.finsky.billing.lightpurchase.e.b a;

    d(com.google.android.finsky.billing.lightpurchase.e.b p0) {
        this.a = p0;
    }

    public final void a(View p0, String p1) {
        this.a.a(756, 0);
        this.a.a(new Intent("android.intent.action.VIEW", Uri.parse(this.a.ao.a(this.a.an.name))));
    }

}
