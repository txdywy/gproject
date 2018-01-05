package android.support.v7.view.menu;

import android.support.v7.view.C0454d;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

final class C0487x extends FrameLayout implements C0454d {
    public final CollapsibleActionView f2853a;

    C0487x(View view) {
        super(view.getContext());
        this.f2853a = (CollapsibleActionView) view;
        addView(view);
    }

    public final void onActionViewExpanded() {
        this.f2853a.onActionViewExpanded();
    }

    public final void onActionViewCollapsed() {
        this.f2853a.onActionViewCollapsed();
    }
}
