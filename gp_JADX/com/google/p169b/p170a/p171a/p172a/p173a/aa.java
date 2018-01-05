package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p414a.C6925j;
import com.google.common.p414a.C6926a;
import com.google.common.p414a.C6937m;
import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class aa extends C6895m {
    public int f34024i;
    public String f34025j;
    public final int f34026k;
    public final int f34027l;
    public final int f34028m;
    public final int f34029n;
    public final int f34030o;
    public final Map f34031p = new HashMap();
    public final Map f34032q = new HashMap();
    public C6925j f34033r = C6926a.f34255a;

    protected aa(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
        this.f34024i = byteBuffer.getInt();
        this.f34025j = ab.m31303a(byteBuffer, byteBuffer.position());
        this.f34026k = byteBuffer.getInt();
        this.f34027l = byteBuffer.getInt();
        this.f34028m = byteBuffer.getInt();
        this.f34029n = byteBuffer.getInt();
        this.f34030o = byteBuffer.getInt();
    }

    protected final void mo5748a(ByteBuffer byteBuffer) {
        super.mo5748a(byteBuffer);
        for (C6894k c6894k : this.f34023e.values()) {
            if (c6894k instanceof ap) {
                ap apVar = (ap) c6894k;
                Set set = (Set) this.f34032q.get(Integer.valueOf(apVar.f34110f));
                if (set == null) {
                    set = new HashSet();
                    this.f34032q.put(Integer.valueOf(apVar.f34110f), set);
                }
                set.add(apVar);
            } else if (c6894k instanceof as) {
                as asVar = (as) c6894k;
                this.f34031p.put(Integer.valueOf(asVar.f34116e), asVar);
            } else if (c6894k instanceof C6917y) {
                if (this.f34033r.mo5846a()) {
                    throw new IllegalStateException("Multiple library chunks present in package chunk.");
                }
                this.f34033r = C6925j.m31605b((C6917y) c6894k);
            } else if (!(c6894k instanceof am)) {
                throw new IllegalStateException(String.format("PackageChunk contains an unexpected chunk: %s", new Object[]{c6894k.getClass()}));
            }
        }
    }

    public am mo5838d() {
        C6894k c6894k = (C6894k) C6937m.m31623a((C6894k) this.f34023e.get(Integer.valueOf(this.f34028m + this.d)));
        C6937m.m31631a(c6894k instanceof am, (Object) "Key string pool not found.");
        return (am) c6894k;
    }

    public am mo5837c() {
        C6894k c6894k = (C6894k) C6937m.m31623a((C6894k) this.f34023e.get(Integer.valueOf(this.f34026k + this.d)));
        C6937m.m31631a(c6894k instanceof am, (Object) "Type string pool not found.");
        return (am) c6894k;
    }

    protected final C6905l mo5749a() {
        return C6905l.TABLE_PACKAGE;
    }

    protected final void mo5750c(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.f34024i);
        ab.m31304a(byteBuffer, this.f34025j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(this.f34027l);
        byteBuffer.putInt(0);
        byteBuffer.putInt(this.f34029n);
        byteBuffer.putInt(this.f34030o);
    }

    protected void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        int i2 = this.f34026k;
        int i3 = this.f34028m;
        int i4 = i2;
        i2 = i3;
        i3 = 0;
        for (C6894k c6894k : this.f34023e.values()) {
            if (c6894k == mo5837c()) {
                i4 = this.f34020b + i3;
                i3 = i2;
                i2 = i4;
            } else if (c6894k == mo5838d()) {
                i3 = this.f34020b + i3;
                i2 = i4;
            } else {
                i3 = i2;
                i2 = i4;
            }
            byte[] a = c6894k.m31290a(i);
            dataOutput.write(a);
            i4 = i2;
            i2 = i3;
            i3 = C6894k.m31283a(dataOutput, a.length);
        }
        byteBuffer.putInt(268, i4);
        byteBuffer.putInt(276, i2);
    }
}
