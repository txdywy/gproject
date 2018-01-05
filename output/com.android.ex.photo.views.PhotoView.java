package com.android.ex.photo.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix$ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.support.v4.view.i;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.View$MeasureSpec;
import android.view.View$OnClickListener;
import android.view.ViewConfiguration;
import com.android.ex.photo.x;
import com.android.ex.photo.y;

public class PhotoView extends View implements GestureDetector$OnDoubleTapListener, GestureDetector$OnGestureListener, ScaleGestureDetector$OnScaleGestureListener
{

    public static int a;
    public static boolean b;
    public static int c;
    public static Bitmap d;
    public static Bitmap e;
    public static Paint f;
    public static Paint g;
    public boolean A;
    public com.android.ex.photo.views.c B;
    public float C;
    public float D;
    public com.android.ex.photo.views.e E;
    public com.android.ex.photo.views.d F;
    public com.android.ex.photo.views.b G;
    public float H;
    public RectF I;
    public RectF J;
    public RectF K;
    public float[] L;
    public boolean M;
    public float N;
    public float O;
    public boolean P;
    public Drawable h;
    public Matrix i;
    public Matrix j;
    public Matrix k;
    public int l;
    public boolean m;
    public boolean n;
    public byte[] o;
    public boolean p;
    public boolean q;
    public Rect r;
    public int s;
    public float t;
    public android.support.v4.view.i u;
    public ScaleGestureDetector v;
    public View$OnClickListener w;
    public boolean x;
    public boolean y;
    public boolean z;

    PhotoView(Context p0) {
        View(p0);
        this.j = new Matrix();
        this.k = new Matrix();
        this.l = -1;
        this.r = new Rect();
        this.y = 1;
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new float[9];
        this.e();
    }

    PhotoView(Context p0, AttributeSet p1) {
        View(p0, p1);
        this.j = new Matrix();
        this.k = new Matrix();
        this.l = -1;
        this.r = new Rect();
        this.y = 1;
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new float[9];
        this.e();
    }

    PhotoView(Context p0, AttributeSet p1, int p2) {
        View(p0, p1, p2);
        this.j = new Matrix();
        this.k = new Matrix();
        this.l = -1;
        this.r = new Rect();
        this.y = 1;
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new float[9];
        this.e();
    }

    private final boolean a(MotionEvent p0) {
        if (this.y != 0 && this.x != 0 && this.M != 0) {
            if (this.z == 0) {
                v4 = this.b();
                if (v4 > this.C) {
                    v2 = this.C;
                    v1 = ((float)(this.getWidth() / 2) - this.K.centerX() * v2 / v4) / (1065353216 - v2 / v4);
                    v0 = ((float)(this.getHeight() / 2) - this.K.centerY() * v2 / v4) / (1065353216 - v2 / v4);
                }
                else {
                    v2 = Math.min(this.D, Math.max(this.C, v4 * 1073741824));
                    v1 = ((float)this.getWidth() - this.K.width()) / (v2 / v4);
                    v5 = ((float)this.getHeight() - this.K.height()) / (v2 / v4);
                    if (this.K.width() <= v1 * 1073741824)
                        v0 = this.K.centerX();
                    else
                        v0 = Math.min(Math.max(this.K.left + v1, p0.getX()), this.K.right - v1);
                    if (this.K.height() <= v5 * 1073741824) {
                        v1 = v0;
                        v0 = this.K.centerY();
                    }
                    else {
                        v1 = v0;
                        v0 = Math.min(Math.max(this.K.top + v5, p0.getY()), this.K.bottom - v5);
                    }
                }
                this.B.a(v4, v2, v1, v0);
                v0 = 1;
            }
            else
                v0 = 0;
            this.z = 0;
        }
        else
            v0 = 0;
        this.M = 0;
        return v0;
    }

    private final int d() {
        if (this.s > 0)
            v0 = this.s;
        else
            v0 = PhotoView.c;
        return v0;
    }

