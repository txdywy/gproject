package com.google.android.finsky.verifier.impl;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ScrollView;
import com.google.android.finsky.at.C1516l;

public class PackageWarningDialogView extends ScrollView implements OnClickListener, C1516l {
    public int f24325a;
    public OnClickListener f24326b;
    public Bundle f24327c = new Bundle();

    public PackageWarningDialogView(Context context) {
        super(context);
    }

    public PackageWarningDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3298a(android.os.Bundle r9) {
        /*
        r8 = this;
        r7 = 2131756331; // 0x7f10052b float:1.9143567E38 double:1.0532275685E-314;
        r6 = 2131755334; // 0x7f100146 float:1.9141544E38 double:1.053227076E-314;
        r5 = 4;
        r0 = "warning_message";
        r2 = r9.getString(r0);
        r0 = "app_name";
        r3 = r9.getString(r0);
        r0 = "action";
        r0 = r9.getInt(r0);
        r8.f24325a = r0;
        r0 = r8.findViewById(r6);
        r0 = (android.widget.TextView) r0;
        r1 = 2131756209; // 0x7f1004b1 float:1.914332E38 double:1.053227508E-314;
        r1 = r8.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r4 = android.text.TextUtils.isEmpty(r2);
        if (r4 != 0) goto L_0x0033;
    L_0x0030:
        r0.setText(r2);
    L_0x0033:
        r0 = android.text.TextUtils.isEmpty(r3);
        if (r0 != 0) goto L_0x003c;
    L_0x0039:
        r1.setText(r3);
    L_0x003c:
        r0 = r8.f24325a;
        if (r0 != r5) goto L_0x0049;
    L_0x0040:
        r0 = r8.findViewById(r7);
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0049:
        r0 = 2131756334; // 0x7f10052e float:1.9143573E38 double:1.05322757E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = r8.f24325a;
        switch(r1) {
            case 2: goto L_0x00fa;
            case 3: goto L_0x00fa;
            case 4: goto L_0x0057;
            case 5: goto L_0x00fa;
            default: goto L_0x0057;
        };
    L_0x0057:
        r1 = 2131952727; // 0x7f130457 float:1.9541905E38 double:1.053324601E-314;
        r0.setText(r1);
    L_0x005d:
        r1 = r8.findViewById(r7);
        r0 = 2131756333; // 0x7f10052d float:1.914357E38 double:1.0532275694E-314;
        r2 = r8.findViewById(r0);
        r0 = 2131756332; // 0x7f10052c float:1.9143569E38 double:1.053227569E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r3 = new com.google.android.finsky.verifier.impl.ad;
        r3.<init>(r2, r0);
        r1.setOnClickListener(r3);
        r0 = 2131756335; // 0x7f10052f float:1.9143575E38 double:1.0532275704E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = r8.f24325a;
        switch(r1) {
            case 0: goto L_0x0111;
            case 1: goto L_0x0087;
            case 2: goto L_0x0118;
            case 3: goto L_0x0087;
            case 4: goto L_0x0102;
            default: goto L_0x0087;
        };
    L_0x0087:
        r0 = r8.f24325a;
        if (r0 != r5) goto L_0x00f9;
    L_0x008b:
        r0 = r8.findViewById(r6);
        r0 = (android.widget.TextView) r0;
        r1 = r0.getText();
        r2 = r8.getContext();
        r3 = 2131952734; // 0x7f13045e float:1.954192E38 double:1.0533246044E-314;
        r2 = r2.getString(r3);
        r1 = java.lang.String.valueOf(r1);
        r3 = java.lang.String.valueOf(r2);
        r4 = java.lang.String.valueOf(r1);
        r4 = r4.length();
        r4 = r4 + 1;
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r4 = r4 + r5;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r1 = r5.append(r1);
        r4 = " ";
        r1 = r1.append(r4);
        r1 = r1.append(r3);
        r1 = r1.toString();
        r3 = new android.text.SpannableString;
        r3.<init>(r1);
        r1 = new com.google.android.finsky.verifier.impl.ae;
        r1.<init>(r8);
        r4 = r3.length();
        r2 = r2.length();
        r2 = r4 - r2;
        r4 = r3.length();
        r5 = 33;
        r3.setSpan(r1, r2, r4, r5);
        r0.setText(r3);
        r1 = android.text.method.LinkMovementMethod.getInstance();
        r0.setMovementMethod(r1);
    L_0x00f9:
        return;
    L_0x00fa:
        r1 = 2131952728; // 0x7f130458 float:1.9541907E38 double:1.0533246015E-314;
        r0.setText(r1);
        goto L_0x005d;
    L_0x0102:
        r1 = 2131952738; // 0x7f130462 float:1.9541927E38 double:1.0533246064E-314;
        r0.setText(r1);
    L_0x0108:
        r1 = 0;
        r0.setVisibility(r1);
        r0.setOnClickListener(r8);
        goto L_0x0087;
    L_0x0111:
        r1 = 2131952724; // 0x7f130454 float:1.9541899E38 double:1.0533245995E-314;
        r0.setText(r1);
        goto L_0x0108;
    L_0x0118:
        r1 = com.google.android.finsky.aa.C0955b.cH;
        r1 = r1.m28964b();
        r1 = (java.lang.Boolean) r1;
        r1 = r1.booleanValue();
        if (r1 != 0) goto L_0x0087;
    L_0x0126:
        r1 = 2131952723; // 0x7f130453 float:1.9541897E38 double:1.053324599E-314;
        r0.setText(r1);
        goto L_0x0108;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.impl.PackageWarningDialogView.a(android.os.Bundle):void");
    }

    public Bundle getResult() {
        return this.f24327c;
    }

    public int getAction() {
        return this.f24325a;
    }

    public void setOnContinueAnywayClickListener(OnClickListener onClickListener) {
        this.f24326b = onClickListener;
    }

    public void onClick(View view) {
        this.f24327c.putBoolean("dont_warn", true);
        if (this.f24326b != null) {
            this.f24326b.onClick(view);
        }
    }
}
