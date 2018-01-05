package com.google.android.instantapps.common.p217e;

import com.google.android.gms.phenotype.C5563v;
import java.util.Arrays;
import java.util.Iterator;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C5753o implements C0000a {
    public final C0000a f29157a;

    public C5753o(C0000a c0000a) {
        this.f29157a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        bg a = ((bg) this.f29157a.mo1a()).m27118a("Supervisor__");
        String str = "instantAppsDisabledNetworks";
        Iterator it = Arrays.asList(C5741c.f29134a).iterator();
        String str2 = ",";
        StringBuilder stringBuilder = new StringBuilder();
        while (it.hasNext()) {
            stringBuilder.append(it.next());
            if (it.hasNext()) {
                stringBuilder.append(str2);
            }
        }
        String stringBuilder2 = stringBuilder.toString();
        return (bf) C0004c.m7a(new bh(bg.m27112a(new C5563v(a.f29098b, str, stringBuilder2), str, stringBuilder2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
