package com.google.android.play.image;

import android.graphics.Bitmap;
import android.util.LruCache;

final class bw extends LruCache {
    bw(int i) {
        super(i);
    }

    protected final /* synthetic */ int sizeOf(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj;
        return bitmap.getRowBytes() * bitmap.getHeight();
    }
}
