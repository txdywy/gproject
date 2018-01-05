package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class cg {
    public Bundle f1483A;
    public int f1484B;
    public int f1485C;
    public Notification f1486D;
    public RemoteViews f1487E;
    public RemoteViews f1488F;
    public RemoteViews f1489G;
    public String f1490H;
    public int f1491I;
    public String f1492J;
    public long f1493K;
    public int f1494L;
    public Notification f1495M;
    @Deprecated
    public ArrayList f1496N;
    public Context f1497a;
    public ArrayList f1498b;
    public CharSequence f1499c;
    public CharSequence f1500d;
    public PendingIntent f1501e;
    public PendingIntent f1502f;
    public RemoteViews f1503g;
    public Bitmap f1504h;
    public CharSequence f1505i;
    public int f1506j;
    public int f1507k;
    public boolean f1508l;
    public boolean f1509m;
    public ci f1510n;
    public CharSequence f1511o;
    public CharSequence[] f1512p;
    public int f1513q;
    public int f1514r;
    public boolean f1515s;
    public String f1516t;
    public boolean f1517u;
    public String f1518v;
    public boolean f1519w;
    public boolean f1520x;
    public boolean f1521y;
    public String f1522z;

    public cg(Context context, String str) {
        this.f1498b = new ArrayList();
        this.f1508l = true;
        this.f1519w = false;
        this.f1484B = 0;
        this.f1485C = 0;
        this.f1491I = 0;
        this.f1494L = 0;
        this.f1495M = new Notification();
        this.f1497a = context;
        this.f1490H = str;
        this.f1495M.when = System.currentTimeMillis();
        this.f1495M.audioStreamType = -1;
        this.f1507k = 0;
        this.f1496N = new ArrayList();
    }

    @Deprecated
    public cg(Context context) {
        this(context, null);
    }

    public final cg m1418a(long j) {
        this.f1495M.when = j;
        return this;
    }

    public final cg m1415a(int i) {
        this.f1495M.icon = i;
        return this;
    }

    public final cg m1422a(CharSequence charSequence) {
        this.f1499c = m1413d(charSequence);
        return this;
    }

    public final cg m1425b(CharSequence charSequence) {
        this.f1500d = m1413d(charSequence);
        return this;
    }

    public final cg m1416a(int i, int i2) {
        this.f1513q = i;
        this.f1514r = i2;
        this.f1515s = true;
        return this;
    }

    public final cg m1419a(PendingIntent pendingIntent) {
        this.f1495M.deleteIntent = pendingIntent;
        return this;
    }

    public final cg m1426c(CharSequence charSequence) {
        this.f1495M.tickerText = m1413d(charSequence);
        return this;
    }

    public final cg m1423a(boolean z) {
        m1424a(16, z);
        return this;
    }

    public final void m1424a(int i, boolean z) {
        if (z) {
            Notification notification = this.f1495M;
            notification.flags |= i;
            return;
        }
        notification = this.f1495M;
        notification.flags &= i ^ -1;
    }

    public final cg m1417a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this.f1498b.add(new cd(i, charSequence, pendingIntent));
        return this;
    }

    public final cg m1420a(cd cdVar) {
        this.f1498b.add(cdVar);
        return this;
    }

    public final cg m1421a(ci ciVar) {
        if (this.f1510n != ciVar) {
            this.f1510n = ciVar;
            if (this.f1510n != null) {
                ci ciVar2 = this.f1510n;
                if (ciVar2.f1478b != this) {
                    ciVar2.f1478b = this;
                    if (ciVar2.f1478b != null) {
                        ciVar2.f1478b.m1421a(ciVar2);
                    }
                }
            }
        }
        return this;
    }

    public final Notification m1414a() {
        Notification build;
        ck ckVar = new ck(this);
        ci ciVar = ckVar.f1538b.f1510n;
        if (ciVar != null) {
            ciVar.mo318a(ckVar);
        }
        if (VERSION.SDK_INT >= 26) {
            build = ckVar.f1537a.build();
        } else if (VERSION.SDK_INT >= 24) {
            build = ckVar.f1537a.build();
            if (ckVar.f1543g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || ckVar.f1543g != 2)) {
                    ck.m1430a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && ckVar.f1543g == 1) {
                    ck.m1430a(build);
                }
            }
        } else if (VERSION.SDK_INT >= 21) {
            ckVar.f1537a.setExtras(ckVar.f1542f);
            build = ckVar.f1537a.build();
            if (ckVar.f1539c != null) {
                build.contentView = ckVar.f1539c;
            }
            if (ckVar.f1540d != null) {
                build.bigContentView = ckVar.f1540d;
            }
            if (ckVar.f1544h != null) {
                build.headsUpContentView = ckVar.f1544h;
            }
            if (ckVar.f1543g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || ckVar.f1543g != 2)) {
                    ck.m1430a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && ckVar.f1543g == 1) {
                    ck.m1430a(build);
                }
            }
        } else if (VERSION.SDK_INT >= 20) {
            ckVar.f1537a.setExtras(ckVar.f1542f);
            build = ckVar.f1537a.build();
            if (ckVar.f1539c != null) {
                build.contentView = ckVar.f1539c;
            }
            if (ckVar.f1540d != null) {
                build.bigContentView = ckVar.f1540d;
            }
            if (ckVar.f1543g != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || ckVar.f1543g != 2)) {
                    ck.m1430a(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && ckVar.f1543g == 1) {
                    ck.m1430a(build);
                }
            }
        } else if (VERSION.SDK_INT >= 19) {
            r0 = cl.m1436a(ckVar.f1541e);
            if (r0 != null) {
                ckVar.f1542f.putSparseParcelableArray("android.support.actionExtras", r0);
            }
            ckVar.f1537a.setExtras(ckVar.f1542f);
            build = ckVar.f1537a.build();
            if (ckVar.f1539c != null) {
                build.contentView = ckVar.f1539c;
            }
            if (ckVar.f1540d != null) {
                build.bigContentView = ckVar.f1540d;
            }
        } else if (VERSION.SDK_INT >= 16) {
            Notification build2 = ckVar.f1537a.build();
            Bundle a = cc.m1407a(build2);
            Bundle bundle = new Bundle(ckVar.f1542f);
            for (String str : ckVar.f1542f.keySet()) {
                if (a.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a.putAll(bundle);
            r0 = cl.m1436a(ckVar.f1541e);
            if (r0 != null) {
                cc.m1407a(build2).putSparseParcelableArray("android.support.actionExtras", r0);
            }
            if (ckVar.f1539c != null) {
                build2.contentView = ckVar.f1539c;
            }
            if (ckVar.f1540d != null) {
                build2.bigContentView = ckVar.f1540d;
            }
            build = build2;
        } else {
            build = ckVar.f1537a.getNotification();
        }
        if (ckVar.f1538b.f1487E != null) {
            build.contentView = ckVar.f1538b.f1487E;
        }
        if (VERSION.SDK_INT >= 16 && ciVar != null) {
            cc.m1407a(build);
        }
        return build;
    }

    protected static CharSequence m1413d(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }
}
