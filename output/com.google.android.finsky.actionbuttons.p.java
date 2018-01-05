package com.google.android.finsky.actionbuttons;

import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.support.v4.view.at;
import android.text.SpannableString;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;

public static class com.google.android.finsky.actionbuttons.p
{

    public static void a(PlayActionButtonV2 p0, Drawable p1) {
        p1.setBounds(0, 0, p1.getIntrinsicWidth(), p1.getIntrinsicHeight());
        v1 = new com.google.android.finsky.actionbuttons.x(p1);
        if (android.support.v4.view.ai.a.k(p0) == 1) {
            v2 = String.valueOf(p0.getText());
            v0 = new SpannableString((String.valueOf(v2).length() + 1) + v2 + "\u2002");
            v0.setSpan(v1, v0.length() - 1, v0.length(), 17);
        }
        else {
            v2 = String.valueOf(p0.getText());
            v0 = new SpannableString((String.valueOf(v2).length() + 1) + "\u2002" + v2);
            v0.setSpan(v1, 0, 1, 17);
        }
        p0.setTransformationMethod(0);
        p0.setText(v0);
    }

}
