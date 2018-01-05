package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class vr extends vq {
    vr(int i) {
        super(i);
    }

    public final void mo4941a() {
        if (!this.f27571d) {
            for (int i = 0; i < m25801b(); i++) {
                Entry b = m25802b(i);
                if (((ut) b.getKey()).m25761b()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry entry : m25803c()) {
                if (((ut) entry.getKey()).m25761b()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo4941a();
    }
}