    private final void e() {
        v0 = 0;
        v1 = this.getContext();
        if (PhotoView.b == 0) {
            PhotoView.b = 1;
            v2 = v1.getApplicationContext().getResources();
            PhotoView.c = v2.getDimensionPixelSize(com.android.ex.photo.y.photo_crop_width);
            v3 = new Paint();
            PhotoView.f = v3;
            v3.setAntiAlias(1);
            PhotoView.f.setColor(v2.getColor(com.android.ex.photo.x.photo_crop_dim_color));
            PhotoView.f.setStyle(Paint$Style.FILL);
            v3 = new Paint();
            PhotoView.g = v3;
            v3.setAntiAlias(1);
            PhotoView.g.setColor(v2.getColor(com.android.ex.photo.x.photo_crop_highlight_color));
            PhotoView.g.setStyle(Paint$Style.STROKE);
            PhotoView.g.setStrokeWidth(v2.getDimension(com.android.ex.photo.y.photo_crop_stroke_width));
            v2 = ViewConfiguration.get(v1).getScaledTouchSlop();
            PhotoView.a = v2 * v2;
        }
        this.u = new android.support.v4.view.i(v1, this, 0);
        this.v = new ScaleGestureDetector(v1, this);
        if (Build$VERSION.SDK_INT >= 19)
            v0 = this.v.isQuickScaleEnabled();
        this.P = v0;
        this.B = new com.android.ex.photo.views.c(this);
        this.E = new com.android.ex.photo.views.e(this);
        this.F = new com.android.ex.photo.views.d(this);
        this.G = new com.android.ex.photo.views.b(this);
    }

    final int a(float p0, float p1) {
        v1 = 0;
        this.K.set(this.I);
        this.j.mapRect(this.K);
        if (this.q != 0)
            v0 = (float)this.r.left;
        else
            v0 = 0;
        if (this.q != 0)
            v2 = (float)this.r.right;
        else
            v2 = (float)this.getWidth();
        if (this.q != 0)
            v0 = Math.max(v0 - this.K.right, Math.min(v2 - this.K.left, p0));
        else if (this.K.right - this.K.left < v2 - v0)
            v0 = v0 + (v2 - v0 - (this.K.left + this.K.right)) / 1073741824;
        else
            v0 = Math.max(v2 - this.K.right, Math.min(v0 - this.K.left, p0));
        if (this.q != 0)
            v1 = (float)this.r.top;
        if (this.q != 0)
            v2 = (float)this.r.bottom;
        else
            v2 = (float)this.getHeight();
        if (this.q != 0)
            v1 = Math.max(v1 - this.K.bottom, Math.min(v2 - this.K.top, p1));
        else if (this.K.bottom - this.K.top < v2 - v1)
            v1 = v1 + (v2 - v1 - (this.K.top + this.K.bottom)) / 1073741824;
        else
            v1 = Math.max(v2 - this.K.bottom, Math.min(v1 - this.K.top, p1));
        this.j.postTranslate(v0, v1);
        this.invalidate();
        if (v0 == p0)
            v2 = 1;
        else
            v2 = 0;
        if (v1 == p1)
            v0 = 1;
        else
            v0 = 0;
        if (v2 != 0 && v0 != 0)
            v0 = 3;
        else if (v2 != 0)
            v0 = 1;
        else if (v0 != 0)
            v0 = 2;
        else
            v0 = 0;
        return v0;
    }

    public final void a() {
        this.j.set(this.k);
        this.invalidate();
    }

