package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

class bi extends bh {
    bi() {
    }

    public void mo478a(TextView textView, Drawable drawable) {
        Drawable drawable2;
        Object obj = textView.getLayoutDirection() == 1 ? 1 : null;
        if (obj != null) {
            drawable2 = null;
        } else {
            drawable2 = drawable;
        }
        if (obj == null) {
            drawable = null;
        }
        textView.setCompoundDrawables(drawable2, null, drawable, null);
    }

    public void mo479a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        Drawable drawable5;
        Object obj = textView.getLayoutDirection() == 1 ? 1 : null;
        if (obj != null) {
            drawable5 = drawable3;
        } else {
            drawable5 = drawable;
        }
        if (obj == null) {
            drawable = drawable3;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable5, drawable2, drawable, drawable4);
    }

    public void mo477a(TextView textView, int i) {
        int i2;
        int i3;
        if (textView.getLayoutDirection() == 1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            i3 = i;
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i = 0;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(i3, 0, i, 0);
    }

    public Drawable[] mo480b(TextView textView) {
        int i = 1;
        if (textView.getLayoutDirection() != 1) {
            i = 0;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (i != 0) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }
}
