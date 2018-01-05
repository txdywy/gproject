package com.google.protobuf.nano;

import java.util.List;

public abstract class C0758b extends C0757i {
    public e aO;

    public int mo1128b() {
        int i = 0;
        if (this.aO == null) {
            return 0;
        }
        int i2 = 0;
        while (i < this.aO.a()) {
            i2 += this.aO.b(i).a();
            i++;
        }
        return i2;
    }

    public void mo1127a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.aO != null) {
            for (int i = 0; i < this.aO.a(); i++) {
                this.aO.b(i).a(codedOutputByteBufferNano);
            }
        }
    }

    public final boolean m4919a(c cVar) {
        if (this.aO == null || this.aO.a(cVar.c >>> 3) == null) {
            return false;
        }
        return true;
    }

    public final Object m4921b(c cVar) {
        if (this.aO == null) {
            return null;
        }
        f a = this.aO.a(cVar.c >>> 3);
        if (a == null) {
            return null;
        }
        if (a.b == null) {
            Object obj;
            a.a = cVar;
            List list = a.c;
            if (list == null) {
                obj = null;
            } else if (cVar.d) {
                obj = cVar.a(list);
            } else if (list.isEmpty()) {
                obj = null;
            } else {
                k kVar = (k) list.get(list.size() - 1);
                Class cls = cVar.b;
                byte[] bArr = kVar.b;
                obj = cls.cast(cVar.a(a.a(bArr, 0, bArr.length)));
            }
            a.b = obj;
            a.c = null;
        } else if (!a.a.equals(cVar)) {
            throw new IllegalStateException("Tried to getExtension with a different Extension.");
        }
        return a.b;
    }

    public final boolean m4918a(a aVar, int i) {
        int o = aVar.o();
        if (!aVar.b(i)) {
            return false;
        }
        m4916a(i >>> 3, new k(i, aVar.a(o, aVar.o() - o)));
        return true;
    }

    public final void m4916a(int i, k kVar) {
        f fVar = null;
        if (this.aO == null) {
            this.aO = new e();
        } else {
            fVar = this.aO.a(i);
        }
        if (fVar == null) {
            fVar = new f();
            this.aO.a(i, fVar);
        }
        fVar.c.add(kVar);
    }

    public C0758b cK_() {
        C0758b c0758b = (C0758b) super.cJ_();
        h.a(this, c0758b);
        return c0758b;
    }

    public /* synthetic */ C0757i cJ_() {
        return (C0758b) clone();
    }

    public /* synthetic */ Object clone() {
        return cK_();
    }
}
