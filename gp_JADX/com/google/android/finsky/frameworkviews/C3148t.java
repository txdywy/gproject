package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v4.view.ai;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.android.vending.C0629a;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public final class C3148t extends ViewGroup {
    public int f16282A = 0;
    public int f16283B = 0;
    public int f16284C = C7582R.style.FloatingTooltipAnimation;
    public int f16285D;
    public boolean f16286E;
    public final Path f16287a;
    public final RectF f16288b;
    public final Paint f16289c;
    public final int f16290d;
    public final int f16291e;
    public final int f16292f;
    public final int f16293g;
    public final int f16294h;
    public final int f16295i;
    public final int f16296j;
    public final int f16297k;
    public final int f16298l;
    public final float f16299m;
    public final Rect f16300n = new Rect();
    public final int[] f16301o = new int[2];
    public final Point f16302p = new Point();
    public final Context f16303q;
    public PopupWindow f16304r;
    public boolean f16305s;
    public View f16306t;
    public View f16307u;
    public boolean f16308v;
    public int f16309w;
    public int f16310x = 0;
    public int f16311y;
    public float f16312z = 1.0f;

    C3148t(Context context) {
        super(context);
        this.f16303q = context;
        setWillNotDraw(false);
        this.f16287a = new Path();
        this.f16288b = new RectF();
        this.f16289c = new Paint();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0629a.FloatingTooltip);
        this.f16290d = obtainStyledAttributes.getDimensionPixelSize(4, (int) (((double) (displayMetrics.density * 16.0f)) + 0.5d));
        this.f16291e = obtainStyledAttributes.getDimensionPixelSize(5, (int) (((double) (displayMetrics.density * 10.0f)) + 0.5d));
        this.f16292f = obtainStyledAttributes.getDimensionPixelSize(6, (int) (((double) (displayMetrics.density * 16.0f)) + 0.5d));
        this.f16293g = obtainStyledAttributes.getDimensionPixelSize(7, (int) (((double) (displayMetrics.density * 10.0f)) + 0.5d));
        this.f16294h = obtainStyledAttributes.getDimensionPixelSize(8, (int) (((double) (displayMetrics.density * 16.0f)) + 0.5d));
        this.f16295i = obtainStyledAttributes.getDimensionPixelSize(11, (int) (((double) (displayMetrics.density * 1.0f)) + 0.5d));
        this.f16299m = obtainStyledAttributes.getDimension(10, (displayMetrics.density * 1.0f) + 0.5f);
        this.f16296j = obtainStyledAttributes.getDimensionPixelSize(2, (int) (((double) (4.0f * displayMetrics.density)) + 0.5d));
        this.f16297k = obtainStyledAttributes.getDimensionPixelSize(3, (int) (((double) (displayMetrics.density * 10.0f)) + 0.5d));
        this.f16298l = obtainStyledAttributes.getDimensionPixelSize(9, (int) (((double) (displayMetrics.density * 3.0f)) + 0.5d));
        int color = obtainStyledAttributes.getColor(0, -9079435);
        int color2 = obtainStyledAttributes.getColor(1, MemoryMappedFileBuffer.DEFAULT_SIZE);
        obtainStyledAttributes.recycle();
        this.f16289c.setStyle(Style.FILL);
        this.f16289c.setShadowLayer(this.f16299m, (float) this.f16295i, (float) this.f16295i, color2);
        this.f16289c.setColor(color);
        setLayerType(1, this.f16289c);
        this.f16305s = true;
        this.f16286E = false;
    }

    public final void m16057a(View view, Rect rect, int i, int i2) {
        this.f16307u = view;
        this.f16300n.set(rect);
        this.f16309w = i;
        this.f16310x = 0;
        this.f16311y = i2;
        this.f16308v = true;
    }

    public final void m16058a(boolean z) {
        this.f16286E = z;
    }

    protected final void onMeasure(int i, int i2) {
        int i3;
        float f = 0.0f;
        int i4 = 0;
        if (this.f16310x == 0 && this.f16308v) {
            this.f16310x = C3147s.m16048a(this.f16309w, this);
        }
        int[] iArr = this.f16301o;
        m16055a(this.f16302p);
        int i5 = this.f16302p.x;
        int i6 = this.f16302p.y;
        switch (this.f16310x) {
            case 1:
                i3 = i5 - (this.f16294h * 2);
                i5 = this.f16300n.top - this.f16294h;
                break;
            case 2:
                i3 = i5 - (this.f16294h * 2);
                i5 = ((i6 - this.f16300n.top) - this.f16300n.height()) - this.f16294h;
                break;
            case 3:
                i3 = this.f16300n.left - this.f16294h;
                i5 = i6 - (this.f16294h * 2);
                break;
            case 4:
                i3 = ((i5 - this.f16300n.left) - this.f16300n.width()) - this.f16294h;
                i5 = i6 - (this.f16294h * 2);
                break;
            default:
                throw new IllegalStateException();
        }
        iArr[0] = i3;
        iArr[1] = i5;
        i3 = ((this.f16301o[0] - this.f16290d) - this.f16292f) - this.f16295i;
        i5 = ((this.f16301o[1] - this.f16291e) - this.f16293g) - this.f16295i;
        if (C3148t.m16056a(this.f16310x)) {
            i5 -= this.f16296j;
        } else if (this.f16310x == 3 || this.f16310x == 4) {
            i3 -= this.f16296j;
        }
        m16055a(this.f16302p);
        this.f16306t.measure(MeasureSpec.makeMeasureSpec(Math.min((int) (((float) this.f16302p.x) * this.f16312z), i3), Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(i5, 0));
        if (this.f16306t.getMeasuredHeight() > i5) {
            this.f16306t.measure(MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        }
        int measuredWidth = (this.f16306t.getMeasuredWidth() + this.f16290d) + this.f16292f;
        i6 = (this.f16306t.getMeasuredHeight() + this.f16291e) + this.f16293g;
        RectF rectF = this.f16288b;
        float f2 = this.f16310x == 4 ? (float) this.f16296j : 0.0f;
        if (this.f16310x == 2) {
            f = (float) this.f16296j;
        }
        if (this.f16310x == 4) {
            i3 = this.f16296j;
        } else {
            i3 = 0;
        }
        float f3 = (float) (i3 + measuredWidth);
        if (this.f16310x == 2) {
            i4 = this.f16296j;
        }
        rectF.set(f2, f, f3, (float) (i4 + i6));
        i3 = this.f16295i + ((int) this.f16288b.width());
        i5 = ((int) this.f16288b.height()) + this.f16295i;
        if (C3148t.m16056a(this.f16310x)) {
            i5 += this.f16296j;
        } else if (this.f16310x == 3 || this.f16310x == 4) {
            i3 += this.f16296j;
        }
        setMeasuredDimension(i3, i5);
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f16306t.layout(this.f16290d + (this.f16310x == 4 ? this.f16296j : 0), this.f16291e + (this.f16310x == 2 ? this.f16296j : 0), ((i3 - i) - this.f16292f) - (this.f16310x == 3 ? this.f16296j : 0), ((i4 - i2) - this.f16293g) - (this.f16310x == 1 ? this.f16296j : 0));
        m16055a(this.f16302p);
        int i5 = this.f16302p.x;
        int i6 = this.f16302p.y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i7 = 0;
        int i8 = 0;
        if (this.f16310x == 1) {
            i8 = -measuredHeight;
        } else if (this.f16310x == 2) {
            i8 = this.f16300n.height();
        } else if (this.f16310x == 3) {
            i7 = -measuredWidth;
            i8 = (this.f16300n.height() - measuredHeight) / 2;
        } else if (this.f16310x == 4) {
            i7 = this.f16300n.width();
            i8 = (this.f16300n.height() - measuredHeight) / 2;
        }
        Object obj = ai.f1848a.mo400k(this) == 1 ? 1 : null;
        if (C3148t.m16056a(this.f16310x)) {
            i8 += this.f16300n.top;
            switch (this.f16311y) {
                case 1:
                    if (obj == null) {
                        i7 = this.f16300n.left;
                        break;
                    } else {
                        i7 = (this.f16300n.left + this.f16300n.width()) - measuredWidth;
                        break;
                    }
                case 2:
                    i7 = this.f16300n.left + ((this.f16300n.width() - measuredWidth) / 2);
                    break;
                case 3:
                    if (obj == null) {
                        i7 = (this.f16300n.left + this.f16300n.width()) - measuredWidth;
                        break;
                    } else {
                        i7 = this.f16300n.left;
                        break;
                    }
                default:
                    throw new IllegalStateException();
            }
        }
        i7 += this.f16300n.left;
        i8 += this.f16300n.top;
        this.f16282A = C3148t.m16053a(i7, this.f16294h, (i5 - this.f16294h) - measuredWidth);
        this.f16283B = C3148t.m16053a(i8, this.f16294h, (i6 - this.f16294h) - measuredHeight);
        this.f16304r.update(this.f16282A, this.f16283B, measuredWidth, measuredHeight, true);
        switch (this.f16311y) {
            case 1:
                i8 = (this.f16297k / 2) + (this.f16294h * 2);
                break;
            case 2:
                i8 = this.f16300n.width() / 2;
                break;
            case 3:
                i8 = (this.f16300n.width() - (this.f16297k / 2)) - (this.f16294h * 2);
                break;
            default:
                throw new IllegalStateException();
        }
        if (ai.f1848a.mo400k(this) == 1) {
            i8 = this.f16300n.width() - i8;
        }
        i8 += this.f16300n.left;
        this.f16287a.reset();
        if (this.f16310x == 1) {
            this.f16287a.moveTo((float) ((i8 - this.f16294h) - (this.f16297k / 2)), this.f16288b.bottom);
            this.f16287a.rLineTo((float) this.f16297k, 0.0f);
            this.f16287a.rLineTo((float) ((-this.f16297k) / 2), (float) this.f16296j);
            this.f16287a.rLineTo((float) ((-this.f16297k) / 2), (float) (-this.f16296j));
            this.f16287a.close();
        } else if (this.f16310x == 2) {
            this.f16287a.moveTo((float) ((i8 - this.f16294h) + (this.f16297k / 2)), this.f16288b.top);
            this.f16287a.rLineTo((float) (-this.f16297k), 0.0f);
            this.f16287a.rLineTo((float) (this.f16297k / 2), (float) (-this.f16296j));
            this.f16287a.rLineTo((float) (this.f16297k / 2), (float) this.f16296j);
            this.f16287a.close();
        } else if (this.f16310x == 3) {
            this.f16287a.moveTo(this.f16288b.right, (float) ((this.f16300n.centerY() - this.f16297k) + (this.f16294h / 2)));
            this.f16287a.rLineTo((float) this.f16296j, (float) (this.f16297k / 2));
            this.f16287a.rLineTo((float) (-this.f16296j), (float) (this.f16297k / 2));
            this.f16287a.rLineTo(0.0f, (float) (-this.f16297k));
            this.f16287a.close();
        } else if (this.f16310x == 4) {
            this.f16287a.moveTo(this.f16288b.left, (float) ((this.f16300n.centerY() - this.f16297k) + (this.f16294h / 2)));
            this.f16287a.rLineTo(0.0f, (float) this.f16297k);
            this.f16287a.rLineTo((float) (-this.f16296j), (float) ((-this.f16297k) / 2));
            this.f16287a.rLineTo((float) this.f16296j, (float) ((-this.f16297k) / 2));
            this.f16287a.close();
        }
    }

    protected final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.f16310x == 2 || this.f16310x == 4) {
            m16054a(canvas);
        }
        canvas.drawRoundRect(this.f16288b, (float) this.f16298l, (float) this.f16298l, this.f16289c);
        if (this.f16310x == 1 || this.f16310x == 3) {
            m16054a(canvas);
        }
        canvas.restore();
    }

    private final void m16055a(Point point) {
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
    }

    private final void m16054a(Canvas canvas) {
        canvas.save();
        if (C3148t.m16056a(this.f16310x)) {
            canvas.translate((float) (this.f16294h - this.f16282A), 0.0f);
        } else if (this.f16310x == 3 || this.f16310x == 4) {
            canvas.translate(0.0f, (float) (this.f16294h - this.f16283B));
        }
        canvas.drawPath(this.f16287a, this.f16289c);
        canvas.restore();
    }

    private static int m16053a(int i, int i2, int i3) {
        return Math.min(i3, Math.max(i2, i));
    }

    private static boolean m16056a(int i) {
        return i == 1 || i == 2;
    }
}
