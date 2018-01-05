package com.google.android.finsky.billing.myaccount;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.billing.common.C1647h;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.protobuf.nano.C0757i;

final class C2025n implements OnClickListener {
    public final /* synthetic */ View f10465a;
    public final /* synthetic */ C2011l f10466b;

    C2025n(C2011l c2011l, View view) {
        this.f10466b = c2011l;
        this.f10465a = view;
    }

    public final void onClick(View view) {
        this.f10466b.f10321q.m13379b(new C2475d(this.f10466b.f10310f).m13256a(2629));
        Fragment fragment = this.f10466b.f10308d;
        Context context = this.f10465a.getContext();
        String cZ = this.f10466b.f10322r.cZ();
        C0757i[] c0757iArr = this.f10466b.f10327w;
        C2495w c2495w = this.f10466b.f10321q;
        Intent intent = new Intent(context, SwitchFamilyInstrumentActivity.class);
        intent.putExtra("SwitchFamilyInstrumentActivity.instruments", ParcelableProtoArray.m21675a(c0757iArr));
        C1647h.m9344a(intent, cZ);
        c2495w.m13380b(cZ).m13376a(intent);
        fragment.startActivityForResult(intent, 11);
    }
}
