package com.google.android.finsky.wear;

import android.content.pm.PackageInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;

final class C4801v extends AsyncTask {
    public final /* synthetic */ C3647b f25060a;
    public final /* synthetic */ C4796q f25061b;

    C4801v(C4796q c4796q, C3647b c3647b) {
        this.f25061b = c4796q;
        this.f25060a = c3647b;
    }

    private final Bundle m22577a(File... fileArr) {
        try {
            PackageInfo packageArchiveInfo = this.f25061b.f25041j.getPackageManager().getPackageArchiveInfo(fileArr[0].getAbsolutePath(), 128);
            if (packageArchiveInfo != null) {
                return packageArchiveInfo.applicationInfo.metaData;
            }
            return null;
        } catch (Exception e) {
            C4796q c4796q = this.f25061b;
            String exception = e.toString();
            C4790k c4790k = c4796q.f25042k;
            String str = c4796q.f25034c;
            String str2 = c4796q.f25035d;
            C4789j a = new C4789j(111, c4796q.f25048q).m22537b(c4796q.f25034c).m22533a(991).m22539d(exception).m22534a(c4796q.f25038g);
            a.f24996b = c4796q.f25035d;
            c4790k.m22545a(str, str2, a.m22535a(null).m22536a());
            return null;
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.version", -1);
            if (i > 0) {
                C3647b a = this.f25061b.f25043l.m17243a("com.google.android.gms");
                C4796q c4796q;
                C4790k c4790k;
                String str;
                String str2;
                C4789j a2;
                if (a == null || a.f18028c == null) {
                    FinskyLog.m21669e("Missing package state for GMS on node %s", this.f25061b.f25035d);
                    c4796q = this.f25061b;
                    c4790k = c4796q.f25042k;
                    str = c4796q.f25034c;
                    str2 = c4796q.f25035d;
                    a2 = new C4789j(111, c4796q.f25048q).m22537b(c4796q.f25034c).m22533a(992).m22539d(null).m22534a(c4796q.f25038g);
                    a2.f24996b = c4796q.f25035d;
                    c4790k.m22545a(str, str2, a2.m22535a(null).m22536a());
                    this.f25061b.m22566a(this.f25060a);
                    return;
                }
                if (i > a.f18028c.f11419d) {
                    FinskyLog.m21665c("Required GMS %d greater than installed %d on %s", Integer.valueOf(i), Integer.valueOf(a.f18028c.f11419d), this.f25061b.f25035d);
                    c4796q = this.f25061b;
                    c4790k = c4796q.f25042k;
                    str = c4796q.f25034c;
                    str2 = c4796q.f25035d;
                    a2 = new C4789j(111, c4796q.f25048q).m22537b(c4796q.f25034c).m22533a(991).m22539d(null).m22534a(c4796q.f25038g);
                    a2.f24996b = c4796q.f25035d;
                    c4790k.m22545a(str, str2, a2.m22535a(null).m22536a());
                    this.f25061b.m22566a(this.f25060a);
                    return;
                }
            }
        }
        this.f25061b.m22571b(this.f25060a);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m22577a((File[]) objArr);
    }
}
