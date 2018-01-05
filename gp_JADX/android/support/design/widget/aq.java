package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.C0134j;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public final class aq extends MarginLayoutParams {
    public an f794a;
    public boolean f795b = false;
    public int f796c = 0;
    public int f797d = 0;
    public int f798e = -1;
    public int f799f = -1;
    public int f800g = 0;
    public int f801h = 0;
    public int f802i;
    public int f803j;
    public View f804k;
    public View f805l;
    public boolean f806m;
    public boolean f807n;
    public boolean f808o;
    public boolean f809p;
    public final Rect f810q = new Rect();
    public Object f811r;

    public aq() {
        super(-2, -2);
    }

    aq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0134j.CoordinatorLayout_Layout);
        this.f796c = obtainStyledAttributes.getInteger(C0134j.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.f799f = obtainStyledAttributes.getResourceId(C0134j.CoordinatorLayout_Layout_layout_anchor, -1);
        this.f797d = obtainStyledAttributes.getInteger(C0134j.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.f798e = obtainStyledAttributes.getInteger(C0134j.CoordinatorLayout_Layout_layout_keyline, -1);
        this.f800g = obtainStyledAttributes.getInt(C0134j.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.f801h = obtainStyledAttributes.getInt(C0134j.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        this.f795b = obtainStyledAttributes.hasValue(C0134j.CoordinatorLayout_Layout_layout_behavior);
        if (this.f795b) {
            this.f794a = CoordinatorLayout.m443a(context, attributeSet, obtainStyledAttributes.getString(C0134j.CoordinatorLayout_Layout_layout_behavior));
        }
        obtainStyledAttributes.recycle();
        if (this.f794a != null) {
            this.f794a.mo118a(this);
        }
    }

    public aq(aq aqVar) {
        super(aqVar);
    }

    public aq(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public aq(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public final void m642a(an anVar) {
        if (this.f794a != anVar) {
            this.f794a = anVar;
            this.f811r = null;
            this.f795b = true;
            if (anVar != null) {
                anVar.mo118a(this);
            }
        }
    }

    final void m641a(int i, boolean z) {
        switch (i) {
            case 0:
                this.f807n = z;
                return;
            case 1:
                this.f808o = z;
                return;
            default:
                return;
        }
    }

    final boolean m643a(int i) {
        switch (i) {
            case 0:
                return this.f807n;
            case 1:
                return this.f808o;
            default:
                return false;
        }
    }
}
