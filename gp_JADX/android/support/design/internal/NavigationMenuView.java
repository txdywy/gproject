package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.ah;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class NavigationMenuView extends RecyclerView implements ah {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    public final void mo64a(C0471p c0471p) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
