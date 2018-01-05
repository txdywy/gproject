package com.google.android.libraries.bind.p325d;

import android.content.Context;
import android.content.res.Resources.NotFoundException;

public final class C5893b {
    public static Context f29415a;

    public static String m27341a(int i) {
        if (f29415a != null) {
            try {
                return f29415a.getResources().getResourceEntryName(i);
            } catch (NotFoundException e) {
            }
        }
        return Integer.toString(i);
    }

    public static void m27342a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m27343a(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
