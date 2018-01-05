package com.google.android.finsky.ds;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C2885b {
    public final Map f15380a = new HashMap();
    public final Context f15381b;
    public final C0988c f15382c;
    public final C1461c f15383d;
    public final C1500a f15384e;

    public C2885b(Context context, C0988c c0988c, C1461c c1461c, C1500a c1500a) {
        this.f15381b = context;
        this.f15382c = c0988c;
        this.f15383d = c1461c;
        this.f15384e = c1500a;
    }

    final Bundle m15125a() {
        Bundle bundle = null;
        Object cZ = this.f15382c.cZ();
        if (!TextUtils.isEmpty(cZ)) {
            Uri build = new Builder().scheme("content").authority("com.google.android.libraries.kids.supervision.apps").build();
            Bundle bundle2 = new Bundle();
            bundle2.putString("account_name", cZ);
            bundle2.putBoolean("disabled_by_parent", true);
            bundle2.putBoolean("disabled_until_updated", true);
            bundle2.putBoolean("disabled_permanently", true);
            try {
                bundle = this.f15381b.getContentResolver().call(build, "list_by_state", null, bundle2);
            } catch (Exception e) {
                FinskyLog.m21665c("Failed to read unicorn content resolver %s", e);
            }
        }
        return bundle;
    }

    protected final synchronized void m15127a(Bundle bundle) {
        if (bundle != null) {
            Bundle bundle2 = (Bundle) bundle.get("disabled_apps_by_state");
            if (bundle2 != null) {
                for (String str : bundle2.keySet()) {
                    this.f15380a.put(str, bundle2.getString(str));
                }
            }
        }
    }

    public final synchronized List m15126a(String str) {
        List list;
        List arrayList = new ArrayList();
        if (this.f15383d.dj().mo2294a(12616559)) {
            this.f15380a.clear();
            Bundle a = m15125a();
            if (a == null) {
                list = arrayList;
            } else {
                a = (Bundle) a.get("disabled_apps_by_state");
                if (a != null) {
                    for (String str2 : a.keySet()) {
                        String string = a.getString(str2);
                        this.f15380a.put(str2, string);
                        if (string.equals(str)) {
                            arrayList.add(str2);
                        }
                    }
                }
                list = arrayList;
            }
        } else {
            list = arrayList;
        }
        return list;
    }

    public final synchronized boolean m15129b(String str) {
        boolean z;
        if (this.f15383d.dj().mo2294a(12616559)) {
            String str2 = (String) this.f15380a.get(str);
            if (str2 == null) {
                z = false;
            } else {
                z = "disabled_until_updated".equals(str2);
            }
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized boolean m15130c(String str) {
        boolean z;
        z = !this.f15383d.dj().mo2294a(12616559) ? false : ((String) this.f15380a.get(str)) != null;
        return z;
    }

    public final synchronized String m15131d(String str) {
        String str2;
        if (this.f15383d.dj().mo2294a(12616559)) {
            str2 = (String) this.f15380a.get(str);
        } else {
            str2 = null;
        }
        return str2;
    }

    public final synchronized void m15128a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            FinskyLog.m21659a("Empty args, ignored", new Object[0]);
        } else if ("disabled_by_parent".equals(str2) || "disabled_permanently".equals(str2) || "disabled_until_updated".equals(str2)) {
            this.f15380a.put(str, str2);
        } else {
            FinskyLog.m21665c("Unknown reason %s for package %s, ignored", str2, str);
        }
    }

    public final synchronized void m15132e(String str) {
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21659a("Package name empty, ignored", new Object[0]);
        } else {
            this.f15380a.remove(str);
        }
    }
}
