package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.finsky.stream.base.playcluster.a;

public final class com.google.android.finsky.adapters.h implements com.google.android.finsky.stream.base.playcluster.b
{

    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    h(Context p0) {
        v0 = p0.getResources();
        this.b = v0.getDimensionPixelSize(2131624750);
        this.c = v0.getDimensionPixelSize(2131624749);
        this.d = v0.getDimensionPixelSize(2131625319);
        this.e = v0.getDimensionPixelSize(2131625318);
        this.a = v0.getDimensionPixelSize(2131624748);
    }

    public final float a() {
        return 1065353216;
    }

    public final float a(int p0) {
        return 1065353216;
    }

    public final float a(com.google.android.finsky.stream.base.playcluster.a p0) {
        return 1065353216;
    }

    public final int a(float p0, float p1, int p2) {
        return this.b + this.c + this.d * 2;
    }

    public final int a(int p0, float p1) {
        return this.b + this.c + this.d * 2 + this.e;
    }

    public final int a(int p0, int p1) {
        return this.a;
    }

    public final float b() {
        return 1065353216;
    }

    public final int b(float p0, float p1, int p2) {
        return 0;
    }

    public final int c() {
        return 2;
    }

    public final float d() {
        return 1048576000;
    }

    public final boolean e() {
        return 1;
    }

}
