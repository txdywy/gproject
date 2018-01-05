package com.google.android.libraries.play.entertainment.story;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import com.google.android.libraries.play.entertainment.p351m.C6115a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class SnippetView extends TextView {
    public static final boolean f30348n = C6115a.m28098b(23);
    public final Paint f30349a;
    public final Paint f30350b;
    public final RectF f30351c;
    public CharSequence f30352d;
    public CharSequence f30353e;
    public float f30354f;
    public float f30355g;
    public float f30356h;
    public float f30357i;
    public boolean f30358j;
    public float f30359k;
    public float f30360l;
    public int f30361m;
    public ah f30362o;

    public SnippetView(Context context) {
        this(context, null, 0);
    }

    public SnippetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SnippetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30359k = Float.NEGATIVE_INFINITY;
        this.f30360l = Float.NEGATIVE_INFINITY;
        this.f30361m = 1193046;
        this.f30349a = new TextPaint(getPaint());
        this.f30349a.setTypeface(Typeface.create(this.f30349a.getTypeface(), 1));
        this.f30350b = new Paint(1);
        this.f30351c = new RectF();
        Resources resources = context.getResources();
        this.f30354f = resources.getDimension(ab.play_text_view_fadeout);
        this.f30355g = resources.getDimension(ab.play_text_view_fadeout_hint_margin);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, af.SnippetView, i, 0);
        this.f30352d = obtainStyledAttributes.getText(af.SnippetView_moreHintText);
        this.f30353e = obtainStyledAttributes.getText(af.SnippetView_moreHintContentDescription);
        setMoreHintColor(obtainStyledAttributes.getColor(af.SnippetView_moreHintColor, getCurrentTextColor()));
        if (f30348n) {
            Drawable drawable = obtainStyledAttributes.getDrawable(af.SnippetView_android_foreground);
            if (drawable != null) {
                setForeground(drawable);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void setMoreHintColor(int i) {
        if (this.f30349a.getColor() != i) {
            this.f30349a.setColor(i);
            invalidate();
        }
    }

    public void setEraseColor(int i) {
        if (m28175a(this.f30359k, this.f30360l, i)) {
            invalidate();
        }
    }

    protected void onMeasure(int i, int i2) {
        boolean z = false;
        super.onMeasure(i, i2);
        this.f30358j = false;
        Layout layout = getLayout();
        if (layout == null || layout.getLineCount() == 0) {
            setContentDescription(null);
            return;
        }
        int maxLines = getMaxLines();
        int lineCount = layout.getLineCount();
        if (maxLines <= 0 || maxLines >= lineCount) {
            maxLines = lineCount;
        }
        int i3 = maxLines - 1;
        int lineVisibleEnd = layout.getLineVisibleEnd(i3);
        maxLines = i3;
        while (maxLines > 0) {
            i3 = maxLines - 1;
            if (lineVisibleEnd > layout.getLineEnd(i3)) {
                break;
            }
            lineVisibleEnd = layout.getLineVisibleEnd(i3);
            maxLines = i3;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f30352d);
        if (maxLines == 0 && lineVisibleEnd <= 0 && isEmpty) {
            maxLines = -1;
        }
        if (MeasureSpec.getMode(i2) != MemoryMappedFileBuffer.DEFAULT_SIZE && maxLines + 1 < lineCount) {
            lineCount = ((maxLines == -1 ? 0 : layout.getLineBottom(maxLines)) + getPaddingTop()) + getPaddingBottom();
            if (lineCount < getMeasuredHeight()) {
                setMeasuredDimension(getMeasuredWidthAndState(), lineCount);
            }
        }
        CharSequence subSequence = getText().subSequence(0, lineVisibleEnd);
        if (isEmpty) {
            setContentDescription(subSequence);
            return;
        }
        CharSequence[] charSequenceArr = new CharSequence[3];
        charSequenceArr[0] = subSequence;
        charSequenceArr[1] = ".\n\n";
        if (TextUtils.isEmpty(this.f30353e)) {
            subSequence = this.f30352d;
        } else {
            subSequence = this.f30353e;
        }
        charSequenceArr[2] = subSequence;
        setContentDescription(TextUtils.concat(charSequenceArr));
        float paddingLeft = (float) getPaddingLeft();
        float measuredWidth = (float) (getMeasuredWidth() - getPaddingRight());
        float f = measuredWidth - paddingLeft;
        if (f > 0.0f) {
            float lineWidth;
            this.f30358j = true;
            this.f30357i = (float) layout.getLineBaseline(maxLines);
            float min = Math.min(f, this.f30355g);
            float min2 = Math.min(this.f30349a.measureText(this.f30352d, 0, this.f30352d.length()), f - min);
            if (layout.getParagraphDirection(maxLines) == -1) {
                z = true;
            }
            if (layout.getLineForOffset(lineVisibleEnd) > maxLines) {
                lineWidth = layout.getLineWidth(maxLines);
                switch (ag.f30376a[layout.getParagraphAlignment(maxLines).ordinal()]) {
                    case 1:
                        lineWidth = (lineWidth + f) / 2.0f;
                        break;
                    case 2:
                        break;
                    default:
                        lineWidth = f;
                        break;
                }
                if (z) {
                    lineWidth = f - lineWidth;
                }
            } else {
                lineWidth = layout.getPrimaryHorizontal(lineVisibleEnd);
            }
            if (z && lineWidth >= min2 + min) {
                this.f30351c.setEmpty();
                this.f30356h = ((lineWidth - min) - min2) + paddingLeft;
            } else if (z || f - lineWidth < min2 + min) {
                this.f30351c.top = (float) layout.getLineTop(maxLines);
                this.f30351c.bottom = (float) layout.getLineBottom(maxLines);
                float f2;
                if (z) {
                    this.f30356h = paddingLeft;
                    f2 = (paddingLeft + min2) + min;
                    lineWidth = Math.min(measuredWidth, this.f30354f + f2);
                    this.f30351c.left = paddingLeft;
                    this.f30351c.right = lineWidth;
                    m28175a(lineWidth, f2, this.f30361m);
                    return;
                }
                this.f30356h = measuredWidth - min2;
                f2 = this.f30356h - min;
                lineWidth = Math.max(paddingLeft, f2 - this.f30354f);
                this.f30351c.left = lineWidth;
                this.f30351c.right = measuredWidth;
                m28175a(lineWidth, f2, this.f30361m);
            } else {
                this.f30351c.setEmpty();
                this.f30356h = (paddingLeft + lineWidth) + min;
            }
        }
    }

    private final boolean m28175a(float f, float f2, int i) {
        if (this.f30359k == f && this.f30360l == f2 && this.f30361m == i) {
            return false;
        }
        this.f30359k = f;
        this.f30360l = f2;
        this.f30361m = i;
        if (f == Float.NEGATIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) {
            return false;
        }
        this.f30350b.setShader(new LinearGradient(f, 0.0f, f2, 0.0f, 0, i, TileMode.CLAMP));
        return true;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30358j) {
            if (!this.f30351c.isEmpty()) {
                canvas.drawRect(this.f30351c, this.f30350b);
            }
            canvas.drawText((CharSequence) C6116b.m28100a(this.f30352d), 0, this.f30352d.length(), this.f30356h, this.f30357i, this.f30349a);
        }
        if (this.f30362o != null) {
            ah ahVar = this.f30362o;
            if (ahVar.f30377a != null) {
                ahVar.f30377a.setBounds(0, 0, ahVar.f30378b.getWidth(), ahVar.f30378b.getHeight());
                ahVar.f30377a.draw(canvas);
            }
        }
    }

    @TargetApi(23)
    public void setForeground(Drawable drawable) {
        if (f30348n) {
            if (this.f30362o == null) {
                this.f30362o = new ah(this);
            }
            ah ahVar = this.f30362o;
            if (ahVar.f30377a != null) {
                ahVar.f30377a.setCallback(null);
                ahVar.f30378b.unscheduleDrawable(ahVar.f30377a);
            }
            ahVar.f30377a = drawable;
            if (drawable != null) {
                drawable.setCallback(ahVar.f30378b);
                if (drawable.isStateful()) {
                    drawable.setState(ahVar.f30378b.getDrawableState());
                }
            }
            invalidate();
            return;
        }
        super.setForeground(drawable);
    }

    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable)) {
            if (this.f30362o == null) {
                return false;
            }
            boolean z;
            if (drawable == this.f30362o.f30377a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f30362o != null) {
            ah ahVar = this.f30362o;
            if (ahVar.f30377a != null) {
                ahVar.f30377a.setState(ahVar.f30378b.getDrawableState());
            }
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (this.f30362o != null) {
            ah ahVar = this.f30362o;
            if (ahVar.f30377a != null) {
                boolean z;
                Drawable drawable = ahVar.f30377a;
                if (ahVar.f30378b.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setVisible(z, false);
            }
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        if (this.f30362o != null) {
            ah ahVar = this.f30362o;
            if (ahVar.f30377a != null) {
                ahVar.f30377a.setHotspot(f, f2);
            }
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f30362o != null) {
            ah ahVar = this.f30362o;
            if (ahVar.f30377a != null) {
                ahVar.f30377a.jumpToCurrentState();
            }
        }
    }

    static {
        C6090b.m28050a();
    }
}
