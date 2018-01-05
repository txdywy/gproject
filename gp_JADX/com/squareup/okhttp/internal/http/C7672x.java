package com.squareup.okhttp.internal.http;

import java.util.Comparator;

final class C7672x implements Comparator {
    C7672x() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str == str2) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
    }
}
