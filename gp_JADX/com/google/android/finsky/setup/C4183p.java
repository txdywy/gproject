package com.google.android.finsky.setup;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.os.C0327a;
import com.android.vending.setup.C0649b;
import com.android.vending.setup.RestoreConfig;
import com.android.volley.C0657w;
import com.android.volley.p060a.ag;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.protobuf.nano.C0757i;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.wireless.android.finsky.dfe.nano.fo;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.google.wireless.android.finsky.dfe.nano.fq;
import com.google.wireless.android.finsky.dfe.nano.fr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class C4183p extends C0649b {
    public final /* synthetic */ PlaySetupService f21106a;

    C4183p(PlaySetupService playSetupService) {
        this.f21106a = playSetupService;
    }

    public final Bundle mo3992a() {
        FinskyLog.m21659a("PlaySetupService#getEarlyUpdate()", new Object[0]);
        return this.f21106a.m19079b();
    }

    public final void mo3999b() {
        FinskyLog.m21659a("PlaySetupService#startEarlyUpdate()", new Object[0]);
        PlaySetupService playSetupService = this.f21106a;
        if (((Boolean) C0955b.ek.m28964b()).booleanValue()) {
            Bundle bundle;
            synchronized (playSetupService) {
                bundle = playSetupService.f20551d;
            }
            if (bundle == null) {
                FinskyLog.m21669e("Started early-update when no earlier response given", new Object[0]);
                return;
            }
            Context applicationContext = playSetupService.getApplicationContext();
            Intent b = C1473m.f7980a.bn().mo2708b(applicationContext, PlaySetupService.class, "playsetupservice", "earlyupdatepackage");
            b.putExtras(bundle);
            applicationContext.startService(b);
            return;
        }
        FinskyLog.m21669e("Started early-update when disabled", new Object[0]);
    }

    public final boolean mo4000c() {
        FinskyLog.m21659a("PlaySetupService#cancelEarlyUpdate()", new Object[0]);
        return this.f21106a.m19080c();
    }

    public final Bundle mo3994a(String str) {
        FinskyLog.m21659a("PlaySetupService#getRestoreFlow(accountName=%s)", FinskyLog.m21655a(str));
        PlaySetupService playSetupService = this.f21106a;
        Account b = C1473m.f7980a.mo2041U().mo1183b(str);
        if (b == null) {
            FinskyLog.m21667d("Received invalid account name: %s", FinskyLog.m21655a(str));
            return null;
        }
        fo[] foVarArr;
        C1473m.f7980a.aS().mo3949a(str, 1);
        C1254c b2 = C1473m.f7980a.mo2112b(b.name);
        ag agVar = new ag();
        b2.mo1631c(agVar, agVar);
        fq fqVar = (fq) playSetupService.f20557j.m19364a(b2, agVar, "Unable to fetch backup devices");
        if (fqVar == null) {
            foVarArr = null;
        } else {
            foVarArr = fqVar.a;
            FinskyLog.m21659a("getBackupDeviceChoices returned with %d devices", Integer.valueOf(foVarArr.length));
        }
        if (foVarArr == null || foVarArr.length == 0) {
            return null;
        }
        Parcelable a = SetupWizardSelectDeviceActivity.m19122a(b.name, foVarArr);
        Bundle bundle = new Bundle();
        bundle.putParcelable("available_restore_intent", a);
        return bundle;
    }

    public final void mo4001d() {
        FinskyLog.m21659a("PlaySetupService#startVpa()", new Object[0]);
        FinskyLog.m21659a("Starting VPA", new Object[0]);
        VpaService.m19139a(C1473m.f7980a.f7981b, C1473m.f7980a.bn());
    }

    public final Bundle mo4002e() {
        FinskyLog.m21659a("PlaySetupService#getFinalHoldFlow()", new Object[0]);
        PlaySetupService playSetupService = this.f21106a;
        playSetupService.m19082e();
        FinskyLog.m21659a("Getting final hold flow", new Object[0]);
        Bundle bundle = new Bundle();
        if (C1503a.m8830a(playSetupService.getApplicationContext()) || C0327a.m1721a() || !VpaService.f20698c) {
            if (VpaService.m19145c() || C1473m.f7980a.cK().mo3929a()) {
                FinskyLog.m21659a("Showing Final Hold...", new Object[0]);
                bundle.putParcelable("final_hold_intent", C1473m.f7980a.bo().mo2766f(playSetupService.getApplicationContext()));
            }
            if (VpaService.m19146d()) {
                VpaService.m19144b(C1473m.f7980a.f7981b, C1473m.f7980a.bn());
            }
        } else {
            FinskyLog.m21659a("Showing VPA selection...", new Object[0]);
            bundle.putParcelable("final_hold_intent", VpaSelectionActivity.m19124a(C1473m.f7980a.cZ()));
        }
        return bundle;
    }

    public final void mo4003f() {
        FinskyLog.m21659a("PlaySetupService#startDownloads()", new Object[0]);
        this.f21106a.m19082e();
    }

    public final Bundle mo3993a(RestoreConfig restoreConfig) {
        FinskyLog.m21659a("PlaySetupService#getAppsRestoreFlow()", new Object[0]);
        PlaySetupService playSetupService = this.f21106a;
        Account[] accountArr = restoreConfig.f4021c;
        if (accountArr == null || accountArr.length == 0) {
            FinskyLog.m21667d("Received 0 accounts", new Object[0]);
        } else {
            Account account = accountArr[0];
            if (account == null) {
                FinskyLog.m21667d("Received null account", new Object[0]);
            } else {
                C1473m.f7980a.aS().mo3949a(account.name, 1);
                C0657w agVar = new ag();
                C1254c b = C1473m.f7980a.mo2112b(account.name);
                C1473m.f7980a.bJ().m21190a(b, C2693e.m14552a(), restoreConfig.f4020b, agVar, agVar);
                fr frVar = (fr) playSetupService.f20557j.m19364a(b, agVar, "Unable to fetch backup apps");
                if (frVar != null) {
                    C0757i[] c0757iArr = frVar.b;
                    if (c0757iArr.length != 0) {
                        Bundle bundle = new Bundle();
                        String str = account.name;
                        Parcelable intent = new Intent(C1473m.f7980a.f7981b, RestoreAppsActivity.class);
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("backup_document_infos", ParcelableProtoArray.m21675a(c0757iArr));
                        intent.putExtra("backup_document_infos_bundle", bundle2);
                        intent.putExtra("authAccount", str);
                        bundle.putParcelable("available_restore_intent", intent);
                        bundle.putInt("available_apps_count", c0757iArr.length);
                        return bundle;
                    }
                }
            }
        }
        return null;
    }

    public final Bundle mo3995a(String str, long j) {
        FinskyLog.m21659a("PlaySetupService#getPackagesForDevice(accountName=%s, androidId=%s)", FinskyLog.m21655a(str), FinskyLog.m21655a(Long.toString(j)));
        return this.f21106a.m19074a(str, j);
    }

    public final void mo3998a(String str, Bundle[] bundleArr) {
        boolean z;
        int i = 0;
        FinskyLog.m21659a("PlaySetupService#restorepackages(accountName=%s, packages=%d:%s)", FinskyLog.m21655a(str), Integer.valueOf(bundleArr.length), Arrays.toString(bundleArr));
        Context context = this.f21106a;
        C0954a.aZ.m5763a(Boolean.valueOf(true));
        if (((Boolean) C0955b.ho.m28964b()).booleanValue()) {
            z = false;
        } else {
            z = context.f20556i.m19518a(context.getPackageManager().getPackagesForUid(Binder.getCallingUid()), (String) C0955b.hp.m28964b());
        }
        if (z) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            while (i < bundleArr.length) {
                try {
                    if (bundleArr[i].containsKey("backup_document_info")) {
                        arrayList.add((fp) C0757i.m4905a(new fp(), bundleArr[i].getByteArray("backup_document_info")));
                    } else {
                        arrayList2.add(cv.m12384a(bundleArr[i].getByteArray("doc")));
                    }
                    i++;
                } catch (InvalidProtocolBufferNanoException e) {
                } catch (NullPointerException e2) {
                }
            }
            C1473m.f7980a.cK().mo3927a(context, str, (fp[]) arrayList.toArray(new fp[arrayList.size()]), true);
            if (!arrayList2.isEmpty()) {
                C1473m.f7980a.ah().mo2815a(new C4186s(context, str, arrayList2));
                return;
            }
            return;
        }
        return;
        throw new IllegalArgumentException("Pass bundles from getPackagesForDevice without any modifications");
    }

    public final void mo3997a(ResultReceiver resultReceiver) {
        FinskyLog.m21659a("PlaySetupService#performFinalHoldAsync(receiver=%s)", resultReceiver);
        this.f21106a.m19077a(resultReceiver);
    }

    public final Bundle mo3996a(String str, String[] strArr) {
        FinskyLog.m21659a("PlaySetupService#getCompatiblePackages(accountName=%s, packageNames=%d:%s)", FinskyLog.m21655a(str), Integer.valueOf(strArr.length), Arrays.toString(strArr));
        return this.f21106a.m19075a(str, strArr);
    }

    public final Bundle mo4004g() {
        FinskyLog.m21659a("PlaySetupService#performFinalHold()", new Object[0]);
        return this.f21106a.m19081d();
    }
}
