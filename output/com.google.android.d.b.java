package com.google.android.d;

import java.io.EOFException;
import java.io.InputStream;

public static class com.google.android.d.b
{

    public static void a(InputStream p0, int p1) {
  0:    if (p1 == 0)
  2:        return;
  1:    goto 7;
  6:    p1 = (int)((long)p1 - v0);
  7:    if (p1 <= 0)
  2:        return;
 10:    v0 = p0.skip((long)p1);
 18:    if (v0 < 0)
 25:        throw new EOFException();
 19:    goto 3;
    }

    public static void a(InputStream p0, byte[] p1, int p2, int p3) {
  0:    if (p3 == 0)
  2:        return;
  3:    if (p0 == 0)
 12:        throw new NullPointerException("in == null");
 13:    if (p1 == 0)
 22:        throw new NullPointerException("dst == null");
 26:    if ((p3 | 0) < 0)
 39:        throw new ArrayIndexOutOfBoundsException();
 28:    if (p1.length < 0)
 39:        throw new ArrayIndexOutOfBoundsException();
 32:    if (p1.length + 0 < p3)
 39:        throw new ArrayIndexOutOfBoundsException();
 33:    goto 42;
 40:    p2 = p2 + v0;
 41:    p3 = p3 - v0;
 42:    if (p3 <= 0)
  2:        return;
 44:    v0 = p0.read(p1, p2, p3);
 48:    if (v0 < 0)
 55:        throw new EOFException();
 49:    goto 40;
    }

}
