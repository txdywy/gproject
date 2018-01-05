package com.google.android.agera;

public final synchronized class com.google.android.agera.ab extends com.google.android.agera.b implements com.google.android.agera.s
{

    public Object i;

    ab(Object p0) {
        com.google.android.agera.b();
        this.i = com.google.android.agera.x.a(p0);
    }

    public final void b(Object p0) {
        enter this;
        try {
            if (p0.equals(this.i))
                exit this;
            else {
                this.i = p0;
                exit this;
                this.a();
            }
            return;
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
    }

    public final synchronized Object i_() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.i;
    }

}
