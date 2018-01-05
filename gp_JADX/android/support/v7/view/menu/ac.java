package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

abstract class ac implements af, al, OnItemClickListener {
    public Rect f2678A;

    ac() {
    }

    public abstract void mo662a(int i);

    public abstract void mo664a(C0471p c0471p);

    public abstract void mo666a(View view);

    public abstract void mo667a(OnDismissListener onDismissListener);

    public abstract void mo672b(int i);

    public abstract void mo673b(boolean z);

    public abstract void mo675c(int i);

    public abstract void mo676c(boolean z);

    public final void mo659a(Context context, C0471p c0471p) {
    }

    public final boolean mo660b(C0485t c0485t) {
        return false;
    }

    public final boolean mo661c(C0485t c0485t) {
        return false;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m2772a(listAdapter).f2808b.m2827a((MenuItem) listAdapter.getItem(i), (af) this, mo690f() ? 0 : 4);
    }

    protected static int m2771a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        ViewGroup viewGroup2 = viewGroup;
        while (i2 < count) {
            ViewGroup frameLayout;
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i3 = itemViewType;
                view = null;
            }
            if (viewGroup2 == null) {
                frameLayout = new FrameLayout(context);
            } else {
                frameLayout = viewGroup2;
            }
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth <= i4) {
                measuredWidth = i4;
            }
            i2++;
            i4 = measuredWidth;
            viewGroup2 = frameLayout;
        }
        return i4;
    }

    protected static C0483o m2772a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0483o) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0483o) listAdapter;
    }

    protected static boolean m2773b(C0471p c0471p) {
        int size = c0471p.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0471p.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected boolean mo690f() {
        return true;
    }
}
