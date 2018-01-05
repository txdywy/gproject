package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.fe;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class ParallaxContainer extends FrameLayout {
    public static final C6090b f30342a = C6090b.m28050a();
    public View f30343b;
    public RecyclerView f30344c;
    public boolean f30345d;
    public fe f30346e;
    public float f30347f;

    public ParallaxContainer(Context context) {
        this(context, null);
    }

    public ParallaxContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ParallaxContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30347f = 0.6f;
    }

    public void setParallaxAntiscrollRatio(float f) {
        this.f30347f = f;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (this.f30344c == null && (parent instanceof View)) {
            ViewParent parent2 = parent.getParent();
            if (parent2 instanceof RecyclerView) {
                this.f30344c = (RecyclerView) parent2;
                this.f30343b = (View) parent;
                boolean z = RecyclerView.m262d(this.f30343b) == 0;
                if (this.f30345d != z) {
                    this.f30345d = z;
                    requestLayout();
                }
            } else {
                parent = parent2;
            }
        }
        if (this.f30344c != null) {
            if (this.f30346e == null) {
                this.f30346e = new aa(this);
            }
            this.f30344c.mo2951a(this.f30346e);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f30344c != null) {
            this.f30344c.mo2952b(this.f30346e);
            this.f30344c = null;
            this.f30343b = null;
        }
        m28174a(0.0f);
    }

    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        C6116b.m28104a(MeasureSpec.getMode(i) != 0, "Can't deal with UNSPECIFIED width spec");
        if (MeasureSpec.getMode(i2) == 0) {
            f30342a.m28055a(null, "UNSPECIFIED height spec encountered; setting to 0", new Object[0]);
            i2 = MeasureSpec.makeMeasureSpec(0, MemoryMappedFileBuffer.DEFAULT_SIZE);
        }
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        if (this.f30344c != null) {
            size = this.f30344c.getHeight();
            measuredHeight = size == 0 ? this.f30344c.getMeasuredHeight() : size;
        } else {
            measuredHeight = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (getMeasureAllChildren() || childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int childMeasureSpec = getChildMeasureSpec(i, 0, layoutParams.width);
                if (layoutParams.height != -1) {
                    size = getChildMeasureSpec(i2, 0, layoutParams.height);
                } else if (this.f30345d || measuredHeight == 0 || size2 == 0 || size2 >= measuredHeight) {
                    size = MeasureSpec.makeMeasureSpec(size2, MemoryMappedFileBuffer.DEFAULT_SIZE);
                } else {
                    size = MeasureSpec.makeMeasureSpec(Math.round(((float) (measuredHeight - size2)) * this.f30347f) + size2, MemoryMappedFileBuffer.DEFAULT_SIZE);
                }
                childAt.measure(childMeasureSpec, size);
            }
        }
    }

    final void m28174a(float f) {
        int round = Math.round(f);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setTranslationY((float) round);
        }
    }
}
