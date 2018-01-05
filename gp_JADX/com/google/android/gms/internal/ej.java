package com.google.android.gms.internal;

import android.os.Bundle;
import android.util.Pair;
import java.util.List;

public final class ej {
    public static Bundle m24337a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }
}
