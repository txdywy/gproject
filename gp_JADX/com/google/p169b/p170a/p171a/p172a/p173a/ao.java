package com.google.p169b.p170a.p171a.p172a.p173a;

import com.google.common.p416c.C6970e;
import com.google.common.p416c.C6973h;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public abstract class ao {
    protected ao() {
    }

    public abstract List mo5814a();

    static ao m31397a(ByteBuffer byteBuffer, int i, am amVar) {
        List arrayList = new ArrayList();
        int i2 = byteBuffer.getInt(i);
        while (i2 != -1) {
            arrayList.add(new C6900f(byteBuffer.getInt(i), byteBuffer.getInt(i + 4), byteBuffer.getInt(i + 8), amVar));
            i += 12;
            i2 = byteBuffer.getInt(i);
        }
        return ao.m31399a(Collections.unmodifiableList(arrayList));
    }

    static ao m31398a(ByteBuffer byteBuffer, am amVar) {
        List arrayList = new ArrayList();
        int i = byteBuffer.getInt();
        while (i != -1) {
            arrayList.add(new C6900f(i, byteBuffer.getInt(), byteBuffer.getInt(), amVar));
            i = byteBuffer.getInt();
        }
        return ao.m31399a(Collections.unmodifiableList(arrayList));
    }

    static ao m31399a(List list) {
        return new C6901g(list);
    }

    public final byte[] m31401b() {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Closeable c6973h = new C6973h(byteArrayOutputStream);
        try {
            for (an anVar : mo5814a()) {
                ByteBuffer order = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
                order.putInt(anVar.mo5810a());
                order.putInt(anVar.mo5811b());
                order.putInt(anVar.mo5812c());
                byte[] array = order.array();
                if (array.length != 12) {
                    throw new IllegalStateException("Encountered a span of invalid length.");
                }
                c6973h.write(array);
            }
            c6973h.writeInt(-1);
            return byteArrayOutputStream.toByteArray();
        } finally {
            C6970e.m31821a(c6973h);
        }
    }

    public String toString() {
        return String.format(Locale.US, "StringPoolStyle{spans=%s}", new Object[]{mo5814a()});
    }
}
