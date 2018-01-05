package com.google.android.finsky.adapters.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.finsky.cv.a.iu;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.frameworkviews.PlayRatingBar;
import com.google.android.finsky.layout.structuredreviews.ReviewRatingQuestion;
import com.google.android.finsky.layout.structuredreviews.a;
import java.util.List;

public final class com.google.android.finsky.adapters.a.h extends com.google.android.finsky.adapters.a.a implements com.google.android.finsky.frameworkviews.ac, com.google.android.finsky.layout.structuredreviews.i
{

    public boolean g;
    public int h;

    h(Context p0, byte[] p1, CharSequence p2, boolean p3, int p4, com.google.android.finsky.d.ad p5) {
        com.google.android.finsky.adapters.a.a(p0, p1, p2, p5);
        this.g = p3;
        this.h = p4;
    }

    protected int a() {
        return 6002;
    }

    public void a(int p0) {
        v1 = this.a.size() - 1;
        while (v1 >= 0) {
            ((com.google.android.finsky.adapters.a.g)this.a.get(v1)).a(this, p0);
            v1 = v1 - 1;
        }
        this.g = 0;
    }

    public final void a(PlayRatingBar p0, int p1) {
        this.d();
    }

    public void a(ReviewRatingQuestion p0, com.google.android.finsky.cv.a.iu p1) {
        if (p1 != 0)
            v2 = p1.e;
        else
            v2 = 0;
        p0.a(this.c, v2, this.h, this.g, this, this, 0, 0);
    }

    public void a(com.google.android.finsky.layout.structuredreviews.a p0, com.google.android.finsky.cv.a.iu p1, Bundle p2) {
        this.a((ReviewRatingQuestion)p0, p1);
    }

    public final CharSequence e() {
        return this.d.getResources().getString(2131953204);
    }

    public final int h() {
        return 2130969339;
    }

}
