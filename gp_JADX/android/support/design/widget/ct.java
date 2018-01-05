package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

class ct extends ImageButton {
    public int f635q;

    public ct(Context context) {
        this(context, null);
    }

    public ct(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ct(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f635q = getVisibility();
    }

    public void setVisibility(int i) {
        m478a(i, true);
    }

    final void m478a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f635q = i;
        }
    }
}
