package com.google.android.finsky.installqueue;

import com.google.android.finsky.p108z.C4809e;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class C3340g {
    public abstract C4809e mo3479a(C3362e c3362e);

    public abstract C4809e mo3480a(List list);

    public abstract void mo3481a(C1003o c1003o);

    @Deprecated
    public abstract int mo3482b(String str);

    public abstract C4809e mo3483b(Collection collection);

    public abstract void mo3484b(C1003o c1003o);

    @Deprecated
    public abstract C3371p mo3485c(String str);

    @Deprecated
    public final void m16744a(InstallRequest installRequest) {
        m16746a(Collections.singletonList(installRequest));
    }

    @Deprecated
    public final void m16746a(Collection collection) {
        mo3483b(collection).mo4398a(C3364h.f17264a);
    }

    public final C4809e m16748b(InstallRequest installRequest) {
        return mo3483b(Collections.singletonList(installRequest));
    }

    public final C4809e m16742a(String str) {
        return mo3480a(Collections.singletonList(str));
    }
}
