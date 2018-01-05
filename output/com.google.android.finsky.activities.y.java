package com.google.android.finsky.activities;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.wallet.ui.common.a;
import com.google.wireless.android.finsky.dfe.nano.br;

public final class com.google.android.finsky.activities.y implements com.android.volley.x
{

    public final com.google.android.finsky.activities.t a;

    y(com.google.android.finsky.activities.t p0) {
        this.a = p0;
    }

    public final void b_(Object p0) {
        v1 = ((com.google.wireless.android.finsky.dfe.nano.br)p0).b;
        v3 = LayoutInflater.from(this.a).inflate(2130968729, 0);
        if (TextUtils.isEmpty(v1))
            v1 = this.a.getString(2131952007);
        v5 = new Object[1];
        v5[0] = v1;
        ((TextView)v3.findViewById(2131755556)).setText(this.a.getString(2131952004, v5));
        v0 = (EditText)v3.findViewById(2131755566);
        v1 = new com.google.android.wallet.ui.common.a(this.a).a(this.a.getString(2131952009)).a(v3).a(this.a.getString(2131952688), new com.google.android.finsky.activities.ae(this.a, v0)).b(this.a.getString(2131951799), new com.google.android.finsky.activities.ad()).a();
        v1.setOnShowListener(new com.google.android.finsky.activities.af(this.a, v0));
        v1.show();
    }

}
