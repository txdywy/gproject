package com.google.android.finsky.billing.addresschallenge.a;

public final class com.google.android.finsky.billing.addresschallenge.a.ap implements com.google.android.finsky.billing.addresschallenge.a.y
{

    public Object a;
    public boolean b;

    ap(Object p0) {
        this.a = p0;
        this.b = 0;
    }

    public final void a() {
    }

    public final void b() {
        enter this;
        try {
            this.b = 1;
            exit this;
        }
        catch (Throwable ex) {
            try {
                exit this;
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
            throw ex;
        }
        enter this.a;
        try {
            this.a.notify();
            exit this.a;
        }
        catch (Throwable ex) {
            try {
                exit this.a;
            }
            catch (Throwable ex) {
                exit this.a;
                throw ex;
            }
            throw ex;
        }
    }

    public final void c() {
        enter this;
        try {
            if (this.b != 0) {
                exit this;
                return;
            }
            exit this;
        }
        catch (Throwable ex) {
            try {
                exit this;
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
            throw ex;
        }
        enter this.a;
        try {
            this.a.wait();
            exit this.a;
            return;
            exit this.a;
        }
        catch (Throwable ex) {
            exit this.a;
            throw ex;
        }
    }

}
