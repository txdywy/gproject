package android.support.v7.widget;

import android.support.v7.view.menu.al;
import android.view.View;

final class ax extends cs {
    public final /* synthetic */ az f3136a;
    public final /* synthetic */ AppCompatSpinner f3137b;

    ax(AppCompatSpinner appCompatSpinner, View view, az azVar) {
        this.f3137b = appCompatSpinner;
        this.f3136a = azVar;
        super(view);
    }

    public final al mo688a() {
        return this.f3136a;
    }

    public final boolean mo689b() {
        if (!this.f3137b.f2934g.f3153K.isShowing()) {
            this.f3137b.f2934g.mo671b();
        }
        return true;
    }
}
