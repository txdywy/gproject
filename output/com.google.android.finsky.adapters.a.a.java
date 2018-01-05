package com.google.android.finsky.adapters.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.o;
import com.google.android.finsky.layout.structuredreviews.a;
import java.util.ArrayList;
import java.util.List;

public final class com.google.android.finsky.adapters.a.a implements com.google.android.finsky.adapters.a.e
{

    public final List a;
    public final com.google.android.finsky.d.ad b;
    public final CharSequence c;
    public final Context d;
    public com.google.android.finsky.layout.structuredreviews.a e;
    public com.google.android.finsky.adapters.a.f f;

    a(Context p0, byte[] p1, CharSequence p2, com.google.android.finsky.d.ad p3) {
        this.a = new ArrayList();
        this.d = p0;
        this.c = p2;
        this.b = new com.google.android.finsky.d.o(this.a(), p1, p3);
    }

    protected abstract int a();

    public void a(Bundle p0) {
    }

    public final void a(com.google.android.finsky.adapters.a.f p0) {
        this.f = p0;
    }

    public final void a(com.google.android.finsky.adapters.a.g p0) {
        if (!this.a.contains(p0))
            this.a.add(p0);
    }

    public final void a(com.google.android.finsky.layout.structuredreviews.a p0) {
        this.e = p0;
    }

    protected final void a(String p0, int p1, int p2) {
        v1 = this.a.size() - 1;
        while (v1 >= 0) {
            ((com.google.android.finsky.adapters.a.g)this.a.get(v1)).a(this, p0, p1, p2);
            v1 = v1 - 1;
        }
    }

    public final void b() {
        this.b.getParentNode().a(this.b);
    }

    public final void b(com.google.android.finsky.adapters.a.g p0) {
        this.a.remove(p0);
    }

    public final com.google.android.finsky.d.ad c() {
        return this.b;
    }

    protected final void d() {
        if (this.f != 0)
            this.f.a();
    }

    public CharSequence e() {
        return this.d.getResources().getString(2131953203);
    }

    public final void f() {
        if (this.e != 0)
            this.e.b();
    }

    public final void g() {
    }

}
