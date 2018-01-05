package com.google.android.play.drawer;

import android.annotation.TargetApi;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

final class C6296h implements OnApplyWindowInsetsListener {
    C6296h() {
    }

    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return windowInsets.consumeSystemWindowInsets();
    }
}
