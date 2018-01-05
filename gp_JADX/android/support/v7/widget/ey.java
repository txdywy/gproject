package android.support.v7.widget;

import android.view.View;

final class ey implements hy {
    public final /* synthetic */ ew f3439a;

    ey(ew ewVar) {
        this.f3439a = ewVar;
    }

    public final View mo869a(int i) {
        return this.f3439a.m3051f(i);
    }

    public final int mo867a() {
        return this.f3439a.getPaddingTop();
    }

    public final int mo870b() {
        return this.f3439a.f2958N - this.f3439a.getPaddingBottom();
    }

    public final int mo868a(View view) {
        return ew.m2988f(view) - ((fa) view.getLayoutParams()).topMargin;
    }

    public final int mo871b(View view) {
        fa faVar = (fa) view.getLayoutParams();
        return faVar.bottomMargin + ew.m2990h(view);
    }
}
