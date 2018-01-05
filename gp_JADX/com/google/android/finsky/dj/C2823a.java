package com.google.android.finsky.dj;

import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;

public final class C2823a {
    public static StaticLayout m14945a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Alignment alignment, boolean z, TruncateAt truncateAt, int i4) {
        if (VERSION.SDK_INT >= 23) {
            Builder obtain = Builder.obtain(charSequence, i, i2, textPaint, i3);
            obtain.setAlignment(alignment);
            obtain.setIncludePad(z);
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(i4);
            return obtain.build();
        }
        return new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, TextDirectionHeuristics.FIRSTSTRONG_LTR, 1.0f, 0.0f, z, truncateAt, i3, i4);
    }
}
