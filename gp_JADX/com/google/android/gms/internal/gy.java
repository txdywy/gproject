package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.google.android.gms.common.util.C5147b;

public final class gy extends hz {
    public final gz f26837a = new gz(this, mo4736j(), gj.m24440F());
    public boolean f26838b;

    gy(hv hvVar) {
        super(hvVar);
    }

    private final SQLiteDatabase m24577u() {
        if (this.f26838b) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f26837a.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f26838b = true;
        return null;
    }

    public final /* bridge */ /* synthetic */ void mo4727a() {
        super.mo4727a();
    }

    @TargetApi(11)
    final boolean m24579a(int i, byte[] bArr) {
        mo4727a();
        mo4728b();
        if (this.f26838b) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        gj.m24448P();
        int i2 = 0;
        int i3 = 5;
        while (i2 < 5) {
            SQLiteDatabase sQLiteDatabase = null;
            Cursor cursor = null;
            try {
                sQLiteDatabase = m24577u();
                if (sQLiteDatabase == null) {
                    this.f26838b = true;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    return false;
                }
                sQLiteDatabase.beginTransaction();
                long j = 0;
                cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                if (cursor != null && cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
                if (j >= 100000) {
                    mo4742p().f26845d.m24652a("Data loss, local db full");
                    j = (100000 - j) + 1;
                    long delete = (long) sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j)});
                    if (delete != j) {
                        mo4742p().f26845d.m24655a("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j), Long.valueOf(delete), Long.valueOf(j - delete));
                    }
                }
                sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return true;
            } catch (SQLiteFullException e) {
                mo4742p().f26845d.m24653a("Error writing entry to local database", e);
                this.f26838b = true;
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                i2++;
            } catch (SQLiteException e2) {
                if (VERSION.SDK_INT < 11 || !(e2 instanceof SQLiteDatabaseLockedException)) {
                    if (sQLiteDatabase != null) {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    }
                    mo4742p().f26845d.m24653a("Error writing entry to local database", e2);
                    this.f26838b = true;
                } else {
                    SystemClock.sleep((long) i3);
                    i3 += 20;
                }
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                i2++;
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            }
        }
        mo4742p().f26847f.m24652a("Failed to write entry to local database");
        return false;
    }

    public final /* bridge */ /* synthetic */ void mo4728b() {
        super.mo4728b();
    }

    public final /* bridge */ /* synthetic */ gd mo4729c() {
        return super.mo4729c();
    }

    public final /* bridge */ /* synthetic */ ib mo4730d() {
        return super.mo4730d();
    }

    public final /* bridge */ /* synthetic */ gx mo4731e() {
        return super.mo4731e();
    }

    public final /* bridge */ /* synthetic */ go mo4732f() {
        return super.mo4732f();
    }

    public final /* bridge */ /* synthetic */ il mo4733g() {
        return super.mo4733g();
    }

    public final /* bridge */ /* synthetic */ ig mo4734h() {
        return super.mo4734h();
    }

    public final /* bridge */ /* synthetic */ C5147b mo4735i() {
        return super.mo4735i();
    }

    public final /* bridge */ /* synthetic */ Context mo4736j() {
        return super.mo4736j();
    }

    public final /* bridge */ /* synthetic */ gy mo4737k() {
        return super.mo4737k();
    }

    public final /* bridge */ /* synthetic */ ha mo4738l() {
        return super.mo4738l();
    }

    public final /* bridge */ /* synthetic */ jl mo4739m() {
        return super.mo4739m();
    }

    public final /* bridge */ /* synthetic */ jb mo4740n() {
        return super.mo4740n();
    }

    public final /* bridge */ /* synthetic */ hr mo4741o() {
        return super.mo4741o();
    }

    public final /* bridge */ /* synthetic */ hc mo4742p() {
        return super.mo4742p();
    }

    public final /* bridge */ /* synthetic */ hj mo4743q() {
        return super.mo4743q();
    }

    public final /* bridge */ /* synthetic */ gj mo4744r() {
        return super.mo4744r();
    }

    protected final void mo4745s() {
    }

    @android.annotation.TargetApi(11)
    public final java.util.List m24598t() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:150:0x00f3
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.modifyBlocksTree(BlockProcessor.java:248)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.rerun(BlockProcessor.java:44)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.visit(BlockFinallyExtract.java:57)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r14 = this;
        r14.mo4728b();
        r14.mo4727a();
        r0 = r14.f26838b;
        if (r0 == 0) goto L_0x000c;
    L_0x000a:
        r0 = 0;
    L_0x000b:
        return r0;
    L_0x000c:
        r10 = new java.util.ArrayList;
        r10.<init>();
        r0 = r14.mo4736j();
        r1 = com.google.android.gms.internal.gj.m24440F();
        r0 = r0.getDatabasePath(r1);
        r0 = r0.exists();
        if (r0 != 0) goto L_0x0025;
    L_0x0023:
        r0 = r10;
        goto L_0x000b;
    L_0x0025:
        r9 = 5;
        r0 = 0;
        r12 = r0;
    L_0x0028:
        r0 = 5;
        if (r12 >= r0) goto L_0x01d3;
    L_0x002b:
        r1 = 0;
        r11 = 0;
        r0 = r14.m24577u();	 Catch:{ SQLiteFullException -> 0x0200, SQLiteException -> 0x01f5, all -> 0x01e1 }
        if (r0 != 0) goto L_0x003d;
    L_0x0033:
        r1 = 1;
        r14.f26838b = r1;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        if (r0 == 0) goto L_0x003b;
    L_0x0038:
        r0.close();
    L_0x003b:
        r0 = 0;
        goto L_0x000b;
    L_0x003d:
        r0.beginTransaction();	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r1 = "messages";	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r2 = 3;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r2 = new java.lang.String[r2];	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r3 = 0;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r4 = "rowid";	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r2[r3] = r4;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r3 = 1;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r4 = "type";	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r2[r3] = r4;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r3 = 2;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r4 = "entry";	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r2[r3] = r4;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r3 = 0;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r4 = 0;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r5 = 0;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r6 = 0;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r7 = "rowid asc";	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r8 = 100;	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r8 = java.lang.Integer.toString(r8);	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r2 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ SQLiteFullException -> 0x0205, SQLiteException -> 0x01f9, all -> 0x01e5 }
        r4 = -1;
    L_0x0066:
        r1 = r2.moveToNext();	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        if (r1 == 0) goto L_0x0181;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x006c:
        r1 = 0;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r4 = r2.getLong(r1);	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r1 = 1;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r1 = r2.getInt(r1);	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r3 = 2;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r6 = r2.getBlob(r3);	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        if (r1 != 0) goto L_0x0102;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x007d:
        r3 = android.os.Parcel.obtain();	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r1 = 0;
        r7 = r6.length;	 Catch:{ zzc -> 0x00bf, all -> 0x00ee }
        r3.unmarshall(r6, r1, r7);	 Catch:{ zzc -> 0x00bf, all -> 0x00ee }
        r1 = 0;	 Catch:{ zzc -> 0x00bf, all -> 0x00ee }
        r3.setDataPosition(r1);	 Catch:{ zzc -> 0x00bf, all -> 0x00ee }
        r1 = com.google.android.gms.internal.zzcqw.CREATOR;	 Catch:{ zzc -> 0x00bf, all -> 0x00ee }
        r1 = r1.createFromParcel(r3);	 Catch:{ zzc -> 0x00bf, all -> 0x00ee }
        r1 = (com.google.android.gms.internal.zzcqw) r1;	 Catch:{ zzc -> 0x00bf, all -> 0x00ee }
        r3.recycle();
        if (r1 == 0) goto L_0x0066;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x0097:
        r10.add(r1);	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        goto L_0x0066;
    L_0x009b:
        r1 = move-exception;
        r13 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r13;
    L_0x00a0:
        r3 = r14.mo4742p();	 Catch:{ all -> 0x01ec }
        r3 = r3.f26845d;	 Catch:{ all -> 0x01ec }
        r4 = "Error reading entries from local database";	 Catch:{ all -> 0x01ec }
        r3.m24653a(r4, r0);	 Catch:{ all -> 0x01ec }
        r0 = 1;	 Catch:{ all -> 0x01ec }
        r14.f26838b = r0;	 Catch:{ all -> 0x01ec }
        if (r1 == 0) goto L_0x00b3;
    L_0x00b0:
        r1.close();
    L_0x00b3:
        if (r2 == 0) goto L_0x020b;
    L_0x00b5:
        r2.close();
        r0 = r9;
    L_0x00b9:
        r1 = r12 + 1;
        r12 = r1;
        r9 = r0;
        goto L_0x0028;
    L_0x00bf:
        r1 = move-exception;
        r1 = r14.mo4742p();	 Catch:{ zzc -> 0x00bf, all -> 0x00ee }
        r1 = r1.f26845d;	 Catch:{ zzc -> 0x00bf, all -> 0x00ee }
        r6 = "Failed to load event from local database";	 Catch:{ zzc -> 0x00bf, all -> 0x00ee }
        r1.m24652a(r6);	 Catch:{ zzc -> 0x00bf, all -> 0x00ee }
        r3.recycle();
        goto L_0x0066;
    L_0x00cf:
        r1 = move-exception;
        r13 = r1;
        r1 = r0;
        r0 = r13;
    L_0x00d3:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ all -> 0x01f2 }
        r4 = 11;	 Catch:{ all -> 0x01f2 }
        if (r3 < r4) goto L_0x01b7;	 Catch:{ all -> 0x01f2 }
    L_0x00d9:
        r3 = r0 instanceof android.database.sqlite.SQLiteDatabaseLockedException;	 Catch:{ all -> 0x01f2 }
        if (r3 == 0) goto L_0x01b7;	 Catch:{ all -> 0x01f2 }
    L_0x00dd:
        r4 = (long) r9;	 Catch:{ all -> 0x01f2 }
        android.os.SystemClock.sleep(r4);	 Catch:{ all -> 0x01f2 }
        r0 = r9 + 20;
    L_0x00e3:
        if (r2 == 0) goto L_0x00e8;
    L_0x00e5:
        r2.close();
    L_0x00e8:
        if (r1 == 0) goto L_0x00b9;
    L_0x00ea:
        r1.close();
        goto L_0x00b9;
    L_0x00ee:
        r1 = move-exception;
        r3.recycle();	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        throw r1;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x00f3:
        r1 = move-exception;
        r13 = r1;
        r1 = r0;
        r0 = r13;
    L_0x00f7:
        if (r2 == 0) goto L_0x00fc;
    L_0x00f9:
        r2.close();
    L_0x00fc:
        if (r1 == 0) goto L_0x0101;
    L_0x00fe:
        r1.close();
    L_0x0101:
        throw r0;
    L_0x0102:
        r3 = 1;
        if (r1 != r3) goto L_0x013b;
    L_0x0105:
        r7 = android.os.Parcel.obtain();	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r3 = 0;
        r1 = 0;
        r8 = r6.length;	 Catch:{ zzc -> 0x0125, all -> 0x0136 }
        r7.unmarshall(r6, r1, r8);	 Catch:{ zzc -> 0x0125, all -> 0x0136 }
        r1 = 0;	 Catch:{ zzc -> 0x0125, all -> 0x0136 }
        r7.setDataPosition(r1);	 Catch:{ zzc -> 0x0125, all -> 0x0136 }
        r1 = com.google.android.gms.internal.zzcvg.CREATOR;	 Catch:{ zzc -> 0x0125, all -> 0x0136 }
        r1 = r1.createFromParcel(r7);	 Catch:{ zzc -> 0x0125, all -> 0x0136 }
        r1 = (com.google.android.gms.internal.zzcvg) r1;	 Catch:{ zzc -> 0x0125, all -> 0x0136 }
        r7.recycle();
    L_0x011e:
        if (r1 == 0) goto L_0x0066;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x0120:
        r10.add(r1);	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        goto L_0x0066;
    L_0x0125:
        r1 = move-exception;
        r1 = r14.mo4742p();	 Catch:{ zzc -> 0x0125, all -> 0x0136 }
        r1 = r1.f26845d;	 Catch:{ zzc -> 0x0125, all -> 0x0136 }
        r6 = "Failed to load user property from local database";	 Catch:{ zzc -> 0x0125, all -> 0x0136 }
        r1.m24652a(r6);	 Catch:{ zzc -> 0x0125, all -> 0x0136 }
        r7.recycle();
        r1 = r3;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        goto L_0x011e;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x0136:
        r1 = move-exception;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r7.recycle();	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        throw r1;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x013b:
        r3 = 2;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        if (r1 != r3) goto L_0x0174;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x013e:
        r7 = android.os.Parcel.obtain();	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r3 = 0;
        r1 = 0;
        r8 = r6.length;	 Catch:{ zzc -> 0x015e, all -> 0x016f }
        r7.unmarshall(r6, r1, r8);	 Catch:{ zzc -> 0x015e, all -> 0x016f }
        r1 = 0;	 Catch:{ zzc -> 0x015e, all -> 0x016f }
        r7.setDataPosition(r1);	 Catch:{ zzc -> 0x015e, all -> 0x016f }
        r1 = com.google.android.gms.internal.zzcqh.CREATOR;	 Catch:{ zzc -> 0x015e, all -> 0x016f }
        r1 = r1.createFromParcel(r7);	 Catch:{ zzc -> 0x015e, all -> 0x016f }
        r1 = (com.google.android.gms.internal.zzcqh) r1;	 Catch:{ zzc -> 0x015e, all -> 0x016f }
        r7.recycle();
    L_0x0157:
        if (r1 == 0) goto L_0x0066;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x0159:
        r10.add(r1);	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        goto L_0x0066;
    L_0x015e:
        r1 = move-exception;
        r1 = r14.mo4742p();	 Catch:{ zzc -> 0x015e, all -> 0x016f }
        r1 = r1.f26845d;	 Catch:{ zzc -> 0x015e, all -> 0x016f }
        r6 = "Failed to load user property from local database";	 Catch:{ zzc -> 0x015e, all -> 0x016f }
        r1.m24652a(r6);	 Catch:{ zzc -> 0x015e, all -> 0x016f }
        r7.recycle();
        r1 = r3;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        goto L_0x0157;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x016f:
        r1 = move-exception;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r7.recycle();	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        throw r1;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x0174:
        r1 = r14.mo4742p();	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r1 = r1.f26845d;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r3 = "Unknown record type in local database";	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r1.m24652a(r3);	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        goto L_0x0066;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x0181:
        r1 = "messages";	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r3 = "rowid <= ?";	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r6 = 1;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r6 = new java.lang.String[r6];	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r7 = 0;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r4 = java.lang.Long.toString(r4);	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r6[r7] = r4;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r1 = r0.delete(r1, r3, r6);	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r3 = r10.size();	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        if (r1 >= r3) goto L_0x01a4;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x0199:
        r1 = r14.mo4742p();	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r1 = r1.f26845d;	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r3 = "Fewer entries removed from local database than expected";	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r1.m24652a(r3);	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
    L_0x01a4:
        r0.setTransactionSuccessful();	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        r0.endTransaction();	 Catch:{ SQLiteFullException -> 0x009b, SQLiteException -> 0x00cf, all -> 0x00f3 }
        if (r2 == 0) goto L_0x01af;
    L_0x01ac:
        r2.close();
    L_0x01af:
        if (r0 == 0) goto L_0x01b4;
    L_0x01b1:
        r0.close();
    L_0x01b4:
        r0 = r10;
        goto L_0x000b;
    L_0x01b7:
        if (r1 == 0) goto L_0x01c2;
    L_0x01b9:
        r3 = r1.inTransaction();	 Catch:{ all -> 0x01f2 }
        if (r3 == 0) goto L_0x01c2;	 Catch:{ all -> 0x01f2 }
    L_0x01bf:
        r1.endTransaction();	 Catch:{ all -> 0x01f2 }
    L_0x01c2:
        r3 = r14.mo4742p();	 Catch:{ all -> 0x01f2 }
        r3 = r3.f26845d;	 Catch:{ all -> 0x01f2 }
        r4 = "Error reading entries from local database";	 Catch:{ all -> 0x01f2 }
        r3.m24653a(r4, r0);	 Catch:{ all -> 0x01f2 }
        r0 = 1;	 Catch:{ all -> 0x01f2 }
        r14.f26838b = r0;	 Catch:{ all -> 0x01f2 }
        r0 = r9;
        goto L_0x00e3;
    L_0x01d3:
        r0 = r14.mo4742p();
        r0 = r0.f26847f;
        r1 = "Failed to read events from database in reasonable time";
        r0.m24652a(r1);
        r0 = 0;
        goto L_0x000b;
    L_0x01e1:
        r0 = move-exception;
        r2 = r11;
        goto L_0x00f7;
    L_0x01e5:
        r1 = move-exception;
        r2 = r11;
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x00f7;
    L_0x01ec:
        r0 = move-exception;
        r13 = r1;
        r1 = r2;
        r2 = r13;
        goto L_0x00f7;
    L_0x01f2:
        r0 = move-exception;
        goto L_0x00f7;
    L_0x01f5:
        r0 = move-exception;
        r2 = r11;
        goto L_0x00d3;
    L_0x01f9:
        r1 = move-exception;
        r2 = r11;
        r13 = r1;
        r1 = r0;
        r0 = r13;
        goto L_0x00d3;
    L_0x0200:
        r0 = move-exception;
        r2 = r1;
        r1 = r11;
        goto L_0x00a0;
    L_0x0205:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
        r1 = r11;
        goto L_0x00a0;
    L_0x020b:
        r0 = r9;
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gy.t():java.util.List");
    }
}
