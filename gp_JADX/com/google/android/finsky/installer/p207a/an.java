package com.google.android.finsky.installer.p207a;

import android.net.Uri;
import android.support.v7.widget.eq;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p189e.C2956k;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

final class an implements C2956k {
    public final /* synthetic */ Uri f16935a;
    public final /* synthetic */ boolean f16936b;
    public final /* synthetic */ boolean f16937c;
    public final /* synthetic */ ah f16938d;

    an(ah ahVar, Uri uri, boolean z, boolean z2) {
        this.f16938d = ahVar;
        this.f16935a = uri;
        this.f16936b = z;
        this.f16937c = z2;
    }

    public final void mo3410a() {
        this.f16938d.f16898f.mo3179c(this.f16935a);
        FinskyLog.m21659a("Successfully copied APK to update %s (adid: %s , isid: %s)", this.f16938d.f16878I, this.f16938d.ag, this.f16938d.m16445e());
        this.f16938d.m16449i();
    }

    public final void mo3411a(int i) {
        this.f16938d.f16898f.mo3179c(this.f16935a);
        this.f16938d.m16447g();
        this.f16938d.ah.mo2281f();
        if (!this.f16938d.m16450j() || this.f16938d.ac == null) {
            if (this.f16936b) {
                if (this.f16938d.m16442b(512, (int) MemoryMappedFileBuffer.DEFAULT_PADDING)) {
                    return;
                }
            } else if (this.f16937c && !this.f16938d.ah.mo2282g() && this.f16938d.m16442b((int) eq.FLAG_APPEARED_IN_PRE_LAYOUT, 8192)) {
                return;
            }
            FinskyLog.m21667d("Error while copying download for %s (adid: %s , isid: %s). isExternal=%b isCompressed=%b", this.f16938d.f16878I, this.f16938d.ag, this.f16938d.m16445e(), Boolean.valueOf(this.f16936b), Boolean.valueOf(this.f16937c));
            ah ahVar = this.f16938d;
            ahVar.m16435a(false);
            ahVar.m16423a(5, i);
            ahVar.m16425a(i, null);
            return;
        }
        ahVar = this.f16938d;
        ahVar.f16874E.m11221a(ahVar.f16878I, new C2474c(3151).m13236a(ahVar.f16878I).m13231a(ahVar.f16893X).f13342a);
        C2127b c2127b = ahVar.f16900h;
        c2127b.mo2675d(ahVar.f16878I, c2127b.mo2657a(ahVar.f16878I).f10819m | eq.FLAG_MOVED);
        ahVar.ac.mo3420g();
        ahVar.ac = null;
        if (!ahVar.m16442b(4, 8)) {
            ahVar.m16439b(0, null);
            ahVar.m16443c();
        }
    }
}
