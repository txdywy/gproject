package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.detailscomponents.C2577b;
import com.google.android.finsky.detailscomponents.ScreenshotsRecyclerView;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.providers.C3947d;
import com.squareup.leakcanary.C7582R;

public class ScreenshotsModuleLayoutV2 extends FrameLayout implements C2621k, C2622l {
    public ScreenshotsRecyclerView f14055a;
    public C2577b f14056b;
    public C1611k f14057c;

    public ScreenshotsModuleLayoutV2(Context context) {
        super(context);
    }

    public ScreenshotsModuleLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getAdjustedHeight() {
        return getResources().getDimensionPixelSize(this.f14055a.getHeightId());
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1808a(this);
        Resources resources = getResources();
        boolean k = this.f14057c.m9286k(resources);
        if (k) {
            int i = this.f14056b.m13626a(resources, k).f13772a;
            LayoutParams layoutParams = (LayoutParams) findViewById(C7582R.id.strip_background).getLayoutParams();
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
        }
        this.f14055a = (ScreenshotsRecyclerView) findViewById(C7582R.id.screenshots_container);
    }
}
