package com.google.android.finsky.billing;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.u;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.lightpurchase.d.g;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.d.t;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.UrlSpanUtils;
import com.google.wireless.android.finsky.dfe.nano.c;
import com.google.wireless.android.finsky.dfe.nano.d;
import com.google.wireless.android.finsky.dfe.nano.e;
import com.google.wireless.android.finsky.dfe.nano.g;
import com.google.wireless.android.finsky.dfe.nano.k;
import com.google.wireless.android.finsky.dfe.nano.l;
import com.google.wireless.android.finsky.dfe.nano.o;
import com.google.wireless.android.finsky.dfe.nano.q;
import com.google.wireless.android.finsky.dfe.nano.r;

public final class com.google.android.finsky.billing.w extends com.google.android.finsky.billing.lightpurchase.d.h implements com.google.android.play.utils.m
{

    public final Runnable a;
    public TextView af;
    public int ag;
    public boolean ah;
    public final Handler b;
    public final com.google.android.finsky.d.t c;
    public String d;
    public String e;
    public String f;
    public com.google.wireless.android.finsky.dfe.nano.l g;
    public View h;
    public TextView i;

    w() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.a = new com.google.android.finsky.billing.x(this);
        this.b = new Handler();
        this.c = com.google.android.finsky.m.a.aP();
        this.ag = -1;
    }

    public static int a(com.google.wireless.android.finsky.dfe.nano.k p0) {
        if (p0.c != 0 || p0.d != 0)
            v0 = 2130969094;
        else if (p0.f != 0)
            v0 = 2130968699;
        else if (p0.e != 0)
            v0 = 2130969460;
        else if (p0.i != 0)
            v0 = 2130969149;
        else if (p0.h != 0)
            v0 = 2130969469;
        else
            v0 = 0;
        return v0;
    }

    public static Bundle a(com.google.wireless.android.finsky.dfe.nano.k p0, int p1) {
        if (p1 == 0)
            throw new IllegalArgumentException("Cannot create a SuccessStep with layoutId of 0.");
        v0 = new Bundle();
        v0.putParcelable("SuccessStep.post_acquisition_prompt", ParcelableProto.a(p0));
        v0.putInt("SuccessStep.layout_id", p1);
        return v0;
    }

    private final void a(com.google.android.finsky.cv.a.bd p0, int p1) {
        v0 = (FifeImageView)this.h.findViewById(p1);
        if (p0 != 0) {
            com.google.android.finsky.m.a.ar().a(v0, p0.f, p0.i);
            v0.setVisibility(0);
        }
    }

    private final void a(String p0, int p1) {
        com.google.android.finsky.bg.ae.a((TextView)this.h.findViewById(p1), p0);
    }

    public abstract void Y();

    public View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        super.a(p0, p1, p2);
        v0 = (com.google.wireless.android.finsky.dfe.nano.k)ParcelableProto.a(this.q, "SuccessStep.post_acquisition_prompt");
        this.h = p0.inflate(this.q.getInt("SuccessStep.layout_id"), p1, 0);
        if (v0.c != 0) {
            if (TextUtils.isEmpty(v0.c.b))
                throw new IllegalArgumentException("Auto-dismiss template must have a message.");
            if (v0.c.c <= 0) {
                v1 = new Object[1];
                v1[0] = Integer.valueOf(v0.c.c);
                throw new IllegalArgumentException(String.format("Invalid dismiss ms for auto-dismiss template: %d", v1));
            }
            this.i = (TextView)this.h.findViewById(2131755334);
            this.a(v0.c.b, 2131755334);
            this.d = Html.fromHtml(v0.c.b).toString();
            this.ag = v0.c.c;
        }
        else if (v0.d != 0) {
            if (TextUtils.isEmpty(v0.d.b))
                throw new IllegalArgumentException("Simple message template must have a message.");
            if (TextUtils.isEmpty(v0.d.c))
                throw new IllegalArgumentException("Simple message template must have a button label.");
            this.i = (TextView)this.h.findViewById(2131755334);
            this.a(v0.d.b, 2131755334);
            this.d = Html.fromHtml(v0.d.b).toString();
            this.e = v0.d.c;
        }
        else if (v0.e != 0) {
            if (TextUtils.isEmpty(v0.e.b))
                throw new IllegalArgumentException("Titled template must have a title.");
            if (TextUtils.isEmpty(v0.e.c))
                throw new IllegalArgumentException("Titled template must have a message.");
            if (TextUtils.isEmpty(v0.e.e))
                throw new IllegalArgumentException("Titled template must have a button label.");
            this.i = (TextView)this.h.findViewById(2131755114);
            this.i.setText(v0.e.b);
            this.af = (TextView)this.h.findViewById(2131755334);
            this.a(v0.e.c, 2131755334);
            this.d = v0.e.b;
            this.e = v0.e.e;
        }
        else if (v0.f != 0) {
            if (TextUtils.isEmpty(v0.f.b))
                throw new IllegalArgumentException("Complex template must have a title.");
            if (TextUtils.isEmpty(v0.f.g))
                throw new IllegalArgumentException("Complex template must have a button label.");
            this.i = (TextView)this.h.findViewById(2131755114);
            this.i.setText(v0.f.b);
            if (!TextUtils.isEmpty(v0.f.c))
                ((TextView)this.h.findViewById(2131755475)).setText(v0.f.c);
            this.a(v0.f.d, 2131755334);
            if (v0.f.e != 0)
                this.h.findViewById(2131755474).setVisibility(0);
            this.a(v0.f.f, 2131755472);
            this.d = v0.f.b;
            this.e = v0.f.g;
        }
        else if (v0.i != 0) {
            v3 = v0.i;
            if (TextUtils.isEmpty(v3.b))
                throw new IllegalArgumentException("One icon message template must have one title.");
            if (TextUtils.isEmpty(v3.c))
                throw new IllegalArgumentException("One icon message template must have one subtitle.");
            if (v3.d == 0)
                throw new IllegalArgumentException("One icon message template must have one icon message.");
            if (TextUtils.isEmpty(v3.h))
                throw new IllegalArgumentException("One icon message template must have a button label.");
            ((TextView)this.h.findViewById(2131755114)).setText(v3.b);
            ((TextView)this.h.findViewById(2131755307)).setText(v3.c);
            this.a(v3.d.d, 2131755334);
            this.a(v3.d.b, 2131755231);
            v4 = this.h.findViewById(2131756321);
            if (!TextUtils.isEmpty(v3.f)) {
                this.a(v3.f, 2131756321);
                v4.setVisibility(0);
            }
            if (v3.a & 16)
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0)
                v4.setContentDescription(v3.g);
            this.d = v3.k;
            this.e = v3.h;
            this.f = v3.i;
            this.g = v3.j;
        }
        else if (v0.h != 0)
            this.a(v0.h);
        this.aa().an();
        return this.h;
    }

    public String a(Resources p0) {
        return this.e;
    }

    public final void a(View p0, String p1) {
        v0 = p0.getContext();
        v1 = new Intent("android.intent.action.VIEW").addCategory("android.intent.category.DEFAULT").setPackage(v0.getPackageName()).setData(Uri.parse(p1));
        if (v0.getPackageManager().resolveActivity(v1, 65536) == 0)
            v1.setPackage(0);
        this.a(v1);
        this.aa().h().finish();
    }

    public void a(com.google.wireless.android.finsky.dfe.nano.r p0) {
        if (p0.b == 0)
            throw new IllegalArgumentException("Two icon messages template must have at least one message.");
        if (TextUtils.isEmpty(p0.e))
            throw new IllegalArgumentException("Two icon messages template must have a button label.");
        this.a(p0.b.d, 2131756827);
        this.a(p0.b.b, 2131756826);
        if (p0.c != 0) {
            this.a(p0.c.d, 2131756830);
            this.a(p0.c.b, 2131756829);
            this.h.findViewById(2131756828).setVisibility(0);
            UrlSpanUtils.a(((TextView)this.h.findViewById(2131756830)).getText(), 0, this);
        }
        if (!TextUtils.isEmpty(p0.d)) {
            this.a(p0.d, 2131756321);
            this.h.findViewById(2131756321).setVisibility(0);
        }
        this.d = Html.fromHtml(p0.b.d).toString();
        this.e = p0.e;
        this.f = p0.f;
        this.g = p0.g;
    }

    public final String b(Resources p0) {
        return this.f;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        if (p0 != 0)
            this.ah = p0.getBoolean("SuccessStep.stepFragmentReadyLogged");
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putBoolean("SuccessStep.stepFragmentReadyLogged", this.ah);
    }

    public final void g_() {
        super.g_();
        if (this.ag > 0)
            this.b.postDelayed(this.a, (long)this.ag);
    }

    public final void u() {
        super.u();
        if (this.d == 0)
            throw new IllegalArgumentException("No text was specified for a11y announcements. Have you called SuccessStep.getLayoutResId()?");
        com.google.android.finsky.bg.a.a(this.h.getContext(), this.d, this.h, 0);
        if (this.ah == 0) {
            this.c.c(this.aa().am(), "purchase_fragment_success");
            this.ah = 1;
        }
    }

    public final void w() {
        this.b.removeCallbacks(this.a);
        super.w();
    }

}
