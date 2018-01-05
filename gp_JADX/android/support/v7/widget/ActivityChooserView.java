package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0350g;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;

public final class ActivityChooserView extends ViewGroup {
    public final ImageView f2926a;

    public class InnerLayout extends dh {
        public static final int[] f2925a = new int[]{16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            hc a = hc.m3768a(context, attributeSet, f2925a);
            setBackgroundDrawable(a.m3771a(0));
            a.f3558b.recycle();
        }
    }

    public final void setActivityChooserModel(C0513x c0513x) {
        throw new NoSuchMethodError();
    }

    public final void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f2926a.setImageDrawable(drawable);
    }

    public final void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f2926a.setContentDescription(getContext().getString(i));
    }

    public final void setProvider(C0350g c0350g) {
    }

    protected final void onAttachedToWindow() {
        throw new NoSuchMethodError();
    }

    protected final void onDetachedFromWindow() {
        throw new NoSuchMethodError();
    }

    protected final void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }

    public final C0513x getDataModel() {
        throw new NoSuchMethodError();
    }

    public final void setOnDismissListener(OnDismissListener onDismissListener) {
    }

    public final void setInitialActivityCount(int i) {
    }

    public final void setDefaultActionButtonContentDescription(int i) {
    }
}
