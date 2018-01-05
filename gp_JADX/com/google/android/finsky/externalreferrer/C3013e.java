package com.google.android.finsky.externalreferrer;

import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ak.C1202e;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.externalreferrer.p197a.C3008a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.utils.FinskyLog;

final class C3013e implements Runnable {
    public final /* synthetic */ String f15785a;
    public final /* synthetic */ String f15786b;
    public final /* synthetic */ String f15787c;
    public final /* synthetic */ String f15788d;
    public final /* synthetic */ C3012d f15789e;

    C3013e(C3012d c3012d, String str, String str2, String str3, String str4) {
        this.f15789e = c3012d;
        this.f15785a = str;
        this.f15786b = str2;
        this.f15787c = str3;
        this.f15788d = str4;
    }

    public final void run() {
        C2129c c2129c;
        String str;
        C3647b a = this.f15789e.f15776c.m17243a(this.f15785a);
        int b = this.f15789e.f15779f.mo3482b(this.f15785a);
        C3012d c3012d = this.f15789e;
        String str2 = this.f15786b;
        Object obj = this.f15787c;
        String str3 = this.f15785a;
        C2127b c2127b = this.f15789e.f15778e;
        Object obj2 = null;
        boolean a2 = C3028c.m15628a(b);
        Object obj3 = (a == null || a.f18028c == null) ? null : 1;
        if (a2 || obj3 != null) {
            Object obj4;
            obj3 = null;
            if (a == null || a.f18029d == null) {
                obj4 = null;
            } else {
                c2129c = a.f18029d;
                CharSequence charSequence = c2129c.f10817k;
                if (!TextUtils.isEmpty(charSequence)) {
                    long j = c2129c.f10823q;
                    long longValue = ((Long) C0955b.ai.m28964b()).longValue();
                    if (longValue > 0 && j + longValue < System.currentTimeMillis()) {
                        obj3 = null;
                        obj4 = 1;
                    }
                }
                CharSequence charSequence2 = charSequence;
                obj4 = null;
            }
            if (TextUtils.isEmpty(obj3)) {
                obj3 = null;
                obj2 = obj4;
                str = "dropped_already_installed";
            } else if (obj3.equals(str2)) {
                obj3 = 1;
                obj2 = obj4;
                str = null;
            } else {
                obj3 = null;
                obj2 = obj4;
                str = "dropped_already_captured";
            }
        } else {
            obj3 = 1;
            str = null;
        }
        if (obj2 != null) {
            c3012d.f15781h.m15590a(str3, c2127b);
        }
        if (obj3 != null) {
            C3011c c3011c = c3012d.f15781h;
            long currentTimeMillis = System.currentTimeMillis();
            if (c3011c.f15772b.dj().mo2294a(12638806)) {
                C1202e c1202e = c3011c.f15771a.f15800a;
                C3017j b2 = new C3017j().m15602a(str3).m15603b(str2);
                if (!TextUtils.isEmpty(obj)) {
                    C3008a c3008a = b2.f15799a;
                    if (obj == null) {
                        throw new NullPointerException();
                    }
                    c3008a.f15759a |= 4;
                    c3008a.f15762d = obj;
                }
                c1202e.mo1524b(b2.m15601a(currentTimeMillis).m15600a());
            }
            c2129c = c2127b.mo2657a(str3);
            if (c2129c == null) {
                b = 0;
            } else {
                b = c2129c.f10824r;
            }
            int i = b | 8;
            if (i != b) {
                c2127b.mo2678e(str3, i);
            }
            c2127b.mo2666a(str3, str2);
            c2127b.mo2670b(str3, currentTimeMillis);
        }
        if (str == null) {
            if (TextUtils.isEmpty(this.f15786b)) {
                FinskyLog.m21659a("Capture referrer for %s (empty)", this.f15785a);
            } else {
                FinskyLog.m21659a("Capture referrer for %s", this.f15785a);
            }
            this.f15789e.m15592a(515, this.f15785a, -1, this.f15788d);
            return;
        }
        FinskyLog.m21659a("Dropped referrer for %s because %s", this.f15785a, str);
        b = -1;
        if (!(a == null || a.f18028c == null)) {
            b = a.f18028c.f11419d;
        }
        this.f15789e.m15592a(516, this.f15785a, b, str);
    }
}
