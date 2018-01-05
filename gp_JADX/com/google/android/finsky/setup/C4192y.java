package com.google.android.finsky.setup;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.android.vending.setup.C0651d;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.setup.p241b.C4129a;
import com.google.android.finsky.setup.p241b.C4130b;
import com.google.android.finsky.setup.p241b.C4131d;
import com.google.android.finsky.setup.p241b.C4134g;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Arrays;

final class C4192y extends C0651d {
    public final /* synthetic */ PlaySetupServiceV2 f21120a;

    C4192y(PlaySetupServiceV2 playSetupServiceV2) {
        this.f21120a = playSetupServiceV2;
    }

    public final void mo4011a(ResultReceiver resultReceiver) {
        FinskyLog.m21659a("PlaySetupServiceV2#startEarlyUpdate(receiver=%s)", resultReceiver);
        this.f21120a.f20561d.mo3970a(resultReceiver);
    }

    public final void mo4010a() {
        FinskyLog.m21659a("PlaySetupServiceV2#cancelEarlyUpdate()", new Object[0]);
        this.f21120a.f20561d.mo3972b();
    }

    public final boolean mo4016b() {
        FinskyLog.m21659a("PlaySetupServiceV2#hasEarlyUpdate()", new Object[0]);
        return this.f21120a.f20561d.mo3971a();
    }

    public final Bundle mo4007a(String str) {
        FinskyLog.m21659a("PlaySetupServiceV2#getSourceDevices(accountName=%s)", FinskyLog.m21655a(str));
        return new C4134g(str, C1473m.f7980a.cL(), C1473m.f7980a.aK()).m19250a();
    }

    public final Bundle mo4014b(String str) {
        FinskyLog.m21659a("PlaySetupServiceV2#getPaiDocuments(accountName=%s)", FinskyLog.m21655a(str));
        Context context = this.f21120a;
        C1473m.f7980a.aS().mo3949a(str, 2);
        return new C4131d(context, str, context.f20558a).mo3934a();
    }

    public final Bundle mo4008a(String str, long j) {
        FinskyLog.m21659a("PlaySetupServiceV2#getBackupDocuments(accountName=%s, androidId=%s)", FinskyLog.m21655a(str), FinskyLog.m21655a(Long.toString(j)));
        PlaySetupServiceV2 playSetupServiceV2 = this.f21120a;
        C1473m.f7980a.aS().mo3949a(str, 1);
        return new C4129a(str, j, playSetupServiceV2.f20558a, playSetupServiceV2.f20559b, C1473m.f7980a.cL(), C1473m.f7980a.aK()).mo3934a();
    }

    public final Bundle mo4009a(String str, String[] strArr) {
        FinskyLog.m21659a("PlaySetupServiceV2#getCompatibleDocuments(accountName=%s, packageNames=%d:%s)", FinskyLog.m21655a(str), Integer.valueOf(strArr.length), Arrays.toString(strArr));
        PlaySetupServiceV2 playSetupServiceV2 = this.f21120a;
        C1473m.f7980a.aS().mo3949a(str, 1);
        return new C4130b(playSetupServiceV2.f20558a, C1473m.f7980a.aK(), C1473m.f7980a.cL(), str, strArr).mo3934a();
    }

    public final void mo4012a(Bundle[] bundleArr) {
        FinskyLog.m21659a("PlaySetupServiceV2#setup(documents=%d:%s)", Integer.valueOf(bundleArr.length), Arrays.toString(bundleArr));
        PlaySetupServiceV2 playSetupServiceV2 = this.f21120a;
        C0954a.aZ.m5763a(Boolean.valueOf(true));
        if (!((Boolean) C0955b.hq.m28964b()).booleanValue()) {
            playSetupServiceV2.m19088a((String) C0955b.hr.m28964b());
            FinskyLog.m21665c("IPlaySetupServiceV2#setup() is deprecated, use #setupDocuments()", new Object[0]);
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("documents", bundleArr);
            playSetupServiceV2.m19086a(bundle);
        }
    }

    public final void mo4015b(ResultReceiver resultReceiver) {
        FinskyLog.m21659a("PlaySetupServiceV2#runFinalHold(receiver=%s)", resultReceiver);
        PlaySetupServiceV2 playSetupServiceV2 = this.f21120a;
        Bundle bundle = new Bundle();
        C1473m.f7980a.bP().m14778c();
        new Handler(playSetupServiceV2.getMainLooper()).post(new ad());
        FinskyLog.m21659a("Performing final hold silently", new Object[0]);
        if (VpaService.m19146d()) {
            VpaService.m19144b(C1473m.f7980a.f7981b, C1473m.f7980a.bn());
        }
        VpaService.m19139a(C1473m.f7980a.f7981b, C1473m.f7980a.bn());
        if (VpaService.m19145c() || RestoreServiceV2.m19101a()) {
            FinskyLog.m21659a("Blocking for Final Hold...", new Object[0]);
            bx c4193z = new C4193z(resultReceiver, bundle);
            if (RestoreServiceV2.m19102a(c4193z) || VpaService.m19142a(c4193z)) {
                return;
            }
        }
        FinskyLog.m21659a("Sending final hold complete", new Object[0]);
        resultReceiver.send(1, bundle);
    }

    public final Bundle mo4005a(Bundle bundle) {
        FinskyLog.m21659a("PlaySetupServiceV2#setupDocuments(parameters=%s)", bundle);
        return this.f21120a.m19086a(bundle);
    }

    public final Bundle mo4006a(ResultReceiver resultReceiver, Bundle bundle) {
        FinskyLog.m21659a("PlaySetupServiceV2#pauseAppUpdates(receiver=%s, options=%s)", resultReceiver, bundle);
        PlaySetupServiceV2 playSetupServiceV2 = this.f21120a;
        int callingUid = C4192y.getCallingUid();
        if (((Boolean) C0955b.ht.m28964b()).booleanValue()) {
            return PlaySetupServiceV2.m19084b("disabled");
        }
        if (resultReceiver == null) {
            return PlaySetupServiceV2.m19084b("no_receiver");
        }
        if (bundle == null) {
            return PlaySetupServiceV2.m19084b("no_caller");
        }
        playSetupServiceV2.m19088a((String) C0955b.hr.m28964b());
        String a = playSetupServiceV2.m19087a(callingUid);
        String b = PlaySetupServiceV2.m19085b(bundle);
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(b)) {
            return PlaySetupServiceV2.m19084b("no_caller");
        }
        if (C1473m.f7980a.mo2256o().mo3441a(a, b, resultReceiver)) {
            return new Bundle();
        }
        return PlaySetupServiceV2.m19084b("pause_already_called");
    }

    public final Bundle mo4013b(Bundle bundle) {
        FinskyLog.m21659a("PlaySetupServiceV2#resumeAppUpdates(options=%s)", bundle);
        String a = this.f21120a.m19087a(C4192y.getCallingUid());
        String b = PlaySetupServiceV2.m19085b(bundle);
        if (TextUtils.isEmpty(a) || TextUtils.isEmpty(b)) {
            return PlaySetupServiceV2.m19084b("no_caller");
        }
        if (C1473m.f7980a.mo2256o().mo3446b(a, b)) {
            return new Bundle();
        }
        return PlaySetupServiceV2.m19084b("pause_not_yet_called");
    }
}
