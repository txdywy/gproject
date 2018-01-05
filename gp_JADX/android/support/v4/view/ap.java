package android.support.v4.view;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class ap implements OnApplyWindowInsetsListener {
    public final /* synthetic */ ae f1858a;

    ap(ae aeVar) {
        this.f1858a = aeVar;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return (WindowInsets) ca.m2020a(this.f1858a.mo123a(view, ca.m2019a((Object) windowInsets)));
    }
}
