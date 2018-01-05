package p529d.p530a.p531a.p532a.p533a.p534a;

import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;

public final class bc extends b {
    public Long f39952a;
    public bk[] f39953b;

    public bc() {
        this.f39952a = null;
        this.f39953b = bk.m37187d();
        this.aP = -1;
    }

    public final void m37156a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f39952a != null) {
            codedOutputByteBufferNano.m33535c(1, this.f39952a.longValue());
        }
        if (this.f39953b != null && this.f39953b.length > 0) {
            for (i iVar : this.f39953b) {
                if (iVar != null) {
                    codedOutputByteBufferNano.m33532b(2, iVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    protected final int m37157b() {
        int b = super.b();
        if (this.f39952a != null) {
            this.f39952a.longValue();
            b += CodedOutputByteBufferNano.m33501d(1) + 8;
        }
        if (this.f39953b == null || this.f39953b.length <= 0) {
            return b;
        }
        int i = b;
        for (i iVar : this.f39953b) {
            if (iVar != null) {
                i += CodedOutputByteBufferNano.m33503d(2, iVar);
            }
        }
        return i;
    }

    public final /* synthetic */ i m37155a(C7213a c7213a) {
        while (true) {
            int a = c7213a.m33550a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f39952a = Long.valueOf(c7213a.m33570l());
                    continue;
                case 18:
                    int a2 = C7222l.m33624a(c7213a, 18);
                    a = this.f39953b == null ? 0 : this.f39953b.length;
                    Object obj = new bk[(a2 + a)];
                    if (a != 0) {
                        System.arraycopy(this.f39953b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new bk();
                        c7213a.m33552a(obj[a]);
                        c7213a.m33550a();
                        a++;
                    }
                    obj[a] = new bk();
                    c7213a.m33552a(obj[a]);
                    this.f39953b = obj;
                    continue;
                default:
                    if (!super.a(c7213a, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
