package com.firebase.jobdispatcher;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;
import java.util.Set;

public final synchronized class com.firebase.jobdispatcher.af implements ServiceConnection
{

    public final Map a;
    public final com.firebase.jobdispatcher.n b;
    public final Context c;
    public boolean d;
    public com.firebase.jobdispatcher.q e;

    af(com.firebase.jobdispatcher.n p0, Context p1) {
        this.a = new HashMap();
        this.d = 0;
        this.b = p0;
        this.c = p1;
    }

    private static Bundle a(com.firebase.jobdispatcher.z p0) {
        return GooglePlayReceiver.a.a(p0, new Bundle());
    }

    private final synchronized void a(boolean p0, com.firebase.jobdispatcher.x p1) {
        enter this;
        try {
            this.e.a(com.firebase.jobdispatcher.af.a(p1), p0);
        }
        catch (RemoteException ex) {
            try {
                Log.e("FJD.ExternalReceiver", "Failed to stop a job", ex);
                this.c();
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    final synchronized void a(com.firebase.jobdispatcher.x p0) {
        enter this;
        try {
            this.a.remove(p0);
            if (this.a.isEmpty())
                this.c();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    final synchronized void a(com.firebase.jobdispatcher.x p0, boolean p1) {
        enter this;
        try {
            if (!this.a()) {
                if (Boolean.TRUE.equals(this.a.remove(p0))) {
                    if (this.b())
                        this.a(p1, p0);
                }
                if (p1 == 0) {
                    if (this.a.isEmpty())
                        this.c();
                }
            }
            else {
                try {
                    Log.w("FJD.ExternalReceiver", "Can't send stop request because service was unbound.");
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
        exit this;
    }

    final synchronized boolean a() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.d;
    }

    final synchronized boolean b() {
        enter this;
        try {
            if (this.e != 0)
                v0 = 1;
            else
                v0 = 0;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
    }

    final synchronized boolean b(com.firebase.jobdispatcher.x p0) {
  1:    enter this;
  2:    try {
  2:        v2 = this.b();
  6:        if (v2 == 0) {
 77:            try {
 83:                this.a.put(p0, Boolean.valueOf(v2));
                }
                catch (Throwable ex) {
134:                exit this;
135:                throw ex;
                }
 86:            v0 = v2;
 87:            exit this;
 88:            return v0;
            }
 22:        if (Boolean.TRUE.equals((Boolean)this.a.get(p0))) {
 26:            v3 = String.valueOf(p0);
 59:            Log.w("FJD.ExternalReceiver", (String.valueOf(v3).length() + 54) + "Received an execution request for already running job " + v3);
 63:            this.a(0, p0);
            }
        }
        catch (Throwable ex) {
134:        exit this;
135:        throw ex;
        }
 74:    this.e.a(com.firebase.jobdispatcher.af.a(p0), this.b);
 77:    try {
 83:        this.a.put(p0, Boolean.valueOf(v2));
        }
        catch (Throwable ex) {
134:        exit this;
135:        throw ex;
        }
 86:    v0 = v2;
 87:    exit this;
 88:    return v0;
 90:    try {
 92:        v3 = String.valueOf(p0);
125:        Log.e("FJD.ExternalReceiver", (String.valueOf(v3).length() + 24) + "Failed to start the job " + v3, ex);
128:        this.c();
        }
        catch (Throwable ex) {
134:        exit this;
135:        throw ex;
        }
131:    v0 = 0;
132:    goto 87;
134:    exit this;
135:    throw ex;
138:    try
            run 66...77
        catch (RemoteException ex) {
 66:        goto 89;
        }
        catch (Throwable ex) {
 66:        goto 133;
        }
    }

    final synchronized void c() {
        enter this;
        try {
            if (!this.a()) {
                this.e = 0;
                this.d = 1;
                try {
                    this.c.unbindService(this);
                }
                catch (IllegalArgumentException ex) {
                    try {
                        v0 = String.valueOf(ex.getMessage());
                        if (v0.length() != 0)
                            v0 = "Error unbinding service: ".concat(v0);
                        else {
                            try {
                                v0 = new String("Error unbinding service: ");
                            }
                            catch (Throwable ex) {
                                exit this;
                                throw ex;
                            }
                        }
                        Log.w("FJD.ExternalReceiver", v0);
                    }
                    catch (Throwable ex) {
                        exit this;
                        throw ex;
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
        exit this;
    }

    final synchronized boolean c(com.firebase.jobdispatcher.x p0) {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.a.containsKey(p0);
    }

    public final synchronized void onServiceConnected(ComponentName p0, IBinder p1) {
  0:    enter this;
  5:    if (!this.a()) goto 16;
 11:    Log.w("FJD.ExternalReceiver", "Connection have been used already.");
 14:    exit this;
 15:    return;
 16:    if (p1 != 0) goto 137;
 18:    v0 = 0;
 19:    this.e = v0;
 23:    v2 = new HashSet();
 32:    v3 = this.a.entrySet().iterator();
 40:    if (!v3.hasNext()) goto 158;
 46:    v0 = (Map$Entry)v3.next();
 58:    if (!Boolean.FALSE.equals(v0.getValue())) goto 36;
 74:    this.e.a(com.firebase.jobdispatcher.af.a((com.firebase.jobdispatcher.z)v0.getKey()), this.b);
 83:    v2.add((com.firebase.jobdispatcher.x)v0.getKey());
 86:    goto 36;
 88:    try {
 94:        v0 = String.valueOf(v0.getKey());
127:        Log.e("FJD.ExternalReceiver", (String.valueOf(v0).length() + 20) + "Failed to start job " + v0, ex);
130:        this.c();
        }
        catch (Throwable ex) {
135:        exit this;
136:        throw ex;
        }
133:    goto 14;
135:    exit this;
136:    throw ex;
139:    v0 = p1.queryLocalInterface("com.firebase.jobdispatcher.IRemoteJobService");
145:    if (v0 instanceof com.firebase.jobdispatcher.q)
147:        v0 = (com.firebase.jobdispatcher.q)v0;
        else
153:        v0 = new com.firebase.jobdispatcher.s(p1);
149:    goto 19;
158:    v1 = v2.iterator();
162:    while (v1.hasNext())
181:        this.a.put((com.firebase.jobdispatcher.x)v1.next(), Boolean.valueOf(1));
184:    goto 14;
185:    try
            run 137...184
        catch (Throwable ex) {
137:        goto 134;
        }
187:    try
            run 60...86
        catch (RemoteException ex) {
 60:        goto 87;
        }
        catch (Throwable ex) {
 60:        goto 134;
        }
188:    try
            run 19...57
        catch (Throwable ex) {
 19:        goto 134;
        }
189:    try
            run 1...14
        catch (Throwable ex) {
  1:        goto 134;
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName p0) {
        enter this;
        try {
            this.c();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

}
