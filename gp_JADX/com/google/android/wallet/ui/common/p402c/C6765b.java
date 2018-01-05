package com.google.android.wallet.ui.common.p402c;

import android.widget.TextView;
import java.util.ArrayList;

public final class C6765b extends C6764e {
    public C6765b(C6739a... c6739aArr) {
        super(c6739aArr);
    }

    protected final boolean mo5632a(TextView textView) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C6739a c6739a = (C6739a) obj;
            if (!c6739a.m30546c(textView)) {
                this.i = c6739a.mo5631a();
                return false;
            }
        }
        return true;
    }
}
