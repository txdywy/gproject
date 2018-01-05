package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.api.C5022m;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.internal.bd;

public final class C5063d extends C5022m {
    public final C4949i f25841j;
    public final cx f25842k;
    public final bd f25843l;
    public final C4931e f25844m;

    public C5063d(Context context, C5053a c5053a, Looper looper, C4949i c4949i, cx cxVar, bd bdVar, C4931e c4931e) {
        super(context, c5053a, looper);
        this.f25841j = c4949i;
        this.f25842k = cxVar;
        this.f25843l = bdVar;
        this.f25844m = c4931e;
        this.i.m23419a((C5022m) this);
    }

    public final C4949i mo4602a(Looper looper, aq aqVar) {
        this.f25842k.f25826c = aqVar;
        return this.f25841j;
    }

    public final bp mo4603a(Context context, Handler handler) {
        return new bp(context, handler, this.f25843l, this.f25844m);
    }
}
