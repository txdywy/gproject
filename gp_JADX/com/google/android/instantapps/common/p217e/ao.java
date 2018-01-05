package com.google.android.instantapps.common.p217e;

import com.google.android.gms.phenotype.C5551j;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class ao implements C0000a {
    public final C0000a f29048a;

    public ao(C0000a c0000a) {
        this.f29048a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        String str = (String) this.f29048a.mo1a();
        bg bgVar = new bg("phenotypeConfigurations");
        String stringBuilder = new StringBuilder(String.valueOf(str).length() + 1).append(str).append('.').toString();
        C5551j c5551j = bgVar.f29098b;
        if (!c5551j.f28464e) {
            return (bg) C0004c.m7a(new bg(new C5551j(c5551j.f28460a, c5551j.f28461b, stringBuilder, c5551j.f28463d, c5551j.f28464e, c5551j.f28465f)), "Cannot return null from a non-@Nullable @Provides method");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }
}
