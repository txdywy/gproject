package com.google.common.flogger.backend.p424a;

import com.google.common.flogger.C7065m;
import com.google.common.flogger.backend.C7025p;
import com.google.common.flogger.p423b.C7010a;
import dalvik.system.VMStack;

class C7026g extends C7025p {
    C7026g() {
    }

    public String mo5991a(Class cls) {
        if (C7024f.f34507e) {
            try {
                Class l = C7024f.m32049l();
                if (cls.equals(l)) {
                    return VMStack.getStackClass2().getName();
                }
                String valueOf = String.valueOf(cls);
                String valueOf2 = String.valueOf(l);
                throw new IllegalStateException(new StringBuilder((String.valueOf(valueOf).length() + 43) + String.valueOf(valueOf2).length()).append("Unexpected stack depth, expected: ").append(valueOf).append(" but was ").append(valueOf2).toString());
            } catch (Throwable th) {
            }
        }
        if (C7024f.f34508f) {
            StackTraceElement a = C7010a.m31952a(cls, new Throwable());
            if (a != null) {
                return a.getClassName();
            }
        }
        return null;
    }

    public C7065m mo5990a(Class cls, int i) {
        return C7065m.f34577a;
    }
}
