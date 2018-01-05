package com.google.android.gms.internal;

public abstract class tz implements vl {
    public abstract tz mo4853a();

    protected abstract tz mo4854a(ty tyVar);

    public final /* synthetic */ vl mo4852a(vk vkVar) {
        if (mo4848h().getClass().isInstance(vkVar)) {
            return mo4854a((ty) vkVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public /* synthetic */ Object clone() {
        return mo4853a();
    }
}
