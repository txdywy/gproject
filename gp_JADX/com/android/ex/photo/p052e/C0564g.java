package com.android.ex.photo.p052e;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class C0564g {
    public InputStream f3769a;
    public byte[] f3770b;
    public boolean f3771c;
    public int f3772d = 0;
    public int f3773e = 0;

    public C0564g(InputStream inputStream) {
        this.f3769a = inputStream;
        this.f3770b = new byte[C0564g.m4098e(16)];
        this.f3771c = false;
    }

    public final byte m4099a(int i) {
        C0565h.m4103a("get");
        if (m4100b(i)) {
            int i2 = i - this.f3772d;
            C0565h.m4102a();
            return this.f3770b[i2];
        }
        C0565h.m4102a();
        throw new IndexOutOfBoundsException(String.format("Index %d beyond length.", new Object[]{Integer.valueOf(i)}));
    }

    public final boolean m4100b(int i) {
        C0565h.m4103a("has");
        if (i < this.f3772d) {
            C0565h.m4102a();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f3772d)}));
        }
        int i2 = i - this.f3772d;
        if (i2 >= this.f3773e || i2 >= this.f3770b.length) {
            C0565h.m4102a();
            return m4097d(i);
        }
        C0565h.m4102a();
        return true;
    }

    public final void m4101c(int i) {
        C0565h.m4103a("advance to");
        int i2 = i - this.f3772d;
        if (i2 <= 0) {
            C0565h.m4102a();
            return;
        }
        int i3;
        if (i2 < this.f3773e) {
            if (i2 >= this.f3770b.length) {
                throw new IndexOutOfBoundsException(String.format("Index %d out of bounds. Length %d", new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f3770b.length)}));
            }
            for (i3 = 0; i3 + i2 < this.f3773e; i3++) {
                this.f3770b[i3] = this.f3770b[i3 + i2];
            }
            this.f3772d = i;
            this.f3773e -= i2;
        } else if (this.f3769a != null) {
            i3 = i2 - this.f3773e;
            int i4 = 0;
            while (i3 > 0) {
                try {
                    long skip = this.f3769a.skip((long) i3);
                    if (skip <= 0) {
                        i4++;
                    } else {
                        i3 = (int) (((long) i3) - skip);
                    }
                    if (i4 >= 5) {
                        i4 = i3;
                        i3 = 1;
                        break;
                    }
                } catch (IOException e) {
                    i4 = i3;
                    i3 = 1;
                }
            }
            i4 = i3;
            i3 = 0;
            if (i3 != 0) {
                this.f3769a = null;
            }
            this.f3772d = i - i4;
            this.f3773e = 0;
        } else {
            this.f3772d = i;
            this.f3773e = 0;
        }
        if (Log.isLoggable("InputStreamBuffer", 3)) {
            Log.d("InputStreamBuffer", String.format("advanceTo %d buffer: %s", new Object[]{Integer.valueOf(i2), this}));
        }
        C0565h.m4102a();
    }

    private final boolean m4097d(int i) {
        C0565h.m4103a("fill");
        if (i < this.f3772d) {
            C0565h.m4102a();
            throw new IllegalStateException(String.format("Index %d is before buffer %d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f3772d)}));
        }
        int i2 = i - this.f3772d;
        if (this.f3769a == null) {
            C0565h.m4102a();
            return false;
        }
        int i3 = i2 + 1;
        if (i3 > this.f3770b.length) {
            if (this.f3771c) {
                m4101c(i);
                i2 = i - this.f3772d;
            } else {
                Log.w("InputStreamBuffer", String.format("Increasing buffer length from %d to %d. Bad buffer size chosen, or advanceTo() not called.", new Object[]{Integer.valueOf(this.f3770b.length), Integer.valueOf(C0564g.m4098e(i3))}));
                this.f3770b = Arrays.copyOf(this.f3770b, i3);
            }
        }
        try {
            i3 = this.f3769a.read(this.f3770b, this.f3773e, this.f3770b.length - this.f3773e);
        } catch (IOException e) {
            i3 = -1;
        }
        if (i3 != -1) {
            this.f3773e = i3 + this.f3773e;
        } else {
            this.f3769a = null;
        }
        if (Log.isLoggable("InputStreamBuffer", 3)) {
            Log.d("InputStreamBuffer", String.format("fill %d      buffer: %s", new Object[]{Integer.valueOf(i2), this}));
        }
        C0565h.m4102a();
        if (i2 < this.f3773e) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.format("+%d+%d [%d]", new Object[]{Integer.valueOf(this.f3772d), Integer.valueOf(this.f3770b.length), Integer.valueOf(this.f3773e)});
    }

    private static int m4098e(int i) {
        int i2 = i - 1;
        i2 |= i2 >> 1;
        i2 |= i2 >> 2;
        i2 |= i2 >> 4;
        i2 |= i2 >> 8;
        return (i2 | (i2 >> 16)) + 1;
    }
}
