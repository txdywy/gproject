package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamic.C5164d;

public final class xy extends xx {
    public /* synthetic */ xw f27728a;
    public /* synthetic */ Activity f27729b;

    public xy(xw xwVar, Activity activity) {
        this.f27728a = xwVar;
        this.f27729b = activity;
        super(xwVar);
    }

    public final /* synthetic */ Object mo4949a() {
        zf a = this.f27728a.f27726c.m26018a(this.f27729b);
        if (a != null) {
            return a;
        }
        Context context = this.f27729b;
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", "ad_overlay");
        al alVar = xz.m25997a().f27732c;
        al.m24181a(context, "gmob-apps", bundle);
        return null;
    }

    public final /* synthetic */ Object mo4950a(ye yeVar) {
        return yeVar.mo4951a(C5164d.m23906a(this.f27729b));
    }
}
