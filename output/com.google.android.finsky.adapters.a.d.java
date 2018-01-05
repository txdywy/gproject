package com.google.android.finsky.adapters.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.cv.a.iu;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.layout.structuredreviews.ReviewCommentQuestion;
import com.google.android.finsky.layout.structuredreviews.a;
import java.util.List;

public final class com.google.android.finsky.adapters.a.d extends com.google.android.finsky.adapters.a.a implements com.google.android.finsky.layout.structuredreviews.c
{

    public final int g;
    public String h;
    public boolean i;
    public String j;

    d(Context p0, byte[] p1, CharSequence p2, int p3, com.google.android.finsky.d.ad p4) {
        com.google.android.finsky.adapters.a.a(p0, p1, p2, p4);
        this.g = p3;
    }

    protected final int a() {
        return 6004;
    }

    public final void a(Bundle p0) {
        if (this.i != 0)
            p0.putString("review_comment_question_controller.tmp_text", this.j);
    }

    public final void a(com.google.android.finsky.layout.structuredreviews.a p0, com.google.android.finsky.cv.a.iu p1, Bundle p2) {
        if (p1 != 0)
            v0 = p1.h;
        else
            v0 = 0;
        this.h = v0;
        v0 = p2.getString("review_comment_question_controller.tmp_text", 0);
        if (v0 != 0)
            this.a(v0);
        else
            this.i = 0;
        p2.remove("review_comment_question_controller.tmp_text");
        if (this.i == 0)
            v0 = this.h;
        ((ReviewCommentQuestion)p0).a(this.c, this.g, v0);
        ((ReviewCommentQuestion)p0).setReviewCommentListener(this);
    }

    public final void a(String p0) {
        if (!TextUtils.equals(p0, this.h))
            v0 = 1;
        else
            v0 = 0;
        this.i = v0;
        if (this.i != 0)
            this.d();
        this.j = p0;
    }

    public final void b(String p0) {
        if (this.i != 0) {
            v1 = this.a.size() - 1;
            while (v1 >= 0) {
                ((com.google.android.finsky.adapters.a.g)this.a.get(v1)).a(this, p0);
                v1 = v1 - 1;
            }
        }
    }

    public final CharSequence e() {
        if (this.i != 0)
            v0 = this.d.getResources().getString(2131953204);
        else
            v0 = super.e();
        return v0;
    }

    public final int h() {
        return 2130969336;
    }

}
