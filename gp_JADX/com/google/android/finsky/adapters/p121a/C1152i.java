package com.google.android.finsky.adapters.p121a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.cv.p177a.jx;
import com.google.android.finsky.cv.p177a.ka;
import com.google.android.finsky.layout.structuredreviews.C1151k;
import com.google.android.finsky.layout.structuredreviews.C3721a;
import com.google.android.finsky.layout.structuredreviews.ReviewStructuredQuestion;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C1152i extends C1141a implements C1151k {
    public final String f7145g;
    public final C2495w f7146h;
    public List f7147i = new ArrayList();

    public C1152i(Context context, byte[] bArr, CharSequence charSequence, ka kaVar, ad adVar, C2495w c2495w) {
        super(context, bArr, charSequence, adVar);
        this.f7145g = kaVar.f12851b;
        this.f7146h = c2495w;
        Collections.addAll(this.f7147i, kaVar.f12853d);
    }

    public final int mo1466h() {
        return C7582R.layout.review_structured_question;
    }

    public final void mo1473a(int i) {
        this.f7146h.m13379b(new C2475d(this.f7131b).m13256a(6005));
        m6945a(this.f7145g, i, 0);
    }

    protected final int mo1464a() {
        return 6003;
    }

    public final /* synthetic */ void mo1465a(C3721a c3721a, iu iuVar, Bundle bundle) {
        int i;
        boolean z = false;
        ReviewStructuredQuestion reviewStructuredQuestion = (ReviewStructuredQuestion) c3721a;
        CharSequence charSequence = this.c;
        List list = this.f7147i;
        if (!(iuVar == null || iuVar.f12730r == null)) {
            for (jx jxVar : iuVar.f12730r.f12860a) {
                if (this.f7145g.equals(jxVar.f12838c)) {
                    i = jxVar.f12839d;
                    break;
                }
            }
        }
        i = 0;
        if (iuVar == null) {
            z = true;
        }
        reviewStructuredQuestion.m17605a(charSequence, list, i, z, this);
    }
}
