package com.google.android.finsky.billing.myaccount;

import android.widget.Button;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;

final class ax implements C0657w {
    public final /* synthetic */ Button f10231a;
    public final /* synthetic */ String f10232b;

    ax(Button button, String str) {
        this.f10231a = button;
        this.f10232b = str;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f10231a.setEnabled(true);
        this.f10231a.setText(this.f10232b);
    }
}
