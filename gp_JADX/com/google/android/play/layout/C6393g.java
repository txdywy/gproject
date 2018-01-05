package com.google.android.play.layout;

import android.content.Context;
import android.support.v7.widget.do;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import java.util.ArrayList;
import java.util.List;

public final class C6393g implements OnDismissListener {
    public final Context f32245a;
    public final View f32246b;
    public do f32247c;
    public final List f32248d = new ArrayList();
    public OnDismissListener f32249e;

    public C6393g(Context context, View view) {
        this.f32245a = context;
        this.f32246b = view;
    }

    public final void m29331a(int i, CharSequence charSequence, boolean z, C6395i c6395i) {
        this.f32248d.add(new C6396j(i, charSequence, z, c6395i));
    }

    public final void m29330a() {
        this.f32247c = new do(this.f32245a);
        ListAdapter c6397k = new C6397k(this.f32245a, this.f32248d);
        this.f32247c.a(c6397k);
        this.f32247c.a(this);
        this.f32247c.A = new C6394h(this, c6397k);
        this.f32247c.y = this.f32246b;
        int i = this.f32245a.getResources().getDisplayMetrics().widthPixels;
        do doVar = this.f32247c;
        ViewGroup frameLayout = new FrameLayout(this.f32245a);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = c6397k.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        while (i2 < count) {
            View view2;
            int itemViewType = c6397k.getItemViewType(i2);
            if (itemViewType != i3) {
                view2 = null;
            } else {
                itemViewType = i3;
                view2 = view;
            }
            view = c6397k.getView(i2, view2, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i4 = Math.max(i4, view.getMeasuredWidth());
            i2++;
            i3 = itemViewType;
        }
        doVar.b(Math.min(i, i4));
        this.f32247c.f();
        this.f32247c.b();
    }

    public final void onDismiss() {
        this.f32247c = null;
        if (this.f32249e != null) {
            this.f32249e.onDismiss();
        }
    }
}
