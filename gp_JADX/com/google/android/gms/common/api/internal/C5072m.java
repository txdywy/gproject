package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.ap;
import java.util.Iterator;

public final class C5072m implements aj {
    public final ak f25874a;
    public boolean f25875b = false;

    public C5072m(ak akVar) {
        this.f25874a = akVar;
    }

    public final cn mo4534a(cn cnVar) {
        return mo4539b(cnVar);
    }

    public final void mo4535a() {
    }

    public final void mo4536a(int i) {
        this.f25874a.m23390a(null);
        this.f25874a.f25693o.mo4546a(i, this.f25875b);
    }

    public final void mo4537a(Bundle bundle) {
    }

    public final void mo4538a(ConnectionResult connectionResult, C5053a c5053a, boolean z) {
    }

    public final cn mo4539b(cn cnVar) {
        try {
            this.f25874a.f25692n.f25666y.m23509a((ct) cnVar);
            ac acVar = this.f25874a.f25692n;
            C4948f c4948f = (C4949i) acVar.f25657p.get(cnVar.f25455b);
            am.m23734a((Object) c4948f, (Object) "Appropriate Api was not requested.");
            if (c4948f.m23040j() || !this.f25874a.f25685g.containsKey(cnVar.f25455b)) {
                if (c4948f instanceof ap) {
                    c4948f = ap.m23746f();
                }
                cnVar.m23085b(c4948f);
                return cnVar;
            }
            cnVar.m23084b(new Status(17));
            return cnVar;
        } catch (DeadObjectException e) {
            this.f25874a.m23392a(new C5073n(this, this));
        }
    }

    public final void mo4541c() {
        if (this.f25875b) {
            this.f25875b = false;
            this.f25874a.m23392a(new C5074o(this, this));
        }
    }

    public final boolean mo4540b() {
        if (this.f25875b) {
            return false;
        }
        if (this.f25874a.f25692n.m23363m()) {
            this.f25875b = true;
            Iterator it = this.f25874a.f25692n.f25665x.iterator();
            if (!it.hasNext()) {
                return false;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        this.f25874a.m23390a(null);
        return true;
    }
}
