package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p040a.C0403j;
import android.util.AttributeSet;
import android.widget.TextView;

final class bf extends bd {
    public ha f3196j;
    public ha f3197k;

    bf(TextView textView) {
        super(textView);
    }

    final void mo757a(AttributeSet attributeSet, int i) {
        super.mo757a(attributeSet, i);
        Context context = this.a.getContext();
        ag a = ag.m3175a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0403j.AppCompatTextHelper, i, 0);
        if (obtainStyledAttributes.hasValue(C0403j.AppCompatTextHelper_android_drawableStart)) {
            this.f3196j = bd.m3231a(context, a, obtainStyledAttributes.getResourceId(C0403j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (obtainStyledAttributes.hasValue(C0403j.AppCompatTextHelper_android_drawableEnd)) {
            this.f3197k = bd.m3231a(context, a, obtainStyledAttributes.getResourceId(C0403j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        obtainStyledAttributes.recycle();
    }

    final void mo756a() {
        super.mo756a();
        if (this.f3196j != null || this.f3197k != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            m3238a(compoundDrawablesRelative[0], this.f3196j);
            m3238a(compoundDrawablesRelative[2], this.f3197k);
        }
    }
}
