package android.support.v7.app;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

final class C0423o implements OnScrollListener {
    public final /* synthetic */ View f2450a;
    public final /* synthetic */ View f2451b;

    C0423o(View view, View view2) {
        this.f2450a = view;
        this.f2451b = view2;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m2309a(absListView, this.f2450a, this.f2451b);
    }
}
