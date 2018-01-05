package com.google.android.instantapps.common;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

public final class C5804k {
    public final String f29259a;

    public C5804k(String str) {
        this.f29259a = str;
    }

    public final int m27207a(String str, Object... objArr) {
        if (Log.isLoggable("Isotope", 4)) {
            return Log.i("Isotope", C5804k.m27206a(this.f29259a, str, objArr));
        }
        return 0;
    }

    public final int m27209b(String str, Object... objArr) {
        if (Log.isLoggable("Isotope", 3)) {
            return Log.d("Isotope", C5804k.m27206a(this.f29259a, str, objArr));
        }
        return 0;
    }

    public final int m27210c(String str, Object... objArr) {
        if (Log.isLoggable("Isotope", 5)) {
            return Log.w("Isotope", C5804k.m27206a(this.f29259a, str, objArr));
        }
        return 0;
    }

    public final int m27211d(String str, Object... objArr) {
        if (Log.isLoggable("Isotope", 6)) {
            return Log.e("Isotope", C5804k.m27206a(this.f29259a, str, objArr));
        }
        return 0;
    }

    public final int m27208a(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("Isotope", 6)) {
            return Log.e("Isotope", C5804k.m27206a(this.f29259a, str, objArr), th);
        }
        return 0;
    }

    private static String m27206a(String str, String str2, Object... objArr) {
        String stringBuilder = new StringBuilder((String.valueOf(str).length() + 42) + String.valueOf(str2).length()).append("UID: [").append(Process.myUid()).append("]  PID: [").append(Process.myPid()).append("] ").append(str).append(" : ").append(str2).toString();
        if (objArr == null || objArr.length <= 0) {
            return stringBuilder;
        }
        try {
            return String.format(Locale.US, stringBuilder, objArr);
        } catch (Throwable e) {
            Throwable th = e;
            String str3 = "Isotope";
            String str4 = "Unable to format ";
            String valueOf = String.valueOf(stringBuilder);
            Log.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), th);
            valueOf = String.valueOf(stringBuilder);
            stringBuilder = TextUtils.join(", ", objArr);
            return new StringBuilder((String.valueOf(valueOf).length() + 3) + String.valueOf(stringBuilder).length()).append(valueOf).append(" [").append(stringBuilder).append("]").toString();
        }
    }
}
