package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p414a.C6937m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class aj {
    public abstract int mo5803a();

    public abstract al mo5804b();

    public abstract int mo5805c();

    public static aj m31372a(ByteBuffer byteBuffer) {
        int i = 65535 & byteBuffer.getShort();
        byteBuffer.get();
        int i2 = byteBuffer.get();
        al alVar = (al) C6937m.m31625a((al) al.f34099r.get(Byte.valueOf(i2)), "Unknown resource type: %s", i2);
        return new C6899e().mo5807a(i).mo5808a(alVar).mo5809b(byteBuffer.getInt()).mo5806a();
    }

    public final byte[] m31377d() {
        ByteBuffer order = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        order.putShort((short) mo5803a());
        order.put((byte) 0);
        order.put(mo5804b().f34101q);
        order.putInt(mo5805c());
        return order.array();
    }

    private final String m31373e() {
        return String.format("0x%08x", new Object[]{Integer.valueOf(mo5805c())});
    }

    public String toString() {
        String e;
        switch (mo5804b().ordinal()) {
            case 0:
                return mo5805c() == 0 ? "null" : "empty";
            case 1:
                e = m31373e();
                return new StringBuilder(String.valueOf(e).length() + 5).append("ref(").append(e).append(")").toString();
            case 2:
                e = m31373e();
                return new StringBuilder(String.valueOf(e).length() + 6).append("attr(").append(e).append(")").toString();
            case 3:
                e = m31373e();
                return new StringBuilder(String.valueOf(e).length() + 8).append("string(").append(e).append(")").toString();
            case 4:
                return "float(" + mo5805c() + ")";
            case 5:
                return "dimen(" + mo5805c() + ")";
            case 6:
                return "frac(" + mo5805c() + ")";
            case 7:
                e = m31373e();
                return new StringBuilder(String.valueOf(e).length() + 8).append("dynref(").append(e).append(")").toString();
            case 8:
                e = m31373e();
                return new StringBuilder(String.valueOf(e).length() + 9).append("dynattr(").append(e).append(")").toString();
            case 9:
                return "dec(" + mo5805c() + ")";
            case 10:
                e = m31373e();
                return new StringBuilder(String.valueOf(e).length() + 5).append("hex(").append(e).append(")").toString();
            case 11:
                return "bool(" + mo5805c() + ")";
            case 12:
                e = m31373e();
                return new StringBuilder(String.valueOf(e).length() + 7).append("argb8(").append(e).append(")").toString();
            case 13:
                e = m31373e();
                return new StringBuilder(String.valueOf(e).length() + 6).append("rgb8(").append(e).append(")").toString();
            case 14:
                e = m31373e();
                return new StringBuilder(String.valueOf(e).length() + 7).append("argb4(").append(e).append(")").toString();
            case 15:
                e = m31373e();
                return new StringBuilder(String.valueOf(e).length() + 6).append("rgb4(").append(e).append(")").toString();
            default:
                return "<invalid value>";
        }
    }
}
