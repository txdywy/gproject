package com.google.android.wallet.common.pub.p381a.p382a;

import com.google.android.wallet.analytics.C6506n;

public final class C6578b {
    public final C6506n f32715a;

    public C6578b(C6506n c6506n) {
        this.f32715a = c6506n;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append('\n');
        C6578b.m29874a(this.f32715a, stringBuilder, 0);
        return stringBuilder.toString();
    }

    private static void m29874a(C6506n c6506n, StringBuilder stringBuilder, int i) {
        int i2;
        CharSequence stringBuilder2 = new StringBuilder();
        for (i2 = 0; i2 < i; i2++) {
            stringBuilder2.append("| ");
        }
        stringBuilder.append(stringBuilder2);
        stringBuilder.append("|-");
        stringBuilder.append(c6506n.f32563a);
        stringBuilder.append(" tokenLen=").append(c6506n.f32564b.length);
        stringBuilder.append('\n');
        if (c6506n.f32565c != null) {
            int i3 = i + 1;
            int size = c6506n.f32565c.size();
            for (i2 = 0; i2 < size; i2++) {
                C6578b.m29874a((C6506n) c6506n.f32565c.get(i2), stringBuilder, i3);
            }
        }
    }
}
