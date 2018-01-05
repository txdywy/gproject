package com.google.android.finsky.by.a;

import android.os.Handler;
import android.text.TextUtils;
import com.google.android.finsky.by.h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.w;
import com.google.wireless.android.finsky.dfe.nano.cv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class com.google.android.finsky.by.a.x implements Runnable
{

    public final com.google.wireless.android.finsky.dfe.nano.cv a;
    public final com.google.android.finsky.by.a.w b;

    x(com.google.android.finsky.by.a.w p0, com.google.wireless.android.finsky.dfe.nano.cv p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        if (this.b.b.j == 0)
            FinskyLog.e("Expected pending replication request.", new Object[0]);
        else {
            v4 = new ArrayList();
            v3 = 0;
            while (v3 < this.a.a.length) {
                if (!TextUtils.isEmpty(this.a.a[v3].e))
                    v1 = this.a.a[v3].e;
                else
                    v1 = com.google.android.finsky.by.h.a(this.a.a[v3].d);
                if (!Arrays.equals((byte[])this.b.a.get(v1), this.b.b.g.f(v1))) {
                    if (this.b.b.k != 0)
                        com.google.android.finsky.by.a.r.a(this.b.b, 4, 0, 0);
                    v7 = new Object[1];
                    v7[0] = v1;
                    FinskyLog.c("Tokens changed, not applying library update for libraryId=%s", v7);
                }
                else if (this.b.b.a(this.a.a[v3], this.b.b.j.c))
                    v4.add(v1);
                v3 = v3 + 1;
            }
            if (!v4.isEmpty()) {
                v3 = new String[v4.size()];
                v1 = 0;
                while (v1 < v4.size()) {
                    v3[v1] = (String)v4.get(v1);
                    v1 = v1 + 1;
                }
                this.b.b.a(new com.google.android.finsky.by.a.aa(v3, this.b.b.j.b, String.valueOf(this.b.b.j.c).concat("[c]")));
            }
            else if (this.b.b.j.b != 0)
                this.b.b.d.post(this.b.b.j.b);
            this.b.b.j = 0;
            this.b.b.a(com.google.android.finsky.by.a.r.a);
        }
    }

}
