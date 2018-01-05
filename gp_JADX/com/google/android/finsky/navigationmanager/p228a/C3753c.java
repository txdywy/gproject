package com.google.android.finsky.navigationmanager.p228a;

import android.app.Activity;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.activities.C1036b;
import com.google.android.finsky.ap.C1249a;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.bj.C2104b;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3752d;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p148b.C1542f;

public final class C3753c implements C3752d {
    public final C0988c f18931a;
    public final C1542f f18932b;
    public final C2471a f18933c;
    public final C2171b f18934d;
    public final C1249a f18935e;
    public final C1287h f18936f;
    public final C2162a f18937g;
    public final C1461c f18938h;
    public final C1463g f18939i;
    public final C2104b f18940j;
    public final C1867w f18941k;
    public final ab f18942l;

    public C3753c(C0988c c0988c, C1542f c1542f, C2471a c2471a, C1249a c1249a, C1287h c1287h, C2171b c2171b, C2162a c2162a, C1461c c1461c, C1463g c1463g, C2104b c2104b, C1867w c1867w, ab abVar) {
        this.f18931a = c0988c;
        this.f18932b = c1542f;
        this.f18933c = c2471a;
        this.f18935e = c1249a;
        this.f18936f = c1287h;
        this.f18934d = c2171b;
        this.f18937g = c2162a;
        this.f18938h = c1461c;
        this.f18939i = c1463g;
        this.f18940j = c2104b;
        this.f18941k = c1867w;
        this.f18942l = abVar;
    }

    public final C3748a mo3726a(Activity activity) {
        return new C3749d((C1036b) activity, this.f18931a, this.f18932b, this.f18933c, this.f18935e, this.f18936f, this.f18934d, this.f18937g, this.f18938h, this.f18939i, this.f18940j, this.f18941k, this.f18942l);
    }

    public final C3748a mo3727b(Activity activity) {
        return new C3751b((C1036b) activity, this.f18931a, this.f18932b, this.f18933c, this.f18935e, this.f18936f, this.f18934d, this.f18937g, this.f18938h, this.f18939i, this.f18940j, this.f18941k, this.f18942l);
    }

    public final C3748a mo3728c(Activity activity) {
        return new C3750a((C1036b) activity, this.f18931a, this.f18932b, this.f18933c, this.f18935e, this.f18936f, this.f18934d, this.f18937g, this.f18938h, this.f18939i, this.f18940j, this.f18941k, this.f18942l);
    }
}
