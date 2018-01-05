package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.widget.hc;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements ah, C0465r, OnItemClickListener {
    public static final int[] f2634a = new int[]{16842964, 16843049};
    public C0471p f2635b;
    public int f2636c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        hc a = hc.m3769a(context, attributeSet, f2634a, i, 0);
        if (a.m3782f(0)) {
            setBackgroundDrawable(a.m3771a(0));
        }
        if (a.m3782f(1)) {
            setDivider(a.m3771a(1));
        }
        a.f3558b.recycle();
    }

    public final void mo64a(C0471p c0471p) {
        this.f2635b = c0471p;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final boolean mo626a(C0485t c0485t) {
        return this.f2635b.m2827a((MenuItem) c0485t, null, 0);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo626a((C0485t) getAdapter().getItem(i));
    }

    public final int getWindowAnimations() {
        return this.f2636c;
    }
}
