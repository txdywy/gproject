package com.google.android.finsky.cs.a.a;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.finsky.cs.a.e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.phenotype.core.a.c;
import com.google.android.gms.phenotype.core.a.k;
import com.google.android.gms.phenotype.core.b;
import com.google.android.gms.phenotype.core.c;
import com.google.android.gms.phenotype.core.c.b;
import com.google.android.gms.phenotype.core.c.g;
import com.google.android.gms.phenotype.core.service.operations.GetConfigurationSnapshotOperation;
import com.google.android.gms.phenotype.core.service.operations.b;
import com.google.android.gms.phenotype.core.service.operations.f;
import com.google.android.gms.phenotype.core.service.operations.i;
import com.google.android.gms.phenotype.core.service.operations.j;
import com.google.android.gms.phenotype.core.service.operations.k;
import com.google.android.gms.phenotype.core.service.operations.l;
import com.google.android.play.a.a.l;
import com.google.common.flogger.a;
import com.google.common.flogger.d;
import com.google.d.b.a.a;
import java.util.logging.Level;

protected class com.google.android.finsky.cs.a.a.a extends AsyncTask
{

    public final com.google.android.finsky.cs.a.a.p a;
    public final com.google.android.gms.phenotype.core.a.c b;
    public final Context c;
    public final String d;
    public final String[] e;
    public final int f;
    public final byte[] g;
    public final String h;

    a(com.google.android.finsky.cs.a.a.p p0, com.google.android.gms.phenotype.core.a.c p1, Context p2, String p3, String[] p4, int p5, String p6, byte[] p7) {
        AsyncTask();
        this.a = p0;
        this.b = p1;
        this.d = p3;
        this.c = p2;
        this.e = p4;
        this.f = p5;
        this.h = p6;
        this.g = p7;
    }

    protected abstract String a(String p0);

    protected abstract boolean a(com.google.android.finsky.cs.a.e p0, com.google.android.play.a.a.l p1, String p2);

    protected Object doInBackground(Object[] p0) {
        v1 = new Object[1];
        v1[0] = this.d;
        FinskyLog.a("Triggered update for experiment package %s.", v1);
        v0 = new com.google.android.gms.phenotype.core.service.operations.i(this.a.b, this.a.c, this.d, this.f, this.e, this.g, this.h, "com.android.vending");
        if (v0.d == 0) {
            ((com.google.common.flogger.d)((com.google.common.flogger.d)com.google.android.gms.phenotype.core.service.operations.i.a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/RegisterSyncOperation", "execute", 57, "RegisterSyncOperation.java")).a("User cannot be null. Pass LOGGED_OUT_USER to indicate no user.");
            v0 = 0;
        }
        else if (!v0.d.equals("") && !com.google.android.gms.phenotype.core.a.k.a(v0.d, this.c)) {
            ((com.google.common.flogger.d)((com.google.common.flogger.d)com.google.android.gms.phenotype.core.service.operations.i.a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/service/operations/RegisterSyncOperation", "execute", 61, "RegisterSyncOperation.java")).a("Invalid user.");
            v0 = 0;
        }
        else {
            v0.g = com.google.android.gms.phenotype.core.service.operations.j.a(this.b, v0.f, v0.d);
            if (v0.g.b == 0)
                v0 = 0;
            else {
                if (v0.c.a(v0.g.c)) {
                    v7 = new String[1];
                    v7[0] = v0.d;
                    v0.b.a(this.c).a(v0.g.c, v0.f.a, v7, 0);
                }
                v0 = new GetConfigurationSnapshotOperation(v0.f.a, v0.d, v0.e, v0.f.a).a(this.c, this.b);
            }
        }
        if (v0 == 0) {
            v1 = new Object[1];
            v1[0] = this.d;
            FinskyLog.d("Failed to registerSync with Phenotype for experiment package %s.", v1);
            v0 = 0;
        }
        else if (v0.a.equals(this.a(this.h))) {
            v1 = new Object[1];
            v1[0] = this.d;
            FinskyLog.a("Already at the latest configurations for experiment package %s.", v1);
            v0 = 1;
        }
        else if (!new com.google.android.gms.phenotype.core.service.operations.b(v0.a).a(this.b).booleanValue()) {
            v1 = new Object[1];
            v1[0] = this.d;
            FinskyLog.d("Failed to commit to Phenotype flags for experiment package %s.", v1);
            v0 = 0;
        }
        else {
            v1 = new com.google.android.gms.phenotype.core.service.operations.f(this.d, "com.android.vending").a(this.b);
            if (v1 == 0) {
                v1 = new Object[1];
                v1[0] = this.d;
                FinskyLog.d("Failed to retrieve Phenotype experiment token for package %s.", v1);
                v0 = 0;
            }
            else if (this.a(new com.google.android.finsky.cs.a.a.c(v0), com.google.android.finsky.cs.a.a.g.a(v1, TextUtils.equals(v1.c, this.h)), this.h)) {
                v1 = new Object[1];
                v1[0] = this.d;
                FinskyLog.a("Successfully applied new configurations for package %s.", v1);
                v0 = 1;
            }
            else {
                v1 = new Object[1];
                v1[0] = this.d;
                FinskyLog.d("Failed to apply new configurations for package %s.", v1);
                v0 = 0;
            }
        }
        return Boolean.valueOf(v0);
    }

}
