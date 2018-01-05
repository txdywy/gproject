package com.android.ex.photo.e;

import android.os.Build$VERSION;
import android.os.Trace;

public static class com.android.ex.photo.e.h
{

    public static void a() {
        if (Build$VERSION.SDK_INT >= 18)
            Trace.endSection();
    }

    public static void a(String p0) {
        if (Build$VERSION.SDK_INT >= 18)
            Trace.beginSection(p0);
    }

}
