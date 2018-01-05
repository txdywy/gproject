package com.google.android.gms.internal;

import com.google.android.gms.common.internal.am;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;

final class hu extends Thread {
    public final Object f26919a = new Object();
    public final BlockingQueue f26920b;
    public /* synthetic */ hr f26921c;

    public hu(hr hrVar, String str, BlockingQueue blockingQueue) {
        this.f26921c = hrVar;
        am.m23733a((Object) str);
        am.m23733a((Object) blockingQueue);
        this.f26920b = blockingQueue;
        setName(str);
    }

    public final void run() {
        Object obj = null;
        while (obj == null) {
            try {
                this.f26921c.f26911f.acquire();
                obj = 1;
            } catch (InterruptedException e) {
                m24752a(e);
            }
        }
        while (true) {
            try {
                FutureTask futureTask = (FutureTask) this.f26920b.poll();
                if (futureTask != null) {
                    futureTask.run();
                } else {
                    synchronized (this.f26919a) {
                        if (this.f26920b.peek() == null && !this.f26921c.f26912g) {
                            try {
                                this.f26919a.wait(30000);
                            } catch (InterruptedException e2) {
                                m24752a(e2);
                            }
                        }
                    }
                    synchronized (this.f26921c.f26910e) {
                        if (this.f26920b.peek() == null) {
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f26921c.f26910e) {
                    this.f26921c.f26911f.release();
                    this.f26921c.f26910e.notifyAll();
                    if (this == this.f26921c.f26906a) {
                        this.f26921c.f26906a = null;
                    } else if (this == this.f26921c.f26907b) {
                        this.f26921c.f26907b = null;
                    } else {
                        this.f26921c.mo4742p().f26845d.m24652a("Current scheduler thread is neither worker nor network");
                    }
                }
            }
        }
        synchronized (this.f26921c.f26910e) {
            this.f26921c.f26911f.release();
            this.f26921c.f26910e.notifyAll();
            if (this == this.f26921c.f26906a) {
                this.f26921c.f26906a = null;
            } else if (this == this.f26921c.f26907b) {
                this.f26921c.f26907b = null;
            } else {
                this.f26921c.mo4742p().f26845d.m24652a("Current scheduler thread is neither worker nor network");
            }
        }
    }

    private final void m24752a(InterruptedException interruptedException) {
        this.f26921c.mo4742p().f26847f.m24653a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
