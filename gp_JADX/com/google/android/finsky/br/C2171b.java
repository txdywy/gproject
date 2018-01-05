package com.google.android.finsky.br;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.C0254u;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.cv.p177a.am;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.jl;
import com.google.android.finsky.dfemodel.C2731v;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.notification.C3820u;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.finsky.a.a.i;
import com.google.wireless.android.finsky.dfe.c.a.eb;
import java.util.Collection;

public interface C2171b {
    PendingIntent mo2724a(C3820u c3820u, Context context, int i, C2495w c2495w);

    Intent mo2725a(int i, i iVar, Bundle bundle, C2495w c2495w);

    Intent mo2726a(Account account, Context context, C1552e c1552e, Document document, C2495w c2495w, PurchaseParams purchaseParams, eb ebVar, boolean z, boolean z2);

    Intent mo2727a(Account account, Context context, PurchaseParams purchaseParams, C1552e c1552e);

    Intent mo2728a(Account account, Context context, PurchaseParams purchaseParams, C2731v c2731v, String str, C1552e c1552e);

    Intent mo2729a(Account account, PurchaseParams purchaseParams);

    Intent mo2730a(Account account, PurchaseParams purchaseParams, C2495w c2495w);

    Intent mo2731a(Account account, Document document, String str, int i, C2495w c2495w);

    Intent mo2732a(Account account, Document document, String str, int i, C2731v c2731v, String str2, String str3, boolean z, int i2, C2495w c2495w);

    Intent mo2733a(Account account, String str, String str2, C2495w c2495w);

    Intent mo2734a(Context context);

    Intent mo2735a(Context context, int i, DfeToc dfeToc);

    Intent mo2736a(Context context, am amVar, String str, PurchaseFlowConfig purchaseFlowConfig, C2495w c2495w);

    Intent mo2737a(Context context, jl jlVar, int i, int i2, String str, C2495w c2495w);

    Intent mo2738a(Context context, C2495w c2495w);

    Intent mo2739a(Context context, Document document, int i, int i2);

    Intent mo2740a(Context context, Document document, C2495w c2495w);

    Intent mo2741a(Context context, Document document, String str, boolean z, C2495w c2495w);

    Intent mo2742a(Context context, String str);

    Intent mo2743a(Context context, String str, int i, String str2, C2495w c2495w);

    Intent mo2744a(Context context, String str, ax axVar, long j, byte[] bArr, C2495w c2495w);

    Intent mo2745a(Context context, String str, C2495w c2495w);

    Intent mo2746a(Context context, String str, DfeToc dfeToc);

    Intent mo2747a(Context context, String str, String str2, int i, C2495w c2495w);

    Intent mo2748a(Context context, String str, String str2, Document document, boolean z, C2495w c2495w);

    Intent mo2749a(Context context, String str, String str2, Document document, boolean z, boolean z2, String str3, C2495w c2495w);

    Intent mo2750a(Context context, String str, String str2, String str3, String str4, C2495w c2495w);

    Intent mo2751a(Context context, String str, String str2, String str3, String str4, boolean z, C2495w c2495w);

    Intent mo2752a(Context context, Collection collection, C2495w c2495w, boolean z);

    Intent mo2753a(String str, String str2, String str3, C2495w c2495w);

    C3820u mo2754a();

    C3820u mo2755a(String str);

    C3820u mo2756a(String str, String str2, String str3, String str4);

    void mo2757a(C0254u c0254u, C2495w c2495w);

    Intent mo2758b(Context context);

    Intent mo2759b(Context context, C2495w c2495w);

    Intent mo2760b(Context context, String str);

    Intent mo2761b(Context context, String str, ax axVar, long j, byte[] bArr, C2495w c2495w);

    Intent mo2762b(Context context, String str, C2495w c2495w);

    Intent mo2763c(Context context);

    Intent mo2764d(Context context);

    Intent mo2765e(Context context);

    Intent mo2766f(Context context);

    Intent mo2767g(Context context);
}
