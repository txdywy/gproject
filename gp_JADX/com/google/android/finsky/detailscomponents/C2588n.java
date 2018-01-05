package com.google.android.finsky.detailscomponents;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C1472b;

public final class C2588n implements OnClickListener {
    public Context f13782a;
    public String f13783b;
    public boolean f13784c;
    public boolean f13785d;
    public int f13786e;
    public ad f13787f;
    public C0988c f13788g;
    public C1472b f13789h;
    public C1463g f13790i;
    public C2471a f13791j;
    public C2171b f13792k;
    public C2162a f13793l;

    C2588n(Context context, String str, boolean z, boolean z2, int i, ad adVar, C0988c c0988c, C1472b c1472b, C1463g c1463g, C2471a c2471a, C2171b c2171b, C2162a c2162a) {
        this.f13782a = context;
        this.f13783b = str;
        this.f13784c = z;
        this.f13785d = z2;
        this.f13786e = i;
        this.f13787f = adVar;
        this.f13788g = c0988c;
        this.f13789h = c1472b;
        this.f13790i = c1463g;
        this.f13791j = c2471a;
        this.f13792k = c2171b;
        this.f13793l = c2162a;
    }

    public final void onClick(View view) {
        Intent a;
        String cZ = this.f13788g.cZ();
        boolean a2 = this.f13789h.mo2246h(cZ).m22586a();
        this.f13790i.mo2242f(cZ).m13325a(120, null, this.f13787f);
        if (this.f13785d && a2) {
            a = this.f13792k.mo2743a(this.f13782a, cZ, this.f13786e, null, this.f13791j.m13184a(null));
        } else if (this.f13784c) {
            a = this.f13793l.mo2709b(this.f13782a.getPackageManager(), Uri.parse(this.f13783b), cZ);
        } else {
            a = this.f13793l.mo2688a(this.f13782a.getPackageManager(), Uri.parse(this.f13783b), cZ);
        }
        this.f13782a.startActivity(a);
    }
}
