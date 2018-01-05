package com.google.android.finsky;

import com.google.wireless.android.finsky.b.ab;

public final class com.google.android.finsky.b implements Runnable
{

    public final com.google.wireless.android.finsky.b.ab a;
    public final DfeNotificationManagerImpl b;

    b(DfeNotificationManagerImpl p0, com.google.wireless.android.finsky.b.ab p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        this.b.b(this.a);
    }

}
