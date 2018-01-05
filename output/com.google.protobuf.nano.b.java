package com.google.protobuf.nano;

import java.util.List;

public class com.google.protobuf.nano.b extends com.google.protobuf.nano.i
{

    public com.google.protobuf.nano.e aO;

    b() {
        com.google.protobuf.nano.i();
    }

    public final void a(int p0, com.google.protobuf.nano.k p1) {
        v0 = 0;
        if (this.aO == 0)
            this.aO = new com.google.protobuf.nano.e();
        else
            v0 = this.aO.a(p0);
        if (v0 == 0) {
            v0 = new com.google.protobuf.nano.f();
            this.aO.a(p0, v0);
        }
        v0.c.add(p1);
    }

    public void a(CodedOutputByteBufferNano p0) {
        if (this.aO != 0) {
            v0 = 0;
            while (v0 < this.aO.a()) {
                this.aO.b(v0).a(p0);
                v0 = v0 + 1;
            }
        }
    }

    public final boolean a(com.google.protobuf.nano.a p0, int p1) {
        v0 = p0.o();
        if (!p0.b(p1))
            v0 = 0;
        else {
            this.a(p1 >>> 3, new com.google.protobuf.nano.k(p1, p0.a(v0, p0.o() - v0)));
            v0 = 1;
        }
        return v0;
    }

    public final boolean a(com.google.protobuf.nano.c p0) {
        v0 = 0;
        if (this.aO != 0 && this.aO.a(p0.c >>> 3) != 0)
            v0 = 1;
        return v0;
    }

    public int b() {
        v0 = 0;
        if (this.aO == 0) {
            v1 = 0;
            return v1;
        }
        v1 = 0;
        while (v0 < this.aO.a()) {
            v1 = v1 + this.aO.b(v0).a();
            v0 = v0 + 1;
        }
        return v1;
        v1 = 0;
        return v1;
    }

    public final Object b(com.google.protobuf.nano.c p0) {
        v1 = 0;
        if (this.aO == 0)
            return v1;
        v2 = this.aO.a(p0.c >>> 3);
        if (v2 == 0)
            return v1;
        if (v2.b == 0) {
            v2.a = p0;
            if (v2.c == 0)
                v0 = 0;
            else if (p0.d != 0)
                v0 = p0.a(v2.c);
            else if (v2.c.isEmpty())
                v0 = 0;
            else {
                v0 = ((com.google.protobuf.nano.k)v2.c.get(v2.c.size() - 1)).b;
                v0 = p0.b.cast(p0.a(com.google.protobuf.nano.a.a(v0, 0, v0.length)));
            }
            v2.b = v0;
            v2.c = 0;
            v1 = v2.b;
            return v1;
        }
        if (!v2.a.equals(p0))
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        v1 = v2.b;
        return v1;
    }

    public com.google.protobuf.nano.i cJ_() {
        return (com.google.protobuf.nano.b)this.clone();
    }

    public com.google.protobuf.nano.b cK_() {
        v0 = (com.google.protobuf.nano.b)super.cJ_();
        com.google.protobuf.nano.h.a(this, v0);
        return v0;
    }

    public Object clone() {
        return this.cK_();
    }

}
