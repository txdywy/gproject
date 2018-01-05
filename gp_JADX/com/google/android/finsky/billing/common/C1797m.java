package com.google.android.finsky.billing.common;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.ai;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Map;

@Deprecated
public final class C1797m {
    public Context f9329a;

    public C1797m(Context context) {
        this.f9329a = context;
    }

    public static void m9776a(Intent intent, PurchaseFlowConfig purchaseFlowConfig) {
        if (purchaseFlowConfig != null) {
            intent.putExtra("purchaseFlowConfig", purchaseFlowConfig);
        }
    }

    public static PurchaseFlowConfig m9773a(Intent intent) {
        PurchaseFlowConfig purchaseFlowConfig = (PurchaseFlowConfig) intent.getParcelableExtra("purchaseFlowConfig");
        return purchaseFlowConfig == null ? PurchaseFlowConfig.f9283a : purchaseFlowConfig;
    }

    public static void m9777a(Bundle bundle, PurchaseFlowConfig purchaseFlowConfig) {
        if (purchaseFlowConfig != null) {
            bundle.putParcelable("purchaseFlowConfig", purchaseFlowConfig);
        }
    }

    public static PurchaseFlowConfig m9774a(Bundle bundle) {
        PurchaseFlowConfig purchaseFlowConfig = (PurchaseFlowConfig) bundle.getParcelable("purchaseFlowConfig");
        return purchaseFlowConfig == null ? PurchaseFlowConfig.f9283a : purchaseFlowConfig;
    }

    private static void m9779a(String str, View view, Bundle bundle, boolean z, boolean z2) {
        if (view != null && bundle != null) {
            int a = C1797m.m9772a(C1797m.m9775a(str, "PADDING_START"), bundle);
            int a2 = C1797m.m9772a(C1797m.m9775a(str, "PADDING_TOP"), bundle);
            int a3 = C1797m.m9772a(C1797m.m9775a(str, "PADDING_END"), bundle);
            int a4 = C1797m.m9772a(C1797m.m9775a(str, "PADDING_BOTTOM"), bundle);
            if (!z) {
                a2 = -1;
            }
            if (!z2) {
                a4 = -1;
            }
            if (a == -1) {
                a = ai.f1848a.mo401l(view);
            }
            if (a2 == -1) {
                a2 = view.getPaddingTop();
            }
            if (a3 == -1) {
                a3 = ai.f1848a.mo402m(view);
            }
            if (a4 == -1) {
                a4 = view.getPaddingBottom();
            }
            ai.m1823a(view, a, a2, a3, a4);
        }
    }

    private static int m9772a(String str, Bundle bundle) {
        return (int) bundle.getFloat(str, -1.0f);
    }

    private static String m9775a(String str, String str2) {
        return new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(".").append(str2).toString();
    }

    public final void m9783a(Bundle bundle, PurchaseFlowConfig purchaseFlowConfig, String str) {
        if (purchaseFlowConfig != null) {
            bundle.putInt("continueButtonBgColor", purchaseFlowConfig.m9746b(str, "BG_COLOR"));
            bundle.putInt("continueButtonTextColor", purchaseFlowConfig.m9746b(str, "COLOR"));
            m9785b(bundle, purchaseFlowConfig);
        }
    }

