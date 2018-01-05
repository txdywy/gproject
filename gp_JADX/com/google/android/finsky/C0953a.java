package com.google.android.finsky;

import android.content.Context;
import android.util.Log;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bn.C2132f;
import com.google.android.finsky.dd.C2567a;
import com.google.android.finsky.p111d.C2489q;
import com.google.android.finsky.p140i.C3212a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.setup.RestoreService;
import com.google.android.finsky.setup.bp;
import com.google.android.finsky.utils.C4679j;
import com.google.c.a.a.a.a.a;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Locale;

public final class C0953a implements UncaughtExceptionHandler {
    public final Context f5790a;
    public final C3212a f5791b;
    public final boolean f5792c;
    public final int f5793d;
    public final File f5794e;
    public int f5795f;
    public long f5796g;
    public UncaughtExceptionHandler f5797h;
    public volatile boolean f5798i;
    public String f5799j;
    public String f5800k;
    public Boolean f5801l;
    public C2489q f5802m;
    public long f5803n;
    public long f5804o;

    public C0953a(Context context, C3212a c3212a, C1461c c1461c) {
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1695a(this);
        this.f5790a = context;
        this.f5791b = c3212a;
        boolean z = c1461c.dj().mo2294a(12635440) && c1461c.dj().mo2294a(12635488);
        this.f5792c = z;
        C1552e dj = c1461c.dj();
        if (dj.mo2294a(12635426)) {
            this.f5793d = 1;
        } else if (dj.mo2294a(12635480)) {
            this.f5793d = 2;
        } else {
            this.f5793d = 0;
        }
        this.f5794e = new File(context.getCacheDir(), String.format(Locale.US, "crash%d", new Object[]{Integer.valueOf(808539)}));
        m5740a();
        if (this.f5795f > 0) {
            if (m5745a(((Integer) C0955b.fx.m28964b()).intValue())) {
                m5743a("Cleanup cache");
                try {
                    m5742a(new File(this.f5790a.getCacheDir(), "main"));
                    m5742a(new File(this.f5790a.getCacheDir(), "images"));
                    m5742a(new File(this.f5790a.getCacheDir(), "cache_and_sync_images"));
                } catch (Throwable e) {
                    m5744a("Failed to cleanup Volley cache", e);
                }
            }
            if (m5745a(((Integer) C0955b.fy.m28964b()).intValue())) {
                m5743a("Cleanup data stores");
                m5743a("Cleanup restore data store");
                try {
                    RestoreService.m19089a(this.f5790a);
                    bp.m19291a(this.f5790a);
                } catch (Throwable e2) {
                    m5744a("Failed to cleanup restore data store", e2);
                }
                m5743a("Cleanup installer data store");
                try {
                    C2132f.m11164a(this.f5790a, null);
                } catch (Throwable e22) {
                    m5744a("Failed to cleanup installer data store", e22);
                }
            }
            if (m5745a(((Integer) C0955b.fA.m28964b()).intValue())) {
                m5743a("Cleanup self update data store");
                try {
                    C2567a.m13570a();
                } catch (Throwable e222) {
                    m5744a("Failed to cleanup self update data store", e222);
                }
            }
            if (m5745a(((Integer) C0955b.fz.m28964b()).intValue())) {
                m5743a("Cleanup user preferences");
                try {
                    C0954a.f5831a.m5759b();
                    C0968o.f5925b.m5759b();
                    C1189b.f7265a.m5759b();
                } catch (Throwable e2222) {
                    m5744a("Failed to cleanup user prefs", e2222);
                }
            }
            m5741a(this.f5795f, this.f5796g, true, null, this.f5801l, this.f5803n, this.f5804o);
        }
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        long j = -1;
        if (!this.f5798i) {
            long longValue;
            Boolean valueOf = Boolean.valueOf(!this.f5791b.mo3376a());
            this.f5798i = true;
            if (this.f5793d != 0) {
                longValue = ((Long) this.f5802m.f13414a.get()).longValue();
                j = this.f5802m.f13415b;
            } else {
                longValue = -1;
            }
            m5741a(this.f5795f + 1, System.currentTimeMillis(), false, th, valueOf, longValue, j);
        }
        if (this.f5797h != null) {
            this.f5797h.uncaughtException(thread, th);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "cnt=%d ts=%d cause=%s fg=%b\"", new Object[]{Integer.valueOf(this.f5795f), Long.valueOf(this.f5796g), this.f5799j, this.f5801l});
    }

