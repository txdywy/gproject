package com.google.android.finsky.detailsmodules.modules.subscriptions;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2231n;
import com.google.android.finsky.utils.C4683n;
import com.squareup.leakcanary.C7582R;

public final class C2610a {
    public final C4683n f13866a;
    public final Context f13867b;
    public final C2231n f13868c;
    public CharSequence f13869d;

    C2610a(Context context, C2231n c2231n, C4683n c4683n) {
        int i;
        this.f13867b = context;
        this.f13868c = c2231n;
        this.f13866a = c4683n;
        Resources resources = this.f13867b.getResources();
        String a = this.f13866a.m21826a(this.f13868c.f11108o);
        C2227g c2227g = this.f13868c;
        long currentTimeMillis = System.currentTimeMillis();
        if (!c2227g.f11131e) {
            i = 3;
        } else if (currentTimeMillis < c2227g.f11130d) {
            i = 1;
        } else if (currentTimeMillis < c2227g.f11108o) {
            i = 0;
        } else {
            i = 2;
        }
        switch (i) {
            case 0:
                this.f13869d = Html.fromHtml(resources.getString(C7582R.string.subscription_renews_on, new Object[]{a}));
                return;
            case 1:
                this.f13869d = Html.fromHtml(resources.getString(C7582R.string.subscription_charges_on, new Object[]{this.f13866a.m21826a(this.f13868c.f11130d)}));
                return;
            case 2:
                this.f13869d = null;
                return;
            default:
                this.f13869d = Html.fromHtml(resources.getString(C7582R.string.subscription_expires_on, new Object[]{a}));
                return;
        }
    }
}
