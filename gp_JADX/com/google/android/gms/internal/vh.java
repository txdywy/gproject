package com.google.android.gms.internal;

import java.util.Map.Entry;

final class vh implements Entry {
    public Entry f27564a;

    vh(Entry entry) {
        this.f27564a = entry;
    }

    public final Object getKey() {
        return this.f27564a.getKey();
    }

    public final Object getValue() {
        return ((vg) this.f27564a.getValue()) == null ? null : vg.m25791a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof vk) {
            vg vgVar = (vg) this.f27564a.getValue();
            vk vkVar = (vk) obj;
            vk vkVar2 = vgVar.f27562a;
            vgVar.f27563b = null;
            vgVar.f27562a = vkVar;
            return vkVar2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
