package com.google.android.finsky.dfemodel;

import android.net.Uri;
import android.os.Handler;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.wireless.android.finsky.dfe.nano.cy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class C2713b {
    public static final boolean f14912b = ((Boolean) C0955b.f5901q.m28964b()).booleanValue();
    public List f14913a = new ArrayList();
    public C1254c f14914c;
    public C1287h f14915d;
    public final Handler f14916e;
    public final Runnable f14917f = new C2716e(this);

    public C2713b(Handler handler, C1254c c1254c, C1287h c1287h) {
        this.f14916e = handler;
        this.f14914c = c1254c;
        this.f14915d = c1287h;
    }

    public final void m14712a(String str, int i) {
        if (f14912b) {
            new Object[1][0] = str;
            cy cyVar = new cy();
            long currentTimeMillis = System.currentTimeMillis();
            cyVar.b |= 1;
            cyVar.c = currentTimeMillis;
            if (str == null) {
                throw new NullPointerException();
            }
            cyVar.b |= 2;
            cyVar.d = str;
            if (i != 0) {
                cyVar.h = i;
                cyVar.b |= 32;
            }
            this.f14913a.add(cyVar);
            m14710a();
        }
    }

    public final void m14713b(String str, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("deepLink").append("?url=").append(Uri.encode(str)).append("&action=").append(Uri.encode("android.intent.action.VIEW"));
        m14712a(stringBuilder.toString(), i);
    }

    public final void m14711a(String str) {
        String valueOf = String.valueOf("confirmFreeDownload?doc=");
        String valueOf2 = String.valueOf(str);
        m14712a(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), 0);
    }

    public final void m14710a() {
        this.f14916e.removeCallbacks(this.f14917f);
        this.f14916e.post(this.f14917f);
    }

    static {
        TimeUnit.MILLISECONDS.convert((long) ((Integer) C0955b.f5902r.m28964b()).intValue(), TimeUnit.SECONDS);
        ((Integer) C0955b.f5903s.m28964b()).intValue();
    }
}
