package com.google.android.finsky.setup.p240a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PermissionInfo;
import android.os.Bundle;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.cq.C2361b;
import com.google.android.finsky.cq.C2363d;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.protobuf.nano.C0757i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class C4121h implements C2918a {
    public final Context f20738a;
    public final boolean f20739b;
    public final C1531a f20740c;
    public final C2363d f20741d;

    public C4121h(Context context, boolean z, C1531a c1531a, C2363d c2363d) {
        this.f20738a = context;
        this.f20739b = z;
        this.f20740c = c1531a;
        this.f20741d = c2363d;
    }

    private final Bundle[] m19167a(String[] strArr) {
        C2363d c2363d = this.f20741d;
        Map b = c2363d.m11997b();
        Set a = c2363d.m11996a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : strArr) {
            Integer num;
            if (!a.contains(obj)) {
                num = (Integer) b.get(obj);
                if (num != null) {
                    if (!linkedHashMap.containsKey(num)) {
                        linkedHashMap.put(num, new ArrayList());
                    }
                    ((List) linkedHashMap.get(num)).add(obj);
                }
            }
        }
        b = new LinkedHashMap();
        for (Integer num2 : linkedHashMap.keySet()) {
            b.put(C2363d.m11988a(num2.intValue()), (List) linkedHashMap.get(num2));
        }
        Bundle[] bundleArr = new Bundle[b.size()];
        int i = 0;
        for (C2361b c2361b : b.keySet()) {
            List list = (List) b.get(c2361b);
            Bundle bundle = new Bundle();
            bundle.putString("title", this.f20738a.getString(c2361b.f11584b));
            bundle.putString("description", this.f20738a.getString(c2361b.f11585c));
            bundle.putParcelableArray("permissions", m19166a(list));
            bundleArr[i] = bundle;
            i++;
        }
        return bundleArr;
    }

    private final Bundle[] m19166a(List list) {
        List arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            Bundle a = m19164a((String) list.get(i));
            if (a != null) {
                arrayList.add(a);
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    private final Bundle m19164a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        try {
            PackageManager packageManager = this.f20738a.getPackageManager();
            PermissionInfo permissionInfo = packageManager.getPermissionInfo(str, 0);
            if (str == null) {
                return bundle;
            }
            CharSequence loadLabel = permissionInfo.loadLabel(packageManager);
            if (loadLabel != null) {
                bundle.putString("title", loadLabel.toString());
            }
            CharSequence loadDescription = permissionInfo.loadDescription(packageManager);
            if (loadDescription != null) {
                bundle.putString("description", loadDescription.toString());
            }
            bundle.putInt("protection_level", permissionInfo.protectionLevel);
            return bundle;
        } catch (NameNotFoundException e) {
            FinskyLog.m21665c("Could not find permission %s:  %s", str, e);
            return null;
        }
    }

    private static boolean m19165a(Document document) {
        if (document.f14885a.f12107n == null) {
            return false;
        }
        for (bl blVar : document.f14885a.f12107n) {
            if (blVar != null && blVar.f11915e == 0 && !blVar.f11924n) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object mo3197a(Object obj) {
        String str = null;
        boolean z = true;
        cv cvVar = (cv) obj;
        if (cvVar == null) {
            return null;
        }
        String str2;
        Document document = new Document(cvVar);
        Bundle bundle = new Bundle();
        bundle.putString("title", document.f14885a.f12100g);
        bundle.putString("package_name", document.f14885a.f12097d);
        bundle.putString("icon_url", document.aj() != null ? document.aj().f11860f : null);
        if (C1503a.m8830a(this.f20738a)) {
            str2 = "icon_url_tv_banner";
            if (document.m14642b(16) != null) {
                str = document.m14642b(16).f11860f;
            }
            bundle.putString(str2, str);
        }
        str = "has_purchases";
        boolean z2 = document.m14625N() != null && document.m14625N().f13180t;
        bundle.putBoolean(str, z2);
        bundle.putString("developer_name", document.f14885a.f12102i);
        if (!C4671b.m21788e() || document.ai() <= 22) {
            bundle.putBoolean("has_runtime_permissions", false);
            if (!(!this.f20739b || document.m14625N() == null || document.m14625N().f13167g == null)) {
                bundle.putParcelableArray("permission_buckets", m19167a(document.m14625N().f13167g));
            }
        } else {
            bundle.putBoolean("has_runtime_permissions", true);
        }
        bundle.putInt("version_code", document.m14653h());
        if (document.m14671z() != null) {
            bundle.putLong("install_size", document.m14671z().f12311c);
            bundle.putByteArray("install_details", C0757i.m4909a(document.m14671z()));
        }
        long b = this.f20740c.m8961b(document);
        if (b != 0) {
            bundle.putLong("download_size", b);
        }
        str2 = "is_paid";
        if (C4121h.m19165a(document)) {
            z = false;
        }
        bundle.putBoolean(str2, z);
        bundle.putString("promotional_description", document.f14885a.f12105l);
        bundle.putInt("availability", document.af());
        bundle.putBoolean("mature_kr", document.f14885a.f12088E);
        return bundle;
    }
}
