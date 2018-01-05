package com.google.android.instantapps.common.p217e;

import com.google.android.gms.phenotype.C5550i;
import com.google.android.gms.phenotype.C5551j;
import com.google.android.gms.phenotype.C5560s;
import com.google.android.gms.phenotype.C5561t;
import com.google.android.gms.phenotype.C5562u;
import com.google.android.gms.phenotype.C5563v;
import com.google.android.instantapps.common.C5804k;

public final class bg {
    public static final C5804k f29097a = new C5804k("SafePhenotypeFlag");
    public final C5551j f29098b;

    public bg(String str) {
        this(new C5551j(str));
    }

    bg(C5551j c5551j) {
        this.f29098b = c5551j;
    }

    public final bg m27118a(String str) {
        C5551j c5551j = this.f29098b;
        return new bg(new C5551j(c5551j.f28460a, c5551j.f28461b, c5551j.f28462c, str, c5551j.f28464e, c5551j.f28465f));
    }

    public final bf m27115a(String str, long j) {
        return bg.m27112a(new C5560s(this.f29098b, str, Long.valueOf(j)), str, Long.valueOf(j));
    }

    public final bf m27117a(String str, boolean z) {
        return bg.m27112a(new C5562u(this.f29098b, str, Boolean.valueOf(z)), str, Boolean.valueOf(z));
    }

    public final bf m27114a(String str, int i) {
        return bg.m27112a(new C5561t(this.f29098b, str, Integer.valueOf(i)), str, Integer.valueOf(i));
    }

    public final bf m27116a(String str, String str2) {
        return bg.m27112a(new C5563v(this.f29098b, str, str2), str, str2);
    }

    static bf m27112a(C5550i c5550i, String str, Object obj) {
        return new bi(obj, c5550i, str);
    }
}
