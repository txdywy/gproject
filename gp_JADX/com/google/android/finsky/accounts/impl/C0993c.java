package com.google.android.finsky.accounts.impl;

import android.os.AsyncTask;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p198f.C3026a;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.providers.C1467c;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

final class C0993c extends AsyncTask {
    public final String f5991a;
    public final boolean f5992b;
    public final C0986a f5993c;
    public final C3027b f5994d;
    public final C3646a f5995e;
    public final C1467c f5996f;
    public final C2206c f5997g;

    public C0993c(String str, boolean z, C1467c c1467c, C0986a c0986a, C3027b c3027b, C3646a c3646a, C2206c c2206c) {
        this.f5991a = str;
        this.f5992b = z;
        this.f5996f = c1467c;
        this.f5993c = c0986a;
        this.f5994d = c3027b;
        this.f5995e = c3646a;
        this.f5997g = c2206c;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            this.f5996f.mo2058a(this.f5991a, this.f5993c.mo1188d().length == 0);
        }
        if (this.f5992b) {
            FinskyLog.m21659a("Killing app because current account has been removed", new Object[0]);
            System.exit(0);
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (!this.f5997g.mo2816a()) {
            this.f5997g.mo2820c();
        }
        if (!this.f5995e.f18022b.m11208b()) {
            this.f5995e.f18022b.m11209c();
        }
        Collection<C2322b> a = this.f5995e.f18023c.mo2855a();
        Collection arrayList = new ArrayList();
        for (C2322b c2322b : a) {
            if (!c2322b.f11422g) {
                arrayList.add(c2322b.f11416a);
            }
        }
        Set<String> a2 = this.f5995e.m17247a(this.f5997g, arrayList);
        if (!a2.isEmpty()) {
            for (String a3 : a2) {
                C3026a a4 = this.f5994d.m15626a(a3);
                if (a4.m15623b() && !a4.f15822j) {
                    return Boolean.valueOf(true);
                }
            }
        }
        return Boolean.valueOf(false);
    }
}
