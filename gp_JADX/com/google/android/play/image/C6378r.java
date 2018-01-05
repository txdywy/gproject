package com.google.android.play.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView.ScaleType;
import com.google.android.play.utils.C6449e;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.b.j;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

final class C6378r implements Runnable {
    public final byte[] f32122a;
    public final C6375m f32123b;
    public final q f32124c;
    public final by f32125d;
    public final Handler f32126e = new Handler(Looper.getMainLooper());
    public C6376o f32127f;

    public C6378r(byte[] bArr, C6375m c6375m, q qVar, by byVar) {
        this.f32122a = bArr;
        this.f32123b = c6375m;
        this.f32124c = qVar;
        this.f32125d = byVar;
    }

    public final void run() {
        Bitmap decodeByteArray;
        Bitmap decodeByteArray2;
        Options options = new Options();
        if (this.f32123b.f32115d == 0 && this.f32123b.f32116e == 0) {
            options.inPreferredConfig = this.f32123b.f32117f;
            decodeByteArray = BitmapFactory.decodeByteArray(this.f32122a, 0, this.f32122a.length, options);
        } else {
            try {
                this.f32125d.a((this.f32123b.f32115d * this.f32123b.f32116e) * 2);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(this.f32122a, 0, this.f32122a.length, options);
                int i = options.outWidth;
                int i2 = options.outHeight;
                int a = C6378r.m29292a(this.f32123b.f32115d, this.f32123b.f32116e, i, i2, this.f32123b.f32118g);
                int a2 = C6378r.m29292a(this.f32123b.f32116e, this.f32123b.f32115d, i2, i, this.f32123b.f32118g);
                options.inJustDecodeBounds = false;
                options.inSampleSize = C6378r.m29291a(i, i2, a, a2);
                decodeByteArray2 = BitmapFactory.decodeByteArray(this.f32122a, 0, this.f32122a.length, options);
                if (decodeByteArray2 == null || (decodeByteArray2.getWidth() <= a && decodeByteArray2.getHeight() <= a2)) {
                    decodeByteArray = decodeByteArray2;
                } else {
                    decodeByteArray = Bitmap.createScaledBitmap(decodeByteArray2, a, a2, true);
                    decodeByteArray2.recycle();
                }
            } catch (Exception e) {
                PlayCommonLog.m29464e("Failed to decode bitmap.", new Object[0]);
                decodeByteArray = null;
            }
        }
        if (decodeByteArray == null) {
            this.f32126e.post(new C6379s(this));
            return;
        }
        if (((Boolean) j.z.b()).booleanValue()) {
            decodeByteArray2 = C6449e.m29500a(decodeByteArray, this.f32123b.f32112a, this.f32122a.length / MemoryMappedFileBuffer.DEFAULT_PADDING);
        } else {
            decodeByteArray2 = decodeByteArray;
        }
        this.f32126e.post(new C6380t(this, decodeByteArray2));
    }

    final synchronized boolean m29293a(C6376o c6376o) {
        boolean z;
        if (this.f32127f != null) {
            z = false;
        } else {
            this.f32127f = c6376o;
            z = true;
        }
        return z;
    }

    private static int m29291a(int i, int i2, int i3, int i4) {
        float f = 1.0f;
        while (((double) (f * 2.0f)) <= Math.min(((double) i) / ((double) i3), ((double) i2) / ((double) i4))) {
            f *= 2.0f;
        }
        return (int) f;
    }

    private static int m29292a(int i, int i2, int i3, int i4, ScaleType scaleType) {
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
}