    public final void m9785b(Bundle bundle, PurchaseFlowConfig purchaseFlowConfig) {
        if (purchaseFlowConfig != null) {
            m9780b("ALL_DIALOG", bundle, purchaseFlowConfig);
            m9778a("ALL_TITLE", bundle, purchaseFlowConfig);
            m9778a("ALL_PRICE", bundle, purchaseFlowConfig);
            m9778a("ALL_MESSAGE", bundle, purchaseFlowConfig);
            m9778a("ALL_TOS", bundle, purchaseFlowConfig);
            m9778a("ALL_FOP", bundle, purchaseFlowConfig);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m9778a(java.lang.String r6, android.os.Bundle r7, com.google.android.finsky.billing.common.PurchaseFlowConfig r8) {
        /*
        r5 = this;
        r1 = -1;
        r0 = "COLOR";
        r0 = com.google.android.finsky.billing.common.C1797m.m9775a(r6, r0);
        r2 = "COLOR";
        r2 = r8.m9746b(r6, r2);
        r7.putInt(r0, r2);
        r0 = "FONT_SIZE";
        r2 = com.google.android.finsky.billing.common.C1797m.m9775a(r6, r0);
        r0 = r8.f9284b;
        r0 = r0.get(r6);
        r0 = (java.util.Map) r0;
        if (r0 == 0) goto L_0x0028;
    L_0x0020:
        r3 = "FONT_SIZE";
        r3 = r0.get(r3);
        if (r3 != 0) goto L_0x004d;
    L_0x0028:
        r0 = r1;
    L_0x0029:
        r0 = (float) r0;
        r7.putFloat(r2, r0);
        r0 = "FONT_STYLE";
        r1 = com.google.android.finsky.billing.common.C1797m.m9775a(r6, r0);
        r0 = r8.f9284b;
        r0 = r0.get(r6);
        r0 = (java.util.Map) r0;
        if (r0 == 0) goto L_0x0045;
    L_0x003d:
        r2 = "FONT_STYLE";
        r2 = r0.get(r2);
        if (r2 != 0) goto L_0x00b6;
    L_0x0045:
        r0 = 0;
    L_0x0046:
        r7.putString(r1, r0);
        r5.m9780b(r6, r7, r8);
        return;
    L_0x004d:
        r3 = r5.f9329a;
        r3 = r3.getResources();
        r4 = "FONT_SIZE";
        r0 = r0.get(r4);
        r0 = (java.lang.String) r0;
        r0 = r0.toLowerCase();
        r4 = r0.hashCode();
        switch(r4) {
            case 3029410: goto L_0x0076;
            case 3242771: goto L_0x0080;
            case 110371416: goto L_0x006c;
            case 395040096: goto L_0x008a;
            default: goto L_0x0066;
        };
    L_0x0066:
        r0 = r1;
    L_0x0067:
        switch(r0) {
            case 0: goto L_0x0094;
            case 1: goto L_0x009c;
            case 2: goto L_0x00a4;
            case 3: goto L_0x00ad;
            default: goto L_0x006a;
        };
    L_0x006a:
        r0 = r1;
        goto L_0x0029;
    L_0x006c:
        r4 = "title";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0066;
    L_0x0074:
        r0 = 0;
        goto L_0x0067;
    L_0x0076:
        r4 = "body";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0066;
    L_0x007e:
        r0 = 1;
        goto L_0x0067;
    L_0x0080:
        r4 = "item";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0066;
    L_0x0088:
        r0 = 2;
        goto L_0x0067;
    L_0x008a:
        r4 = "footnote";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0066;
    L_0x0092:
        r0 = 3;
        goto L_0x0067;
    L_0x0094:
        r0 = 2131625310; // 0x7f0e055e float:1.8877824E38 double:1.0531628355E-314;
        r0 = r3.getDimensionPixelOffset(r0);
        goto L_0x0029;
    L_0x009c:
        r0 = 2131625307; // 0x7f0e055b float:1.8877818E38 double:1.053162834E-314;
        r0 = r3.getDimensionPixelOffset(r0);
        goto L_0x0029;
    L_0x00a4:
        r0 = 2131625309; // 0x7f0e055d float:1.8877822E38 double:1.053162835E-314;
        r0 = r3.getDimensionPixelOffset(r0);
        goto L_0x0029;
    L_0x00ad:
        r0 = 2131625308; // 0x7f0e055c float:1.887782E38 double:1.0531628345E-314;
        r0 = r3.getDimensionPixelOffset(r0);
        goto L_0x0029;
    L_0x00b6:
        r2 = "FONT_STYLE";
        r0 = r0.get(r2);
        r0 = (java.lang.String) r0;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.billing.common.m.a(java.lang.String, android.os.Bundle, com.google.android.finsky.billing.common.PurchaseFlowConfig):void");
    }

    private final void m9780b(String str, Bundle bundle, PurchaseFlowConfig purchaseFlowConfig) {
        bundle.putFloat(C1797m.m9775a(str, "PADDING_START"), (float) m9771a(purchaseFlowConfig, str, "PADDING_START"));
        bundle.putFloat(C1797m.m9775a(str, "PADDING_TOP"), (float) m9771a(purchaseFlowConfig, str, "PADDING_TOP"));
        bundle.putFloat(C1797m.m9775a(str, "PADDING_END"), (float) m9771a(purchaseFlowConfig, str, "PADDING_END"));
        bundle.putFloat(C1797m.m9775a(str, "PADDING_BOTTOM"), (float) m9771a(purchaseFlowConfig, str, "PADDING_BOTTOM"));
    }

    public final void m9782a(Bundle bundle, View view, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view2) {
        C1797m.m9779a("ALL_DIALOG", view, bundle, true, false);
        C1797m.m9779a("ALL_DIALOG", view2, bundle, false, true);
        m9784a("ALL_TITLE", textView, bundle);
        m9784a("ALL_PRICE", textView3, bundle);
        m9784a("ALL_MESSAGE", textView2, bundle);
        m9784a("ALL_TOS", textView5, bundle);
        m9784a("ALL_FOP", textView4, bundle);
    }

    public final Bundle m9781a(PurchaseFlowConfig purchaseFlowConfig) {
        if (purchaseFlowConfig == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m9778a("ALL_TITLE", bundle, purchaseFlowConfig);
        m9778a("ALL_FOP", bundle, purchaseFlowConfig);
        m9778a("PROFILE_OPTION", bundle, purchaseFlowConfig);
        return bundle;
    }

    public final void m9784a(String str, TextView textView, Bundle bundle) {
        if (textView != null && bundle != null) {
            if (!(textView == null || bundle == null)) {
                int i = bundle.getInt(C1797m.m9775a(str, "COLOR"), -1);
                float f = bundle.getFloat(C1797m.m9775a(str, "FONT_SIZE"), -1.0f);
                String string = bundle.getString(C1797m.m9775a(str, "FONT_STYLE"));
                if (string != null) {
                    Typeface a = PurchaseFlowConfig.m9744a(string, textView);
                    if (a != null) {
                        textView.setTypeface(a);
                    }
                }
                if (i != -1) {
                    textView.setTextColor(C1607g.m9239a(i, this.f9329a));
                }
                if (f != -1.0f) {
                    textView.setTextSize(0, f);
                }
            }
            C1797m.m9779a(str, textView, bundle, true, true);
        }
    }

    private final int m9771a(PurchaseFlowConfig purchaseFlowConfig, String str, String str2) {
        Map map = (Map) purchaseFlowConfig.f9284b.get(str);
        if (map == null || map.get(str2) == null) {
            return -1;
        }
        try {
            return C1611k.m9268a(Integer.parseInt((String) map.get(str2)), this.f9329a.getResources());
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Error parsing purchase flow config.", new Object[0]);
            return -1;
        }
    }
}