    final void a(float p0, float p1, float p2) {
        this.j.postRotate(-this.H, (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
        v0 = Math.min(Math.max(p0, this.C), this.D * 1069547520);
        v1 = this.b();
        if (v0 > this.D && v1 <= this.D)
            this.postDelayed(new com.android.ex.photo.views.a(this), 600);
        this.j.postScale(v0 / v1, v0 / v1, p1, p2);
        this.j.postRotate(this.H, (float)(this.getWidth() / 2), (float)(this.getHeight() / 2));
        this.invalidate();
    }

    public final void a(boolean p0) {
        if (p0 != this.n) {
            this.n = p0;
            this.requestLayout();
            this.invalidate();
        }
    }

    final float b() {
        this.j.getValues(this.L);
        return this.L[0];
    }

    public final void b(boolean p0) {
        this.x = p0;
        if (this.x == 0)
            this.a();
    }

    final void c() {
        v1 = 0;
        this.K.set(this.I);
        this.j.mapRect(this.K);
        if (this.q != 0)
            v0 = (float)this.r.left;
        else
            v0 = 0;
        if (this.q != 0)
            v2 = (float)this.r.right;
        else
            v2 = (float)this.getWidth();
        if (this.K.right - this.K.left < v2 - v0)
            v0 = v0 + (v2 - v0 - (this.K.left + this.K.right)) / 1073741824;
        else if (this.K.left > v0)
            v0 = v0 - this.K.left;
        else if (this.K.right < v2)
            v0 = v2 - this.K.right;
        else
            v0 = 0;
        if (this.q != 0)
            v2 = (float)this.r.top;
        else
            v2 = 0;
        if (this.q != 0)
            v3 = (float)this.r.bottom;
        else
            v3 = (float)this.getHeight();
        if (this.K.bottom - this.K.top < v3 - v2)
            v1 = (v3 - v2 - (this.K.bottom + this.K.top)) / 1073741824 + v2;
        else if (this.K.top > v2)
            v1 = v2 - this.K.top;
        else if (this.K.bottom < v3)
            v1 = v3 - this.K.bottom;
        if (Math.abs(v0) > 1101004800 || Math.abs(v1) > 1101004800) {
            if (this.F.e == 0) {
                this.F.d = -1;
                this.F.b = v0;
                this.F.c = v1;
                this.F.f = 0;
                this.F.e = 1;
                this.F.a.postDelayed(this.F, 250);
            }
        }
        else {
            this.j.postTranslate(v0, v1);
            this.invalidate();
        }
    }

    public final void c(boolean p0) {
  3:    v1 = 0;
  9:    if (this.h == 0)
 15:        return;
 13:    if (this.m == 0)
 15:        return;
 18:    v3 = this.h.getIntrinsicWidth();
 24:    v4 = this.h.getIntrinsicHeight();
 36:    if (v3 < 0) goto 40;
 38:    if (this.getWidth() == v3 && (v4 < 0 || this.getHeight() == v4))
 44:        v0 = 1;
        else
181:        v0 = 0;
 47:    this.h.setBounds(0, 0, v3, v4);
 50:    if (p0 != 0 || this.C == 0 && this.h != 0 && this.m != 0) {
 68:        v5 = this.h.getIntrinsicWidth();
 74:        v6 = this.h.getIntrinsicHeight();
 80:        if (this.q != 0)
 82:            v3 = PhotoView.c;
            else
184:            v3 = this.getWidth();
 86:        if (this.q != 0)
 88:            v4 = PhotoView.c;
            else
189:            v4 = this.getHeight();
 90:        if ((v5 < 0 || v3 == v5) && (v6 < 0 || v4 == v6))
 98:            v1 = 1;
 99:        if (v1 != 0 && this.q == 0)
107:            this.j.reset();
            else {
198:            this.I.set(0, 0, (float)v5, (float)v6);
203:            if (this.q != 0)
209:                this.J.set(this.r);
                else
276:                this.J.set(0, 0, (float)v3, (float)v4);
250:            v1 = new RectF((float)(v3 / 2) - (float)v5 * this.t / 1073741824, (float)(v4 / 2) - (float)v6 * this.t / 1073741824, (float)(v3 / 2) + (float)v5 * this.t / 1073741824, (float)(v4 / 2) + (float)v6 * this.t / 1073741824);
259:            if (this.J.contains(v1))
267:                this.j.setRectToRect(this.I, v1, Matrix$ScaleToFit.CENTER);
                else
288:                this.j.setRectToRect(this.I, this.J, Matrix$ScaleToFit.CENTER);
            }
114:        this.k.set(this.j);
131:        if (this.q != 0)
133:            v1 = this.d();
            else
293:            v1 = this.getWidth();
139:        if (this.q != 0)
141:            v2 = this.d();
            else
299:            v2 = this.getHeight();
145:        if (this.h.getIntrinsicWidth() < v1 && this.h.getIntrinsicHeight() < v2 && this.q == 0)
155:            this.C = 1065353216;
            else
309:            this.C = this.b();
164:        this.D = Math.max(this.C * 1082130432, 1082130432);
        }
166:    if (v0 != 0 || this.j.isIdentity())
177:        this.i = 0;
        else
315:        this.i = this.j;
    }

    public Bitmap getCroppedPhoto() {
        if (this.q == 0)
            v0 = 0;
        else {
            v0 = Bitmap.createBitmap(256, 256, Bitmap$Config.ARGB_8888);
            v1 = new Canvas(v0);
            v3 = new Matrix(this.i);
            v3.postTranslate((float)-this.r.left, (float)-this.r.top);
            v3.postScale(1132462080 / (float)(this.r.right - this.r.left), 1132462080 / (float)(this.r.right - this.r.left));
            if (this.h != 0) {
                v1.concat(v3);
                this.h.draw(v1);
            }
        }
        return v0;
    }

    public Drawable getDrawable() {
        return this.h;
    }

    public Bitmap getPhoto() {
        if (this.h != 0 && this.h instanceof BitmapDrawable)
            v0 = ((BitmapDrawable)this.h).getBitmap();
        else
            v0 = 0;
        return v0;
    }

    public byte[] getVideoData() {
        return this.o;
    }

    public void invalidateDrawable(Drawable p0) {
        if (this.h == p0)
            this.invalidate();
        else
            super.invalidateDrawable(p0);
    }

    public boolean onDoubleTap(MotionEvent p0) {
        this.M = 1;
        if (this.P == 0)
            v0 = this.a(p0);
        else
            v0 = 0;
        return v0;
    }

    public boolean onDoubleTapEvent(MotionEvent p0) {
        v0 = 0;
        switch (p0.getAction()) {
            case 0:
                if (this.P != 0) {
                    this.N = p0.getX();
                    this.O = p0.getY();
                }
                break;
            case 1:
                if (this.P != 0)
                    v0 = this.a(p0);
                break;
            case 2:
                if (this.P != 0) {
                    if (this.M != 0) {
                        v1 = (int)(p0.getX() - this.N);
                        v2 = (int)(p0.getY() - this.O);
                        if (v1 * v1 + v2 * v2 > PhotoView.a)
                            this.M = 0;
                    }
                }
                break;
            default:
                break;
        }
        return v0;
    }

    public boolean onDown(MotionEvent p0) {
        if (this.x != 0) {
            this.E.a();
            this.F.a();
        }
        return 1;
    }

    protected void onDraw(Canvas p0) {
        super.onDraw(p0);
        if (this.h != 0) {
            p0.save();
            if (this.i != 0)
                p0.concat(this.i);
            this.h.draw(p0);
            p0.restoreToCount(p0.getSaveCount());
            if (this.o != 0) {
                if (this.p != 0)
                    v0 = PhotoView.d;
                else
                    v0 = PhotoView.e;
                p0.drawBitmap(v0, (float)((this.getWidth() - v0.getWidth()) / 2), (float)((this.getHeight() - v0.getHeight()) / 2), 0);
            }
            this.K.set(this.h.getBounds());
            if (this.i != 0)
                this.i.mapRect(this.K);
            if (this.q != 0) {
                p0.drawRect(0, 0, (float)this.getWidth(), (float)this.getHeight(), PhotoView.f);
                p0.save();
                p0.clipRect(this.r);
                if (this.i != 0)
                    p0.concat(this.i);
                this.h.draw(p0);
                p0.restoreToCount(p0.getSaveCount());
                p0.drawRect(this.r, PhotoView.g);
            }
        }
    }

    public boolean onFling(MotionEvent p0, MotionEvent p1, float p2, float p3) {
        if (this.x != 0 && this.B.i == 0 && this.E.g == 0) {
            this.E.f = -1;
            this.E.b = p2;
            this.E.c = p3;
            v1 = (float)Math.atan2((double)this.E.c, (double)this.E.b);
            this.E.d = (float)(Math.cos((double)v1) * 4671226772094713856);
            this.E.e = (float)(Math.sin((double)v1) * 4671226772094713856);
            this.E.h = 0;
            this.E.g = 1;
            this.E.a.post(this.E);
        }
        return 1;
    }

    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        super.onLayout(p0, p1, p2, p3, p4);
        this.m = 1;
        v0 = this.getWidth();
        v1 = this.getHeight();
        if (this.q != 0) {
            this.s = Math.min(PhotoView.c, Math.min(v0, v1));
            this.r.set((v0 - this.s) / 2, (v1 - this.s) / 2, this.s + (v0 - this.s) / 2, this.s + (v1 - this.s) / 2);
        }
        this.c(p0);
    }

    public void onLongPress(MotionEvent p0) {
    }

    protected void onMeasure(int p0, int p1) {
        if (this.l != -1) {
            super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(this.l, -2147483648));
            this.setMeasuredDimension(this.getMeasuredWidth(), this.l);
        }
        else
            super.onMeasure(p0, p1);
    }

