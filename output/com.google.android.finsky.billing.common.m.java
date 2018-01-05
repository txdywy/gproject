package com.google.android.finsky.billing.common;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ai;
import android.support.v4.view.at;
import android.view.View;
import android.widget.TextView;
import com.google.android.finsky.bg.g;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Map;

public final class com.google.android.finsky.billing.common.m
{

    public Context a;

    m(Context p0) {
        this.a = p0;
    }

    private final int a(PurchaseFlowConfig p0, String p1, String p2) {
        v0 = (Map)p0.b.get(p1);
        if (v0 != 0 && v0.get(p2) != 0) {
            try {
                v0 = com.google.android.finsky.bg.k.a(Integer.parseInt((String)v0.get(p2)), this.a.getResources());
            }
            catch (NumberFormatException ex) {
                FinskyLog.b(ex, "Error parsing purchase flow config.", new Object[0]);
                v0 = -1;
            }
        }
        else
            v0 = -1;
        return v0;
    }

    private static int a(String p0, Bundle p1) {
        return (int)p1.getFloat(p0, -1082130432);
    }

    public static PurchaseFlowConfig a(Intent p0) {
        v0 = (PurchaseFlowConfig)p0.getParcelableExtra("purchaseFlowConfig");
        if (v0 == 0)
            v0 = PurchaseFlowConfig.a;
        return v0;
    }

    public static PurchaseFlowConfig a(Bundle p0) {
        v0 = (PurchaseFlowConfig)p0.getParcelable("purchaseFlowConfig");
        if (v0 == 0)
            v0 = PurchaseFlowConfig.a;
        return v0;
    }

    private static String a(String p0, String p1) {
        return (String.valueOf(p0).length() + 1 + String.valueOf(p1).length()) + p0 + "." + p1;
    }

    public static void a(Intent p0, PurchaseFlowConfig p1) {
        if (p1 != 0)
            p0.putExtra("purchaseFlowConfig", p1);
    }

    public static void a(Bundle p0, PurchaseFlowConfig p1) {
        if (p1 != 0)
            p0.putParcelable("purchaseFlowConfig", p1);
    }

    private final void a(String p0, Bundle p1, PurchaseFlowConfig p2) {
 13:    p1.putInt(com.google.android.finsky.billing.common.m.a(p0, "COLOR"), p2.b(p0, "COLOR"));
 28:    v0 = (Map)p2.b.get(p0);
 30:    if (v0 == 0 || v0.get("FONT_SIZE") == 0) {
 40:        v0 = -1;
 42:        p1.putFloat(com.google.android.finsky.billing.common.m.a(p0, "FONT_SIZE"), (float)v0);
 57:        v0 = (Map)p2.b.get(p0);
 59:        if (v0 == 0 || v0.get("FONT_STYLE") == 0)
 69:            v0 = 0;
            else
188:            v0 = (String)v0.get("FONT_STYLE");
 70:        p1.putString(com.google.android.finsky.billing.common.m.a(p0, "FONT_STYLE"), v0);
 73:        this.b(p0, p1, p2);
 76:        return;
        }
 79:    v3 = this.a.getResources();
 91:    v0 = ((String)v0.get("FONT_SIZE")).toLowerCase();
 99:    switch (v0.hashCode()) {
            case 3029410:
 99:            goto 118;
            case 3242771:
 99:            goto 128;
            case 110371416:
 99:            goto 108;
            case 395040096:
 99:            goto 138;
            default:
        }
102:    v0 = -1;
103:    switch (v0) {
            case 0:
151:            v0 = v3.getDimensionPixelOffset(2131625310);
191:            break;
            case 1:
159:            v0 = v3.getDimensionPixelOffset(2131625307);
191:            break;
            case 2:
167:            v0 = v3.getDimensionPixelOffset(2131625309);
191:            break;
            case 3:
176:            v0 = v3.getDimensionPixelOffset(2131625308);
191:            break;
            default:
106:            v0 = -1;
191:            break;
        }
114:    if (!v0.equals("title")) goto 102;
116:    v0 = 0;
117:    goto 103;
124:    if (!v0.equals("body")) goto 102;
126:    v0 = 1;
127:    goto 103;
134:    if (!v0.equals("item")) goto 102;
136:    v0 = 2;
137:    goto 103;
144:    if (!v0.equals("footnote")) goto 102;
146:    v0 = 3;
147:    goto 103;
    }

