package com.google.common.flogger.p423b;

public final class C7010a {
    public static final C7012c f34487a = C7012c.m31955a();

    public static StackTraceElement m31952a(Class cls, Throwable th) {
        C7011b.m31954a(cls, "target");
        C7011b.m31954a(th, "throwable");
        StackTraceElement[] stackTrace = f34487a != null ? null : th.getStackTrace();
        Object obj = null;
        int i = 1;
        while (true) {
            try {
                StackTraceElement a;
                if (f34487a != null) {
                    a = f34487a.m31957a(th, i);
                } else {
                    a = stackTrace[i];
                }
                if (cls.getName().equals(a.getClassName())) {
                    obj = 1;
                } else if (obj != null) {
                    return a;
                }
                i++;
            } catch (Exception e) {
                return null;
            }
        }
    }

    public static StackTraceElement[] m31953a(Class cls, Throwable th, int i) {
        int i2 = 1;
        C7011b.m31954a(cls, "target");
        C7011b.m31954a(th, "throwable");
        if (i > 0 || i == -1) {
            StackTraceElement[] stackTraceElementArr;
            int a;
            if (f34487a != null) {
                stackTraceElementArr = null;
                a = f34487a.m31956a(th);
            } else {
                stackTraceElementArr = th.getStackTrace();
                a = stackTraceElementArr.length;
            }
            int i3 = 2;
            int i4 = 0;
            while (i3 < a) {
                int i5;
                StackTraceElement a2 = f34487a != null ? f34487a.m31957a(th, i3) : stackTraceElementArr[i3];
                if (cls.getName().equals(a2.getClassName())) {
                    i5 = 1;
                } else if (i4 != 0) {
                    a -= i3;
                    if (i <= 0 || i >= a) {
                        i = a;
                    }
                    StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
                    stackTraceElementArr2[0] = a2;
                    while (i2 < i) {
                        StackTraceElement a3;
                        if (f34487a != null) {
                            a3 = f34487a.m31957a(th, i3 + i2);
                        } else {
                            a3 = stackTraceElementArr[i3 + i2];
                        }
                        stackTraceElementArr2[i2] = a3;
                        i2++;
                    }
                    return stackTraceElementArr2;
                } else {
                    i5 = i4;
                }
                i3++;
                i4 = i5;
            }
            return new StackTraceElement[0];
        }
        throw new IllegalArgumentException("invalid maximum depth: " + i);
    }
}
