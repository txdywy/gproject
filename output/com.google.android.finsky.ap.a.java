package com.google.android.finsky.ap;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class com.google.android.finsky.ap.a
{

    public final com.google.android.finsky.accounts.c a;
    public final com.google.android.finsky.accounts.a b;
    public final com.google.android.finsky.ba.c c;
    public final com.google.android.finsky.f.b d;
    public final Map e;

    a(com.google.android.finsky.accounts.c p0, com.google.android.finsky.accounts.a p1, com.google.android.finsky.ba.c p2, com.google.android.finsky.f.b p3) {
        this.e = new HashMap();
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    public final String a(Document p0, String p1) {
        if (p0.a.e != 1)
            v0 = this.a.cZ();
        else {
            v5 = p0.cf();
            if (v5 == 0)
                FinskyLog.e("DetailsAccountHelper: PackageName can not be null", new Object[0]);
            v1 = this.a.cZ();
            if (!TextUtils.isEmpty(p1))
                v2 = 1;
            else
                v2 = 0;
            if (v2 != 0)
                v0 = p1;
            else {
                p1 = this.d.a(v5).a(v1);
                v0 = (Set)this.e.get(v5);
                if (this.c.dj().a(12622972) && !v1.equals(p1) && v0 != 0 && v0.contains(p1))
                    v0 = v1;
                else
                    v0 = p1;
            }
            if (v2 != 0 || !v1.equals(v0)) {
                v6 = new Object[3];
                v6[0] = FinskyLog.a(v0);
                v6[1] = v5;
                v6[2] = Boolean.valueOf(v2);
                FinskyLog.a("Selecting account %s for package %s. overriding=[%s]", v6);
            }
        }
        return v0;
    }

    public final Account b(Document p0, String p1) {
        return this.b.b(this.a(p0, p1));
    }

}