    private static void a(String p0, View p1, Bundle p2, boolean p3, boolean p4) {
        if (p1 != 0 && p2 != 0) {
            v3 = com.google.android.finsky.billing.common.m.a(com.google.android.finsky.billing.common.m.a(p0, "PADDING_START"), p2);
            v2 = com.google.android.finsky.billing.common.m.a(com.google.android.finsky.billing.common.m.a(p0, "PADDING_TOP"), p2);
            v1 = com.google.android.finsky.billing.common.m.a(com.google.android.finsky.billing.common.m.a(p0, "PADDING_END"), p2);
            v0 = com.google.android.finsky.billing.common.m.a(com.google.android.finsky.billing.common.m.a(p0, "PADDING_BOTTOM"), p2);
            if (p3 == 0)
                v2 = -1;
            if (p4 == 0)
                v0 = -1;
            if (v3 == -1)
                v3 = android.support.v4.view.ai.a.l(p1);
            if (v2 != -1) {
            }
            else
                v2 = p1.getPaddingTop();
            if (v1 != -1) {
            }
            else
                v1 = android.support.v4.view.ai.a.m(p1);
            if (v0 != -1) {
            }
            else
                v0 = p1.getPaddingBottom();
            android.support.v4.view.ai.a(p1, v3, v2, v1, v0);
        }
    }

    private final void b(String p0, Bundle p1, PurchaseFlowConfig p2) {
        p1.putFloat(com.google.android.finsky.billing.common.m.a(p0, "PADDING_START"), (float)this.a(p2, p0, "PADDING_START"));
        p1.putFloat(com.google.android.finsky.billing.common.m.a(p0, "PADDING_TOP"), (float)this.a(p2, p0, "PADDING_TOP"));
        p1.putFloat(com.google.android.finsky.billing.common.m.a(p0, "PADDING_END"), (float)this.a(p2, p0, "PADDING_END"));
        p1.putFloat(com.google.android.finsky.billing.common.m.a(p0, "PADDING_BOTTOM"), (float)this.a(p2, p0, "PADDING_BOTTOM"));
    }

    public final Bundle a(PurchaseFlowConfig p0) {
        if (p0 == 0)
            v0 = 0;
        else {
            v0 = new Bundle();
            this.a("ALL_TITLE", v0, p0);
            this.a("ALL_FOP", v0, p0);
            this.a("PROFILE_OPTION", v0, p0);
        }
        return v0;
    }

    public final void a(Bundle p0, View p1, TextView p2, TextView p3, TextView p4, TextView p5, TextView p6, View p7) {
        com.google.android.finsky.billing.common.m.a("ALL_DIALOG", p1, p0, 1, 0);
        com.google.android.finsky.billing.common.m.a("ALL_DIALOG", p7, p0, 0, 1);
        this.a("ALL_TITLE", p2, p0);
        this.a("ALL_PRICE", p4, p0);
        this.a("ALL_MESSAGE", p3, p0);
        this.a("ALL_TOS", p6, p0);
        this.a("ALL_FOP", p5, p0);
    }

    public final void a(Bundle p0, PurchaseFlowConfig p1, String p2) {
        if (p1 != 0) {
            p0.putInt("continueButtonBgColor", p1.b(p2, "BG_COLOR"));
            p0.putInt("continueButtonTextColor", p1.b(p2, "COLOR"));
            this.b(p0, p1);
        }
    }

    public final void a(String p0, TextView p1, Bundle p2) {
        if (p1 != 0 && p2 != 0) {
            if (p1 != 0 && p2 != 0) {
                v0 = p2.getInt(com.google.android.finsky.billing.common.m.a(p0, "COLOR"), -1);
                v1 = p2.getFloat(com.google.android.finsky.billing.common.m.a(p0, "FONT_SIZE"), -1082130432);
                v2 = p2.getString(com.google.android.finsky.billing.common.m.a(p0, "FONT_STYLE"));
                if (v2 != 0) {
                    v2 = PurchaseFlowConfig.a(v2, p1);
                    if (v2 != 0)
                        p1.setTypeface(v2);
                }
                if (v0 != -1)
                    p1.setTextColor(com.google.android.finsky.bg.g.a(v0, this.a));
                if (v1 != -1082130432)
                    p1.setTextSize(0, v1);
            }
            com.google.android.finsky.billing.common.m.a(p0, p1, p2, 1, 1);
        }
    }

    public final void b(Bundle p0, PurchaseFlowConfig p1) {
        if (p1 != 0) {
            this.b("ALL_DIALOG", p0, p1);
            this.a("ALL_TITLE", p0, p1);
            this.a("ALL_PRICE", p0, p1);
            this.a("ALL_MESSAGE", p0, p1);
            this.a("ALL_TOS", p0, p1);
            this.a("ALL_FOP", p0, p1);
        }
    }

}
