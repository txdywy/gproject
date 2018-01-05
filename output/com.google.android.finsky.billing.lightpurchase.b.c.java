package com.google.android.finsky.billing.lightpurchase.b;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TextView$BufferType;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.cv.a.ac;
import com.google.android.finsky.m;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.a.a.am;
import com.google.wireless.android.finsky.dfe.h.a.a;
import com.google.wireless.android.finsky.dfe.h.a.b;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.billing.lightpurchase.b.c
{

    public final Context a;
    public final LayoutInflater b;
    public final com.google.wireless.android.finsky.dfe.h.a.a c;
    public final int d;
    public final int e;
    public final View f;
    public final View$OnClickListener g;
    public final com.google.android.finsky.bg.l h;
    public CheckBox i;
    public TextView j;
    public Spinner k;

    c(Context p0, com.google.wireless.android.finsky.dfe.h.a.a p1, int p2, int p3, View p4, View$OnClickListener p5) {
        this.a = p0;
        this.c = p1;
        this.d = p2;
        this.e = p3;
        this.f = p4;
        this.b = LayoutInflater.from(p0);
        this.g = p5;
        this.h = com.google.android.finsky.m.a.ar();
    }

    private final void b() {
        v0 = (TextView)this.f.findViewById(2131755862);
        this.k = (Spinner)this.f.findViewById(2131755863);
        if (this.c.j == 0 || this.c.j.length == 0) {
            v0.setVisibility(8);
            this.k.setVisibility(8);
        }
        else if (this.c.j.length > 1) {
            v4 = new ArrayList();
            v1 = 0;
            while (v1 < this.c.j.length) {
                v4.add(this.c.j[v1].d);
                v1 = v1 + 1;
            }
            v1 = new ArrayAdapter(this.a, 17367048, v4);
            v1.setDropDownViewResource(17367049);
            this.k.setAdapter(v1);
            this.k.setVisibility(0);
            v0.setVisibility(8);
        }
        else
            v0.setText(this.c.j[0].d);
    }

    public final void a() {
        v0 = (TextView)this.f.findViewById(2131755114);
        if (TextUtils.isEmpty(this.c.b))
            v0.setText(2131951716);
        else
            v0.setText(this.c.b);
        v0 = (TextView)this.f.findViewById(2131755850);
        if (TextUtils.isEmpty(this.c.f))
            v0.setVisibility(8);
        else
            v0.setText(this.c.f);
        v0 = (TextView)this.f.findViewById(2131755851);
        v0.setText(this.c.e);
        v0.setTextColor(com.google.android.finsky.bg.h.c(this.a, this.d));
        v0.setVisibility(0);
        if (!TextUtils.isEmpty(this.c.u)) {
            v0 = (TextView)this.f.findViewById(2131755852);
            v0.setText(this.c.u);
            v0.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.c.v)) {
            v0 = (TextView)this.f.findViewById(2131755853);
            v0.setText(this.c.v);
            v0.setVisibility(0);
        }
        this.h.a((FifeImageView)this.f.findViewById(2131755855), this.c.d, this.e);
        ((TextView)this.f.findViewById(2131755857)).setText(this.c.c);
        v0 = (ViewGroup)this.f.findViewById(2131755856);
        v2 = 0;
        while (v2 < this.c.h.length) {
            v1 = this.b.inflate(2130969077, v0, 0);
            ((TextView)v1).setText(this.c.h[v2]);
            v0.addView((TextView)v1);
            v2 = v2 + 1;
        }
        v0 = (ViewGroup)this.f.findViewById(2131755671);
        v5 = 0;
        while (v5 < this.c.i.length) {
            v2 = (ViewGroup)this.b.inflate(2130969062, v0, 0);
            v2.setContentDescription(this.c.i[v5].i);
            if (this.c.i[v5].e != 0 && this.c.i[v5].e.length > 0)
                v3 = this.c.i[v5].e[0];
            else
                v3 = 0;
            this.h.a((FifeImageView)v2.findViewById(2131755231), v3, -1);
            if (!TextUtils.isEmpty(this.c.i[v5].c)) {
                v1 = (TextView)v2.findViewById(2131755109);
                v1.setText(this.c.i[v5].c);
                v1.setVisibility(0);
            }
            v0.addView(v2);
            v5 = v5 + 1;
        }
        if (!TextUtils.isEmpty(this.c.q)) {
            this.j = (TextView)this.b.inflate(2130969080, v0, 0);
            this.j.setText(this.c.q);
            this.j.setOnClickListener(this.g);
            v2 = new SpannableStringBuilder();
            v2.append(this.j.getText());
            v2.setSpan(new URLSpan("#"), 0, v2.length(), 33);
            this.j.setText(v2, TextView$BufferType.SPANNABLE);
            v0.addView(this.j);
        }
        if (v0.getChildCount() == 0)
            v0.setVisibility(8);
        if (!TextUtils.isEmpty(this.c.n)) {
            this.f.findViewById(2131755858).setVisibility(0);
            this.h.a((FifeImageView)this.f.findViewById(2131755859), this.c.m, -1);
            com.google.android.finsky.bg.ae.a((TextView)this.f.findViewById(2131755860), this.c.n);
        }
        if (this.c.a & 32768)
            v0 = 1;
        else
            v0 = 0;
        if (v0 != 0) {
            v0 = (TextView)this.f.findViewById(2131755861);
            v0.setVisibility(0);
            v0.setText(this.c.w);
        }
        this.b();
        if (!TextUtils.isEmpty(this.c.t)) {
            v0 = (TextView)this.f.findViewById(2131755352);
            com.google.android.finsky.bg.ae.a(v0, this.c.t);
            v0.setVisibility(0);
            v0.requestFocus();
        }
        if (this.c.s != 0) {
            this.i = (CheckBox)this.f.findViewById(2131755865);
            this.i.setChecked(this.c.s.d);
            com.google.android.finsky.bg.ae.a(this.i, this.c.s.c);
            this.i.setVisibility(0);
        }
    }

}
