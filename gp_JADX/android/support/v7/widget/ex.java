package android.support.v7.widget;

import android.view.View;

final class ex implements hy {
    public final /* synthetic */ ew f3438a;

    ex(ew ewVar) {
        this.f3438a = ewVar;
    }

    public final View mo869a(int i) {
        return this.f3438a.m3051f(i);
    }

    public final int mo867a() {
        return this.f3438a.getPaddingLeft();
    }

    public final int mo870b() {
        return this.f3438a.f2957M - this.f3438a.getPaddingRight();
    }

    public final int mo868a(View view) {
        return ew.m2987e(view) - ((fa) view.getLayoutParams()).leftMargin;
    }

    public final int mo871b(View view) {
        fa faVar = (fa) view.getLayoutParams();
        return faVar.rightMargin + ew.m2989g(view);
    }
}
