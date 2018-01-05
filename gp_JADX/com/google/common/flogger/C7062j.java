package com.google.common.flogger;

import com.google.common.flogger.backend.C7042l;
import com.google.common.flogger.p423b.C7011b;
import java.util.Arrays;

final class C7062j implements C7042l {
    public Object[] f34570a = new Object[8];
    public int f34571b = 0;

    C7062j() {
    }

    public final int mo5994a() {
        return this.f34571b;
    }

    public final String mo5995a(int i) {
        if (i < this.f34571b) {
            return (String) this.f34570a[i * 2];
        }
        throw new IndexOutOfBoundsException();
    }

    public final Object mo5996b(int i) {
        if (i < this.f34571b) {
            return this.f34570a[(i * 2) + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    final int m32143a(String str) {
        for (int i = 0; i < this.f34571b; i++) {
            if (this.f34570a[i * 2].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final Object mo5997b(String str) {
        int a = m32143a(str);
        return a != -1 ? this.f34570a[(a * 2) + 1] : null;
    }

    final void m32145a(String str, Object obj) {
        if ((this.f34571b + 1) * 2 > this.f34570a.length) {
            this.f34570a = Arrays.copyOf(this.f34570a, this.f34570a.length * 2);
        }
        this.f34570a[this.f34571b * 2] = C7011b.m31954a(str, "metadata key");
        this.f34570a[(this.f34571b * 2) + 1] = C7011b.m31954a(obj, "metadata value");
        this.f34571b++;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Metadata{");
        for (int i = 0; i < this.f34571b; i++) {
            stringBuilder.append(" '").append(mo5995a(i)).append("': ").append(mo5996b(i));
        }
        return stringBuilder.append(" }").toString();
    }
}
