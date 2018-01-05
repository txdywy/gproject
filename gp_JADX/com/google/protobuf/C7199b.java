package com.google.protobuf;

public abstract class C7199b implements cg {
    public abstract C7199b mo6123a();

    protected abstract C7199b mo6124a(C7196a c7196a);

    public /* synthetic */ Object clone() {
        return mo6123a();
    }

    public final /* synthetic */ cg mo6122a(cf cfVar) {
        if (mo6121h().getClass().isInstance(cfVar)) {
            return mo6124a((C7196a) cfVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
