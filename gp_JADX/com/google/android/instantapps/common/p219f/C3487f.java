package com.google.android.instantapps.common.p219f;

import android.content.Context;
import android.support.v7.widget.fr;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.squareup.leakcanary.C7582R;

public class C3487f extends C3472a {
    public final Context f17688c;
    public final int f17689d = C7582R.layout.instant_apps_settings_header;
    public final int f17690e;
    public final C3489g f17691f;

    public C3487f(Context context, int i, C3489g c3489g) {
        this.f17688c = context;
        this.f17690e = i;
        this.f17691f = c3489g;
    }

    public final int mo1040a(int i) {
        if (this.f17690e == 0) {
            return this.f17689d;
        }
        return this.f17690e;
    }

    public final int mo1039a() {
        return 1;
    }

    public final /* synthetic */ void mo3535a(C3474b c3474b, int i) {
        C5769h c5769h = (C5769h) c3474b;
        if (this.f17691f != null) {
            this.f17691f.mo3536a(c5769h.a);
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        return new C5769h(LayoutInflater.from(this.f17688c).inflate(this.f17689d, viewGroup, false));
    }
}
