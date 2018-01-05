package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.utils.c;

public class PersonAvatarView extends FifeImageView {
    public PersonAvatarView(Context context) {
        this(context, null);
    }

    public PersonAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PersonAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void m17564a(cv cvVar, C1294w c1294w) {
        bd a = c.a(cvVar, 4);
        a(a.f11860f, a.f11863i, c1294w);
    }
}
