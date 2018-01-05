package com.google.android.finsky.p142j;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import com.google.android.wallet.ui.common.a;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class C3636o extends C0141p {
    public C3638q af;

    public final Dialog mo143a(Bundle bundle) {
        a aVar = new a(m603h());
        aVar.a(m605i().getString(C7582R.string.sort_dialog_title));
        ArrayList stringArrayList = this.f760q.getStringArrayList("sort_options");
        aVar.a((CharSequence[]) stringArrayList.toArray(new CharSequence[stringArrayList.size()]), this.f760q.getInt("sort_type", 0), new C3637p(this));
        return aVar.a();
    }
}
