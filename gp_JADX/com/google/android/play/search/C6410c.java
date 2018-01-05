package com.google.android.play.search;

public final class C6410c implements CharSequence {
    public final char[] f32350a;
    public final int f32351b;
    public final int f32352c;

    public C6410c(char[] cArr, int i, int i2) {
        this.f32350a = cArr;
        this.f32351b = i;
        this.f32352c = i2;
    }

    public final int length() {
        return this.f32352c - this.f32351b;
    }

    public final String toString() {
        length();
        return m29434a(0);
    }

    public final char charAt(int i) {
        return this.f32350a[this.f32351b + i];
    }

    private final String m29434a(int i) {
        return new String(this.f32350a, this.f32351b + i, length());
    }

    public final /* synthetic */ CharSequence subSequence(int i, int i2) {
        return m29434a(i);
    }
}
