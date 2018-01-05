package com.google.android.play.headerlist;

import android.database.DataSetObserver;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;

public final class C6351q implements OnScrollListener {
    public final PlayHeaderListLayout f31903a;
    public int f31904b;
    public final DataSetObserver f31905c;
    public Adapter f31906d;
    public final SparseIntArray[] f31907e = new SparseIntArray[]{new SparseIntArray(), new SparseIntArray()};
    public int f31908f = -1;
    public int f31909g;

    public C6351q(PlayHeaderListLayout playHeaderListLayout) {
        this.f31903a = playHeaderListLayout;
        this.f31905c = new C6352r(this);
    }

    final void m29155a(boolean z) {
        m29153a().clear();
        this.f31908f = -1;
        if (z) {
            m29154a(null);
        }
        this.f31904b = 0;
    }

    private final void m29154a(Adapter adapter) {
        if (this.f31906d != adapter) {
            if (this.f31906d != null) {
                this.f31906d.unregisterDataSetObserver(this.f31905c);
            }
            this.f31906d = adapter;
            if (this.f31906d != null) {
                this.f31906d.registerDataSetObserver(this.f31905c);
            }
            m29155a(false);
        }
    }

    private final SparseIntArray m29153a() {
        return this.f31907e[this.f31909g];
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        m29154a(absListView.getAdapter());
        this.f31904b = i;
        this.f31903a.m29082a(i);
        if (this.f31903a.az != null) {
            this.f31903a.az.onScrollStateChanged(absListView, this.f31904b);
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = 0;
        int min = Math.min(i2, i3);
        m29154a(absListView.getAdapter());
        SparseIntArray a = m29153a();
        SparseIntArray sparseIntArray = this.f31907e[(this.f31909g + 1) % 2];
        sparseIntArray.clear();
        for (i4 = i; i4 < i + min; i4++) {
            sparseIntArray.put(i4, absListView.getChildAt(i4 - i).getTop());
        }
        i4 = -1;
        for (i5 = i; i5 < i + min; i5++) {
            i4 = a.get(i5, -1);
            if (i4 != -1) {
                i5 = i4 - sparseIntArray.get(i5);
                break;
            }
        }
        i5 = 0;
        this.f31909g = (this.f31909g + 1) % 2;
        if (this.f31908f == -1 || r0 == -1) {
            this.f31908f = this.f31903a.m29095d((ViewGroup) absListView);
        } else {
            this.f31908f += i5;
        }
        PlayHeaderListLayout playHeaderListLayout = this.f31903a;
        int i7 = this.f31904b;
        if (absListView.getChildCount() != 0) {
            i6 = this.f31908f;
        }
        playHeaderListLayout.m29084a(i7, i5, i6);
        if (this.f31903a.az != null) {
            this.f31903a.az.onScroll(absListView, i, min, i3);
        }
    }
}
