package com.google.android.play.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.support.v4.widget.bg;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.TextView;
import com.google.android.play.C6383k;
import com.google.android.play.c;
import com.google.android.play.d;
import com.google.android.play.e;
import com.google.android.play.utils.C6452k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.Locale;

public class PlayTextView extends TextView {
    public static final boolean f32208a = (VERSION.SDK_INT >= 16);
    public final float f32209b;
    public boolean f32210c;
    public boolean f32211d;
    public final String f32212e;
    public Paint f32213f;
    public Paint f32214g;
    public GradientDrawable f32215h;
    public int f32216i;
    public int f32217j;
    public float f32218k;
    public Paint f32219l;
    public boolean f32220m;
    public int f32221n;

    public PlayTextView(Context context) {
        this(context, null);
    }

    @TargetApi(16)
    public PlayTextView(Context context, AttributeSet attributeSet) {
        int color;
        int i = 3;
        super(context, attributeSet);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6383k.PlayTextView);
        this.f32210c = obtainStyledAttributes.hasValue(C6383k.PlayTextView_lastLineOverdrawColor);
        this.f32211d = obtainStyledAttributes.getBoolean(C6383k.PlayTextView_lastLineOverdrawHintAlways, false);
        if (this.f32210c) {
            color = obtainStyledAttributes.getColor(C6383k.PlayTextView_lastLineOverdrawColor, resources.getColor(d.play_white));
            this.f32213f = new Paint();
            this.f32213f.setColor(color);
            this.f32213f.setStyle(Style.FILL_AND_STROKE);
            this.f32216i = resources.getDimensionPixelSize(e.play_text_view_fadeout);
            this.f32215h = new GradientDrawable(Orientation.LEFT_RIGHT, new int[]{16777215 & color, color});
            this.f32217j = resources.getDimensionPixelSize(e.play_text_view_fadeout_hint_margin);
        }
        String string = obtainStyledAttributes.getString(C6383k.PlayTextView_lastLineOverdrawHint);
        if (obtainStyledAttributes.getBoolean(C6383k.PlayTextView_lastLineOverdrawAllCaps, false)) {
            string = string.toUpperCase(Locale.getDefault());
        }
        this.f32212e = string;
        if (!TextUtils.isEmpty(this.f32212e)) {
            this.f32214g = new Paint();
            this.f32214g.setColor(obtainStyledAttributes.getColor(C6383k.PlayTextView_lastLineOverdrawHintColor, getCurrentTextColor()));
            this.f32214g.setTextSize(getTextSize());
            this.f32214g.setTypeface(getTypeface());
            this.f32214g.setAntiAlias(true);
        }
        color = obtainStyledAttributes.getInt(C6383k.PlayTextView_decoration_position, 3);
        boolean b = C6452k.m29507b(context);
        switch (color) {
            case 0:
                this.f32221n = b ? 2 : 3;
                break;
            case 1:
                if (!b) {
                    i = 2;
                }
                this.f32221n = i;
                break;
            default:
                this.f32221n = color;
                break;
        }
        float textSize = getTextSize();
        boolean z = resources.getBoolean(c.play_text_compact_mode_enable);
        boolean z2 = obtainStyledAttributes.getBoolean(C6383k.PlayTextView_allowsCompactLineSpacing, false);
        if (z && z2) {
            FontMetrics fontMetrics = getPaint().getFontMetrics();
            this.f32209b = Math.max(0.0f, 1.0f - ((1.172f * textSize) / (Math.abs(fontMetrics.descent) + Math.abs(fontMetrics.ascent))));
        } else {
            this.f32209b = 0.0f;
        }
        if (this.f32209b > 0.0f) {
            textSize *= -this.f32209b;
            if (f32208a) {
                textSize += ((float) getLineHeight()) * (getLineSpacingMultiplier() - 1.0f);
            }
            setLineSpacing(textSize, 1.0f);
        }
        obtainStyledAttributes.recycle();
        this.f32218k = context.getResources().getDimension(e.play_text_view_outline);
        this.f32219l = new Paint();
        this.f32219l.setStrokeWidth(this.f32218k);
        this.f32219l.setStyle(Style.STROKE);
        setWillNotDraw(false);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f32209b != 0.0f && MeasureSpec.getMode(i2) != MemoryMappedFileBuffer.DEFAULT_SIZE) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + ((int) (this.f32209b * ((float) getLineHeight()))));
        }
    }

    public void setDecorationBitmap(Bitmap bitmap) {
        Drawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        switch (this.f32221n) {
            case 2:
                bg.a(this, bitmapDrawable, null, null, null);
                return;
            case 3:
                bg.a(this, null, null, bitmapDrawable, null);
                return;
            default:
                return;
        }
    }

    public final void m29318a(int i, boolean z) {
        int color = getResources().getColor(i);
        setTextColor(color);
        this.f32220m = z;
        if (this.f32220m) {
            this.f32219l.setColor(color);
        }
        invalidate();
    }

    public void setLastLineOverdrawColor(int i) {
        if (!this.f32210c) {
            this.f32213f = new Paint();
            this.f32213f.setStyle(Style.FILL_AND_STROKE);
            Resources resources = getResources();
            this.f32216i = resources.getDimensionPixelSize(e.play_text_view_fadeout);
            this.f32217j = resources.getDimensionPixelSize(e.play_text_view_fadeout_hint_margin);
        }
        this.f32213f.setColor(i);
        this.f32215h = new GradientDrawable(Orientation.LEFT_RIGHT, new int[]{16777215 & i, i});
        this.f32210c = true;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f32220m) {
            int ceil = (int) Math.ceil((double) (this.f32218k / 2.0f));
            canvas.save();
            canvas.translate((float) getScrollX(), 0.0f);
            canvas.drawRect((float) ceil, (float) ceil, (float) (getWidth() - ceil), (float) (getHeight() - ceil), this.f32219l);
            canvas.restore();
        }
        if (this.f32210c) {
            int height = getHeight() - getPaddingBottom();
            int width = getWidth();
            Layout layout = getLayout();
            if (layout != null) {
                setContentDescription(layout.getText());
                int paddingTop = getPaddingTop();
                int lineCount = layout.getLineCount();
                int i = 0;
                while (i < lineCount) {
                    ceil = layout.getLineTop(i);
                    int lineBottom = layout.getLineBottom(i);
                    if (ceil > height || lineBottom <= height) {
                        if (i == lineCount - 1 && this.f32211d) {
                            m29317a(canvas, width, i, false);
                        }
                        i++;
                    } else {
                        canvas.drawRect(0.0f, (float) (ceil + paddingTop), (float) width, (float) height, this.f32213f);
                        if (i > 0) {
                            m29317a(canvas, width, i - 1, true);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    private final void m29317a(Canvas canvas, int i, int i2, boolean z) {
        int i3;
        Layout layout = getLayout();
        int paddingTop = getPaddingTop();
        int i4 = -1;
        int i5 = i2;
        while (i5 >= 0) {
            Layout layout2 = getLayout();
            CharSequence text = layout2.getText();
            int lineStart = layout2.getLineStart(i5);
            i4 = layout2.getLineEnd(i5);
            while (i4 > lineStart) {
                if (!Character.isWhitespace(text.charAt(i4 - 1))) {
                    break;
                }
                i4--;
            }
            i4 = -1;
            if (i4 != -1) {
                break;
            }
            i5--;
        }
        if (i4 == -1) {
            i3 = 0;
            i5 = 0;
        } else {
            i3 = i5;
            i5 = i4;
        }
        int lineTop = layout.getLineTop(i3);
        int lineBottom = layout.getLineBottom(i3);
        Object obj = layout.getParagraphDirection(i3) == -1 ? 1 : null;
        int primaryHorizontal = (int) layout.getPrimaryHorizontal(i5);
        int paddingLeft = getPaddingLeft();
        i4 = getPaddingRight();
        i5 = paddingLeft + primaryHorizontal;
        if (!TextUtils.isEmpty(this.f32212e)) {
            String valueOf;
            int measureText = (int) this.f32214g.measureText(this.f32212e);
            if (obj == null) {
                paddingLeft = (i - i4) - measureText;
            }
            int i6 = paddingLeft + measureText;
            int i7;
            if (obj != null && this.f32217j + i6 > primaryHorizontal) {
                z = true;
                i7 = i6 + this.f32217j;
                canvas.drawRect((float) paddingLeft, (float) (paddingTop + lineTop), (float) i7, (float) (paddingTop + lineBottom), this.f32213f);
                i4 = i7;
            } else if (obj != null || paddingLeft - this.f32217j >= primaryHorizontal) {
                i4 = i5;
            } else {
                z = true;
                i7 = paddingLeft - this.f32217j;
                canvas.drawRect((float) i7, (float) (paddingTop + lineTop), (float) i6, (float) (paddingTop + lineBottom), this.f32213f);
                i4 = i7;
            }
            if (obj != null && this.f32217j + i6 < primaryHorizontal) {
                i5 = (primaryHorizontal - this.f32217j) - measureText;
            } else if (obj != null || paddingLeft - this.f32217j <= primaryHorizontal) {
                i5 = paddingLeft;
            } else {
                i5 = this.f32217j + primaryHorizontal;
            }
            canvas.drawText(this.f32212e, (float) i5, (float) layout.getLineBaseline(i2), this.f32214g);
            i5 = layout.getOffsetForHorizontal(i3, (float) i4);
            text = getLayout().getText();
            while (i5 < text.length() && !Character.isWhitespace(text.charAt(i5))) {
                i5++;
            }
            Object subSequence = getLayout().getText().subSequence(0, i5);
            if (subSequence.length() > 0 && subSequence.charAt(subSequence.length() - 1) != '.') {
                valueOf = String.valueOf(subSequence);
                subSequence = new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append(".").toString();
            }
            valueOf = String.valueOf(subSequence);
            String str = this.f32212e;
            setContentDescription(new StringBuilder((String.valueOf(valueOf).length() + 1) + String.valueOf(str).length()).append(valueOf).append(" ").append(str).toString());
            i5 = i4;
        }
        if (z) {
            canvas.save(1);
            canvas.translate((float) i5, (float) paddingTop);
            if (obj != null) {
                canvas.scale(-1.0f, 1.0f);
            }
            this.f32215h.setBounds(-this.f32216i, lineTop, 0, lineBottom);
            this.f32215h.draw(canvas);
            canvas.restore();
        }
    }
}
