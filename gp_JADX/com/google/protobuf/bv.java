package com.google.protobuf;

final class bv implements ce {
    public ce[] f35239a;

    bv(ce... ceVarArr) {
        this.f35239a = ceVarArr;
    }

    public final boolean mo6113a(Class cls) {
        for (ce a : this.f35239a) {
            if (a.mo6113a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final cd mo6114b(Class cls) {
        for (ce ceVar : this.f35239a) {
            if (ceVar.mo6113a(cls)) {
                return ceVar.mo6114b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
