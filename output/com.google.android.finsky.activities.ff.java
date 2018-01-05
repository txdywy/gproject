package com.google.android.finsky.activities;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.h.h;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.layout.ak;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Arrays;
import java.util.HashMap;

public final class com.google.android.finsky.activities.ff extends com.google.android.finsky.layout.ak
{

    public final com.google.android.finsky.ba.e a;
    public final android.support.v4.h.h b;
    public final android.support.v4.h.h c;
    public final android.support.v4.h.h d;
    public Context e;
    public int f;
    public boolean[] g;
    public final Runnable h;

    ff() {
        com.google.android.finsky.layout.ak();
        this.a = com.google.android.finsky.m.a.dj();
        this.b = this.a.a();
        this.c = this.a.i();
        this.d = this.a.j();
        this.h = new com.google.android.finsky.activities.fg(this);
    }

    private final void a(boolean[] p0, String[] p1) {
        v0 = 0;
        if (p0.length != p1.length)
            FinskyLog.e("Bind failure: The number of Checkboxes does not agree with the number of available descriptions.", new Object[0]);
        else {
            this.f = p0.length;
            this.g = p0;
            this.n = p1;
            this.j.removeAllViews();
            while (v0 < this.f) {
                v1 = new CheckBox(this.e);
                v1.setText(this.n[v0]);
                v1.setChecked(this.g[v0]);
                this.j.addView(v1);
                v0 = v0 + 1;
            }
        }
    }

    public final void onAttach(Activity p0) {
        super.onAttach(p0);
        this.e = p0;
    }

    public final void onViewCreated(View p0, Bundle p1) {
        super.onViewCreated(p0, p1);
        this.getDialog().setTitle(2131951996);
        this.i.setHint(2131951994);
        v4 = this.b.a();
        v5 = new boolean[v4];
        v6 = new String[v4];
        v7 = new HashMap();
        v3 = 0;
        while (v3 < v4) {
            v6[v3] = (String)this.b.b(v3);
            v7.put(v6[v3], v6[v3].toLowerCase());
            v3 = v3 + 1;
        }
        Arrays.sort(v6, new com.google.android.finsky.activities.fh(v7));
        v3 = 0;
        while (v3 < v4) {
            v8 = this.b.a(this.b.a(v6[v3]));
            if (this.d != 0) {
                if (this.d.c(v8) >= 0)
                    v0 = 1;
                else
                    v0 = 0;
            }
            else if (this.c.c(v8) >= 0)
                v0 = 1;
            else
                v0 = 0;
            v5[v3] = v0;
            v3 = v3 + 1;
        }
        this.a(v5, v6);
        this.k.setOnClickListener(new com.google.android.finsky.activities.fi(this));
        this.l.setOnClickListener(new com.google.android.finsky.activities.fj(this));
        if (this.d != 0) {
            this.m.setOnClickListener(new com.google.android.finsky.activities.fk(this));
            this.m.setVisibility(0);
        }
        else
            this.m.setVisibility(8);
    }

}
