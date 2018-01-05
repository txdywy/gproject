package com.android.vending;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.ParcelFileDescriptor;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.aa.o;
import com.google.android.finsky.m;
import com.google.android.finsky.setup.al;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.d;
import com.google.android.play.utils.b.a;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public class VendingBackupAgent extends BackupAgentHelper
{

    VendingBackupAgent() {
        BackupAgentHelper();
    }

    private static void a(BackupDataOutput p0, ByteArrayOutputStream p1, DataOutputStream p2, String p3, boolean p4) {
        p2.writeBoolean(p4);
        VendingBackupAgent.a(p0, p1, p3);
    }

    private static void a(BackupDataOutput p0, ByteArrayOutputStream p1, String p2) {
        v0 = p1.toByteArray();
        p0.writeEntityHeader(p2, v0.length);
        p0.writeEntityData(v0, v0.length);
        p1.reset();
    }

    public Context createConfigurationContext(Configuration p0) {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = new com.google.b.a.a.a.a.a.e(super.createConfigurationContext(p0));
        else
            v0 = 0;
        return v0;
    }

    public AssetManager getAssets() {
        return com.google.b.a.a.a.a.a.c.b(this);
    }

    public Resources getResources() {
        return com.google.b.a.a.a.a.a.c.a(this);
    }

    public Resources$Theme getTheme() {
        return com.google.b.a.a.a.a.a.c.c(this);
    }

    public void onBackup(ParcelFileDescriptor p0, BackupDataOutput p1, ParcelFileDescriptor p2) {
        v1 = new ByteArrayOutputStream();
        v2 = new DataOutputStream(v1);
        v4 = ((Long)com.google.android.finsky.aa.b.a().b()).longValue();
        v3 = new Object[1];
        v3[0] = FinskyLog.a(Long.toHexString(v4));
        FinskyLog.a("Backing up aid: %s", v3);
        v2.writeLong(v4);
        VendingBackupAgent.a(p1, v1, "vending");
        VendingBackupAgent.a(p1, v1, v2, "auto_update_enabled", ((Boolean)com.google.android.finsky.aa.a.x.a()).booleanValue());
        VendingBackupAgent.a(p1, v1, v2, "update_over_wifi_only", ((Boolean)com.google.android.finsky.aa.a.y.a()).booleanValue());
        VendingBackupAgent.a(p1, v1, v2, "auto_add_shortcuts", ((Boolean)com.google.android.finsky.aa.o.k.a()).booleanValue());
        VendingBackupAgent.a(p1, v1, v2, "notify_updates", ((Boolean)com.google.android.finsky.aa.o.h.a()).booleanValue());
        VendingBackupAgent.a(p1, v1, v2, "notify_updates_completion", ((Boolean)com.google.android.finsky.aa.o.i.a()).booleanValue());
        v2.writeInt(((Integer)com.google.android.finsky.aa.a.c.a()).intValue());
        VendingBackupAgent.a(p1, v1, "content-filter-level");
        VendingBackupAgent.a(p1, v1, v2, "verify-parent-enabled", ((Boolean)com.google.android.finsky.aa.a.bs.a()).booleanValue());
        VendingBackupAgent.a(p1, v1, v2, "verify-apps-consent", com.google.android.finsky.m.a.bp().e());
        com.google.android.finsky.aa.o.f.a(Boolean.valueOf(1));
    }

    public void onRestore(BackupDataInput p0, int p1, ParcelFileDescriptor p2) {
        FinskyLog.a("Entered onRestore", new Object[0]);
        v6 = 0;
        v7 = 0;
        v1 = 0;
        while (p0.readNextHeader()) {
            v0 = p0.getDataSize();
            v2 = new byte[v0];
            p0.readEntityData(v2, 0, v0);
            v2 = new DataInputStream(new ByteArrayInputStream(v2));
            v0 = p0.getKey();
            v5 = new Object[1];
            v5[0] = v0;
            FinskyLog.a("Restoring key %s", v5);
            if ("vending".equals(v0)) {
                v2 = Long.toHexString(v2.readLong());
                v1 = new Object[1];
                v1[0] = FinskyLog.a(v2);
                FinskyLog.a("Restored aid: %s", v1);
                com.google.android.finsky.m.a.cK().a(this, v2, 0, 0);
                com.google.android.finsky.aa.o.g.a(v2);
                v1 = 1;
            }
            else if ("auto_update_enabled".equals(v0))
                v7 = Boolean.valueOf(v2.readBoolean());
            else if ("update_over_wifi_only".equals(v0))
                v6 = Boolean.valueOf(v2.readBoolean());
            else if ("auto_add_shortcuts".equals(v0))
                com.google.android.finsky.aa.o.k.a(Boolean.valueOf(v2.readBoolean()));
            else if ("notify_updates".equals(v0))
                com.google.android.finsky.aa.o.h.a(Boolean.valueOf(v2.readBoolean()));
            else if ("notify_updates_completion".equals(v0))
                com.google.android.finsky.aa.o.i.a(Boolean.valueOf(v2.readBoolean()));
            else if ("content-filter-level".equals(v0))
                com.google.android.finsky.aa.a.c.a(Integer.valueOf(v2.readInt()));
            else if ("verify-parent-enabled".equals(v0))
                com.google.android.finsky.aa.a.bs.a(Boolean.valueOf(v2.readBoolean()));
            else if ("verify-apps-consent".equals(v0))
                com.google.android.finsky.m.a.bp().b(v2.readBoolean());
        }
        if (com.google.android.finsky.aa.a.x.b())
            FinskyLog.a("Skip restore auto-update - already set locally.", new Object[0]);
        else if (v7 != 0)
            com.google.android.finsky.aa.a.x.a(v7);
        if (com.google.android.finsky.aa.a.y.b())
            FinskyLog.a("Skip restore auto-update Wi-Fi preference - already set locally.", new Object[0]);
        else if (v6 != 0)
            com.google.android.finsky.aa.a.y.a(v6);
        if (v1 == 0)
            FinskyLog.c("Restore completed, no Market aid was found", new Object[0]);
        FinskyLog.a("Finished onRestore", new Object[0]);
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
