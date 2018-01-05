package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.stream.base.C1169s;
import com.google.android.finsky.stream.base.C4292r;

public final class gs extends dd {
    public final fa mo724a() {
        if (this.i == 0) {
            return new gt(-2, -1);
        }
        return new gt(-1, -2);
    }

    public final fa mo794a(Context context, AttributeSet attributeSet) {
        return new gt(context, attributeSet);
    }

    public final fa mo795a(LayoutParams layoutParams) {
        if (layoutParams instanceof gt) {
            return new gt((gt) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new gt((MarginLayoutParams) layoutParams);
        }
        return new gt(layoutParams);
    }

    protected final int mo812c() {
        if (this.i == 1) {
            int i;
            View view = this.d[0];
            int i2 = 0;
            while (i2 < this.d.length - 1) {
                i = view == null ? 0 : ((view.getLayoutParams() instanceof gt) && ((gt) view.getLayoutParams()).f3356c.m3276m()) ? 0 : 1;
                if (i != 0) {
                    break;
                }
                int i3 = i2 + 1;
                i2 = i3;
                view = this.d[i3];
            }
            if (view != null && (view.getLayoutParams() instanceof gt)) {
                gt gtVar = (gt) view.getLayoutParams();
                if (gtVar.c instanceof C4292r) {
                    C4292r c4292r = (C4292r) gtVar.c;
                    if (c4292r.f21655t != null) {
                        C1169s c1169s = c4292r.f21655t;
                    }
                }
            }
            if (this.f2962i == 1) {
                i = ((this.f2957M - getPaddingRight()) - getPaddingLeft()) + 0;
            } else {
                i = (this.f2958N - getPaddingBottom()) - getPaddingTop();
            }
            super.mo811a(i);
        }
        return 0;
    }
}
