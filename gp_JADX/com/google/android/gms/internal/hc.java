package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.C5147b;
import com.google.android.gms.measurement.AppMeasurement;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class hc extends hz {
    public final String f26842a = gj.m24459s();
    public final char f26843b;
    public final long f26844c = gj.m24441G();
    public final he f26845d;
    public final he f26846e;
    public final he f26847f;
    public final he f26848g;
    public final he f26849h;
    public final he f26850i;
    public final he f26851j;

    hc(hv hvVar) {
        super(hvVar);
        if (mo4744r().m24467I()) {
            gj.m24442H();
            this.f26843b = 'C';
        } else {
            gj.m24442H();
            this.f26843b = 'c';
        }
        this.f26845d = new he(this, 6, false, false);
        this.f26846e = new he(this, 6, true, false);
        he heVar = new he(this, 6, false, true);
        this.f26847f = new he(this, 5, false, false);
        heVar = new he(this, 5, true, false);
        this.f26848g = new he(this, 5, false, true);
        this.f26849h = new he(this, 4, false, false);
        this.f26850i = new he(this, 3, false, false);
        this.f26851j = new he(this, 2, false, false);
    }

    protected static Object m24625a(String str) {
        return str == null ? null : new hf(str);
    }

    private static String m24627a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            Object obj4 = "";
        }
        Object a = m24626a(z, obj);
        Object a2 = m24626a(z, obj2);
        Object a3 = m24626a(z, obj3);
        StringBuilder stringBuilder = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(obj4)) {
            stringBuilder.append(obj4);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            stringBuilder.append(str2);
            stringBuilder.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            stringBuilder.append(str2);
            stringBuilder.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            stringBuilder.append(str2);
            stringBuilder.append(a3);
        }
        return stringBuilder.toString();
    }

    private static String m24628b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf != -1 ? str.substring(0, lastIndexOf) : str;
    }

    public final /* bridge */ /* synthetic */ void mo4727a() {
        super.mo4727a();
    }

    protected final void m24630a(int i, String str) {
        Log.println(i, this.f26842a, str);
    }

    protected final void m24631a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && m24632a(i)) {
            m24630a(i, m24627a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            am.m23733a((Object) str);
            hz hzVar = this.p.f26931f;
            if (hzVar == null) {
                m24630a(6, "Scheduler not set. Not logging error/warn");
            } else if (hzVar.m24431w()) {
                int i2 = i < 0 ? 0 : i;
                if (i2 >= 9) {
                    i2 = 8;
                }
                String str2 = "2";
                char charAt = "01VDIWEA?".charAt(i2);
                char c = this.f26843b;
                long j = this.f26844c;
                String a = m24627a(true, str, obj, obj2, obj3);
                String stringBuilder = new StringBuilder((String.valueOf(str2).length() + 23) + String.valueOf(a).length()).append(str2).append(charAt).append(c).append(j).append(":").append(a).toString();
                if (stringBuilder.length() > MemoryMappedFileBuffer.DEFAULT_PADDING) {
                    stringBuilder = str.substring(0, MemoryMappedFileBuffer.DEFAULT_PADDING);
                }
                hzVar.m24733a(new hd(this, stringBuilder));
            } else {
                m24630a(6, "Scheduler not initialized. Not logging error/warn");
            }
        }
    }

    protected final boolean m24632a(int i) {
        return Log.isLoggable(this.f26842a, i);
    }

    public final /* bridge */ /* synthetic */ void mo4728b() {
        super.mo4728b();
    }

    public final /* bridge */ /* synthetic */ gd mo4729c() {
        return super.mo4729c();
    }

    public final /* bridge */ /* synthetic */ ib mo4730d() {
        return super.mo4730d();
    }

    public final /* bridge */ /* synthetic */ gx mo4731e() {
        return super.mo4731e();
    }

    public final /* bridge */ /* synthetic */ go mo4732f() {
        return super.mo4732f();
    }

    public final /* bridge */ /* synthetic */ il mo4733g() {
        return super.mo4733g();
    }

    public final /* bridge */ /* synthetic */ ig mo4734h() {
        return super.mo4734h();
    }

    public final /* bridge */ /* synthetic */ C5147b mo4735i() {
        return super.mo4735i();
    }

    public final /* bridge */ /* synthetic */ Context mo4736j() {
        return super.mo4736j();
    }

    public final /* bridge */ /* synthetic */ gy mo4737k() {
        return super.mo4737k();
    }

    public final /* bridge */ /* synthetic */ ha mo4738l() {
        return super.mo4738l();
    }

    public final /* bridge */ /* synthetic */ jl mo4739m() {
        return super.mo4739m();
    }

    public final /* bridge */ /* synthetic */ jb mo4740n() {
        return super.mo4740n();
    }

    public final /* bridge */ /* synthetic */ hr mo4741o() {
        return super.mo4741o();
    }

    public final /* bridge */ /* synthetic */ hc mo4742p() {
        return super.mo4742p();
    }

    public final /* bridge */ /* synthetic */ hj mo4743q() {
        return super.mo4743q();
    }

    public final /* bridge */ /* synthetic */ gj mo4744r() {
        return super.mo4744r();
    }

    protected final void mo4745s() {
    }

    private static String m24626a(boolean z, Object obj) {
        if (obj == null) {
            return "";
        }
        Object valueOf;
        if (obj instanceof Integer) {
            valueOf = Long.valueOf((long) ((Integer) obj).intValue());
        } else {
            valueOf = obj;
        }
        if (valueOf instanceof Long) {
            if (!z) {
                return String.valueOf(valueOf);
            }
            if (Math.abs(((Long) valueOf).longValue()) < 100) {
                return String.valueOf(valueOf);
            }
            String str = String.valueOf(valueOf).charAt(0) == '-' ? "-" : "";
            String valueOf2 = String.valueOf(Math.abs(((Long) valueOf).longValue()));
            return new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(str).length()).append(str).append(Math.round(Math.pow(10.0d, (double) (valueOf2.length() - 1)))).append("...").append(str).append(Math.round(Math.pow(10.0d, (double) valueOf2.length()) - 1.0d)).toString();
        } else if (valueOf instanceof Boolean) {
            return String.valueOf(valueOf);
        } else {
            if (valueOf instanceof Throwable) {
                Throwable th = (Throwable) valueOf;
                StringBuilder stringBuilder = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b = m24628b(AppMeasurement.class.getCanonicalName());
                String b2 = m24628b(hv.class.getCanonicalName());
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null) {
                            className = m24628b(className);
                            if (className.equals(b) || className.equals(b2)) {
                                stringBuilder.append(": ");
                                stringBuilder.append(stackTraceElement);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return stringBuilder.toString();
            } else if (valueOf instanceof hf) {
                return ((hf) valueOf).f26858a;
            } else {
                return z ? "-" : String.valueOf(valueOf);
            }
        }
    }

    public final String m24651t() {
        Pair pair;
        hm hmVar = mo4743q().f26865c;
        hmVar.f26892e.mo4728b();
        hmVar.f26892e.mo4728b();
        long b = hmVar.m24688b();
        if (b == 0) {
            hmVar.m24687a();
            b = 0;
        } else {
            b = Math.abs(b - hmVar.f26892e.mo4735i().mo4629a());
        }
        if (b < hmVar.f26891d) {
            pair = null;
        } else if (b > (hmVar.f26891d << 1)) {
            hmVar.m24687a();
            pair = null;
        } else {
            String string = hmVar.f26892e.m24683t().getString(hmVar.f26890c, null);
            long j = hmVar.f26892e.m24683t().getLong(hmVar.f26889b, 0);
            hmVar.m24687a();
            pair = (string == null || j <= 0) ? hj.f26863a : new Pair(string, Long.valueOf(j));
        }
        if (pair == null || pair == hj.f26863a) {
            return null;
        }
        string = String.valueOf(pair.second);
        String str = (String) pair.first;
        return new StringBuilder((String.valueOf(string).length() + 1) + String.valueOf(str).length()).append(string).append(":").append(str).toString();
    }
}
