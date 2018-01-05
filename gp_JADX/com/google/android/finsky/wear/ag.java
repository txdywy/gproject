package com.google.android.finsky.wear;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aa;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5617e;
import com.google.android.gms.wearable.C5619g;
import com.google.android.gms.wearable.C5620h;
import com.google.android.gms.wearable.C5652n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

public final class ag implements C2320a {
    public static final C2322b f24778a = new C2322b(null, null, null, false, false, false, false, -1, 0, -1, -1);
    public static final Map f24779b = new HashMap();
    public final Context f24780c;
    public final C5058o f24781d;
    public final String f24782e;
    public Map f24783f = null;
    public boolean f24784g;
    public Handler f24785h;
    public List f24786i;

    public static synchronized ag m22436a(Context context, String str, C5058o c5058o) {
        ag agVar;
        synchronized (ag.class) {
            if (!f24779b.containsKey(str)) {
                f24779b.put(str, new ag(context, str, c5058o));
            }
            agVar = (ag) f24779b.get(str);
        }
        return agVar;
    }

    private ag(Context context, String str, C5058o c5058o) {
        this.f24780c = context.getApplicationContext();
        this.f24782e = str;
        this.f24781d = c5058o;
        this.f24785h = new Handler(Looper.getMainLooper());
    }

    public final synchronized void m22440a(Runnable runnable) {
        if (this.f24784g) {
            this.f24785h.post(runnable);
        } else {
            if (this.f24786i == null) {
                this.f24786i = new ArrayList();
            }
            this.f24786i.add(runnable);
            if (this.f24786i.size() == 1) {
                C5652n.f28708a.mo5114a(this.f24781d).mo4490a(new ah(this));
            }
        }
    }

    final synchronized void m22439a(C5619g c5619g) {
        if (c5619g.f28574d.m23271a()) {
            this.f24783f = new HashMap();
            String str = this.f24782e;
            CharSequence stringBuilder = new StringBuilder(String.valueOf(str).length() + 13).append(str).append("/package_info").toString();
            int c = c5619g.mo4501c();
            for (int i = 0; i < c; i++) {
                C5617e c5617e = (C5617e) c5619g.mo4502a(i);
                if (c5617e.mo5123b().toString().contains(stringBuilder)) {
                    C2322b a = m22435a(c5617e);
                    this.f24783f.put(a.f11416a, a);
                }
            }
            SystemClock.uptimeMillis();
        } else {
            FinskyLog.m21665c("Error %d getting data items. (%s)", Integer.valueOf(c5619g.f28574d.f25631g), c5619g.f28574d.f25632h);
        }
    }

    public final synchronized C2322b mo2854a(String str) {
        C2322b c2322b;
        c2322b = (C2322b) this.f24783f.get(str);
        if (c2322b == f24778a) {
            c2322b = null;
        }
        return c2322b;
    }

    public final Collection mo2855a() {
        StrictMode.noteSlowCall("WearPackageStateRepository.blockingLoad");
        Semaphore semaphore = new Semaphore(0);
        m22440a(new ai(semaphore));
        try {
            semaphore.acquire();
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Unexpected interruption", new Object[0]);
        }
        return this.f24783f.values();
    }

    public final synchronized void mo2856b(String str) {
        String str2 = this.f24782e;
        C5652n.f28708a.mo5115a(this.f24781d, Uri.parse(new StringBuilder((String.valueOf(str2).length() + 21) + String.valueOf(str).length()).append("wear://").append(str2).append("/package_info/").append(str).toString())).mo4490a(new aj(this, str));
    }

    public final boolean mo2857c(String str) {
        return false;
    }

    public final String mo2858f(String str) {
        FinskyLog.m21669e("Calling getVersionName on wearable package", new Object[0]);
        return "";
    }

    public final int mo2859g(String str) {
        C2322b a = mo2854a(str);
        return a == null ? -1 : a.f11419d;
    }

    @TargetApi(18)
    static C2322b m22435a(C5617e c5617e) {
        String[] strArr;
        int length;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int d;
        String[] strArr2 = null;
        int i = 0;
        String a = cl.m22515a(c5617e.mo5123b());
        C5620h a2 = C5620h.m26634a(c5617e.mo5124c());
        ArrayList h = a2.m26662h("signatures");
        if (h == null || h.size() <= 0) {
            strArr = null;
        } else {
            strArr = new String[h.size()];
            strArr2 = new String[h.size()];
            length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                byte[] i3 = ((C5620h) h.get(i2)).m26663i("signature");
                strArr[i2] = C4688t.m21838a(i3);
                strArr2[i2] = aa.m21683a(i3);
            }
        }
        int d2 = a2.m26658d("applicationFlags");
        boolean z5 = (d2 & 1) != 0;
        if ((d2 & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        length = a2.m26658d("applicationEnabledSetting");
        if (length == 0) {
            z2 = false;
        } else {
            if (length == 3 || length == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || length == 2) {
                z3 = true;
                z4 = z2;
                d = a2.m26658d("versionCode");
                if (a2.m26653a("derivedApkId")) {
                    i = a2.m26658d("derivedApkId");
                }
                return new C2322b(a, strArr, strArr2, z5, z, z3, z4, d, i, 1, 1);
            }
        }
        z3 = false;
        z4 = z2;
        d = a2.m26658d("versionCode");
        if (a2.m26653a("derivedApkId")) {
            i = a2.m26658d("derivedApkId");
        }
        return new C2322b(a, strArr, strArr2, z5, z, z3, z4, d, i, 1, 1);
    }
}
