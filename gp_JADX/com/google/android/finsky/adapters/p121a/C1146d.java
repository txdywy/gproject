package com.google.android.finsky.adapters.p121a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.layout.structuredreviews.C1145c;
import com.google.android.finsky.layout.structuredreviews.C3721a;
import com.google.android.finsky.layout.structuredreviews.ReviewCommentQuestion;
import com.google.android.finsky.p111d.ad;
import com.squareup.leakcanary.C7582R;

public final class C1146d extends C1141a implements C1145c {
    public final int f7139g;
    public String f7140h;
    public boolean f7141i;
    public String f7142j;

    public C1146d(Context context, byte[] bArr, CharSequence charSequence, int i, ad adVar) {
        super(context, bArr, charSequence, adVar);
        this.f7139g = i;
    }

    public final int mo1466h() {
        return C7582R.layout.review_comment_question;
    }

    public final void mo1469a(String str) {
        this.f7141i = !TextUtils.equals(str, this.f7140h);
        if (this.f7141i) {
            m6949d();
        }
        this.f7142j = str;
    }

    public final CharSequence mo1461e() {
        if (this.f7141i) {
            return this.d.getResources().getString(C7582R.string.structured_review_question_submit);
        }
        return super.mo1461e();
    }

    public final void mo1454a(Bundle bundle) {
        if (this.f7141i) {
            bundle.putString("review_comment_question_controller.tmp_text", this.f7142j);
        }
    }

    public final void mo1470b(String str) {
        if (this.f7141i) {
            for (int size = this.f7130a.size() - 1; size >= 0; size--) {
                ((C1148g) this.f7130a.get(size)).mo3082a((C1140e) this, str);
            }
        }
    }

    protected final int mo1464a() {
        return 6004;
    }

    public final /* synthetic */ void mo1465a(C3721a c3721a, iu iuVar, Bundle bundle) {
        String str;
        ReviewCommentQuestion reviewCommentQuestion = (ReviewCommentQuestion) c3721a;
        if (iuVar != null) {
            str = iuVar.f12720h;
        } else {
            str = null;
        }
        this.f7140h = str;
        str = bundle.getString("review_comment_question_controller.tmp_text", null);
        if (str != null) {
            mo1469a(str);
        } else {
            this.f7141i = false;
        }
        bundle.remove("review_comment_question_controller.tmp_text");
        CharSequence charSequence = this.c;
        int i = this.f7139g;
        if (!this.f7141i) {
            str = this.f7140h;
        }
        reviewCommentQuestion.m17596a(charSequence, i, str);
        reviewCommentQuestion.setReviewCommentListener(this);
    }
}
