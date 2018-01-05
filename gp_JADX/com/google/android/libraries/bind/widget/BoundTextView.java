package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.support.v7.widget.bg;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import com.google.android.libraries.bind.C5877c;
import com.google.android.libraries.bind.data.C5878d;
import com.google.android.libraries.bind.data.C5896e;
import com.google.android.libraries.bind.data.Data;

public class BoundTextView extends bg implements C5878d {
    public static final C5914c f29461b = new C5914c();
    public final C5896e f29462c;
    public Integer f29463d;
    public Integer f29464e;
    public Integer f29465f;
    public Integer f29466g;
    public Integer f29467h;

    public BoundTextView(Context context) {
        this(context, null, 0);
    }

    public BoundTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoundTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public BoundTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f29462c = new C5896e(context, attributeSet, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5877c.BoundTextView, i, i2);
        if (isInEditMode()) {
            CharSequence string = obtainStyledAttributes.getString(C5877c.BoundTextView_bind__editModeText);
            if (string != null) {
                setText(string);
            }
        }
        this.f29463d = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundTextView_bindText);
        this.f29464e = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundTextView_bindTextColor);
        this.f29465f = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundTextView_bindTextColorLink);
        this.f29466g = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundTextView_bindDrawableStart);
        this.f29467h = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundTextView_bindDrawableEnd);
        obtainStyledAttributes.recycle();
        setSpannableFactory(f29461b);
    }

    public final void a_(Data data) {
        Object c;
        this.f29462c.m27353a(data);
        if (this.f29463d != null) {
            if (data == null) {
                setText(null);
            } else {
                CharSequence charSequence;
                BoundTextView boundTextView;
                c = data.m27349c(this.f29463d.intValue());
                if (c instanceof Spannable) {
                    charSequence = (Spannable) c;
                    boundTextView = this;
                } else if (c instanceof CharSequence) {
                    charSequence = (CharSequence) c;
                    boundTextView = this;
                } else if (c == null) {
                    charSequence = null;
                    boundTextView = this;
                } else {
                    charSequence = c.toString();
                    boundTextView = this;
                }
                boundTextView.setText(charSequence, BufferType.NORMAL);
            }
        }
        if (this.f29464e != null) {
            c = data == null ? null : data.m27349c(this.f29464e.intValue());
            if (c == null) {
                setTextColor(-1);
            } else if (c instanceof ColorStateList) {
                setTextColor((ColorStateList) c);
            } else {
                setTextColor(getContext().getResources().getColor(((Integer) c).intValue()));
            }
        }
        if (this.f29465f != null) {
            c = data == null ? null : data.m27349c(this.f29465f.intValue());
            if (c instanceof ColorStateList) {
                setLinkTextColor((ColorStateList) c);
            } else if (c != null) {
                setLinkTextColor(getContext().getResources().getColor(((Integer) c).intValue()));
            }
        }
        if (this.f29466g != null || this.f29467h != null) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            m27398a(compoundDrawables, data, this.f29466g, true);
            m27398a(compoundDrawables, data, this.f29467h, false);
            setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        }
    }

    private final void m27398a(Drawable[] drawableArr, Data data, Integer num, boolean z) {
        Drawable drawable = null;
        if (num != null) {
            Integer d = data == null ? null : data.m27350d(num.intValue());
            int i = (ai.f1848a.mo400k(this) == 0 && z) ? 0 : 2;
            if (d != null) {
                drawable = getContext().getResources().getDrawable(d.intValue());
            }
            drawableArr[i] = drawable;
        }
    }

    protected C5896e getBoundHelper() {
        return this.f29462c;
    }

    public void setBindTextKey(Integer num) {
        this.f29463d = num;
    }

    public void setBindTextColorKey(Integer num) {
        this.f29464e = num;
    }
}
