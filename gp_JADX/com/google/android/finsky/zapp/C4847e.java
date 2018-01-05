package com.google.android.finsky.zapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.p060a.ag;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.zapp.p267a.C4836e;
import com.google.android.finsky.zapp.p267a.C4838g;
import com.google.wireless.android.a.a.a.a.az;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.b.b;
import com.google.wireless.android.finsky.dfe.nano.dr;
import com.google.wireless.android.finsky.dfe.nano.fh;
import com.squareup.haha.perflib.HprofParser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class C4847e extends C4836e {
    public final Context f25145a;
    public final SharedPreferences f25146b;
    public final SharedPreferences f25147c;
    public final /* synthetic */ PlayModuleService f25148d;

    C4847e(PlayModuleService playModuleService) {
        this.f25148d = playModuleService;
        this.f25145a = playModuleService;
        this.f25146b = playModuleService.getSharedPreferences("play_module_service_shared_prefs", 0);
        this.f25147c = playModuleService.getSharedPreferences("play_module_service_shared_prefs_hashes", 0);
    }

    @SuppressLint({"CommitPrefEdits"})
    public final void mo4411a(String str, List list, C4838g c4838g) {
        if (!this.f25148d.m22627a().mo2294a(12605458)) {
            FinskyLog.m21665c("Module delivery is disabled.", new Object[0]);
            m22671a(null, -5001, null, null);
        } else if (c4838g == null) {
            FinskyLog.m21665c("Callbacks are missing.", new Object[0]);
        } else if (TextUtils.isEmpty(str)) {
            FinskyLog.m21665c("Package name is missing.", new Object[0]);
            m22671a(null, -5011, null, null);
        } else {
            if (m22673a(str, Binder.getCallingUid())) {
                int g = this.f25148d.f25114c.mo2859g(str);
                t tVar = new t();
                tVar.a(g);
                if (PlayModuleService.m22625a(str)) {
                    Object obj;
                    long j = this.f25146b.getLong(str, -1);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (j <= 0 || currentTimeMillis - j >= PlayModuleService.m22624a(this.f25148d.m22627a()) || currentTimeMillis - j < 0) {
                        obj = null;
                    } else {
                        obj = 1;
                    }
                    if (obj != null) {
                        FinskyLog.m21665c("Throttling the request for package %s.", str);
                        m22671a(str, -5003, null, tVar);
                        m22670a(1, Collections.emptyList(), C4847e.m22669a(-5003), c4838g, str, tVar);
                        return;
                    }
                    String string;
                    C1254c a;
                    int size = list.size();
                    List arrayList = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        fh fhVar = new fh();
                        fhVar.a(((Bundle) list.get(i)).getString("name"));
                        string = ((Bundle) list.get(i)).getString("version_code");
                        if (string != null) {
                            if (string == null) {
                                throw new NullPointerException();
                            }
                            fhVar.b |= 4;
                            fhVar.e = string;
                        }
                        string = ((Bundle) list.get(i)).getString("existing_version_code");
                        if (string != null) {
                            if (string == null) {
                                throw new NullPointerException();
                            }
                            fhVar.b |= 2;
                            fhVar.d = string;
                        }
                        arrayList.add(fhVar);
                    }
                    FinskyLog.m21659a("Received module info request for %s modules from package %s v=%d", arrayList, str, Integer.valueOf(g));
                    obj = this.f25148d.f25118g.m15627b(str).m15620a(this.f25148d.f25119h.cZ());
                    if (!TextUtils.isEmpty(obj)) {
                        a = this.f25148d.f25117f.mo2016a(obj);
                    } else if (this.f25148d.m22627a().mo2294a(12638805)) {
                        a = this.f25148d.f25117f.mo2017b();
                    } else {
                        FinskyLog.m21665c("Account missing.", new Object[0]);
                        m22671a(str, -5004, null, tVar);
                        m22670a(1, Collections.emptyList(), C4847e.m22669a(-5004), c4838g, str, tVar);
                        return;
                    }
                    if (a == null) {
                        FinskyLog.m21665c("DfeApi is missing due to invalid account.", new Object[0]);
                        m22671a(str, -5005, null, tVar);
                        m22670a(1, Collections.emptyList(), C4847e.m22669a(-5005), c4838g, str, tVar);
                        return;
                    }
                    int[] a2 = PlayModuleService.m22626a(list, "supported_compression_formats");
                    int[] a3 = PlayModuleService.m22626a(list, "supported_patch_formats");
                    this.f25146b.edit().putLong(str, System.currentTimeMillis()).commit();
                    C0660x agVar = new ag();
                    a.mo1582a(str, g, arrayList, a2, a3, agVar, (C0657w) agVar);
                    StringBuilder stringBuilder = new StringBuilder();
                    try {
                        dr drVar = (dr) agVar.get();
                        FinskyLog.m21659a("Received response for moduleDelivery with status=%s", Integer.valueOf(drVar.b));
                        if (drVar.b == 1) {
                            List arrayList2 = new ArrayList(drVar.c.length);
                            for (b bVar : drVar.c) {
                                Bundle bundle = new Bundle();
                                bundle.putString("name", bVar.c);
                                bundle.putLong("version", bVar.d);
                                bundle.putString("version_code", bVar.e);
                                bundle.putLong("size", bVar.f);
                                bundle.putString("hash_sha256", bVar.g);
                                bundle.putString("download_url", bVar.h);
                                if (bVar.i != null) {
                                    bundle.putString("compressed_download_url", bVar.i.d);
                                    bundle.putLong("compressed_download_size", bVar.i.c);
                                    bundle.putInt("compression_format", bVar.i.b);
                                }
                                if (bVar.j != null) {
                                    bundle.putString("patch_download_url", bVar.j.e);
                                    bundle.putInt("patch_format", bVar.j.f);
                                    bundle.putLong("patch_size", bVar.j.g);
                                    bundle.putString("patch_module_base_version", bVar.j.c);
                                    bundle.putString("patch_module_base_signature", bVar.j.d);
                                }
                                arrayList2.add(bundle);
                                stringBuilder.append(bVar.c);
                                stringBuilder.append(':');
                                stringBuilder.append(bVar.e);
                                stringBuilder.append(':');
                                stringBuilder.append(bVar.g);
                                stringBuilder.append(',');
                            }
                            string = stringBuilder.toString();
                            if (this.f25148d.m22627a().mo2294a(12629032)) {
                                String string2 = this.f25147c.getString(str, "");
                                if (string2.length() + string.length() <= PlayModuleService.f25112a) {
                                    string2 = String.valueOf(string2);
                                    string = String.valueOf(string);
                                    if (string.length() != 0) {
                                        string = string2.concat(string);
                                    } else {
                                        string = new String(string2);
                                    }
                                    m22672a(str, string);
                                } else if (string.length() <= PlayModuleService.f25112a) {
                                    m22672a(str, string);
                                } else {
                                    FinskyLog.m21665c("Cannot save the module hashes, too large.", new Object[0]);
                                }
                            }
                            m22671a(str, 0, null, tVar);
                            m22670a(0, arrayList2, new Bundle(), c4838g, str, tVar);
                            return;
                        }
                        m22671a(str, drVar.b, null, tVar);
                        m22670a(1, Collections.emptyList(), C4847e.m22669a(drVar.b), c4838g, str, tVar);
                        return;
                    } catch (InterruptedException e) {
                        FinskyLog.m21665c("Interrupted while loading ModuleDelivery: %s", e);
                        m22671a(str, -5006, null, tVar);
                        m22670a(1, Collections.emptyList(), C4847e.m22669a(-5006), c4838g, str, tVar);
                        return;
                    } catch (ExecutionException e2) {
                        FinskyLog.m21665c("Error while loading ModuleDelivery: %s", e2);
                        m22671a(str, -5007, e2.getCause(), tVar);
                        m22670a(1, Collections.emptyList(), C4847e.m22669a(-5007), c4838g, str, tVar);
                        return;
                    }
                }
                FinskyLog.m21665c("Module delivery is not enabled for package %s.", str);
                m22671a(str, -5002, null, tVar);
                return;
            }
            FinskyLog.m21665c("Package %s does not belong to uid %s.", str, Integer.valueOf(Binder.getCallingUid()));
            m22671a(str, -5010, null, null);
        }
    }

    private final void m22672a(String str, String str2) {
        this.f25147c.edit().putString(str, str2).apply();
    }

    public final void mo4410a(String str, Bundle bundle) {
        int i = HprofParser.ROOT_REFERENCE_CLEANUP;
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21665c("Ignoring event from unknown package", new Object[0]);
        } else if (PlayModuleService.m22625a(str)) {
            if (m22673a(str, Binder.getCallingUid())) {
                String string;
                String string2 = bundle.getString("module_name");
                if (bundle.containsKey("module_version_code")) {
                    string = bundle.getString("module_version_code");
                } else {
                    string = Long.toString(bundle.getLong("module_version", -1));
                }
                int i2 = bundle.getInt("type", -1);
                int i3 = bundle.getInt("error_code", 0);
                switch (i2) {
                    case 1:
                        i = HprofParser.ROOT_DEBUGGER;
                        break;
                    case 2:
                    case 6:
                        break;
                    case 3:
                        i = HprofParser.ROOT_VM_INTERNAL;
                        break;
                    case 4:
                        i = HprofParser.ROOT_JNI_MONITOR;
                        break;
                    case 5:
                        i = 143;
                        break;
                    case 7:
                        i = 145;
                        break;
                    case 8:
                        i = 146;
                        break;
                    case 9:
                        i = 173;
                        break;
                    case 10:
                        i = 174;
                        break;
                    case 11:
                        i = 176;
                        break;
                    case 12:
                        i = 177;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if (i == -1) {
                    FinskyLog.m21665c("Ignoring unknown event type: %d from package: %s", Integer.valueOf(i2), str);
                    return;
                }
                int g = this.f25148d.f25114c.mo2859g(str);
                t tVar = new t();
                tVar.a(g);
                az azVar = new az();
                if (string2 == null) {
                    throw new NullPointerException();
                }
                azVar.a |= 1;
                azVar.b = string2;
                if (string == null) {
                    throw new NullPointerException();
                }
                azVar.a |= 4;
                azVar.d = string;
                C2482j b = this.f25148d.m22628b();
                C2474c a = new C2474c(i).m13236a(str).m13210a(i3).m13231a(tVar);
                a.f13342a.f31685K = azVar;
                b.m13319a(a.f13342a, null);
                return;
            }
            FinskyLog.m21665c("Package %s does not belong to uid %s.", str, Integer.valueOf(Binder.getCallingUid()));
        } else {
            FinskyLog.m21665c("Unknown client %s", str);
        }
    }

    private final void m22670a(int i, List list, Bundle bundle, C4838g c4838g, String str, t tVar) {
        try {
            c4838g.mo4412a(i, list, bundle);
        } catch (DeadObjectException e) {
            FinskyLog.m21665c("Calling process has died", new Object[0]);
            m22671a(str, -5008, e.getCause(), tVar);
        } catch (RemoteException e2) {
            FinskyLog.m21665c("Failed to send module delivery info to the calling process: %s", e2);
            m22671a(str, -5009, e2.getCause(), tVar);
        }
    }

    private final boolean m22673a(String str, int i) {
        String[] packagesForUid = this.f25145a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null) {
            return false;
        }
        for (String equals : packagesForUid) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static Bundle m22669a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", i);
        return bundle;
    }

    private final void m22671a(String str, int i, Throwable th, t tVar) {
        this.f25148d.m22628b().m13319a(new C2474c(HprofParser.ROOT_INTERNED_STRING).m13236a(str).m13210a(i).m13238a(th).m13231a(tVar).f13342a, null);
    }
}
