package com.google.archivepatcher.applier;

import com.google.archivepatcher.applier.p407a.C6881a;
import com.google.archivepatcher.p406a.C6871g;
import com.google.archivepatcher.p406a.C6872h;
import com.google.archivepatcher.p406a.C6875k;
import com.google.archivepatcher.p406a.C6876l;
import com.google.archivepatcher.p406a.C6878n;
import com.google.archivepatcher.p406a.C6879o;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class C6885c implements C6880a {
    public final File f33996a;

    public C6885c() {
        this(null);
    }

    public C6885c(File file) {
        if (file == null) {
            file = new File(System.getProperty("java.io.tmpdir"));
        }
        this.f33996a = file;
    }

    public final void mo5744a(File file, InputStream inputStream, OutputStream outputStream) {
        Throwable th;
        if (!this.f33996a.exists()) {
            this.f33996a.mkdirs();
        }
        File createTempFile = File.createTempFile("gfbfv1", "old", this.f33996a);
        try {
            C6889g c6889g = new C6889g();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            byte[] bytes = "GFbFv1_0".getBytes("US-ASCII");
            byte[] bArr = new byte[bytes.length];
            dataInputStream.readFully(bArr);
            if (Arrays.equals(bytes, bArr)) {
                long a;
                long a2;
                long a3;
                dataInputStream.skip(4);
                long a4 = C6889g.m31264a(dataInputStream.readLong(), "delta-friendly old file size");
                int a5 = (int) C6889g.m31264a((long) dataInputStream.readInt(), "old file uncompression instruction count");
                List arrayList = new ArrayList(a5);
                int i = 0;
                long j = -1;
                while (i < a5) {
                    a = C6889g.m31264a(dataInputStream.readLong(), "old file uncompression range offset");
                    a2 = C6889g.m31264a(dataInputStream.readLong(), "old file uncompression range length");
                    if (a < j) {
                        throw new PatchFormatException("old file uncompression ranges out of order or overlapping");
                    }
                    arrayList.add(new C6879o(a, a2, null));
                    i++;
                    j = a + a2;
                }
                int readInt = dataInputStream.readInt();
                C6889g.m31264a((long) readInt, "delta-friendly new file recompression instruction count");
                List arrayList2 = new ArrayList(readInt);
                int i2 = 0;
                long j2 = -1;
                while (i2 < readInt) {
                    long a6 = C6889g.m31264a(dataInputStream.readLong(), "delta-friendly new file recompression range offset");
                    a3 = C6889g.m31264a(dataInputStream.readLong(), "delta-friendly new file recompression range length");
                    if (a6 < j2) {
                        throw new PatchFormatException("delta-friendly new file recompression ranges out of order or overlapping");
                    }
                    long j3 = a6 + a3;
                    C6889g.m31263a((long) dataInputStream.readByte(), (long) C6875k.f33977a.f33979b, (long) C6875k.f33977a.f33979b, "compatibility window id");
                    arrayList2.add(new C6879o(a6, a3, C6872h.m31243a((int) C6889g.m31263a((long) dataInputStream.readUnsignedByte(), 1, 9, "recompression level"), (int) C6889g.m31263a((long) dataInputStream.readUnsignedByte(), 0, 2, "recompression strategy"), ((int) C6889g.m31263a((long) dataInputStream.readUnsignedByte(), 0, 1, "recompression nowrap")) != 0)));
                    i2++;
                    j2 = j3;
                }
                int a7 = (int) C6889g.m31263a((long) dataInputStream.readInt(), 1, 1, "num delta records");
                arrayList2 = new ArrayList(a7);
                for (readInt = 0; readInt < a7; readInt++) {
                    byte a8 = (byte) ((int) C6889g.m31263a((long) dataInputStream.readByte(), (long) C6876l.f33980a.f33982b, (long) C6876l.f33980a.f33982b, "delta format"));
                    a = C6889g.m31264a(dataInputStream.readLong(), "delta-friendly old file work range offset");
                    a2 = C6889g.m31264a(dataInputStream.readLong(), "delta-friendly old file work range length");
                    a3 = C6889g.m31264a(dataInputStream.readLong(), "delta-friendly new file work range offset");
                    long a9 = C6889g.m31264a(dataInputStream.readLong(), "delta-friendly new file work range length");
                    arrayList2.add(new C6884b(C6876l.m31245a(a8), new C6879o(a, a2, null), new C6879o(a3, a9, null), C6889g.m31264a(dataInputStream.readLong(), "delta length")));
                }
                C6888f c6888f = new C6888f(Collections.unmodifiableList(arrayList), a4, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList2));
                C6878n c6878n;
                try {
                    c6878n = new C6878n(createTempFile, c6888f.f34010c);
                    try {
                        C6871g.m31242a(c6888f.f34008a, file, c6878n);
                        try {
                            c6878n.close();
                        } catch (Exception e) {
                        }
                        a = ((C6884b) c6888f.f34011d.get(0)).f33995d;
                        C6880a c6881a = new C6881a();
                        InputStream c6886d = new C6886d(inputStream, a);
                        OutputStream c6887e = new C6887e(c6888f.f34009b, outputStream);
                        c6881a.mo5744a(createTempFile, c6886d, c6887e);
                        c6887e.flush();
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            c6878n.close();
                        } catch (Exception e2) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c6878n = null;
                    c6878n.close();
                    throw th;
                }
            } else {
                throw new PatchFormatException("Bad identifier");
            }
        } finally {
            createTempFile.delete();
        }
    }
}
