package com.google.android.finsky.billing;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.m;
import com.google.android.finsky.billing.common.d;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dk.g;
import com.google.android.finsky.download.a;
import com.google.android.finsky.m;
import com.google.android.wallet.ui.common.a;
import java.io.File;

public final class com.google.android.finsky.billing.g extends com.google.android.finsky.billing.t
{

    g() {
        com.google.android.finsky.billing.t();
    }

    public static com.google.android.finsky.billing.g a(Fragment p0, String p1, long p2, com.google.android.finsky.d.w p4) {
        v0 = com.google.android.finsky.billing.g.a(p1, p4);
        v0.putLong("installationSize", p2);
        v1 = new com.google.android.finsky.billing.g();
        if (p0 == 0) {
            v1.f(v0);
            return v1;
        }
        if (p0 instanceof com.google.android.finsky.billing.u) {
            v1.a(p0, -1);
            v1.f(v0);
            return v1;
        }
        throw new IllegalArgumentException("targetFragment must implement PreAppDownloadWarnings.Listener");
    }

    final com.google.android.finsky.billing.u W() {
        if (this.r != 0)
            v0 = (com.google.android.finsky.billing.u)this.r;
        else
            v0 = (com.google.android.finsky.billing.u)this.h();
        return v0;
    }

    protected final int X() {
        return 6320;
    }

    public final Dialog a(Bundle p0) {
        v2 = this.q.getLong("installationSize");
        v1 = this.h();
        v0 = com.google.android.finsky.m.a.dj();
        if (v0.a(12633090))
            this.ah.a(new com.google.android.finsky.d.p().b(this));
        v8 = v0.a(12641184);
        v9 = new com.google.android.wallet.ui.common.a(v1, 0);
        v9.a(2131952064);
        v10 = LayoutInflater.from(v1).inflate(2130968797, 0);
        v0 = (TextView)v10.findViewById(2131755674);
        if (v2 > 0) {
            v2 = com.google.android.finsky.bg.m.a(v2, this.i());
            if (v8 != 0) {
                v4 = new Object[1];
                v4[0] = v2;
                v1 = v1.getString(2131953351, v4);
            }
            else {
                v4 = new Object[2];
                v4[0] = v2;
                com.google.android.finsky.m.a.bD();
                v4[1] = com.google.android.finsky.bg.m.a(com.google.android.finsky.dk.g.a(new StatFs(Environment.getDataDirectory().getPath())), 0);
                v1 = v1.getString(2131953350, v4);
            }
            v0.setText(v1);
            v0.setVisibility(0);
        }
        if (((Boolean)com.google.android.finsky.billing.common.d.c.a()).booleanValue())
            v5 = ((Integer)com.google.android.finsky.billing.common.d.b.a()).intValue();
        else
            v5 = 0;
        v1 = com.google.android.finsky.m.a.bW().a();
        v2 = (RadioButton)v10.findViewById(2131755675);
        if (v1 != 0 || v8 != 0) {
            v2.setChecked(1);
            v2.setOnClickListener(new com.google.android.finsky.billing.h(this));
            v2.setVisibility(0);
        }
        if (v8 != 0)
            v10.findViewById(2131755678).setVisibility(0);
        com.google.android.finsky.m.a.bx();
        v10.findViewById(2131755677);
        v0 = (RadioButton)v10.findViewById(2131755610);
        v0.setOnClickListener(new com.google.android.finsky.billing.i(this));
        if (v1 == 0 && v8 == 0)
            v0.setChecked(1);
        v4 = (CheckBox)v10.findViewById(2131755679);
        if (v8 != 0) {
            if (!((Boolean)com.google.android.finsky.billing.common.d.c.a()).booleanValue())
                v0 = 1;
            else
                v0 = 0;
            v4.setChecked(v0);
        }
        else
            v4.setChecked(1);
        v0 = (TextView)v10.findViewById(2131755680);
        v0.setText(Html.fromHtml(this.c(2131952070)));
        v0.setOnClickListener(new com.google.android.finsky.billing.j(this));
        v9.a(v10).a(2131952600, new com.google.android.finsky.billing.k(this, v2, (RadioButton)v10.findViewById(2131755676), v4, v5));
        v0 = v9.a();
        if (v8 != 0)
            v0.setCanceledOnTouchOutside(0);
        return v0;
    }

    public final void onCancel(DialogInterface p0) {
        if (com.google.android.finsky.m.a.dj().a(12641184))
            this.W().a(1, 0);
        else
            this.W().V_();
        super.onCancel(p0);
    }

}
