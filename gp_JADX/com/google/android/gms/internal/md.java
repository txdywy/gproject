package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C5058o;

final class md extends ma {
    public /* synthetic */ byte[] f27170u;
    public /* synthetic */ String f27171v = null;

    md(C5058o c5058o, byte[] bArr) {
        this.f27170u = bArr;
        super(c5058o);
    }

    protected final /* synthetic */ void mo4496a(C4948f c4948f) {
        String a;
        mi miVar = (mi) c4948f;
        lu luVar = this.a;
        byte[] bArr = this.f27170u;
        CharSequence charSequence = this.f27171v;
        if (TextUtils.isEmpty(charSequence)) {
            a = miVar.m25158a("com.google.android.safetynet.ATTEST_API_KEY");
        } else {
            CharSequence charSequence2 = charSequence;
        }
        ((lw) miVar.m23032u()).mo4813a(luVar, bArr, a);
    }
}
