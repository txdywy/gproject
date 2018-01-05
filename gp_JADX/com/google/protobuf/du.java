package com.google.protobuf;

abstract class du {
    du() {
    }

    abstract Object mo6186a(Object obj);

    abstract void mo6187a(Object obj, int i, int i2);

    abstract void mo6188a(Object obj, int i, long j);

    abstract void mo6189a(Object obj, int i, C7203j c7203j);

    abstract void mo6190a(Object obj, int i, Object obj2);

    abstract void mo6191a(Object obj, eq eqVar);

    abstract void mo6192a(Object obj, Object obj2);

    abstract boolean mo6193a();

    abstract Object mo6194b();

    abstract Object mo6195b(Object obj);

    abstract void mo6196b(Object obj, int i, long j);

    abstract void mo6197b(Object obj, eq eqVar);

    abstract void mo6198b(Object obj, Object obj2);

    abstract Object mo6199c(Object obj);

    abstract Object mo6200c(Object obj, Object obj2);

    abstract void mo6201d(Object obj);

    abstract int mo6202e(Object obj);

    abstract int mo6203f(Object obj);

    final boolean m33313a(Object obj, cz czVar) {
        int b = czVar.mo6266b();
        int i = b >>> 3;
        switch (b & 7) {
            case 0:
                mo6188a(obj, i, czVar.mo6278g());
                return true;
            case 1:
                mo6196b(obj, i, czVar.mo6282i());
                return true;
            case 2:
                mo6189a(obj, i, czVar.mo6292n());
                return true;
            case 3:
                Object b2 = mo6194b();
                int i2 = (i << 3) | 4;
                while (czVar.mo6261a() != Integer.MAX_VALUE) {
                    if (!m33313a(b2, czVar)) {
                        if (i2 == czVar.mo6266b()) {
                            throw InvalidProtocolBufferException.m32668e();
                        }
                        mo6190a(obj, i, mo6186a(b2));
                        return true;
                    }
                }
                if (i2 == czVar.mo6266b()) {
                    mo6190a(obj, i, mo6186a(b2));
                    return true;
                }
                throw InvalidProtocolBufferException.m32668e();
            case 4:
                return false;
            case 5:
                mo6187a(obj, i, czVar.mo6284j());
                return true;
            default:
                throw InvalidProtocolBufferException.m32669f();
        }
    }
}
