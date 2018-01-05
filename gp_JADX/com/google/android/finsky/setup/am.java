package com.google.android.finsky.setup;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.os.C0327a;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ec.C2968a;
import com.google.android.finsky.setup.p240a.C4117d;
import com.google.android.finsky.setup.p240a.C4119f;
import com.google.android.finsky.setup.p240a.C4123j;
import com.google.android.finsky.setup.p240a.C4125l;
import com.google.android.finsky.setup.p240a.C4126m;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.android.finsky.utils.p188a.C4668b;
import com.google.android.play.utils.c;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.fp;
import java.util.Arrays;
import java.util.List;

public final class am implements al {
    public static final Boolean f20781a = Boolean.valueOf(false);
    public final C4126m f20782b;
    public final C1461c f20783c;

    public am(C4126m c4126m, C1461c c1461c) {
        this.f20782b = c4126m;
        this.f20783c = c1461c;
    }

    public final void mo3922a(Context context) {
        Intent a = m19208a(context, 0, "recovery");
        if (!m19212b()) {
            a.putExtra("startup", true);
        }
        context.getApplicationContext().startService(a);
    }

    public final void mo3924a(Context context, String str, String str2, long j) {
        if (((Boolean) C0954a.aZ.m5760a()).booleanValue()) {
            FinskyLog.m21659a("Skipping restore for %s because directedRestoreStarted=true", FinskyLog.m21655a(str2));
            return;
        }
        Intent a = m19208a(context, 3, "restoreaccount", str, str2);
        a.putExtra("aid", str);
        a.putExtra("authAccount", str2);
        m19207a(context, a, j);
    }

    public final Intent mo3931b(Context context) {
        Intent a = m19208a(context, 2, "allow_mobile_data");
        if (!m19212b()) {
            a.putExtra("allow_mobile_data", true);
        }
        return a;
    }

    public final void mo3928a(Context context, List list, boolean z) {
        if (z) {
            C0954a.aZ.m5763a(Boolean.valueOf(true));
        }
        if (list == null || list.isEmpty()) {
            FinskyLog.m21659a("restorePackages called with 0 documents. Skipping", new Object[0]);
        } else if (m19212b()) {
            m19211a(context, C4668b.m21678a(list, new C4117d()));
        } else if (!list.isEmpty()) {
            int size = list.size();
            String[] strArr = new String[size];
            int[] iArr = new int[size];
            String[] strArr2 = new String[size];
            int[] iArr2 = new int[size];
            String[] strArr3 = new String[size];
            String[] strArr4 = new String[size];
            int[] iArr3 = new int[size];
            es[] esVarArr = new es[size];
            String string = ((Bundle) list.get(0)).getString("authAccount");
            boolean z2 = ((Bundle) list.get(0)).getBoolean("is_visible");
            boolean z3 = ((Bundle) list.get(0)).getInt("doc_type") == 1;
            for (int i = 0; i < list.size(); i++) {
                es a;
                Bundle bundle = (Bundle) list.get(i);
                strArr[i] = bundle.getString("package_name");
                iArr[i] = bundle.getInt("version_code", -1);
                strArr2[i] = bundle.getString("title");
                iArr2[i] = bundle.getInt("priority", 3);
                strArr3[i] = bundle.getString("delivery_token");
                strArr4[i] = bundle.getString("icon_url");
                iArr3[i] = bundle.getInt("network_type", 0);
                try {
                    a = es.m12537a(bundle.getByteArray("install_details"));
                } catch (Throwable e) {
                    FinskyLog.m21660a(e, "Failed to parse InstallDetails proto.", new Object[0]);
                    a = null;
                }
                esVarArr[i] = a;
            }
            m19209a(context, string, z2, strArr, iArr, strArr2, iArr2, strArr3, strArr4, esVarArr, z3, iArr3);
        }
    }

    public final void mo3927a(Context context, String str, fp[] fpVarArr, boolean z) {
        if (z) {
            C0954a.aZ.m5763a(Boolean.valueOf(true));
        }
        if (fpVarArr == null || fpVarArr.length == 0) {
            FinskyLog.m21659a("restorePackages called with 0 documents. Skipping", new Object[0]);
        } else if (m19212b()) {
            m19211a(context, C4668b.m21679a((Object[]) fpVarArr, this.f20782b.m19177b(str)));
        } else {
            String[] strArr = new String[fpVarArr.length];
            int[] iArr = new int[fpVarArr.length];
            String[] strArr2 = new String[fpVarArr.length];
            int[] iArr2 = new int[fpVarArr.length];
            String[] strArr3 = new String[fpVarArr.length];
            int[] iArr3 = new int[fpVarArr.length];
            es[] esVarArr = new es[fpVarArr.length];
            for (int i = 0; i < fpVarArr.length; i++) {
                fp fpVar = fpVarArr[i];
                strArr[i] = fpVar.e.f11833b;
                iArr[i] = fpVar.g;
                strArr2[i] = fpVar.f;
                iArr2[i] = 3;
                if (fpVar.e() && fpVar.d < 100) {
                    iArr2[i] = 1;
                }
                if (fpVar.h == null || TextUtils.isEmpty(fpVar.h.f11860f) || !fpVar.h.aI_() || !fpVar.h.f11863i) {
                    strArr3[i] = null;
                } else {
                    strArr3[i] = fpVar.h.f11860f;
                }
                iArr3[i] = iArr2[i] == 1 ? 1 : 0;
                esVarArr[i] = fpVar.i;
            }
            m19209a(context, str, true, strArr, iArr, strArr2, iArr2, null, strArr3, esVarArr, false, iArr3);
        }
    }

