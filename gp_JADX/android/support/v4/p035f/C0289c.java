package android.support.v4.p035f;

import android.content.Context;
import java.util.concurrent.Callable;

final class C0289c implements Callable {
    public final /* synthetic */ Context f1671a;
    public final /* synthetic */ C0287a f1672b;
    public final /* synthetic */ int f1673c;
    public final /* synthetic */ String f1674d;

    C0289c(Context context, C0287a c0287a, int i, String str) {
        this.f1671a = context;
        this.f1672b = c0287a;
        this.f1673c = i;
        this.f1674d = str;
    }

    public final /* synthetic */ Object call() {
        C0296i a = C0288b.m1607a(this.f1671a, this.f1672b, this.f1673c);
        if (a.f1685a != null) {
            C0288b.f1666a.m1693a(this.f1674d, a.f1685a);
        }
        return a;
    }
}
