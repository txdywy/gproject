package com.google.android.gms.internal;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class sj {
    public static final Logger f27464a = Logger.getLogger(sj.class.getName());

    static {
        try {
            ry.m25489a();
            sn.m25557a();
        } catch (GeneralSecurityException e) {
            String valueOf = String.valueOf(e);
            f27464a.logp(Level.SEVERE, "com.google.cloud.crypto.tink.hybrid.HybridEncryptFactory", "<clinit>", new StringBuilder(String.valueOf(valueOf).length() + 30).append("cannot register key managers: ").append(valueOf).toString());
        }
    }

    public static qm m25544a(qo qoVar) {
        rb rbVar = rb.f27387a;
        ri riVar = qoVar.f27368a;
        if (riVar.f27410c.size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        int i = riVar.f27409b;
        byte b = (byte) 0;
        for (rk rkVar : riVar.f27410c) {
            byte b2;
            if (rkVar.f27413a != null) {
                b2 = (byte) 1;
            } else {
                b2 = (byte) 0;
            }
            if (b2 == (byte) 0) {
                throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(rkVar.f27415c)}));
            } else if (rkVar.m25470d() == ru.UNKNOWN_PREFIX) {
                throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(rkVar.f27415c)}));
            } else if (rkVar.m25468b() == rs.UNKNOWN_STATUS) {
                throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(rkVar.f27415c)}));
            } else if (rkVar.f27415c <= 0) {
                throw new GeneralSecurityException(String.format("key has a non-positive key id: %d", new Object[]{Integer.valueOf(rkVar.f27415c)}));
            } else {
                byte b3;
                if (rkVar.m25468b() != rs.ENABLED || rkVar.f27415c != i) {
                    b3 = b;
                } else if (b != (byte) 0) {
                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                } else {
                    b3 = (byte) 1;
                }
                b = b3;
            }
        }
        if (b == (byte) 0) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        qz qzVar = new qz();
        for (rk rkVar2 : qoVar.f27368a.f27410c) {
            if (rkVar2.m25468b() == rs.ENABLED) {
                byte[] array;
                Object a = rbVar.m25443a(rkVar2.m25465a().f27391a, rkVar2.m25465a().f27392b);
                switch (pt.f27331a[rkVar2.m25470d().ordinal()]) {
                    case 1:
                        array = ByteBuffer.allocate(5).put((byte) 0).putInt(rkVar2.f27415c).array();
                        break;
                    case 2:
                        array = ByteBuffer.allocate(5).put((byte) 1).putInt(rkVar2.f27415c).array();
                        break;
                    case 3:
                        array = ps.f27330a;
                        break;
                    default:
                        throw new GeneralSecurityException("unknown output prefix type");
                }
                rkVar2.m25468b();
                ra raVar = new ra(a, array);
                List arrayList = new ArrayList();
                arrayList.add(raVar);
                String str = new String(raVar.f27386b, qz.f27381a);
                arrayList = (List) qzVar.f27382b.put(str, Collections.unmodifiableList(arrayList));
                if (arrayList != null) {
                    List arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList);
                    arrayList2.add(raVar);
                    qzVar.f27382b.put(str, Collections.unmodifiableList(arrayList2));
                }
                if (rkVar2.f27415c == qoVar.f27368a.f27409b) {
                    qzVar.f27383c = raVar;
                }
            }
        }
        return new sk(qzVar);
    }

    public static void m25545a() {
        rb.f27387a.m25444a("type.googleapis.com/google.cloud.crypto.tink.EciesAeadHkdfPublicKey", new si());
    }
}
