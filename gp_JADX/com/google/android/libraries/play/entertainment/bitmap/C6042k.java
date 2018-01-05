package com.google.android.libraries.play.entertainment.bitmap;

import com.google.android.libraries.play.entertainment.p344d.C6038t;
import com.google.android.libraries.play.entertainment.p344d.C6041o;
import com.google.android.libraries.play.entertainment.p344d.C6056i;
import com.google.android.libraries.play.entertainment.p344d.C6057c;
import com.google.android.libraries.play.entertainment.p344d.C6061h;
import java.util.concurrent.Executor;

final class C6042k implements C6041o {
    public final Executor f30151a;
    public final C6038t f30152b;

    C6042k(Executor executor, C6038t c6038t) {
        this.f30151a = executor;
        this.f30152b = c6038t;
    }

    public final C6056i mo5265a(Throwable th) {
        if (!(th instanceof NeedsAllocationException)) {
            return new C6057c(C6061h.m27973a(th));
        }
        return C6056i.m27958a(this.f30151a, ((NeedsAllocationException) th).f30102a, this.f30152b);
    }
}
