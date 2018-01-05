package com.google.android.finsky.datasync.p180a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0659a;
import com.android.volley.C0684b;
import com.android.volley.C0690f;
import com.android.volley.C0700r;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.datasync.C2515v;
import com.google.android.finsky.datasync.C2531s;
import com.google.android.finsky.datasync.C2533w;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import com.google.android.play.image.bf;
import com.google.android.play.image.k;
import com.squareup.leakcanary.C7582R;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class C2512i extends C2503a {
    public final C2515v f13503g;
    public final C0700r f13504h;
    public final C0659a f13505i;

    C2512i(List list, List list2, long j, C2515v c2515v, C0700r c0700r, C0659a c0659a, C2531s c2531s, C1461c c1461c, ai aiVar) {
        super(list, list2, j, c2531s, c1461c, aiVar);
        this.f13503g = c2515v;
        this.f13504h = c0700r;
        this.f13505i = c0659a;
    }

    protected final void mo2923a(String str) {
        this.f13503g.mo2929a(str);
    }

    public final boolean mo2924a() {
        int intValue = ((Integer) C1189b.f7271g.m5760a()).intValue();
        return intValue == 3 || intValue == 4;
    }

    public final boolean mo2925b() {
        int intValue = ((Integer) C1189b.f7268d.m5760a()).intValue();
        return (intValue == 3 || intValue == 4) && ((Integer) C1189b.f7271g.m5760a()).intValue() == 1;
    }

    public final void mo2926c() {
        Exception e;
        m13413f();
        while (m13412e() && !m13411d()) {
            List a = this.f13503g.mo2928a(1);
            if (a.isEmpty()) {
                break;
            }
            if (((Integer) C1189b.f7271g.m5760a()).intValue() == 3) {
                this.d.m13481a(this.b, 1616);
                C1189b.f7271g.m5763a(Integer.valueOf(4));
            }
            String str = ((C2533w) a.get(0)).f13577b;
            String str2 = ((C2533w) a.get(0)).f13576a.f12151c;
            String str3 = "[Cache and Sync] Processing image dequeue for url: ";
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                valueOf = str3.concat(valueOf);
            } else {
                valueOf = new String(str3);
            }
            FinskyLog.m21662b(valueOf, new Object[0]);
            try {
                C2531s c2531s = this.d;
                if (C2531s.f13563j == null) {
                    C2531s.f13563j = Integer.valueOf((int) (((float) ((int) c2531s.f13565b.getResources().getDimension(C7582R.dimen.cache_and_sync_thumbnail_size))) * bf.a()));
                }
                int intValue = C2531s.f13563j.intValue();
                str3 = bf.a(str2, intValue, 0, 1);
                C0657w agVar = new ag();
                C0656n kVar = new k(str3, intValue, Config.RGB_565, agVar, agVar);
                kVar.f4038m = new C0690f(1000, 2, 2.0f);
                kVar.f4034i = false;
                this.f13504h.m4510a(kVar);
                Bitmap bitmap = (Bitmap) agVar.get();
                if (bitmap == null) {
                    this.f13503g.mo2934c(str2, str);
                    return;
                }
                long a2 = C4678i.m21812a();
                long longValue = ((Long) C0955b.dI.m28964b()).longValue() + a2;
                a2 += ((Long) C0955b.dH.m28964b()).longValue();
                C0684b c0684b = new C0684b();
                OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
                c0684b.f4131a = byteArrayOutputStream.toByteArray();
                c0684b.f4135e = longValue;
                c0684b.f4136f = a2;
                this.f13505i.mo1066a(str2, c0684b);
                this.f13503g.mo2931a(str2, str, false);
                str3 = "[Cache and Sync] Successfully dequeued and processed image url: ";
                valueOf = String.valueOf(str2);
                FinskyLog.m21662b(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            } catch (InterruptedException e2) {
                e = e2;
                if ((e.getCause() instanceof ServerError) || (e.getCause() instanceof ParseError)) {
                    this.f13503g.mo2934c(str2, str);
                }
                str3 = "[Cache and Sync] Dequeue failed for image url: ";
                valueOf = String.valueOf(str2);
                if (valueOf.length() == 0) {
                    valueOf = str3.concat(valueOf);
                } else {
                    valueOf = new String(str3);
                }
                FinskyLog.m21665c(valueOf, new Object[0]);
            } catch (ExecutionException e3) {
                e = e3;
                this.f13503g.mo2934c(str2, str);
                str3 = "[Cache and Sync] Dequeue failed for image url: ";
                valueOf = String.valueOf(str2);
                if (valueOf.length() == 0) {
                    valueOf = new String(str3);
                } else {
                    valueOf = str3.concat(valueOf);
                }
                FinskyLog.m21665c(valueOf, new Object[0]);
            }
        }
        if (!this.f13503g.mo2933b() && ((Integer) C1189b.f7270f.m5760a()).intValue() == 1) {
            C1189b.f7271g.m5763a(Integer.valueOf(1));
            this.d.m13481a(this.b, 1618);
        }
    }
}
