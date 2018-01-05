package com.google.android.finsky.billing;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.a.a.f;
import android.support.v4.app.Fragment;
import android.support.v4.widget.bg;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.caverock.androidsvg.as;
import com.caverock.androidsvg.q;
import com.google.android.wallet.ui.common.a;

public final class com.google.android.finsky.billing.l extends com.google.android.finsky.billing.t
{

    l() {
        com.google.android.finsky.billing.t();
    }

    final com.google.android.finsky.billing.u W() {
        if (this.r != 0)
            v0 = (com.google.android.finsky.billing.u)this.r;
        else
            v0 = (com.google.android.finsky.billing.u)this.h();
        return v0;
    }

    protected final int X() {
        return 6321;
    }

    public final Dialog a(Bundle p0) {
        v0 = this.h();
        v2 = new com.google.android.wallet.ui.common.a(v0, 0);
        v3 = LayoutInflater.from(v0).inflate(2130968796, 0);
        v1 = (TextView)v3.findViewById(2131755672);
        v1.setOnClickListener(new com.google.android.finsky.billing.m((TextView)v3.findViewById(2131755673)));
        android.support.v4.widget.bg.a(v1, 0, 0, com.caverock.androidsvg.q.a(this.i(), 2131361830, new com.caverock.androidsvg.as().b(android.support.v4.a.a.f.b(this.i(), 2131558474, this.g().getTheme()))), 0);
        v2.a(v3).a(2131952601, new com.google.android.finsky.billing.o(this)).b(2131953125, new com.google.android.finsky.billing.n(this));
        return v2.a();
    }

    public final void onCancel(DialogInterface p0) {
        this.W().W_();
        super.onCancel(p0);
    }

}
