package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.ai;
import android.support.v7.p040a.C0394a;
import android.support.v7.widget.an;
import android.support.v7.widget.eq;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;

public class CheckableImageButton extends an implements Checkable {
    public static final int[] f606a = new int[]{16842912};
    public boolean f607b;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ai.m1829a((View) this, new aj(this));
    }

    public void setChecked(boolean z) {
        if (this.f607b != z) {
            this.f607b = z;
            refreshDrawableState();
            sendAccessibilityEvent(eq.FLAG_MOVED);
        }
    }

    public boolean isChecked() {
        return this.f607b;
    }

    public void toggle() {
        setChecked(!this.f607b);
    }

    public int[] onCreateDrawableState(int i) {
        if (this.f607b) {
            return mergeDrawableStates(super.onCreateDrawableState(f606a.length + i), f606a);
        }
        return super.onCreateDrawableState(i);
    }
}
