package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.libraries.bind.C5877c;
import com.google.android.libraries.bind.data.C5878d;
import com.google.android.libraries.bind.data.C5896e;
import com.google.android.libraries.bind.data.Data;

public class BoundImageView extends ImageView implements C5878d {
    public final C5896e f29456a;
    public Integer f29457b;
    public Integer f29458c;
    public Integer f29459d;
    public Integer f29460e;

    public BoundImageView(Context context) {
        this(context, null);
    }

    public BoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29456a = new C5896e(context, attributeSet, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5877c.BoundImageView, i, 0);
        this.f29457b = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundImageView_bindImageUri);
        this.f29458c = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundImageView_bindDrawable);
        this.f29459d = C5896e.m27351a(obtainStyledAttributes, C5877c.BoundImageView_bindColorFilter);
        obtainStyledAttributes.recycle();
    }

    public final void a_(Data data) {
        Object c;
        Object obj = 1;
        Drawable drawable = null;
        this.f29456a.m27353a(data);
        if (this.f29457b != null) {
            c = data == null ? null : data.m27349c(this.f29457b.intValue());
            if (c instanceof Uri) {
                setImageURI((Uri) c);
            } else {
                setImageURI(null);
            }
        }
        if (this.f29459d != null) {
            setColorFilter(data == null ? null : (ColorFilter) data.m27349c(this.f29459d.intValue()));
        }
        if (this.f29458c != null) {
            c = data == null ? null : data.m27349c(this.f29458c.intValue());
            if (c instanceof Drawable) {
                Drawable drawable2 = (Drawable) c;
                this.f29460e = null;
                drawable = drawable2;
            } else if (c instanceof Number) {
                int intValue = ((Number) c).intValue();
                Integer num = this.f29460e;
                Integer valueOf = Integer.valueOf(intValue);
                boolean equals = num == null ? valueOf == null : num.equals(valueOf);
                if (equals) {
                    c = null;
                } else {
                    this.f29460e = Integer.valueOf(intValue);
                    drawable = getContext().getResources().getDrawable(intValue);
                    c = 1;
                }
                obj = c;
            } else {
                if (this.f29460e == null) {
                    obj = null;
                }
                this.f29460e = null;
            }
            if (obj != null) {
                setImageDrawable(drawable);
            }
        }
    }
}
