package com.google.android.finsky.cs.p135a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.cs.C2409f;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;
import com.google.android.play.p179a.p352a.C6201l;
import com.google.protobuf.nano.C0757i;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class C2401i {
    public final Context f11701a;

    public C2401i(Context context) {
        this.f11701a = context;
    }

    final C2409f m12099a(String str) {
        Closeable dataInputStream;
        Closeable closeable;
        IOException iOException;
        Throwable th;
        C2409f c2409f = null;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(this.f11701a.getFilesDir(), str))));
            try {
                FinskyLog.m21659a("Started reading experiment flags from file %s.", FinskyLog.m21655a(str));
                switch (dataInputStream.readByte()) {
                    case (byte) 1:
                        c2409f = C2401i.m12096a(dataInputStream, str);
                        C4679j.m21814a(dataInputStream);
                        break;
                    default:
                        throw new IOException("Unrecognized file version.");
                }
            } catch (FileNotFoundException e) {
                C4679j.m21814a(dataInputStream);
                return c2409f;
            } catch (IOException e2) {
                IOException iOException2 = e2;
                closeable = dataInputStream;
                iOException = iOException2;
                try {
                    FinskyLog.m21667d("Error reading Phenotype flags from file %s: %s", FinskyLog.m21655a(str), iOException);
                    C4679j.m21814a(closeable);
                    return c2409f;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = closeable;
                    C4679j.m21814a(dataInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                C4679j.m21814a(dataInputStream);
                throw th;
            }
        } catch (FileNotFoundException e3) {
            Object obj = c2409f;
            C4679j.m21814a(dataInputStream);
            return c2409f;
        } catch (IOException e4) {
            iOException = e4;
            closeable = c2409f;
            FinskyLog.m21667d("Error reading Phenotype flags from file %s: %s", FinskyLog.m21655a(str), iOException);
            C4679j.m21814a(closeable);
            return c2409f;
        } catch (Throwable th4) {
            Throwable th5 = th4;
            dataInputStream = c2409f;
            th = th5;
            C4679j.m21814a(dataInputStream);
            throw th;
        }
        return c2409f;
    }

    private static C2409f m12096a(DataInputStream dataInputStream, String str) {
        Map hashMap = new HashMap();
        String readUTF = dataInputStream.readUTF();
        String readUTF2 = dataInputStream.readUTF();
        C0757i c6201l = new C6201l();
        ab.m21686a(dataInputStream.readUTF(), c6201l);
        int i = 0;
        while (i == 0) {
            switch (dataInputStream.readByte()) {
                case (byte) 0:
                    i = 1;
                    break;
                case (byte) 1:
                    hashMap.put(dataInputStream.readUTF(), Long.valueOf((long) dataInputStream.readByte()));
                    break;
                case (byte) 2:
                    hashMap.put(dataInputStream.readUTF(), Long.valueOf((long) dataInputStream.readShort()));
                    break;
                case (byte) 3:
                    hashMap.put(dataInputStream.readUTF(), Long.valueOf((long) dataInputStream.readInt()));
                    break;
                case (byte) 4:
                    hashMap.put(dataInputStream.readUTF(), Long.valueOf(dataInputStream.readLong()));
                    break;
                case (byte) 5:
                    hashMap.put(dataInputStream.readUTF(), dataInputStream.readUTF());
                    break;
                case (byte) 6:
                    String readUTF3 = dataInputStream.readUTF();
                    Object obj = new byte[dataInputStream.readInt()];
                    dataInputStream.readFully(obj);
                    hashMap.put(readUTF3, obj);
                    break;
                case (byte) 7:
                    hashMap.put(dataInputStream.readUTF(), Double.valueOf(dataInputStream.readDouble()));
                    break;
                case (byte) 8:
                    hashMap.put(dataInputStream.readUTF(), Boolean.valueOf(dataInputStream.readBoolean()));
                    break;
                default:
                    throw new IOException("Unrecognized flag type");
            }
        }
        FinskyLog.m21659a("Finished reading experiment flags from file %s.", FinskyLog.m21655a(str));
        return new C2409f(hashMap, c6201l, readUTF, readUTF2);
    }

    public static C2409f m12095a(C2374e c2374e, C6201l c6201l, File file, String str) {
        File file2 = new File(file, str);
        String valueOf = String.valueOf("temp-");
        String valueOf2 = String.valueOf(str);
        File file3 = new File(file, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        C2409f a = C2401i.m12094a(c2374e, c6201l, file3);
        if (a == null || !file3.renameTo(file2)) {
            return null;
        }
        return a;
    }

    private static C2409f m12094a(C2374e c2374e, C6201l c6201l, File file) {
        IOException e;
        Closeable closeable;
        Throwable th;
        Map hashMap = new HashMap();
        String name = file.getName();
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            FinskyLog.m21659a("Started writing experiment flags into file %s.", FinskyLog.m21655a(name));
            dataOutputStream.writeByte(1);
            dataOutputStream.writeUTF(c2374e.mo2873b());
            dataOutputStream.writeUTF(c2374e.mo2872a());
            dataOutputStream.writeUTF(ab.m21685a(c6201l));
            for (C2372d a : c2374e.mo2874c()) {
                for (C2384l c2384l : a.mo2871a()) {
                    switch (c2384l.mo2895g()) {
                        case 2:
                            long b = c2384l.mo2890b();
                            if (b >= -128 && b <= 127) {
                                byte b2 = (byte) ((int) b);
                                C2401i.m12097a(dataOutputStream, (byte) 1, c2384l.mo2889a());
                                dataOutputStream.writeByte(b2);
                            } else if (b < -32768 || b > 32767) {
                                if (b >= -2147483648L && b <= 2147483647L) {
                                    int i = (int) b;
                                    try {
                                        C2401i.m12097a(dataOutputStream, (byte) 3, c2384l.mo2889a());
                                        dataOutputStream.writeInt(i);
                                    } catch (IOException e2) {
                                        e = e2;
                                        break;
                                    }
                                }
                                C2401i.m12097a(dataOutputStream, (byte) 4, c2384l.mo2889a());
                                dataOutputStream.writeLong(b);
                            } else {
                                short s = (short) ((int) b);
                                C2401i.m12097a(dataOutputStream, (byte) 2, c2384l.mo2889a());
                                dataOutputStream.writeShort(s);
                            }
                            hashMap.put(c2384l.mo2889a(), Long.valueOf(b));
                            break;
                        case 3:
                            boolean c = c2384l.mo2891c();
                            hashMap.put(c2384l.mo2889a(), Boolean.valueOf(c));
                            C2401i.m12097a(dataOutputStream, (byte) 8, c2384l.mo2889a());
                            dataOutputStream.writeBoolean(c);
                            break;
                        case 4:
                            double d = c2384l.mo2892d();
                            hashMap.put(c2384l.mo2889a(), Double.valueOf(d));
                            C2401i.m12097a(dataOutputStream, (byte) 7, c2384l.mo2889a());
                            dataOutputStream.writeDouble(d);
                            break;
                        case 5:
                            String e3 = c2384l.mo2893e();
                            hashMap.put(c2384l.mo2889a(), e3);
                            C2401i.m12097a(dataOutputStream, (byte) 5, c2384l.mo2889a());
                            dataOutputStream.writeUTF(e3);
                            break;
                        case 6:
                            Object f = c2384l.mo2894f();
                            hashMap.put(c2384l.mo2889a(), f);
                            C2401i.m12097a(dataOutputStream, (byte) 6, c2384l.mo2889a());
                            dataOutputStream.writeInt(f.length);
                            dataOutputStream.write(f, 0, f.length);
                            break;
                        default:
                            throw new IllegalStateException("Unsupported experiment flag type: " + c2384l.mo2895g());
                    }
                }
            }
            dataOutputStream.writeByte(0);
            FinskyLog.m21659a("Finished writing experiment flags into file %s.", FinskyLog.m21655a(name));
            C2409f c2409f = new C2409f(hashMap, c6201l, c2374e.mo2873b(), c2374e.mo2872a());
            C4679j.m21814a(dataOutputStream);
            return c2409f;
        } catch (IOException e4) {
            e = e4;
            closeable = null;
            try {
                FinskyLog.m21667d("Error writing experiment flags to file %s: %s.", FinskyLog.m21655a(name), e);
                C4679j.m21814a(closeable);
                return null;
            } catch (Throwable th2) {
                th = th2;
                C4679j.m21814a(closeable);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable = null;
            C4679j.m21814a(closeable);
            throw th;
        }
    }

    static String m12098b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "experiment-flags-regular-null-account";
        }
        String valueOf = String.valueOf("experiment-flags-regular-");
        String valueOf2 = String.valueOf(Uri.encode(str));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    private static void m12097a(DataOutputStream dataOutputStream, byte b, String str) {
        dataOutputStream.writeByte(b);
        dataOutputStream.writeUTF(str);
    }
}
