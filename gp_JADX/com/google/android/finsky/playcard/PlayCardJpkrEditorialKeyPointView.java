package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;

public class PlayCardJpkrEditorialKeyPointView extends LinearLayout {
    public TextView f19424a;
    public TextView f19425b;

    public PlayCardJpkrEditorialKeyPointView(Context context) {
        this(context, null);
    }

    public PlayCardJpkrEditorialKeyPointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19424a = (TextView) findViewById(C7582R.id.key_point_index);
        this.f19425b = (TextView) findViewById(C7582R.id.key_point_content);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int lineCount = this.f19425b.getLineCount();
        if (lineCount > 1) {
            int measuredHeight = this.f19425b.getMeasuredHeight();
            int measuredHeight2 = this.f19424a.getMeasuredHeight();
            lineCount = (((measuredHeight / lineCount) - measuredHeight2) / 2) + getPaddingTop();
            this.f19424a.layout(this.f19424a.getLeft(), lineCount, this.f19424a.getRight(), measuredHeight2 + lineCount);
        }
    }
}
