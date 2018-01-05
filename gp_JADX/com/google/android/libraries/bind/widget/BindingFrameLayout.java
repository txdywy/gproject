package com.google.android.libraries.bind.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.google.android.libraries.bind.C5877c;
import com.google.android.libraries.bind.card.C5892j;
import com.google.android.libraries.bind.data.C5878d;
import com.google.android.libraries.bind.data.C5881b;
import com.google.android.libraries.bind.data.C5895c;
import com.google.android.libraries.bind.data.C5899h;
import com.google.android.libraries.bind.data.C5902l;
import com.google.android.libraries.bind.data.Data;

public class BindingFrameLayout extends C5879b implements C5881b {
    public final C5913a G_;

    public BindingFrameLayout(Context context) {
        this(context, null, 0);
    }

    public BindingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BindingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.G_ = new C5913a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5877c.BindingFrameLayout);
        this.G_.f29471h = obtainStyledAttributes.getBoolean(C5877c.BindingFrameLayout_bind__isOwnedByParent, false);
        obtainStyledAttributes.getBoolean(C5877c.BindingFrameLayout_bind__supportsAnimationCapture, true);
        obtainStyledAttributes.recycle();
    }

    public C5913a getBindingViewGroupHelper() {
        return this.G_;
    }

    public void setDataRow(C5899h c5899h) {
        this.G_.mo5201a(c5899h);
    }

    public C5899h getDataRow() {
        return this.G_.f29434b;
    }

    public Data getData() {
        return this.G_.mo5200a();
    }

    public void setCardGroup(C5892j c5892j) {
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        C5913a.m27399a(this.G_.f29470g);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C5902l c5902l = this.G_;
        c5902l.f29437e = false;
        c5902l.f29438f = false;
        c5902l.m27366c();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C5902l c5902l = this.G_;
        c5902l.f29437e = true;
        c5902l.f29438f = false;
        c5902l.m27366c();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        C5902l c5902l = this.G_;
        c5902l.f29438f = true;
        c5902l.m27366c();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.G_.m27365b();
    }

    public final void mo5187a(Data data) {
        C5913a c5913a = this.G_;
        c5913a.f29480r = data;
        c5913a.mo5202d();
        if (c5913a.f29470g instanceof C5878d) {
            ((C5878d) c5913a.f29470g).a_(data);
        }
        C5913a.m27400a(c5913a.f29470g, data);
    }

    public void draw(Canvas canvas) {
        C5913a c5913a = this.G_;
        if (c5913a.f29473j != C5895c.SHOW_SOURCE_HIDE_DESTINATION && (c5913a.f29470g instanceof C5881b)) {
            ((C5881b) c5913a.f29470g).mo5186a(canvas);
        }
        if (c5913a.f29474k != null && !c5913a.f29474k.isRecycled() && !c5913a.f29472i) {
            float currentTimeMillis = ((float) (System.currentTimeMillis() - c5913a.f29478o)) / ((float) c5913a.f29479p);
            if (currentTimeMillis >= 1.0f) {
                c5913a.mo5202d();
                return;
            }
            if (!c5913a.f29477n) {
                Rect rect;
                c5913a.f29476m.left = 0;
                c5913a.f29476m.top = 0;
                c5913a.f29476m.right = c5913a.f29470g.getWidth();
                c5913a.f29476m.bottom = c5913a.f29470g.getHeight();
                if (c5913a.f29475l.left < 0) {
                    rect = c5913a.f29476m;
                    rect.left += ((-c5913a.f29475l.left) * c5913a.f29470g.getWidth()) / c5913a.f29475l.width();
                }
                if (c5913a.f29475l.top < 0) {
                    rect = c5913a.f29476m;
                    rect.top += ((-c5913a.f29475l.top) * c5913a.f29470g.getHeight()) / c5913a.f29475l.height();
                }
                if (c5913a.f29475l.right > c5913a.f29474k.getWidth()) {
                    rect = c5913a.f29476m;
                    rect.right -= ((c5913a.f29475l.right - c5913a.f29474k.getWidth()) * c5913a.f29470g.getWidth()) / c5913a.f29475l.width();
                }
                if (c5913a.f29475l.bottom > c5913a.f29474k.getHeight()) {
                    rect = c5913a.f29476m;
                    rect.bottom -= ((c5913a.f29475l.bottom - c5913a.f29474k.getHeight()) * c5913a.f29470g.getHeight()) / c5913a.f29475l.height();
                }
                c5913a.f29475l.left = Math.max(0, c5913a.f29475l.left);
                c5913a.f29475l.top = Math.max(0, c5913a.f29475l.top);
                c5913a.f29475l.right = Math.min(c5913a.f29474k.getWidth(), c5913a.f29475l.right);
                c5913a.f29475l.bottom = Math.min(c5913a.f29474k.getHeight(), c5913a.f29475l.bottom);
                c5913a.f29477n = true;
            }
            if (c5913a.f29473j == C5895c.FADE_SOURCE_ONLY) {
                C5913a.f29469q.setAlpha((int) Math.floor((double) ((1.0f - currentTimeMillis) * 255.0f)));
            }
            canvas.drawBitmap(c5913a.f29474k, c5913a.f29475l, c5913a.f29476m, C5913a.f29469q);
            c5913a.f29470g.invalidate();
        }
    }

    public void setOwnedByParent(boolean z) {
        this.G_.f29471h = z;
    }

    public final boolean mo5188a() {
        return this.G_.f29471h;
    }

    public final void mo5186a(Canvas canvas) {
        super.draw(canvas);
    }

    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i, int i2) {
        C5902l c5902l = this.G_;
        if (c5902l.f29438f) {
            c5902l.m27365b();
        }
        super.onMeasure(i, i2);
    }
}
