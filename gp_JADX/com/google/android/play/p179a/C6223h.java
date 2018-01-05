package com.google.android.play.p179a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.common.http.UrlRules;
import com.google.android.play.p179a.p352a.aa;
import com.google.android.play.p179a.p352a.ab;
import com.google.android.play.p179a.p352a.ad;
import com.google.android.play.p179a.p352a.ae;
import com.google.android.play.p179a.p352a.ag;
import com.google.android.play.p179a.p352a.al;
import com.google.android.play.p179a.p352a.am;
import com.google.android.play.p179a.p352a.ao;
import com.google.android.play.p179a.p352a.ap;
import com.google.android.play.p179a.p352a.aq;
import com.google.android.play.p204d.C3211a;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.a;
import com.google.android.play.utils.k;
import com.google.android.play.utils.p354b.C6322j;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Semaphore;
import java.util.zip.GZIPOutputStream;

public final class C6223h implements C6217b, C6222u {
    public static final ad f31103a = new ad();
    public static final Object ab = new Object();
    public static Long ac = null;
    public static final HashSet f31104b = new HashSet();
    public static ag f31105c;
    public static final Object f31106d = new Object();
    public final long f31107A;
    public final long f31108B;
    public final long f31109C;
    public final boolean f31110D;
    public final boolean f31111E;
    public final boolean f31112F;
    public final boolean f31113G;
    public final long f31114H;
    public final boolean f31115I;
    public final boolean f31116J;
    public final boolean f31117K;
    public final boolean f31118L;
    public int f31119M;
    public ad f31120N;
    public volatile long f31121O;
    public volatile boolean f31122P;
    public C2481o f31123Q;
    public volatile boolean f31124R;
    public C6220f f31125S;
    public ConnectivityManager f31126T;
    public PowerManager f31127U;
    public volatile String f31128V;
    public C6230p f31129W;
    public volatile String f31130X;
    public C3211a f31131Y;
    public final long f31132Z;
    public final C6237y aa;
    public final Context f31133e;
    public final ContentResolver f31134f;
    public final String f31135g;
    public final C6234t f31136h;
    public final C6232r f31137i;
    public final Handler f31138j;
    public final Handler f31139k;
    public Runnable f31140l;
    public C2480c f31141m;
    public final String f31142n;
    public final String f31143o;
    public final String f31144p;
    public final int f31145q;
    public final Account f31146r;
    public final String f31147s;
    public final String f31148t;
    public final String f31149u;
    public final String f31150v;
    public final int f31151w;
    public final long f31152x;
    public final long f31153y;
    public final long f31154z;

    public C6223h(Context context, String str, C6229n c6229n, String str2, int i, long j, String str3, String str4, C6228m c6228m, Account account) {
        this(context, str, c6229n, str2, i, j, str3, str4, Locale.getDefault().getCountry(), c6228m, account, true);
    }

    public C6223h(Context context, String str, C6229n c6229n, String str2, long j, String str3, String str4, C6228m c6228m, Account account, boolean z) {
        this(context, str, c6229n, str2, -1, j, str3, str4, Locale.getDefault().getCountry(), c6228m, account, z);
    }

