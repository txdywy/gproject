package android.support.v7.widget;

import android.graphics.Typeface;
import android.support.v4.p028a.p029a.C0207g;
import android.widget.TextView;
import java.lang.ref.WeakReference;

final class be extends C0207g {
    public final /* synthetic */ WeakReference f3194a;
    public final /* synthetic */ bd f3195b;

    be(bd bdVar, WeakReference weakReference) {
        this.f3195b = bdVar;
        this.f3194a = weakReference;
    }

    public final void mo755a(Typeface typeface) {
        bd bdVar = this.f3195b;
        WeakReference weakReference = this.f3194a;
        if (bdVar.f3193i) {
            bdVar.f3192h = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, bdVar.f3191g);
            }
        }
    }

    public final void mo754a() {
    }
}
