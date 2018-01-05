package org.chromium.net.impl;

import org.chromium.base.C7893j;

final class C7952l implements Runnable {
    public final /* synthetic */ CronetUploadDataStream f40919a;

    C7952l(CronetUploadDataStream cronetUploadDataStream) {
        this.f40919a = cronetUploadDataStream;
    }

    public final void run() {
        try {
            this.f40919a.f40697d.m38022f();
            this.f40919a.f40696c.close();
        } catch (Exception e) {
            C7893j.m37818b(CronetUploadDataStream.f40694a, "Exception thrown when closing", e);
        }
    }
}
