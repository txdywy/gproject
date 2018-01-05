package android.support.v7.widget;

import android.view.View;
import android.view.View.OnLayoutChangeListener;

final class ge implements OnLayoutChangeListener {
    public final /* synthetic */ SearchView f3505a;

    ge(SearchView searchView) {
        this.f3505a = searchView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f3505a.adjustDropDownSizeAndPosition();
    }
}
