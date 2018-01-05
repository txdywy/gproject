package com.google.p409c.p410a.p411a.p412a.p413a;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

final class C6922e extends C6919b {
    public final C6920c f34254a = new C6920c();

    C6922e() {
    }

    public final void mo5844a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        } else {
            this.f34254a.m31592a(th, true).add(th2);
        }
    }

    public final void mo5841a(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.f34254a.m31592a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            }
        }
    }

    public final void mo5842a(Throwable th, PrintStream printStream) {
        th.printStackTrace(printStream);
        List<Throwable> a = this.f34254a.m31592a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printStream.print("Suppressed: ");
                    th2.printStackTrace(printStream);
                }
            }
        }
    }

    public final void mo5843a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a = this.f34254a.m31592a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable th2 : a) {
                    printWriter.print("Suppressed: ");
                    th2.printStackTrace(printWriter);
                }
            }
        }
    }
}
