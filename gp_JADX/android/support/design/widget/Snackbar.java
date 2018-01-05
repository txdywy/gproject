package android.support.design.widget;

import android.content.Context;
import android.support.design.C0126h;
import android.support.design.internal.SnackbarContentLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class Snackbar extends C0138g {

    public final class SnackbarLayout extends C0137x {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(measuredWidth, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE));
                }
            }
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, C0131u c0131u) {
        super(viewGroup, view, c0131u);
    }

    public static Snackbar m500a(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup = null;
        View view2 = view;
        while (!(view2 instanceof CoordinatorLayout)) {
            if (view2 instanceof FrameLayout) {
                if (view2.getId() == 16908290) {
                    viewGroup = (ViewGroup) view2;
                    break;
                }
                viewGroup = (ViewGroup) view2;
            }
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                if (parent instanceof View) {
                    view2 = (View) parent;
                    continue;
                } else {
                    view2 = null;
                    continue;
                }
            }
            if (view2 == null) {
                break;
            }
        }
        viewGroup = (ViewGroup) view2;
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0126h.design_layout_snackbar_include, viewGroup, false);
        C0138g snackbar = new Snackbar(viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) snackbar.e.getChildAt(0)).getMessageView().setText(charSequence);
        snackbar.f661g = i;
        return snackbar;
    }

    public static Snackbar m499a(View view, int i, int i2) {
        return m500a(view, view.getResources().getText(i), i2);
    }

    public final Snackbar m501a(int i, OnClickListener onClickListener) {
        return m502a(this.f658d.getText(i), onClickListener);
    }

    public final Snackbar m502a(CharSequence charSequence, OnClickListener onClickListener) {
        TextView actionView = ((SnackbarContentLayout) this.e.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
        } else {
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new bq(this, onClickListener));
        }
        return this;
    }
}
