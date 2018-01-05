package com.google.android.wallet.instrumentmanager.ui.redirect;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.a.a.a.a.b.a.a.h.a.b;
import com.google.android.wallet.analytics.C6494b;
import com.google.android.wallet.analytics.C6495c;
import com.google.android.wallet.analytics.C6496d;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.ui.p397d.C6674b;
import com.google.android.wallet.ui.p397d.C6678c;
import java.util.ArrayList;

public class ImPopupRedirectActivity extends C6674b implements C6494b, C6495c, C6496d {
    protected void onCreate(Bundle bundle) {
        this.f32953v = this;
        this.f32954w = this;
        this.f32955x = this;
        super.onCreate(bundle);
    }

    public final void mo5561a(C6504m c6504m, int i) {
        C6567a.m29805a(c6504m, -1, i);
    }

    public final void mo5560a(C6504m c6504m) {
        C6567a.m29805a(c6504m, 1636, 1622);
    }

    public final void mo5548a(Bundle bundle, byte[] bArr) {
        C6567a.m29802a(bundle, bArr);
    }

    public final void mo5478b(C6504m c6504m) {
        C6567a.m29804a(c6504m, -1);
    }

    public final void mo5481c(C6504m c6504m) {
        C6567a.m29804a(c6504m, 1636);
    }

    protected final C6678c mo5587a(b bVar, ArrayList arrayList, int i, LogContext logContext, byte[] bArr) {
        Fragment c6679b = new C6679b();
        Bundle a = C6678c.m30276a(bVar, arrayList, i, logContext);
        a.putByteArray("logToken", bArr);
        c6679b.f(a);
        return c6679b;
    }
}
