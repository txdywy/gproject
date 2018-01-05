package com.google.android.finsky.adapters.p121a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.cv.p177a.jx;
import com.google.android.finsky.cv.p177a.ka;
import com.google.android.finsky.layout.structuredreviews.C3721a;
import com.google.android.finsky.layout.structuredreviews.ReviewRatingQuestion;
import com.google.android.finsky.p111d.ad;

public final class C1153j extends C1150h {
    public final String f7148i;

    public C1153j(Context context, byte[] bArr, CharSequence charSequence, ka kaVar, int i, ad adVar) {
        super(context, bArr, charSequence, false, i, adVar);
        this.f7148i = kaVar.f12851b;
    }

    public final void mo1474a(ReviewRatingQuestion reviewRatingQuestion, iu iuVar) {
        int i;
        boolean z;
        CharSequence charSequence = this.c;
        if (!(iuVar == null || iuVar.f12730r == null)) {
            for (jx jxVar : iuVar.f12730r.f12860a) {
                if (this.f7148i.equals(jxVar.f12838c)) {
                    i = jxVar.f12840e;
                    break;
                }
            }
        }
        i = 0;
        if (iuVar == null) {
            z = true;
        } else {
            z = false;
        }
        reviewRatingQuestion.m17601a(charSequence, i, 3, false, this, this, z, true);
    }

    public final void mo1471a(int i) {
        m6945a(this.f7148i, 4, i);
    }

    protected final int mo1464a() {
        return 6003;
    }

    public final /* bridge */ /* synthetic */ void mo1465a(C3721a c3721a, iu iuVar, Bundle bundle) {
        mo1474a((ReviewRatingQuestion) c3721a, iuVar);
    }
}