    private final void m5740a() {
        DataInputStream dataInputStream;
        try {
            if (this.f5794e.exists()) {
                Object obj;
                dataInputStream = new DataInputStream(new FileInputStream(this.f5794e));
                this.f5795f = dataInputStream.readInt();
                this.f5796g = dataInputStream.readLong();
                boolean readBoolean = dataInputStream.readBoolean();
                this.f5799j = dataInputStream.readUTF();
                this.f5800k = dataInputStream.readUTF();
                this.f5803n = -1;
                this.f5804o = -1;
                while (dataInputStream.available() > 0) {
                    String readUTF = dataInputStream.readUTF();
                    obj = -1;
                    switch (readUTF.hashCode()) {
                        case -47067292:
                            if (readUTF.equals("last_id")) {
                                int i = 1;
                                break;
                            }
                            break;
                        case 100490230:
                            if (readUTF.equals("is_fg")) {
                                obj = null;
                                break;
                            }
                            break;
                    }
                    switch (obj) {
                        case null:
                            this.f5801l = Boolean.valueOf(dataInputStream.readBoolean());
                            break;
                        case 1:
                            this.f5803n = dataInputStream.readLong();
                            this.f5804o = dataInputStream.readLong();
                            break;
                        default:
                            m5743a("Unknown key in crash file");
                            String str = "No such key: ";
                            String valueOf = String.valueOf(readUTF);
                            throw new IOException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    }
                }
                dataInputStream.close();
                m5743a("Read crash info");
                Object obj2 = this.f5795f > ((Integer) C0955b.fw.m28964b()).intValue() ? 1 : null;
                if (this.f5796g <= 0 || System.currentTimeMillis() - this.f5796g <= ((Long) C0955b.fv.m28964b()).longValue()) {
                    obj = null;
                } else {
                    obj = 1;
                }
                if (obj != null || readBoolean || obj2 != null) {
                    m5743a("Crash info expired");
                    m5746b();
                    m5742a(this.f5794e);
                    return;
                }
                return;
            }
            m5746b();
        } catch (Throwable e) {
            m5744a("Failed to read crash file", e);
            m5746b();
            m5742a(this.f5794e);
        } catch (Throwable th) {
            dataInputStream.close();
        }
    }

    private final void m5746b() {
        this.f5795f = 0;
        this.f5796g = 0;
        this.f5803n = -1;
        this.f5804o = -1;
    }

    private final void m5741a(int i, long j, boolean z, Throwable th, Boolean bool, long j2, long j3) {
        Closeable dataOutputStream;
        Throwable e;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(this.f5794e));
            try {
                dataOutputStream.writeInt(i);
                dataOutputStream.writeLong(j);
                dataOutputStream.writeBoolean(z);
                String str = "";
                String str2 = "";
                if (th != null) {
                    str = th.getClass().getSimpleName();
                    Writer stringWriter = new StringWriter();
                    a.a(th, new PrintWriter(stringWriter));
                    str2 = stringWriter.getBuffer().substring(0, Math.min(stringWriter.getBuffer().length(), ((Integer) C0955b.gF.m28964b()).intValue()));
                }
                dataOutputStream.writeUTF(str);
                dataOutputStream.writeUTF(str2);
                if (this.f5792c && bool != null) {
                    dataOutputStream.writeUTF("is_fg");
                    dataOutputStream.writeBoolean(bool.booleanValue());
                }
                if (this.f5793d != 0) {
                    dataOutputStream.writeUTF("last_id");
                    dataOutputStream.writeLong(j2);
                    dataOutputStream.writeLong(j3);
                }
                C4679j.m21814a(dataOutputStream);
            } catch (Exception e2) {
                e = e2;
                try {
                    m5744a("Failed to write crash file", e);
                    C4679j.m21814a(dataOutputStream);
                } catch (Throwable th2) {
                    e = th2;
                    C4679j.m21814a(dataOutputStream);
                    throw e;
                }
            }
        } catch (Exception e3) {
            e = e3;
            dataOutputStream = null;
            m5744a("Failed to write crash file", e);
            C4679j.m21814a(dataOutputStream);
        } catch (Throwable th3) {
            e = th3;
            dataOutputStream = null;
            C4679j.m21814a(dataOutputStream);
            throw e;
        }
    }

    private final void m5743a(String str) {
        try {
            Log.w("Finsky.CrashDetector", String.format(Locale.US, "%s %s.", new Object[]{str, this}));
        } catch (Exception e) {
        }
    }

    private final void m5744a(String str, Throwable th) {
        try {
            Log.w("Finsky.CrashDetector", String.format(Locale.US, "%s %s.", new Object[]{str, this}), th);
        } catch (Exception e) {
        }
    }

    private final boolean m5745a(int i) {
        return i > 0 && this.f5795f >= i;
    }

    private final void m5742a(File file) {
        try {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File a : listFiles) {
                        m5742a(a);
                    }
                }
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                m5743a(new StringBuilder(String.valueOf(valueOf).length() + 23).append("Failed to delete file: ").append(valueOf).toString());
            }
        } catch (Throwable e) {
            String valueOf2 = String.valueOf(file);
            m5744a(new StringBuilder(String.valueOf(valueOf2).length() + 23).append("Failed to delete file: ").append(valueOf2).toString(), e);
        }
    }
}
