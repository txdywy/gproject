package com.google.android.finsky.installqueue;

import android.text.TextUtils;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installer.p208b.p209a.C3312b;
import com.google.android.finsky.installer.p208b.p209a.C3314d;
import com.google.android.finsky.installer.p208b.p209a.C3317g;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C4668b;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.ci;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class C3366j {
    public List f17265a;
    public C3314d f17266b;

    public C3366j(C2470a c2470a, String str, int i, String str2) {
        this.f17265a = Collections.singletonList(InstallConstraint.f17166a);
        this.f17266b = new C3314d();
        this.f17266b.f17132b = c2470a;
        this.f17266b.m16662a(str);
        this.f17266b.m16661a(i);
        this.f17266b.m16666b(str2);
        this.f17266b.f17145o = new C3317g();
    }

    @Deprecated
    public C3366j(C2495w c2495w, String str, int i, String str2) {
        this(c2495w.m13381c(), str, i, str2);
    }

    @Deprecated
    public C3366j(C2495w c2495w, Document document) {
        this(c2495w.m13381c(), document);
    }

    @Deprecated
    public C3366j(C2495w c2495w, ci ciVar) {
        this(c2495w.m13381c(), ciVar);
    }

    public C3366j(C2470a c2470a, Document document) {
        this(c2470a, document.cf(), document.m14653h(), document.f14885a.f12100g);
        m16808a(document.m14671z());
        C3314d c3314d = this.f17266b;
        boolean bV = document.bV();
        c3314d.f17131a |= 128;
        c3314d.f17142l = bV;
    }

    private C3366j(C2470a c2470a, ci ciVar) {
        this(c2470a, ciVar.c.f11833b, ciVar.e, ciVar.d);
    }

    public C3366j(InstallRequest installRequest) {
        this(installRequest.f17171a.f17132b, installRequest.f17171a.f17133c, installRequest.f17171a.f17134d, installRequest.f17171a.f17138h);
        this.f17265a = installRequest.f17172b;
        m16807a(installRequest.f17171a.f17136f);
        m16809a(installRequest.m16702a());
        this.f17266b = new C3314d();
        try {
            C0757i.m4905a(this.f17266b, C0757i.m4909a(installRequest.f17171a));
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Should never fail as we serialize proto ourselves", new Object[0]);
        }
    }

    public final C3366j m16810a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f17266b.m16667c("unknown");
            C2470a c2470a = this.f17266b.f17132b;
            c2470a.f13308d = "";
            c2470a.f13306b &= -3;
        } else {
            this.f17266b.m16667c(str);
            this.f17266b.f17132b.m13172a(str);
        }
        return this;
    }

    public final C3366j m16815b(String str) {
        C3314d c3314d;
        if (TextUtils.isEmpty(str)) {
            C2470a c2470a = this.f17266b.f17132b;
            c2470a.f13309e = "";
            c2470a.f13306b &= -5;
            this.f17266b.f17132b.m13173a(true);
            c3314d = this.f17266b;
            c3314d.f17137g = "";
            c3314d.f17131a &= -9;
        } else {
            this.f17266b.f17132b.m13177b(str);
            this.f17266b.f17132b.m13173a(false);
            c3314d = this.f17266b;
            if (str == null) {
                throw new NullPointerException();
            }
            c3314d.f17131a |= 8;
            c3314d.f17137g = str;
        }
        return this;
    }

    public final C3366j m16811a(List list) {
        this.f17265a = Collections.unmodifiableList(list);
        this.f17266b.f17135e = (C3312b[]) C4668b.m21678a(list, InstallConstraint.f17167d).toArray(new C3312b[list.size()]);
        return this;
    }

    public final C3366j m16813a(InstallConstraint... installConstraintArr) {
        this.f17265a = Collections.unmodifiableList(Arrays.asList(installConstraintArr));
        this.f17266b.f17135e = (C3312b[]) C4668b.m21679a((Object[]) installConstraintArr, InstallConstraint.f17167d).toArray(new C3312b[installConstraintArr.length]);
        return this;
    }

    public final C3366j m16807a(int i) {
        C3314d c3314d = this.f17266b;
        c3314d.f17131a |= 4;
        c3314d.f17136f = i;
        return this;
    }

    public final C3366j m16814b(int i) {
        C3314d c3314d = this.f17266b;
        c3314d.f17131a |= 32;
        c3314d.f17139i = i;
        return this;
    }

    public final C3366j m16808a(es esVar) {
        this.f17266b.f17140j = esVar;
        return this;
    }

    public final C3366j m16816c(String str) {
        C3314d c3314d;
        if (TextUtils.isEmpty(str)) {
            c3314d = this.f17266b;
            c3314d.f17141k = "";
            c3314d.f17131a &= -65;
        } else {
            c3314d = this.f17266b;
            if (str == null) {
                throw new NullPointerException();
            }
            c3314d.f17131a |= 64;
            c3314d.f17141k = str;
        }
        return this;
    }

    public final C3366j m16812a(boolean z) {
        C3314d c3314d = this.f17266b;
        c3314d.f17131a |= 256;
        c3314d.f17143m = z;
        return this;
    }

    public final C3366j m16809a(C3367k c3367k) {
        this.f17266b.f17145o = c3367k.f17270d;
        return this;
    }

    public final C3366j m16817d(String str) {
        C3314d c3314d;
        if (TextUtils.isEmpty(str)) {
            c3314d = this.f17266b;
            c3314d.f17146p = "";
            c3314d.f17131a &= -1025;
        } else {
            c3314d = this.f17266b;
            if (str == null) {
                throw new NullPointerException();
            }
            c3314d.f17131a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
            c3314d.f17146p = str;
        }
        return this;
    }

    public final InstallRequest m16806a() {
        return new InstallRequest(this.f17266b, this.f17265a);
    }
}