    private C6223h(Context context, String str, C6229n c6229n, String str2, int i, long j, String str3, String str4, String str5, C6228m c6228m, Account account, boolean z) {
        String str6;
        this.f31124R = false;
        this.f31132Z = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        synchronized (f31104b) {
            boolean add = f31104b.add(account);
            String valueOf = String.valueOf(account);
            a.a(add, new StringBuilder(String.valueOf(valueOf).length() + 40).append("Already instantiated an EventLogger for ").append(valueOf).toString());
        }
        Semaphore semaphore = new Semaphore(0);
        HandlerThread c6225j = new C6225j(C6223h.class.getName(), semaphore);
        c6225j.start();
        semaphore.acquireUninterruptibly();
        this.f31138j = new C6224i(this, c6225j.getLooper());
        File file = new File(context.getCacheDir(), c6228m.f31165a);
        if (account == null) {
            str6 = "null_account";
        } else {
            str6 = account.type;
            String str7 = account.name;
            str6 = new StringBuilder((String.valueOf(str6).length() + 1) + String.valueOf(str7).length()).append(str6).append(".").append(str7).toString();
        }
        File file2 = new File(file, Uri.encode(str6));
        if (account == null) {
            str6 = "null_account.metalog";
        } else {
            str6 = account.type;
            valueOf = account.name;
            str6 = new StringBuilder((String.valueOf(str6).length() + 9) + String.valueOf(valueOf).length()).append(str6).append(".").append(valueOf).append(".metalog").toString();
        }
        this.f31125S = new C6220f(new File(file, Uri.encode(str6)), this.f31138j);
        this.f31133e = context;
        this.f31126T = (ConnectivityManager) this.f31133e.getSystemService("connectivity");
        this.f31134f = context.getContentResolver();
        this.f31127U = (PowerManager) this.f31133e.getSystemService("power");
        this.f31151w = c6229n.f31203s;
        this.f31148t = null;
        this.f31146r = account;
        this.f31135g = str;
        this.f31137i = C6232r.m28732a();
        this.f31142n = str2;
        this.f31152x = j;
        this.f31119M = i;
        long j2 = 0;
        try {
            j2 = new BigInteger(Secure.getString(this.f31134f, "android_id"), 16).longValue();
        } catch (NumberFormatException e) {
            PlayCommonLog.c("Invalid device id: %s", new Object[]{str6});
            this.f31125S.m28704a(1);
        } catch (ArithmeticException e2) {
            PlayCommonLog.c("Invalid device id: %s", new Object[]{str6});
            this.f31125S.m28704a(1);
        } catch (NullPointerException e3) {
            PlayCommonLog.c("Null device id", new Object[0]);
            this.f31125S.m28704a(2);
        }
        this.f31153y = j2;
        this.f31149u = str3;
        this.f31147s = str4;
        this.f31150v = str5;
        this.f31143o = Uri.parse(c6228m.f31171g).buildUpon().appendQueryParameter((String) C6322j.f31582L.m28964b(), (String) C6322j.f31583M.m28964b()).appendQueryParameter((String) C6322j.f31584N.m28964b(), ((Boolean) C6322j.f31585O.m28964b()).toString()).build().toString();
        this.f31144p = c6228m.f31172h;
        this.f31154z = c6228m.f31169e;
        this.f31107A = c6228m.f31170f;
        this.f31145q = c6228m.f31173i;
        this.f31108B = ((c6228m.f31167c * 50) / 100) + 1;
        this.f31109C = (c6228m.f31167c * 125) / 100;
        this.f31110D = c6228m.f31174j;
        this.f31111E = c6228m.f31175k;
        this.f31112F = c6228m.f31176l;
        this.f31113G = c6228m.f31177m;
        this.f31114H = c6228m.f31183s;
        this.f31115I = c6228m.f31178n;
        this.f31116J = c6228m.f31179o;
        this.f31117K = c6228m.f31180p;
        this.f31118L = c6228m.f31182r;
        this.aa = new C6237y(this.f31144p, this.f31134f, this.f31145q);
        if (!(account == null || file2.exists())) {
            File file3 = new File(file, Uri.encode(account.name));
            if (file3.exists() && file3.isDirectory()) {
                file3.renameTo(file2);
            }
        }
        this.f31136h = new C6234t(file2, "eventlog.store", ".log", c6228m.f31167c, c6228m.f31166b, c6228m.f31168d, this, this.f31125S, z, c6228m.f31181q);
        this.f31139k = new Handler(Looper.getMainLooper());
        this.f31138j.sendEmptyMessage(1);
    }

    public final synchronized void m28721a(C2481o c2481o) {
        this.f31123Q = c2481o;
    }

    final synchronized C2481o m28725b() {
        return this.f31123Q;
    }

