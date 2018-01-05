package com.google.android.libraries.bind.widget;

import android.text.Spannable;
import android.text.Spannable.Factory;

public final class C5914c extends Factory {
    public final Spannable newSpannable(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            return (Spannable) charSequence;
        }
        return super.newSpannable(charSequence);
    }
}
