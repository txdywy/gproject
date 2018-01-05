package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.internal.C5124m;

public final class dl {
    public final String f26655a;
    public final String f26656b;
    public final int f26657c;

    private dl(String str, String str2) {
        this.f26656b = str2;
        this.f26655a = str;
        C5124m c5124m = new C5124m(str, (byte) 0);
        this.f26657c = m24288a();
    }

    public dl(String str, String... strArr) {
        this(str, m24289a(strArr));
    }

    private final int m24288a() {
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f26655a, i)) {
            i++;
        }
        return i;
    }

    private static String m24289a(String... strArr) {
        if (strArr.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        for (String str : strArr) {
            if (stringBuilder.length() > 1) {
                stringBuilder.append(",");
            }
            stringBuilder.append(str);
        }
        stringBuilder.append(']').append(' ');
        return stringBuilder.toString();
    }

    public final void m24291b(String str, Object... objArr) {
        Log.w(this.f26655a, m24292c(str, objArr));
    }

    public final String m24292c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return this.f26656b.concat(str);
    }

    public final void m24290a(String str, Object... objArr) {
        if (this.f26657c <= 3) {
            Log.d(this.f26655a, m24292c(str, objArr));
        }
    }
}