    public final void mo5353a(C6218d c6218d) {
        ao aoVar;
        long currentTimeMillis;
        if (c6218d instanceof C6231q) {
            aoVar = ((C6231q) c6218d).f31209f;
        } else {
            aoVar = null;
        }
        if (c6218d.f31087d == null) {
            currentTimeMillis = System.currentTimeMillis();
        } else {
            currentTimeMillis = c6218d.f31087d.longValue();
        }
        Long valueOf = Long.valueOf(currentTimeMillis);
        String str = c6218d.f31085b;
        C6219e c6219e = c6218d.f31086c;
        if (c6219e.f31093e == null) {
            c6219e.f31093e = new ad();
            if (c6219e.f31089a != null && c6219e.f31089a.length > 0) {
                c6219e.f31093e.f30749d = c6219e.f31089a;
            }
            if (c6219e.f31090b != null && c6219e.f31090b.length > 0) {
                c6219e.f31093e.f30750e = c6219e.f31090b;
            }
            if (c6219e.f31092d != null) {
                c6219e.f31093e.f30752g = c6219e.f31092d;
            }
            if (c6219e.f31091c != null) {
                c6219e.f31093e.f30751f = c6219e.f31091c;
            }
        }
        m28724a(str, c6219e.f31093e, c6218d.f31084a, valueOf.longValue(), aoVar, c6218d.f31088e);
    }

    public final void m28724a(String str, ad adVar, byte[] bArr, long j, ao aoVar, String... strArr) {
        if (this.f31111E) {
            this.f31138j.post(new C6226k(this, str, adVar, bArr, j, aoVar, strArr));
        } else {
            m28726b(str, adVar, bArr, j, aoVar, strArr);
        }
    }

    final void m28726b(String str, ad adVar, byte[] bArr, long j, ao aoVar, String[] strArr) {
        ap apVar;
        boolean z = strArr == null || strArr.length % 2 == 0;
        a.a(z, "Extras must be null or of even length.");
        if (this.f31110D) {
            apVar = new ap();
        } else {
            apVar = (ap) this.f31137i.f31212c.m28735a();
        }
        apVar.f30846b |= 1;
        apVar.f30847c = j;
        long rawOffset = (long) (TimeZone.getDefault().getRawOffset() / 1000);
        apVar.f30846b |= 512;
        apVar.f30858n = rawOffset;
        if (this.f31118L) {
            if (ac != null) {
                apVar.m28592a((ac.longValue() + this.f31132Z) + SystemClock.elapsedRealtime());
            } else {
                apVar.m28592a(this.f31132Z + SystemClock.elapsedRealtime());
                apVar.f30846b |= eq.FLAG_MOVED;
                apVar.f30863s = true;
            }
        }
        apVar.f30857m = adVar;
        if (this.f31113G) {
            apVar.f30861q = m28715g();
        }
        if (str == null) {
            throw new NullPointerException();
        }
        ao aoVar2;
        apVar.f30846b |= 2;
        apVar.f30848d = str;
        if (this.f31130X != null) {
            String str2 = this.f31130X;
            if (str2 == null) {
                throw new NullPointerException();
            }
            apVar.f30846b |= MemoryMappedFileBuffer.DEFAULT_PADDING;
            apVar.f30860p = str2;
        }
        if (bArr != null) {
            if (bArr == null) {
                throw new NullPointerException();
            }
            apVar.f30846b |= 64;
            apVar.f30854j = bArr;
        }
        if (!(strArr == null || strArr.length == 0)) {
            int length = strArr.length / 2;
            apVar.f30852h = new al[length];
            for (int i = 0; i < length; i++) {
                al alVar;
                if (this.f31110D) {
                    alVar = new al();
                } else {
                    alVar = (al) this.f31137i.f31213d.m28735a();
                }
                int i2 = i * 2;
                String str3 = strArr[i2];
                if (str3 == null) {
                    throw new NullPointerException();
                }
                alVar.f30822b |= 1;
                alVar.f30823c = str3;
                String str4 = strArr[i2 + 1] != null ? strArr[i2 + 1] : "null";
                if (str4 == null) {
                    throw new NullPointerException();
                }
                alVar.f30822b |= 2;
                alVar.f30824d = str4;
                apVar.f30852h[i] = alVar;
            }
        }
        apVar.f30862r = aoVar;
        if (apVar.f30862r == null && (this.f31115I || this.f31116J || this.f31117K)) {
            apVar.f30862r = this.f31137i.m28734b();
        }
        if (this.f31115I) {
            aoVar2 = apVar.f30862r;
            if (((aoVar2.f30838a & 1) != 0 ? 1 : null) == null) {
                int i3 = this.f31133e.getResources().getConfiguration().orientation;
                if (i3 == 1) {
                    aoVar2.m28585a(1);
                } else if (i3 == 2) {
                    aoVar2.m28585a(2);
                } else {
                    aoVar2.m28585a(0);
                }
            }
        }
        if (this.f31116J) {
            aoVar2 = apVar.f30862r;
            if (((aoVar2.f30838a & 2) != 0 ? 1 : null) == null) {
                if (VERSION.SDK_INT >= 21) {
                    aoVar2.m28586a(this.f31127U.isInteractive());
                } else {
                    aoVar2.m28586a(this.f31127U.isScreenOn());
                }
            }
        }
        if (this.f31117K) {
            aoVar2 = apVar.f30862r;
            if (((aoVar2.f30838a & 4) != 0 ? 1 : null) == null && this.f31131Y != null) {
                aoVar2.m28590b(!this.f31131Y.mo3376a());
            }
        }
        this.f31138j.obtainMessage(2, apVar).sendToTarget();
    }

