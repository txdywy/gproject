package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.C0483o;
import android.support.v7.view.menu.C0485t;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

public final class ea extends ck {
    public final int f3420n;
    public final int f3421o;
    public dy f3422p;
    public MenuItem f3423q;

    public ea(Context context, boolean z) {
        super(context, z);
        Configuration configuration = context.getResources().getConfiguration();
        if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
            this.f3420n = 22;
            this.f3421o = 21;
            return;
        }
        this.f3420n = 21;
        this.f3421o = 22;
    }

    public final void setHoverListener(dy dyVar) {
        this.f3422p = dyVar;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f3420n) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.f3421o) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((C0483o) getAdapter()).f2808b.m2824a(false);
            return true;
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.f3422p != null) {
            int headersCount;
            C0483o c0483o;
            MenuItem menuItem;
            MenuItem menuItem2;
            C0471p c0471p;
            ListAdapter adapter = getAdapter();
            C0483o c0483o2;
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                c0483o2 = (C0483o) headerViewListAdapter.getWrappedAdapter();
                headersCount = headerViewListAdapter.getHeadersCount();
                c0483o = c0483o2;
            } else {
                c0483o2 = (C0483o) adapter;
                headersCount = 0;
                c0483o = c0483o2;
            }
            if (motionEvent.getAction() != 10) {
                int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                if (pointToPosition != -1) {
                    headersCount = pointToPosition - headersCount;
                    if (headersCount >= 0 && headersCount < c0483o.getCount()) {
                        menuItem = (C0485t) c0483o.getItem(headersCount);
                        menuItem2 = this.f3423q;
                        if (menuItem2 != menuItem) {
                            c0471p = c0483o.f2808b;
                            if (menuItem2 != null) {
                                this.f3422p.mo691a(c0471p, menuItem2);
                            }
                            this.f3423q = menuItem;
                            if (menuItem != null) {
                                this.f3422p.mo692b(c0471p, menuItem);
                            }
                        }
                    }
                }
            }
            menuItem = null;
            menuItem2 = this.f3423q;
            if (menuItem2 != menuItem) {
                c0471p = c0483o.f2808b;
                if (menuItem2 != null) {
                    this.f3422p.mo691a(c0471p, menuItem2);
                }
                this.f3423q = menuItem;
                if (menuItem != null) {
                    this.f3422p.mo692b(c0471p, menuItem);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public final /* bridge */ /* synthetic */ boolean hasFocus() {
        return super.hasFocus();
    }

    public final /* bridge */ /* synthetic */ boolean isFocused() {
        return super.isFocused();
    }

    public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
        return super.hasWindowFocus();
    }

    public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
        return super.isInTouchMode();
    }

    public final /* bridge */ /* synthetic */ boolean mo824a(MotionEvent motionEvent, int i) {
        return super.mo824a(motionEvent, i);
    }
}
