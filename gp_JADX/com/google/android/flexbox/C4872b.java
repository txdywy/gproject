package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class C4872b {
    public int f25206a = Integer.MAX_VALUE;
    public int f25207b = Integer.MAX_VALUE;
    public int f25208c = Integer.MIN_VALUE;
    public int f25209d = Integer.MIN_VALUE;
    public int f25210e;
    public int f25211f;
    public int f25212g;
    public int f25213h;
    public int f25214i;
    public float f25215j;
    public float f25216k;
    public int f25217l;
    public int f25218m;
    public List f25219n = new ArrayList();
    public int f25220o;

    C4872b() {
    }

    public final int m22853a() {
        return this.f25213h - this.f25214i;
    }

    final void m22854a(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f25206a = Math.min(this.f25206a, (view.getLeft() - flexItem.mo4437m()) - i);
        this.f25207b = Math.min(this.f25207b, (view.getTop() - flexItem.mo4438n()) - i2);
        this.f25208c = Math.max(this.f25208c, (view.getRight() + flexItem.mo4439o()) + i3);
        this.f25209d = Math.max(this.f25209d, (flexItem.mo4440p() + view.getBottom()) + i4);
    }
}
