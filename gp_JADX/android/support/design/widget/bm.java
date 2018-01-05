package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.C0357n;
import android.support.v4.view.ai;
import android.support.v4.view.ca;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.List;

abstract class bm extends cp {
    public final Rect f564a = new Rect();
    public final Rect f565b = new Rect();
    public int f566c = 0;
    public int f567d;

    abstract View mo89a(List list);

    public bm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean mo80a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View a = mo89a(coordinatorLayout.m465b(view));
            if (a != null) {
                if (ai.f1848a.mo397i(a) && !ai.f1848a.mo397i(view)) {
                    ai.m1853i(view);
                    if (ai.f1848a.mo397i(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                int b = mo93b(a) + (size - a.getMeasuredHeight());
                if (i5 == -1) {
                    size = MemoryMappedFileBuffer.DEFAULT_SIZE;
                } else {
                    size = Integer.MIN_VALUE;
                }
                coordinatorLayout.m462a(view, i, i2, MeasureSpec.makeMeasureSpec(b, size), i4);
                return true;
            }
        }
        return false;
    }

    protected final void mo87b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = mo89a(coordinatorLayout.m465b(view));
        if (a != null) {
            aq aqVar = (aq) view.getLayoutParams();
            Rect rect = this.f564a;
            rect.set(coordinatorLayout.getPaddingLeft() + aqVar.leftMargin, a.getBottom() + aqVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - aqVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - aqVar.bottomMargin);
            ca caVar = coordinatorLayout.f626r;
            if (!(caVar == null || !ai.f1848a.mo397i(coordinatorLayout) || ai.f1848a.mo397i(view))) {
                rect.left += caVar.m2021a();
                rect.right -= caVar.m2024c();
            }
            Rect rect2 = this.f565b;
            int i2 = aqVar.f796c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            C0357n.m2044a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            i2 = m399c(a);
            view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
            this.f566c = rect2.top - a.getBottom();
            return;
        }
        super.mo87b(coordinatorLayout, view, i);
        this.f566c = 0;
    }

    float mo88a(View view) {
        return 1.0f;
    }

    final int m399c(View view) {
        if (this.f567d == 0) {
            return 0;
        }
        return bn.m702a((int) (mo88a(view) * ((float) this.f567d)), 0, this.f567d);
    }

    int mo93b(View view) {
        return view.getMeasuredHeight();
    }
}
