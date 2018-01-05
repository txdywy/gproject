package com.google.android.gms.gcm;

import android.os.Bundle;
import com.google.android.gms.common.internal.am;

public class C5201k {
    public int f26239c;
    public String f26240d;
    public String f26241e;
    public boolean f26242f;
    public boolean f26243g;
    public boolean f26244h;
    public C5204j f26245i = C5204j.f26251a;
    public Bundle f26246j;

    public void mo4640a() {
        am.m23743b(this.f26240d != null, "Must provide an endpoint for this task by calling setService(ComponentName).");
        C5195a.m23969a(this.f26241e);
        C5204j c5204j = this.f26245i;
        if (c5204j != null) {
            int i = c5204j.f26252b;
            if (i == 1 || i == 0) {
                int i2 = c5204j.f26253c;
                int i3 = c5204j.f26254d;
                if (i == 0 && i2 < 0) {
                    throw new IllegalArgumentException("InitialBackoffSeconds can't be negative: " + i2);
                } else if (i == 1 && i2 < 10) {
                    throw new IllegalArgumentException("RETRY_POLICY_LINEAR must have an initial backoff at least 10 seconds.");
                } else if (i3 < i2) {
                    throw new IllegalArgumentException("MaximumBackoffSeconds must be greater than InitialBackoffSeconds: " + c5204j.f26254d);
                }
            }
            throw new IllegalArgumentException("Must provide a valid RetryPolicy: " + i);
        }
        if (this.f26243g) {
            Task.m23963b(this.f26246j);
        }
    }
}
