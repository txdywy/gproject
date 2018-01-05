package com.android.ex.photo.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.C0352i;
import android.util.AttributeSet;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import com.android.ex.photo.C0590x;
import com.android.ex.photo.C0591y;

public class PhotoView extends View implements OnDoubleTapListener, OnGestureListener, OnScaleGestureListener {
    public static int f3850a;
    public static boolean f3851b;
    public static int f3852c;
    public static Bitmap f3853d;
    public static Bitmap f3854e;
    public static Paint f3855f;
    public static Paint f3856g;
    public boolean f3857A;
    public C0585c f3858B;
    public float f3859C;
    public float f3860D;
    public C0587e f3861E;
    public C0586d f3862F;
    public C0584b f3863G;
    public float f3864H;
    public RectF f3865I;
    public RectF f3866J;
    public RectF f3867K;
    public float[] f3868L;
    public boolean f3869M;
    public float f3870N;
    public float f3871O;
    public boolean f3872P;
    public Drawable f3873h;
    public Matrix f3874i;
    public Matrix f3875j;
    public Matrix f3876k;
    public int f3877l;
    public boolean f3878m;
    public boolean f3879n;
    public byte[] f3880o;
    public boolean f3881p;
    public boolean f3882q;
    public Rect f3883r;
    public int f3884s;
    public float f3885t;
    public C0352i f3886u;
    public ScaleGestureDetector f3887v;
    public OnClickListener f3888w;
    public boolean f3889x;
    public boolean f3890y;
    public boolean f3891z;

