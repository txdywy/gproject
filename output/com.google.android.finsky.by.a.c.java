package com.google.android.finsky.by.a;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.finsky.by.g;
import com.google.android.finsky.by.h;
import com.google.android.finsky.by.i;
import com.google.android.finsky.dfemodel.q;
import java.util.HashSet;
import java.util.Set;

public final class com.google.android.finsky.by.a.c extends com.google.android.finsky.by.a.d
{

    public Set a;
    public Set b;
    public Set c;

    c(com.google.android.finsky.by.a.m p0) {
        com.google.android.finsky.by.a.d(3, p0);
        this.a = new HashSet();
        this.b = new HashSet();
        this.c = new HashSet();
    }

    public final com.google.android.finsky.by.i a(String p0) {
        v0 = this.b(new com.google.android.finsky.by.g(0, com.google.android.finsky.by.h.a, 3, p0, 11, 1));
        if (v0 == 0)
            v0 = this.b(new com.google.android.finsky.by.g(0, com.google.android.finsky.by.h.a, 3, p0, 66, 1));
        return (com.google.android.finsky.by.i)v0;
    }

    public final synchronized void a() {
        enter this;
        try {
            this.a.clear();
            this.b.clear();
            this.c.clear();
            super.a();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final void a(String p0, String p1) {
        Log.d("FinskyLibrary", (String.valueOf(p1).length() + 15 + String.valueOf(p0).length()) + p1 + "AppLibrary (" + p0 + ") {");
        Log.d("FinskyLibrary", (String.valueOf(p1).length() + 24) + p1 + "  totalCount=" + this.g());
        Log.d("FinskyLibrary", (String.valueOf(p1).length() + 32) + p1 + "  subscriptionsCount=" + this.a.size());
        Log.d("FinskyLibrary", String.valueOf(p1).concat("}"));
    }

    public final synchronized void c(com.google.android.finsky.by.g p0) {
        enter this;
        try {
            if (com.google.android.finsky.dfemodel.q.b(p0.l))
                this.a.remove(p0.k);
            else {
                try {
                    if (com.google.android.finsky.dfemodel.q.a(p0.l))
                        this.b.remove(p0.k);
                    else {
                        try {
                            if (!TextUtils.isEmpty(p0.r))
                                this.c.remove(p0.k);
                        }
                        catch (Throwable ex) {
                            exit this;
                            throw ex;
                        }
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
            super.c(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void d(com.google.android.finsky.by.g p0) {
        enter this;
        try {
            if (com.google.android.finsky.dfemodel.q.b(p0.l))
                this.a.add(p0.k);
            else {
                try {
                    if (com.google.android.finsky.dfemodel.q.a(p0.l))
                        this.b.add(p0.k);
                    else {
                        try {
                            if (!TextUtils.isEmpty(p0.r))
                                this.c.add(p0.k);
                        }
                        catch (Throwable ex) {
                            exit this;
                            throw ex;
                        }
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
            super.d(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final String toString() {
        v1 = new Object[1];
        v1[0] = Integer.valueOf(this.g());
        return String.format("{num apps=%d}", v1);
    }

}
