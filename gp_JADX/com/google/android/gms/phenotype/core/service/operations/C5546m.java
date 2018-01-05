package com.google.android.gms.phenotype.core.service.operations;

import com.google.android.gms.phenotype.core.C5530i;
import com.google.common.flogger.c;

public final class C5546m extends C5535a {
    public static final c f28447a = c.a("com/google/android/gms/phenotype/core/service/operations/SetFlagOverridesOperation");
    public final String f28448b;
    public final String f28449c;
    public final C5530i[] f28450d;

    public C5546m(String str, String str2, C5530i[] c5530iArr) {
        this.f28448b = str;
        this.f28449c = str2;
        this.f28450d = c5530iArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean m26512a(android.content.Context r11, com.google.android.gms.phenotype.core.p304a.C5505c r12) {
        /*
        r10 = this;
        r7 = 5;
        r1 = 0;
        r0 = r10.f28448b;
        if (r0 == 0) goto L_0x000e;
    L_0x0006:
        r0 = r10.f28448b;
        r0 = r0.length();
        if (r0 != 0) goto L_0x0030;
    L_0x000e:
        r0 = f28447a;
        r2 = java.util.logging.Level.SEVERE;
        r0 = r0.a(r2);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "com/google/android/gms/phenotype/core/service/operations/SetFlagOverridesOperation";
        r3 = "execute";
        r4 = 37;
        r5 = "SetFlagOverridesOperation.java";
        r0 = r0.a(r2, r3, r4, r5);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "No package name specified";
        r0.a(r2);
        r0 = java.lang.Boolean.valueOf(r1);
    L_0x002f:
        return r0;
    L_0x0030:
        r0 = r10.f28449c;
        if (r0 != 0) goto L_0x0056;
    L_0x0034:
        r0 = f28447a;
        r2 = java.util.logging.Level.SEVERE;
        r0 = r0.a(r2);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "com/google/android/gms/phenotype/core/service/operations/SetFlagOverridesOperation";
        r3 = "execute";
        r4 = 42;
        r5 = "SetFlagOverridesOperation.java";
        r0 = r0.a(r2, r3, r4, r5);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "No user specified";
        r0.a(r2);
        r0 = java.lang.Boolean.valueOf(r1);
        goto L_0x002f;
    L_0x0056:
        r0 = r10.f28449c;
        r2 = "*";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0094;
    L_0x0060:
        r0 = r10.f28449c;
        r2 = "";
        r0 = r0.equals(r2);
        if (r0 != 0) goto L_0x0094;
    L_0x006a:
        r0 = r10.f28449c;
        r0 = com.google.android.gms.phenotype.core.p304a.C5513k.m26437a(r0, r11);
        if (r0 != 0) goto L_0x0094;
    L_0x0072:
        r0 = f28447a;
        r2 = java.util.logging.Level.SEVERE;
        r0 = r0.a(r2);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "com/google/android/gms/phenotype/core/service/operations/SetFlagOverridesOperation";
        r3 = "execute";
        r4 = 48;
        r5 = "SetFlagOverridesOperation.java";
        r0 = r0.a(r2, r3, r4, r5);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "Invalid user";
        r0.a(r2);
        r0 = java.lang.Boolean.valueOf(r1);
        goto L_0x002f;
    L_0x0094:
        r0 = r10.f28450d;
        if (r0 != 0) goto L_0x00bb;
    L_0x0098:
        r0 = f28447a;
        r2 = java.util.logging.Level.SEVERE;
        r0 = r0.a(r2);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "com/google/android/gms/phenotype/core/service/operations/SetFlagOverridesOperation";
        r3 = "execute";
        r4 = 53;
        r5 = "SetFlagOverridesOperation.java";
        r0 = r0.a(r2, r3, r4, r5);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "No flags specified";
        r0.a(r2);
        r0 = java.lang.Boolean.valueOf(r1);
        goto L_0x002f;
    L_0x00bb:
        r2 = r10.f28450d;
        r3 = r2.length;
        r0 = r1;
    L_0x00bf:
        if (r0 >= r3) goto L_0x0151;
    L_0x00c1:
        r4 = r2[r0];
        r5 = r4.f28382a;
        if (r5 == 0) goto L_0x00cf;
    L_0x00c7:
        r5 = r4.f28382a;
        r5 = r5.length();
        if (r5 != 0) goto L_0x00f2;
    L_0x00cf:
        r0 = f28447a;
        r2 = java.util.logging.Level.SEVERE;
        r0 = r0.a(r2);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "com/google/android/gms/phenotype/core/service/operations/SetFlagOverridesOperation";
        r3 = "execute";
        r4 = 58;
        r5 = "SetFlagOverridesOperation.java";
        r0 = r0.a(r2, r3, r4, r5);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "No flag name specified";
        r0.a(r2);
        r0 = java.lang.Boolean.valueOf(r1);
        goto L_0x002f;
    L_0x00f2:
        r5 = r4.f28388g;
        r6 = 4;
        if (r5 != r6) goto L_0x0120;
    L_0x00f7:
        r5 = r4.m26473d();
        if (r5 != 0) goto L_0x0120;
    L_0x00fd:
        r0 = f28447a;
        r2 = java.util.logging.Level.SEVERE;
        r0 = r0.a(r2);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "com/google/android/gms/phenotype/core/service/operations/SetFlagOverridesOperation";
        r3 = "execute";
        r4 = 62;
        r5 = "SetFlagOverridesOperation.java";
        r0 = r0.a(r2, r3, r4, r5);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "Flag with null string";
        r0.a(r2);
        r0 = java.lang.Boolean.valueOf(r1);
        goto L_0x002f;
    L_0x0120:
        r5 = r4.f28388g;
        if (r5 != r7) goto L_0x014d;
    L_0x0124:
        r4 = r4.m26474e();
        if (r4 != 0) goto L_0x014d;
    L_0x012a:
        r0 = f28447a;
        r2 = java.util.logging.Level.SEVERE;
        r0 = r0.a(r2);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "com/google/android/gms/phenotype/core/service/operations/SetFlagOverridesOperation";
        r3 = "execute";
        r4 = 66;
        r5 = "SetFlagOverridesOperation.java";
        r0 = r0.a(r2, r3, r4, r5);
        r0 = (com.google.common.flogger.d) r0;
        r2 = "Flag with null bytes";
        r0.a(r2);
        r0 = java.lang.Boolean.valueOf(r1);
        goto L_0x002f;
    L_0x014d:
        r0 = r0 + 1;
        goto L_0x00bf;
    L_0x0151:
        r2 = r12.getWritableDatabase();
        r2.beginTransaction();
        r3 = r10.f28450d;	 Catch:{ all -> 0x01ee }
        r4 = r3.length;	 Catch:{ all -> 0x01ee }
        r0 = r1;
    L_0x015c:
        if (r0 >= r4) goto L_0x022d;
    L_0x015e:
        r1 = r3[r0];	 Catch:{ all -> 0x01ee }
        r5 = new android.content.ContentValues;	 Catch:{ all -> 0x01ee }
        r5.<init>();	 Catch:{ all -> 0x01ee }
        r6 = "packageName";
        r7 = r10.f28448b;	 Catch:{ all -> 0x01ee }
        r5.put(r6, r7);	 Catch:{ all -> 0x01ee }
        r6 = "user";
        r7 = r10.f28449c;	 Catch:{ all -> 0x01ee }
        r5.put(r6, r7);	 Catch:{ all -> 0x01ee }
        r6 = "name";
        r7 = r1.f28382a;	 Catch:{ all -> 0x01ee }
        r5.put(r6, r7);	 Catch:{ all -> 0x01ee }
        r6 = "flagType";
        r7 = r1.f28389h;	 Catch:{ all -> 0x01ee }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x01ee }
        r5.put(r6, r7);	 Catch:{ all -> 0x01ee }
        r6 = "committed";
        r7 = 0;
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x01ee }
        r5.put(r6, r7);	 Catch:{ all -> 0x01ee }
        r6 = r1.f28388g;	 Catch:{ all -> 0x01ee }
        switch(r6) {
            case 1: goto L_0x01bb;
            case 2: goto L_0x01f3;
            case 3: goto L_0x0201;
            case 4: goto L_0x020f;
            case 5: goto L_0x0219;
            default: goto L_0x0194;
        };	 Catch:{ all -> 0x01ee }
    L_0x0194:
        r0 = f28447a;	 Catch:{ all -> 0x01ee }
        r1 = java.util.logging.Level.SEVERE;	 Catch:{ all -> 0x01ee }
        r0 = r0.a(r1);	 Catch:{ all -> 0x01ee }
        r0 = (com.google.common.flogger.d) r0;	 Catch:{ all -> 0x01ee }
        r1 = "com/google/android/gms/phenotype/core/service/operations/SetFlagOverridesOperation";
        r3 = "execute";
        r4 = 99;
        r5 = "SetFlagOverridesOperation.java";
        r0 = r0.a(r1, r3, r4, r5);	 Catch:{ all -> 0x01ee }
        r0 = (com.google.common.flogger.d) r0;	 Catch:{ all -> 0x01ee }
        r1 = "Unrecognized flag type";
        r0.a(r1);	 Catch:{ all -> 0x01ee }
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x01ee }
        r2.endTransaction();
        goto L_0x002f;
    L_0x01bb:
        r6 = "intVal";
        r8 = r1.m26469a();	 Catch:{ all -> 0x01ee }
        r1 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x01ee }
        r5.put(r6, r1);	 Catch:{ all -> 0x01ee }
    L_0x01c8:
        r1 = "FlagOverrides";
        r6 = 0;
        r7 = 5;
        r6 = r2.insertWithOnConflict(r1, r6, r5, r7);	 Catch:{ all -> 0x01ee }
        r8 = 0;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 >= 0) goto L_0x0229;
    L_0x01d6:
        r1 = new android.database.sqlite.SQLiteException;	 Catch:{ all -> 0x01ee }
        r3 = "Failed to insert to FlagOverrides for ";
        r0 = r10.f28448b;	 Catch:{ all -> 0x01ee }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x01ee }
        r4 = r0.length();	 Catch:{ all -> 0x01ee }
        if (r4 == 0) goto L_0x0223;
    L_0x01e6:
        r0 = r3.concat(r0);	 Catch:{ all -> 0x01ee }
    L_0x01ea:
        r1.<init>(r0);	 Catch:{ all -> 0x01ee }
        throw r1;	 Catch:{ all -> 0x01ee }
    L_0x01ee:
        r0 = move-exception;
        r2.endTransaction();
        throw r0;
    L_0x01f3:
        r6 = "boolVal";
        r1 = r1.m26471b();	 Catch:{ all -> 0x01ee }
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x01ee }
        r5.put(r6, r1);	 Catch:{ all -> 0x01ee }
        goto L_0x01c8;
    L_0x0201:
        r6 = "floatVal";
        r8 = r1.m26472c();	 Catch:{ all -> 0x01ee }
        r1 = java.lang.Double.valueOf(r8);	 Catch:{ all -> 0x01ee }
        r5.put(r6, r1);	 Catch:{ all -> 0x01ee }
        goto L_0x01c8;
    L_0x020f:
        r6 = "stringVal";
        r1 = r1.m26473d();	 Catch:{ all -> 0x01ee }
        r5.put(r6, r1);	 Catch:{ all -> 0x01ee }
        goto L_0x01c8;
    L_0x0219:
        r6 = "extensionVal";
        r1 = r1.m26474e();	 Catch:{ all -> 0x01ee }
        r5.put(r6, r1);	 Catch:{ all -> 0x01ee }
        goto L_0x01c8;
    L_0x0223:
        r0 = new java.lang.String;	 Catch:{ all -> 0x01ee }
        r0.<init>(r3);	 Catch:{ all -> 0x01ee }
        goto L_0x01ea;
    L_0x0229:
        r0 = r0 + 1;
        goto L_0x015c;
    L_0x022d:
        r0 = r10.f28448b;	 Catch:{ all -> 0x01ee }
        com.google.android.gms.phenotype.core.p304a.C5507e.m26431b(r2, r0);	 Catch:{ all -> 0x01ee }
        r2.setTransactionSuccessful();	 Catch:{ all -> 0x01ee }
        r2.endTransaction();
        r0 = r10.f28448b;
        com.google.android.gms.phenotype.core.p304a.C5512j.m26436a(r11, r12, r0);
        r0 = 1;
        r0 = java.lang.Boolean.valueOf(r0);
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.phenotype.core.service.operations.m.a(android.content.Context, com.google.android.gms.phenotype.core.a.c):java.lang.Boolean");
    }
}
