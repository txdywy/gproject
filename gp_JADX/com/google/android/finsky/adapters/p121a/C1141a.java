package com.google.android.finsky.adapters.p121a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.layout.structuredreviews.C3721a;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public abstract class C1141a implements C1140e {
    public final List f7130a = new ArrayList();
    public final ad f7131b;
    public final CharSequence f7132c;
    public final Context f7133d;
    public C3721a f7134e;
    public C1147f f7135f;

    public C1141a(Context context, byte[] bArr, CharSequence charSequence, ad adVar) {
        this.f7133d = context;
        this.f7132c = charSequence;
        this.f7131b = new C2473o(mo1464a(), bArr, adVar);
    }

    protected abstract int mo1464a();

    public final void mo1458b() {
        this.f7131b.getParentNode().mo1219a(this.f7131b);
    }

    public final void mo1456a(C1148g c1148g) {
        if (!this.f7130a.contains(c1148g)) {
            this.f7130a.add(c1148g);
        }
    }

    public final void mo1459b(C1148g c1148g) {
        this.f7130a.remove(c1148g);
    }

    public final ad mo1460c() {
        return this.f7131b;
    }

    public final void mo1455a(C1147f c1147f) {
        this.f7135f = c1147f;
    }

    protected final void m6945a(String str, int i, int i2) {
        for (int size = this.f7130a.size() - 1; size >= 0; size--) {
            ((C1148g) this.f7130a.get(size)).mo3083a(this, str, i, i2);
        }
    }

    protected final void m6949d() {
        if (this.f7135f != null) {
            this.f7135f.mo3012a();
        }
    }

    public CharSequence mo1461e() {
        return this.f7133d.getResources().getString(C7582R.string.structured_review_question_skip);
    }

    public final void mo1457a(C3721a c3721a) {
        this.f7134e = c3721a;
    }

    public void mo1454a(Bundle bundle) {
    }

    public final void mo1462f() {
        if (this.f7134e != null) {
            this.f7134e.mo3618b();
        }
    }

    public final void mo1463g() {
    }
}
