package com.google.android.wallet.ui.common;

import android.text.method.NumberKeyListener;

public final class by extends NumberKeyListener {
    public final char[] f33592a;
    public final int f33593b;

    public by(String str, int i) {
        this.f33592a = new char[str.length()];
        str.getChars(0, str.length(), this.f33592a, 0);
        this.f33593b = i;
    }

    protected final char[] getAcceptedChars() {
        return this.f33592a;
    }

    public final int getInputType() {
        return this.f33593b;
    }
}
