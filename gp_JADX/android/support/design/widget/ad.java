package android.support.design.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.design.C0117b;
import android.support.design.C0124f;
import android.support.design.C0126h;
import android.support.design.C0127i;
import android.support.v4.view.ai;
import android.support.v7.app.be;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;

public final class ad extends be {
    public BottomSheetBehavior f719a;
    public boolean f720b;
    public boolean f721c;
    public boolean f722d;
    public aa f723e;

    public ad(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(C0117b.bottomSheetDialogTheme, typedValue, true)) {
                i = typedValue.resourceId;
            } else {
                i = C0127i.Theme_Design_Light_BottomSheetDialog;
            }
        }
        super(context, i);
        this.f720b = true;
        this.f721c = true;
        this.f723e = new ah(this);
        m536a();
    }

    public final void setContentView(int i) {
        super.setContentView(m537a(i, null, null));
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    public final void setContentView(View view) {
        super.setContentView(m537a(0, view, null));
    }

    public final void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(m537a(0, view, layoutParams));
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f720b != z) {
            this.f720b = z;
            if (this.f719a != null) {
                this.f719a.f588j = z;
            }
        }
    }

    protected final void onStart() {
        super.onStart();
        if (this.f719a != null) {
            this.f719a.m433b(4);
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f720b) {
            this.f720b = true;
        }
        this.f721c = z;
        this.f722d = true;
    }

    private final View m537a(int i, View view, LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0126h.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(C0124f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        View view2 = (FrameLayout) coordinatorLayout.findViewById(C0124f.design_bottom_sheet);
        this.f719a = BottomSheetBehavior.m417a(view2);
        this.f719a.f598t = this.f723e;
        this.f719a.f588j = this.f720b;
        if (layoutParams == null) {
            view2.addView(view);
        } else {
            view2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C0124f.touch_outside).setOnClickListener(new ae(this));
        ai.m1829a(view2, new af(this));
        view2.setOnTouchListener(new ag());
        return frameLayout;
    }
}
