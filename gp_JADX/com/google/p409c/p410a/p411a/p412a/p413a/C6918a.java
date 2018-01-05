package com.google.p409c.p410a.p411a.p412a.p413a;

import java.io.PrintStream;
import java.io.PrintWriter;

public final class C6918a {
    public static final C6919b f34250a;

    public static void m31587a(Throwable th, Throwable th2) {
        f34250a.mo5844a(th, th2);
    }

    public static void m31584a(Throwable th) {
        f34250a.mo5841a(th);
    }

    public static void m31586a(Throwable th, PrintWriter printWriter) {
        f34250a.mo5843a(th, printWriter);
    }

    public static void m31585a(Throwable th, PrintStream printStream) {
        f34250a.mo5842a(th, printStream);
    }

    private static Integer m31583a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    static {
        Integer a;
        C6919b c6924g;
        Throwable th;
        PrintStream printStream;
        String name;
        try {
            a = C6918a.m31583a();
            if (a != null) {
                try {
                    if (a.intValue() >= 19) {
                        c6924g = new C6924g();
                        f34250a = c6924g;
                        if (a == null) {
                            a.intValue();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    printStream = System.err;
                    name = C6923f.class.getName();
                    printStream.println(new StringBuilder(String.valueOf(name).length() + 132).append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ").append(name).append("will be used. The error is: ").toString());
                    th.printStackTrace(System.err);
                    c6924g = new C6923f();
                    f34250a = c6924g;
                    if (a == null) {
                        a.intValue();
                    }
                }
            }
            if ((!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? 1 : null) != null) {
                c6924g = new C6922e();
            } else {
                c6924g = new C6923f();
            }
        } catch (Throwable th3) {
            Throwable th4 = th3;
            a = null;
            th = th4;
            printStream = System.err;
            name = C6923f.class.getName();
            printStream.println(new StringBuilder(String.valueOf(name).length() + 132).append("An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ").append(name).append("will be used. The error is: ").toString());
            th.printStackTrace(System.err);
            c6924g = new C6923f();
            f34250a = c6924g;
            if (a == null) {
                a.intValue();
            }
        }
        f34250a = c6924g;
        if (a == null) {
            a.intValue();
        }
    }
}
