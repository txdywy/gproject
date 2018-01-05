package com.google.android.finsky.cs.p135a.p136a;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.finsky.cs.p135a.C2374e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.phenotype.core.C5516b;
import com.google.android.gms.phenotype.core.C5524c;
import com.google.android.gms.phenotype.core.p304a.C5505c;
import com.google.android.gms.phenotype.core.p304a.C5513k;
import com.google.android.gms.phenotype.core.service.operations.C5536b;
import com.google.android.gms.phenotype.core.service.operations.C5540f;
import com.google.android.gms.phenotype.core.service.operations.C5543i;
import com.google.android.gms.phenotype.core.service.operations.C5544j;
import com.google.android.gms.phenotype.core.service.operations.GetConfigurationSnapshotOperation;
import com.google.android.play.p179a.p352a.C6201l;
import com.google.common.flogger.d;
import java.util.logging.Level;

abstract class C2371a extends AsyncTask {
    public final C2390p f11629a;
    public final C5505c f11630b;
    public final Context f11631c;
    public final String f11632d;
    public final String[] f11633e;
    public final int f11634f;
    public final byte[] f11635g;
    public final String f11636h;

    public C2371a(C2390p c2390p, C5505c c5505c, Context context, String str, String[] strArr, int i, String str2, byte[] bArr) {
        this.f11629a = c2390p;
        this.f11630b = c5505c;
        this.f11632d = str;
        this.f11631c = context;
        this.f11633e = strArr;
        this.f11634f = i;
        this.f11636h = str2;
        this.f11635g = bArr;
    }

    protected abstract String mo2896a(String str);

    protected abstract boolean mo2897a(C2374e c2374e, C6201l c6201l, String str);

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        C5516b c5516b;
        boolean z;
        FinskyLog.m21659a("Triggered update for experiment package %s.", this.f11632d);
        C2390p c2390p = this.f11629a;
        C5543i c5543i = new C5543i(c2390p.f11679b, c2390p.f11680c, this.f11632d, this.f11634f, this.f11633e, this.f11635g, this.f11636h, "com.android.vending");
        Context context = this.f11631c;
        C5505c c5505c = this.f11630b;
        if (c5543i.f28439d == null) {
            ((d) ((d) C5543i.f28436a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/RegisterSyncOperation", "execute", 57, "RegisterSyncOperation.java")).a("User cannot be null. Pass LOGGED_OUT_USER to indicate no user.");
            c5516b = null;
        } else if (c5543i.f28439d.equals("") || C5513k.m26437a(c5543i.f28439d, context)) {
            c5543i.f28442g = C5544j.m26507a(c5505c, c5543i.f28441f, c5543i.f28439d);
            if (c5543i.f28442g.f28445b) {
                if (c5543i.f28438c.mo2899a(c5543i.f28442g.f28446c)) {
                    c5543i.f28437b.mo2898a(context).m16155a(c5543i.f28442g.f28446c, c5543i.f28441f.a, new String[]{c5543i.f28439d}, false);
                }
                c5516b = new GetConfigurationSnapshotOperation(c5543i.f28441f.a, c5543i.f28439d, c5543i.f28440e, c5543i.f28441f.a).m26488a(context, c5505c);
            } else {
                c5516b = null;
            }
        } else {
            ((d) ((d) C5543i.f28436a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/RegisterSyncOperation", "execute", 61, "RegisterSyncOperation.java")).a("Invalid user.");
            c5516b = null;
        }
        if (c5516b == null) {
            FinskyLog.m21667d("Failed to registerSync with Phenotype for experiment package %s.", this.f11632d);
            z = false;
        } else if (c5516b.f28352a.equals(mo2896a(this.f11636h))) {
            FinskyLog.m21659a("Already at the latest configurations for experiment package %s.", this.f11632d);
            z = true;
        } else if (new C5536b(c5516b.f28352a).m26490a(this.f11630b).booleanValue()) {
            C5524c a = new C5540f(this.f11632d, "com.android.vending").m26503a(this.f11630b);
            if (a == null) {
                FinskyLog.m21667d("Failed to retrieve Phenotype experiment token for package %s.", this.f11632d);
                z = false;
            } else {
                if (mo2897a(new C2375c(c5516b), C2382g.m12058a(a, TextUtils.equals(a.f28373c, this.f11636h)), this.f11636h)) {
                    FinskyLog.m21659a("Successfully applied new configurations for package %s.", this.f11632d);
                    z = true;
                } else {
                    FinskyLog.m21667d("Failed to apply new configurations for package %s.", this.f11632d);
                    z = false;
                }
            }
        } else {
            FinskyLog.m21667d("Failed to commit to Phenotype flags for experiment package %s.", this.f11632d);
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