    public boolean onScale(ScaleGestureDetector p0) {
        if (this.x != 0 && this.B.i == 0) {
            this.A = 0;
            this.a(this.b() * p0.getScaleFactor(), p0.getFocusX(), p0.getFocusY());
        }
        return 1;
    }

    public boolean onScaleBegin(ScaleGestureDetector p0) {
        if (this.x != 0 && this.B.i == 0) {
            this.B.a();
            this.A = 1;
        }
        return 1;
    }

    public void onScaleEnd(ScaleGestureDetector p0) {
        if (this.x != 0 && this.A != 0) {
            this.z = 1;
            this.a();
        }
    }

    public boolean onScroll(MotionEvent p0, MotionEvent p1, float p2, float p3) {
        if (this.x != 0 && this.B.i == 0)
            this.a(-p2, -p3);
        return 1;
    }

    public void onShowPress(MotionEvent p0) {
    }

    public boolean onSingleTapConfirmed(MotionEvent p0) {
        if (this.w != 0 && this.A == 0)
            this.w.onClick(this);
        this.A = 0;
        return 1;
    }

    public boolean onSingleTapUp(MotionEvent p0) {
        return 0;
    }

    public boolean onTouchEvent(MotionEvent p0) {
        if (this.v == 0 || this.u == 0)
            return 1;
        this.v.onTouchEvent(p0);
        this.u.a(p0);
        switch (p0.getAction()) {
            case 1:
                if (this.E.g == 0)
                    this.c();
                break;
            case 2:
                break;
            case 3:
                if (this.E.g == 0)
                    this.c();
                break;
            default:
                break;
        }
    }

    public void setFixedHeight(int p0) {
        if (p0 != this.l)
            v0 = 1;
        else
            v0 = 0;
        this.l = p0;
        this.setMeasuredDimension(this.getMeasuredWidth(), this.l);
        if (v0 != 0) {
            this.c(1);
            this.requestLayout();
        }
    }

    public void setMaxInitialScale(float p0) {
        this.t = p0;
    }

    public void setOnClickListener(View$OnClickListener p0) {
        this.w = p0;
    }

    public boolean verifyDrawable(Drawable p0) {
        if (this.h == p0 || super.verifyDrawable(p0))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

}
