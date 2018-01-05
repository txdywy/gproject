package com.google.android.finsky.appdiscoveryservice.b;

public final class com.google.android.finsky.appdiscoveryservice.b.g implements IBinder$DeathRecipient
{

    public final com.google.android.finsky.appdiscoveryservice.b.f a;

    g(com.google.android.finsky.appdiscoveryservice.b.f p0) {
        this.a = p0;
    }

    public final void binderDied() {
        this.a.z = 0;
    }

}
