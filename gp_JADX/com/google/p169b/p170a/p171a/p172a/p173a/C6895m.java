package com.google.p169b.p170a.p171a.p172a.p173a;

import java.io.DataOutput;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class C6895m extends C6894k {
    public final Map f34023e = new LinkedHashMap();

    protected C6895m(ByteBuffer byteBuffer, C6894k c6894k) {
        super(byteBuffer, c6894k);
    }

    protected void mo5748a(ByteBuffer byteBuffer) {
        super.mo5748a(byteBuffer);
        this.f34023e.clear();
        int i = this.d + this.f34020b;
        int i2 = this.d + this.f34021c;
        int position = byteBuffer.position();
        byteBuffer.position(i);
        while (i < i2) {
            C6894k d = mo5839d(byteBuffer);
            this.f34023e.put(Integer.valueOf(i), d);
            i += d.f34021c;
        }
        byteBuffer.position(position);
    }

    protected C6894k mo5839d(ByteBuffer byteBuffer) {
        C6894k amVar;
        switch (C6905l.m31540a(byteBuffer.getShort()).ordinal()) {
            case 1:
                amVar = new am(byteBuffer, this);
                break;
            case 2:
                amVar = new ai(byteBuffer, this);
                break;
            case 3:
                amVar = new aw(byteBuffer, this);
                break;
            case 4:
                amVar = new ba(byteBuffer, this);
                break;
            case 5:
                amVar = new az(byteBuffer, this);
                break;
            case 6:
                amVar = new bd(byteBuffer, this);
                break;
            case 7:
                amVar = new ax(byteBuffer, this);
                break;
            case 8:
                amVar = new av(byteBuffer, this);
                break;
            case 9:
                amVar = new bc(byteBuffer, this);
                break;
            case 10:
                amVar = new aa(byteBuffer, this);
                break;
            case 11:
                amVar = new ap(byteBuffer, this);
                break;
            case 12:
                amVar = new as(byteBuffer, this);
                break;
            case 13:
                amVar = new C6917y(byteBuffer, this);
                break;
            default:
                amVar = new at(byteBuffer, this);
                break;
        }
        amVar.mo5748a(byteBuffer);
        amVar.m31292b(byteBuffer);
        return amVar;
    }

    protected void mo5747a(DataOutput dataOutput, ByteBuffer byteBuffer, int i) {
        for (C6894k a : this.f34023e.values()) {
            byte[] a2 = a.m31290a(i);
            dataOutput.write(a2);
            C6894k.m31283a(dataOutput, a2.length);
        }
    }
}
