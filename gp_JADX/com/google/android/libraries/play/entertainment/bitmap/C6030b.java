package com.google.android.libraries.play.entertainment.bitmap;

import android.graphics.Bitmap;
import com.google.android.libraries.play.entertainment.p351m.C6115a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;

public final class C6030b extends C6029t {
    public final Bitmap f30132a;
    public Object f30133b;
    public boolean f30134c;
    public int f30135d;

    public C6030b(Bitmap bitmap) {
        this(bitmap, new C6031c());
    }

    private C6030b(Bitmap bitmap, Object obj) {
        int allocationByteCount;
        C6116b.m28100a((Object) bitmap);
        if (C6115a.m28097a(21)) {
            allocationByteCount = bitmap.getAllocationByteCount();
        } else if (C6115a.m28097a(19)) {
            allocationByteCount = C6044m.m27941a(bitmap);
        } else {
            allocationByteCount = bitmap.getByteCount();
        }
        super(allocationByteCount);
        C6116b.m28100a(obj);
        this.f30132a = bitmap;
        this.f30133b = obj;
        this.f30134c = true;
    }

    public final String toString() {
        int width = this.f30132a.getWidth();
        int height = this.f30132a.getHeight();
        String toHexString = Integer.toHexString(this.f30132a.hashCode());
        int i = this.e;
        String valueOf = String.valueOf(this.f30133b);
        return new StringBuilder((String.valueOf(toHexString).length() + 53) + String.valueOf(valueOf).length()).append("bmp(").append(width).append("x").append(height).append("; id=").append(toHexString).append("; sz=").append(i).append("; k=").append(valueOf).append(")").toString();
    }
}
