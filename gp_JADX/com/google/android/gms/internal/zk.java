package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.p270c.C4909c;
import com.google.c.a.a.a.a.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;

@C5302b
public final class zk implements zn {
    public static final Object f27771a = new Object();
    public static zn f27772b = null;
    public final Object f27773c = new Object();
    public final Context f27774d;
    public final String f27775e;
    public final zzajs f27776f;
    public final WeakHashMap f27777g = new WeakHashMap();

    private zk(Context context, String str, zzajs com_google_android_gms_internal_zzajs) {
        this.f27774d = context;
        this.f27775e = str;
        this.f27776f = com_google_android_gms_internal_zzajs;
        Thread thread = Looper.getMainLooper().getThread();
        if (thread != null) {
            synchronized (this.f27773c) {
                this.f27777g.put(thread, Boolean.valueOf(true));
            }
            thread.setUncaughtExceptionHandler(new zm(this, thread.getUncaughtExceptionHandler()));
        }
        Thread.setDefaultUncaughtExceptionHandler(new zl(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    public static zn m26046a(Context context, zzajs com_google_android_gms_internal_zzajs) {
        synchronized (f27771a) {
            if (f27772b == null) {
                if (((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27745a)).booleanValue()) {
                    String str = "unknown";
                    try {
                        str = context.getApplicationContext().getPackageName();
                    } catch (Throwable th) {
                        ap.m24193c("Cannot obtain package name, proceeding.");
                    }
                    f27772b = new zk(context.getApplicationContext(), str, com_google_android_gms_internal_zzajs);
                } else {
                    f27772b = new C5297a();
                }
            }
        }
        return f27772b;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void m26049a(java.lang.Throwable r11) {
        /*
        r10 = this;
        r1 = 1;
        r3 = 0;
        if (r11 == 0) goto L_0x0046;
    L_0x0004:
        r2 = r3;
        r0 = r3;
        r5 = r11;
    L_0x0007:
        if (r5 == 0) goto L_0x003a;
    L_0x0009:
        r6 = r5.getStackTrace();
        r7 = r6.length;
        r4 = r3;
    L_0x000f:
        if (r4 >= r7) goto L_0x0034;
    L_0x0011:
        r8 = r6[r4];
        r9 = r8.getClassName();
        r9 = m26048a(r9);
        if (r9 == 0) goto L_0x001e;
    L_0x001d:
        r0 = r1;
    L_0x001e:
        r9 = r10.getClass();
        r9 = r9.getName();
        r8 = r8.getClassName();
        r8 = r9.equals(r8);
        if (r8 == 0) goto L_0x0031;
    L_0x0030:
        r2 = r1;
    L_0x0031:
        r4 = r4 + 1;
        goto L_0x000f;
    L_0x0034:
        r4 = r5.getCause();
        r5 = r4;
        goto L_0x0007;
    L_0x003a:
        if (r0 == 0) goto L_0x0046;
    L_0x003c:
        if (r2 != 0) goto L_0x0046;
    L_0x003e:
        if (r1 == 0) goto L_0x0045;
    L_0x0040:
        r0 = "";
        r10.mo4695a(r11, r0);
    L_0x0045:
        return;
    L_0x0046:
        r1 = r3;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zk.a(java.lang.Throwable):void");
    }

    private static boolean m26048a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith((String) C4909c.m22927a().f25267g.m26014a(yu.f27747c))) {
            return true;
        }
        try {
            return Class.forName(str).isAnnotationPresent(C5302b.class);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "Fail to check class type for class ";
            String valueOf = String.valueOf(str);
            ap.m24189a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return false;
        }
    }

    public final void mo4695a(Throwable th, String str) {
        Throwable th2;
        if (((Boolean) C4909c.m22927a().f25267g.m26014a(yu.f27746b)).booleanValue()) {
            th2 = th;
        } else {
            Throwable th3;
            LinkedList linkedList = new LinkedList();
            for (th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4;
                th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                Object obj = null;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (m26048a(stackTraceElement.getClassName())) {
                        obj = 1;
                        arrayList.add(stackTraceElement);
                    } else {
                        String className = stackTraceElement.getClassName();
                        Object obj2 = (TextUtils.isEmpty(className) || !(className.startsWith("android.") || className.startsWith("java."))) ? null : 1;
                        if (obj2 != null) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (obj != null) {
                    th4 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th4.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                } else {
                    th4 = th2;
                }
                th2 = th4;
            }
        }
        if (th2 != null) {
            Class cls = th.getClass();
            List arrayList2 = new ArrayList();
            arrayList2.add(m26047a(cls, th2, str));
            C5337w c5337w = C4909c.m22927a().f25263c;
            C5337w.m25815a(arrayList2, C4909c.m22927a().f25264d.m24771a());
        }
    }

    private final String m26047a(Class cls, Throwable th, String str) {
        Writer stringWriter = new StringWriter();
        a.a(th, new PrintWriter(stringWriter));
        boolean z = false;
        try {
            z = dr.f26667b.m24299a(this.f27774d).m24296a();
        } catch (Throwable th2) {
            ap.m24192b("Error fetching instant app info", th2);
        }
        C5337w c5337w = C4909c.m22927a().f25263c;
        return new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", VERSION.RELEASE).appendQueryParameter("api", String.valueOf(VERSION.SDK_INT)).appendQueryParameter("device", C5337w.m25816b()).appendQueryParameter("js", this.f27776f.f27782a).appendQueryParameter("appid", this.f27775e).appendQueryParameter("exceptiontype", cls.getName()).appendQueryParameter("stacktrace", stringWriter.toString()).appendQueryParameter("eids", TextUtils.join(",", yu.m26015a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "164654066").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", C4909c.m22927a().f25264d.f26954b).toString();
    }
}
