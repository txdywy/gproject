package com.google.android.finsky.navigationmanager.p228a;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.p148b.C1544h;
import com.google.android.finsky.utils.bb;

final class C3754e implements OnClickListener {
    public final /* synthetic */ C2495w f18943a;
    public final /* synthetic */ ad f18944b;
    public final /* synthetic */ int f18945c;
    public final /* synthetic */ Document f18946d;
    public final /* synthetic */ Account f18947e;
    public final /* synthetic */ int f18948f;
    public final /* synthetic */ C2731v f18949g;
    public final /* synthetic */ String f18950h;
    public final /* synthetic */ C3749d f18951i;

    C3754e(C3749d c3749d, C2495w c2495w, ad adVar, int i, Document document, Account account, int i2, C2731v c2731v, String str) {
        this.f18951i = c3749d;
        this.f18943a = c2495w;
        this.f18944b = adVar;
        this.f18945c = i;
        this.f18946d = document;
        this.f18947e = account;
        this.f18948f = i2;
        this.f18949g = c2731v;
        this.f18950h = str;
    }

    public final void onClick(View view) {
        this.f18943a.m13379b(new C2475d(this.f18944b).m13256a(this.f18945c));
        if (this.f18946d.f14885a.f12099f == 3) {
            C1542f c1542f = this.f18951i.f18917e;
            C2495w c2495w = this.f18943a;
            String str = this.f18946d.f14885a.f12096c;
            Context applicationContext = view.getContext().getApplicationContext();
            int a = c1542f.f8289b.m9274a(applicationContext, view.getHeight());
            int a2 = c1542f.f8289b.m9274a(applicationContext, view.getWidth());
            if (c1542f.f8291d.dj().mo2294a(12642293)) {
                bb.m21792a(new C1544h(c1542f, c2495w, applicationContext, str, a, a2), new Void[0]);
            } else {
                c1542f.m8975a(c2495w, applicationContext, str, a, a2);
            }
        }
        this.f18951i.mo3631a(this.f18947e, this.f18946d, this.f18948f, this.f18949g, this.f18950h, false, this.f18943a);
    }
}
