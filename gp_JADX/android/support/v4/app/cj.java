package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Action;
import android.app.Notification.Action.Builder;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

public final class cj implements ch {
    public ArrayList f1523a = new ArrayList();
    public int f1524b = 1;
    public PendingIntent f1525c;
    public ArrayList f1526d = new ArrayList();
    public Bitmap f1527e;
    public int f1528f;
    public int f1529g = 8388613;
    public int f1530h = -1;
    public int f1531i = 0;
    public int f1532j;
    public int f1533k = 80;
    public int f1534l;
    public String f1535m;
    public String f1536n;

    public final cg mo319a(cg cgVar) {
        Bundle bundle = new Bundle();
        if (!this.f1523a.isEmpty()) {
            if (VERSION.SDK_INT >= 16) {
                ArrayList arrayList = new ArrayList(this.f1523a.size());
                ArrayList arrayList2 = this.f1523a;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    cd cdVar = (cd) obj;
                    if (VERSION.SDK_INT >= 20) {
                        arrayList.add(m1428a(cdVar));
                    } else if (VERSION.SDK_INT >= 16) {
                        arrayList.add(cl.m1435a(cdVar));
                    }
                }
                bundle.putParcelableArrayList("actions", arrayList);
            } else {
                bundle.putParcelableArrayList("actions", null);
            }
        }
        if (this.f1524b != 1) {
            bundle.putInt("flags", this.f1524b);
        }
        if (this.f1525c != null) {
            bundle.putParcelable("displayIntent", this.f1525c);
        }
        if (!this.f1526d.isEmpty()) {
            bundle.putParcelableArray("pages", (Parcelable[]) this.f1526d.toArray(new Notification[this.f1526d.size()]));
        }
        if (this.f1527e != null) {
            bundle.putParcelable("background", this.f1527e);
        }
        if (this.f1528f != 0) {
            bundle.putInt("contentIcon", this.f1528f);
        }
        if (this.f1529g != 8388613) {
            bundle.putInt("contentIconGravity", this.f1529g);
        }
        if (this.f1530h != -1) {
            bundle.putInt("contentActionIndex", this.f1530h);
        }
        if (this.f1531i != 0) {
            bundle.putInt("customSizePreset", this.f1531i);
        }
        if (this.f1532j != 0) {
            bundle.putInt("customContentHeight", this.f1532j);
        }
        if (this.f1533k != 80) {
            bundle.putInt("gravity", this.f1533k);
        }
        if (this.f1534l != 0) {
            bundle.putInt("hintScreenTimeout", this.f1534l);
        }
        if (this.f1535m != null) {
            bundle.putString("dismissalId", this.f1535m);
        }
        if (this.f1536n != null) {
            bundle.putString("bridgeTag", this.f1536n);
        }
        if (cgVar.f1483A == null) {
            cgVar.f1483A = new Bundle();
        }
        cgVar.f1483A.putBundle("android.wearable.EXTENSIONS", bundle);
        return cgVar;
    }

    private static Action m1428a(cd cdVar) {
        Bundle bundle;
        Builder builder = new Builder(cdVar.f1469e, cdVar.f1470f, cdVar.f1471g);
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
        co[] coVarArr = cdVar.f1466b;
        if (coVarArr != null) {
            for (RemoteInput addRemoteInput : co.m1442a(coVarArr)) {
                builder.addRemoteInput(addRemoteInput);
            }
        }
        return builder.build();
    }

    public final /* synthetic */ Object clone() {
        cj cjVar = new cj();
        cjVar.f1523a = new ArrayList(this.f1523a);
        cjVar.f1524b = this.f1524b;
        cjVar.f1525c = this.f1525c;
        cjVar.f1526d = new ArrayList(this.f1526d);
        cjVar.f1527e = this.f1527e;
        cjVar.f1528f = this.f1528f;
        cjVar.f1529g = this.f1529g;
        cjVar.f1530h = this.f1530h;
        cjVar.f1531i = this.f1531i;
        cjVar.f1532j = this.f1532j;
        cjVar.f1533k = this.f1533k;
        cjVar.f1534l = this.f1534l;
        cjVar.f1535m = this.f1535m;
        cjVar.f1536n = this.f1536n;
        return cjVar;
    }
}
