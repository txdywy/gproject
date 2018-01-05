package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

class bj extends bi {
    bj() {
    }

    public final void mo478a(TextView textView, Drawable drawable) {
        textView.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public final void mo479a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void mo477a(TextView textView, int i) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i, 0);
    }

    public final Drawable[] mo480b(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }
}
