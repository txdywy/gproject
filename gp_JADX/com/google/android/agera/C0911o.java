package com.google.android.agera;

import java.util.Arrays;

final class C0911o {
    public static final Object[] f5687a = new Object[0];
    public Object[] f5688b = f5687a;

    C0911o() {
    }

    final synchronized boolean m5630a(Object obj, Object obj2) {
        boolean z = true;
        synchronized (this) {
            boolean z2 = false;
            int i = -1;
            int i2 = 0;
            for (int i3 = 0; i3 < this.f5688b.length; i3 += 2) {
                Object obj3 = this.f5688b[i3];
                if (obj3 == null) {
                    i = i3;
                }
                if (obj3 == obj) {
                    i2++;
                    if (this.f5688b[i3 + 1] == obj2) {
                        z2 = true;
                        i = i3;
                    }
                }
            }
            if (i == -1) {
                i = this.f5688b.length;
                this.f5688b = Arrays.copyOf(this.f5688b, i < 2 ? 2 : i * 2);
            }
            if (!z2) {
                this.f5688b[i] = obj;
                this.f5688b[i + 1] = obj2;
            }
            if (i2 != 0) {
                z = false;
            }
        }
        return z;
    }

    final synchronized void m5631b(Object obj, Object obj2) {
        int i = 0;
        while (i < this.f5688b.length) {
            if (this.f5688b[i] == obj && this.f5688b[i + 1] == obj2) {
                this.f5688b[i] = null;
                this.f5688b[i + 1] = null;
            }
            i += 2;
        }
    }

    final synchronized boolean m5629a(Object obj) {
        boolean z = false;
        synchronized (this) {
            for (int i = 0; i < this.f5688b.length; i += 2) {
                if (this.f5688b[i] == obj) {
                    this.f5688b[i] = null;
                    this.f5688b[i + 1] = null;
                    z = true;
                }
            }
        }
        return z;
    }
}
