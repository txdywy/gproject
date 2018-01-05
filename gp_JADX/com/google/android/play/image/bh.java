package com.google.android.play.image;

final class bh {
    public final boolean f32056a;
    public final bo f32057b;

    private bh(bo boVar) {
        this(boVar, false);
    }

    private bh(bo boVar, boolean z) {
        this.f32057b = boVar;
        this.f32056a = z;
    }

    public static bh m29255a(String str) {
        if (str.length() != 0) {
            return new bh(new bi(str));
        }
        throw new IllegalArgumentException("separator may not be empty or null");
    }

    public final bh m29256a() {
        return new bh(this.f32057b, true);
    }

    public final Iterable m29257a(CharSequence charSequence) {
        return new bk(this, charSequence);
    }
}
