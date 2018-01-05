package com.google.android.wallet.common.pub.p381a.p382a;

import com.google.android.wallet.analytics.C6506n;
import java.util.List;

public final class C6577a {
    public final List f32714a;

    public C6577a(List list) {
        this.f32714a = list;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int size = this.f32714a.size();
        for (int i = 0; i < size; i++) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(" -> ");
            }
            stringBuilder.append(((C6506n) this.f32714a.get(i)).f32563a);
        }
        return stringBuilder.toString();
    }
}
