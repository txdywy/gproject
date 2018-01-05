package com.google.android.finsky.aj;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.util.concurrent.ExecutionException;

final class C1192c implements C0978f {
    public final /* synthetic */ String f7294a;
    public final /* synthetic */ C1190a f7295b;

    C1192c(C1190a c1190a, String str) {
        this.f7295b = c1190a;
        this.f7294a = str;
    }

    public final void mo1172a(C4809e c4809e) {
        InterruptedException e;
        C1190a c1190a;
        C1193d[] c1193dArr;
        int length;
        int i = 0;
        bb.m21791a();
        C1194e c1194e = null;
        try {
            c1194e = (C1194e) c4809e.get();
        } catch (InterruptedException e2) {
            e = e2;
            FinskyLog.m21667d("Failed to fetch data usages stats for %s: %s", this.f7294a, e);
            if (c1194e == null) {
                c1190a = this.f7295b;
                c1193dArr = (C1193d[]) c1190a.f7290c.toArray(new C1193d[c1190a.f7290c.size()]);
                length = c1193dArr.length;
                while (i < length) {
                    c1193dArr[i].mo4268a(c1194e);
                    i++;
                }
            }
        } catch (ExecutionException e3) {
            e = e3;
            FinskyLog.m21667d("Failed to fetch data usages stats for %s: %s", this.f7294a, e);
            if (c1194e == null) {
                c1190a = this.f7295b;
                c1193dArr = (C1193d[]) c1190a.f7290c.toArray(new C1193d[c1190a.f7290c.size()]);
                length = c1193dArr.length;
                while (i < length) {
                    c1193dArr[i].mo4268a(c1194e);
                    i++;
                }
            }
        }
        if (c1194e == null) {
            c1190a = this.f7295b;
            c1193dArr = (C1193d[]) c1190a.f7290c.toArray(new C1193d[c1190a.f7290c.size()]);
            length = c1193dArr.length;
            while (i < length) {
                c1193dArr[i].mo4268a(c1194e);
                i++;
            }
        }
    }
}
