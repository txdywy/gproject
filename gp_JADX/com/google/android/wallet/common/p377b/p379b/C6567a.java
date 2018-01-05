package com.google.android.wallet.common.p377b.p379b;

import android.os.Bundle;
import android.util.Log;
import com.google.android.wallet.analytics.AppValidationResult;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.analytics.GetAttestationResult;
import com.google.android.wallet.analytics.GetPropertiesResult;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;
import com.google.android.wallet.analytics.p365a.C6492a;
import com.google.android.wallet.common.pub.p381a.C6579a;
import com.google.android.wallet.common.pub.p381a.p382a.C6577a;
import com.google.android.wallet.common.pub.p381a.p382a.C6578b;
import java.util.ArrayList;
import java.util.List;

public final class C6567a {
    public static void m29802a(Bundle bundle, byte[] bArr) {
        int i = bundle.getInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE");
        int i2;
        switch (i) {
            case 770:
                CreditCardEntryAction creditCardEntryAction = (CreditCardEntryAction) bundle.getParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA");
                if (creditCardEntryAction == null) {
                    throw new IllegalArgumentException("CreditCardEntryAction background events must include a CreditCardEntryAction");
                }
                C6579a.m29875a(new C6492a(creditCardEntryAction, bArr));
                return;
            case 772:
                WebViewPageLoadEvent webViewPageLoadEvent = (WebViewPageLoadEvent) bundle.getParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA");
                if (webViewPageLoadEvent == null) {
                    throw new IllegalArgumentException("WebViewPageLoad background events must include a WebViewPageLoadEvent.");
                }
                i2 = bundle.getInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", -1);
                if (i2 == -1) {
                    throw new IllegalArgumentException("WebViewPageLoad background events must include a resultCode");
                }
                C6579a.m29875a(new C6492a(i2, webViewPageLoadEvent, bArr));
                return;
            case 773:
                i2 = bundle.getInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", -1);
                if (i2 == -1) {
                    throw new IllegalArgumentException("OTP autofill background event must include a resultCode");
                }
                C6567a.m29807b(i, i2, bArr);
                return;
            case 776:
                i = bundle.getInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", -1);
                if (i == -1) {
                    throw new IllegalArgumentException("ProviderInstall background events must include a resultCode");
                }
                C6567a.m29807b(776, i, bArr);
                return;
            case 777:
                AppValidationResult appValidationResult = (AppValidationResult) bundle.getParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA");
                if (appValidationResult == null) {
                    throw new IllegalArgumentException("AppValidation background events must include a AppValidationResult.");
                }
                i2 = bundle.getInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", -1);
                if (i2 == -1) {
                    throw new IllegalArgumentException("AppValidation background events must include a resultCode");
                }
                C6579a.m29875a(new C6492a(i2, appValidationResult, bArr));
                return;
            case 778:
                int i3 = bundle.getInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", -1);
                if (i3 == -1) {
                    throw new IllegalArgumentException("App redirect finished background events must include a resultCode");
                }
                C6579a.m29875a(new C6492a(778, i3, null, -1, -1, -1, bArr));
                return;
            case 779:
                GetAttestationResult getAttestationResult = (GetAttestationResult) bundle.getParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA");
                if (getAttestationResult == null) {
                    throw new IllegalArgumentException("Attestation background events must include a GetAttestationResult.");
                }
                i2 = bundle.getInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", -1);
                if (i2 == -1) {
                    throw new IllegalArgumentException("Attestation background events must include a resultCode");
                }
                C6579a.m29875a(new C6492a(i2, getAttestationResult, bArr));
                return;
            case 780:
                GetPropertiesResult getPropertiesResult = (GetPropertiesResult) bundle.getParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA");
                if (getPropertiesResult == null) {
                    throw new IllegalArgumentException("Get property background events must include a GetPropertiesResult.");
                }
                i2 = bundle.getInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", -1);
                if (i2 == -1) {
                    throw new IllegalArgumentException("Get property background events must include a resultCode");
                }
                C6579a.m29875a(new C6492a(i2, getPropertiesResult, bArr));
                return;
            default:
                throw new IllegalArgumentException("Unknown analytics background event type: " + i);
        }
    }

    public static void m29801a(int i, int i2, byte[] bArr) {
        C6579a.m29875a(new C6492a(i, 0, null, -1, -1, i2, bArr));
    }

    public static void m29807b(int i, int i2, byte[] bArr) {
        C6567a.m29800a(i, i2, null, -1, -1, bArr);
    }

    public static void m29800a(int i, int i2, String str, long j, long j2, byte[] bArr) {
        C6579a.m29875a(new C6492a(i, i2, str, j, j2, -1, bArr));
    }

    public static void m29803a(C6504m c6504m) {
        C6567a.m29805a(c6504m, -1, 1621);
    }

    public static void m29805a(C6504m c6504m, int i, int i2) {
        List arrayList = new ArrayList();
        arrayList.add(new C6506n(i2));
        if (i != -1) {
            arrayList.add(new C6506n(i));
        }
        while (c6504m != null) {
            arrayList.add(c6504m.getUiElement());
            c6504m = c6504m.getParentUiNode();
        }
        C6577a c6577a = new C6577a(arrayList);
        if (C6579a.f32716a != null) {
            C6579a.f32716a.m29877a(c6577a);
        } else if (Log.isLoggable("OrchAnalyticsDispatcher", 3)) {
            Log.d("OrchAnalyticsDispatcher", "No listener found for sending click event from the clicked element " + ((C6506n) c6577a.f32714a.get(0)).f32563a);
        }
    }

    public static void m29804a(C6504m c6504m, int i) {
        C6504m c6504m2 = c6504m;
        while (c6504m2.getParentUiNode() != null) {
            c6504m2 = c6504m2.getParentUiNode();
        }
        C6506n a = C6567a.m29799a(c6504m2.getUiElement());
        C6567a.m29806a(a, c6504m2.getChildren(), c6504m.getUiElement().f32563a, i);
        C6578b c6578b = new C6578b(a);
        if (C6579a.f32716a != null) {
            C6579a.f32716a.m29878a(c6578b);
        } else if (Log.isLoggable("OrchAnalyticsDispatcher", 3)) {
            String str = "OrchAnalyticsDispatcher";
            String str2 = "No listener found for sending the following impression event ";
            String valueOf = String.valueOf(c6578b.toString());
            Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    private static void m29806a(C6506n c6506n, List list, int i, int i2) {
        if ((list != null && !list.isEmpty()) || (i2 != -1 && c6506n.f32563a == i)) {
            List arrayList = new ArrayList();
            if (i2 != -1 && c6506n.f32563a == i) {
                arrayList.add(new C6506n(i2));
            }
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C6504m c6504m = (C6504m) list.get(i3);
                    C6506n a = C6567a.m29799a(c6504m.getUiElement());
                    arrayList.add(a);
                    C6567a.m29806a(a, c6504m.getChildren(), i, i2);
                }
            }
            c6506n.f32565c = arrayList;
        }
    }

    private static C6506n m29799a(C6506n c6506n) {
        return new C6506n(c6506n.f32563a, c6506n.f32564b);
    }
}
