package com.google.protobuf;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class di extends dh {
    di(int i) {
        super(i);
    }

    public final void mo6182a() {
        if (!this.f35346d) {
            for (int i = 0; i < m33290b(); i++) {
                Entry b = m33291b(i);
                if (((an) b.getKey()).m32922d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : m33292c()) {
                if (((an) entry.getKey()).m32922d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo6182a();
    }
}
