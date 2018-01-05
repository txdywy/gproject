package com.google.android.finsky.ae;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class com.google.android.finsky.ae.a
{

    public final Set a;

    a() {
        this.a = new HashSet();
    }

    public final void a(com.google.android.finsky.ae.b p0) {
        enter this.a;
        try {
            this.a.add(p0);
            exit this.a;
            return;
            exit this.a;
        }
        catch (Throwable ex) {
            exit this.a;
            throw ex;
        }
    }

    public final boolean a() {
  2:    enter this.a;
  3:    try {
  5:        v2 = this.a.iterator();
  9:        while (true) {
 13:            if (!v2.hasNext()) {
 30:                exit this.a;
 31:                v0 = 0;
 32:                return v0;
                }
 25:            if (((com.google.android.finsky.ae.b)v2.next()).a()) {
 27:                v0 = 1;
 28:                exit this.a;
 29:                return v0;
                }
            }
 34:        exit this.a;
        }
        catch (Throwable ex) {
 34:        exit this.a;
 35:        throw ex;
        }
 26:    goto -1;
    }

    public final boolean b() {
  2:    enter this.a;
  3:    try {
  5:        v2 = this.a.iterator();
  9:        while (true) {
 13:            if (!v2.hasNext()) {
 37:                exit this.a;
 38:                v0 = 0;
 39:                return v0;
                }
 19:            v0 = (com.google.android.finsky.ae.b)v2.next();
 26:            if (v0.b() != 2)
 26:                continue;
 32:            if (v0.a()) {
 34:                v0 = 1;
 35:                exit this.a;
 36:                return v0;
                }
            }
 41:        exit this.a;
        }
        catch (Throwable ex) {
 41:        exit this.a;
 42:        throw ex;
        }
 33:    goto -1;
    }

}
