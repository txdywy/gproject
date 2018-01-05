package com.google.android.finsky.by.a;

import android.util.Log;
import com.google.android.finsky.by.g;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class com.google.android.finsky.by.a.d extends com.google.android.finsky.by.a.e
{

    public final int d;
    public final Map e;

    d(int p0, com.google.android.finsky.by.a.m p1) {
        com.google.android.finsky.by.a.e(p1);
        this.e = new HashMap();
        this.d = p0;
    }

    public synchronized void a() {
        enter this;
        try {
            super.a();
            this.e.clear();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public void a(String p0, String p1) {
        Log.d("FinskyLibrary", (String.valueOf(p1).length() + 12 + String.valueOf(p0).length()) + p1 + "Library (" + p0 + ") {");
        Log.d("FinskyLibrary", (String.valueOf(p1).length() + 21) + p1 + "  backend=" + this.d);
        Log.d("FinskyLibrary", (String.valueOf(p1).length() + 24) + p1 + "  entryCount=" + this.e.size());
        Log.d("FinskyLibrary", String.valueOf(p1).concat("}"));
    }

    public final synchronized boolean a(com.google.android.finsky.by.g p0) {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.e.containsKey(p0);
    }

    public final com.google.android.finsky.by.g b(com.google.android.finsky.by.g p0) {
        return (com.google.android.finsky.by.g)this.e.get(p0);
    }

    public synchronized void c(com.google.android.finsky.by.g p0) {
        enter this;
        try {
            super.c(p0);
            this.e.remove(p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public synchronized void d(com.google.android.finsky.by.g p0) {
        enter this;
        try {
            super.d(p0);
            this.e.put(p0, p0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized int g() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.e.size();
    }

    public synchronized Iterator iterator() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.e.values().iterator();
    }

    public String toString() {
        v1 = new Object[2];
        v1[0] = Integer.valueOf(this.d);
        v1[1] = Integer.valueOf(this.g());
        return String.format("{backend=%d, num entries=%d}", v1);
    }

}
