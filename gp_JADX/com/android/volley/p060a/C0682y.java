package com.android.volley.p060a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView.ScaleType;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0697m;
import com.android.volley.C0699q;
import com.android.volley.C0704v;
import com.android.volley.ParseError;
import com.android.volley.aa;

public class C0682y extends C0656n {
    public static final Object f4116v = new Object();
    public final Object f4117e = new Object();
    public C0660x f4118q;
    public final Config f4119r;
    public final int f4120s;
    public final int f4121t;
    public final ScaleType f4122u;

    public C0682y(String str, C0660x c0660x, int i, int i2, ScaleType scaleType, Config config, C0657w c0657w) {
        super(0, str, c0657w);
        this.f4118q = c0660x;
        this.f4119r = config;
        this.f4120s = i;
        this.f4121t = i2;
        this.f4122u = scaleType;
    }

    public final C0699q mo1074n() {
        return C0699q.LOW;
    }

    private static int m4473a(int i, int i2, int i3, int i4, ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ScaleType.FIT_XY) {
            if (i == 0) {
                return i3;
            }
            return i;
        } else if (i == 0) {
            return (int) ((((double) i2) / ((double) i4)) * ((double) i3));
        } else {
            if (i2 == 0) {
                return i;
            }
            double d = ((double) i4) / ((double) i3);
            if (scaleType == ScaleType.CENTER_CROP) {
                if (((double) i) * d < ((double) i2)) {
                    return (int) (((double) i2) / d);
                }
                return i;
            } else if (((double) i) * d > ((double) i2)) {
                return (int) (((double) i2) / d);
            } else {
                return i;
            }
        }
    }

    public C0704v mo1055a(C0697m c0697m) {
        C0704v a;
        synchronized (f4116v) {
            try {
                Object decodeByteArray;
                byte[] bArr = c0697m.f4167b;
                Options options = new Options();
                if (this.f4120s == 0 && this.f4121t == 0) {
                    options.inPreferredConfig = this.f4119r;
                    decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    int i = options.outWidth;
                    int i2 = options.outHeight;
                    int a2 = C0682y.m4473a(this.f4120s, this.f4121t, i, i2, this.f4122u);
                    int a3 = C0682y.m4473a(this.f4121t, this.f4120s, i2, i, this.f4122u);
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = C0682y.m4472a(i, i2, a2, a3);
                    Bitmap decodeByteArray2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    if (decodeByteArray2 == null || (decodeByteArray2.getWidth() <= a2 && decodeByteArray2.getHeight() <= a3)) {
                        Bitmap bitmap = decodeByteArray2;
                    } else {
                        decodeByteArray = Bitmap.createScaledBitmap(decodeByteArray2, a2, a3, true);
                        decodeByteArray2.recycle();
                    }
                }
                if (decodeByteArray == null) {
                    a = C0704v.m4516a(new ParseError(c0697m));
                } else {
                    a = C0704v.m4517a(decodeByteArray, C0673n.m4460a(c0697m));
                }
            } catch (Throwable e) {
                aa.m4483c("Caught OOM for %d byte image, url=%s", Integer.valueOf(c0697m.f4167b.length), mo1545d());
                a = C0704v.m4516a(new ParseError(e));
            }
        }
        return a;
    }

    public final void mo1057f() {
        super.mo1057f();
        synchronized (this.f4117e) {
            this.f4118q = null;
        }
    }

    public void m4475a(Bitmap bitmap) {
        synchronized (this.f4117e) {
            C0660x c0660x = this.f4118q;
        }
        if (c0660x != null) {
            c0660x.b_(bitmap);
        }
    }

    private static int m4472a(int i, int i2, int i3, int i4) {
        float f = 1.0f;
        while (((double) (f * 2.0f)) <= Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4))) {
            f *= 2.0f;
        }
        return (int) f;
    }
}
