package com.google.android.finsky.p198f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cq.C2363d;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.List;

public final class C3028c {
    public static final List f15844l = new ArrayList();
    public static final List f15845m = new ArrayList();
    public final Context f15846a;
    public final C1461c f15847b;
    public final C3646a f15848c;
    public final C2127b f15849d;
    public final ab f15850e;
    public final C2206c f15851f;
    public final C2233o f15852g;
    public final C2266a f15853h;
    public final PackageManager f15854i;
    public final C1531a f15855j;
    public final C2363d f15856k;

    public C3028c(Context context, C1461c c1461c, C3646a c3646a, C2127b c2127b, ab abVar, C2206c c2206c, C2233o c2233o, C2266a c2266a, PackageManager packageManager, C1531a c1531a, C2363d c2363d) {
        this.f15846a = context;
        this.f15847b = c1461c;
        this.f15848c = c3646a;
        this.f15849d = c2127b;
        this.f15850e = abVar;
        this.f15851f = c2206c;
        this.f15852g = c2233o;
        this.f15853h = c2266a;
        this.f15854i = packageManager;
        this.f15855j = c1531a;
        this.f15856k = c2363d;
    }

    public static boolean m15628a(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    public final boolean m15636a(String str, boolean z) {
        if (!z) {
            return false;
        }
        C2129c a = this.f15849d.mo2657a(str);
        if (a == null || (a.f10819m & eq.FLAG_MOVED) == 0) {
            return false;
        }
        return true;
    }

    public final boolean m15634a(Document document) {
        return document != null && m15635a(document.cf());
    }

    public final boolean m15635a(String str) {
        return !TextUtils.isEmpty(str) && C3028c.m15630a(this.f15848c.m17243a(str));
    }

    public static boolean m15630a(C3647b c3647b) {
        return (c3647b == null || c3647b.f18028c == null) ? false : true;
    }

    public final boolean m15632a(C2322b c2322b, long j) {
        return !this.f15847b.dj().mo2294a(j) && C3028c.m15629a(c2322b);
    }

    public static boolean m15629a(C2322b c2322b) {
        return (c2322b == null || c2322b.f11427l < 10000 || "REL".equals(VERSION.CODENAME)) ? false : true;
    }

    public final boolean m15633a(C2322b c2322b, Document document) {
        if (c2322b == null) {
            return false;
        }
        if (!this.f15851f.mo2816a()) {
            FinskyLog.m21669e("Library not loaded.", new Object[0]);
            return false;
        } else if (c2322b.f11424i || m15632a(c2322b, 12609314)) {
            return false;
        } else {
            String str = c2322b.f11416a;
            if (!new C3654j(this.f15847b).m17264a(document.m14625N()).m17262a(c2322b).m17265a()) {
                return false;
            }
            if (this.f15852g.m11649a(document, null, this.f15851f)) {
                return true;
            }
            FinskyLog.m21659a("Cannot update unavailable app: pkg=%s,restriction=%d", str, Integer.valueOf(document.af()));
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.finsky.p198f.C3029d m15631a(com.google.android.finsky.dfemodel.Document r11, boolean r12) {
        /*
        r10 = this;
        r7 = 22;
        r3 = 0;
        r4 = 1;
        r0 = r10.f15853h;
        r0 = r0.m11719a();
        if (r0 == 0) goto L_0x0072;
    L_0x000c:
        r0 = r10.f15853h;
        r0 = r0.f11252e;
    L_0x0010:
        r5 = r11.m14625N();
        r6 = r5.f13171k;
        r2 = android.os.Build.VERSION.SDK_INT;
        if (r2 <= r7) goto L_0x0020;
    L_0x001a:
        r2 = r11.ai();
        if (r2 > r7) goto L_0x0028;
    L_0x0020:
        r2 = r10.f15846a;
        r2 = com.google.android.play.utils.k.d(r2);
        if (r2 == 0) goto L_0x0078;
    L_0x0028:
        r2 = r4;
    L_0x0029:
        r7 = new com.google.android.finsky.f.d;
        r7.<init>();
        r8 = f15844l;
        r8 = r8.contains(r6);
        if (r8 == 0) goto L_0x0041;
    L_0x0036:
        r8 = "Forcing true for size limit for package %s";
        r9 = new java.lang.Object[r4];
        r9[r3] = r6;
        com.google.android.finsky.utils.FinskyLog.m21665c(r8, r9);
        r7.f15857a = r4;
    L_0x0041:
        r8 = r10.f15855j;
        r8 = r8.m8962c(r11);
        r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r0 < 0) goto L_0x004d;
    L_0x004b:
        r7.f15857a = r4;
    L_0x004d:
        r0 = r10.f15848c;
        r1 = r5.f13171k;
        r8 = r0.m17243a(r1);
        if (r8 == 0) goto L_0x005b;
    L_0x0057:
        r0 = r8.f18028c;
        if (r0 != 0) goto L_0x007a;
    L_0x005b:
        r1 = r4;
    L_0x005c:
        if (r2 == 0) goto L_0x007c;
    L_0x005e:
        r7.f15858b = r3;
    L_0x0060:
        if (r1 != 0) goto L_0x0071;
    L_0x0062:
        if (r12 == 0) goto L_0x0071;
    L_0x0064:
        r0 = r8.f18029d;
        if (r0 == 0) goto L_0x0071;
    L_0x0068:
        r0 = r8.f18029d;
        r0 = r0.f10808b;
        r1 = 2;
        if (r0 != r1) goto L_0x0071;
    L_0x006f:
        r7.f15859c = r4;
    L_0x0071:
        return r7;
    L_0x0072:
        r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        goto L_0x0010;
    L_0x0078:
        r2 = r3;
        goto L_0x0029;
    L_0x007a:
        r1 = r3;
        goto L_0x005c;
    L_0x007c:
        if (r1 != 0) goto L_0x00ce;
    L_0x007e:
        r0 = r10.f15854i;
        r0 = com.google.android.finsky.permissionui.C3875a.m18361a(r0, r6);
        r0 = com.google.android.finsky.permissionui.C3875a.m18364a(r0);
        r2 = r10.f15856k;
        r9 = r10.f15849d;
        r2 = r2.m11998b(r9, r6);
        r9 = r10.f15856k;
        r5 = r5.f13167g;
        r2 = r9.m11994a(r5, r0, r2);
        r0 = f15845m;
        r0 = r0.contains(r6);
        if (r0 != 0) goto L_0x00ce;
    L_0x00a0:
        r0 = r2.f11591c;
        if (r0 != 0) goto L_0x00ce;
    L_0x00a4:
        r0 = r2.f11589a;
        r5 = r2.f11590b;
        r0 = r0[r5];
        if (r0 == 0) goto L_0x00d1;
    L_0x00ac:
        r0 = r0.m11986b();
        if (r0 == 0) goto L_0x00d1;
    L_0x00b2:
        r0 = r4;
    L_0x00b3:
        if (r0 != 0) goto L_0x00ce;
    L_0x00b5:
        r2 = r2.f11589a;
        r5 = r2.length;
        r0 = r3;
    L_0x00b9:
        if (r0 >= r5) goto L_0x00cc;
    L_0x00bb:
        r6 = r2[r0];
        if (r6 == 0) goto L_0x00d3;
    L_0x00bf:
        r9 = r6.m11985a();
        if (r9 != 0) goto L_0x00d3;
    L_0x00c5:
        r6 = r6.m11986b();
        if (r6 == 0) goto L_0x00d3;
    L_0x00cb:
        r3 = r4;
    L_0x00cc:
        if (r3 == 0) goto L_0x0060;
    L_0x00ce:
        r7.f15858b = r4;
        goto L_0x0060;
    L_0x00d1:
        r0 = r3;
        goto L_0x00b3;
    L_0x00d3:
        r0 = r0 + 1;
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.f.c.a(com.google.android.finsky.dfemodel.Document, boolean):com.google.android.finsky.f.d");
    }

    public final void m15637b(Document document) {
        if (document == null) {
            FinskyLog.m21669e("Null document provided", new Object[0]);
            return;
        }
        C2441n N = document.m14625N();
        if (N == null) {
            FinskyLog.m21669e("Null app details provided for %s", document.f14885a.f12097d);
            return;
        }
        String str = N.f13171k;
        if (N.ax_()) {
            m15638b(str, N.f13183w);
            return;
        }
        FinskyLog.m21665c("No everExternallyHosted provided for %s", str);
    }

    public final void m15638b(String str, boolean z) {
        int i;
        int i2;
        C3647b a = this.f15848c.m17243a(str);
        if (a == null || a.f18028c == null) {
            FinskyLog.m21659a("Presetting external-hosting status for non-installed %s", str);
        }
        C2129c c2129c = a == null ? null : a.f18029d;
        if (c2129c == null) {
            i = 0;
        } else {
            i = c2129c.f10824r;
        }
        if (z) {
            i2 = (i | 2) | 4;
        } else {
            i2 = (i & -3) | 4;
        }
        if (i2 != i) {
            this.f15849d.mo2678e(str, i2);
        }
    }
}
