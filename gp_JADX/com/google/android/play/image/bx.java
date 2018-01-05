package com.google.android.play.image;

import android.graphics.Bitmap;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class bx extends WeakReference {
    public String f32089a;
    public int f32090b;
    public int f32091c;
    public bx f32092d = null;
    public bx f32093e;

    bx(Bitmap bitmap, ReferenceQueue referenceQueue, String str, int i, int i2, bx bxVar) {
        super(bitmap, referenceQueue);
        this.f32089a = str;
        this.f32090b = i;
        this.f32091c = i2;
        this.f32093e = bxVar;
    }
}
