package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.p239b.C4892a;
import com.google.android.gms.ads.p270c.C4909c;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.p284d.C5160a;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class jp {
    public static final String f27071a = jp.class.getSimpleName();
    public Context f27072b;
    public Context f27073c;
    public ExecutorService f27074d;
    public DexClassLoader f27075e;
    public jm f27076f;
    public byte[] f27077g;
    public volatile C4892a f27078h = null;
    public volatile boolean f27079i = false;
    public Future f27080j = null;
    public volatile ci f27081k = null;
    public Future f27082l = null;
    public fz f27083m;
    public boolean f27084n = false;
    public boolean f27085o = false;
    public Map f27086p;
    public boolean f27087q = false;

    static {
        Object obj = new Object();
    }

    private jp(Context context) {
        this.f27072b = context;
        this.f27073c = context.getApplicationContext();
        this.f27086p = new HashMap();
    }

    public static jp m24968a(Context context, String str, String str2, boolean z) {
        boolean z2 = true;
        jp jpVar = new jp(context);
        try {
            File file;
            jpVar.f27074d = Executors.newCachedThreadPool();
            jpVar.f27079i = z;
            if (z) {
                jpVar.f27080j = jpVar.f27074d.submit(new jq(jpVar));
            }
            jpVar.f27074d.execute(new js(jpVar));
            try {
                boolean z3;
                if (C5095d.m23664d(jpVar.f27072b) > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jpVar.f27084n = z3;
                if (C5095d.m23655a(jpVar.f27072b) != 0) {
                    z2 = false;
                }
                jpVar.f27085o = z2;
            } catch (Throwable th) {
            }
            jpVar.m24978a(0, true);
            if (ju.m24989b()) {
                if (((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27763s)).booleanValue()) {
                    throw new IllegalStateException("Task Context initialization must not be called from the UI thread.");
                }
            }
            jpVar.f27076f = new jm();
            jpVar.f27077g = jm.m24961a(str);
            File cacheDir = jpVar.f27072b.getCacheDir();
            if (cacheDir == null) {
                cacheDir = jpVar.f27072b.getDir("dex", 0);
                if (cacheDir == null) {
                    throw new zzcz();
                }
            }
            File file2 = cacheDir;
            String str3 = "1493867303508";
            file = new File(String.format("%s/%s.jar", new Object[]{file2, str3}));
            if (!file.exists()) {
                byte[] a = jm.m24962a(jpVar.f27077g, str2);
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(a, 0, a.length);
                fileOutputStream.close();
            }
            jpVar.m24974b(file2, str3);
            jpVar.f27075e = new DexClassLoader(file.getAbsolutePath(), file2.getAbsolutePath(), null, jpVar.f27072b.getClassLoader());
            m24970a(file);
            jpVar.m24971a(file2, str3);
            m24972a(String.format("%s/%s.dex", new Object[]{file2, str3}));
            jpVar.f27083m = new fz(jpVar);
            jpVar.f27087q = true;
        } catch (Throwable e) {
            throw new zzcz(e);
        } catch (Throwable e2) {
            throw new zzcz(e2);
        } catch (Throwable e22) {
            throw new zzcz(e22);
        } catch (Throwable e222) {
            throw new zzcz(e222);
        } catch (Throwable e2222) {
            throw new zzcz(e2222);
        } catch (zzcz e3) {
        } catch (Throwable th2) {
            m24970a(file);
            jpVar.m24971a(file2, str3);
            m24972a(String.format("%s/%s.dex", new Object[]{file2, str3}));
        }
        return jpVar;
    }

    private static void m24970a(File file) {
        if (file.exists()) {
            file.delete();
            return;
        }
        Log.d(f27071a, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
    }

    private final void m24971a(File file, String str) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
            if (file3.exists()) {
                long length = file3.length();
                if (length > 0) {
                    byte[] bArr = new byte[((int) length)];
                    FileInputStream fileInputStream2;
                    try {
                        fileInputStream2 = new FileInputStream(file3);
                        try {
                            if (fileInputStream2.read(bArr) <= 0) {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e) {
                                }
                                m24970a(file3);
                                return;
                            }
                            wz cnVar = new cn();
                            cnVar.f26642d = VERSION.SDK.getBytes();
                            cnVar.f26641c = str.getBytes();
                            bArr = jm.m24959a(this.f27077g, bArr).getBytes();
                            cnVar.f26639a = bArr;
                            cnVar.f26640b = ed.m24323a(bArr);
                            file2.createNewFile();
                            fileOutputStream = new FileOutputStream(file2);
                            try {
                                byte[] a = wz.m24212a(cnVar);
                                fileOutputStream.write(a, 0, a.length);
                                fileOutputStream.close();
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e2) {
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e3) {
                                }
                                m24970a(file3);
                            } catch (IOException e4) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e5) {
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e6) {
                                    }
                                }
                                m24970a(file3);
                            } catch (NoSuchAlgorithmException e7) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                m24970a(file3);
                            } catch (zzcy e8) {
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                m24970a(file3);
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                fileOutputStream2 = fileOutputStream;
                                th = th3;
                                if (fileInputStream2 != null) {
                                    try {
                                        fileInputStream2.close();
                                    } catch (IOException e9) {
                                    }
                                }
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e10) {
                                    }
                                }
                                m24970a(file3);
                                throw th;
                            }
                        } catch (IOException e11) {
                            fileOutputStream = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            m24970a(file3);
                        } catch (NoSuchAlgorithmException e12) {
                            fileOutputStream = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            m24970a(file3);
                        } catch (zzcy e13) {
                            fileOutputStream = null;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            m24970a(file3);
                        } catch (Throwable th4) {
                            th = th4;
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            m24970a(file3);
                            throw th;
                        }
                    } catch (IOException e14) {
                        fileOutputStream = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        m24970a(file3);
                    } catch (NoSuchAlgorithmException e15) {
                        fileOutputStream = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        m24970a(file3);
                    } catch (zzcy e16) {
                        fileOutputStream = null;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        m24970a(file3);
                    } catch (Throwable th5) {
                        th = th5;
                        fileInputStream2 = null;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        m24970a(file3);
                        throw th;
                    }
                }
            }
        }
    }

    private static void m24972a(String str) {
        m24970a(new File(str));
    }

    public final C4892a m24976a() {
        if (!this.f27079i) {
            return null;
        }
        if (this.f27078h != null) {
            return this.f27078h;
        }
        if (this.f27080j != null) {
            try {
                this.f27080j.get(2000, TimeUnit.MILLISECONDS);
                this.f27080j = null;
            } catch (InterruptedException e) {
            } catch (ExecutionException e2) {
            } catch (TimeoutException e3) {
                this.f27080j.cancel(true);
            }
        }
        return this.f27078h;
    }

    public final Method m24977a(String str, String str2) {
        mo moVar = (mo) this.f27086p.get(new Pair(str, str2));
        return moVar == null ? null : moVar.m25171a();
    }

    final void m24978a(int i, boolean z) {
        if (this.f27085o) {
            Future submit = this.f27074d.submit(new jr(this, i, z));
            if (i == 0) {
                this.f27082l = submit;
            }
        }
    }

    public final boolean m24979a(String str, String str2, Class... clsArr) {
        if (this.f27086p.containsKey(new Pair(str, str2))) {
            return false;
        }
        this.f27086p.put(new Pair(str, str2), new mo(this, str, str2, clsArr));
        return true;
    }

    public final int m24980b() {
        return this.f27083m != null ? fz.m24381a() : Integer.MIN_VALUE;
    }

    final ci m24981b(int i, boolean z) {
        if (i > 0 && z) {
            try {
                Thread.sleep((long) (i * 1000));
            } catch (InterruptedException e) {
            }
        }
        return m24975c();
    }

    private final boolean m24974b(File file, String str) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        FileOutputStream fileOutputStream2 = null;
        File file2 = new File(String.format("%s/%s.tmp", new Object[]{file, str}));
        if (!file2.exists()) {
            return false;
        }
        File file3 = new File(String.format("%s/%s.dex", new Object[]{file, str}));
        if (file3.exists()) {
            return false;
        }
        try {
            long length = file2.length();
            if (length <= 0) {
                m24970a(file2);
                return false;
            }
            byte[] bArr = new byte[((int) length)];
            fileInputStream = new FileInputStream(file2);
            try {
                if (fileInputStream.read(bArr) <= 0) {
                    Log.d(f27071a, "Cannot read the cache data.");
                    m24970a(file2);
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                    }
                    return false;
                }
                cn cnVar = (cn) wz.m24211a(new cn(), bArr, bArr.length);
                if (str.equals(new String(cnVar.f26641c)) && Arrays.equals(cnVar.f26640b, ed.m24323a(cnVar.f26639a)) && Arrays.equals(cnVar.f26642d, VERSION.SDK.getBytes())) {
                    byte[] a = jm.m24962a(this.f27077g, new String(cnVar.f26639a));
                    file3.createNewFile();
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        fileOutputStream.write(a, 0, a.length);
                        try {
                            fileInputStream.close();
                        } catch (IOException e2) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                        }
                        return true;
                    } catch (IOException e4) {
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e5) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e6) {
                            }
                        }
                        return false;
                    } catch (NoSuchAlgorithmException e7) {
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (zzcy e8) {
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            fileInputStream2.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        fileOutputStream2 = fileOutputStream;
                        th = th2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e9) {
                            }
                        }
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e10) {
                            }
                        }
                        throw th;
                    }
                }
                m24970a(file2);
                try {
                    fileInputStream.close();
                } catch (IOException e11) {
                }
                return false;
            } catch (IOException e12) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (NoSuchAlgorithmException e13) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (zzcy e14) {
                fileOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                throw th;
            }
        } catch (IOException e15) {
            fileOutputStream = null;
            fileInputStream2 = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (NoSuchAlgorithmException e16) {
            fileOutputStream = null;
            fileInputStream2 = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (zzcy e17) {
            fileOutputStream = null;
            fileInputStream2 = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            return false;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            throw th;
        }
    }

    private final ci m24975c() {
        ci ciVar = null;
        try {
            ciVar = new C5160a(this.f27072b, this.f27072b.getPackageName(), Integer.toString(this.f27072b.getPackageManager().getPackageInfo(this.f27072b.getPackageName(), 0).versionCode)).m23904b();
        } catch (Throwable th) {
        }
        return ciVar;
    }

    static /* synthetic */ void m24969a(jp jpVar) {
        try {
            if (jpVar.f27078h == null && jpVar.f27073c != null) {
                C4892a c4892a = new C4892a(jpVar.f27073c);
                c4892a.m22916a(true);
                jpVar.f27078h = c4892a;
            }
        } catch (GooglePlayServicesNotAvailableException e) {
            jpVar.f27078h = null;
        } catch (IOException e2) {
            jpVar.f27078h = null;
        } catch (GooglePlayServicesRepairableException e3) {
            jpVar.f27078h = null;
        }
    }

    static /* synthetic */ boolean m24973a(int i, ci ciVar) {
        if (i < 4) {
            if (ciVar == null) {
                return true;
            }
            if (((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27766v)).booleanValue() && (ciVar.f26601w == null || ciVar.f26601w.equals("0000000000000000000000000000000000000000000000000000000000000000"))) {
                return true;
            }
            if (((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27767w)).booleanValue() && (ciVar.ag == null || ciVar.ag.f26643a == null || ciVar.ag.f26643a.longValue() == -2)) {
                return true;
            }
        }
        return false;
    }
}
