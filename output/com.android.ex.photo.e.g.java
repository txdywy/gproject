package com.android.ex.photo.e;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class com.android.ex.photo.e.g
{

    public InputStream a;
    public byte[] b;
    public boolean c;
    public int d;
    public int e;

    g(InputStream p0) {
        this.d = 0;
        this.e = 0;
        this.a = p0;
        this.b = new byte[com.android.ex.photo.e.g.e(16)];
        this.c = 0;
    }

    private final boolean d(int p0) {
        com.android.ex.photo.e.h.a("fill");
        if (p0 < this.d) {
            com.android.ex.photo.e.h.a();
            v4 = new Object[2];
            v4[0] = Integer.valueOf(p0);
            v4[1] = Integer.valueOf(this.d);
            throw new IllegalStateException(String.format("Index %d is before buffer %d", v4));
        }
        v0 = p0 - this.d;
        if (this.a == 0) {
            com.android.ex.photo.e.h.a();
            v0 = 0;
        }
        else {
            if (v0 + 1 > this.b.length) {
                if (this.c != 0) {
                    this.c(p0);
                    v0 = p0 - this.d;
                }
                else {
                    v3 = com.android.ex.photo.e.g.e(v0 + 1);
                    v7 = new Object[2];
                    v7[0] = Integer.valueOf(this.b.length);
                    v7[1] = Integer.valueOf(v3);
                    Log.w("InputStreamBuffer", String.format("Increasing buffer length from %d to %d. Bad buffer size chosen, or advanceTo() not called.", v7));
                    this.b = Arrays.copyOf(this.b, v3);
                }
            }
            try {
                v3 = this.a.read(this.b, this.e, this.b.length - this.e);
            }
            catch (IOException ex) {
                v3 = -1;
            }
            if (v3 != -1)
                this.e = v3 + this.e;
            else
                this.a = 0;
            if (Log.isLoggable("InputStreamBuffer", 3)) {
                v5 = new Object[2];
                v5[0] = Integer.valueOf(v0);
                v5[1] = this;
                Log.d("InputStreamBuffer", String.format("fill %d      buffer: %s", v5));
            }
            com.android.ex.photo.e.h.a();
            if (v0 < this.e)
                v0 = 1;
            else
                v0 = 0;
        }
        return v0;
    }

    private static int e(int p0) {
        v0 = p0 - 1 | p0 - 1 >> 1 | (p0 - 1 | p0 - 1 >> 1) >> 2 | (p0 - 1 | p0 - 1 >> 1 | (p0 - 1 | p0 - 1 >> 1) >> 2) >> 4;
        return (v0 | v0 >> 8 | (v0 | v0 >> 8) >> 16) + 1;
    }

    public final byte a(int p0) {
        com.android.ex.photo.e.h.a("get");
        if (this.b(p0)) {
            com.android.ex.photo.e.h.a();
            return this.b[p0 - this.d];
        }
        com.android.ex.photo.e.h.a();
        v2 = new Object[1];
        v2[0] = Integer.valueOf(p0);
        throw new IndexOutOfBoundsException(String.format("Index %d beyond length.", v2));
    }

    public final boolean b(int p0) {
        v0 = 1;
        com.android.ex.photo.e.h.a("has");
        if (p0 < this.d) {
            com.android.ex.photo.e.h.a();
            v3 = new Object[2];
            v3[0] = Integer.valueOf(p0);
            v3[1] = Integer.valueOf(this.d);
            throw new IllegalStateException(String.format("Index %d is before buffer %d", v3));
        }
        if (p0 - this.d >= this.e || p0 - this.d >= this.b.length) {
            com.android.ex.photo.e.h.a();
            v0 = this.d(p0);
        }
        else
            com.android.ex.photo.e.h.a();
        return v0;
    }

    public final void c(int p0) {
  5:    com.android.ex.photo.e.h.a("advance to");
 12:    if (p0 - this.d <= 0) {
 14:        com.android.ex.photo.e.h.a();
 17:        return;
        }
 20:    if (p0 - this.d >= this.e) goto 117;
 25:    if (p0 - this.d >= this.b.length) {
 31:        v5 = new Object[2];
 37:        v5[0] = Integer.valueOf(p0 - this.d);
 46:        v5[1] = Integer.valueOf(this.b.length);
 55:        throw new IndexOutOfBoundsException(String.format("Index %d out of bounds. Length %d", v5));
        }
 56:    v0 = 0;
 57:    while (v0 + p0 - this.d < this.e) {
 71:        this.b[v0] = this.b[v0 + p0 - this.d];
 73:        v0 = v0 + 1;
        }
 76:    this.d = p0;
 81:    this.e = this.e - (p0 - this.d);
 90:    if (Log.isLoggable("InputStreamBuffer", 3)) {
 96:        v5 = new Object[2];
102:        v5[0] = Integer.valueOf(p0 - this.d);
104:        v5[1] = this;
110:        Log.d("InputStreamBuffer", String.format("advanceTo %d buffer: %s", v5));
        }
113:    com.android.ex.photo.e.h.a();
116:    return;
119:    if (this.a == 0) goto 172;
123:    v0 = p0 - this.d - this.e;
125:    v3 = 0;
126:    if (v0 <= 0) goto 165;
131:    v6 = this.a.skip((long)v0);
139:    if (v6 <= 0)
141:        v3 = v3 + 1;
        else
163:        v0 = (int)((long)v0 - v6);
144:    if (v3 < 5) goto 126;
146:    v3 = v0;
147:    v0 = 1;
148:    if (v0 != 0)
151:        this.a = 0;
155:    this.d = p0 - v3;
157:    this.e = 0;
159:    goto 83;
165:    v3 = v0;
166:    v0 = 0;
167:    goto 148;
169:    v3 = v0;
170:    v0 = 1;
171:    goto 148;
172:    this.d = p0;
174:    this.e = 0;
176:    goto 83;
177:    try
            run 128...134
        catch (IOException ex) {
128:        goto 168;
        }
    }

    public final String toString() {
        v1 = new Object[3];
        v1[0] = Integer.valueOf(this.d);
        v1[1] = Integer.valueOf(this.b.length);
        v1[2] = Integer.valueOf(this.e);
        return String.format("+%d+%d [%d]", v1);
    }

}
