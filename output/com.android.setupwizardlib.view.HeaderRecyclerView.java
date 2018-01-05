package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.support.v7.widget.ew;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.android.setupwizardlib.f;

public class HeaderRecyclerView extends RecyclerView
{

    public View aG;
    public int aH;

    HeaderRecyclerView(Context p0) {
        RecyclerView(p0);
        this.a(0, 0);
    }

    HeaderRecyclerView(Context p0, AttributeSet p1) {
        RecyclerView(p0, p1);
        this.a(p1, 0);
    }

    HeaderRecyclerView(Context p0, AttributeSet p1, int p2) {
        RecyclerView(p0, p1, p2);
        this.a(p1, p2);
    }

    private final void a(AttributeSet p0, int p1) {
        v0 = this.getContext().obtainStyledAttributes(p0, com.android.setupwizardlib.f.SuwHeaderRecyclerView, p1, 0);
        this.aH = v0.getResourceId(com.android.setupwizardlib.f.SuwHeaderRecyclerView_suwHeader, 0);
        v0.recycle();
    }

    public View getHeader() {
        return this.aG;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent p0) {
        super.onInitializeAccessibilityEvent(p0);
        if (this.aG != 0)
            v0 = 1;
        else
            v0 = 0;
        p0.setItemCount(p0.getItemCount() - v0);
        p0.setFromIndex(Math.max(p0.getFromIndex() - v0, 0));
        if (Build$VERSION.SDK_INT >= 14)
            p0.setToIndex(Math.max(p0.getToIndex() - v0, 0));
    }

    public void setAdapter(android.support.v7.widget.em p0) {
        if (this.aG != 0 && p0 != 0) {
            v0 = new com.android.setupwizardlib.view.c(p0);
            v0.d = this.aG;
            p0 = v0;
        }
        super.setAdapter(p0);
    }

    public void setHeader(View p0) {
        this.aG = p0;
    }

    public void setLayoutManager(android.support.v7.widget.ew p0) {
        super.setLayoutManager(p0);
        if (p0 != 0 && this.aG == 0 && this.aH != 0)
            this.aG = LayoutInflater.from(this.getContext()).inflate(this.aH, this, 0);
    }

}
