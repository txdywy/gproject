package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.f;
import android.support.v4.view.ai;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.play.C6383k;
import com.google.android.play.d;
import com.google.android.play.e;
import com.google.android.play.utils.C6452k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class PlayCardLabelView extends View implements C6384c {
    public String f32134a;
    public String f32135b;
    public Drawable f32136c;
    public int f32137d;
    public int f32138e;
    public final int f32139f;
    public final int f32140g;
    public float f32141h;
    public final int f32142i;
    public final TextPaint f32143j;
    public final TextPaint f32144k;
    public int f32145l;
    public int f32146m;
    public boolean f32147n;

    public PlayCardLabelView(Context context) {
        this(context, null);
    }

    public PlayCardLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f32139f = resources.getDimensionPixelSize(e.play_card_label_icon_gap);
        this.f32140g = resources.getDimensionPixelSize(e.play_card_label_texts_gap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6383k.PlayCardLabelView);
        this.f32141h = obtainStyledAttributes.getDimension(C6383k.PlayCardLabelView_play_label_text_size, resources.getDimension(e.play_medium_size));
        String string = obtainStyledAttributes.getString(C6383k.PlayCardLabelView_play_label_font_family);
        obtainStyledAttributes.recycle();
        this.f32144k = new TextPaint(1);
        this.f32144k.density = resources.getDisplayMetrics().density;
        this.f32144k.setTextSize(this.f32141h);
        this.f32144k.setFakeBoldText(false);
        this.f32143j = new TextPaint(1);
        this.f32143j.density = resources.getDisplayMetrics().density;
        this.f32143j.setTextSize(this.f32141h);
        this.f32142i = resources.getColor(d.play_fg_secondary);
        this.f32143j.setColor(this.f32142i);
        this.f32143j.setStrikeThruText(true);
        this.f32143j.setFakeBoldText(false);
        if (string != null) {
            Typeface create = Typeface.create(string, 0);
            this.f32144k.setTypeface(create);
            this.f32143j.setTypeface(create);
        }
        m29297c();
        setWillNotDraw(false);
    }

    public void setTextSize(float f) {
        if (this.f32141h != f) {
            this.f32141h = f;
            this.f32144k.setTextSize(this.f32141h);
            this.f32143j.setTextSize(this.f32141h);
            m29297c();
            requestLayout();
            invalidate();
        }
    }

    public final void mo5411a(String str, int i, String str2, int i2, String str3) {
        String str4 = null;
        this.f32135b = str != null ? str.toUpperCase() : null;
        if (str2 != null) {
            str4 = str2.toUpperCase();
        }
        this.f32134a = str4;
        this.f32144k.setColor(i);
        this.f32143j.setColor(i2);
        setContentDescription(str3);
        invalidate();
        requestLayout();
    }

    public final void mo5410a() {
        this.f32135b = null;
        this.f32134a = null;
        setContentDescription(null);
        invalidate();
        requestLayout();
    }

    public String getText() {
        return this.f32135b;
    }

    public String getStrikeText() {
        return this.f32134a;
    }

    public void setIcon(int i) {
        setIconDrawable(f.a(getResources(), i, getContext().getTheme()));
    }

    public void setIconDrawable(Drawable drawable) {
        this.f32136c = drawable;
        this.f32136c.setBounds(0, 0, this.f32136c.getIntrinsicWidth(), this.f32136c.getIntrinsicHeight());
        invalidate();
        requestLayout();
    }

    public final void mo5412b() {
        this.f32136c = null;
        invalidate();
        requestLayout();
    }

    @ExportedProperty(category = "layout")
    public int getBaseline() {
        return getPaddingTop() + this.f32146m;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() != 8) {
            return dispatchPopulateAccessibilityEvent;
        }
        accessibilityEvent.getText().add(getContentDescription());
        return true;
    }

    protected void onMeasure(int i, int i2) {
        boolean z;
        int intrinsicWidth;
        int i3 = 0;
        boolean z2 = MeasureSpec.getMode(i) == MemoryMappedFileBuffer.DEFAULT_SIZE && MeasureSpec.getSize(i) == 0;
        int size = MeasureSpec.getSize(i);
        this.f32138e = 0;
        this.f32147n = false;
        if (TextUtils.isEmpty(this.f32135b)) {
            z = false;
        } else {
            z = true;
        }
        if (!z2) {
            if (this.f32136c != null) {
                intrinsicWidth = this.f32136c.getIntrinsicWidth();
                if (z) {
                    intrinsicWidth += this.f32139f;
                }
            } else {
                intrinsicWidth = 0;
            }
            if (z) {
                this.f32137d = (int) this.f32144k.measureText(this.f32135b);
                intrinsicWidth += this.f32137d;
            }
            if (!TextUtils.isEmpty(this.f32134a)) {
                this.f32138e = (int) this.f32143j.measureText(this.f32134a);
                int i4 = (z ? this.f32140g : 0) + this.f32138e;
                if (size <= 0 || intrinsicWidth + i4 > size) {
                    this.f32147n = false;
                } else {
                    intrinsicWidth += i4;
                    this.f32147n = true;
                }
            }
            i3 = intrinsicWidth + (ai.a.l(this) + ai.a.m(this));
        }
        if (this.f32136c == null) {
            intrinsicWidth = this.f32145l;
        } else {
            intrinsicWidth = Math.max(this.f32145l, this.f32136c.getIntrinsicHeight());
        }
        setMeasuredDimension(i3, intrinsicWidth + (getPaddingTop() + getPaddingBottom()));
    }

    protected void onDraw(Canvas canvas) {
        int height;
        Object obj = 1;
        canvas.save();
        int l = ai.a.l(this);
        int paddingTop = getPaddingTop();
        boolean z = ai.a.k(this) == 0;
        int width = getWidth();
        if (TextUtils.isEmpty(this.f32135b)) {
            obj = null;
        }
        if (this.f32136c != null) {
            height = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.f32136c.getIntrinsicHeight()) / 2) + paddingTop;
            int a = C6452k.m29502a(width, this.f32136c.getIntrinsicWidth(), z, l);
            canvas.translate((float) a, (float) height);
            this.f32136c.draw(canvas);
            canvas.translate((float) (-a), (float) (-height));
            height = (this.f32136c.getIntrinsicWidth() + this.f32139f) + l;
        } else {
            height = l;
        }
        if (this.f32147n && !TextUtils.isEmpty(this.f32134a)) {
            canvas.drawText(this.f32134a, (float) C6452k.m29502a(width, this.f32138e, z, height), (float) (this.f32146m + paddingTop), this.f32143j);
            height += this.f32138e + this.f32140g;
        }
        if (obj != null) {
            canvas.drawText(this.f32135b, (float) C6452k.m29502a(width, this.f32137d, z, height), (float) (this.f32146m + paddingTop), this.f32144k);
        }
        canvas.restore();
    }

    private final void m29297c() {
        FontMetrics fontMetrics = this.f32144k.getFontMetrics();
        this.f32145l = (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom));
        this.f32146m = (int) Math.abs(fontMetrics.top);
    }
}
