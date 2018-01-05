package android.support.v7.widget;

import android.view.View;

final class ef extends ed {
    ef(ew ewVar) {
        super(ewVar);
    }

    public final int mo833c() {
        return this.a.f2958N - this.a.getPaddingBottom();
    }

    public final int mo835d() {
        return this.a.f2958N;
    }

    public final void mo830a(int i) {
        this.a.m3054g(i);
    }

    public final int mo831b() {
        return this.a.getPaddingTop();
    }

    public final int mo838e(View view) {
        fa faVar = (fa) view.getLayoutParams();
        return faVar.bottomMargin + (ew.m2986d(view) + faVar.topMargin);
    }

    public final int mo840f(View view) {
        fa faVar = (fa) view.getLayoutParams();
        return faVar.rightMargin + (ew.m2984c(view) + faVar.leftMargin);
    }

    public final int mo832b(View view) {
        fa faVar = (fa) view.getLayoutParams();
        return faVar.bottomMargin + ew.m2990h(view);
    }

    public final int mo829a(View view) {
        return ew.m2988f(view) - ((fa) view.getLayoutParams()).topMargin;
    }

    public final int mo834c(View view) {
        this.a.m3018a(view, this.c);
        return this.c.bottom;
    }

    public final int mo836d(View view) {
        this.a.m3018a(view, this.c);
        return this.c.top;
    }

    public final int mo837e() {
        return (this.a.f2958N - this.a.getPaddingTop()) - this.a.getPaddingBottom();
    }

    public final int mo839f() {
        return this.a.getPaddingBottom();
    }

    public final int mo841g() {
        return this.a.f2956L;
    }

    public final int mo842h() {
        return this.a.f2955K;
    }
}
