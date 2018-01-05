package com.firebase.jobdispatcher;

import android.os.Bundle;

final class com.firebase.jobdispatcher.y
{

    public String a;
    public String b;
    public com.firebase.jobdispatcher.ag c;
    public boolean d;
    public int e;
    public int[] f;
    public final Bundle g;
    public com.firebase.jobdispatcher.am h;
    public boolean i;
    public com.firebase.jobdispatcher.ap j;

    y() {
        this.g = new Bundle();
    }

    final com.firebase.jobdispatcher.x a() {
        if (this.a == 0 || this.b == 0 || this.c == 0)
            throw new IllegalArgumentException("Required fields were not populated.");
        return new com.firebase.jobdispatcher.x(this);
    }

}