    public final void mo3926a(Context context, String str, ee[] eeVarArr) {
        if (eeVarArr == null || eeVarArr.length == 0) {
            FinskyLog.m21659a("restorePackages called with 0 documents. Skipping", new Object[0]);
            return;
        }
        for (ee eeVar : eeVarArr) {
            FinskyLog.m21659a("Requesting preload of %s:%d", eeVar.c.f11833b, Integer.valueOf(eeVar.d));
        }
        if (m19212b()) {
            m19211a(context, C4668b.m21679a((Object[]) eeVarArr, new C4125l(this.f20782b.m19179d(str), new C4117d())));
        } else {
            m19210a(context, str, eeVarArr, true);
        }
    }

    public final void mo3923a(Context context, String str, ee eeVar) {
        if (eeVar == null) {
            FinskyLog.m21659a("restoreConfigPreload called with null config preload. Skipping", new Object[0]);
            return;
        }
        FinskyLog.m21659a("Requesting preload config of %s:%d", eeVar.c.f11833b, Integer.valueOf(eeVar.d));
        ee[] eeVarArr = new ee[]{eeVar};
        if (m19212b()) {
            m19211a(context, C4668b.m21679a((Object[]) eeVarArr, new C4123j(str)));
        } else {
            m19210a(context, str, eeVarArr, false);
        }
    }

    public final void mo3925a(Context context, String str, List list) {
        C0954a.aZ.m5763a(Boolean.valueOf(true));
        if (list == null || list.isEmpty()) {
            FinskyLog.m21659a("restorePackages called with 0 documents. Skipping", new Object[0]);
        } else if (m19212b()) {
            m19211a(context, C4668b.m21678a(list, new C4119f(this.f20782b.m19178c(str), new C4117d())));
        } else {
            String[] strArr = new String[list.size()];
            int[] iArr = new int[list.size()];
            String[] strArr2 = new String[list.size()];
            int[] iArr2 = new int[list.size()];
            String[] strArr3 = new String[list.size()];
            int[] iArr3 = new int[list.size()];
            es[] esVarArr = new es[list.size()];
            for (int i = 0; i < list.size(); i++) {
                cv cvVar = (cv) list.get(i);
                strArr[i] = cvVar.f12097d;
                iArr[i] = cvVar.f12112s.f12048a.f13163c;
                strArr2[i] = cvVar.f12100g;
                iArr2[i] = 3;
                strArr3[i] = c.a(cvVar, 4).f11860f;
                iArr3[i] = 0;
                esVarArr[i] = cvVar.f12112s.f12048a.f13153B;
            }
            m19209a(context, str, true, strArr, iArr, strArr2, iArr2, null, strArr3, esVarArr, false, iArr3);
        }
    }

    public final long mo3920a(Context context, String str, long j) {
        Intent a = m19208a(context, 5, "retrypackage", str);
        a.putExtra("package", str);
        return m19207a(context, a, j);
    }

    public final long mo3919a(Context context, long j) {
        Intent a = m19208a(context, 1, "kick");
        if (!m19212b()) {
            a.putExtra("kick_installer", true);
        }
        return m19207a(context, a, j);
    }

    public final Intent mo3933c(Context context) {
        Intent a = m19208a(context, 6, "finishsession");
        if (!m19212b()) {
            a.putExtra("finish_session", true);
        }
        return a;
    }

    public final boolean mo3929a() {
        if (m19212b()) {
            return RestoreServiceV2.m19101a();
        }
        return RestoreService.f20567h != null && RestoreService.f20567h.f20572e.m19266g(null);
    }

    public final boolean mo3930a(bx bxVar) {
        if (m19212b()) {
            return RestoreServiceV2.m19102a(bxVar);
        }
        if (bxVar == null) {
            if (RestoreService.f20567h == null) {
                return true;
            }
            RestoreService.f20567h.f20570c = null;
            return true;
        } else if (RestoreService.f20567h == null || !RestoreService.f20567h.f20572e.m19266g(null)) {
            return false;
        } else {
            RestoreService restoreService = RestoreService.f20567h;
            restoreService.f20570c = bxVar;
            new Handler(restoreService.getMainLooper()).post(new av(restoreService));
            return true;
        }
    }

