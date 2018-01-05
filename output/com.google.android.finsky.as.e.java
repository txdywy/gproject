package com.google.android.finsky.as;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.e;

public final class com.google.android.finsky.as.e
{

    public final Context a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Integer e;

    e(Context p0) {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.a = p0;
    }

    public final synchronized boolean a() {
        v0 = 0;
        v1 = 1;
        enter this;
        try {
            if (this.b == 0) {
                if (this.c() && this.e() && com.google.android.finsky.as.a.b(this.a)) {
                    if (6 == this.f()) {
                    }
                    else
                        v1 = 0;
                    this.b = Boolean.valueOf(v1);
                }
                else {
                    try {
                        if (com.google.android.finsky.as.a.a(this.a)) {
                            if (4 == this.f()) {
                            }
                            else
                                v1 = 0;
                            this.b = Boolean.valueOf(v1);
                        }
                        else {
                            try {
                                if (this.c()) {
                                    if (3 == this.f()) {
                                    }
                                    else
                                        v1 = 0;
                                    this.b = Boolean.valueOf(v1);
                                }
                                else if (com.google.android.finsky.as.a.b(this.a)) {
                                    if (5 == this.f()) {
                                    }
                                    else
                                        v1 = 0;
                                    this.b = Boolean.valueOf(v1);
                                }
                                else if (com.google.android.finsky.as.a.d(this.a)) {
                                    if (7 == this.f()) {
                                    }
                                    else
                                        v1 = 0;
                                    this.b = Boolean.valueOf(v1);
                                }
                                else if (this.e()) {
                                    if (2 == this.f() || 3 == this.f() || this.f() == 0)
                                        v0 = 1;
                                    this.b = Boolean.valueOf(v0);
                                }
                                else {
                                    if (this.f() == 0 || 1 == this.f())
                                        v0 = 1;
                                    this.b = Boolean.valueOf(v0);
                                }
                            }
                            catch (Throwable ex) {
                                exit this;
                                throw ex;
                            }
                        }
                    }
                    catch (Throwable ex) {
                        exit this;
                        throw ex;
                    }
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return this.b.booleanValue();
    }

    public final boolean b() {
        if (3 == this.f() && this.c())
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final synchronized boolean c() {
        enter this;
        try {
            if (this.c == 0)
                this.c = Boolean.valueOf(com.google.android.gms.common.e.c(this.a));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return this.c.booleanValue();
    }

    public final boolean d() {
        if (2 != this.f()) {
            if (6 == this.f() && this.e())
                v0 = 1;
            else
                v0 = 0;
        }
        return v0;
    }

    public final synchronized boolean e() {
        enter this;
        try {
            if (this.d == 0)
                this.d = Boolean.valueOf(this.a.getPackageManager().hasSystemFeature("com.google.android.feature.services_updater"));
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return this.d.booleanValue();
    }

    public final int f() {
        if (this.e == 0)
            this.e = Integer.valueOf(0);
        return this.e.intValue();
    }

}
