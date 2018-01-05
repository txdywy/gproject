package com.google.android.finsky.layout.actionbar;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import android.support.v4.app.C0254u;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.wallet.ui.common.a;
import com.squareup.haha.perflib.StackFrame;
import com.squareup.leakcanary.C7582R;

public final class C3665h extends C0141p implements OnClickListener {
    public final Dialog mo143a(Bundle bundle) {
        a aVar = new a(m603h());
        aVar.b(C7582R.string.auto_update_enable_dialog_message);
        aVar.a(C7582R.string.yes, this);
        aVar.b(C7582R.string.no, this);
        return aVar.a();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (i) {
            case StackFrame.COMPILED_METHOD /*-2*/:
                m626a(false);
                break;
            case -1:
                m626a(false);
                C1473m.f7980a.mo2265x();
                C3960a.m18663a(true);
                C1473m.f7980a.mo2265x();
                C3960a.m18665b(true);
                break;
        }
        C0254u h = m603h();
        if (h != null && (h instanceof MainActivity)) {
            ((MainActivity) h).mo1241c(null);
        }
    }
}
