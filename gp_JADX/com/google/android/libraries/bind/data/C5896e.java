package com.google.android.libraries.bind.data;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.bind.C5877c;
import com.google.android.libraries.bind.p324c.C5875b;

public class C5896e {
    public static final C5875b f29421a = C5875b.m27305a(C5896e.class);
    public Integer f29422b;
    public Integer f29423c;
    public Integer f29424d;
    public Integer f29425e;
    public Integer f29426f;
    public Integer f29427g;
    public Integer f29428h;
    public Integer f29429i;
    public Integer f29430j;
    public final View f29431k;

    public C5896e(Context context, AttributeSet attributeSet, View view) {
        this.f29431k = view;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5877c.BoundView);
        this.f29422b = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundView_bindBackground);
        this.f29423c = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundView_bindContentDescription);
        this.f29424d = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundView_bindImportantForAccessibility);
        this.f29425e = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundView_bindEnabled);
        this.f29428h = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundView_bindOnClickListener);
        this.f29426f = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundView_bindInvisibility);
        this.f29427g = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundView_bindMinHeight);
        this.f29430j = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundView_bindVisibility);
        this.f29429i = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundView_bindTransitionName);
        obtainStyledAttributes.recycle();
    }

    public final void m27353a(Data data) {
        String str = null;
        View view = this.f29431k;
        Integer num = this.f29422b;
        if (num != null) {
            Object c = data == null ? null : data.m27349c(num.intValue());
            if (c == null) {
                view.setBackgroundResource(0);
            } else if (c instanceof Integer) {
                view.setBackgroundResource(((Integer) c).intValue());
            } else if (c instanceof Drawable) {
                view.setBackgroundDrawable((Drawable) c);
            } else {
                C5875b.f29391b.mo5179a(6, f29421a.f29393c, C5875b.m27306b("Unrecognized bound background for key: %s", num));
            }
        }
        view = this.f29431k;
        Integer num2 = this.f29423c;
        if (num2 != null) {
            view.setContentDescription(data == null ? null : (CharSequence) data.m27349c(num2.intValue()));
        }
        view = this.f29431k;
        num2 = this.f29424d;
        if (num2 != null) {
            num2 = data == null ? null : (Integer) data.m27349c(num2.intValue());
            ai.m1838b(view, num2 == null ? 0 : num2.intValue());
        }
        view = this.f29431k;
        num2 = this.f29425e;
        if (num2 != null) {
            boolean z;
            if (data == null || !data.m27348b(num2.intValue()) || data.m27349c(num2.intValue()).equals(Boolean.FALSE)) {
                z = false;
            } else {
                z = true;
            }
            view.setEnabled(z);
        }
        C5896e.m27352a(this.f29431k, this.f29426f, data, true);
        View view2 = this.f29431k;
        num2 = this.f29427g;
        if (num2 != null) {
            Number valueOf = data == null ? Integer.valueOf(0) : (Number) data.m27349c(num2.intValue());
            view2.setMinimumHeight(valueOf == null ? 0 : valueOf.intValue());
        }
        view2 = this.f29431k;
        num2 = this.f29428h;
        if (num2 != null) {
            OnClickListener onClickListener = data == null ? null : (OnClickListener) data.m27349c(num2.intValue());
            view2.setOnClickListener(onClickListener);
            if (onClickListener == null) {
                view2.setClickable(false);
            }
        }
        View view3 = this.f29431k;
        Integer num3 = this.f29429i;
        if (num3 != null && VERSION.SDK_INT >= 21) {
            if (data != null) {
                Object c2 = data.m27349c(num3.intValue());
                if (c2 != null) {
                    str = c2.toString();
                }
            }
            view3.setTransitionName(str);
        }
        C5896e.m27352a(this.f29431k, this.f29430j, data, false);
    }

    public static Integer m27351a(TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, Integer.MAX_VALUE);
        return resourceId == Integer.MAX_VALUE ? null : Integer.valueOf(resourceId);
    }

    private static void m27352a(View view, Integer num, Data data, boolean z) {
        int i = 8;
        if (num != null) {
            int i2 = (data == null || !data.m27348b(num.intValue())) ? 8 : data.m27349c(num.intValue()) instanceof Boolean ? ((Boolean) data.m27349c(num.intValue())).booleanValue() ? 0 : 8 : 0;
            if (!z) {
                i = i2;
            } else if (i2 != 0) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }
}
