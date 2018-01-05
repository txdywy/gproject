package com.google.p169b.p170a.p171a.p172a.p173a;

import android.support.v7.widget.eq;
import com.google.common.p414a.C6937m;
import com.google.common.p416c.C6972g;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.Map;

public final class C6910r extends aa implements C6906n {
    public boolean f34235f = true;
    public byte[] f34236g;
    public byte[] f34237h;

    protected C6910r(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
    }

    protected C6910r(C6972g c6972g, C6894k c6894k) {
        super(C6907o.m31543a(c6972g, 286), c6894k);
    }

    public final am mo5837c() {
        if (this.f34236g == null) {
            return super.mo5837c();
        }
        throw new RuntimeException("Compressed packagechunks in extraction mode do not support access to the Type and Key string pools.");
    }

    public final am mo5838d() {
        if (this.f34237h == null) {
            return super.mo5838d();
        }
        throw new RuntimeException("Compressed packagechunks in extraction mode do not support access to the Type and Key string pools.");
    }

    protected final short mo5836b() {
        if (this.f34235f) {
            return (short) (C6905l.TABLE_PACKAGE.f34234o | eq.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        return C6905l.TABLE_PACKAGE.f34234o;
    }

    public final void m31551a(C6972g c6972g, C6916x c6916x) {
        int i = 0;
        int readInt = c6972g.readInt();
        this.f34236g = C6907o.m31546a(c6972g, false);
        readInt--;
        this.f34237h = C6907o.m31546a(c6972g, false);
        readInt--;
        if (c6916x == null) {
            while (i < readInt) {
                this.e.put(Integer.valueOf((this.d + this.b) + i), C6894k.m31284a(c6972g, (C6894k) this, c6916x));
                i++;
            }
            return;
        }
        int i2 = 0;
        for (Integer intValue : c6916x.f34247c) {
            boolean z;
            int intValue2 = intValue.intValue();
            if (intValue2 >= i2) {
                z = true;
            } else {
                z = false;
            }
            C6937m.m31635b(z);
            readInt = intValue2 - i2;
            while (readInt > 0) {
                readInt -= c6972g.skipBytes(readInt);
            }
            C6894k a = C6894k.m31284a(c6972g, (C6894k) this, c6916x);
            this.e.put(Integer.valueOf((this.d + this.b) + intValue2), a);
            i2 = a.f34021c + intValue2;
        }
    }

    protected final C6894k mo5839d(ByteBuffer byteBuffer) {
        return C6894k.m31285a(byteBuffer, (C6894k) this);
    }

    protected final void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        if (this.f34236g == null || this.f34237h == null) {
            boolean z = this.f34236g == null && this.f34237h == null;
            C6937m.m31635b(z);
            C6894k d = mo5838d();
            C6894k c = mo5837c();
            C6937m.m31635b(d instanceof C6906n);
            C6937m.m31635b(c instanceof C6906n);
            ((C6912t) d).f34239e = false;
            ((C6912t) c).f34239e = false;
            Map a = C6907o.m31544a(dataOutput, this.f34023e.values(), i, this.f34235f);
            for (C6894k c6894k : this.e.values()) {
                if (c6894k == d) {
                    byteBuffer.putInt(276, ((Integer) C6937m.m31623a((Integer) a.get(c6894k))).intValue());
                } else if (c6894k == c) {
                    byteBuffer.putInt(268, ((Integer) C6937m.m31623a((Integer) a.get(c6894k))).intValue());
                }
            }
            return;
        }
        dataOutput.write(this.f34236g);
        byteBuffer.putInt(268, this.f34020b);
        dataOutput.write(this.f34237h);
        byteBuffer.putInt(276, this.f34020b + this.f34236g.length);
        C6907o.m31544a(dataOutput, this.f34023e.values(), i, this.f34235f);
    }

    public final void mo5835a(boolean z) {
        this.f34235f = z;
        for (C6894k c6894k : this.f34023e.values()) {
            if (c6894k instanceof C6906n) {
                ((C6906n) c6894k).mo5835a(z);
            }
        }
    }
}
