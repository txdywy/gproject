package com.google.android.finsky.billing.myaccount;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.SwitchCompat;
import android.support.v7.widget.em;
import android.text.Editable;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.android.volley.x;
import com.caverock.androidsvg.SVGImageView;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.aj;
import com.google.wireless.android.finsky.dfe.nano.az;
import com.google.wireless.android.finsky.dfe.nano.ba;
import com.google.wireless.android.finsky.dfe.nano.cl;
import com.google.wireless.android.finsky.dfe.nano.dl;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class com.google.android.finsky.billing.myaccount.an extends com.google.android.finsky.billing.myaccount.d
{

    public com.google.wireless.android.finsky.dfe.nano.cl c;
    public com.google.wireless.android.finsky.dfe.nano.cl d;
    public com.google.wireless.android.finsky.dfe.nano.cl e;
    public com.google.wireless.android.finsky.dfe.nano.az f;
    public com.google.android.finsky.dx.a g;
    public com.google.android.finsky.accounts.c h;
    public final Resources o;
    public final com.google.android.finsky.billing.myaccount.bb p;
    public final com.google.android.finsky.billing.myaccount.bf q;
    public final Handler r;

    an(Context p0, Bundle p1, com.google.android.finsky.d.ad p2, com.google.android.finsky.d.w p3, com.google.wireless.android.finsky.dfe.nano.ba p4, com.google.android.finsky.billing.myaccount.bb p5, com.google.android.finsky.billing.myaccount.bf p6) {
        com.google.android.finsky.billing.myaccount.d(p0, p1, p2, p3);
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
        this.o = p0.getResources();
        this.c = p4.a;
        this.d = p4.b;
        this.f = p4.c;
        this.p = p5;
        this.q = p6;
        this.r = new Handler();
        this.i.add(Integer.valueOf(0));
        this.i.add(Integer.valueOf(1));
        this.i.add(Integer.valueOf(2));
        this.i.add(Integer.valueOf(com.google.android.finsky.billing.myaccount.an.g(p1.getInt("EmailAdapter.mode"))));
    }

    static void a(com.google.android.finsky.billing.myaccount.an p0, String p1, Button p2, int p3, com.android.volley.x p4) {
        p0.a(p1, p2, p3, p4);
    }

    private final void a(String p0, Button p1, int p2, com.android.volley.x p3) {
        v0 = p1.getText().toString();
        p1.setText(this.o.getString(p2));
        p1.setEnabled(0);
        v1 = new com.google.android.finsky.billing.myaccount.aw(p1, v0, p3);
        v2 = new com.google.android.finsky.billing.myaccount.ax(p1, v0);
        v0 = new com.google.wireless.android.finsky.dfe.nano.cl();
        if (p0 == 0)
            throw new NullPointerException();
        v0.a = v0.a | 1;
        v0.b = p0;
        this.e = v0;
        this.p.a(v0, v1, v2);
    }

    static boolean a(String p0) {
        return Patterns.EMAIL_ADDRESS.matcher(p0).matches();
    }

    static void b(View p0) {
        ((InputMethodManager)p0.getContext().getSystemService("input_method")).hideSoftInputFromWindow(p0.getWindowToken(), 0);
    }

    private static int g(int p0) {
        if (p0 == 1)
            v0 = 4;
        else
            v0 = 3;
        return v0;
    }

    protected final void a(View p0, int p1, int p2) {
        v2 = 1;
        v4 = 8;
        switch (p1) {
            case 0:
                this.a(p0);
                break;
            case 1:
                v0 = (String)com.google.android.finsky.utils.aj.a(this.h.cZ());
                v1 = (SwitchCompat)p0.findViewById(2131755710);
                v4 = this.g.e(v0);
                if (v4 != 0 && v4.b != 0) {
                }
                else
                    v2 = 0;
                v1.setChecked(v2);
                v1.setOnCheckedChangeListener(new com.google.android.finsky.billing.myaccount.as(this, v0, v1, p0));
                break;
            case 2:
                break;
            case 3:
                v0 = (SVGImageView)p0.findViewById(2131755486);
                if (this.f.b != 0) {
                    v0.setVisibility(0);
                    v0.setOnClickListener(new com.google.android.finsky.billing.myaccount.ay(this));
                }
                else
                    v0.setVisibility(8);
                if (this.d != 0)
                    v0 = this.d;
                else
                    v0 = this.c;
                if (v0 == 0)
                    v1 = this.o.getString(2131951855);
                else
                    v1 = v0.b;
                ((TextView)p0.findViewById(2131755485)).setText(v1);
                v0 = (TextView)p0.findViewById(2131755484);
                if (this.d != 0 && this.c != 0) {
                    v0.setVisibility(0);
                    v8 = new Object[2];
                    v8[0] = this.c.b;
                    v8[1] = this.d.b;
                    com.google.android.finsky.bg.ae.a(v0, this.o.getString(2131951863, v8));
                }
                else
                    v0.setVisibility(8);
                if (this.d != 0)
                    v1 = 0;
                else
                    v1 = 8;
                ((TextView)p0.findViewById(2131755487)).setVisibility(v1);
                v0 = (Button)p0.findViewById(2131755488);
                if (this.d != 0) {
                    v0.setVisibility(0);
                    v0.setOnClickListener(new com.google.android.finsky.billing.myaccount.au(this, this.d, v0));
                }
                else
                    v0.setVisibility(8);
                if (this.d != 0) {
                }
                else
                    v4 = 4;
                p0.findViewById(2131755489).setVisibility(v4);
                com.google.android.finsky.bg.ae.a((TextView)p0.findViewById(2131755482), this.o.getString(2131951854));
                break;
            case 4:
                v0 = (EditText)p0.findViewById(2131755478);
                v1 = (Button)p0.findViewById(2131755480);
                v2 = this.b();
                if (v2 == 0)
                    v2 = 0;
                else
                    v2 = v2.b;
                v2 = this.k.getString("EmailAdapter.editEmailText", v2);
                this.k.putString("EmailAdapter.editEmailText", v2);
                if (v2 != 0)
                    v0.setText(v2);
                else
                    v0.getText().clear();
                v0.requestFocus();
                this.r.post(new com.google.android.finsky.billing.myaccount.az(v0));
                v0.addTextChangedListener(new com.google.android.finsky.billing.myaccount.ao(this, v1));
                ((Button)p0.findViewById(2131755481)).setOnClickListener(new com.google.android.finsky.billing.myaccount.ap(this));
                v1.setEnabled(com.google.android.finsky.billing.myaccount.an.a(v0.getText().toString()));
                v1.setOnClickListener(new com.google.android.finsky.billing.myaccount.aq(this, v0, v1, p0));
                break;
            default:
                throw new IllegalStateException(37 + "Unknown type for bindView " + p1);
        }
    }

    final com.google.wireless.android.finsky.dfe.nano.cl b() {
        if (this.d != 0)
            v0 = this.d;
        else
            v0 = this.c;
        return v0;
    }

    final int c() {
        if (((Integer)this.i.get(3)).intValue() == 4)
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    protected final int e(int p0) {
        switch (p0) {
            case 0:
                v0 = 2130968970;
                break;
            case 1:
                v0 = 2130968817;
                break;
            case 2:
                v0 = 2130968703;
                break;
            case 3:
                v0 = 2130968704;
                break;
            case 4:
                v0 = 2130968701;
                break;
            default:
                throw new IllegalStateException(49 + "Unknown type for getLayoutForViewType " + p0);
        }
        return v0;
    }

    final void f(int p0) {
        this.i.set(3, Integer.valueOf(com.google.android.finsky.billing.myaccount.an.g(p0)));
        this.k.putInt("EmailAdapter.mode", p0);
        this.c(3);
    }

}