    public PhotoView(Context context) {
        super(context);
        this.f3875j = new Matrix();
        this.f3876k = new Matrix();
        this.f3877l = -1;
        this.f3883r = new Rect();
        this.f3890y = true;
        this.f3865I = new RectF();
        this.f3866J = new RectF();
        this.f3867K = new RectF();
        this.f3868L = new float[9];
        m4172e();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3875j = new Matrix();
        this.f3876k = new Matrix();
        this.f3877l = -1;
        this.f3883r = new Rect();
        this.f3890y = true;
        this.f3865I = new RectF();
        this.f3866J = new RectF();
        this.f3867K = new RectF();
        this.f3868L = new float[9];
        m4172e();
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3875j = new Matrix();
        this.f3876k = new Matrix();
        this.f3877l = -1;
        this.f3883r = new Rect();
        this.f3890y = true;
        this.f3865I = new RectF();
        this.f3866J = new RectF();
        this.f3867K = new RectF();
        this.f3868L = new float[9];
        m4172e();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!(this.f3887v == null || this.f3886u == null)) {
            this.f3887v.onTouchEvent(motionEvent);
            this.f3886u.m2036a(motionEvent);
            switch (motionEvent.getAction()) {
                case 1:
                case 3:
                    if (!this.f3861E.f3921g) {
                        m4179c();
                        break;
                    }
                    break;
                default:
                    break;
            }
        }
        return true;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        this.f3869M = true;
        if (this.f3872P) {
            return false;
        }
        return m4170a(motionEvent);
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                if (!this.f3872P) {
                    return false;
                }
                this.f3870N = motionEvent.getX();
                this.f3871O = motionEvent.getY();
                return false;
            case 1:
                if (this.f3872P) {
                    return m4170a(motionEvent);
                }
                return false;
            case 2:
                if (!this.f3872P || !this.f3869M) {
                    return false;
                }
                int x = (int) (motionEvent.getX() - this.f3870N);
                int y = (int) (motionEvent.getY() - this.f3871O);
                if ((x * x) + (y * y) <= f3850a) {
                    return false;
                }
                this.f3869M = false;
                return false;
            default:
                return false;
        }
    }

    private final boolean m4170a(MotionEvent motionEvent) {
        boolean z;
        if (this.f3890y && this.f3889x && this.f3869M) {
            if (this.f3891z) {
                z = false;
            } else {
                float f;
                float f2;
                float width;
                float b = m4177b();
                if (b > this.f3859C) {
                    f = this.f3859C;
                    f2 = f / b;
                    width = (((float) (getWidth() / 2)) - (this.f3867K.centerX() * f2)) / (1.0f - f2);
                    f2 = (((float) (getHeight() / 2)) - (this.f3867K.centerY() * f2)) / (1.0f - f2);
                } else {
                    f = Math.min(this.f3860D, Math.max(this.f3859C, b * 2.0f));
                    f2 = f / b;
                    width = (((float) getWidth()) - this.f3867K.width()) / f2;
                    float height = (((float) getHeight()) - this.f3867K.height()) / f2;
                    if (this.f3867K.width() <= width * 2.0f) {
                        f2 = this.f3867K.centerX();
                    } else {
                        f2 = Math.min(Math.max(this.f3867K.left + width, motionEvent.getX()), this.f3867K.right - width);
                    }
                    if (this.f3867K.height() <= height * 2.0f) {
                        width = f2;
                        f2 = this.f3867K.centerY();
                    } else {
                        width = f2;
                        f2 = Math.min(Math.max(this.f3867K.top + height, motionEvent.getY()), this.f3867K.bottom - height);
                    }
                }
                this.f3858B.m4182a(b, f, width, f2);
                z = true;
            }
            this.f3891z = false;
        } else {
            z = false;
        }
        this.f3869M = false;
        return z;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!(this.f3888w == null || this.f3857A)) {
            this.f3888w.onClick(this);
        }
        this.f3857A = false;
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f3889x && !this.f3858B.f3907i) {
            m4173a(-f, -f2);
        }
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if (this.f3889x) {
            this.f3861E.m4184a();
            this.f3862F.m4183a();
        }
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f3889x && !this.f3858B.f3907i) {
            Runnable runnable = this.f3861E;
            if (!runnable.f3921g) {
                runnable.f3920f = -1;
                runnable.f3916b = f;
                runnable.f3917c = f2;
                float atan2 = (float) Math.atan2((double) runnable.f3917c, (double) runnable.f3916b);
                runnable.f3918d = (float) (Math.cos((double) atan2) * 20000.0d);
                runnable.f3919e = (float) (Math.sin((double) atan2) * 20000.0d);
                runnable.f3922h = false;
                runnable.f3921g = true;
                runnable.f3915a.post(runnable);
            }
        }
        return true;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (this.f3889x && !this.f3858B.f3907i) {
            this.f3857A = false;
            m4175a(m4177b() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.f3889x && !this.f3858B.f3907i) {
            this.f3858B.m4181a();
            this.f3857A = true;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if (this.f3889x && this.f3857A) {
            this.f3891z = true;
            m4174a();
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f3888w = onClickListener;
    }

    public Bitmap getPhoto() {
        if (this.f3873h == null || !(this.f3873h instanceof BitmapDrawable)) {
            return null;
        }
        return ((BitmapDrawable) this.f3873h).getBitmap();
    }

    public Drawable getDrawable() {
        return this.f3873h;
    }

    public byte[] getVideoData() {
        return this.f3880o;
    }

    public final void m4176a(boolean z) {
        if (z != this.f3879n) {
            this.f3879n = z;
            requestLayout();
            invalidate();
        }
    }

    public Bitmap getCroppedPhoto() {
        if (!this.f3882q) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(256, 256, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = 256.0f / ((float) (this.f3883r.right - this.f3883r.left));
        Matrix matrix = new Matrix(this.f3874i);
        matrix.postTranslate((float) (-this.f3883r.left), (float) (-this.f3883r.top));
        matrix.postScale(f, f);
        if (this.f3873h == null) {
            return createBitmap;
        }
        canvas.concat(matrix);
        this.f3873h.draw(canvas);
        return createBitmap;
    }

    public final void m4174a() {
        this.f3875j.set(this.f3876k);
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f3873h != null) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            if (this.f3874i != null) {
                canvas.concat(this.f3874i);
            }
            this.f3873h.draw(canvas);
            canvas.restoreToCount(saveCount);
            if (this.f3880o != null) {
                Bitmap bitmap = this.f3881p ? f3853d : f3854e;
                canvas.drawBitmap(bitmap, (float) ((getWidth() - bitmap.getWidth()) / 2), (float) ((getHeight() - bitmap.getHeight()) / 2), null);
            }
            this.f3867K.set(this.f3873h.getBounds());
            if (this.f3874i != null) {
                this.f3874i.mapRect(this.f3867K);
            }
            if (this.f3882q) {
                int saveCount2 = canvas.getSaveCount();
                canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), f3855f);
                canvas.save();
                canvas.clipRect(this.f3883r);
                if (this.f3874i != null) {
                    canvas.concat(this.f3874i);
                }
                this.f3873h.draw(canvas);
                canvas.restoreToCount(saveCount2);
                canvas.drawRect(this.f3883r, f3856g);
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3878m = true;
        int width = getWidth();
        int height = getHeight();
        if (this.f3882q) {
            this.f3884s = Math.min(f3852c, Math.min(width, height));
            width = (width - this.f3884s) / 2;
            height = (height - this.f3884s) / 2;
            this.f3883r.set(width, height, this.f3884s + width, this.f3884s + height);
        }
        m4180c(z);
    }

    protected void onMeasure(int i, int i2) {
        if (this.f3877l != -1) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(this.f3877l, Integer.MIN_VALUE));
            setMeasuredDimension(getMeasuredWidth(), this.f3877l);
            return;
        }
        super.onMeasure(i, i2);
    }

    public boolean verifyDrawable(Drawable drawable) {
        return this.f3873h == drawable || super.verifyDrawable(drawable);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f3873h == drawable) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void setFixedHeight(int i) {
        boolean z = i != this.f3877l;
        this.f3877l = i;
        setMeasuredDimension(getMeasuredWidth(), this.f3877l);
        if (z) {
            m4180c(true);
            requestLayout();
        }
    }

    public final void m4178b(boolean z) {
        this.f3889x = z;
        if (!this.f3889x) {
            m4174a();
        }
    }

    public final void m4180c(boolean z) {
        int i = 0;
        if (this.f3873h != null && this.f3878m) {
            int intrinsicWidth = this.f3873h.getIntrinsicWidth();
            int intrinsicHeight = this.f3873h.getIntrinsicHeight();
            int i2 = ((intrinsicWidth < 0 || getWidth() == intrinsicWidth) && (intrinsicHeight < 0 || getHeight() == intrinsicHeight)) ? 1 : 0;
            this.f3873h.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            if (z || (this.f3859C == 0.0f && this.f3873h != null && this.f3878m)) {
                int intrinsicWidth2 = this.f3873h.getIntrinsicWidth();
                int intrinsicHeight2 = this.f3873h.getIntrinsicHeight();
                intrinsicWidth = this.f3882q ? f3852c : getWidth();
                intrinsicHeight = this.f3882q ? f3852c : getHeight();
                if ((intrinsicWidth2 < 0 || intrinsicWidth == intrinsicWidth2) && (intrinsicHeight2 < 0 || intrinsicHeight == intrinsicHeight2)) {
                    i = 1;
                }
                if (i == 0 || this.f3882q) {
                    this.f3865I.set(0.0f, 0.0f, (float) intrinsicWidth2, (float) intrinsicHeight2);
                    if (this.f3882q) {
                        this.f3866J.set(this.f3883r);
                    } else {
                        this.f3866J.set(0.0f, 0.0f, (float) intrinsicWidth, (float) intrinsicHeight);
                    }
                    RectF rectF = new RectF(((float) (intrinsicWidth / 2)) - ((((float) intrinsicWidth2) * this.f3885t) / 2.0f), ((float) (intrinsicHeight / 2)) - ((((float) intrinsicHeight2) * this.f3885t) / 2.0f), ((float) (intrinsicWidth / 2)) + ((((float) intrinsicWidth2) * this.f3885t) / 2.0f), ((float) (intrinsicHeight / 2)) + ((((float) intrinsicHeight2) * this.f3885t) / 2.0f));
                    if (this.f3866J.contains(rectF)) {
                        this.f3875j.setRectToRect(this.f3865I, rectF, ScaleToFit.CENTER);
                    } else {
                        this.f3875j.setRectToRect(this.f3865I, this.f3866J, ScaleToFit.CENTER);
                    }
                } else {
                    this.f3875j.reset();
                }
                this.f3876k.set(this.f3875j);
                intrinsicWidth = this.f3873h.getIntrinsicWidth();
                intrinsicHeight = this.f3873h.getIntrinsicHeight();
                i = this.f3882q ? m4171d() : getWidth();
                int d = this.f3882q ? m4171d() : getHeight();
                if (intrinsicWidth >= i || intrinsicHeight >= d || this.f3882q) {
                    this.f3859C = m4177b();
                } else {
                    this.f3859C = 1.0f;
                }
                this.f3860D = Math.max(this.f3859C * 4.0f, 4.0f);
            }
            if (i2 != 0 || this.f3875j.isIdentity()) {
                this.f3874i = null;
            } else {
                this.f3874i = this.f3875j;
            }
        }
    }

    private final int m4171d() {
        return this.f3884s > 0 ? this.f3884s : f3852c;
    }

    final float m4177b() {
        this.f3875j.getValues(this.f3868L);
        return this.f3868L[0];
    }

    final void m4175a(float f, float f2, float f3) {
        this.f3875j.postRotate(-this.f3864H, (float) (getWidth() / 2), (float) (getHeight() / 2));
        float min = Math.min(Math.max(f, this.f3859C), this.f3860D * 1.5f);
        float b = m4177b();
        if (min > this.f3860D && b <= this.f3860D) {
            postDelayed(new C0583a(this), 600);
        }
        min /= b;
        this.f3875j.postScale(min, min, f2, f3);
        this.f3875j.postRotate(this.f3864H, (float) (getWidth() / 2), (float) (getHeight() / 2));
        invalidate();
    }

    final int m4173a(float f, float f2) {
        Object obj;
        Object obj2;
        float f3 = 0.0f;
        this.f3867K.set(this.f3865I);
        this.f3875j.mapRect(this.f3867K);
        float f4 = this.f3882q ? (float) this.f3883r.left : 0.0f;
        float width = this.f3882q ? (float) this.f3883r.right : (float) getWidth();
        float f5 = this.f3867K.left;
        float f6 = this.f3867K.right;
        if (this.f3882q) {
            f4 = Math.max(f4 - this.f3867K.right, Math.min(width - this.f3867K.left, f));
        } else if (f6 - f5 < width - f4) {
            f4 += ((width - f4) - (f5 + f6)) / 2.0f;
        } else {
            f4 = Math.max(width - f6, Math.min(f4 - f5, f));
        }
        if (this.f3882q) {
            f3 = (float) this.f3883r.top;
        }
        width = this.f3882q ? (float) this.f3883r.bottom : (float) getHeight();
        f5 = this.f3867K.top;
        f6 = this.f3867K.bottom;
        if (this.f3882q) {
            f3 = Math.max(f3 - this.f3867K.bottom, Math.min(width - this.f3867K.top, f2));
        } else if (f6 - f5 < width - f3) {
            f3 += ((width - f3) - (f5 + f6)) / 2.0f;
        } else {
            f3 = Math.max(width - f6, Math.min(f3 - f5, f2));
        }
        this.f3875j.postTranslate(f4, f3);
        invalidate();
        if (f4 == f) {
            obj = 1;
        } else {
            obj = null;
        }
        if (f3 == f2) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (obj != null && obj2 != null) {
            return 3;
        }
        if (obj != null) {
            return 1;
        }
        return obj2 != null ? 2 : 0;
    }

    final void m4179c() {
        float f = 0.0f;
        this.f3867K.set(this.f3865I);
        this.f3875j.mapRect(this.f3867K);
        float f2 = this.f3882q ? (float) this.f3883r.left : 0.0f;
        float width = this.f3882q ? (float) this.f3883r.right : (float) getWidth();
        float f3 = this.f3867K.left;
        float f4 = this.f3867K.right;
        f2 = f4 - f3 < width - f2 ? f2 + (((width - f2) - (f3 + f4)) / 2.0f) : f3 > f2 ? f2 - f3 : f4 < width ? width - f4 : 0.0f;
        if (this.f3882q) {
            width = (float) this.f3883r.top;
        } else {
            width = 0.0f;
        }
        f3 = this.f3882q ? (float) this.f3883r.bottom : (float) getHeight();
        f4 = this.f3867K.top;
        float f5 = this.f3867K.bottom;
        if (f5 - f4 < f3 - width) {
            f = (((f3 - width) - (f5 + f4)) / 2.0f) + width;
        } else if (f4 > width) {
            f = width - f4;
        } else if (f5 < f3) {
            f = f3 - f5;
        }
        if (Math.abs(f2) > 20.0f || Math.abs(f) > 20.0f) {
            Runnable runnable = this.f3862F;
            if (!runnable.f3913e) {
                runnable.f3912d = -1;
                runnable.f3910b = f2;
                runnable.f3911c = f;
                runnable.f3914f = false;
                runnable.f3913e = true;
                runnable.f3909a.postDelayed(runnable, 250);
                return;
            }
            return;
        }
        this.f3875j.postTranslate(f2, f);
        invalidate();
    }

    private final void m4172e() {
        boolean z = false;
        Context context = getContext();
        if (!f3851b) {
            f3851b = true;
            Resources resources = context.getApplicationContext().getResources();
            f3852c = resources.getDimensionPixelSize(C0591y.photo_crop_width);
            Paint paint = new Paint();
            f3855f = paint;
            paint.setAntiAlias(true);
            f3855f.setColor(resources.getColor(C0590x.photo_crop_dim_color));
            f3855f.setStyle(Style.FILL);
            paint = new Paint();
            f3856g = paint;
            paint.setAntiAlias(true);
            f3856g.setColor(resources.getColor(C0590x.photo_crop_highlight_color));
            f3856g.setStyle(Style.STROKE);
            f3856g.setStrokeWidth(resources.getDimension(C0591y.photo_crop_stroke_width));
            int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            f3850a = scaledTouchSlop * scaledTouchSlop;
        }
        this.f3886u = new C0352i(context, this, (byte) 0);
        this.f3887v = new ScaleGestureDetector(context, this);
        ScaleGestureDetector scaleGestureDetector = this.f3887v;
        if (VERSION.SDK_INT >= 19) {
            z = scaleGestureDetector.isQuickScaleEnabled();
        }
        this.f3872P = z;
        this.f3858B = new C0585c(this);
        this.f3861E = new C0587e(this);
        this.f3862F = new C0586d(this);
        this.f3863G = new C0584b(this);
    }

    public void setMaxInitialScale(float f) {
        this.f3885t = f;
    }
}
