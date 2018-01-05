package com.google.android.finsky.billing.gifting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.api.m;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.cv.a.jl;
import com.google.android.finsky.cv.a.jm;
import com.google.android.finsky.cv.a.jn;
import com.google.android.finsky.cv.a.jo;
import com.google.android.finsky.cv.a.jp;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.ParcelableProto;

public final class com.google.android.finsky.billing.gifting.b extends com.google.android.finsky.billing.common.s implements com.android.volley.w, com.android.volley.x
{

    public com.google.android.finsky.api.h a;
    public String ah;
    public boolean ai;
    public String aj;
    public VolleyError ak;
    public com.google.android.finsky.d.a b;
    public com.google.android.finsky.api.c c;
    public com.google.android.finsky.d.w d;
    public com.google.android.finsky.cv.a.jm e;
    public com.google.android.finsky.cv.a.jp f;
    public boolean g;

    b() {
        com.google.android.finsky.billing.common.s();
    }

    private final void X() {
        v0 = 1;
        if (this.g == 0 && this.ai == 0) {
            v0 = 2;
            v1 = v0;
            v0 = 0;
        }
        else {
            if (this.g == 0) {
                v1 = v0;
                v0 = 0;
                this.b(v1, v0);
                return;
            }
            v1 = 1;
        }
        this.b(v1, v0);
    }

    public static com.google.android.finsky.billing.gifting.b a(com.google.android.finsky.cv.a.jl p0, String p1, com.google.android.finsky.d.w p2) {
        if (p0.a == 0)
            throw new IllegalArgumentException("Missing SendGiftIntent");
        v0 = new Bundle();
        v0.putString("authAccount", p1);
        v0.putParcelable("GiftingSidecar.action", ParcelableProto.a(p0));
        p2.b(p1).a(v0);
        v1 = new com.google.android.finsky.billing.gifting.b();
        v1.f(v0);
        return v1;
    }

    public final Intent W() {
        if (this.ai != 0 || this.g != 0)
            throw new IllegalStateException("Missing data to process request");
        v0 = this.aj;
        if (!TextUtils.isEmpty(this.ah))
            v0 = (String.valueOf(this.ah).length() + 1 + String.valueOf(v0).length()) + this.ah + "\n" + v0;
        v1 = new Intent("android.intent.action.SEND");
        v1.setType("text/plain");
        v1.putExtra("android.intent.extra.TEXT", v0);
        return Intent.createChooser(v1, this.e.b);
    }

    protected final void a(Bundle p0) {
        super.a(p0);
        this.ah = p0.getString("GiftingSidecar.customMessage");
        this.aj = p0.getString("GiftingSidecar.shareText");
        this.g = p0.getBoolean("GiftingSidecar.needsCustomMessage");
        this.ai = p0.getBoolean("GiftingSidecar.needsRedeemUrl");
        this.d = this.b.a(p0);
    }

    public final void a(VolleyError p0) {
        this.d.a(new com.google.android.finsky.d.c(1204).a(p0));
        this.ak = p0;
        this.b(3, 0);
    }

    public final void a(String p0) {
        this.ah = p0;
        this.g = 0;
        this.X();
    }

    public final String b(Context p0) {
        if (this.ak == 0)
            throw new IllegalStateException("Called getErrorMessage when no error is reported");
        return com.google.android.finsky.api.m.a(p0, this.ak);
    }

    public final void b(Bundle p0) {
        super.b(p0);
        ((com.google.android.finsky.billing.gifting.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.gifting.a)).a(this);
        this.c = this.a.a(this.q.getString("authAccount"));
        v0 = (com.google.android.finsky.cv.a.jl)ParcelableProto.a(this.q, "GiftingSidecar.action");
        this.e = v0.a;
        this.f = v0.b;
        if (p0 != 0)
            this.d = this.b.a(p0);
        else
            this.d = this.b.a(this.q);
    }

    public final void b_(Object p0) {
        this.d.a(new com.google.android.finsky.d.c(1204));
        this.aj = ((com.google.android.finsky.cv.a.jo)p0).b;
        this.ai = 0;
        this.X();
    }

    public final String c(Context p0) {
        if (this.ak == 0)
            throw new IllegalStateException("Called getErrorTitle when no error is reported");
        return com.google.android.finsky.api.m.b(p0, this.ak);
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putString("GiftingSidecar.customMessage", this.ah);
        p0.putString("GiftingSidecar.shareText", this.aj);
        p0.putBoolean("GiftingSidecar.needsCustomMessage", this.g);
        p0.putBoolean("GiftingSidecar.needsRedeemUrl", this.ai);
        this.d.a(p0);
    }

    public final void g_() {
        super.g_();
        if (this.l == 0) {
            if (TextUtils.isEmpty(this.e.c))
                this.ai = 1;
            else
                this.aj = this.e.c;
            if (this.f != 0)
                this.g = 1;
            this.X();
            if (this.ai != 0) {
                this.d.a(new com.google.android.finsky.d.c(1203));
                v0 = new com.google.android.finsky.cv.a.jn();
                if (this.e.d == 0)
                    throw new NullPointerException();
                v0.a = v0.a | 1;
                v0.b = this.e.d;
                this.c.a(v0, this, this);
            }
        }
    }

}
