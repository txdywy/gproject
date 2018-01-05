package com.google.android.wallet.common.p374d;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.volley.n;
import com.android.volley.r;
import com.google.a.a.a.a.b.a.c.e;
import com.google.a.a.a.a.b.a.c.h;
import com.google.android.wallet.a.a;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.TimedEvent;
import com.google.android.wallet.common.p367c.C6573a;
import com.google.android.wallet.common.p367c.p368a.C6517c;
import com.google.android.wallet.common.p367c.p368a.C6568a;
import com.google.android.wallet.common.p367c.p368a.C6569b;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p372d.C6531c;
import com.google.p443h.p451c.p457c.p460b.p467d.C7178b;
import com.google.protobuf.nano.i;
import java.util.ArrayList;

public abstract class C6532b extends C6531c {
    public boolean f32599a = false;
    public ArrayList f32600b;
    public r f32601c;
    public C6568a f32602d;
    public UiConfig f32603e;
    public int f32604f = 1;
    public LogContext f32605g;
    public TimedEvent f32606h;

    public abstract void mo5505W();

    public static Bundle m29653a(Account account, C7178b c7178b, UiConfig uiConfig, LogContext logContext) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("account", account);
        bundle.putParcelable("androidConfig", ParcelableProto.m29885a((i) c7178b));
        bundle.putParcelable("uiConfig", uiConfig);
        bundle.putParcelable("logContext", logContext);
        return bundle;
    }

    public final void mo5507b(Bundle bundle) {
        Bundle bundle2 = this.q;
        Account account = (Account) bundle2.getParcelable("account");
        this.f32602d = C6568a.m29808a(h(), account, (C7178b) ParcelableProto.m29887a(bundle2, "androidConfig"));
        this.f32601c = C6573a.m29820a(h().getApplicationContext());
        this.f32603e = (UiConfig) bundle2.getParcelable("uiConfig");
        this.f32605g = (LogContext) this.q.getParcelable("logContext");
        super.mo5507b(bundle);
    }

    public void mo5508e(Bundle bundle) {
        super.mo5508e(bundle);
        bundle.putBoolean("attemptedToHandleAuth", this.f32599a);
        bundle.putInt("attempts", this.f32604f);
    }

    public void mo5506a(Bundle bundle) {
        this.f32599a = bundle.getBoolean("attemptedToHandleAuth");
        this.f32604f = bundle.getInt("attempts");
        super.mo5506a(bundle);
    }

    public final void m29658a(n nVar, boolean z) {
        mo5505W();
        if (z) {
            this.f32604f = 1;
        }
        int i = (this.f32598l == 1 && this.ak == 1) ? 1 : 0;
        if (i != 0) {
            if (this.f32600b == null) {
                this.f32600b = new ArrayList(2);
            }
            this.f32600b.add(nVar);
            return;
        }
        nVar.m = new C6569b(((Integer) a.j.a()).intValue(), this.f32602d);
        this.f32601c.a(nVar);
        m29649b(1, 0);
        if (nVar instanceof C6517c) {
            this.f32606h = C6537a.m29696b(this.f32605g, ((C6517c) nVar).mo5462b());
        }
    }

    public final void m29655a(int i, int i2, Intent intent) {
        if (i != 100) {
            super.a(i, i2, intent);
        } else if (i2 == -1) {
            this.f32599a = true;
            m29649b(1, 0);
            if (this.f32600b != null) {
                int size = this.f32600b.size();
                for (int i3 = 0; i3 < size; i3++) {
                    m29658a((n) this.f32600b.get(i3), true);
                }
                this.f32600b.clear();
            }
        } else {
            m29649b(3, 1);
        }
    }

    public boolean mo5541a(int i) {
        return false;
    }

    public final void m29659a(C6517c c6517c, e eVar, h hVar) {
        int i = 0;
        if (hVar == null) {
            m29656a(1, 0, eVar);
            m29649b(2, 0);
        } else {
            if (!TextUtils.isEmpty(hVar.e)) {
                Log.e("BaseOrchSidecar", hVar.e);
            }
            if (!TextUtils.isEmpty(hVar.a)) {
                m29656a(4, 23, eVar);
                m29649b(3, 5);
                i = 3;
            } else if (hVar.b != 1 || hVar.c.length <= 0) {
                throw new IllegalArgumentException("No error found in error response");
            } else {
                m29656a(4, 24, eVar);
                m29649b(3, 4);
                i = 2;
            }
        }
        C6567a.m29800a(c6517c.mo5464t(), i, null, c6517c.m29569a(), eVar.a, eVar.c);
    }

    final void m29656a(int i, int i2, e eVar) {
        C6537a.m29690a(this.f32605g, this.f32606h, i, i2, eVar);
        this.f32606h = null;
    }
}
