package com.google.android.libraries.performance.primes.p333b;

import com.google.android.libraries.p326c.p327a.C5916a;

public final class C5963b extends C5962e {
    public final C5964c f29724a;

    C5963b(int i, C5964c c5964c) {
        super(i);
        this.f29724a = c5964c;
    }

    public final int mo5235a(C5970j c5970j) {
        return c5970j.f29752a.getInt((this.i + c5970j.f29753b) + 4);
    }

    public final int mo5236a(C5970j c5970j, int i) {
        int a = mo5235a(c5970j);
        String str = "index";
        if (i >= 0 && i < a) {
            return c5970j.m27710d(((((this.i + c5970j.f29753b) + 4) + 4) + c5970j.f29753b) + (c5970j.f29753b * i));
        }
        String a2;
        if (i < 0) {
            a2 = C5916a.m27407a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (a < 0) {
            throw new IllegalArgumentException("negative size: " + a);
        } else {
            a2 = C5916a.m27407a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(a));
        }
        throw new IndexOutOfBoundsException(a2);
    }

    public final String mo5237b(C5970j c5970j, int i) {
        int a = mo5235a(c5970j);
        String str = "index";
        if (i >= 0 && i < a) {
            return "[" + i + "]";
        }
        String a2;
        if (i < 0) {
            a2 = C5916a.m27407a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (a < 0) {
            throw new IllegalArgumentException("negative size: " + a);
        } else {
            a2 = C5916a.m27407a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(a));
        }
        throw new IndexOutOfBoundsException(a2);
    }

    public final String mo5238c(C5970j c5970j, int i) {
        return "Object[" + i + "/" + mo5235a(c5970j) + "]";
    }
}
