package com.google.android.finsky.wear;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.download.C2839b;
import com.google.android.finsky.download.C2841d;
import com.google.android.finsky.download.C2850m;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.C5613a;
import com.google.android.gms.wearable.C5651m;
import com.google.android.gms.wearable.C5652n;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.b.a;
import com.google.wireless.android.finsky.b.ae;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class C4796q {
    public static final String[] f25032a = null;
    public static final String[] f25033b = null;
    public final String f25034c;
    public final String f25035d;
    public boolean f25036e;
    public boolean f25037f;
    public t f25038g;
    public ae f25039h = null;
    public File f25040i;
    public final Context f25041j;
    public final C4790k f25042k;
    public final C3646a f25043l;
    public final C2127b f25044m;
    public final C2850m f25045n;
    public final C3322j f25046o;
    public final C5058o f25047p;
    public final C4784e f25048q;

    public C4796q(String str, String str2, Context context, C4790k c4790k, C3646a c3646a, C2850m c2850m, C3322j c3322j, C5058o c5058o, C4784e c4784e) {
        this.f25034c = str;
        this.f25035d = str2;
        this.f25041j = context;
        this.f25042k = c4790k;
        this.f25043l = c3646a;
        this.f25045n = c2850m;
        this.f25046o = c3322j;
        this.f25047p = c5058o;
        this.f25048q = c4784e;
        this.f25044m = c3646a.f18022b;
    }

    public final void m22562a() {
        int i = 0;
        C3647b a = this.f25043l.m17243a(this.f25034c);
        if (a == null || a.f18029d == null) {
            FinskyLog.m21669e("Unexpected missing installer data for %s", this.f25034c);
            m22574e();
            return;
        }
        C2129c c2129c = a.f18029d;
        int i2 = c2129c.f10813g;
        C2129c c2129c2 = a.f18029d;
        int i3 = c2129c2.f10819m;
        this.f25037f = (i3 & 16) == 0;
        this.f25038g = new t();
        this.f25038g.a(c2129c2.f10809c);
        if (a.f18028c != null) {
            this.f25038g.b(a.f18028c.f11419d);
            this.f25038g.a(a.f18028c.f11422g);
        }
        if ((i3 & 512) != 0) {
            this.f25038g.b(true);
        }
        if (i2 > 0 && c2129c.f10811e != null) {
            m22565a(c2129c);
        }
        switch (i2) {
            case 0:
                i = -1;
                break;
            case 10:
                break;
            case 20:
            case 25:
            case 30:
            case 35:
            case 55:
            case 58:
                FinskyLog.m21669e("Illegal state for wearable, state %d for %s (%s)", Integer.valueOf(i2), this.f25034c, this.f25035d);
                m22574e();
                return;
            case 40:
                i = 10;
                break;
            case 45:
                FinskyLog.m21665c("Cannot restart %s (%s) from downloading state %d", this.f25034c, this.f25035d, Integer.valueOf(i2));
                m22574e();
                m22567a(this.f25034c, 905);
                return;
            case 50:
                FinskyLog.m21665c("Cannot restart %s (%s) from downloading state %d", this.f25034c, this.f25035d, Integer.valueOf(i2));
                m22566a(a);
                m22567a(this.f25034c, 909);
                return;
            case 52:
            case 57:
                FinskyLog.m21665c("Restarting %d for %s (%s)", Integer.valueOf(i2), this.f25034c, this.f25035d);
                m22566a(a);
                m22567a(this.f25034c, 907);
                return;
            case 60:
                i = -1;
                break;
            case 70:
                i = 70;
                break;
            case 90:
                FinskyLog.m21669e("Illegal state for wearable, state %d for %s (%s)", Integer.valueOf(i2), this.f25034c, this.f25035d);
                m22574e();
                return;
            default:
                FinskyLog.m21669e("Unknown state %d for %s (%s)", Integer.valueOf(i2), this.f25034c, this.f25035d);
                m22574e();
                return;
        }
        if (!(i == -1 || i == i2)) {
            m22564a(i, c2129c.f10814h);
        }
        m22568b();
    }

    final void m22568b() {
        while (true) {
            C3647b a = this.f25043l.m17243a(this.f25034c);
            if (a == null || a.f18029d == null) {
                FinskyLog.m21669e("Unexpected missing installer data for %s (%s)", this.f25034c, this.f25035d);
                m22574e();
            } else {
                C2129c c2129c = a.f18029d;
                long j;
                String str;
                switch (c2129c.f10813g) {
                    case 0:
                        C2322b c2322b = a.f18028c;
                        int i = c2322b != null ? c2322b.f11419d : -1;
                        C3654j a2 = new C3654j(C1473m.f7980a.aN()).m17261a(c2129c).m17262a(c2322b);
                        if (a2.m17269e()) {
                            if (a2.m17266b()) {
                                this.f25043l.f18022b.mo2669b(this.f25034c, i);
                            }
                            m22564a(70, null);
                        } else {
                            Object obj;
                            if (c2129c.f10811e == null) {
                                obj = null;
                            } else {
                                j = c2129c.f10812f;
                                if (j == 0 || j + ((Long) C0955b.ba.m28964b()).longValue() >= System.currentTimeMillis()) {
                                    obj = 1;
                                } else {
                                    this.f25044m.mo2665a(this.f25034c, null, 0);
                                    i = c2129c.f10819m;
                                    int i2 = i & -517;
                                    if (i2 != i) {
                                        this.f25044m.mo2675d(this.f25034c, i2);
                                    }
                                    obj = null;
                                }
                            }
                            if (obj == null) {
                                C2129c c2129c2 = a.f18029d;
                                String str2 = c2129c2.f10807a;
                                int i3 = c2129c2.f10809c;
                                String str3 = c2129c2.f10826t;
                                Account account = null;
                                str = c2129c2.f10822p;
                                C1473m c1473m = C1473m.f7980a;
                                if (!TextUtils.isEmpty(str)) {
                                    account = c1473m.mo2041U().mo1183b(str);
                                    if (account == null) {
                                        FinskyLog.m21665c("Account %s for update of %s no longer exists.", FinskyLog.m21655a(str), str2);
                                        this.f25044m.mo2674c(str2, null);
                                    }
                                }
                                if (account == null) {
                                    str = c2129c2.f10815i;
                                    account = c1473m.mo2041U().mo1183b(str);
                                }
                                if (account == null) {
                                    FinskyLog.m21659a("Invalid account %s", str);
                                    m22574e();
                                    m22567a(str2, 906);
                                    return;
                                }
                                String str4 = null;
                                String str5 = null;
                                if (a.f18028c != null) {
                                    str4 = a.f18028c.f11417b[0];
                                    if (c1473m.f7981b.getPackageName().equals(str2)) {
                                        str5 = a.f18028c.f11418c[0];
                                    }
                                }
                                C1473m.f7980a.mo2047a(str, this.f25035d).mo1600a(str2, c1473m.ah().mo2811a(account).mo2791f(C2229h.f11120a), Integer.valueOf(i3), null, null, null, null, f25032a, f25033b, str5, str4, true, str3, null, null, new C4797r(this, str2), new C4799t(this, str2));
                                m22564a(10, c2129c2.f10814h);
                                return;
                            }
                        }
                        break;
                    case 10:
                        break;
                    case 40:
                        break;
                    case 45:
                        return;
                    case 50:
                        C2129c c2129c3 = a.f18029d;
                        Uri parse = Uri.parse(c2129c3.f10814h);
                        m22563a(52, parse);
                        j = this.f25039h.d;
                        String str6 = this.f25039h.f;
                        FinskyLog.m21659a("Prepare to copy %s (%s) from %s (expect %d bytes)", this.f25034c, this.f25035d, str, Long.valueOf(j));
                        bb.m21792a(new C4800u(this, c2129c3, parse, j, str6), new Void[0]);
                        return;
                    case 60:
                        if (((Boolean) C0955b.eA.m28964b()).booleanValue()) {
                            if ("com.google.android.gms".equals(this.f25034c)) {
                                m22571b(a);
                                return;
                            } else {
                                bb.m21792a(new C4801v(this, a), this.f25040i);
                                return;
                            }
                        }
                        m22571b(a);
                        return;
                    case 70:
                        this.f25042k.m22547a(a);
                        this.f25042k.m22548a(this);
                        return;
                    case 90:
                        FinskyLog.m21659a("Installation of %s (%s) now waiting for wearable to process", this.f25034c, this.f25035d);
                        this.f25042k.m22548a(this);
                        return;
                    default:
                        FinskyLog.m21669e("Bad state %d for %s (%s)", Integer.valueOf(c2129c.f10813g), this.f25034c, this.f25035d);
                        m22574e();
                        return;
                }
                m22565a(c2129c);
                m22570b(c2129c);
                return;
            }
        }
        FinskyLog.m21669e("Unexpected missing installer data for %s (%s)", this.f25034c, this.f25035d);
        m22574e();
    }

    final void m22564a(int i, String str) {
        this.f25044m.mo2662a(this.f25034c, i, str);
    }

    final void m22563a(int i, Uri uri) {
        m22564a(i, uri != null ? uri.toString() : null);
    }

    final void m22566a(C3647b c3647b) {
        FinskyLog.m21659a("Cancel running installation of %s (%s)", this.f25034c, this.f25035d);
        C2839b a = this.f25045n.mo3171a(this.f25034c, this.f25035d);
        if (a != null) {
            this.f25045n.mo3180c(a);
        }
        m22573d();
        this.f25042k.m22547a(c3647b);
        this.f25042k.m22548a(this);
    }

    final void m22565a(C2129c c2129c) {
        boolean z = true;
        long j = c2129c.f10811e.b;
        int i = c2129c.f10819m;
        if ((i & eq.FLAG_MOVED) == 0) {
            this.f25036e = (i & 2) != 0;
            if (!this.f25036e) {
                C2129c a = C1473m.f7980a.mo2169c().mo2657a(this.f25034c);
                if (a != null) {
                    i = a.f10819m;
                    if ((i & eq.FLAG_MOVED) == 0 && (i & 2) != 0) {
                        this.f25036e = z;
                    }
                }
            }
            return;
        }
        z = false;
        this.f25036e = z;
    }

    final void m22570b(C2129c c2129c) {
        int i;
        if (this.f25046o.m16694a(c2129c.f10811e.b, Environment.getDataDirectory())) {
            i = 0;
        } else {
            FinskyLog.m21667d("Cancel download of %s (%s) because insufficient free space", this.f25034c, this.f25035d);
            m22574e();
            C4790k c4790k = this.f25042k;
            String str = this.f25034c;
            String str2 = this.f25035d;
            C4789j a = new C4789j(112, this.f25048q).m22537b(this.f25034c).m22538c("no-internal-storage").m22533a(908).m22534a(this.f25038g);
            a.f24996b = this.f25035d;
            c4790k.m22545a(str, str2, a.m22536a());
            i = 1;
        }
        if (i == 0) {
            a aVar = c2129c.f10811e;
            ae aeVar = new ae();
            long j = aVar.b;
            aeVar.b |= 2;
            aeVar.d = j;
            j = aVar.c;
            aeVar.b |= 4;
            aeVar.e = j;
            str2 = aVar.d;
            if (str2 == null) {
                throw new NullPointerException();
            }
            aeVar.b |= 8;
            aeVar.f = str2;
            str2 = aVar.f;
            if (str2 == null) {
                throw new NullPointerException();
            }
            aeVar.b |= 32;
            aeVar.h = str2;
            str2 = aVar.g;
            if (str2 == null) {
                throw new NullPointerException();
            }
            aeVar.b |= 64;
            aeVar.i = str2;
            aeVar.j = aVar.q;
            this.f25039h = aeVar;
            this.f25044m.mo2680e(this.f25034c, this.f25034c);
            str = c2129c.f10818l;
            str2 = c2129c.f10807a;
            int i2 = c2129c.f10819m;
            int i3 = i2 & -4613;
            String str3 = this.f25039h.h;
            long j2 = this.f25039h.d;
            if (i3 != i2) {
                this.f25044m.mo2675d(str2, i3);
            }
            C2839b a2 = C2841d.m15023a(str3, str, str2, this.f25035d, j2, j2, !this.f25036e, !this.f25037f);
            this.f25045n.mo3173a(a2);
            C4790k c4790k2 = this.f25042k;
            str2 = a2.mo3168r();
            String str4 = this.f25035d;
            C4789j a3 = new C4789j(100, this.f25048q).m22537b(a2.mo3168r()).m22534a(this.f25038g);
            a3.f24996b = this.f25035d;
            c4790k2.m22545a(str2, str4, a3.m22536a());
            m22564a(40, null);
            this.f25042k.m22555c();
        }
    }

    final OutputStream m22572c() {
        File file = new File(new File(this.f25041j.getCacheDir(), "wear"), Uri.encode(this.f25035d));
        file.mkdirs();
        File file2 = new File(file, String.valueOf(this.f25034c).concat(".apk"));
        try {
            OutputStream fileOutputStream = new FileOutputStream(file2);
            this.f25040i = file2;
            return fileOutputStream;
        } catch (IOException e) {
            file2.delete();
            throw e;
        }
    }

    final void m22573d() {
        if (this.f25040i != null) {
            this.f25040i.delete();
            this.f25040i = null;
        }
    }

    final void m22571b(C3647b c3647b) {
        C2129c c2129c = c3647b.f18029d;
        long currentTimeMillis = System.currentTimeMillis();
        String a = ck.m22512a(this.f25035d, currentTimeMillis);
        m22569b(106, a);
        String str = this.f25034c;
        int i = c2129c.f10809c;
        String str2 = this.f25035d;
        String stringBuilder = new StringBuilder((String.valueOf(str).length() + 14) + String.valueOf(str2).length()).append(str).append("-v").append(i).append("-").append(str2).toString();
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
            ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
            str2 = this.f25034c;
            str2 = new StringBuilder((String.valueOf(str2).length() + 16) + String.valueOf(stringBuilder).length()).append("/wearable_info/").append(str2).append("/").append(stringBuilder).toString();
            FinskyLog.m21659a("Writing Asset to install %s (%s) to %s", this.f25034c, this.f25035d, str2);
            C5651m a2 = C5651m.m26837a(str2);
            a2.f28707b.m26644a("asset", Asset.m26607a(parcelFileDescriptor));
            C5613a c5613a = C5652n.f28708a;
            C5058o c5058o = this.f25047p;
            PutDataRequest a3 = a2.m26838a();
            a3.f28571e = 0;
            c5613a.mo5117a(c5058o, a3).mo4490a(new C4802w(this, str2, a, c3647b));
            bb.m21792a(new C4803x(this, a, c3647b, stringBuilder, currentTimeMillis), this.f25040i, parcelFileDescriptor2);
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Could not create a pipe", new Object[0]);
            m22566a(c3647b);
        }
    }

    public final void m22574e() {
        C3647b a = this.f25043l.m17243a(this.f25034c);
        if (a == null || a.f18029d == null || a.f18029d.f10813g < 50) {
            m22566a(a);
            return;
        }
        FinskyLog.m21659a("Cannot cancel installing %s (%s) - too late", this.f25034c, this.f25035d);
    }

    final void m22567a(String str, int i) {
        C4790k c4790k = this.f25042k;
        String str2 = this.f25035d;
        C4789j a = new C4789j(104, this.f25048q).m22537b(str).m22533a(i).m22534a(this.f25038g);
        a.f24996b = this.f25035d;
        c4790k.m22545a(str, str2, a.m22536a());
    }

    final void m22569b(int i, String str) {
        C4790k c4790k = this.f25042k;
        String str2 = this.f25034c;
        String str3 = this.f25035d;
        C4789j a = new C4789j(i, this.f25048q).m22537b(this.f25034c).m22534a(this.f25038g);
        a.f24996b = this.f25035d;
        c4790k.m22545a(str2, str3, a.m22535a(str).m22536a());
    }
}
