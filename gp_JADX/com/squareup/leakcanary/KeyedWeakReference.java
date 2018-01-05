package com.squareup.leakcanary;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class KeyedWeakReference extends WeakReference {
    public final String key;
    public final String name;

    KeyedWeakReference(Object obj, String str, String str2, ReferenceQueue referenceQueue) {
        super(Preconditions.checkNotNull(obj, "referent"), (ReferenceQueue) Preconditions.checkNotNull(referenceQueue, "referenceQueue"));
        this.key = (String) Preconditions.checkNotNull(str, "key");
        this.name = (String) Preconditions.checkNotNull(str2, "name");
    }
}
