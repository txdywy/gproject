package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader.TileMode;
import android.text.BoringLayout;
import android.text.BoringLayout.Metrics;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.android.vending.C0629a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class FadingEdgeTextView extends View {
    public static final Metrics f19334a = new Metrics();
    public final TextPaint f19335b = new TextPaint(1);
    public final TextPaint f19336c = new TextPaint(1);
    public CharSequence f19337d = "";
    public Metrics f19338e = f19334a;
    public Layout f19339f;
    public Layout f19340g;
    public int f19341h = -1;
    public int f19342i;
    public int f19343j;
    public float f19344k;
    public float f19345l;
    public int f19346m = 1;

    public FadingEdgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.FadingEdgeTextView);
        this.f19343j = obtainStyledAttributes.getInteger(2, 2);
        this.f19342i = obtainStyledAttributes.getColor(1, -16777216);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 15);
        this.f19344k = (float) obtainStyledAttributes.getDimensionPixelSize(3, 0);
        obtainStyledAttributes.recycle();
        this.f19335b.setTextSize((float) dimensionPixelSize);
        this.f19335b.setColor(this.f19342i);
        this.f19336c.setTextSize((float) dimensionPixelSize);
        this.f19336c.setColor(-1);
    }

    public void setTextColor(int i) {
        if (this.f19342i != i) {
            this.f19342i = i;
            this.f19339f = null;
            this.f19335b.setColor(i);
            this.f19345l = Float.NaN;
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!charSequence.equals(this.f19337d)) {
            this.f19337d = charSequence;
            this.f19338e = f19334a;
            requestLayout();
        }
    }

    public void setMaxLines(int i) {
        if (this.f19343j != i) {
            this.f19343j = i;
            requestLayout();
        }
    }

    public int getLineCount() {
        Layout c = m18403c(getMeasuredWidth());
        if (c == null) {
            return 0;
        }
        int lineCount = c.getLineCount();
        if (this.f19341h != -1) {
            lineCount++;
        }
        return Math.min(lineCount, this.f19343j);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3) {
            this.f19345l = Float.NaN;
            invalidate();
        }
    }

    protected void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        if (mode == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            mode = MeasureSpec.getSize(i);
            if (mode == 0) {
                m18399a(i2);
            }
            if (MeasureSpec.getMode(i2) == MemoryMappedFileBuffer.DEFAULT_SIZE) {
                setMeasuredDimension(mode, MeasureSpec.getSize(i2));
            } else if (this.f19337d.length() == 0) {
                setMeasuredDimension(mode, 0);
            } else {
                m18400a(mode, true, i2);
            }
        } else if (this.f19337d.length() == 0) {
            m18399a(i2);
        } else {
            if (mode == Integer.MIN_VALUE) {
                mode = MeasureSpec.getSize(i);
                if (mode == 0) {
                    m18399a(i2);
                    return;
                }
            }
            mode = Integer.MAX_VALUE;
            m18400a(mode, false, i2);
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m18403c(i3 - i);
    }

    public void onDraw(Canvas canvas) {
        float f = 0.0f;
        if (this.f19339f != null) {
            if (this.f19341h == -1) {
                if (!(this.f19345l == 0.0f && this.f19346m == 1)) {
                    this.f19345l = 0.0f;
                    this.f19346m = 1;
                    m18398a(0.0f, 1, (float) getWidth(), this.f19342i);
                }
                this.f19339f.draw(canvas);
                return;
            }
            canvas.save();
            canvas.clipRect(0, 0, getWidth(), this.f19341h);
            this.f19339f.draw(canvas);
            canvas.restore();
            int paragraphDirection = this.f19340g.getParagraphDirection(0);
            if (paragraphDirection != 1) {
                f = (float) (16777216 - getWidth());
            }
            if (!(this.f19345l == f && this.f19346m == paragraphDirection)) {
                this.f19345l = f;
                this.f19346m = paragraphDirection;
                m18398a(f, paragraphDirection, (float) getWidth(), this.f19342i);
            }
            canvas.translate(-f, (float) this.f19341h);
            this.f19340g.draw(canvas);
            canvas.translate(f, (float) (-this.f19341h));
        }
    }

    private final void m18399a(int i) {
        int size;
        if (MeasureSpec.getMode(i) == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            size = MeasureSpec.getSize(i);
        } else {
            size = 0;
        }
        setMeasuredDimension(0, size);
    }

    private final void m18400a(int i, boolean z, int i2) {
        Metrics a = m18397a();
        if (a == null) {
            m18402b(i, z, i2);
            return;
        }
        int a2;
        int i3 = a.width;
        if (i3 <= i || this.f19343j == 1) {
            if (!z) {
                i = Math.min(i3, i);
            }
            a2 = m18396a(a, true);
        } else if (this.f19343j != 2) {
            m18402b(i, z, i2);
            return;
        } else if (z) {
            a2 = m18396a(a, false) + m18396a(a, true);
        } else {
            m18402b(i, z, i2);
            return;
        }
        i3 = MeasureSpec.getMode(i2);
        if (i3 == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            a2 = MeasureSpec.getSize(i2);
        } else if (i3 == Integer.MIN_VALUE) {
            i3 = MeasureSpec.getSize(i2);
            if (a2 > i3) {
                a2 = i3;
            }
        }
        setMeasuredDimension(i, a2);
    }

    private static int m18396a(Metrics metrics, boolean z) {
        if (z) {
            return metrics.bottom - metrics.top;
        }
        return metrics.descent - metrics.ascent;
    }

    private final void m18402b(int i, boolean z, int i2) {
        int lineBottom;
        Layout b = m18401b(i);
        int lineCount = b.getLineCount();
        int mode = MeasureSpec.getMode(i2);
        if (mode == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            mode = MeasureSpec.getSize(i2);
        } else {
            lineBottom = b.getLineBottom(Math.min(lineCount, this.f19343j) - 1);
            if (mode == 0) {
                mode = lineBottom;
            } else {
                mode = Math.min(MeasureSpec.getSize(i2), lineBottom);
            }
        }
        if (!z && lineCount <= this.f19343j) {
            float f = 0.0f;
            int lineCount2 = b.getLineCount();
            for (lineBottom = 0; lineBottom != lineCount2; lineBottom++) {
                f = Math.max(f, b.getLineMax(lineBottom));
            }
            i = Math.min(i, (int) Math.ceil((double) f));
        }
        setMeasuredDimension(i, mode);
    }

    private final void m18398a(float f, int i, float f2, int i2) {
        if (f2 != 0.0f) {
            int[] iArr;
            float[] fArr;
            if (i == 1) {
                iArr = new int[]{i2, 16777215 & i2};
                fArr = new float[]{1.0f - (this.f19344k / f2), 1.0f};
            } else {
                iArr = new int[]{16777215 & i2, i2};
                fArr = new float[]{0.0f, this.f19344k / f2};
            }
            this.f19336c.setShader(new LinearGradient(f, 0.0f, f2 + f, 0.0f, iArr, fArr, TileMode.CLAMP));
        }
    }

    private final Layout m18401b(int i) {
        if ((this.f19339f instanceof StaticLayout) && this.f19339f.getText() == this.f19337d && this.f19339f.getWidth() == i) {
            return this.f19339f;
        }
        this.f19339f = new StaticLayout(this.f19337d, this.f19335b, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        invalidate();
        return this.f19339f;
    }

    private final Layout m18403c(int i) {
        if (this.f19337d.length() == 0 || i == 0) {
            if (this.f19339f != null) {
                this.f19339f = null;
                invalidate();
            }
            return null;
        }
        Metrics a = m18397a();
        if (a == null || (this.f19343j != 1 && a.width > i)) {
            Layout b = m18401b(i);
            if (b.getLineCount() <= this.f19343j) {
                this.f19341h = -1;
                return b;
            }
            int i2 = this.f19343j - 1;
            this.f19341h = b.getLineTop(i2);
            int lineStart = b.getLineStart(i2);
            CharSequence subSequence = this.f19337d.subSequence(lineStart, this.f19337d.length());
            a = BoringLayout.isBoring(subSequence, this.f19336c);
            if (a == null) {
                this.f19340g = new StaticLayout(this.f19337d, lineStart, this.f19337d.length(), this.f19336c, 16777216, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else if (this.f19340g instanceof BoringLayout) {
                this.f19340g = ((BoringLayout) this.f19340g).replaceOrMake(subSequence, this.f19336c, 16777216, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, a, false);
            } else {
                this.f19340g = BoringLayout.make(subSequence, this.f19336c, 16777216, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, a, false);
            }
            invalidate();
            return b;
        }
        TextPaint textPaint = a.width > i ? this.f19336c : this.f19335b;
        if (!(this.f19339f instanceof BoringLayout)) {
            this.f19339f = BoringLayout.make(this.f19337d, textPaint, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, a, true);
        } else if (this.f19339f.getText() == this.f19337d && this.f19339f.getWidth() == i && this.f19339f.getPaint() == textPaint) {
            return this.f19339f;
        } else {
            this.f19339f = ((BoringLayout) this.f19339f).replaceOrMake(this.f19337d, textPaint, i, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, a, true);
        }
        invalidate();
        return this.f19339f;
    }

    private final Metrics m18397a() {
        if (this.f19338e == f19334a) {
            this.f19338e = BoringLayout.isBoring(this.f19337d, this.f19335b);
        }
        return this.f19338e;
    }
}
