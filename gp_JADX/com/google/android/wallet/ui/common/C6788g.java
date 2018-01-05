package com.google.android.wallet.ui.common;

import android.support.v4.view.b;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

final class C6788g extends b {
    public final /* synthetic */ C6753f f33673a;

    C6788g(C6753f c6753f) {
        this.f33673a = c6753f;
    }

    public final boolean m30924c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 8 && this.f33673a.getError() != null) {
            accessibilityEvent.setContentDescription(this.f33673a.m30587c());
        }
        return true;
    }
}
