package com.google.android.finsky.au;

import android.content.Context;
import com.google.android.finsky.cj.C2284a;
import com.google.android.finsky.cj.C2286c;
import com.google.wireless.android.finsky.b.e;
import com.squareup.leakcanary.C7582R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class C1524g extends C1518d {
    public final C2284a f8229a;
    public final Context f8230b;
    public int f8231c = -2;

    public C1524g(Context context, String str, String str2, C2284a c2284a, e eVar) {
        super(str, str2, eVar.e, eVar.f, "", eVar.h, C1522e.m8909a(eVar), eVar.j);
        this.f8229a = c2284a;
        this.f8230b = context;
    }

    public final boolean mo2274a() {
        return true;
    }

    public final File mo2275b() {
        return new File(C2286c.m11779a(this.f), C2286c.m11781a(this.f8229a.f11296a, mo2276c(), this.f));
    }

    public final synchronized int mo2276c() {
        if (this.f8231c == -2) {
            String str = this.f;
            boolean z = this.f8229a.f11296a;
            File[] listFiles = C2286c.m11779a(str).listFiles();
            int i = -1;
            if (listFiles != null) {
                for (File name : listFiles) {
                    Integer a = C2286c.m11780a(name.getName(), str, z);
                    if (a != null && a.intValue() > r0) {
                        i = a.intValue();
                    }
                }
            }
            this.f8231c = i;
        }
        return this.f8231c;
    }

    public final OutputStream mo2280e() {
        File c = this.f8229a.m11772c();
        c.delete();
        return new FileOutputStream(c);
    }

    public final void mo2278a(OutputStream outputStream) {
        outputStream.flush();
        outputStream.close();
    }

    public final void mo2281f() {
        File c = this.f8229a.m11772c();
        if (c != null) {
            c.delete();
        }
    }

    public final boolean mo2279a(boolean z) {
        return false;
    }

    public final File mo2283h() {
        return this.f8229a.m11772c();
    }

    public final String mo2273a(String str) {
        return this.f8230b.getString(C7582R.string.notification_additional_data, new Object[]{str});
    }

    public final boolean mo2282g() {
        return true;
    }

    public final boolean mo2277d() {
        this.f8229a.m11770a();
        return this.f8229a.f11300e == 4;
    }

    public final C2284a mo2284i() {
        return this.f8229a;
    }

    public final boolean mo2285j() {
        return false;
    }
}
