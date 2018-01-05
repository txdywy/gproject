package com.google.android.finsky.actionbuttons;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public abstract class C0996o implements C0995a {
    public final Context f6011a;
    public final int f6012b;
    public final C2495w f6013c;
    public final ad f6014d;
    public ad f6015e;

    public C0996o(Context context, int i, C2495w c2495w, ad adVar) {
        this.f6011a = context;
        this.f6012b = i;
        this.f6013c = c2495w;
        this.f6014d = adVar;
    }

    public PlayActionButtonV2 mo1199a(ViewGroup viewGroup) {
        if (this.f6012b == 3) {
            return (PlayActionButtonV2) LayoutInflater.from(this.f6011a).inflate(C7582R.layout.play_action_button_transparent, viewGroup, false);
        }
        return (PlayActionButtonV2) LayoutInflater.from(this.f6011a).inflate(C7582R.layout.play_action_button, viewGroup, false);
    }

    protected final void m5893b() {
        int a = mo1200a();
        if (a == 0) {
            FinskyLog.m21669e("Invalid logging element type.", new Object[0]);
            return;
        }
        if (this.f6015e == null) {
            this.f6015e = new C2473o(a, this.f6014d);
        }
        this.f6014d.mo1219a(this.f6015e);
    }

    protected final void m5894c() {
        int a = mo1200a();
        if (a == 0) {
            FinskyLog.m21669e("Invalid logging element type.", new Object[0]);
            return;
        }
        if (this.f6015e == null) {
            this.f6015e = new C2473o(a, this.f6014d);
        }
        this.f6013c.m13379b(new C2475d(this.f6015e));
    }
}
