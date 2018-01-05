package com.google.android.finsky.by.a;

import com.google.android.finsky.api.c;
import com.google.android.finsky.by.h;
import com.google.wireless.android.finsky.b.p;
import com.google.wireless.android.finsky.dfe.nano.cu;
import java.util.List;

public final class com.google.android.finsky.by.a.s implements Runnable
{

    public final com.google.android.finsky.by.a.r a;

    s(com.google.android.finsky.by.a.r p0) {
        this.a = p0;
    }

    public final void run() {
        if (this.a.j != 0)
            return;
        v1 = this.a;
        enter v1;
        try {
            if (this.a.i.size() == 0) {
                exit v1;
                return;
            }
            this.a.j = (com.google.android.finsky.by.a.aa)this.a.i.remove(0);
            exit v1;
        }
        catch (Throwable ex) {
            try {
                exit v1;
            }
            catch (Throwable ex) {
                exit v1;
                throw ex;
            }
            throw ex;
        }
        if (this.a.k != 0)
            com.google.android.finsky.by.a.r.a(this.a, 2, 0, this.a.j.c);
        v5 = new com.google.wireless.android.finsky.dfe.nano.cu();
        v5.b = new p[this.a.j.a.length];
        v4 = 0;
        while (true) {
            if (v4 >= this.a.j.a.length) {
                v5.a = v5.a | 1;
                v5.c = 2;
                v0 = new com.google.android.finsky.by.a.w(this.a);
                v1 = this.a.c;
                v1.a(v5, v0, v0);
                return;
            }
            v0 = (com.google.android.finsky.by.a.e)this.a.g.g(this.a.j.a[v4]);
            v10 = new com.google.wireless.android.finsky.b.p();
            if (com.google.android.finsky.by.h.a.equals(this.a.j.a[v4]))
                v1 = 3;
            else if (com.google.android.finsky.by.h.b.equals(this.a.j.a[v4]))
                v1 = 1;
            else if (com.google.android.finsky.by.h.c.equals(this.a.j.a[v4]))
                v1 = 4;
            else if (com.google.android.finsky.by.h.d.equals(this.a.j.a[v4]))
                v1 = 2;
            else if (com.google.android.finsky.by.h.e.equals(this.a.j.a[v4]))
                v1 = 6;
            else if (com.google.android.finsky.by.h.f.equals(this.a.j.a[v4]))
                v1 = 10;
            else {
                if (!com.google.android.finsky.by.h.a(this.a.j.a[v4])) {
                    v0 = String.valueOf(this.a.j.a[v4]);
                    if (v0.length() != 0)
                        v0 = "Invalid libraryId: ".concat(v0);
                    else
                        v0 = new String("Invalid libraryId: ");
                    throw new IllegalArgumentException(v0);
                }
                v1 = 0;
            }
            v10.c = v1;
            if (this.a.j.a[v4] == 0)
                throw new NullPointerException();
            v10.b = v10.b | 1;
            v10.d = this.a.j.a[v4];
            v10.f = v0.h();
            v10.b = v10.b | 4;
            v10.g = v0.g();
            v0 = this.a.g.f(this.a.j.a[v4]);
            if (v0 != 0) {
                if (v0 == 0)
                    throw new NullPointerException();
                v10.b = v10.b | 2;
                v10.e = v0;
            }
            v5.b[v4] = v10;
            v4 = v4 + 1;
        }
    }

}
