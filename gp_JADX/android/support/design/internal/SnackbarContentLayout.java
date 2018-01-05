package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.C0121d;
import android.support.design.C0124f;
import android.support.design.C0134j;
import android.support.design.widget.C0131u;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public class SnackbarContentLayout extends LinearLayout implements C0131u {
    public TextView f533a;
    public Button f534b;
    public int f535c;
    public int f536d;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0134j.SnackbarLayout);
        this.f535c = obtainStyledAttributes.getDimensionPixelSize(C0134j.SnackbarLayout_android_maxWidth, -1);
        this.f536d = obtainStyledAttributes.getDimensionPixelSize(C0134j.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f533a = (TextView) findViewById(C0124f.snackbar_text);
        this.f534b = (Button) findViewById(C0124f.snackbar_action);
    }

    public TextView getMessageView() {
        return this.f533a;
    }

    public Button getActionView() {
        return this.f534b;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f535c > 0 && getMeasuredWidth() > this.f535c) {
            i = MeasureSpec.makeMeasureSpec(this.f535c, MemoryMappedFileBuffer.DEFAULT_SIZE);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0121d.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0121d.design_snackbar_padding_vertical);
        int i3 = this.f533a.getLayout().getLineCount() > 1 ? 1 : 0;
        if (i3 == 0 || this.f536d <= 0 || this.f534b.getMeasuredWidth() <= this.f536d) {
            if (i3 == 0) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (m324a(0, dimensionPixelSize, dimensionPixelSize)) {
                dimensionPixelSize = 1;
            }
            dimensionPixelSize = 0;
        } else {
            if (m324a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                dimensionPixelSize = 1;
            }
            dimensionPixelSize = 0;
        }
        if (dimensionPixelSize != 0) {
            super.onMeasure(i, i2);
        }
    }

    private final boolean m324a(int i, int i2, int i3) {
        boolean z = false;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        }
        if (this.f533a.getPaddingTop() == i2 && this.f533a.getPaddingBottom() == i3) {
            return z;
        }
        View view = this.f533a;
        if (ai.f1848a.mo404o(view)) {
            ai.m1823a(view, ai.f1848a.mo401l(view), i2, ai.f1848a.mo402m(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
        return true;
    }

    public final void mo65a() {
        this.f533a.setAlpha(0.0f);
        this.f533a.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (this.f534b.getVisibility() == 0) {
            this.f534b.setAlpha(0.0f);
            this.f534b.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }

    public final void mo66b() {
        this.f533a.setAlpha(1.0f);
        this.f533a.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (this.f534b.getVisibility() == 0) {
            this.f534b.setAlpha(1.0f);
            this.f534b.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }
}
