package com.google.common.flogger;

import com.google.common.flogger.p423b.C7011b;

final class C7067o extends C7065m {
    public final String f34578b;
    public final String f34579c;
    public final int f34580d;
    public final String f34581e;
    public int f34582f = 0;

    C7067o(String str, String str2, int i, String str3) {
        this.f34578b = (String) C7011b.m31954a(str, "class name");
        this.f34579c = (String) C7011b.m31954a(str2, "method name");
        this.f34580d = i;
        this.f34581e = str3;
    }

    public final String mo6009a() {
        return this.f34578b.replace('/', '.');
    }

    public final String mo6010b() {
        return this.f34579c;
    }

    public final int mo6011c() {
        return this.f34580d & 65535;
    }

    public final String mo6012d() {
        return this.f34581e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7067o)) {
            return false;
        }
        C7067o c7067o = (C7067o) obj;
        if (this.f34578b.equals(c7067o.f34578b) && this.f34579c.equals(c7067o.f34579c) && this.f34580d == c7067o.f34580d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f34582f == 0) {
            this.f34582f = ((((this.f34578b.hashCode() + 4867) * 31) + this.f34579c.hashCode()) * 31) + this.f34580d;
        }
        return this.f34582f;
    }
}
