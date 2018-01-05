package com.google.android.finsky.adapters.p121a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.frameworkviews.PlayRatingBar;
import com.google.android.finsky.frameworkviews.ac;
import com.google.android.finsky.layout.structuredreviews.C1149i;
import com.google.android.finsky.layout.structuredreviews.C3721a;
import com.google.android.finsky.layout.structuredreviews.ReviewRatingQuestion;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public class C1150h extends C1141a implements ac, C1149i {
    public boolean f7143g;
    public int f7144h;

    public C1150h(Context context, byte[] bArr, CharSequence charSequence, boolean z, int i, ad adVar) {
        super(context, bArr, charSequence, adVar);
        this.f7143g = z;
        this.f7144h = i;
    }

    public final int mo1466h() {
        return C7582R.layout.review_rating_question;
    }

    public void mo1474a(ReviewRatingQuestion reviewRatingQuestion, iu iuVar) {
        int i;
        CharSequence charSequence = this.c;
        if (iuVar != null) {
            i = iuVar.f12717e;
        } else {
            i = 0;
        }
        reviewRatingQuestion.m17601a(charSequence, i, this.f7144h, this.f7143g, this, this, false, false);
    }

    public void mo1471a(int i) {
        for (int size = this.f7130a.size() - 1; size >= 0; size--) {
            ((C1148g) this.f7130a.get(size)).mo3081a((C1140e) this, i);
        }
        this.f7143g = false;
    }

    public final void mo1472a(PlayRatingBar playRatingBar, int i) {
        m6949d();
    }

    protected int mo1464a() {
        return 6002;
    }

    public final CharSequence mo1461e() {
        return this.d.getResources().getString(C7582R.string.structured_review_question_submit);
    }

    public /* bridge */ /* synthetic */ void mo1465a(C3721a c3721a, iu iuVar, Bundle bundle) {
        mo1474a((ReviewRatingQuestion) c3721a, iuVar);
    }
}
