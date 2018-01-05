package org.chromium.net.impl;

import org.chromium.base.C7893j;

final class C7945c implements Runnable {
    public final /* synthetic */ CronetBidirectionalStream f40907a;

    C7945c(CronetBidirectionalStream cronetBidirectionalStream) {
        this.f40907a = cronetBidirectionalStream;
    }

    public final void run() {
        try {
            this.f40907a.f40683b.mo6630a();
        } catch (Exception e) {
            C7893j.m37818b(CronetUrlRequestContext.f40731a, "Exception in onCanceled method", e);
        }
    }
}
