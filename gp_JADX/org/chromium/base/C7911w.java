package org.chromium.base;

import android.util.Printer;

class C7911w implements Printer {
    C7911w() {
    }

    public void println(String str) {
        if (str.startsWith(">")) {
            mo6571a(str);
        } else {
            mo6572b(str);
        }
    }

    void mo6571a(String str) {
        boolean a = EarlyTraceEvent.m37792a();
        if (TraceEvent.f40509a || a) {
            String c = C7911w.m37828c(str);
            if (TraceEvent.f40509a) {
                TraceEvent.nativeBeginToplevel(c);
            } else if (a) {
                EarlyTraceEvent.m37791a("Looper.dispatchMessage: " + c);
            }
        }
    }

    void mo6572b(String str) {
        if (EarlyTraceEvent.m37792a()) {
            EarlyTraceEvent.m37793b("Looper.dispatchMessage: " + C7911w.m37828c(str));
        }
        if (TraceEvent.f40509a) {
            TraceEvent.nativeEndToplevel();
        }
    }

    private static String m37828c(String str) {
        int indexOf = str.indexOf(40, 21);
        int indexOf2 = indexOf == -1 ? -1 : str.indexOf(41, indexOf);
        return indexOf2 != -1 ? str.substring(indexOf + 1, indexOf2) : "";
    }
}