    public final void mo5355a(Runnable runnable) {
        this.f31138j.obtainMessage(4, runnable).sendToTarget();
    }

    final void m28718a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (j > 0) {
            if (currentTimeMillis + j < this.f31121O) {
                j = this.f31121O - currentTimeMillis;
            }
            this.f31138j.sendEmptyMessageDelayed(3, j);
        } else {
            this.f31138j.sendEmptyMessage(3);
        }
        this.f31121O = Math.max(this.f31121O, currentTimeMillis + m28716h());
    }

    final void m28727c() {
        if (this.f31136h.m28742d() >= this.f31108B) {
            m28718a(0);
        }
    }

    public final void mo5351a() {
        this.f31122P = true;
    }

    public final void mo5352a(C2480c c2480c) {
        this.f31141m = c2480c;
    }

    public final void mo5356d() {
        this.f31120N = null;
        if (this.f31141m != null) {
            this.f31141m.mo2915a();
        }
    }

    final boolean m28729e() {
        int d = (int) this.f31136h.m28742d();
        int size = this.f31136h.f31227g.size();
        int e = (int) this.f31136h.m28743e();
        PlayCommonLog.a("Preparing logs for uploading", new Object[0]);
        if ((!this.f31136h.f31227g.isEmpty() ? 1 : null) == null) {
            PlayCommonLog.a("No file ready to send", new Object[0]);
            this.f31125S.m28705a(e > 0);
            return false;
        }
        try {
            long j;
            Object obj;
            Object a;
            byte[][] bArr;
            Object[] objArr;
            ArrayList arrayList = new ArrayList();
            long j2 = 0;
            do {
                C6234t c6234t = this.f31136h;
                if (c6234t.f31227g.isEmpty()) {
                    PlayCommonLog.c("This method should never be called when there are no written files.", new Object[0]);
                    obj = null;
                } else {
                    File file = (File) c6234t.f31227g.remove(0);
                    a = C6234t.m28737a(file);
                    c6234t.f31228h.add(file);
                    obj = a;
                }
                if (obj != null) {
                    if (obj.length > 0) {
                        arrayList.add(obj);
                        j2 = ((long) obj.length) + j2;
                    }
                    C6234t c6234t2 = this.f31136h;
                    if (c6234t2.f31227g.isEmpty()) {
                        j = -1;
                    } else {
                        j = ((File) c6234t2.f31227g.get(0)).length();
                    }
                    if (j < 0) {
                        break;
                    }
                } else {
                    break;
                }
            } while (j + j2 <= this.f31109C);
            if (arrayList.isEmpty()) {
                bArr = null;
            } else {
                objArr = new byte[arrayList.size()][];
                arrayList.toArray(objArr);
                Object[] objArr2 = objArr;
            }
            if (bArr == null) {
                PlayCommonLog.b("Thought we had files ready to send, but didn't", new Object[0]);
                this.f31125S.m28705a(e > 0);
                return false;
            }
            String str;
            C6220f c6220f = this.f31125S;
            j = System.currentTimeMillis();
            int a2 = C6216a.m28694a(this.f31126T.getActiveNetworkInfo());
            c6220f.f31100g = c6220f.f31101h;
            c6220f.f31101h = new aa();
            aa aaVar = c6220f.f31100g;
            aaVar.f30726b |= 1;
            aaVar.f30727c = j;
            aa aaVar2 = c6220f.f31100g;
            aaVar2.f30726b |= 4;
            aaVar2.f30731g = d;
            aaVar2 = c6220f.f31100g;
            aaVar2.f30726b |= 8;
            aaVar2.f30732h = size;
            aaVar2 = c6220f.f31100g;
            aaVar2.f30726b |= 16;
            aaVar2.f30733i = e;
            aaVar2 = c6220f.f31100g;
            aaVar2.f30734j = a2;
            aaVar2.f30726b |= 32;
            if (c6220f.f31098e.f30741g.length < 200) {
                ab abVar = c6220f.f31098e;
                a = c6220f.f31098e.f30741g;
                aa aaVar3 = c6220f.f31100g;
                if (aaVar3 == null) {
                    PlayCommonLog.d("Adding null to element array.", new Object[0]);
                    obj = a;
                } else {
                    objArr = (Object[]) Array.newInstance(aaVar3.getClass(), a.length + 1);
                    System.arraycopy(a, 0, objArr, 0, a.length);
                    objArr[objArr.length - 1] = aaVar3;
                }
                abVar.f30741g = (aa[]) obj;
            } else {
                ab abVar2 = c6220f.f31098e;
                int i = c6220f.f31098e.f30742h + 1;
                abVar2.f30735a |= 16;
                abVar2.f30742h = i;
            }
            c6220f.m28703a();
            aq aqVar = new aq();
            long currentTimeMillis = System.currentTimeMillis();
            aqVar.f30865a |= 2;
            aqVar.f30869e = currentTimeMillis;
            aqVar.f30870f = bArr;
            aqVar.f30867c = this.f31151w;
            aqVar.f30865a |= 1;
            ae aeVar = new ae();
            ag agVar = new ag();
            agVar.f30786c = aeVar;
            currentTimeMillis = this.f31152x;
            aeVar.f30753a |= 1;
            aeVar.f30754b = currentTimeMillis;
            currentTimeMillis = this.f31153y;
            aeVar.f30753a |= 4;
            aeVar.f30756d = currentTimeMillis;
            if (this.f31148t != null) {
                str = this.f31148t;
                if (str == null) {
                    throw new NullPointerException();
                }
                aeVar.f30753a |= 2;
                aeVar.f30755c = str;
            }
            int i2 = VERSION.SDK_INT;
            aeVar.f30753a |= 8;
            aeVar.f30757e = i2;
            str = Build.MANUFACTURER;
            if (str == null) {
                throw new NullPointerException();
            }
            aeVar.f30753a |= 8192;
            aeVar.f30767o = str;
            str = Build.MODEL;
            if (str == null) {
                throw new NullPointerException();
            }
            aeVar.f30753a |= 16;
            aeVar.f30758f = str;
            str = Build.PRODUCT;
            if (str == null) {
                throw new NullPointerException();
            }
            aeVar.f30753a |= 32;
            aeVar.f30759g = str;
            str = Build.HARDWARE;
            if (str == null) {
                throw new NullPointerException();
            }
            aeVar.f30753a |= 64;
            aeVar.f30760h = str;
            str = Build.DEVICE;
            if (str == null) {
                throw new NullPointerException();
            }
            aeVar.f30753a |= 128;
            aeVar.f30761i = str;
            str = Build.ID;
            if (str == null) {
                throw new NullPointerException();
            }
            aeVar.f30753a |= 256;
            aeVar.f30762j = str;
            str = Build.BRAND;
            if (str == null) {
                throw new NullPointerException();
            }
            aeVar.f30753a |= 16384;
            aeVar.f30768p = str;
            str = Build.BOARD;
            if (str == null) {
                throw new NullPointerException();
            }
            aeVar.f30753a |= 32768;
            aeVar.f30769q = str;
            str = Build.FINGERPRINT;
            if (str == null) {
                throw new NullPointerException();
            }
            aeVar.f30753a |= 131072;
            aeVar.f30771s = str;
            if (VERSION.SDK_INT >= 14) {
                str = Build.getRadioVersion();
            } else {
                str = Build.RADIO;
            }
            if (str != null) {
                if (str == null) {
                    throw new NullPointerException();
                }
                aeVar.f30753a |= 65536;
                aeVar.f30770r = str;
            }
            if (this.f31147s != null) {
                str = this.f31147s;
                if (str == null) {
                    throw new NullPointerException();
                }
                aeVar.f30753a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                aeVar.f30764l = str;
            }
            str = Locale.getDefault().getLanguage();
            if (str == null) {
                throw new NullPointerException();
            }
            aeVar.f30753a |= eq.FLAG_MOVED;
            aeVar.f30765m = str;
            if (this.f31150v != null) {
                str = this.f31150v;
                if (str == null) {
                    throw new NullPointerException();
                }
                aeVar.f30753a |= eq.FLAG_APPEARED_IN_PRE_LAYOUT;
                aeVar.f30766n = str;
            }
            if (this.f31119M != -1) {
                i2 = this.f31119M;
                aeVar.f30753a |= 262144;
                aeVar.f30772t = i2;
            }
            if (k.d(this.f31133e)) {
                aeVar.f30753a |= 524288;
                aeVar.f30773u = true;
            }
            if (this.f31149u != null) {
                aeVar.m28546a(this.f31149u);
            }
            if (this.f31129W != null) {
                if ((this.f31129W != C6230p.UNKNOWN ? 1 : null) != null) {
                    aeVar.f30774v = this.f31129W.f31208d;
                    aeVar.f30753a |= 1048576;
                }
            }
            agVar.f30785b = 4;
            agVar.f30784a |= 1;
            aqVar.f30866b = agVar;
            aqVar.f30872h = this.f31125S.f31098e;
            boolean a3 = m28712a(aqVar);
            if (a3) {
                this.f31136h.m28745g();
                return a3;
            }
            this.f31136h.m28746h();
            return a3;
        } catch (IOException e2) {
            PlayCommonLog.c("Failed to read logs", new Object[0]);
            this.f31125S.m28704a(6);
            this.f31136h.m28746h();
            return false;
        }
    }

    private final boolean m28712a(aq aqVar) {
        long elapsedRealtime;
        if (this.f31118L) {
            synchronized (ab) {
                if (ac == null) {
                    elapsedRealtime = this.f31132Z + SystemClock.elapsedRealtime();
                    C6237y c6237y = this.aa;
                    if (C6237y.f31236d == null) {
                        Long a = c6237y.m28749a();
                        if (a != null) {
                            C6237y.f31236d = Long.valueOf(a.longValue() - elapsedRealtime);
                        }
                    }
                    ac = C6237y.f31236d;
                }
            }
        }
        if (ac != null) {
            new Object[1][0] = ac;
            elapsedRealtime = ac.longValue();
            aqVar.f30865a |= 4;
            aqVar.f30873i = elapsedRealtime;
        }
        String a2 = m28711a(this.f31146r);
        if (!TextUtils.isEmpty(a2) || this.f31146r == null) {
            PlayCommonLog.a("Connecting to server: %s", new Object[]{this.f31143o});
            try {
                HttpURLConnection httpURLConnection;
                Object a3 = UrlRules.m5671a(this.f31134f).m5672a(this.f31143o).m5673a(this.f31143o);
                if (TextUtils.isEmpty(a3)) {
                    httpURLConnection = null;
                } else {
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(a3).openConnection();
                    httpURLConnection2.setConnectTimeout(this.f31145q);
                    httpURLConnection2.setReadTimeout(this.f31145q);
                    httpURLConnection2.setDoOutput(true);
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection2.setRequestProperty("Content-Type", "application/x-gzip");
                    httpURLConnection2.setRequestProperty("User-Agent", this.f31142n);
                    if (this.f31128V != null) {
                        httpURLConnection2.setRequestProperty("Cookie", this.f31128V);
                    }
                    if (a2 != null) {
                        Object obj;
                        if (this.f31135g.startsWith("oauth2:")) {
                            obj = "Bearer ";
                        } else {
                            obj = "GoogleLogin auth=";
                        }
                        String str = "Authorization";
                        String valueOf = String.valueOf(obj);
                        String valueOf2 = String.valueOf(a2);
                        httpURLConnection2.setRequestProperty(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                    }
                    httpURLConnection2.connect();
                    httpURLConnection = httpURLConnection2;
                }
                if (httpURLConnection == null) {
                    PlayCommonLog.a("Failed to connect to server: request was blocked", new Object[0]);
                    return true;
                }
                boolean a4;
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(httpURLConnection.getOutputStream());
                    gZIPOutputStream.write(C0757i.m4909a((C0757i) aqVar));
                    gZIPOutputStream.flush();
                    gZIPOutputStream.close();
                    a4 = m28713a(httpURLConnection, a2);
                    return a4;
                } catch (IOException e) {
                    PlayCommonLog.c("Failed to upload logs: %s", new Object[]{e.toString()});
                    a4 = this.f31125S;
                    a4.m28708d(3);
                    return false;
                } finally {
                    httpURLConnection.disconnect();
                }
            } catch (IOException e2) {
                PlayCommonLog.c("Failed to connect to server: %s", new Object[]{e2.toString()});
                this.f31125S.m28708d(2);
                return false;
            }
        }
        PlayCommonLog.b("Deferring log upload because couldn't retrieve auth token", new Object[0]);
        if (m28725b() != null) {
            if (this.f31140l == null) {
                this.f31140l = new C6227l(this);
            }
            this.f31139k.post(this.f31140l);
        }
        return false;
    }

    private final boolean m28713a(HttpURLConnection httpURLConnection, String str) {
        int responseCode = httpURLConnection.getResponseCode();
        C6220f c6220f = this.f31125S;
        aa aaVar = c6220f.f31100g;
        aaVar.f30726b |= 2;
        aaVar.f30730f = responseCode;
        c6220f.m28703a();
        String responseMessage = httpURLConnection.getResponseMessage();
        if (200 <= responseCode && responseCode < 300) {
            PlayCommonLog.a("Successfully uploaded logs.", new Object[0]);
            C6220f c6220f2 = this.f31125S;
            c6220f2.f31098e.m28537a();
            c6220f2.f31100g = null;
            c6220f2.m28703a();
            this.f31125S.m28706b((int) this.f31136h.m28743e());
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[128];
                int read;
                do {
                    read = inputStream.read(bArr);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                        continue;
                    }
                } while (read >= 0);
                am amVar = (am) C0757i.m4905a(new am(), byteArrayOutputStream.toByteArray());
                if (amVar.f30826b >= 0) {
                    m28714b(amVar.f30826b);
                }
                C6220f c6220f3 = this.f31125S;
                long j = amVar.f30827c;
                ab abVar = c6220f3.f31098e;
                abVar.f30735a |= 1;
                abVar.f30736b = j;
                c6220f3.m28703a();
                inputStream.close();
                return true;
            } catch (InvalidProtocolBufferNanoException e) {
                PlayCommonLog.c("Error parsing content: %s", new Object[]{e.toString()});
                return true;
            } catch (IllegalStateException e2) {
                PlayCommonLog.c("Error getting the content of the response body: %s", new Object[]{e2.toString()});
                return true;
            } catch (IOException e3) {
                PlayCommonLog.c("Error reading the content of the response body: %s", new Object[]{e3.toString()});
                return true;
            }
        } else if (300 <= responseCode && responseCode < 400) {
            PlayCommonLog.c("Too many redirects for HttpUrlConnection: %d", new Object[]{Integer.valueOf(responseCode)});
            return false;
        } else if (responseCode == 400) {
            PlayCommonLog.c("Server returned 400... deleting local malformed logs", new Object[0]);
            return true;
        } else if (responseCode == 401) {
            PlayCommonLog.b("Server returned 401... invalidating auth token", new Object[0]);
            if (this.f31146r != null) {
                AccountManager.get(this.f31133e).invalidateAuthToken(this.f31146r.type, str);
            }
            return false;
        } else if (responseCode == 500) {
            PlayCommonLog.b("Server returned 500... server crashed", new Object[0]);
            return false;
        } else if (responseCode == 501) {
            PlayCommonLog.b("Server returned 501... service doesn't seem to exist", new Object[0]);
            return false;
        } else if (responseCode == 502) {
            PlayCommonLog.b("Server returned 502... servers are down", new Object[0]);
            return false;
        } else if (responseCode == 503) {
            String headerField = httpURLConnection.getHeaderField("Retry-After");
            if (headerField != null) {
                boolean z;
                try {
                    PlayCommonLog.b("Server said to retry after %d seconds", new Object[]{Long.valueOf(Long.valueOf(headerField).longValue())});
                    m28714b(r4 * 1000);
                    z = true;
                } catch (NumberFormatException e4) {
                    responseMessage = "Unknown retry value: %s";
                    headerField = String.valueOf(headerField);
                    PlayCommonLog.c(headerField.length() != 0 ? responseMessage.concat(headerField) : new String(responseMessage), new Object[0]);
                    this.f31125S.m28708d(4);
                    z = false;
                }
                if (z) {
                    z = false;
                } else {
                    z = true;
                }
                return z;
            }
            PlayCommonLog.c("Status 503 without retry-after header", new Object[0]);
            return true;
        } else if (responseCode == 504) {
            PlayCommonLog.b("Server returned 504... timeout", new Object[0]);
            return false;
        } else {
            PlayCommonLog.c("Unexpected error received from server: %d %s", new Object[]{Integer.valueOf(responseCode), responseMessage});
            return true;
        }
    }

    private final void m28714b(long j) {
        this.f31121O = Math.max(m28716h(), j) + System.currentTimeMillis();
    }

    private final String m28711a(Account account) {
        String str = null;
        if (account == null) {
            PlayCommonLog.b("No account for auth token provided", new Object[0]);
        } else {
            try {
                str = AccountManager.get(this.f31133e).blockingGetAuthToken(account, this.f31135g, true);
            } catch (OperationCanceledException e) {
                PlayCommonLog.c("Failed to get auth token: %s", new Object[]{e.toString()});
                this.f31125S.m28708d(8);
            } catch (AuthenticatorException e2) {
                PlayCommonLog.c("Failed to get auth token: %s", new Object[]{e2.toString()});
                this.f31125S.m28708d(9);
            } catch (IOException e3) {
                PlayCommonLog.c("Failed to get auth token: %s", new Object[]{e3.toString()});
                this.f31125S.m28708d(10);
            } catch (IllegalArgumentException e4) {
                PlayCommonLog.c("Failed to get auth token: %s", new Object[]{e4.toString()});
                this.f31125S.m28708d(11);
            }
        }
        return str;
    }

    private final ag m28715g() {
        synchronized (f31106d) {
            if (f31105c == null) {
                f31105c = new ag();
                ae aeVar = new ae();
                if (this.f31149u != null) {
                    aeVar.m28546a(this.f31149u);
                }
                f31105c.f30786c = aeVar;
            }
        }
        return f31105c;
    }

    final long m28730f() {
        if (this.f31114H <= 0 || this.f31131Y == null || this.f31131Y.mo3376a()) {
            return this.f31154z;
        }
        return this.f31114H;
    }

    private final long m28716h() {
        if (this.f31114H <= 0 || this.f31131Y == null || this.f31131Y.mo3376a()) {
            return this.f31107A;
        }
        return this.f31114H;
    }

    public final /* synthetic */ void mo5354a(Object obj, OutputStream outputStream) {
        C0757i c0757i = (ap) obj;
        if (c0757i.f30857m == this.f31120N) {
            c0757i.f30857m = null;
        } else {
            this.f31120N = c0757i.f30857m;
            if (c0757i.f30857m == null) {
                c0757i.f30857m = f31103a;
            }
        }
        try {
            byte[] a = C0757i.m4909a(c0757i);
            int length = a.length;
            while ((length & -128) != 0) {
                outputStream.write((length & 127) | 128);
                length >>>= 7;
            }
            outputStream.write(length);
            outputStream.write(a);
        } catch (Exception e) {
            if (this.f31112F) {
                this.f31125S.m28704a(7);
                if (this.f31123Q != null) {
                    this.f31123Q.mo2916a(e);
                    return;
                }
                return;
            }
            throw e;
        }
    }
}
