package com.android.vending;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;

public class VendingBackupAgent extends BackupAgentHelper {
    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        FinskyLog.m21659a("Backing up aid: %s", FinskyLog.m21655a(Long.toHexString(((Long) C0955b.m5748a().m28964b()).longValue())));
        dataOutputStream.writeLong(r4);
        m4295a(backupDataOutput, byteArrayOutputStream, "vending");
        m4294a(backupDataOutput, byteArrayOutputStream, dataOutputStream, "auto_update_enabled", ((Boolean) C0954a.f5854x.m5760a()).booleanValue());
        m4294a(backupDataOutput, byteArrayOutputStream, dataOutputStream, "update_over_wifi_only", ((Boolean) C0954a.f5855y.m5760a()).booleanValue());
        m4294a(backupDataOutput, byteArrayOutputStream, dataOutputStream, "auto_add_shortcuts", ((Boolean) C0968o.f5934k.m5760a()).booleanValue());
        m4294a(backupDataOutput, byteArrayOutputStream, dataOutputStream, "notify_updates", ((Boolean) C0968o.f5931h.m5760a()).booleanValue());
        m4294a(backupDataOutput, byteArrayOutputStream, dataOutputStream, "notify_updates_completion", ((Boolean) C0968o.f5932i.m5760a()).booleanValue());
        dataOutputStream.writeInt(((Integer) C0954a.f5833c.m5760a()).intValue());
        m4295a(backupDataOutput, byteArrayOutputStream, "content-filter-level");
        m4294a(backupDataOutput, byteArrayOutputStream, dataOutputStream, "verify-parent-enabled", ((Boolean) C0954a.bs.m5760a()).booleanValue());
        m4294a(backupDataOutput, byteArrayOutputStream, dataOutputStream, "verify-apps-consent", C1473m.f7980a.bp().mo4368e());
        C0968o.f5929f.m5763a(Boolean.valueOf(true));
    }

    private static void m4294a(BackupDataOutput backupDataOutput, ByteArrayOutputStream byteArrayOutputStream, DataOutputStream dataOutputStream, String str, boolean z) {
        dataOutputStream.writeBoolean(z);
        m4295a(backupDataOutput, byteArrayOutputStream, str);
    }

    private static void m4295a(BackupDataOutput backupDataOutput, ByteArrayOutputStream byteArrayOutputStream, String str) {
        byte[] toByteArray = byteArrayOutputStream.toByteArray();
        backupDataOutput.writeEntityHeader(str, toByteArray.length);
        backupDataOutput.writeEntityData(toByteArray, toByteArray.length);
        byteArrayOutputStream.reset();
    }

    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        FinskyLog.m21659a("Entered onRestore", new Object[0]);
        Object obj = null;
        Object obj2 = null;
        int i2 = 0;
        while (backupDataInput.readNextHeader()) {
            int dataSize = backupDataInput.getDataSize();
            byte[] bArr = new byte[dataSize];
            backupDataInput.readEntityData(bArr, 0, dataSize);
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            String key = backupDataInput.getKey();
            FinskyLog.m21659a("Restoring key %s", key);
            if ("vending".equals(key)) {
                Object toHexString = Long.toHexString(dataInputStream.readLong());
                FinskyLog.m21659a("Restored aid: %s", FinskyLog.m21655a((String) toHexString));
                C1473m.f7980a.cK().mo3924a((Context) this, (String) toHexString, null, 0);
                C0968o.f5930g.m5763a(toHexString);
                i2 = 1;
            } else if ("auto_update_enabled".equals(key)) {
                obj2 = Boolean.valueOf(dataInputStream.readBoolean());
            } else if ("update_over_wifi_only".equals(key)) {
                obj = Boolean.valueOf(dataInputStream.readBoolean());
            } else if ("auto_add_shortcuts".equals(key)) {
                C0968o.f5934k.m5763a(Boolean.valueOf(dataInputStream.readBoolean()));
            } else if ("notify_updates".equals(key)) {
                C0968o.f5931h.m5763a(Boolean.valueOf(dataInputStream.readBoolean()));
            } else if ("notify_updates_completion".equals(key)) {
                C0968o.f5932i.m5763a(Boolean.valueOf(dataInputStream.readBoolean()));
            } else if ("content-filter-level".equals(key)) {
                C0954a.f5833c.m5763a(Integer.valueOf(dataInputStream.readInt()));
            } else if ("verify-parent-enabled".equals(key)) {
                C0954a.bs.m5763a(Boolean.valueOf(dataInputStream.readBoolean()));
            } else if ("verify-apps-consent".equals(key)) {
                C1473m.f7980a.bp().mo4364b(dataInputStream.readBoolean());
            }
        }
        if (C0954a.f5854x.m5764b()) {
            FinskyLog.m21659a("Skip restore auto-update - already set locally.", new Object[0]);
        } else if (obj2 != null) {
            C0954a.f5854x.m5763a(obj2);
        }
        if (C0954a.f5855y.m5764b()) {
            FinskyLog.m21659a("Skip restore auto-update Wi-Fi preference - already set locally.", new Object[0]);
        } else if (obj != null) {
            C0954a.f5855y.m5763a(obj);
        }
        if (i2 == 0) {
            FinskyLog.m21665c("Restore completed, no Market aid was found", new Object[0]);
        }
        FinskyLog.m21659a("Finished onRestore", new Object[0]);
    }
}
