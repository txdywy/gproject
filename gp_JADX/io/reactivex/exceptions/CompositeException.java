package io.reactivex.exceptions;

import com.google.p409c.p410a.p411a.p412a.p413a.C6918a;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class CompositeException extends RuntimeException {
    public final List f40304a;
    public final String f40305b;
    public Throwable f40306c;

    final class CompositeExceptionCausalChain extends RuntimeException {
        CompositeExceptionCausalChain() {
        }

        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public CompositeException(Iterable iterable) {
        Collection linkedHashSet = new LinkedHashSet();
        List arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).f40304a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        this.f40304a = Collections.unmodifiableList(arrayList);
        this.f40305b = this.f40304a.size() + " exceptions occurred. ";
    }

    public final String getMessage() {
        return this.f40305b;
    }

    public final synchronized Throwable getCause() {
        if (this.f40306c == null) {
            Throwable compositeExceptionCausalChain = new CompositeExceptionCausalChain();
            Set hashSet = new HashSet();
            Throwable th = compositeExceptionCausalChain;
            for (Throwable th2 : this.f40304a) {
                if (!hashSet.contains(th2)) {
                    hashSet.add(th2);
                    Throwable th3 = th2;
                    for (Throwable th22 : m37572a(th22)) {
                        if (hashSet.contains(th22)) {
                            th3 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th22);
                        }
                    }
                    try {
                        th.initCause(th3);
                    } catch (Throwable th4) {
                    }
                    th = m37575b(th);
                }
            }
            this.f40306c = compositeExceptionCausalChain;
        }
        return this.f40306c;
    }

    public final void printStackTrace() {
        C6918a.m31585a((Throwable) this, System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        m37573a(new C7786b(printStream));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        m37573a(new C7787c(printWriter));
    }

    private final void m37573a(C7785a c7785a) {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(this).append('\n');
        for (Object append : getStackTrace()) {
            stringBuilder.append("\tat ").append(append).append('\n');
        }
        int i = 1;
        for (Throwable th : this.f40304a) {
            stringBuilder.append("  ComposedException ").append(i).append(" :\n");
            m37574a(stringBuilder, th, "\t");
            i++;
        }
        c7785a.mo6536a(stringBuilder.toString());
    }

    private static void m37574a(StringBuilder stringBuilder, Throwable th, String str) {
        while (true) {
            stringBuilder.append(str).append(th).append('\n');
            for (Object append : th.getStackTrace()) {
                stringBuilder.append("\t\tat ").append(append).append('\n');
            }
            if (th.getCause() != null) {
                stringBuilder.append("\tCaused by: ");
                th = th.getCause();
                str = "";
            } else {
                return;
            }
        }
    }

    private static List m37572a(Throwable th) {
        List arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return arrayList;
        }
        while (true) {
            arrayList.add(cause);
            Throwable cause2 = cause.getCause();
            if (cause2 != null && cause2 != cause) {
                cause = cause2;
            }
        }
        return arrayList;
    }

    private final Throwable m37575b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || this.f40306c == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null) {
                return cause;
            }
            if (cause2 == cause) {
                return cause;
            }
            cause = cause2;
        }
    }
}
