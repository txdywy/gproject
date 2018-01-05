package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PointF;
import android.support.v4.view.ai;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.android.play.C6361i;
import com.google.android.play.C6383k;
import com.google.android.play.d;
import com.google.android.play.e;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class StarRatingBar extends View implements C6389n {
    public final int f32222a;
    public final int f32223b;
    public float f32224c;
    public float f32225d;
    public final float f32226e;
    public boolean f32227f;
    public boolean f32228g;
    public final float f32229h;
    public final double f32230i;
    public final double f32231j;
    public final Path f32232k;
    public final Path f32233l;
    public final Path f32234m;
    public final Paint f32235n;
    public final Paint f32236o;
    public final TextPaint f32237p;
    public int f32238q;
    public int f32239r;
    public int f32240s;
    public float f32241t;
    public String f32242u;

    private static Path m29319a(PointF[] pointFArr) {
        Path path = new Path();
        path.setFillType(FillType.EVEN_ODD);
        path.moveTo(pointFArr[0].x, pointFArr[0].y);
        for (int length = pointFArr.length / 2; length < pointFArr.length; length++) {
            path.lineTo(pointFArr[length].x, pointFArr[length].y);
        }
        path.close();
        return path;
    }

    private static Path m29321b(PointF[] pointFArr) {
        Path path = new Path();
        path.setFillType(FillType.EVEN_ODD);
        path.moveTo(pointFArr[0].x, pointFArr[0].y);
        for (int i = 1; i <= pointFArr.length / 2; i++) {
            path.lineTo(pointFArr[i].x, pointFArr[i].y);
        }
        path.close();
        return path;
    }

    public StarRatingBar(Context context) {
        this(context, null);
    }

    public StarRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6383k.StarRatingBar);
        this.f32226e = (float) obtainStyledAttributes.getDimensionPixelSize(C6383k.StarRatingBar_gap, 0);
        this.f32224c = obtainStyledAttributes.getFloat(C6383k.StarRatingBar_rating, 0.0f);
        this.f32230i = (double) obtainStyledAttributes.getDimensionPixelSize(C6383k.StarRatingBar_star_height, resources.getDimensionPixelSize(e.play_star_height_default));
        this.f32225d = (float) obtainStyledAttributes.getInt(C6383k.StarRatingBar_range, 5);
        this.f32227f = obtainStyledAttributes.getBoolean(C6383k.StarRatingBar_show_empty_stars, true);
        this.f32228g = obtainStyledAttributes.getBoolean(C6383k.StarRatingBar_compact_mode, false);
        this.f32238q = obtainStyledAttributes.getDimensionPixelSize(C6383k.StarRatingBar_text_size, resources.getDimensionPixelSize(e.play_medium_size));
        this.f32222a = obtainStyledAttributes.getColor(C6383k.StarRatingBar_star_color, resources.getColor(d.play_white));
        int color = obtainStyledAttributes.getColor(C6383k.StarRatingBar_star_bg_color, resources.getColor(d.play_transparent));
        this.f32223b = obtainStyledAttributes.getColor(C6383k.StarRatingBar_text_color, resources.getColor(d.play_secondary_text));
        obtainStyledAttributes.recycle();
        this.f32235n = new Paint(1);
        this.f32235n.setColor(this.f32222a);
        this.f32235n.setStyle(Style.FILL);
        this.f32236o = new Paint(1);
        this.f32236o.setColor(color);
        this.f32236o.setStyle(Style.FILL);
        this.f32231j = C6399o.m29333a(this.f32230i);
        this.f32229h = (float) C6399o.m29336b(this.f32231j);
        this.f32237p = new TextPaint(1);
        this.f32237p.density = resources.getDisplayMetrics().density;
        this.f32237p.setTextSize((float) this.f32238q);
        this.f32237p.setFakeBoldText(false);
        this.f32237p.setColor(this.f32223b);
        m29320a();
        m29322b();
        PointF[] c = C6399o.m29337c(this.f32231j);
        this.f32232k = C6399o.m29334a(c);
        this.f32233l = m29319a(c);
        this.f32234m = m29321b(c);
        setWillNotDraw(false);
    }

    public float getRating() {
        return this.f32224c;
    }

    public void setRating(float f) {
        if (this.f32224c != f) {
            this.f32224c = f;
            m29322b();
            setContentDescription(getResources().getString(C6361i.play_star_rating_content_description, new Object[]{this.f32242u}));
            if (this.f32228g || !this.f32227f) {
                requestLayout();
            }
            invalidate();
        }
    }

    public void setCompactMode(boolean z) {
        if (this.f32228g != z) {
            this.f32228g = z;
            requestLayout();
            invalidate();
        }
    }

    public void setShowEmptyStars(boolean z) {
        if (this.f32227f != z) {
            this.f32227f = z;
            requestLayout();
            invalidate();
        }
    }

    public void setTextSize(int i) {
        if (this.f32238q != i) {
            this.f32238q = i;
            this.f32237p.setTextSize((float) this.f32238q);
            m29320a();
            requestLayout();
            invalidate();
        }
    }

    public int getStarColor() {
        return this.f32222a;
    }

    public int getTextColor() {
        return this.f32223b;
    }

    public int getBaseline() {
        return this.f32228g ? getPaddingTop() + this.f32240s : getMeasuredHeight();
    }

    public void onDraw(Canvas canvas) {
        int i = 0;
        super.onDraw(canvas);
        int save = canvas.save(1);
        this.f32235n.setColor(getStarColor());
        this.f32237p.setColor(getTextColor());
        if (ai.a.k(this) == 1 && !this.f32228g) {
            canvas.translate((float) getWidth(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        int paddingTop = getPaddingTop();
        int l = ai.a.l(this);
        if (this.f32228g) {
            float f = (float) l;
            float f2 = (float) paddingTop;
            canvas.save();
            canvas.translate(f, f2);
            canvas.drawText(this.f32242u, f, f2 + ((float) this.f32240s), this.f32237p);
            canvas.restore();
            canvas.save();
            canvas.translate(f + ((this.f32229h + this.f32241t) + (this.f32226e * 2.0f)), ((float) (((paddingTop - getPaddingBottom()) + getMeasuredHeight()) - (this.f32239r / 2))) + ((float) (this.f32231j - ((double) this.f32229h))));
            canvas.drawPath(this.f32232k, this.f32235n);
            canvas.restore();
        } else {
            int i2 = (int) this.f32224c;
            int i3 = Float.compare(this.f32224c % 1.0f, 0.0f) > 0 ? 1 : 0;
            float f3 = ((float) l) + this.f32229h;
            float f4 = ((float) paddingTop) + ((float) this.f32231j);
            while (i < i2) {
                canvas.save();
                canvas.translate((((float) i) * ((this.f32229h * 2.0f) + this.f32226e)) + f3, f4);
                canvas.drawPath(this.f32232k, this.f32235n);
                canvas.restore();
                i++;
            }
            if (i3 == 1) {
                canvas.save();
                canvas.translate((((float) i) * ((this.f32229h * 2.0f) + this.f32226e)) + f3, f4);
                canvas.drawPath(this.f32233l, this.f32235n);
                canvas.drawPath(this.f32234m, this.f32236o);
                canvas.restore();
                i3 = i + 1;
            } else {
                i3 = i;
            }
            if (this.f32227f) {
                for (i3 = 
/*
Method generation error in method: com.google.android.play.layout.StarRatingBar.onDraw(android.graphics.Canvas):void
jadx.core.utils.exceptions.CodegenException: Error generate insn: PHI: (r0_25 'i3' int) = (r0_24 'i3' int), (r0_28 'i3' int) binds: {(r0_28 'i3' int)=B:24:0x0115, (r0_24 'i3' int)=B:18:0x00cc} in method: com.google.android.play.layout.StarRatingBar.onDraw(android.graphics.Canvas):void
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:226)
	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:184)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:61)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:118)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:93)
	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:128)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:57)
	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:87)
	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:53)
	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:183)
	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:328)
	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:265)
	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:228)
	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:118)
	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:83)
	at jadx.core.codegen.CodeGen.visit(CodeGen.java:19)
	at jadx.core.ProcessClass.process(ProcessClass.java:43)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
Caused by: jadx.core.utils.exceptions.CodegenException: PHI can be used only in fallback mode
	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:530)
	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:514)
	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:220)
	... 25 more

*/

                protected void onMeasure(int i, int i2) {
                    if (MeasureSpec.getMode(i) == MemoryMappedFileBuffer.DEFAULT_SIZE && MeasureSpec.getMode(i2) == MemoryMappedFileBuffer.DEFAULT_SIZE) {
                        setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
                        return;
                    }
                    int paddingLeft;
                    int paddingTop;
                    if (this.f32228g) {
                        this.f32241t = this.f32237p.measureText(this.f32242u);
                        paddingLeft = (int) (((((float) (getPaddingLeft() + getPaddingRight())) + this.f32241t) + (this.f32226e * 2.0f)) + (this.f32229h * 2.0f));
                        paddingTop = (int) (((double) (getPaddingTop() + getPaddingBottom())) + Math.max((double) this.f32239r, this.f32230i));
                    } else {
                        float ceil = this.f32227f ? this.f32225d : (float) Math.ceil((double) this.f32224c);
                        paddingLeft = (int) (((ceil - 1.0f) * this.f32226e) + (((float) (getPaddingLeft() + getPaddingRight())) + ((ceil * 2.0f) * this.f32229h)));
                        paddingTop = (int) (((double) (getPaddingTop() + getPaddingBottom())) + this.f32230i);
                    }
                    setMeasuredDimension(paddingLeft, paddingTop);
                }

                private final void m29320a() {
                    FontMetrics fontMetrics = this.f32237p.getFontMetrics();
                    this.f32239r = (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom));
                    this.f32240s = (int) Math.abs(fontMetrics.top);
                }

                private final void m29322b() {
                    this.f32242u = C6399o.m29335a(this.f32224c);
                }
            }
