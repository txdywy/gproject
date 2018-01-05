package com.google.android.play.p179a;

import com.google.android.play.p179a.p352a.ad;
import com.google.android.play.p179a.p352a.ao;

final class C6226k implements Runnable {
    public final /* synthetic */ String f31157a;
    public final /* synthetic */ ad f31158b;
    public final /* synthetic */ byte[] f31159c;
    public final /* synthetic */ long f31160d;
    public final /* synthetic */ ao f31161e;
    public final /* synthetic */ String[] f31162f;
    public final /* synthetic */ C6223h f31163g;

    C6226k(C6223h c6223h, String str, ad adVar, byte[] bArr, long j, ao aoVar, String[] strArr) {
        this.f31163g = c6223h;
        this.f31157a = str;
        this.f31158b = adVar;
        this.f31159c = bArr;
        this.f31160d = j;
        this.f31161e = aoVar;
        this.f31162f = strArr;
    }

    public final void run() {
        this.f31163g.m28726b(this.f31157a, this.f31158b, this.f31159c, this.f31160d, this.f31161e, this.f31162f);
    }
}
