package android.support.v4.widget;

import android.annotation.TargetApi;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class C0387t implements OnApplyWindowInsetsListener {
    C0387t() {
    }

    @TargetApi(21)
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        boolean z = true;
        DrawerLayout drawerLayout = (DrawerLayout) view;
        boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
        drawerLayout.f1942F = windowInsets;
        drawerLayout.f1943G = z2;
        if (z2 || drawerLayout.getBackground() != null) {
            z = false;
        }
        drawerLayout.setWillNotDraw(z);
        drawerLayout.requestLayout();
        return windowInsets.consumeSystemWindowInsets();
    }
}
