package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

final class ck implements cb {
    public final Builder f1537a;
    public final cg f1538b;
    public RemoteViews f1539c;
    public RemoteViews f1540d;
    public final List f1541e = new ArrayList();
    public final Bundle f1542f = new Bundle();
    public int f1543g;
    public RemoteViews f1544h;

    ck(cg cgVar) {
        boolean z;
        ArrayList arrayList;
        int i = 0;
        this.f1538b = cgVar;
        if (VERSION.SDK_INT >= 26) {
            this.f1537a = new Builder(cgVar.f1497a, cgVar.f1490H);
        } else {
            this.f1537a = new Builder(cgVar.f1497a);
        }
        Notification notification = cgVar.f1495M;
        Builder lights = this.f1537a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cgVar.f1503g).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        lights = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        lights = lights.setOnlyAlertOnce(z);
        if ((notification.flags & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        lights = lights.setAutoCancel(z).setDefaults(notification.defaults).setContentTitle(cgVar.f1499c).setContentText(cgVar.f1500d).setContentInfo(cgVar.f1505i).setContentIntent(cgVar.f1501e).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = cgVar.f1502f;
        if ((notification.flags & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        lights.setFullScreenIntent(pendingIntent, z).setLargeIcon(cgVar.f1504h).setNumber(cgVar.f1506j).setProgress(cgVar.f1513q, cgVar.f1514r, cgVar.f1515s);
        if (VERSION.SDK_INT >= 16) {
            this.f1537a.setSubText(cgVar.f1511o).setUsesChronometer(cgVar.f1509m).setPriority(cgVar.f1507k);
            arrayList = cgVar.f1498b;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                m1431a((cd) obj);
            }
            if (cgVar.f1483A != null) {
                this.f1542f.putAll(cgVar.f1483A);
            }
            if (VERSION.SDK_INT < 20) {
                if (cgVar.f1519w) {
                    this.f1542f.putBoolean("android.support.localOnly", true);
                }
                if (cgVar.f1516t != null) {
                    this.f1542f.putString("android.support.groupKey", cgVar.f1516t);
                    if (cgVar.f1517u) {
                        this.f1542f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f1542f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (cgVar.f1518v != null) {
                    this.f1542f.putString("android.support.sortKey", cgVar.f1518v);
                }
            }
            this.f1539c = cgVar.f1487E;
            this.f1540d = cgVar.f1488F;
        }
        if (VERSION.SDK_INT >= 19) {
            this.f1537a.setShowWhen(cgVar.f1508l);
            if (!(VERSION.SDK_INT >= 21 || cgVar.f1496N == null || cgVar.f1496N.isEmpty())) {
                this.f1542f.putStringArray("android.people", (String[]) cgVar.f1496N.toArray(new String[cgVar.f1496N.size()]));
            }
        }
        if (VERSION.SDK_INT >= 20) {
            this.f1537a.setLocalOnly(cgVar.f1519w).setGroup(cgVar.f1516t).setGroupSummary(cgVar.f1517u).setSortKey(cgVar.f1518v);
            this.f1543g = cgVar.f1494L;
        }
        if (VERSION.SDK_INT >= 21) {
            this.f1537a.setCategory(cgVar.f1522z).setColor(cgVar.f1484B).setVisibility(cgVar.f1485C).setPublicVersion(cgVar.f1486D);
            arrayList = cgVar.f1496N;
            int size2 = arrayList.size();
            while (i < size2) {
                obj = arrayList.get(i);
                i++;
                this.f1537a.addPerson((String) obj);
            }
            this.f1544h = cgVar.f1489G;
        }
        if (VERSION.SDK_INT >= 24) {
            this.f1537a.setExtras(cgVar.f1483A).setRemoteInputHistory(cgVar.f1512p);
            if (cgVar.f1487E != null) {
                this.f1537a.setCustomContentView(cgVar.f1487E);
            }
            if (cgVar.f1488F != null) {
                this.f1537a.setCustomBigContentView(cgVar.f1488F);
            }
            if (cgVar.f1489G != null) {
                this.f1537a.setCustomHeadsUpContentView(cgVar.f1489G);
            }
        }
        if (VERSION.SDK_INT >= 26) {
            this.f1537a.setBadgeIconType(cgVar.f1491I).setShortcutId(cgVar.f1492J).setTimeoutAfter(cgVar.f1493K).setGroupAlertBehavior(cgVar.f1494L);
            if (cgVar.f1521y) {
                this.f1537a.setColorized(cgVar.f1520x);
            }
        }
    }

    public final Builder mo320a() {
        return this.f1537a;
    }

    private final void m1431a(cd cdVar) {
        if (VERSION.SDK_INT >= 20) {
            Bundle bundle;
            Action.Builder builder = new Action.Builder(cdVar.f1469e, cdVar.f1470f, cdVar.f1471g);
            if (cdVar.f1466b != null) {
                for (RemoteInput addRemoteInput : co.m1442a(cdVar.f1466b)) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (cdVar.f1465a != null) {
                bundle = new Bundle(cdVar.f1465a);
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", cdVar.f1468d);
            if (VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(cdVar.f1468d);
            }
            builder.addExtras(bundle);
            this.f1537a.addAction(builder.build());
        } else if (VERSION.SDK_INT >= 16) {
            this.f1541e.add(cl.m1433a(this.f1537a, cdVar));
        }
    }

    static void m1430a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
