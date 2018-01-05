package com.google.android.wallet.ui.address;

import java.util.Comparator;

final class C6714d implements Comparator {
    C6714d() {
    }

    public final int compare(Object obj, Object obj2) {
        return String.CASE_INSENSITIVE_ORDER.compare(obj.toString(), obj2.toString());
    }
}
