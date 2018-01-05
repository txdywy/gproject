package com.google.android.finsky.billing.myaccount;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.finsky.p111d.C2475d;
import com.squareup.leakcanary.C7582R;

final class aq implements OnClickListener {
    public final /* synthetic */ EditText f10213a;
    public final /* synthetic */ Button f10214b;
    public final /* synthetic */ View f10215c;
    public final /* synthetic */ an f10216d;

    aq(an anVar, EditText editText, Button button, View view) {
        this.f10216d = anVar;
        this.f10213a = editText;
        this.f10214b = button;
        this.f10215c = view;
    }

    public final void onClick(View view) {
        this.f10216d.j.m13379b(new C2475d(this.f10216d.l).m13256a(2694));
        this.f10216d.m10587a(this.f10213a.getText().toString(), this.f10214b, C7582R.string.contact_email_saving, new ar(this));
    }
}
