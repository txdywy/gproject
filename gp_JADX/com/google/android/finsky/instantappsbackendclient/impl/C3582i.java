package com.google.android.finsky.instantappsbackendclient.impl;

import android.accounts.AccountManager;
import android.content.Context;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C3582i implements C0000a {
    public final C0000a f17880a;

    public C3582i(C0000a c0000a) {
        this.f17880a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        return (AccountManager) C0004c.m7a(AccountManager.get((Context) this.f17880a.mo1a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
