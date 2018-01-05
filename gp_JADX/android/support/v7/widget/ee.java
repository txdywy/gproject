package android.support.v7.widget;

import android.view.View;

final class ee extends ed {
    ee(ew ewVar) {
        super(ewVar);
    }

    public final int mo833c() {
        return this.a.f2957M - this.a.getPaddingRight();
    }

    public final int mo835d() {
        return this.a.f2957M;
    }

    public final void mo830a(int i) {
        ew ewVar = this.a;
        if (ewVar.f2960y != null) {
            RecyclerView recyclerView = ewVar.f2960y;
            int a = recyclerView.f520n.m3326a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.f520n.m3332b(i2).offsetLeftAndRight(i);
            }
        }
    }

    public final int mo831b() {
        return this.a.getPaddingLeft();
    }

    public final int mo838e(View view) {
        fa faVar = (fa) view.getLayoutParams();
        return faVar.rightMargin + (ew.m2984c(view) + faVar.leftMargin);
    }

    public final int mo840f(View view) {
        fa faVar = (fa) view.getLayoutParams();
        return faVar.bottomMargin + (ew.m2986d(view) + faVar.topMargin);
    }

    public final int mo832b(View view) {
        fa faVar = (fa) view.getLayoutParams();
        return faVar.rightMargin + ew.m2989g(view);
    }

    public final int mo829a(View view) {
        return ew.m2987e(view) - ((fa) view.getLayoutParams()).leftMargin;
    }

    public final int mo834c(View view) {
        this.a.m3018a(view, this.c);
        return this.c.right;
    }

    public final int mo836d(View view) {
        this.a.m3018a(view, this.c);
        return this.c.left;
    }

    public final int mo837e() {
        return (this.a.f2957M - this.a.getPaddingLeft()) - this.a.getPaddingRight();
    }

    public final int mo839f() {
        return this.a.getPaddingRight();
    }

    public final int mo841g() {
        return this.a.f2955K;
    }

    public final int mo842h() {
        return this.a.f2956L;
    }
}
