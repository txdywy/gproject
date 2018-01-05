package com.google.android.libraries.play.entertainment.p192l.p193b;

import android.accounts.Account;
import com.android.volley.AuthFailureError;
import com.android.volley.C0656n;
import com.android.volley.C0660x;
import com.android.volley.C0689z;
import com.android.volley.C0697m;
import com.android.volley.C0699q;
import com.android.volley.C0704v;
import com.android.volley.VolleyError;
import com.android.volley.p060a.C0673n;
import com.google.android.libraries.play.entertainment.p194a.C6026a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import java.util.Collections;
import java.util.Map;

public final class C6110a extends C0656n implements C0689z {
    public final Account f30276q = null;
    public final C6026a f30277r = null;
    public final C0660x f30278s;
    public final C0699q f30279t;
    public final String f30280u;
    public boolean f30281v;

    public C6110a(String str, C6112d c6112d, C0699q c0699q, String str2) {
        super(0, str, c6112d);
        C6116b.m28107b(true, "Must specify accountManagerHelper if account is given");
        this.f30278s = c6112d;
        this.f30279t = c0699q;
        this.f30280u = str2;
        this.f4038m = this;
    }

    public final C0699q mo1074n() {
        return this.f30279t;
    }

    public final String mo1546e() {
        return this.f30280u;
    }

    public final Map mo1547h() {
        if (this.f30276q == null || this.f30277r == null) {
            return super.mo1547h();
        }
        try {
            this.f30277r.m27911a();
            return Collections.singletonMap("Authorization", this.f30277r.m27912b());
        } catch (Exception e) {
            throw new AuthFailureError("Auth failure", e);
        }
    }

    public final int mo1077a() {
        return 0;
    }

    public final int mo1079b() {
        return this.f30281v ? 1 : 0;
    }

    public final void mo1078a(VolleyError volleyError) {
        if (this.f30276q == null || this.f30277r == null || !(volleyError instanceof AuthFailureError)) {
            throw volleyError;
        }
        AuthFailureError authFailureError = (AuthFailureError) volleyError;
        if (authFailureError.b == null || authFailureError.b.f4166a != 401) {
            throw volleyError;
        } else if (this.f30281v) {
            throw volleyError;
        } else {
            this.f30281v = true;
            this.f30277r.m27913c();
        }
    }

    protected final C0704v mo1055a(C0697m c0697m) {
        return C0704v.m4517a(c0697m.f4167b, C0673n.m4460a(c0697m));
    }

    protected final /* synthetic */ void mo1056a(Object obj) {
        this.f30278s.b_((byte[]) obj);
    }
}
