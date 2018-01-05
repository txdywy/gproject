package com.google.android.libraries.play.entertainment.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

public final class C6044m {
    public static volatile boolean f30155a;

    @TargetApi(19)
    static int m27941a(Bitmap bitmap) {
        if (!f30155a) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Throwable th) {
                f30155a = true;
            }
        }
        return bitmap.getByteCount();
    }
}
