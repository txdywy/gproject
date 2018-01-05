package android.support.v7.widget;

import android.support.v4.view.ai;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

final class bb implements OnGlobalLayoutListener {
    public final /* synthetic */ az f3182a;

    bb(az azVar) {
        this.f3182a = azVar;
    }

    public final void onGlobalLayout() {
        az azVar = this.f3182a;
        View view = this.f3182a.f3177d;
        Object obj = (ai.f1848a.mo410t(view) && view.getGlobalVisibleRect(azVar.f3176c)) ? 1 : null;
        if (obj == null) {
            this.f3182a.mo674c();
            return;
        }
        this.f3182a.m3223a();
        super.mo671b();
    }
}
