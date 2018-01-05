package android.support.design.widget;

import android.view.View;
import android.view.View.OnClickListener;

final class bq implements OnClickListener {
    public final /* synthetic */ OnClickListener f889a;
    public final /* synthetic */ Snackbar f890b;

    bq(Snackbar snackbar, OnClickListener onClickListener) {
        this.f890b = snackbar;
        this.f889a = onClickListener;
    }

    public final void onClick(View view) {
        this.f889a.onClick(view);
        this.f890b.m494a(1);
    }
}
