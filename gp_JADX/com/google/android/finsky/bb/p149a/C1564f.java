package com.google.android.finsky.bb.p149a;

import android.accounts.Account;
import android.support.v4.app.Fragment;
import android.widget.Toast;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.bb.C1565a;
import com.google.android.finsky.bb.C1566d;
import com.google.wireless.android.finsky.dfe.h.a.f;
import com.squareup.leakcanary.C7582R;

final class C1564f implements C0657w, C0660x, Runnable {
    public Fragment f8365a;
    public f f8366b;
    public Account f8367c;
    public C1565a f8368d;
    public final /* synthetic */ C1563e f8369e;

    public C1564f(C1563e c1563e, Fragment fragment, Account account, C1565a c1565a) {
        this.f8369e = c1563e;
        this.f8365a = fragment;
        this.f8367c = account;
        this.f8368d = c1565a;
    }

    public final void mo1062a(VolleyError volleyError) {
        for (C1566d c1566d : this.f8369e.f8358a) {
            if (this.f8365a.m610k() && c1566d.mo3058a(this.f8367c.name, this.f8368d.f8370a.f14885a.f12096c)) {
                int i;
                if (this.f8368d.f8374e) {
                    i = C7582R.string.family_sharing_add_failed;
                } else {
                    i = C7582R.string.family_sharing_remove_failed;
                }
                Toast.makeText(this.f8365a.m601g(), i, 1).show();
                this.f8368d.f8374e = !this.f8368d.f8374e;
                return;
            }
        }
    }

    public final void run() {
        for (C1566d c1566d : this.f8369e.f8358a) {
            if (this.f8365a.m610k() && c1566d.mo3059a(this.f8367c.name, this.f8368d.f8370a.f14885a.f12096c, this.f8366b)) {
                if (this.f8366b.d()) {
                    if ((this.f8366b.a & 2) != 0) {
                        new C1508k().m8859c(this.f8366b.c).m8852a(this.f8366b.d).m8860d((int) C7582R.string.ok).m8853a(true).mo2272a().m625a(this.f8365a.f730B, "sharing");
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        f fVar = (f) obj;
        this.f8366b = fVar;
        this.f8369e.f8363f.mo2796a(this.f8367c, "FamilyShareModule.setShareState", (Runnable) this, fVar.b);
    }
}
