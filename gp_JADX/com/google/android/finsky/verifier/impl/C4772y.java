package com.google.android.finsky.verifier.impl;

import android.content.Context;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4691w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import com.google.android.gms.safetynet.C5571a;
import com.google.android.gms.safetynet.C5581p;
import com.google.android.gms.safetynet.C5583r;
import com.google.android.gms.tasks.C5591h;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class C4772y extends C4740a {
    public final Context f24721a;
    public final int f24722b;
    public final List f24723c;
    public final C4748z f24724d;

    public C4772y(PackageVerificationService packageVerificationService) {
        this(packageVerificationService, 0, null, null);
    }

    public C4772y(Context context, byte[] bArr, C4748z c4748z) {
        this(context, 1, Collections.singletonList(bArr), c4748z);
    }

    public C4772y(Context context, List list, C4748z c4748z) {
        this(context, 1, list, c4748z);
    }

    private C4772y(Context context, int i, List list, C4748z c4748z) {
        this.f24721a = context;
        this.f24722b = i;
        this.f24723c = list;
        this.f24724d = c4748z;
    }

    protected final boolean mo4343a() {
        switch (this.f24722b) {
            case 0:
                try {
                    C5591h.m26586a(C5571a.m26561a(this.f24721a).m23220a(new C5581p()), 40, TimeUnit.SECONDS);
                    break;
                } catch (ExecutionException e) {
                    break;
                } catch (InterruptedException e2) {
                    break;
                } catch (TimeoutException e3) {
                    break;
                }
            case 1:
                C4748z c4748z = this.f24724d;
                List list = this.f24723c;
                boolean[] zArr = new boolean[list.size()];
                for (int i = 0; i < zArr.length; i++) {
                    zArr[i] = m22383a((byte[]) list.get(i));
                }
                c4748z.mo4371a(zArr);
                break;
        }
        return false;
    }

    private final boolean m22383a(byte[] bArr) {
        Throwable e;
        FinskyLog.m21662b("Check PHA with digest: %s", C4691w.m21842a(bArr));
        try {
            FinskyLog.m21662b("PHA result: %b", Boolean.valueOf(((Boolean) C5591h.m26586a(C5571a.m26561a(this.f24721a).m23220a(new C5583r("AIzaSyAbjymMFVpKzKIQNuebMSBu2mdHlasX3Xk", bArr)), ((Long) C0955b.cn.m28964b()).longValue(), TimeUnit.SECONDS)).booleanValue()));
            return ((Boolean) C5591h.m26586a(C5571a.m26561a(this.f24721a).m23220a(new C5583r("AIzaSyAbjymMFVpKzKIQNuebMSBu2mdHlasX3Xk", bArr)), ((Long) C0955b.cn.m28964b()).longValue(), TimeUnit.SECONDS)).booleanValue();
        } catch (ExecutionException e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        } catch (TimeoutException e4) {
            e = e4;
        }
        FinskyLog.m21660a(e, "Cannot do offline verify app", new Object[0]);
        return false;
    }
}
