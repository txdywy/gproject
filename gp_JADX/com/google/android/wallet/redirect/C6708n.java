package com.google.android.wallet.redirect;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.b.a;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;

final class C6708n extends a {
    public final /* synthetic */ StartAndroidAppRedirectActivity f33080a;

    C6708n(StartAndroidAppRedirectActivity startAndroidAppRedirectActivity) {
        this.f33080a = startAndroidAppRedirectActivity;
    }

    public final void m30362a(int i) {
        if (this.f33080a.f32832x != null) {
            StartAndroidAppRedirectActivity startAndroidAppRedirectActivity = this.f33080a;
            Parcelable webViewPageLoadEvent = new WebViewPageLoadEvent();
            webViewPageLoadEvent.f32535a = "chromeUrl:" + startAndroidAppRedirectActivity.f32833y;
            if (i == 2) {
                startAndroidAppRedirectActivity.f32833y++;
            }
            webViewPageLoadEvent.f32538d = i;
            Bundle bundle = new Bundle();
            bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", 772);
            bundle.putParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA", webViewPageLoadEvent);
            bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", 0);
            this.f33080a.f32832x.mo5548a(bundle, this.f33080a.f32831w);
        }
    }
}
