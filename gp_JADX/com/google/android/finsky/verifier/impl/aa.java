package com.google.android.finsky.verifier.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.finsky.aa.C0955b;
import com.google.android.p254g.p255a.C4318e;
import com.google.android.p254g.p255a.C4739d;
import com.google.android.p254g.p255a.C4879a;

final class aa extends C4739d {
    public final /* synthetic */ PackageVerificationApiService f24376a;

    aa(PackageVerificationApiService packageVerificationApiService) {
        this.f24376a = packageVerificationApiService;
    }

    public final void mo4340a(C4879a c4879a) {
        if (this.f24376a.m21998a(getCallingUid()) && ((Boolean) C0955b.cz.m28964b()).booleanValue()) {
            Intent intent = new Intent("com.google.android.vending.verifier.ACTION_LIST_HARMFUL_APPS");
            intent.setClass(this.f24376a, PackageVerificationService.class);
            intent.putExtra("list_harmful_apps_callback", new ParcelableBinder((IInterface) c4879a));
            intent.setComponent(new ComponentName(this.f24376a, PackageVerificationService.class));
            this.f24376a.startService(intent);
            return;
        }
        c4879a.mo4463a(false, null);
    }

    public final void mo4341a(C4318e c4318e, long j) {
        if (!this.f24376a.m21998a(getCallingUid()) || this.f24376a.f24303a.dj().mo2294a(12628013)) {
            c4318e.mo4122a(false, null);
            return;
        }
        Intent intent = new Intent("com.google.android.vending.verifier.ACTION_GET_VERIFY_APPS_DATA");
        intent.setClass(this.f24376a, PackageVerificationService.class);
        intent.putExtra("verify_apps_data_callback", new ParcelableBinder((IInterface) c4318e));
        intent.putExtra("verify_apps_data_flags", j);
        intent.setComponent(new ComponentName(this.f24376a, PackageVerificationService.class));
        this.f24376a.startService(intent);
    }

    public final void mo4342a(C4318e c4318e, Bundle bundle) {
        if (!this.f24376a.m21998a(getCallingUid()) || this.f24376a.f24303a.dj().mo2294a(12628013)) {
            c4318e.mo4122a(false, null);
            return;
        }
        Intent intent = new Intent("com.google.android.vending.verifier.ACTION_GET_VERIFY_APPS_DATA");
        intent.setClass(this.f24376a, PackageVerificationService.class);
        intent.putExtra("verify_apps_data_callback", new ParcelableBinder((IInterface) c4318e));
        intent.putExtras(bundle);
        intent.setComponent(new ComponentName(this.f24376a, PackageVerificationService.class));
        this.f24376a.startService(intent);
    }
}
