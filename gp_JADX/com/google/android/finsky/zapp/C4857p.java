package com.google.android.finsky.zapp;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.support.v4.p037h.C0304u;
import android.util.Base64;
import android.util.Log;
import com.google.android.finsky.zapp.p267a.C4833b;
import com.google.android.finsky.zapp.utils.C4863a;
import com.google.android.finsky.zapp.utils.C4865c;
import com.google.android.finsky.zapp.utils.C4867e;
import com.google.android.finsky.zapp.utils.C4868f;
import com.google.android.finsky.zapp.utils.C4869g;
import com.google.android.finsky.zapp.utils.ModuleDecompressionException;
import com.google.android.finsky.zapp.utils.ModulePatchApplicationException;
import com.google.compression.brotli.dec.b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.GZIPInputStream;

final class C4857p extends C4833b {
    public static final ArrayList f25158a = new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2)}));
    public static final ArrayList f25159b = new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)}));
    public static final Set f25160c = Collections.singleton("com.google.android.gms");
    public final Context f25161d;
    public final C4848l f25162e;
    public final C4850h f25163f;
    public final C4854m f25164g;
    public final ArrayList f25165h = new ArrayList();

    C4857p(Context context, C4848l c4848l, C4850h c4850h, C4854m c4854m) {
        this.f25161d = context.getApplicationContext();
        this.f25162e = c4848l;
        this.f25163f = c4850h;
        this.f25164g = c4854m;
    }

    public final Bundle mo4406a(List list) {
        List arrayList = new ArrayList();
        for (Bundle bundle : list) {
            if (bundle.containsKey("name")) {
                arrayList.add(new C4845b(bundle.getString("name"), bundle.getString("version_code"), bundle.getBoolean("metered"), bundle.getString("existing_version_code"), bundle.getString("patch_module_base_external_path")));
            } else {
                throw new IllegalArgumentException("Bundle must contain module name!");
            }
        }
        boolean b = m22723b(arrayList);
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("download_successful", b);
        return bundle2;
    }

    private final synchronized boolean m22723b(List list) {
        boolean z;
        File a = this.f25164g.m22691a();
        if (a == null) {
            z = false;
        } else {
            Object obj;
            int i;
            String packageName = this.f25161d.getPackageName();
            if (f25160c.contains(packageName)) {
                obj = 1;
            } else {
                loop0:
                for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) this.f25161d.getSystemService("activity")).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.importance <= 125) {
                        if (packageName.equals(runningAppProcessInfo.processName)) {
                            obj = 1;
                            break;
                        }
                        for (Object equals : runningAppProcessInfo.pkgList) {
                            if (packageName.equals(equals)) {
                                obj = 1;
                                break loop0;
                            }
                        }
                        continue;
                    }
                }
                obj = null;
            }
            if (obj == null) {
                z = false;
            } else {
                int i2;
                C0304u c0304u = new C0304u();
                SharedPreferences b = this.f25164g.m22693b();
                C0304u a2 = C4857p.m22704a(b, c0304u);
                int size = a2.size() + c0304u.size();
                i = 0;
                int i3 = 0;
                while (i3 < a2.size()) {
                    if (((C4843a) a2.m1630c(i3)).f25136q >= i) {
                        i2 = ((C4843a) a2.m1630c(i3)).f25136q + 1;
                    } else {
                        i2 = i;
                    }
                    i3++;
                    i = i2;
                }
                if (m22714a(a2)) {
                    int i4;
                    C4843a c4843a;
                    C0304u c0304u2 = new C0304u(a2.size());
                    C0304u c0304u3 = new C0304u(list.size());
                    i3 = 0;
                    C0304u c0304u4 = new C0304u(a2.size());
                    for (i4 = 0; i4 < a2.size(); i4++) {
                        c4843a = (C4843a) a2.m1630c(i4);
                        if (m22701a(c4843a.f25120a, true) == 6) {
                            c0304u4.put(c4843a.f25120a, c4843a.f25121b);
                        }
                    }
                    c0304u4 = m22705a(list, i, c0304u4);
                    if (c0304u4 == null) {
                        z = false;
                    } else {
                        C4843a c4843a2;
                        Object obj2 = null;
                        for (C4844d a3 : list) {
                            c4843a = (C4843a) c0304u4.get(a3.mo4414a());
                            int a4 = a2.m1626a(c4843a.m22657e());
                            c4843a2 = a4 >= 0 ? (C4843a) a2.m1630c(a4) : null;
                            if (c4843a2 == null || c4843a2.f25138s == 16 || !c4843a.f25121b.equals(c4843a2.f25121b)) {
                                c0304u3.put(c4843a.m22657e(), c4843a);
                            } else {
                                c4843a2.f25126g = Integer.valueOf(C4846c.m22668a(this.f25161d));
                                obj2 = 1;
                                c0304u2.put(c4843a2.m22657e(), c4843a2);
                                if (c4843a2.f25138s == 8) {
                                    i2 = i3 + 1;
                                } else {
                                    i2 = i3;
                                }
                                a2.m1631d(a4);
                                i3 = i2;
                            }
                        }
                        for (i = 0; i < a2.size(); i++) {
                            c4843a = (C4843a) a2.m1630c(i);
                            if (c4843a.f25138s != 16) {
                                c0304u2.put(c4843a.m22657e(), c4843a);
                            }
                        }
                        if (size > 0 && list.size() == size && c0304u2.size() == size && i3 == 0 && c0304u3.isEmpty() && r5 == null) {
                            z = true;
                        } else {
                            for (i = 0; i < c0304u3.size(); i++) {
                                c4843a = (C4843a) c0304u3.m1630c(i);
                                c0304u2.put(c4843a.m22657e(), c4843a);
                            }
                            if (i3 > 0) {
                                ArrayList arrayList = new ArrayList(i3);
                                for (i3 = 0; i3 < c0304u2.size(); i3++) {
                                    c4843a = (C4843a) c0304u2.m1630c(i3);
                                    if (c4843a.f25138s == 8) {
                                        arrayList.add(c4843a);
                                    }
                                }
                                ArrayList arrayList2 = arrayList;
                                i4 = arrayList2.size();
                                i3 = 0;
                                while (i3 < i4) {
                                    Object obj3 = arrayList2.get(i3);
                                    i3++;
                                    c4843a2 = (C4843a) obj3;
                                    int b2 = m22718b(c4843a2);
                                    if ((b2 & 1) != 0) {
                                        c0304u.put(c4843a2.f25137r, Boolean.TRUE);
                                        if ((b2 & 4) != 0) {
                                            c4843a2.f25137r = null;
                                        } else {
                                            c0304u2.remove(c4843a2.f25120a);
                                        }
                                    }
                                }
                            }
                            if (!c0304u3.isEmpty()) {
                                long j = 0;
                                for (i = 0; i < c0304u3.size(); i++) {
                                    j += ((C4843a) c0304u3.m1630c(i)).f25123d;
                                }
                                if (C4857p.m22716a(a, j)) {
                                    m22721b(c0304u3);
                                } else {
                                    Log.e("DynamicModuleDownloader", "low disk");
                                    z = false;
                                }
                            }
                            Editor edit = b.edit();
                            edit.clear();
                            for (i = 0; i < c0304u2.size(); i++) {
                                c4843a = (C4843a) c0304u2.m1630c(i);
                                edit.putString(c4843a.m22656d(), c4843a.toString());
                            }
                            if (!edit.commit()) {
                                Log.e("DynamicModuleDownloader", "Failed to store updated downloads list, no new modules will be downloaded");
                                c0304u.clear();
                                for (i3 = 0; i3 < c0304u3.size(); i3++) {
                                    c4843a = (C4843a) c0304u3.m1630c(i3);
                                    C4863a.m22748a(c4843a.f25137r != null);
                                    c0304u.put(c4843a.f25137r, Boolean.TRUE);
                                }
                            }
                            if (!c0304u.isEmpty()) {
                                long[] jArr = new long[c0304u.size()];
                                for (i = 0; i < jArr.length; i++) {
                                    jArr[i] = ((Long) c0304u.m1629b(i)).longValue();
                                }
                                this.f25162e.mo4422b(jArr);
                            }
                            m22727d();
                            z = true;
                        }
                    }
                } else {
                    Log.e("DynamicModuleDownloader", "bad download state");
                    z = false;
                }
            }
        }
        return z;
    }

    public final Bundle mo4405a(Bundle bundle) {
        Integer num = null;
        if (bundle.containsKey("name")) {
            C4843a a;
            String str;
            String string = bundle.getString("name");
            C4843a a2 = this.f25164g.m22690a(string);
            if (bundle.getBoolean("ingest")) {
                a = m22706a(string, this.f25164g.m22690a(string));
                if (a == null) {
                    str = null;
                } else {
                    str = this.f25164g.m22692a(a);
                }
            } else if (a2 != null) {
                str = this.f25164g.m22692a(a2);
            } else {
                str = null;
            }
            Bundle bundle2 = new Bundle();
            if (str != null) {
                bundle2.putString("file_path", str);
            }
            a = this.f25164g.m22690a(string);
            if (a == null || !this.f25164g.m22694b(a).exists()) {
                str = null;
            } else {
                str = a.f25121b;
            }
            if (str != null) {
                bundle2.putString("version_code", str);
            }
            bundle2.putInt("module_status", m22701a(string, true));
            bundle2.putInt("pending_module_status", m22701a(string, false));
            a = this.f25164g.m22690a(string);
            if (a != null && this.f25164g.m22694b(a).exists()) {
                num = a.f25126g;
            }
            if (num != null) {
                bundle2.putInt("apk_version_at_which_offered", num.intValue());
            }
            if (!(a2 == null || a2.f25124e == null)) {
                bundle2.putString("hash_sha256", a2.f25124e);
            }
            return bundle2;
        }
        throw new IllegalArgumentException("Bundle must contain module name");
    }

    public final Bundle mo4407b(Bundle bundle) {
        m22709a();
        return new Bundle();
    }

    private final synchronized void m22709a() {
        int i = 0;
        synchronized (this) {
            C0304u c0304u = new C0304u();
            SharedPreferences b = this.f25164g.m22693b();
            C0304u a = C4857p.m22704a(b, c0304u);
            if (!(a.isEmpty() && c0304u.isEmpty())) {
                int i2;
                C4843a c4843a;
                for (i2 = 0; i2 < a.size(); i2++) {
                    c4843a = (C4843a) a.m1630c(i2);
                    if (c4843a.f25137r != null) {
                        c0304u.put(c4843a.f25137r, Boolean.TRUE);
                    }
                    m22712a(c4843a, 4, 0);
                }
                Editor edit = b.edit();
                edit.clear();
                for (i2 = 0; i2 < a.size(); i2++) {
                    c4843a = (C4843a) a.m1630c(i2);
                    if (!c0304u.containsKey(c4843a.f25137r)) {
                        edit.putString(c4843a.m22656d(), c4843a.toString());
                    }
                }
                if (edit.commit()) {
                    if (!c0304u.isEmpty()) {
                        long[] jArr = new long[c0304u.size()];
                        while (i < jArr.length) {
                            jArr[i] = ((Long) c0304u.m1629b(i)).longValue();
                            i++;
                        }
                        this.f25162e.mo4422b(jArr);
                    }
                    m22727d();
                } else {
                    Log.w("DynamicModuleDownloader", "Failed to store updated downloads list, not canceling downloads");
                }
            }
        }
    }

    private final int m22701a(String str, boolean z) {
        C0304u c = m22725c();
        if (c == null) {
            return 0;
        }
        C4843a c4843a = null;
        int i = 0;
        while (i < c.size()) {
            C4843a c4843a2 = (C4843a) c.m1630c(i);
            if (c4843a2.f25120a.equals(str)) {
                if (c4843a2.f25137r != null) {
                    continue;
                    i++;
                    c4843a = c4843a2;
                } else if (z) {
                    return C4857p.m22700a(c4843a2);
                }
            }
            c4843a2 = c4843a;
            i++;
            c4843a = c4843a2;
        }
        if (c4843a != null) {
            return C4857p.m22700a(c4843a);
        }
        return 0;
    }

    private static int m22700a(C4843a c4843a) {
        if (c4843a.f25137r == null) {
            return 6;
        }
        switch (c4843a.f25138s) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 4:
                return 2;
            case 8:
                return 5;
            case 16:
                return 1;
            default:
                return 0;
        }
    }

    public final Bundle mo4408c(Bundle bundle) {
        if (bundle.containsKey("name")) {
            C4843a a = this.f25164g.m22690a(bundle.getString("name"));
            if (a == null) {
                return C4857p.m22703a(false);
            }
            File b = this.f25164g.m22694b(a);
            if (!b.exists()) {
                return C4857p.m22703a(false);
            }
            if (!b.delete()) {
                return C4857p.m22703a(false);
            }
            Editor edit = this.f25164g.m22693b().edit();
            edit.remove(C4843a.m22650b(a.f25120a));
            return C4857p.m22703a(edit.commit());
        }
        throw new IllegalArgumentException("Bundle must contain module name");
    }

    private static Bundle m22703a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("delete_successful", z);
        return bundle;
    }

    public final Bundle mo4409d(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("cleanup_successful", m22722b());
        return bundle2;
    }

    private final boolean m22722b() {
        File b;
        C0304u a = C4857p.m22704a(this.f25164g.m22693b(), null);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < a.size(); i++) {
            b = this.f25164g.m22694b((C4843a) a.m1630c(i));
            if (b != null && b.exists()) {
                hashMap.put(b.getAbsolutePath(), (C4843a) a.m1630c(i));
            }
        }
        b = this.f25164g.m22691a();
        if (b == null) {
            return false;
        }
        File[] listFiles = b.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (int i2 = 0; i2 < listFiles.length; i2++) {
            if (!hashMap.containsKey(listFiles[i2].getAbsolutePath())) {
                boolean delete = listFiles[i2].delete();
                boolean z2 = z & delete;
                m22710a(9, delete ? 0 : -1011);
                z = z2;
            }
        }
        m22727d();
        return z;
    }

    private final C4843a m22706a(String str, C4843a c4843a) {
        C0304u c = m22725c();
        if (c == null) {
            return c4843a;
        }
        for (int i = 0; i < c.size(); i++) {
            C4843a c4843a2 = (C4843a) c.m1630c(i);
            if (c4843a2.f25120a.equals(str) && c4843a2.f25137r != null && c4843a2.f25138s == 8 && (c4843a == null || (c4843a2.f25136q > c4843a.f25136q && !c4843a2.f25121b.equals(c4843a.f25121b)))) {
                return m22719b(c4843a2.f25137r.longValue());
            }
        }
        return c4843a;
    }

    public final Bundle mo4404a(long j) {
        C4843a b = m22719b(j);
        Bundle bundle = new Bundle();
        if (b != null) {
            bundle.putString("com.google.android.finsky.zapp.MODULE_NAME", b.f25120a);
            bundle.putInt("com.google.android.finsky.zapp.DOWNLOAD_STATUS", C4857p.m22700a(b));
        }
        return bundle;
    }

    private final synchronized C4843a m22719b(long j) {
        int i = 1;
        C4843a c4843a = null;
        synchronized (this) {
            String l = Long.toString(j);
            SharedPreferences b = this.f25164g.m22693b();
            String string = b.getString(l, null);
            C4843a a = string != null ? C4843a.m22649a(string) : null;
            if (a != null) {
                Closeable a2 = this.f25162e.mo4420a(j);
                if (a2 != null) {
                    try {
                        if (a2.moveToFirst() && a2.getCount() <= i) {
                            int b2;
                            i = a2.getInt(a2.getColumnIndexOrThrow("status"));
                            switch (i) {
                                case 8:
                                    m22712a(a, 3, 0);
                                    b2 = m22718b(a);
                                    break;
                                case 16:
                                    m22712a(a, 5, i);
                                    b2 = 2;
                                    break;
                                default:
                                    break;
                            }
                            if ((b2 & 16) != 0) {
                                a.m22654b();
                                m22711a(b, m22729e(a), l, j);
                            } else if ((b2 & 8) != 0) {
                                a.m22651a();
                                m22711a(b, m22729e(a), l, j);
                            } else if ((b2 & 1) != 0) {
                                Editor edit = b.edit();
                                edit.remove(l);
                                if ((b2 & 4) != 0) {
                                    a.f25137r = null;
                                    edit.putString(a.m22656d(), a.toString());
                                }
                                if (edit.commit()) {
                                    this.f25162e.mo4422b(j);
                                }
                            }
                            a.f25138s = i;
                            m22727d();
                            c4843a = a;
                        }
                    } finally {
                        C4857p.m22713a(a2);
                    }
                }
                l = a.f25120a;
                Log.w("DynamicModuleDownloader", new StringBuilder(String.valueOf(l).length() + 62).append("Failed to query DownloadMgr for completion status of module '").append(l).append("'").toString());
                C4857p.m22713a(a2);
            }
        }
        return c4843a;
    }

    private final C0304u m22725c() {
        C0304u a = C4857p.m22704a(this.f25164g.m22693b(), null);
        if (m22714a(a)) {
            return a;
        }
        Log.e("DynamicModuleDownloader", "bad download state");
        return null;
    }

    private static C0304u m22704a(SharedPreferences sharedPreferences, C0304u c0304u) {
        Map all = sharedPreferences.getAll();
        C0304u c0304u2 = new C0304u(all.size());
        for (Entry entry : all.entrySet()) {
            C4843a c4843a;
            Object value = entry.getValue();
            String str = value instanceof String ? (String) value : null;
            if (str != null) {
                C4843a a = C4843a.m22649a(str);
                if (a == null) {
                    try {
                        long parseLong = Long.parseLong((String) entry.getKey());
                        if (c0304u != null) {
                            c0304u.put(Long.valueOf(parseLong), Boolean.TRUE);
                        }
                        c4843a = a;
                    } catch (NumberFormatException e) {
                    }
                }
                c4843a = a;
            } else {
                c4843a = null;
            }
            if (c4843a != null) {
                c4843a = (C4843a) c0304u2.put(c4843a.m22657e(), c4843a);
                if (c4843a != null) {
                    String str2 = c4843a.f25120a;
                    Log.e("DynamicModuleDownloader", new StringBuilder(String.valueOf(str2).length() + 41).append("Found two download requests for module '").append(str2).append("'").toString());
                    if (!(c4843a.f25137r == null || c0304u == null)) {
                        c0304u.put(c4843a.f25137r, Boolean.TRUE);
                    }
                }
            }
        }
        return c0304u2;
    }

    private final boolean m22714a(C0304u c0304u) {
        int i;
        C0304u c0304u2 = new C0304u(c0304u.size());
        for (i = 0; i < c0304u.size(); i++) {
            C4843a c4843a = (C4843a) c0304u.m1630c(i);
            if (c4843a.f25137r != null) {
                c0304u2.put(c4843a.f25137r, c4843a);
                c4843a.f25138s = 16;
            } else {
                c4843a.f25138s = 0;
            }
        }
        if (c0304u2.isEmpty()) {
            return true;
        }
        long[] jArr = new long[c0304u2.size()];
        for (i = 0; i < c0304u2.size(); i++) {
            jArr[i] = ((Long) c0304u2.m1629b(i)).longValue();
        }
        Closeable a = this.f25162e.mo4420a(jArr);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    int columnIndexOrThrow = a.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = a.getColumnIndexOrThrow("status");
                    while (true) {
                        c4843a = (C4843a) c0304u2.remove(Long.valueOf(a.getLong(columnIndexOrThrow)));
                        C4863a.m22748a(c4843a != null);
                        c4843a.f25138s = a.getInt(columnIndexOrThrow2);
                        if (c4843a.f25138s == 16) {
                            String str = "DynamicModuleDownloader";
                            String str2 = "download status failed for ";
                            String valueOf = String.valueOf(c4843a.f25120a);
                            Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                        }
                        if (!a.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (IllegalArgumentException e) {
                Log.e("DynamicModuleDownloader", "Missing DownloadManager column, aborting");
                return false;
            } finally {
                C4857p.m22713a(a);
            }
        }
        C4857p.m22713a(a);
        return true;
    }

    private final C0304u m22705a(List list, int i, C0304u c0304u) {
        C0304u c0304u2 = new C0304u(list.size());
        if (list.isEmpty()) {
            return c0304u2;
        }
        c0304u2 = new C0304u(list.size());
        int i2 = 0;
        while (i2 < list.size()) {
            C4844d c4844d = (C4844d) list.get(i2);
            C4844d c4844d2 = (C4844d) c0304u2.put(c4844d.mo4414a(), c4844d);
            if (c4844d2 == null || c4844d2.equals(c4844d)) {
                i2++;
            } else {
                String a = c4844d.mo4414a();
                Log.e("DynamicModuleDownloader", new StringBuilder(String.valueOf(a).length() + 57).append("Ignoring malformed download request (duplicate module '").append(a).append("')").toString());
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        List arrayList = new ArrayList(c0304u2.size());
        for (int i3 = 0; i3 < c0304u2.size(); i3++) {
            c4844d = (C4844d) c0304u2.m1630c(i3);
            Bundle bundle = new Bundle();
            String a2 = c4844d.mo4414a();
            bundle.putString("name", a2);
            if (c4844d.mo4415b() != null) {
                bundle.putString("version_code", c4844d.mo4415b());
            }
            if (c0304u.containsKey(a2)) {
                bundle.putString("existing_version_code", (String) c0304u.get(a2));
            } else {
                String c = c4844d.mo4416c();
                if (c != null) {
                    bundle.putString("existing_version_code", c);
                    a = c4844d.mo4417d();
                    if (a != null) {
                        hashMap.put(C4857p.m22708a(a2, c), a);
                    }
                }
            }
            bundle.putIntegerArrayList("supported_compression_formats", f25158a);
            bundle.putIntegerArrayList("supported_patch_formats", f25159b);
            arrayList.add(bundle);
        }
        C4851i a3 = this.f25163f.mo4423a(this.f25161d, arrayList);
        Object obj;
        if (a3 == null || a3.f25150a != 0) {
            obj = null;
            if (a3 != null) {
                obj = a3.f25150a;
                if (a3.f25152c != null) {
                    a = String.valueOf(obj);
                    obj = new StringBuilder(String.valueOf(a).length() + 12).append(a).append(",").append(a3.f25152c.getInt("error_code")).toString();
                }
            }
            String str = "DynamicModuleDownloader";
            String str2 = "Zapp module request failed: ";
            a = String.valueOf(obj);
            Log.e(str, a.length() != 0 ? str2.concat(a) : new String(str2));
            return null;
        }
        for (Bundle bundle2 : a3.f25151b) {
            String string = bundle2.getString("name");
            str = bundle2.getString("download_url");
            str2 = bundle2.getString("version_code");
            if (str2 == null || str2.isEmpty()) {
                str2 = Long.toString(bundle2.getLong("version"));
            }
            long j = bundle2.getLong("size", -1);
            String string2 = bundle2.getString("hash_sha256");
            if (string == null || str == null || j <= 0 || str2.isEmpty() || string2 == null) {
                Log.w("DynamicModuleDownloader", new StringBuilder(String.valueOf(string).length() + 46).append("Ignoring malformed Zapp response for module '").append(string).append("'").toString());
            } else {
                Uri a4 = C4857p.m22702a(str);
                if (a4 == null) {
                    Log.w("DynamicModuleDownloader", new StringBuilder((String.valueOf(string).length() + 41) + String.valueOf(str).length()).append("Ignoring invalid Zapp URL for module '").append(string).append("': ").append(str).toString());
                } else {
                    Integer num;
                    Long l;
                    Uri uri;
                    String str3;
                    String str4;
                    String str5;
                    Integer num2;
                    Long l2;
                    Uri uri2;
                    Uri a5 = C4857p.m22702a(bundle2.getString("compressed_download_url"));
                    Long valueOf = Long.valueOf(bundle2.getLong("compressed_download_size"));
                    Integer valueOf2 = Integer.valueOf(bundle2.getInt("compression_format"));
                    if (a5 == null || valueOf.longValue() == 0 || !f25158a.contains(valueOf2)) {
                        num = null;
                        l = null;
                        uri = null;
                    } else {
                        num = valueOf2;
                        l = valueOf;
                        uri = a5;
                    }
                    Uri a6 = C4857p.m22702a(bundle2.getString("patch_download_url"));
                    Long valueOf3 = Long.valueOf(bundle2.getLong("patch_size"));
                    Integer valueOf4 = Integer.valueOf(bundle2.getInt("patch_format"));
                    String string3 = bundle2.getString("patch_module_base_version");
                    str = bundle2.getString("patch_module_base_signature");
                    a = (String) hashMap.get(C4857p.m22708a(string, string3));
                    if (a6 == null || valueOf3.longValue() == 0 || !f25159b.contains(valueOf4) || string3 == null || ((!string3.equals(c0304u.get(string)) && a == null) || str == null)) {
                        str3 = null;
                        str4 = null;
                        str5 = null;
                        num2 = null;
                        l2 = null;
                        uri2 = null;
                    } else {
                        str3 = a;
                        str4 = str;
                        str5 = string3;
                        num2 = valueOf4;
                        l2 = valueOf3;
                        uri2 = a6;
                    }
                    try {
                        string3 = C4865c.m22750a(string2);
                        C4844d c4844d3 = (C4844d) c0304u2.get(string);
                        if (c4844d3 == null) {
                            Log.w("DynamicModuleDownloader", new StringBuilder(String.valueOf(string).length() + 51).append("Ignoring Zapp module response for unknown module '").append(string).append('\"').toString());
                        } else {
                            obj = (c4844d3.mo4415b() == null || c4844d3.mo4415b().equals(str2)) ? 1 : null;
                            if (obj == null) {
                                str = c4844d3.mo4415b();
                                Log.e("DynamicModuleDownloader", new StringBuilder(((String.valueOf(string).length() + 56) + String.valueOf(str).length()) + String.valueOf(str2).length()).append("Zapp module ").append(string).append(" has incorrect version (expected ").append(str).append(", offered ").append(str2).append(")").toString());
                                return null;
                            }
                            C4843a c4843a = new C4843a(c4844d3.mo4414a(), str2, a4, j, string3, i, c4844d3.mo4418e(), C4846c.m22668a(this.f25161d));
                            if (uri != null) {
                                c4843a.m22652a(uri, l.longValue(), num.intValue());
                            }
                            if (uri2 != null) {
                                c4843a.m22653a(uri2, l2.longValue(), num2.intValue(), str5, str4, str3);
                            }
                            if (((C4843a) c0304u2.put(c4844d3.mo4414a(), c4843a)) != null) {
                                Log.w("DynamicModuleDownloader", new StringBuilder(String.valueOf(string).length() + 53).append("Received duplicate Zapp module response for module '").append(string).append("'").toString());
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        Log.e("DynamicModuleDownloader", new StringBuilder(String.valueOf(string).length() + 37).append("Ignoring invalid SHA256 for module '").append(string).append("'").toString());
                    }
                }
            }
        }
        if (c0304u2.size() == c0304u2.size()) {
            return c0304u2;
        }
        Log.e("DynamicModuleDownloader", "Zapp module info missing, aborting download");
        return null;
    }

    private static String m22708a(String str, String str2) {
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(":").append(str2).toString();
    }

    private final int m22718b(C4843a c4843a) {
        String str;
        Throwable th;
        Closeable closeable;
        int i = 2;
        m22712a(c4843a, 6, 0);
        File a = this.f25164g.m22691a();
        if (a == null) {
            Log.e("DynamicModuleDownloader", "No module root");
            return 0;
        } else if (C4857p.m22716a(a, c4843a.f25123d)) {
            File file = new File(a, C4854m.m22689c(c4843a));
            C4865c.m22752a(file);
            try {
                Closeable autoCloseInputStream = new AutoCloseInputStream(this.f25162e.mo4421a(c4843a.f25137r.longValue()));
                Closeable fileOutputStream = new FileOutputStream(file);
                try {
                    Closeable c4869g = new C4869g(fileOutputStream);
                    try {
                        C4868f b;
                        if (c4843a.f25130k != null) {
                            b = m22720b(c4843a, autoCloseInputStream, c4869g);
                        } else if (c4843a.f25127h != null) {
                            try {
                                b = m22707a(c4843a, (InputStream) autoCloseInputStream, (C4869g) c4869g);
                            } catch (ModuleDecompressionException e) {
                                Log.e("DynamicModuleDownloader", e.getMessage());
                                str = c4843a.f25120a;
                                Log.i("DynamicModuleDownloader", new StringBuilder(String.valueOf(str).length() + 39).append("Requesting full download for module '").append(str).append("'.").toString());
                                C4857p.m22713a(c4869g);
                                C4857p.m22713a(fileOutputStream);
                                C4857p.m22713a(autoCloseInputStream);
                                return 8;
                            }
                        } else {
                            try {
                                b = C4867e.m22754a(autoCloseInputStream, c4869g, 2);
                            } catch (IOException e2) {
                                Log.e("DynamicModuleDownloader", "Failed copying downloaded module: false");
                                m22712a(c4843a, 8, -1001);
                                C4857p.m22713a(c4869g);
                                C4857p.m22713a(fileOutputStream);
                                C4857p.m22713a(autoCloseInputStream);
                                return i;
                            }
                        }
                        C4857p.m22713a(c4869g);
                        C4857p.m22713a(fileOutputStream);
                        C4857p.m22713a(autoCloseInputStream);
                        String str2 = c4843a.f25120a;
                        str2 = new StringBuilder(String.valueOf(str2).length() + 21).append("Downloaded module '").append(str2).append("' ").toString();
                        if (b.f25174a == c4843a.f25123d && C4865c.m22750a(b.f25175b).equals(c4843a.f25124e)) {
                            X509Certificate[][] a2 = C4861t.m22743a(file);
                            if (a2 == null || a2.length == 0 || a2[0].length == 0) {
                                str2 = c4843a.f25120a;
                                Log.e("DynamicModuleDownloader", new StringBuilder(String.valueOf(str2).length() + 35).append("Downloaded module '").append(str2).append("' is not signed.").toString());
                                i = 0;
                            } else if (m22717a(a2)) {
                                Log.v("DynamicModuleDownloader", "Signatures are verified from app signatures.");
                                i = 1;
                            } else if (m22724b(a2)) {
                                Log.v("DynamicModuleDownloader", "Signatures are verified from split signatures.");
                                i = 1;
                            } else {
                                Log.e("DynamicModuleDownloader", "Signatures could not be verified.");
                                i = 0;
                            }
                            if (i == 0) {
                                m22712a(c4843a, 8, -1006);
                                return 1;
                            }
                            if (c4843a.f25130k != null) {
                                m22710a(13, 0);
                            } else if (c4843a.f25127h != null) {
                                m22710a(10, 0);
                            }
                            m22712a(c4843a, 7, 0);
                            return 5;
                        }
                        if (b.f25174a != c4843a.f25123d) {
                            long j;
                            if (c4843a.f25130k != null) {
                                j = b.f25174a;
                                Log.e("DynamicModuleDownloader", new StringBuilder(String.valueOf(str2).length() + 122).append("Patched file ").append(str2).append("has incorrect length (").append(j).append(" vs ").append(c4843a.f25123d).append("). Retrying to download compressed version.").toString());
                                m22712a(c4843a, 8, -1017);
                                m22712a(c4843a, 13, -1017);
                            } else if (c4843a.f25127h != null) {
                                j = b.f25174a;
                                Log.e("DynamicModuleDownloader", new StringBuilder(String.valueOf(str2).length() + 124).append("Uncompressed ").append(str2).append("has incorrect length (").append(j).append(" vs ").append(c4843a.f25123d).append("). Retrying to download uncompressed version.").toString());
                                m22712a(c4843a, 8, -1010);
                                m22712a(c4843a, 10, -1010);
                            } else {
                                j = b.f25174a;
                                Log.e("DynamicModuleDownloader", new StringBuilder(String.valueOf(str2).length() + 67).append(str2).append("has incorrect length (").append(j).append(" vs ").append(c4843a.f25123d).append(")").toString());
                                m22712a(c4843a, 8, -1003);
                            }
                        } else if (c4843a.f25130k != null) {
                            r3 = c4843a.f25124e;
                            r0 = C4865c.m22750a(b.f25175b);
                            Log.e("DynamicModuleDownloader", new StringBuilder((String.valueOf(r3).length() + 87) + String.valueOf(r0).length()).append("Expected sha256 for patched file is ").append(r3).append(" but got ").append(r0).append(". Retrying to download compressed version.").toString());
                            m22712a(c4843a, 8, -1018);
                            m22712a(c4843a, 13, -1018);
                        } else if (c4843a.f25127h != null) {
                            r3 = c4843a.f25124e;
                            r0 = C4865c.m22750a(b.f25175b);
                            Log.e("DynamicModuleDownloader", new StringBuilder((String.valueOf(r3).length() + 95) + String.valueOf(r0).length()).append("Expected sha256 for de-compressed file is ").append(r3).append(" but got ").append(r0).append(". Retrying to download uncompressed version.").toString());
                            m22712a(c4843a, 8, -1007);
                            m22712a(c4843a, 10, -1007);
                        } else {
                            Log.e("DynamicModuleDownloader", String.valueOf(str2).concat("has incorrect sha256"));
                            m22712a(c4843a, 8, -1005);
                        }
                        if (c4843a.f25130k != null) {
                            return 16;
                        }
                        if (c4843a.f25127h != null) {
                            return 8;
                        }
                        return 3;
                    } catch (ModulePatchApplicationException e3) {
                        Log.e("DynamicModuleDownloader", e3.getMessage());
                        str = c4843a.f25120a;
                        Log.i("DynamicModuleDownloader", new StringBuilder(String.valueOf(str).length() + 45).append("Requesting compressed download for module '").append(str).append("'.").toString());
                        C4857p.m22713a(c4869g);
                        C4857p.m22713a(fileOutputStream);
                        C4857p.m22713a(autoCloseInputStream);
                        return 16;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = c4869g;
                        C4857p.m22713a(closeable);
                        C4857p.m22713a(fileOutputStream);
                        C4857p.m22713a(autoCloseInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    closeable = null;
                    C4857p.m22713a(closeable);
                    C4857p.m22713a(fileOutputStream);
                    C4857p.m22713a(autoCloseInputStream);
                    throw th;
                }
            } catch (FileNotFoundException e4) {
                Log.e("DynamicModuleDownloader", "Downloaded file could not be found or copied! Re-trying download!");
                m22712a(c4843a, 8, -1001);
                return i;
            }
        } else {
            Log.e("DynamicModuleDownloader", "low disk");
            return 0;
        }
    }

    private final C4868f m22707a(C4843a c4843a, InputStream inputStream, C4869g c4869g) {
        InputStream bVar;
        String str;
        switch (c4843a.f25129j.intValue()) {
            case 1:
                try {
                    bVar = new b(inputStream, 8192);
                    break;
                } catch (IOException e) {
                    m22712a(c4843a, 8, -1008);
                    m22712a(c4843a, 10, -1008);
                    str = c4843a.f25120a;
                    throw new ModuleDecompressionException(new StringBuilder(String.valueOf(str).length() + 88).append("Failed to read the brotli compressed file for module '").append(str).append("'. Retrying uncompressed download.").toString());
                }
            case 2:
                try {
                    bVar = new GZIPInputStream(inputStream, 8192);
                    break;
                } catch (IOException e2) {
                    m22712a(c4843a, 8, -1008);
                    m22712a(c4843a, 10, -1008);
                    str = c4843a.f25120a;
                    throw new ModuleDecompressionException(new StringBuilder(String.valueOf(str).length() + 86).append("Failed to read the gzip compressed file for module '").append(str).append("'. Retrying uncompressed download.").toString());
                }
            default:
                m22712a(c4843a, 8, -1009);
                m22712a(c4843a, 10, -1009);
                str = String.valueOf(c4843a.f25129j);
                String str2 = c4843a.f25120a;
                throw new ModuleDecompressionException(new StringBuilder((String.valueOf(str).length() + 85) + String.valueOf(str2).length()).append("Unknown compression format (").append(str).append(") received for module '").append(str2).append("'. Retrying uncompressed download.").toString());
        }
        try {
            return C4867e.m22754a(bVar, c4869g, 2);
        } catch (IOException e3) {
            m22712a(c4843a, 8, -1008);
            m22712a(c4843a, 10, -1008);
            str = c4843a.f25120a;
            throw new ModuleDecompressionException(new StringBuilder(String.valueOf(str).length() + 48).append("Failed copying compressed module for module: '").append(str).append("'.").toString());
        }
    }

    private final C4868f m22720b(C4843a c4843a, InputStream inputStream, C4869g c4869g) {
        String str;
        try {
            if (((long) inputStream.available()) != c4843a.f25131l.longValue()) {
                m22712a(c4843a, 8, -1018);
                m22712a(c4843a, 13, -1018);
                str = c4843a.f25120a;
                throw new ModulePatchApplicationException(new StringBuilder(String.valueOf(str).length() + 66).append("Size of downloaded patch file for module '").append(str).append("' could not be verified.").toString());
            }
            File c = m22726c(c4843a);
            if (c == null) {
                m22712a(c4843a, 8, -1012);
                m22712a(c4843a, 13, -1012);
                str = c4843a.f25120a;
                throw new ModulePatchApplicationException(new StringBuilder(String.valueOf(str).length() + 71).append("Patch base is not available for module '").append(str).append("'. Retrying compressed version.").toString());
            }
            try {
                int intValue = c4843a.f25132m.intValue();
                Object obj = (intValue == 2 || intValue == 3 || intValue == 4) ? 1 : null;
                if (obj != null) {
                    inputStream = new GZIPInputStream(inputStream, 8192);
                } else if (c4843a.f25132m.intValue() == 5) {
                    inputStream = new b(inputStream, 8192);
                }
                if (m22715a(c4843a, c, inputStream, (OutputStream) c4869g)) {
                    return new C4868f(Base64.encodeToString(c4869g.f25177b.digest(), 11), c4869g.f25178c);
                }
                str = c4843a.f25120a;
                throw new ModulePatchApplicationException(new StringBuilder(String.valueOf(str).length() + 39).append("Patch application failed for module '").append(str).append("'.").toString());
            } catch (IOException e) {
                m22712a(c4843a, 8, -1019);
                m22712a(c4843a, 13, -1019);
                str = c4843a.f25120a;
                throw new ModulePatchApplicationException(new StringBuilder(String.valueOf(str).length() + 58).append("The downloaded patch file for module '").append(str).append("' could not be read.").toString());
            }
        } catch (IOException e2) {
            m22712a(c4843a, 8, -1019);
            m22712a(c4843a, 13, -1019);
            str = c4843a.f25120a;
            throw new ModulePatchApplicationException(new StringBuilder(String.valueOf(str).length() + 58).append("The downloaded patch file for module '").append(str).append("' could not be read.").toString());
        }
    }

    private final File m22726c(C4843a c4843a) {
        File file;
        if (c4843a.f25135p == null) {
            Log.i("DynamicModuleDownloader", "Using cached base module file.");
            file = new File(this.f25164g.m22691a(), C4854m.m22688a(c4843a.f25120a, c4843a.f25133n));
        } else {
            Log.i("DynamicModuleDownloader", "Using base module file stored externally.");
            file = new File(c4843a.f25135p);
        }
        try {
            String str = C4867e.m22754a(new FileInputStream(file), null, 1).f25175b;
            if (str == null || str.equals(c4843a.f25134o)) {
                return file;
            }
            String str2 = c4843a.f25120a;
            Log.e("DynamicModuleDownloader", new StringBuilder(String.valueOf(str2).length() + 55).append("Base module file for module '").append(str2).append("' has incorrect SHA1 hash.").toString());
            str2 = "DynamicModuleDownloader";
            String str3 = "Expected: ";
            String valueOf = String.valueOf(c4843a.f25134o);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            str2 = "DynamicModuleDownloader";
            str3 = "Obtained: ";
            valueOf = String.valueOf(str);
            Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            return null;
        } catch (IOException e) {
            Log.e("DynamicModuleDownloader", "Base module file could not be read while computing its hash.");
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m22715a(com.google.android.finsky.zapp.C4843a r7, java.io.File r8, java.io.InputStream r9, java.io.OutputStream r10) {
        /*
        r6 = this;
        r0 = 1;
        r1 = 0;
        r2 = r8.exists();
        if (r2 != 0) goto L_0x000d;
    L_0x0008:
        r0 = r6.m22728d(r7);
    L_0x000c:
        return r0;
    L_0x000d:
        r2 = r7.f25132m;
        r2 = r2.intValue();
        if (r2 == r0) goto L_0x0027;
    L_0x0015:
        r2 = r7.f25132m;
        r2 = r2.intValue();
        r3 = 2;
        if (r2 == r3) goto L_0x0027;
    L_0x001e:
        r2 = r7.f25132m;
        r2 = r2.intValue();
        r3 = 3;
        if (r2 != r3) goto L_0x002e;
    L_0x0027:
        r1 = new java.io.RandomAccessFile;	 Catch:{ FileNotFoundException -> 0x008d }
        r2 = "r";
        r1.<init>(r8, r2);	 Catch:{ FileNotFoundException -> 0x008d }
    L_0x002e:
        r2 = r7.f25132m;	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r2 = r2.intValue();	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        switch(r2) {
            case 1: goto L_0x0094;
            case 2: goto L_0x0094;
            case 3: goto L_0x009e;
            default: goto L_0x0037;
        };	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
    L_0x0037:
        r0 = "DynamicModuleDownloader";
        r2 = r7.f25120a;	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r3 = r7.f25132m;	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r4 = java.lang.String.valueOf(r2);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r4 = r4.length();	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r4 = r4 + 55;
        r5 = java.lang.String.valueOf(r3);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r5 = r5.length();	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r4 = r4 + r5;
        r5 = new java.lang.StringBuilder;	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r5.<init>(r4);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r4 = "Module '";
        r4 = r5.append(r4);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r2 = r4.append(r2);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r4 = "' is delivered with unexpected patch format '";
        r2 = r2.append(r4);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r2 = r2.append(r3);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r3 = "'.";
        r2 = r2.append(r3);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r2 = r2.toString();	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        android.util.Log.e(r0, r2);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r0 = 8;
        r2 = -1013; // 0xfffffffffffffc0b float:NaN double:NaN;
        r6.m22712a(r7, r0, r2);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r0 = 13;
        r2 = -1013; // 0xfffffffffffffc0b float:NaN double:NaN;
        r6.m22712a(r7, r0, r2);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        com.google.android.finsky.zapp.C4857p.m22713a(r1);
        r0 = 0;
        goto L_0x000c;
    L_0x008d:
        r0 = move-exception;
        r0 = r6.m22728d(r7);
        goto L_0x000c;
    L_0x0094:
        r2 = r7.f25123d;	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        com.google.archivepatcher.applier.b.a.a(r1, r9, r10, r2);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        com.google.android.finsky.zapp.C4857p.m22713a(r1);
        goto L_0x000c;
    L_0x009e:
        r2 = r7.f25123d;	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        r2 = java.lang.Long.valueOf(r2);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        com.google.archivepatcher.applier.a.b.a(r1, r10, r9, r2);	 Catch:{ PatchFormatException -> 0x00ac, IOException -> 0x010f, Exception -> 0x014c }
        com.google.android.finsky.zapp.C4857p.m22713a(r1);
        goto L_0x000c;
    L_0x00ac:
        r0 = move-exception;
        r2 = "DynamicModuleDownloader";
        r3 = r7.f25120a;	 Catch:{ all -> 0x010a }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x010a }
        r4 = r4.length();	 Catch:{ all -> 0x010a }
        r4 = r4 + 35;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x010a }
        r5.<init>(r4);	 Catch:{ all -> 0x010a }
        r4 = "Module '";
        r4 = r5.append(r4);	 Catch:{ all -> 0x010a }
        r3 = r4.append(r3);	 Catch:{ all -> 0x010a }
        r4 = "' patch content is invalid.";
        r3 = r3.append(r4);	 Catch:{ all -> 0x010a }
        r3 = r3.toString();	 Catch:{ all -> 0x010a }
        android.util.Log.e(r2, r3);	 Catch:{ all -> 0x010a }
        r2 = "DynamicModuleDownloader";
        r3 = "Error message: ";
        r0 = r0.getMessage();	 Catch:{ all -> 0x010a }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x010a }
        r4 = r0.length();	 Catch:{ all -> 0x010a }
        if (r4 == 0) goto L_0x0104;
    L_0x00e9:
        r0 = r3.concat(r0);	 Catch:{ all -> 0x010a }
    L_0x00ed:
        android.util.Log.e(r2, r0);	 Catch:{ all -> 0x010a }
        r0 = 8;
        r2 = -1014; // 0xfffffffffffffc0a float:NaN double:NaN;
        r6.m22712a(r7, r0, r2);	 Catch:{ all -> 0x010a }
        r0 = 13;
        r2 = -1014; // 0xfffffffffffffc0a float:NaN double:NaN;
        r6.m22712a(r7, r0, r2);	 Catch:{ all -> 0x010a }
        com.google.android.finsky.zapp.C4857p.m22713a(r1);
    L_0x0101:
        r0 = 0;
        goto L_0x000c;
    L_0x0104:
        r0 = new java.lang.String;	 Catch:{ all -> 0x010a }
        r0.<init>(r3);	 Catch:{ all -> 0x010a }
        goto L_0x00ed;
    L_0x010a:
        r0 = move-exception;
        com.google.android.finsky.zapp.C4857p.m22713a(r1);
        throw r0;
    L_0x010f:
        r0 = move-exception;
        r0 = "DynamicModuleDownloader";
        r2 = r7.f25120a;	 Catch:{ all -> 0x010a }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x010a }
        r3 = r3.length();	 Catch:{ all -> 0x010a }
        r3 = r3 + 44;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x010a }
        r4.<init>(r3);	 Catch:{ all -> 0x010a }
        r3 = "Module '";
        r3 = r4.append(r3);	 Catch:{ all -> 0x010a }
        r2 = r3.append(r2);	 Catch:{ all -> 0x010a }
        r3 = "' patch failed with an IO-Exception.";
        r2 = r2.append(r3);	 Catch:{ all -> 0x010a }
        r2 = r2.toString();	 Catch:{ all -> 0x010a }
        android.util.Log.e(r0, r2);	 Catch:{ all -> 0x010a }
        r0 = 8;
        r2 = -1015; // 0xfffffffffffffc09 float:NaN double:NaN;
        r6.m22712a(r7, r0, r2);	 Catch:{ all -> 0x010a }
        r0 = 13;
        r2 = -1015; // 0xfffffffffffffc09 float:NaN double:NaN;
        r6.m22712a(r7, r0, r2);	 Catch:{ all -> 0x010a }
        com.google.android.finsky.zapp.C4857p.m22713a(r1);
        goto L_0x0101;
    L_0x014c:
        r0 = move-exception;
        r0 = "DynamicModuleDownloader";
        r2 = r7.f25120a;	 Catch:{ all -> 0x010a }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x010a }
        r3 = r3.length();	 Catch:{ all -> 0x010a }
        r3 = r3 + 48;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x010a }
        r4.<init>(r3);	 Catch:{ all -> 0x010a }
        r3 = "Module '";
        r3 = r4.append(r3);	 Catch:{ all -> 0x010a }
        r2 = r3.append(r2);	 Catch:{ all -> 0x010a }
        r3 = "' patch failed with a generic exception.";
        r2 = r2.append(r3);	 Catch:{ all -> 0x010a }
        r2 = r2.toString();	 Catch:{ all -> 0x010a }
        android.util.Log.e(r0, r2);	 Catch:{ all -> 0x010a }
        r0 = 8;
        r2 = -1016; // 0xfffffffffffffc08 float:NaN double:NaN;
        r6.m22712a(r7, r0, r2);	 Catch:{ all -> 0x010a }
        r0 = 13;
        r2 = -1016; // 0xfffffffffffffc08 float:NaN double:NaN;
        r6.m22712a(r7, r0, r2);	 Catch:{ all -> 0x010a }
        com.google.android.finsky.zapp.C4857p.m22713a(r1);
        goto L_0x0101;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.zapp.p.a(com.google.android.finsky.zapp.a, java.io.File, java.io.InputStream, java.io.OutputStream):boolean");
    }

    private final boolean m22728d(C4843a c4843a) {
        String str = c4843a.f25120a;
        String str2 = c4843a.f25133n;
        Log.e("DynamicModuleDownloader", new StringBuilder((String.valueOf(str).length() + 90) + String.valueOf(str2).length()).append("Base file for the patch of module '").append(str).append("' not found. Base version for the expected file was '").append(str2).append("'.").toString());
        m22712a(c4843a, 8, -1012);
        m22712a(c4843a, 13, -1012);
        return false;
    }

    private final void m22721b(C0304u c0304u) {
        for (int i = 0; i < c0304u.size(); i++) {
            C4843a c4843a = (C4843a) c0304u.m1630c(i);
            c4843a.f25137r = Long.valueOf(this.f25162e.mo4419a(c4843a.m22655c(), c4843a.f25125f));
            m22712a(c4843a, 1, 0);
        }
    }

    private final C4843a m22729e(C4843a c4843a) {
        c4843a.f25137r = Long.valueOf(this.f25162e.mo4419a(c4843a.m22655c(), c4843a.f25125f));
        m22712a(c4843a, 1, 0);
        return c4843a;
    }

    private final void m22711a(SharedPreferences sharedPreferences, C4843a c4843a, String str, long j) {
        Editor edit = sharedPreferences.edit();
        edit.remove(str);
        edit.putString(c4843a.m22656d(), c4843a.toString());
        if (edit.commit()) {
            this.f25162e.mo4422b(j);
        }
    }

    private static boolean m22716a(File file, long j) {
        return file.getUsableSpace() >= 4 * j;
    }

    private static Uri m22702a(String str) {
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        boolean z = false;
        String scheme = parse.getScheme();
        if (scheme != null) {
            z = "https".equals(scheme.toLowerCase());
        }
        if (z) {
            return parse;
        }
        return null;
    }

    private final boolean m22717a(X509Certificate[][] x509CertificateArr) {
        List list;
        int i;
        Signature[] a = C4861t.m22741a(this.f25161d);
        if (a == null) {
            list = null;
        } else {
            list = new ArrayList();
            for (Signature a2 : a) {
                X509Certificate a3 = C4861t.m22740a(a2);
                if (a3 != null) {
                    list.add(a3);
                }
            }
        }
        if (list == null || list.isEmpty()) {
            Log.e("DynamicModuleDownloader", "No certificates found for app.");
            return false;
        }
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            boolean z;
            i = i2 + 1;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(i2);
            for (X509Certificate[] x509CertificateArr2 : x509CertificateArr) {
                if (x509CertificateArr2[0].equals(x509Certificate)) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (z) {
                i2 = i;
            } else {
                Log.i("DynamicModuleDownloader", "Module certificate could not be verified from the app certificates.");
                return false;
            }
        }
        return true;
    }

    private final boolean m22724b(X509Certificate[][] x509CertificateArr) {
        List<X509Certificate> b = C4861t.m22745b(this.f25161d);
        if (b == null || b.isEmpty()) {
            return false;
        }
        for (X509Certificate x509Certificate : b) {
            for (X509Certificate[] x509CertificateArr2 : x509CertificateArr) {
                if (x509CertificateArr2[0].equals(x509Certificate)) {
                    Log.i("DynamicModuleDownloader", "A matching split signature is found for module certificate.");
                    return true;
                }
            }
        }
        Log.i("DynamicModuleDownloader", "No matching split signature could be found.");
        return false;
    }

    private final synchronized void m22712a(C4843a c4843a, int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putString("module_name", c4843a.f25120a);
        bundle.putString("module_version_code", c4843a.f25121b);
        bundle.putInt("type", i);
        bundle.putInt("error_code", i2);
        this.f25165h.add(bundle);
    }

    private final synchronized void m22710a(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        bundle.putInt("error_code", i2);
        this.f25165h.add(bundle);
    }

    private final synchronized void m22727d() {
        if (!this.f25165h.isEmpty()) {
            this.f25163f.mo4424a(this.f25161d, this.f25165h);
            this.f25165h.clear();
        }
    }

    private static void m22713a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }
}
