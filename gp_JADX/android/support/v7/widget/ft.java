package android.support.v7.widget;

import android.os.Bundle;
import android.support.v4.view.C0132b;
import android.support.v4.view.p038a.C0333b;
import android.view.View;

public final class ft extends C0132b {
    public final fs f3487a;

    public ft(fs fsVar) {
        this.f3487a = fsVar;
    }

    public final void mo67a(View view, C0333b c0333b) {
        super.mo67a(view, c0333b);
        if (!this.f3487a.f3485a.m317q() && this.f3487a.f3485a.getLayoutManager() != null) {
            this.f3487a.f3485a.getLayoutManager().m3019a(view, c0333b);
        }
    }

    public final boolean mo131a(View view, int i, Bundle bundle) {
        if (super.mo131a(view, i, bundle)) {
            return true;
        }
        if (this.f3487a.f3485a.m317q() || this.f3487a.f3485a.getLayoutManager() == null) {
            return false;
        }
        ew layoutManager = this.f3487a.f3485a.getLayoutManager();
        fh fhVar = layoutManager.f2960y.f517k;
        fo foVar = layoutManager.f2960y.ao;
        return false;
    }
}
