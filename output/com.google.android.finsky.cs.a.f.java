package com.google.android.finsky.cs.a;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.finsky.cs.f;
import com.google.android.finsky.utils.ab;
import com.google.android.play.a.a.l;
import com.google.wireless.android.finsky.dfe.nano.dz;
import java.util.HashMap;
import java.util.Map;

public final class com.google.android.finsky.cs.a.f
{

    public final com.google.android.finsky.cs.a.i a;
    public boolean b;
    public boolean c;
    public boolean d;
    public com.google.android.finsky.cs.f e;
    public final Map f;
    public final Map g;

    f(com.google.android.finsky.cs.a.i p0) {
        this.f = new HashMap();
        this.g = new HashMap();
        this.a = p0;
    }

    private final String c(String p0) {
  0:    v0 = 0;
  3:    enter this.g;
  4:    v3 = this.b(p0);
  8:    v4 = this.a();
 12:    if (v3 != 0) goto 26;
 14:    if (v4 != 0) goto 26;
 16:    v1 = 0;
 17:    if (v1 != 0)
 91:        v0 = com.google.android.finsky.utils.ab.b(v1);
 21:    this.g.put(p0, v0);
 24:    exit this.g;
 25:    return v0;
 28:    v1 = new com.google.wireless.android.finsky.dfe.nano.dz();
 31:    if (v3 == 0) goto 62;
 39:    if (TextUtils.isEmpty(v3.c)) goto 62;
 43:    if (v3.c == 0)
 50:        throw new NullPointerException();
 44:    goto 54;
 52:    exit this.g;
 53:    throw ex;
 58:    v1.a = v1.a | 1;
 60:    v1.b = v3.c;
 62:    if (v4 != 0 && !TextUtils.isEmpty(v4.c)) {
 74:        if (v4.c == 0)
 81:            throw new NullPointerException();
 86:        v1.a = v1.a | 2;
 88:        v1.c = v4.c;
        }
 90:    goto 17;
 96:    try
            run 54...94
        catch (Throwable ex) {
 54:        goto 51;
        }
 97:    try
            run 4...53
        catch (Throwable ex) {
  4:        goto 51;
        }
    }

    public final com.google.android.finsky.cs.f a() {
        enter this;
        try {
            if (this.b != 0) {
                exit this;
                return this.e;
            }
            if (this.c != 0)
                throw new IllegalStateException("Cannot utilize process stable experiments while loading process stable experiments!");
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        try {
            this.c = 1;
            this.e = this.a.a("experiment-flags-process-stable");
            this.b = 1;
        }
        catch (Throwable ex) {
            this.c = 0;
            throw ex;
        }
        try {
            this.c = 0;
            exit this;
            return this.e;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    public final String a(String p0) {
        enter this.g;
        try {
            if (!this.g.containsKey(p0))
                this.g.put(p0, this.c(p0));
            exit this.g;
            return (String)this.g.get(p0);
            exit this.g;
        }
        catch (Throwable ex) {
            exit this.g;
            throw ex;
        }
    }

    public final boolean a(com.google.android.finsky.cs.a.e p0, com.google.android.play.a.a.l p1, String p2) {
        v0 = com.google.android.finsky.cs.a.i.a(p0, p1, this.a.a.getFilesDir(), com.google.android.finsky.cs.a.i.b(p2));
        if (v0 == 0) {
            v0 = 0;
            return v0;
        }
        enter this.f;
        try {
            this.f.put(p2, v0);
            this.c(p2);
            exit this.f;
            v0 = 1;
            return v0;
            exit this.f;
        }
        catch (Throwable ex) {
            exit this.f;
            throw ex;
        }
    }

    public final com.google.android.finsky.cs.f b(String p0) {
        enter this.f;
        try {
            v0 = (com.google.android.finsky.cs.f)this.f.get(p0);
            if (v0 != 0) {
                exit this.f;
                return v0;
            }
            if (this.d != 0)
                throw new IllegalStateException("Cannot utilize regular experiments while loading regular experiments!");
            exit this.f;
        }
        catch (Throwable ex) {
            exit this.f;
            throw ex;
        }
        try {
            this.d = 1;
            v0 = this.a.a(com.google.android.finsky.cs.a.i.b(p0));
            this.f.put(p0, v0);
        }
        catch (Throwable ex) {
            this.d = 0;
            throw ex;
        }
        try {
            this.d = 0;
            exit this.f;
            return v0;
        }
        catch (Throwable ex) {
            exit this.f;
            throw ex;
        }
    }

}
