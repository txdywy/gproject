package com.android.volley;

import java.util.concurrent.BlockingQueue;

public final class com.android.volley.d implements Runnable
{

    public final com.android.volley.n a;
    public final com.android.volley.c b;

    d(com.android.volley.c p0, com.android.volley.n p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void run() {
        try {
            this.b.c.put(this.a);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

}
