package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.p040a.C0394a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public final class au extends RatingBar {
    public final as f3128a;

    public au(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.ratingBarStyle);
    }

    private au(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3128a = new as(this);
        this.f3128a.mo752a(attributeSet, i);
    }

    protected final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f3128a.f3125c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
