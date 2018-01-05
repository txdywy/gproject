package com.google.android.finsky.layout;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.play.utils.m;

public final class C3731y implements m {
    public final /* synthetic */ EditorialDescriptionSectionLegacy f18860a;

    public C3731y(EditorialDescriptionSectionLegacy editorialDescriptionSectionLegacy) {
        this.f18860a = editorialDescriptionSectionLegacy;
    }

    public final void m17611a(View view, String str) {
        this.f18860a.f18157g = true;
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(str);
        intent.setData(parse);
        intent.setPackage(context.getPackageName());
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            this.f18860a.f18151a.mo3635a(parse, null, this.f18860a.f18158h);
            return;
        }
        intent.setPackage(null);
        context.startActivity(intent);
    }
}
