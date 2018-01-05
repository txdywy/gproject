package com.google.android.gms.phenotype.core.service.operations;

import android.support.v4.p037h.C0314i;
import com.google.android.gms.phenotype.core.C5524c;

final class C5541g extends C0314i {
    C5541g() {
        super(10000);
    }

    protected final /* synthetic */ int mo1107b(Object obj, Object obj2) {
        int i = 0;
        C5524c c5524c = (C5524c) obj2;
        int length = ((String) obj).length() * 2;
        int length2 = ((((((c5524c.f28374d == null ? 0 : c5524c.f28374d.length) + (c5524c.f28373c.length() * 2)) + C5524c.m26452a(c5524c.f28375e)) + C5524c.m26452a(c5524c.f28376f)) + C5524c.m26452a(c5524c.f28377g)) + C5524c.m26452a(c5524c.f28378h)) + C5524c.m26452a(c5524c.f28380j);
        if (c5524c.f28379i != null) {
            i = c5524c.f28379i.length;
        }
        return (length2 + (i * 4)) + length;
    }
}
