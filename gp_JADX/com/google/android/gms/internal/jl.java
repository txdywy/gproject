package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.C5147b;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class jl extends hz {
    public static String[] f27059a = new String[]{"firebase_"};
    public SecureRandom f27060b;
    public final AtomicLong f27061c = new AtomicLong(0);
    public int f27062d;

    jl(hv hvVar) {
        super(hvVar);
    }

    static int m24910a(String str) {
        return "_ldl".equals(str) ? gj.m24436B() : gj.m24435A();
    }

    private static Object m24912a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (!(obj instanceof Boolean)) {
            return obj instanceof Float ? Double.valueOf(((Float) obj).doubleValue()) : ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) ? m24914a(String.valueOf(obj), i, z) : null;
        } else {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
    }

    public static Object m24913a(String str, Object obj) {
        return "_ldl".equals(str) ? m24912a(m24910a(str), obj, true) : m24912a(m24910a(str), obj, false);
    }

    public static String m24914a(String str, int i, boolean z) {
        return str.codePointCount(0, str.length()) > i ? z ? String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...") : null : str;
    }

    private static void m24915a(Bundle bundle, Object obj) {
        am.m23733a((Object) bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    public static boolean m24916a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, str), 2);
            return receiverInfo != null && receiverInfo.enabled;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static boolean m24917a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    private static boolean m24918a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    public static Bundle[] m24919a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            return (Bundle[]) Arrays.copyOf((Parcelable[]) obj, ((Parcelable[]) obj).length, Bundle[].class);
        } else {
            if (!(obj instanceof ArrayList)) {
                return null;
            }
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static boolean m24920b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 4);
            return serviceInfo != null && serviceInfo.enabled;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    public static boolean m24921b(String str, String str2) {
        return (str == null && str2 == null) ? true : str == null ? false : str.equals(str2);
    }

    public static boolean m24922c(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private static MessageDigest m24925e(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void mo4727a() {
        super.mo4727a();
    }

    public final void m24930a(int i, String str, String str2, int i2) {
        m24937b(i, str, str2, i2);
    }

    public final boolean m24931a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo4735i().mo4629a() - j) > j2;
    }

    public final /* bridge */ /* synthetic */ void mo4728b() {
        super.mo4728b();
    }

    public final void m24937b(int i, String str, String str2, int i2) {
        Bundle bundle = new Bundle();
        m24918a(bundle, i);
        if (!TextUtils.isEmpty(str)) {
            bundle.putString(str, str2);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        gj.m24442H();
        this.p.m24763f().m24776a("auto", "_err", bundle);
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
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo4742p().f26847f.m24652a("Utils falling back to Random for random id");
            }
        }
        this.f27061c.set(nextLong);
    }

    public final long m24957t() {
        long nextLong;
        if (this.f27061c.get() == 0) {
            synchronized (this.f27061c) {
                nextLong = new Random(System.nanoTime() ^ mo4735i().mo4629a()).nextLong();
                int i = this.f27062d + 1;
                this.f27062d = i;
                nextLong += (long) i;
            }
        } else {
            synchronized (this.f27061c) {
                this.f27061c.compareAndSet(-1, 1);
                nextLong = this.f27061c.getAndIncrement();
            }
        }
        return nextLong;
    }

    final SecureRandom m24958u() {
        mo4728b();
        if (this.f27060b == null) {
            this.f27060b = new SecureRandom();
        }
        return this.f27060b;
    }

    public final Bundle m24926a(Uri uri) {
        Bundle bundle = null;
        if (uri != null) {
            try {
                Object queryParameter;
                Object queryParameter2;
                Object queryParameter3;
                Object queryParameter4;
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                } else {
                    queryParameter4 = null;
                    queryParameter3 = null;
                    queryParameter2 = null;
                    queryParameter = null;
                }
                if (!(TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4))) {
                    bundle = new Bundle();
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("campaign", queryParameter);
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("source", queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("medium", queryParameter3);
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("gclid", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("term", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("content", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("aclid", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("cp1", queryParameter4);
                    }
                    queryParameter4 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("anid", queryParameter4);
                    }
                }
            } catch (UnsupportedOperationException e) {
                mo4742p().f26847f.m24653a("Install referrer url isn't a hierarchical URI", e);
            }
        }
        return bundle;
    }

    final boolean m24933a(String str, String str2) {
        if (str2 == null) {
            mo4742p().f26845d.m24653a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo4742p().f26845d.m24653a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                codePointAt = Character.charCount(codePointAt);
                while (codePointAt < length) {
                    int codePointAt2 = str2.codePointAt(codePointAt);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        codePointAt += Character.charCount(codePointAt2);
                    } else {
                        mo4742p().f26845d.m24654a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo4742p().f26845d.m24654a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    final boolean m24935a(String str, String[] strArr, String str2) {
        if (str2 == null) {
            mo4742p().f26845d.m24653a("Name is required and can't be null. Type", str);
            return false;
        }
        boolean z;
        am.m23733a((Object) str2);
        for (String startsWith : f27059a) {
            if (str2.startsWith(startsWith)) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            mo4742p().f26845d.m24654a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            am.m23733a((Object) strArr);
            for (String startsWith2 : strArr) {
                if (m24921b(str2, startsWith2)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                mo4742p().f26845d.m24654a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    final boolean m24932a(String str, int i, String str2) {
        if (str2 == null) {
            mo4742p().f26845d.m24653a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo4742p().f26845d.m24655a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    private final int m24923d(String str) {
        int i;
        String str2 = "event param";
        if (str == null) {
            mo4742p().f26845d.m24653a("Name is required and can't be null. Type", str2);
            i = 0;
        } else if (str.length() == 0) {
            mo4742p().f26845d.m24653a("Name is required and can't be empty. Type", str2);
            i = 0;
        } else {
            i = str.codePointAt(0);
            if (Character.isLetter(i)) {
                int length = str.length();
                i = Character.charCount(i);
                while (i < length) {
                    int codePointAt = str.codePointAt(i);
                    if (codePointAt != 95 && !Character.isLetterOrDigit(codePointAt)) {
                        mo4742p().f26845d.m24654a("Name must consist of letters, digits or _ (underscores). Type, name", str2, str);
                        i = 0;
                        break;
                    }
                    i += Character.charCount(codePointAt);
                }
                i = 1;
            } else {
                mo4742p().f26845d.m24654a("Name must start with a letter. Type, name", str2, str);
                i = 0;
            }
        }
        if (i == 0) {
            return 3;
        }
        if (!m24935a("event param", null, str)) {
            return 14;
        }
        if (m24932a("event param", gj.m24463w(), str)) {
            return 0;
        }
        return 3;
    }

    final boolean m24934a(String str, String str2, int i, Object obj, boolean z) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) <= i) {
                return true;
            }
            mo4742p().f26847f.m24655a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
            return false;
        } else if ((obj instanceof Bundle) && z) {
            return true;
        } else {
            int length;
            int i2;
            Object obj2;
            if ((obj instanceof Parcelable[]) && z) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                length = parcelableArr.length;
                i2 = 0;
                while (i2 < length) {
                    obj2 = parcelableArr[i2];
                    if (obj2 instanceof Bundle) {
                        i2++;
                    } else {
                        mo4742p().f26847f.m24654a("All Parcelable[] elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof ArrayList) || !z) {
                return false;
            } else {
                ArrayList arrayList = (ArrayList) obj;
                length = arrayList.size();
                i2 = 0;
                while (i2 < length) {
                    obj2 = arrayList.get(i2);
                    i2++;
                    if (!(obj2 instanceof Bundle)) {
                        mo4742p().f26847f.m24654a("All ArrayList elements must be of type Bundle. Value type, name", obj2.getClass(), str2);
                        return false;
                    }
                }
                return true;
            }
        }
    }

    private final int m24911a(String str, Object obj, boolean z) {
        if (z) {
            int length;
            Object obj2;
            String str2 = "param";
            gj.m24466z();
            if (obj instanceof Parcelable[]) {
                length = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                length = ((ArrayList) obj).size();
            } else {
                length = 1;
                if (obj2 == null) {
                    return 17;
                }
            }
            if (length > 1000) {
                mo4742p().f26847f.m24655a("Parameter array is too long; discarded. Value kind, name, array length", str2, str, Integer.valueOf(length));
                obj2 = null;
            } else {
                length = 1;
            }
            if (obj2 == null) {
                return 17;
            }
        }
        return m24922c(str) ? m24934a("param", str, gj.m24465y(), obj, z) : m24934a("param", str, gj.m24464x(), obj, z) ? 0 : 4;
    }

    public final Bundle m24928a(String str, Bundle bundle, List list, boolean z, boolean z2) {
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        gj.m24460t();
        int i = 0;
        for (String str2 : bundle.keySet()) {
            int i2 = 0;
            if (list == null || !list.contains(str2)) {
                if (z) {
                    i2 = m24923d(str2);
                }
                if (i2 == 0) {
                    i2 = !m24933a("event param", str2) ? 3 : !m24935a("event param", null, str2) ? 14 : !m24932a("event param", gj.m24463w(), str2) ? 3 : 0;
                }
            }
            if (i2 != 0) {
                if (m24918a(bundle2, i2)) {
                    bundle2.putString("_ev", m24914a(str2, gj.m24463w(), true));
                    if (i2 == 3) {
                        m24915a(bundle2, (Object) str2);
                    }
                }
                bundle2.remove(str2);
            } else {
                i2 = m24911a(str2, bundle.get(str2), z2);
                if (i2 == 0 || "_ev".equals(str2)) {
                    am.m23735a(str2);
                    Object obj = (str2.charAt(0) != '_' || str2.equals("_ep")) ? 1 : null;
                    if (obj != null) {
                        i++;
                        if (i > 25) {
                            mo4742p().f26845d.m24654a("Event can't contain more then 25 params", mo4738l().m24602a(str), mo4738l().m24601a(bundle));
                            m24918a(bundle2, 5);
                            bundle2.remove(str2);
                        }
                    }
                    i = i;
                } else {
                    if (m24918a(bundle2, i2)) {
                        bundle2.putString("_ev", m24914a(str2, gj.m24463w(), true));
                        m24915a(bundle2, bundle.get(str2));
                    }
                    bundle2.remove(str2);
                }
            }
        }
        return bundle2;
    }

    public final boolean m24938b(String str) {
        mo4728b();
        if (dr.f26667b.m24299a(mo4736j()).m24294a(str) == 0) {
            return true;
        }
        mo4742p().f26850i.m24653a("Permission not granted", str);
        return false;
    }

    final Bundle m24927a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a;
                Object obj = bundle.get(str);
                if ("_ev".equals(str)) {
                    a = m24912a(gj.m24465y(), obj, true);
                } else {
                    a = m24912a(m24922c(str) ? gj.m24465y() : gj.m24464x(), obj, false);
                }
                if (a == null) {
                    mo4742p().f26847f.m24653a("Param value can't be null", mo4738l().m24604b(str));
                } else if (a instanceof Long) {
                    bundle2.putLong(str, ((Long) a).longValue());
                } else if (a instanceof String) {
                    bundle2.putString(str, String.valueOf(a));
                } else if (a instanceof Double) {
                    bundle2.putDouble(str, ((Double) a).doubleValue());
                } else if (str != null) {
                    mo4742p().f26848g.m24654a("Not putting event parameter. Invalid value type. name, type", mo4738l().m24604b(str), a != null ? a.getClass().getSimpleName() : null);
                }
            }
        }
        return bundle2;
    }

    final long m24939c(Context context, String str) {
        mo4728b();
        am.m23733a((Object) context);
        am.m23735a(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest e = m24925e("MD5");
        if (e == null) {
            mo4742p().f26845d.m24652a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m24924d(context, str)) {
                    PackageInfo b = dr.f26667b.m24299a(context).m24298b(mo4736j().getPackageName(), 64);
                    if (b.signatures == null || b.signatures.length <= 0) {
                        mo4742p().f26847f.m24652a("Could not get signatures");
                        return -1;
                    }
                    Object digest = e.digest(b.signatures[0].toByteArray());
                    am.m23733a(digest);
                    am.m23738a(digest.length > 0);
                    long j = 0;
                    int length = digest.length - 1;
                    long j2 = 0;
                    while (length >= 0 && length >= digest.length - 8) {
                        long j3 = ((((long) digest[length]) & 255) << j) + j2;
                        length--;
                        j += 8;
                        j2 = j3;
                    }
                    return j2;
                }
            } catch (NameNotFoundException e2) {
                mo4742p().f26845d.m24653a("Package name not found", e2);
            }
        }
        return 0;
    }

    private final boolean m24924d(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = dr.f26667b.m24299a(context).m24298b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e) {
            mo4742p().f26845d.m24653a("Error obtaining certificate", e);
        } catch (NameNotFoundException e2) {
            mo4742p().f26845d.m24653a("Package name not found", e2);
        }
        return true;
    }
}
