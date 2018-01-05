package com.google.android.libraries.bind.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class C5903m {
    public final List f29439a = new ArrayList();

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format(Locale.US, "  observers count: %d\n", new Object[]{Integer.valueOf(this.f29439a.size())}));
        for (C5904n c5904n : this.f29439a) {
            stringBuilder.append("    ");
            stringBuilder.append(c5904n.f29440a.toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
