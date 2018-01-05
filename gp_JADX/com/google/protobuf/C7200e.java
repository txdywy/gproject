package com.google.protobuf;

public abstract class C7200e implements cs {
    private final cf m32970b(C7203j c7203j, ah ahVar) {
        try {
            C7225s d = c7203j.mo6178d();
            cf cfVar = (cf) mo6129a(d, ahVar);
            d.mo6234a(0);
            return cfVar;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    public final /* synthetic */ Object mo6128a(C7203j c7203j, ah ahVar) {
        cf b = m32970b(c7203j, ahVar);
        if (b == null || b.mo6118e()) {
            return b;
        }
        UninitializedMessageException uninitializedMessageException;
        if (b instanceof C7196a) {
            uninitializedMessageException = new UninitializedMessageException();
        } else if (b instanceof C7202d) {
            uninitializedMessageException = new UninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        InvalidProtocolBufferException a = uninitializedMessageException.m32674a();
        if (a == null) {
            throw null;
        }
        throw a;
    }

    static {
        ah.m32878a();
    }
}
