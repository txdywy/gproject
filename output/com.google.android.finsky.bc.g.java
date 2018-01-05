package com.google.android.finsky.bc;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.google.android.finsky.api.c;
import com.google.android.finsky.bb.b;
import com.google.android.finsky.bb.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.providers.d;
import com.google.wireless.android.finsky.dfe.h.a.ak;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.bc.g extends com.google.android.finsky.bc.v
{

    public com.google.android.finsky.bb.b a;
    public com.google.android.finsky.d.g c;
    public RadioButton f;
    public int h;

    g() {
        com.google.android.finsky.bc.v();
        this.h = 0;
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v1 = super.a(p0, p1, p2);
        this.f = (RadioButton)v1.findViewById(2131755804);
        this.a(v1, 2131755802, 7);
        this.a(v1, 2131755803, 8);
        this.a(v1, 2131755804, 9);
        this.a(v1, 2131755805, 11);
        return v1;
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.bc.t)com.google.android.finsky.providers.d.a(com.google.android.finsky.bc.t)).a(this);
        super.a(p0);
    }

    protected final int aj() {
        return 2130968849;
    }

    public final boolean am() {
        return 0;
    }

    protected final void ao() {
        if (this.f.isChecked())
            v1 = 2;
        else
            v1 = 1;
        this.h = 0;
        v5 = new ArrayList(3);
        v0 = 0;
        while (v0 < 3) {
            v6 = (new int[3]{3, 4, 1})[v0];
            if (this.a.a(this.ag.a()).a(v6))
                v5.add(new com.google.wireless.android.finsky.dfe.h.a.ak().a(v6).a(1));
            v0 = v0 + 1;
        }
        this.bo.a((ak[])v5.toArray(new ak[v5.size()]), new com.google.android.finsky.bc.h(this, v1), this);
        if (this.f.isChecked())
            this.bo.a(0, 1, new com.google.android.finsky.bc.i(this, v1), new com.google.android.finsky.bc.j(this));
    }

    protected final int ap() {
        return 5229;
    }

    public final void d() {
        super.d();
        this.f = 0;
    }

}
