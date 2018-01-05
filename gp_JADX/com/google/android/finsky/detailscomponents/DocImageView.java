package com.google.android.finsky.detailscomponents;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.p028a.C0216d;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.Arrays;

@Deprecated
public class DocImageView extends FifeImageView {
    public static final int[] f13711a = new int[]{4, 0};
    public C1461c f13712b;
    public af f13713c;
    public Document f13714d;
    public int[] f13715e;
    public boolean f13716f;
    public float f13717g;

    public DocImageView(Context context) {
        this(context, null);
    }

    public DocImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13716f = false;
        this.f13717g = Float.NaN;
        ((C1375d) C3947d.m18649a(C1375d.class)).mo1802a(this);
    }

    public void setShouldUseHighlightsCardExtraLargeHeight(boolean z) {
        this.f13716f = z;
    }

    protected void onMeasure(int i, int i2) {
        if (this.f13716f) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(10000, MemoryMappedFileBuffer.DEFAULT_SIZE));
        } else {
            super.onMeasure(i, i2);
        }
    }

    public final void m13584a(Document document, C1294w c1294w, int... iArr) {
        int i = (this.f13714d != null && this.f13714d == document && Arrays.equals(this.f13715e, iArr)) ? 1 : 0;
        if (i == 0) {
            bd a;
            this.f13714d = document;
            this.f13715e = iArr;
            i = getWidth();
            int height = getHeight();
            if (height > 0) {
                a = af.m9220a(this.f13714d, 0, height, this.f13715e);
            } else {
                a = af.m9220a(this.f13714d, i, 0, this.f13715e);
            }
            this.f13717g = Float.NaN;
            if (a != null) {
                a(a.f11860f, a.f11863i, c1294w);
                if (a.f11859e != null) {
                    this.f13717g = ((float) a.f11859e.f11879c) / ((float) a.f11859e.f11878b);
                    return;
                }
                return;
            }
            a();
        }
    }

    public float getAspectRatio() {
        return this.f13717g;
    }

    public final void m13583a() {
        super.a();
        this.f13714d = null;
        this.f13715e = null;
        setBackgroundColor(0);
    }

    protected final synchronized void m13585a(boolean z, Bitmap bitmap) {
        super.a(z, bitmap);
        if (z) {
            setBackgroundColor(0);
        } else {
            setBackgroundColor(C0216d.m1116c(getContext(), C7582R.color.placeholder_grey));
        }
    }
}
