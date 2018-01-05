package com.google.android.wallet.instrumentmanager.ui.redirect;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.a.a.a.a.b.a.a.f.o;
import com.google.a.a.a.a.b.a.a.h.a.b;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.instrumentmanager.redirect.ImStartAndroidAppRedirectActivity;
import com.google.android.wallet.instrumentmanager.ui.p394d.C6671a;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;
import com.google.android.wallet.ui.p393e.C6670a;
import com.google.android.wallet.ui.p397d.C6674b;
import com.google.android.wallet.ui.p397d.C6675a;
import com.google.android.wallet.ui.p397d.C6802e;
import com.google.protobuf.nano.i;
import java.util.ArrayList;

public final class C6676a extends C6675a {
    protected final C6670a mo5589a(o oVar) {
        return C6671a.m30226a(oVar, this.bc, as());
    }

    public final Intent ab() {
        Context h = h();
        i iVar = (b) this.aD;
        ArrayList arrayList = this.g;
        String string = this.q.getString("title");
        int a = C6802e.m30946a(this.bd);
        int i = this.bc;
        byte[] byteArray = this.q.getByteArray("logToken");
        Parcelable parcelable = this.bh;
        Intent intent = new Intent();
        intent.setClassName(h.getPackageName(), C6674b.class.getName());
        Bundle bundle = new Bundle();
        bundle.putParcelable("formProto", ParcelableProto.m29885a(iVar));
        bundle.putParcelableArrayList("successfullyValidatedApps", ParcelableProto.m29889a(arrayList));
        bundle.putParcelable("parentLogContext", parcelable);
        intent.putExtra("parcelableBundle", bundle);
        intent.putExtra("title", string);
        intent.putExtra("activityThemeResId", a);
        intent.putExtra("formThemeResId", i);
        intent.putExtra("logToken", byteArray);
        intent.setClassName(h.getPackageName(), ImPopupRedirectActivity.class.getName());
        return intent;
    }

    public final Intent ac() {
        Context h = h();
        String str = ((b) this.aD).b;
        int a = C6802e.m30946a(this.bd);
        i iVar = ((b) this.aD).q;
        byte[] byteArray = this.q.getByteArray("logToken");
        Parcelable parcelable = this.bh;
        Intent intent = new Intent(h, StartAndroidAppRedirectActivity.class);
        intent.putExtra("initialUrl", str);
        intent.putExtra("activityThemeResId", a);
        intent.putExtra("displayOptions", ParcelableProto.m29885a(iVar));
        intent.putExtra("logToken", byteArray);
        intent.putExtra("parentLogContext", parcelable);
        intent.setClassName(h.getPackageName(), ImStartAndroidAppRedirectActivity.class.getName());
        return intent;
    }
}
