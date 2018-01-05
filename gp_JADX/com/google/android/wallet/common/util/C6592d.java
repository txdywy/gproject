package com.google.android.wallet.common.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.support.v4.h.i;
import com.android.volley.a.v;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C6592d extends i implements v {
    public C6592d(Context context, int i) {
        super(Math.min((((ActivityManager) context.getSystemService("activity")).getMemoryClass() * MemoryMappedFileBuffer.DEFAULT_PADDING) / 8, (((int) (Math.pow(((double) C6589a.m29898b(context).densityDpi) / 160.0d, 2.0d) * ((double) i))) * 4) / MemoryMappedFileBuffer.DEFAULT_PADDING));
    }

    public final Bitmap m29914a(String str) {
        return (Bitmap) a(str);
    }

    public final void m29915a(String str, Bitmap bitmap) {
        a(str, bitmap);
    }

    @TargetApi(19)
    protected final /* synthetic */ int m29916b(Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj2;
        if (VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount() / MemoryMappedFileBuffer.DEFAULT_PADDING;
        }
        return (bitmap.getRowBytes() * bitmap.getHeight()) / MemoryMappedFileBuffer.DEFAULT_PADDING;
    }
}
