package com.google.android.libraries.play.entertainment.p346h;

import android.util.Log;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import java.util.HashMap;
import java.util.Map;

public class C6090b {
    public static C6080a f30240a;
    public static final Map f30241b = new HashMap();
    public static boolean f30242c;
    public final C6080a f30243d;
    public final String f30244e;
    public boolean f30245f;

    public static C6090b m28050a() {
        String valueOf = String.valueOf("PD@");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Object obj = null;
        int length = stackTrace.length - 1;
        while (length >= 0) {
            StackTraceElement stackTraceElement = stackTrace[length];
            if (stackTraceElement.getClassName().equals(C6090b.class.getName())) {
                String className = ((StackTraceElement) C6116b.m28100a(obj)).getClassName();
                className = String.valueOf(className.substring(className.lastIndexOf(".") + 1));
                return C6090b.m28051a(className.length() != 0 ? valueOf.concat(className) : new String(valueOf));
            }
            length--;
            StackTraceElement stackTraceElement2 = stackTraceElement;
        }
        throw new IllegalStateException("no caller found on the stack");
    }

    private static C6090b m28051a(String str) {
        C6090b c6090b;
        synchronized (f30241b) {
            c6090b = (C6090b) f30241b.get(str);
            if (c6090b == null) {
                c6090b = new C6090b(f30240a, str);
                f30241b.put(str, c6090b);
            }
        }
        return c6090b;
    }

    public static void m28052a(C6080a c6080a) {
        f30240a = c6080a;
    }

    private C6090b(C6080a c6080a, String str) {
        this.f30243d = c6080a;
        this.f30244e = str;
    }

    public final boolean m28059b() {
        return this.f30245f || f30242c;
    }

    public final void m28054a(String str, Object... objArr) {
        if (m28056a(2)) {
            this.f30243d.mo5282a(2, this.f30244e, C6090b.m28053c(null, str, objArr));
        }
    }

    public final void m28057b(String str, Object... objArr) {
        if (m28056a(3)) {
            this.f30243d.mo5282a(3, this.f30244e, C6090b.m28053c(null, str, objArr));
        }
    }

    public final void m28055a(Throwable th, String str, Object... objArr) {
        if (m28056a(5)) {
            this.f30243d.mo5282a(5, this.f30244e, C6090b.m28053c(th, str, objArr));
        }
    }

    public final void m28058b(Throwable th, String str, Object... objArr) {
        if (m28056a(6)) {
            this.f30243d.mo5282a(6, this.f30244e, C6090b.m28053c(th, str, objArr));
        }
    }

    public final boolean m28056a(int i) {
        return m28059b() || i > 4;
    }

    public static String m28053c(Throwable th, String str, Object... objArr) {
        String format = objArr.length == 0 ? str : String.format(str, objArr);
        if (format == null) {
            format = "";
        }
        if (th == null) {
            return format;
        }
        String stackTraceString = Log.getStackTraceString(th);
        return new StringBuilder((String.valueOf(format).length() + 1) + String.valueOf(stackTraceString).length()).append(format).append("\n").append(stackTraceString).toString();
    }
}
