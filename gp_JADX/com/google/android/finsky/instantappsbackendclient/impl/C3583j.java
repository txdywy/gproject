package com.google.android.finsky.instantappsbackendclient.impl;

import android.content.Context;
import com.google.android.instantapps.common.p217e.bf;
import org.chromium.net.e;
import org.chromium.net.f;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C3583j implements C0000a {
    public final C0000a f17881a;
    public final C0000a f17882b;
    public final C0000a f17883c;
    public final C0000a f17884d;
    public final C0000a f17885e;

    public C3583j(C0000a c0000a, C0000a c0000a2, C0000a c0000a3, C0000a c0000a4, C0000a c0000a5) {
        this.f17881a = c0000a;
        this.f17882b = c0000a2;
        this.f17883c = c0000a3;
        this.f17884d = c0000a4;
        this.f17885e = c0000a5;
    }

    public final /* synthetic */ Object mo1a() {
        bf bfVar = (bf) this.f17882b.mo1a();
        bf bfVar2 = (bf) this.f17883c.mo1a();
        bf bfVar3 = (bf) this.f17884d.mo1a();
        bf bfVar4 = (bf) this.f17885e.mo1a();
        f fVar = new f((Context) this.f17881a.mo1a());
        fVar.b(((Boolean) bfVar2.mo5158a()).booleanValue());
        fVar.a.c(((Boolean) bfVar3.mo5158a()).booleanValue());
        if (((Boolean) bfVar.mo5158a()).booleanValue()) {
            fVar.a(true).a((String) bfVar4.mo5158a(), 443, 443);
        }
        return (e) C0004c.m7a(fVar.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
