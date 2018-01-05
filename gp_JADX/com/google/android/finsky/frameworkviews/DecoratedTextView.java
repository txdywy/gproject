package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.layout.a;

public class DecoratedTextView extends PlayTextView implements y, a {
    public DecoratedTextView(Context context) {
        super(context);
    }

    public DecoratedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void m16019a(C1294w c1294w, bd bdVar, int i) {
        if (!bdVar.f11863i) {
            i = 0;
        }
        Bitmap b = c1294w.mo1671a(bdVar.f11860f, i, i, this).b();
        if (b != null) {
            setDecorationBitmap(b);
        }
    }

    public final void m16020a(x xVar) {
        Bitmap b = xVar.b();
        if (b != null) {
            setDecorationBitmap(b);
        }
    }

    public void setShouldScreenread(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        ai.m1838b((View) this, i);
    }

    public final void m16018a() {
        setCompoundDrawables(null, null, null, null);
    }

    public final /* synthetic */ void b_(Object obj) {
        m16020a((x) obj);
    }
}
