package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.google.android.finsky.C1473m;

final class ae implements OnClickListener {
    public final /* synthetic */ EditText f6440a;
    public final /* synthetic */ C1033t f6441b;

    ae(C1033t c1033t, EditText editText) {
        this.f6441b = c1033t;
        this.f6440a = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String obj = this.f6440a.getText().toString();
        C1033t c1033t = this.f6441b;
        C1473m.f7980a.ap().mo1649f(obj, new ag(c1033t, obj), new ah(c1033t));
    }
}
