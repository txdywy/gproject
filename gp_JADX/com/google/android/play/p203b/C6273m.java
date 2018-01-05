package com.google.android.play.p203b;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.play.k;

@TargetApi(21)
final class C6273m extends C6272l {
    C6273m() {
    }

    public final void mo3865a(View view, Context context, AttributeSet attributeSet, int i) {
        TypedArray a = C6272l.m28800a(context, attributeSet, i);
        Drawable c6274n = new C6274n(a.getColorStateList(k.PlayCardViewGroup_playCardBackgroundColor), C6272l.m28798a(context, a), (float) C6272l.m28799a(a));
        c6274n.f16235H = C6272l.m28801a(view, a);
        view.setClipToOutline(true);
        view.setElevation(C6272l.m28802b(context, a));
        view.setBackground(c6274n);
        view.setClipToOutline(a.getBoolean(k.PlayCardViewGroup_playCardClipToOutline, true));
        a.recycle();
    }
}
