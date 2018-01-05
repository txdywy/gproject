package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.ads.p239b.C4893b;
import com.google.android.gms.dynamic.C5161a;
import com.google.android.gms.dynamic.C5164d;

@C5302b
public final class tk extends tn {
    public final ik f27500a;
    public final jd f27501b;
    public final hp f27502c;
    public boolean f27503d = false;

    public tk(String str, Context context) {
        this.f27500a = ik.m24820a(str, context);
        this.f27501b = new jd(this.f27500a);
        this.f27502c = hp.m24702b(context);
    }

    public final C5161a mo4867a(C5161a c5161a, C5161a c5161a2) {
        return m25597a(c5161a, c5161a2, true);
    }

    public final String mo4868a() {
        return "ms";
    }

    public final String mo4870a(C5161a c5161a, byte[] bArr) {
        Context context = (Context) C5164d.m23907a(c5161a);
        String a = this.f27500a.m24543a(context, bArr);
        if (this.f27502c == null || !this.f27503d) {
            return a;
        }
        String a2 = hp.m24701a(a, this.f27502c.m24543a(context, bArr));
        this.f27503d = false;
        return a2;
    }

    public final void mo4872a(String str, String str2) {
        jd jdVar = this.f27501b;
        jdVar.f27043a = str;
        jdVar.f27044b = str2;
    }

    public final boolean mo4873a(C5161a c5161a) {
        return this.f27501b.m24882a((Uri) C5164d.m23907a(c5161a));
    }

    public final C5161a mo4875b(C5161a c5161a, C5161a c5161a2) {
        return m25597a(c5161a, c5161a2, false);
    }

    public final boolean mo4876b(C5161a c5161a) {
        return this.f27501b.m24883b((Uri) C5164d.m23907a(c5161a));
    }

    public final String mo4877c(C5161a c5161a) {
        return mo4870a(c5161a, null);
    }

    public final void mo4871a(String str) {
        this.f27501b.f27046d = str.split(",");
    }

    public final String mo4869a(C5161a c5161a, String str) {
        return this.f27500a.mo4747a((Context) C5164d.m23907a(c5161a), str);
    }

    public final void mo4878d(C5161a c5161a) {
        this.f27501b.f27047e.mo4748a((MotionEvent) C5164d.m23907a(c5161a));
    }

    public final boolean mo4874a(String str, boolean z) {
        if (this.f27502c == null) {
            return false;
        }
        this.f27502c.f26904t = new C4893b(str, z);
        this.f27503d = true;
        return true;
    }

    private final C5161a m25597a(C5161a c5161a, C5161a c5161a2, boolean z) {
        try {
            Object a;
            Uri uri = (Uri) C5164d.m23907a(c5161a);
            Context context = (Context) C5164d.m23907a(c5161a2);
            if (z) {
                a = this.f27501b.m24881a(uri, context, null, false);
            } else {
                a = this.f27501b.m24880a(uri, context);
            }
            return C5164d.m23906a(a);
        } catch (zzcw e) {
            return null;
        }
    }
}
