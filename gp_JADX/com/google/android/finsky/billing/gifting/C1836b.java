package com.google.android.finsky.billing.gifting;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.cv.p177a.jl;
import com.google.android.finsky.cv.p177a.jm;
import com.google.android.finsky.cv.p177a.jn;
import com.google.android.finsky.cv.p177a.jo;
import com.google.android.finsky.cv.p177a.jp;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;

public final class C1836b extends C1089s implements C0657w, C0660x {
    public C1287h f9444a;
    public String ah;
    public boolean ai;
    public String aj;
    public VolleyError ak;
    public C2471a f9445b;
    public C1254c f9446c;
    public C2495w f9447d;
    public jm f9448e;
    public jp f9449f;
    public boolean f9450g;

    public static C1836b m9880a(jl jlVar, String str, C2495w c2495w) {
        if (jlVar.f12792a == null) {
            throw new IllegalArgumentException("Missing SendGiftIntent");
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putParcelable("GiftingSidecar.action", ParcelableProto.m21671a((C0757i) jlVar));
        c2495w.m13380b(str).m13377a(bundle);
        Fragment c1836b = new C1836b();
        c1836b.m600f(bundle);
        return c1836b;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        ((C1353a) C3947d.m18649a(C1353a.class)).mo1738a(this);
        Bundle bundle2 = this.f760q;
        this.f9446c = this.f9444a.mo2016a(bundle2.getString("authAccount"));
        jl jlVar = (jl) ParcelableProto.m21673a(bundle2, "GiftingSidecar.action");
        this.f9448e = jlVar.f12792a;
        this.f9449f = jlVar.f12793b;
        if (bundle != null) {
            this.f9447d = this.f9445b.m13179a(bundle);
        } else {
            this.f9447d = this.f9445b.m13179a(bundle2);
        }
    }

    public final void g_() {
        super.g_();
        if (this.f6948l == 0) {
            if (TextUtils.isEmpty(this.f9448e.f12796c)) {
                this.ai = true;
            } else {
                this.aj = this.f9448e.f12796c;
            }
            if (this.f9449f != null) {
                this.f9450g = true;
            }
            m9879X();
            if (this.ai) {
                this.f9447d.m13367a(new C2474c(1203));
                jn jnVar = new jn();
                String str = this.f9448e.f12797d;
                if (str == null) {
                    throw new NullPointerException();
                }
                jnVar.f12798a |= 1;
                jnVar.f12799b = str;
                this.f9446c.mo1609a(jnVar, (C0660x) this, (C0657w) this);
            }
        }
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putString("GiftingSidecar.customMessage", this.ah);
        bundle.putString("GiftingSidecar.shareText", this.aj);
        bundle.putBoolean("GiftingSidecar.needsCustomMessage", this.f9450g);
        bundle.putBoolean("GiftingSidecar.needsRedeemUrl", this.ai);
        this.f9447d.m13377a(bundle);
    }

    protected final void mo2462a(Bundle bundle) {
        super.mo2462a(bundle);
        this.ah = bundle.getString("GiftingSidecar.customMessage");
        this.aj = bundle.getString("GiftingSidecar.shareText");
        this.f9450g = bundle.getBoolean("GiftingSidecar.needsCustomMessage");
        this.ai = bundle.getBoolean("GiftingSidecar.needsRedeemUrl");
        this.f9447d = this.f9445b.m13179a(bundle);
    }

    public final void m9884a(String str) {
        this.ah = str;
        this.f9450g = false;
        m9879X();
    }

    public final Intent mo968W() {
        if (this.ai || this.f9450g) {
            throw new IllegalStateException("Missing data to process request");
        }
        String str = this.aj;
        if (!TextUtils.isEmpty(this.ah)) {
            String str2 = this.ah;
            str = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length()).append(str2).append("\n").append(str).toString();
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        return Intent.createChooser(intent, this.f9448e.f12795b);
    }

    public final String m9885b(Context context) {
        if (this.ak != null) {
            return C1290m.m7702a(context, this.ak);
        }
        throw new IllegalStateException("Called getErrorMessage when no error is reported");
    }

    public final String m9887c(Context context) {
        if (this.ak != null) {
            return C1290m.m7703b(context, this.ak);
        }
        throw new IllegalStateException("Called getErrorTitle when no error is reported");
    }

    private final void m9879X() {
        int i;
        int i2 = 1;
        if (!this.f9450g && !this.ai) {
            i2 = 2;
        } else if (this.f9450g) {
            i = 1;
            m6758b(i, i2);
        }
        i = i2;
        i2 = 0;
        m6758b(i, i2);
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f9447d.m13367a(new C2474c(1204).m13238a((Throwable) volleyError));
        this.ak = volleyError;
        m6758b(3, 0);
    }

    public final /* synthetic */ void b_(Object obj) {
        jo joVar = (jo) obj;
        this.f9447d.m13367a(new C2474c(1204));
        this.aj = joVar.f12801b;
        this.ai = false;
        m9879X();
    }
}
