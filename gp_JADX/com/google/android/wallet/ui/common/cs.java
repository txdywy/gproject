package com.google.android.wallet.ui.common;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.protobuf.nano.i;

public final class cs extends C6665h implements OnClickListener, C6527m {
    static cs m30914a(int i, String str, String str2, ae aeVar, String str3, String str4, String str5, boolean z, Parcelable parcelable, int i2) {
        if (TextUtils.isEmpty(str) || ((TextUtils.isEmpty(str2) && aeVar == null) || TextUtils.isEmpty(str4))) {
            String str6 = "Title, message, and positive button text are required. Received values: title: %s  message: %s infoMessage: %s posButtonText: %s";
            Object[] objArr = new Object[4];
            objArr[0] = str;
            objArr[1] = str2;
            objArr[2] = aeVar == null ? null : aeVar.e;
            objArr[3] = str4;
            throw new IllegalArgumentException(String.format(str6, objArr));
        } else if (TextUtils.isEmpty(str2) || aeVar == null) {
            i aeVar2;
            Bundle b = C6665h.m30137b(i2);
            b.putInt("requestCode", i);
            b.putString("title", str);
            if (aeVar == null) {
                aeVar2 = new ae();
                aeVar2.e = str2;
            }
            b.putParcelable("infoMessage", ParcelableProto.m29885a(aeVar2));
            if (!TextUtils.isEmpty(str3)) {
                b.putString("details", str3);
            }
            b.putString("positiveButtonText", str4);
            if (!TextUtils.isEmpty(str5)) {
                b.putString("negativeButtonText", str5);
            }
            if (parcelable != null) {
                b.putParcelable("tag", parcelable);
            }
            b.putBoolean("linkifyMessage", z);
            Fragment csVar = new cs();
            csVar.f(b);
            return csVar;
        } else {
            throw new IllegalArgumentException(String.format("Message and InfoMessage may not both be set. Received values: message: %s infoMessage: %s", new Object[]{str2, aeVar.e}));
        }
    }

    public final Dialog mo5575W() {
        Bundle bundle = this.q;
        C6760a c6760a = new C6760a(m30139X());
        c6760a.m30717a(bundle.getString("title"));
        View inflate = m30140Y().inflate(C6623g.view_wallet_dialog, null);
        ae aeVar = (ae) ParcelableProto.m29887a(bundle, "infoMessage");
        InfoMessageView infoMessageView = (InfoMessageView) inflate.findViewById(C6622f.info_message);
        infoMessageView.setLinkify(bundle.getBoolean("linkifyMessage", true));
        infoMessageView.setInfoMessage(aeVar);
        infoMessageView.setVisibility(0);
        infoMessageView.setUrlClickListener(this);
        TextView textView = (TextView) inflate.findViewById(C6622f.details);
        CharSequence string = bundle.getString("details");
        if (TextUtils.isEmpty(string)) {
            textView.setVisibility(8);
        } else {
            textView.setText(string);
        }
        c6760a.m30716a(inflate);
        c6760a.m30718a(bundle.getString("positiveButtonText"), (OnClickListener) this);
        CharSequence string2 = bundle.getString("negativeButtonText");
        if (!TextUtils.isEmpty(string2)) {
            c6760a.m30724b(string2, (OnClickListener) this);
        }
        return c6760a.m30713a();
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        m30915a(i);
        a(false);
    }

    public final void mo5472a(View view, String str) {
        Context h = h();
        Intent a = ci.m30842a(h, str);
        try {
            h.startActivity(a);
        } catch (ActivityNotFoundException e) {
            String str2 = "WalletDialogFragment";
            String str3 = "Actvity was not found for intent, ";
            String valueOf = String.valueOf(a.toString());
            Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        m30915a(-2);
    }

    private final void m30915a(int i) {
        cu cuVar = null;
        if (this.r instanceof cu) {
            cuVar = (cu) this.r;
        } else if (h() instanceof cu) {
            cuVar = (cu) h();
        }
        if (cuVar != null) {
            int i2 = this.q.getInt("requestCode");
            this.q.getParcelable("tag");
            cuVar.mo5475b(i, i2);
        }
    }
}
