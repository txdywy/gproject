package com.google.android.finsky.family.management;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import android.support.v7.app.C0434z;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.utils.a.a;
import com.google.wireless.android.finsky.dfe.h.a.r;
import com.google.wireless.android.finsky.dfe.h.a.s;
import com.squareup.haha.perflib.StackFrame;

public final class C3073k extends C0141p implements OnClickListener {
    public static final int[] af = new int[]{-2, -1, -3};
    public s[] ag;

    public final Dialog mo143a(Bundle bundle) {
        r rVar = (r) ParcelableProto.m21673a(this.f760q, "FamilyPurchaseSettingWarning");
        CharSequence charSequence = rVar.b;
        CharSequence fromHtml = Html.fromHtml(rVar.c);
        this.ag = rVar.d;
        C0434z b = new C0434z(m603h()).m2640a(charSequence).m2644b(fromHtml);
        for (int i = 0; i < this.ag.length; i++) {
            fromHtml = this.ag[i].c;
            switch (af[i]) {
                case StackFrame.NATIVE_METHOD /*-3*/:
                    b.m2646c(fromHtml, this);
                    break;
                case StackFrame.COMPILED_METHOD /*-2*/:
                    b.m2645b(fromHtml, (OnClickListener) this);
                    break;
                case -1:
                    b.m2641a(fromHtml, (OnClickListener) this);
                    break;
                default:
                    break;
            }
        }
        Dialog a = b.m2637a();
        TextView textView = (TextView) a.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return a;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Object obj = this.ag[a.a(af, i)].d;
        if (!TextUtils.isEmpty(obj)) {
            m603h().startActivity(C1473m.f7980a.bn().mo2689a(Uri.parse(obj)));
        }
    }
}