    public final String mo3921a(Intent intent) {
        String stringExtra = intent.getStringExtra("aid");
        if (TextUtils.isEmpty(stringExtra)) {
            throw new SetupException("Expecting a non-empty aid extra");
        }
        if (f20781a.booleanValue() && stringExtra.equals("self")) {
            stringExtra = Long.toHexString(((Long) C0955b.m5748a().m28964b()).longValue());
            FinskyLog.m21659a("Using own current android-id %s for test restore", stringExtra);
        }
        try {
            Long.parseLong(stringExtra, 16);
            return stringExtra;
        } catch (Throwable e) {
            FinskyLog.m21667d("Provided aid can't be parsed as long", new Object[0]);
            throw new SetupException("Provided aid can't be parsed as long", e);
        }
    }

    public final List mo3932b(Intent intent) {
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("setup_documents");
        if (parcelableArrayExtra == null) {
            return null;
        }
        return Arrays.asList((PackageSetupStatus[]) Arrays.copyOf(parcelableArrayExtra, parcelableArrayExtra.length, PackageSetupStatus[].class));
    }

    private final boolean m19212b() {
        return C0327a.m1722b() || ((Boolean) C0955b.hn.m28964b()).booleanValue() || this.f20783c.dj().mo2294a(12617436);
    }

    private final Intent m19208a(Context context, int i, String... strArr) {
        Class cls = m19212b() ? RestoreServiceV2.class : RestoreService.class;
        Builder scheme = new Builder().scheme(m19212b() ? "restoreservicev2://" : "restoreservice://");
        for (Object obj : strArr) {
            if (!TextUtils.isEmpty(obj)) {
                scheme.appendPath(obj);
            }
        }
        Intent intent = new Intent(context.getApplicationContext(), cls);
        if (m19212b()) {
            intent.putExtra("restore_request_type", i);
        }
        intent.setData(scheme.build());
        return intent;
    }

    private static void m19210a(Context context, String str, ee[] eeVarArr, boolean z) {
        int length = eeVarArr.length;
        String[] strArr = new String[length];
        int[] iArr = new int[length];
        String[] strArr2 = new String[length];
        int[] iArr2 = new int[length];
        String[] strArr3 = new String[length];
        String[] strArr4 = new String[length];
        int[] iArr3 = new int[length];
        es[] esVarArr = new es[length];
        length = 0;
        while (length < eeVarArr.length) {
            int i;
            ee eeVar = eeVarArr[length];
            strArr[length] = eeVar.c.f11833b;
            iArr[length] = eeVar.d;
            strArr2[length] = eeVar.n.f12100g;
            iArr2[length] = 2;
            if (eeVar.e() && eeVar.l < 100) {
                iArr2[length] = 1;
            }
            strArr3[length] = eeVar.g;
            bd aj = new Document(eeVarArr[length].n).aj();
            if (aj == null || TextUtils.isEmpty(aj.f11860f) || !aj.aI_() || !aj.f11863i) {
                strArr4[length] = null;
            } else {
                strArr4[length] = aj.f11860f;
            }
            if (eeVar.p || iArr2[length] == 1) {
                i = 1;
            } else {
                i = 0;
            }
            iArr3[length] = i;
            if (C1503a.m8831b(context) && C2968a.m15380a(context).m15384c() && iArr2[length] != 1) {
                iArr3[length] = 0;
            }
            esVarArr[length] = eeVar.k;
            length++;
        }
        m19209a(context, str, z, strArr, iArr, strArr2, iArr2, strArr3, strArr4, esVarArr, true, iArr3);
    }

    private static void m19209a(Context context, String str, boolean z, String[] strArr, int[] iArr, String[] strArr2, int[] iArr2, String[] strArr3, String[] strArr4, es[] esVarArr, boolean z2, int[] iArr3) {
        Intent intent = new Intent(context, RestoreService.class);
        intent.putExtra("authAccount", str);
        intent.putExtra("visible", z);
        intent.putExtra("array_packages", strArr);
        intent.putExtra("array_version_codes", iArr);
        intent.putExtra("array_titles", strArr2);
        intent.putExtra("array_priorities", iArr2);
        intent.putExtra("is_vpa", z2);
        intent.putExtra("network_type", iArr3);
        if (strArr3 != null) {
            intent.putExtra("array_delivery_tokens", strArr3);
        }
        intent.putExtra("array_app_icon_urls", strArr4);
        intent.putExtra("install_details", ParcelableProtoArray.m21675a(esVarArr));
        intent.setData(Uri.parse("restoreservice://restorepackages"));
        context.getApplicationContext().startService(intent);
    }

    private final void m19211a(Context context, List list) {
        Intent a = m19208a(context, 4, "restorepackages");
        a.putExtra("setup_documents", (Parcelable[]) list.toArray(new PackageSetupStatus[list.size()]));
        context.getApplicationContext().startService(a);
    }

    private static long m19207a(Context context, Intent intent, long j) {
        if (TextUtils.isEmpty(intent.getDataString())) {
            throw new IllegalArgumentException("Alarm intent needs data URI");
        }
        Context applicationContext = context.getApplicationContext();
        if (j <= 0) {
            context.getApplicationContext().startService(intent);
            return C4678i.m21812a();
        }
        long a = C4678i.m21812a() + j;
        ((AlarmManager) applicationContext.getSystemService("alarm")).set(0, a, PendingIntent.getService(applicationContext, 0, intent, 0));
        return a;
    }
}
