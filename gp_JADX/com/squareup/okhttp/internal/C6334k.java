package com.squareup.okhttp.internal;

import com.squareup.okhttp.x;
import e.aa;
import e.j;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class C6334k {
    public static final byte[] f31817a = new byte[0];
    public static final String[] f31818b = new String[0];
    public static final Charset f31819c = Charset.forName("UTF-8");

    public static void m29032a(long j, long j2) {
        if ((0 | j2) < 0 || 0 > j || j - 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean m29036a(e.aa r12, int r13, java.util.concurrent.TimeUnit r14) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0068 in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r6 = java.lang.System.nanoTime();
        r0 = r12.a();
        r0 = r0.cY_();
        if (r0 == 0) goto L_0x0050;
    L_0x0013:
        r0 = r12.a();
        r0 = r0.c();
        r0 = r0 - r6;
    L_0x001c:
        r4 = r12.a();
        r8 = (long) r13;
        r8 = r14.toNanos(r8);
        r8 = java.lang.Math.min(r0, r8);
        r8 = r8 + r6;
        r4.a(r8);
        r4 = new e.f;	 Catch:{ InterruptedIOException -> 0x0042, all -> 0x0071 }
        r4.<init>();	 Catch:{ InterruptedIOException -> 0x0042, all -> 0x0071 }
    L_0x0032:
        r8 = 2048; // 0x800 float:2.87E-42 double:1.0118E-320;	 Catch:{ InterruptedIOException -> 0x0042, all -> 0x0071 }
        r8 = r12.a(r4, r8);	 Catch:{ InterruptedIOException -> 0x0042, all -> 0x0071 }
        r10 = -1;	 Catch:{ InterruptedIOException -> 0x0042, all -> 0x0071 }
        r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));	 Catch:{ InterruptedIOException -> 0x0042, all -> 0x0071 }
        if (r5 == 0) goto L_0x0052;	 Catch:{ InterruptedIOException -> 0x0042, all -> 0x0071 }
    L_0x003e:
        r4.p();	 Catch:{ InterruptedIOException -> 0x0042, all -> 0x0071 }
        goto L_0x0032;
    L_0x0042:
        r4 = move-exception;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x0068;
    L_0x0047:
        r0 = r12.a();
        r0.e();
    L_0x004e:
        r0 = 0;
    L_0x004f:
        return r0;
    L_0x0050:
        r0 = r2;
        goto L_0x001c;
    L_0x0052:
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x005f;
    L_0x0056:
        r0 = r12.a();
        r0.e();
    L_0x005d:
        r0 = 1;
        goto L_0x004f;
    L_0x005f:
        r2 = r12.a();
        r0 = r0 + r6;
        r2.a(r0);
        goto L_0x005d;
    L_0x0068:
        r2 = r12.a();
        r0 = r0 + r6;
        r2.a(r0);
        goto L_0x004e;
    L_0x0071:
        r4 = move-exception;
        r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x007e;
    L_0x0076:
        r0 = r12.a();
        r0.e();
    L_0x007d:
        throw r4;
    L_0x007e:
        r2 = r12.a();
        r0 = r0 + r6;
        r2.a(r0);
        goto L_0x007d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.k.a(e.aa, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static boolean m29039a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void m29033a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
            }
        }
    }

    public static void m29035a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!C6334k.m29038a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
            }
        }
    }

    public static void m29034a(Closeable closeable, Closeable closeable2) {
        Object obj = null;
        try {
            closeable.close();
        } catch (Throwable th) {
            obj = th;
        }
        try {
            closeable2.close();
        } catch (Throwable th2) {
            if (obj == null) {
                Throwable th3 = th2;
            }
        }
        if (obj != null) {
            if (obj instanceof IOException) {
                throw ((IOException) obj);
            } else if (obj instanceof RuntimeException) {
                throw ((RuntimeException) obj);
            } else if (obj instanceof Error) {
                throw ((Error) obj);
            } else {
                throw new AssertionError(obj);
            }
        }
    }

    public static boolean m29037a(aa aaVar, TimeUnit timeUnit) {
        try {
            return C6334k.m29036a(aaVar, 100, timeUnit);
        } catch (IOException e) {
            return false;
        }
    }

    public static j m29026a(j jVar) {
        try {
            return j.a(MessageDigest.getInstance("SHA-1").digest(jVar.f()));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static List m29028a(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static List m29029a(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static Map m29030a(Map map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static ThreadFactory m29031a(String str) {
        return new l(str);
    }

    public static Object[] m29041a(Class cls, Object[] objArr, Object[] objArr2) {
        List arrayList = new ArrayList();
        for (Object obj : objArr) {
            for (Object obj2 : objArr2) {
                if (obj.equals(obj2)) {
                    arrayList.add(obj2);
                    break;
                }
            }
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, arrayList.size()));
    }

    public static String m29027a(x xVar) {
        if (xVar.f != x.a(xVar.b)) {
            return xVar.e + ":" + xVar.f;
        }
        return xVar.e;
    }

    public static boolean m29038a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean m29040a(String[] strArr, String str) {
        return Arrays.asList(strArr).contains(str);
    }

    public static String[] m29042b(String[] strArr, String str) {
        Object obj = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, obj, 0, strArr.length);
        obj[obj.length - 1] = str;
        return obj;
    }
}
