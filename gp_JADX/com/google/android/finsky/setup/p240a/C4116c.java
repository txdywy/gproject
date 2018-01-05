package com.google.android.finsky.setup.p240a;

import android.os.Bundle;
import com.google.android.finsky.setup.PackageSetupStatus;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.wireless.android.finsky.dfe.nano.fp;

public final class C4116c implements C2918a {
    public final C2918a f20729a;
    public final C2918a f20730b;

    public C4116c(C4115b c4115b, C4117d c4117d) {
        this.f20729a = c4115b;
        this.f20730b = c4117d;
    }

    public final /* synthetic */ Object mo3197a(Object obj) {
        return (PackageSetupStatus) this.f20730b.mo3197a((Bundle) this.f20729a.mo3197a((fp) obj));
    }
}
