package com.google.android.youtube.player.internal;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class C6849u extends FrameLayout {
    public final ProgressBar f33863a;
    public final TextView f33864b;

    public C6849u(Context context) {
        super(context, null, ar.m31125c(context));
        C6848t c6848t = new C6848t(context);
        setBackgroundColor(-16777216);
        this.f33863a = new ProgressBar(context);
        this.f33863a.setVisibility(8);
        addView(this.f33863a, new LayoutParams(-2, -2, 17));
        int i = (int) ((10.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
        this.f33864b = new TextView(context);
        this.f33864b.setTextAppearance(context, 16973894);
        this.f33864b.setTextColor(-1);
        this.f33864b.setVisibility(8);
        this.f33864b.setPadding(i, i, i, i);
        this.f33864b.setGravity(17);
        this.f33864b.setText(c6848t.f33853a);
        addView(this.f33864b, new LayoutParams(-2, -2, 17));
    }

    protected final void onMeasure(int i, int i2) {
        int i3 = 0;
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (mode == MemoryMappedFileBuffer.DEFAULT_SIZE && mode2 == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            i3 = size;
        } else if (mode == MemoryMappedFileBuffer.DEFAULT_SIZE || (mode == Integer.MIN_VALUE && mode2 == 0)) {
            size2 = (int) (((float) size) / 1.777f);
            i3 = size;
        } else if (mode2 == MemoryMappedFileBuffer.DEFAULT_SIZE || (mode2 == Integer.MIN_VALUE && mode == 0)) {
            i3 = (int) (((float) size2) * 1.777f);
        } else if (mode != Integer.MIN_VALUE || mode2 != Integer.MIN_VALUE) {
            size2 = 0;
        } else if (((float) size2) < ((float) size) / 1.777f) {
            i3 = (int) (((float) size2) * 1.777f);
        } else {
            size2 = (int) (((float) size) / 1.777f);
            i3 = size;
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(C6849u.resolveSize(i3, i), MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(C6849u.resolveSize(size2, i2), MemoryMappedFileBuffer.DEFAULT_SIZE));
    }
}
