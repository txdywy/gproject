package com.google.android.finsky.detailscomponents;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C1472b;

public final class C2577b {
    public final C0988c f13749a;
    public final C2471a f13750b;
    public final C1472b f13751c;
    public final C2162a f13752d;
    public final C1463g f13753e;
    public final C2171b f13754f;
    public final C1611k f13755g;

    public C2577b(C0988c c0988c, C2471a c2471a, C1472b c1472b, C2162a c2162a, C1463g c1463g, C2171b c2171b, C1611k c1611k) {
        this.f13749a = c0988c;
        this.f13750b = c2471a;
        this.f13751c = c1472b;
        this.f13752d = c2162a;
        this.f13753e = c1463g;
        this.f13754f = c2171b;
        this.f13755g = c1611k;
    }

    public final C2586l m13627a(Context context, ImageView imageView, View view) {
        return new C2586l(context, imageView, view, this);
    }

    public final C2588n m13628a(Context context, String str, boolean z, boolean z2, int i, ad adVar) {
        return new C2588n(context, str, z, z2, i, adVar, this.f13749a, this.f13751c, this.f13753e, this.f13750b, this.f13754f, this.f13752d);
    }

    public final C2583i m13626a(Resources resources, boolean z) {
        return new C2583i(resources, z, this.f13755g);
    }
}
