package com.google.p169b.p170a.p171a.p172a.p173a;

import android.support.v7.widget.eq;
import com.google.common.p416c.C6972g;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.Map;

public final class C6911s extends ai implements C6906n {
    public boolean f34238f = true;

    protected final short mo5836b() {
        if (this.f34238f) {
            return (short) (C6905l.TABLE.f34234o | eq.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        return C6905l.TABLE.f34234o;
    }

    protected C6911s(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
    }

    protected C6911s(C6972g c6972g, C6894k c6894k) {
        super(C6907o.m31543a(c6972g, 10), c6894k);
    }

    static void m31558a(C6972g c6972g, C6916x c6916x, C6894k c6894k, Map map) {
        int readInt = c6972g.readInt();
        for (int i = 0; i < readInt; i++) {
            map.put(Integer.valueOf(c6894k.f34022d + i), C6894k.m31284a(c6972g, c6894k, c6916x));
        }
    }

    protected final C6894k mo5839d(ByteBuffer byteBuffer) {
        return C6894k.m31285a(byteBuffer, (C6894k) this);
    }

    public final void mo5835a(boolean z) {
        this.f34238f = z;
        for (C6894k c6894k : this.f34023e.values()) {
            if (c6894k instanceof C6906n) {
                ((C6906n) c6894k).mo5835a(z);
            }
        }
    }

    protected final void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        if (this.f34238f) {
            C6907o.m31544a(dataOutput, this.f34023e.values(), i, true);
        } else {
            super.mo5747a(dataOutput, byteBuffer, i);
        }
    }
}
