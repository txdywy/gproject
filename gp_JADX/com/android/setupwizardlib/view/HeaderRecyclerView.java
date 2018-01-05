package com.android.setupwizardlib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.support.v7.widget.ew;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.android.setupwizardlib.C0612f;

public class HeaderRecyclerView extends RecyclerView {
    public View aG;
    public int aH;

    public HeaderRecyclerView(Context context) {
        super(context);
        m4255a(null, 0);
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4255a(attributeSet, 0);
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4255a(attributeSet, i);
    }

    private final void m4255a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0612f.SuwHeaderRecyclerView, i, 0);
        this.aH = obtainStyledAttributes.getResourceId(C0612f.SuwHeaderRecyclerView_suwHeader, 0);
        obtainStyledAttributes.recycle();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int i = this.aG != null ? 1 : 0;
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(Math.max(accessibilityEvent.getFromIndex() - i, 0));
        if (VERSION.SDK_INT >= 14) {
            accessibilityEvent.setToIndex(Math.max(accessibilityEvent.getToIndex() - i, 0));
        }
    }

    public View getHeader() {
        return this.aG;
    }

    public void setHeader(View view) {
        this.aG = view;
    }

    public void setLayoutManager(ew ewVar) {
        super.setLayoutManager(ewVar);
        if (ewVar != null && this.aG == null && this.aH != 0) {
            this.aG = LayoutInflater.from(getContext()).inflate(this.aH, this, false);
        }
    }

    public void setAdapter(em emVar) {
        if (!(this.aG == null || emVar == null)) {
            em c0619c = new C0619c(emVar);
            c0619c.f3996d = this.aG;
            emVar = c0619c;
        }
        super.setAdapter(emVar);
    }
}
