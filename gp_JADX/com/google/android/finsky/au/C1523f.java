package com.google.android.finsky.au;

import android.content.Context;
import com.google.android.finsky.cj.C2284a;
import com.google.wireless.android.finsky.b.e;
import com.squareup.leakcanary.C7582R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class C1523f extends C1518d {
    public final C2284a f8224a;
    public final Context f8225b;
    public final int f8226c;
    public final File f8227d;
    public final boolean f8228m;

    public C1523f(Context context, String str, String str2, C2284a c2284a, e eVar, int i, File file, boolean z) {
        super(str, str2, eVar.e, eVar.f, "", eVar.h, C1522e.m8909a(eVar), eVar.j);
        this.f8224a = c2284a;
        this.f8225b = context;
        this.f8227d = file;
        this.f8226c = i;
        this.f8228m = z;
    }

    public final boolean mo2274a() {
        return true;
    }

    public final File mo2275b() {
        return this.f8227d;
    }

    public final synchronized int mo2276c() {
        return this.f8226c;
    }

    public final OutputStream mo2280e() {
        return new FileOutputStream(mo2283h());
    }

    public final void mo2278a(OutputStream outputStream) {
        outputStream.flush();
        outputStream.close();
    }

    public final void mo2281f() {
        mo2283h().delete();
    }

    public final boolean mo2279a(boolean z) {
        return true;
    }

    public final File mo2283h() {
        return this.f8224a.m11771b();
    }

    public final String mo2273a(String str) {
        return this.f8225b.getString(C7582R.string.notification_additional_data, new Object[]{str});
    }

    public final boolean mo2282g() {
        return true;
    }

    public final boolean mo2277d() {
        return this.f8228m;
    }

    public final C2284a mo2284i() {
        return this.f8224a;
    }

    public final boolean mo2285j() {
        return false;
    }
}
