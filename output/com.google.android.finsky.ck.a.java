package com.google.android.finsky.ck;

import android.content.Context;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.ck.a
{

    public final com.google.android.finsky.ba.c a;
    public final Context b;

    a(com.google.android.finsky.ba.c p0, Context p1) {
        this.a = p0;
        this.b = p1;
    }

    private final String b(Document p0) {
        if (p0.a.e != 1)
            v0 = this.b.getString(2131951753);
        else
            v0 = this.b.getString(2131951754);
        return v0;
    }

    public final String a(Document p0) {
  0:    v1 = p0.af();
  7:    v2 = new Object[1];
 14:    v2[0] = Integer.valueOf(v1);
 16:    FinskyLog.a("Item is not available. Reason: %s", v2);
 19:    v0 = 2131951752;
 22:    switch (v1) {
            case 2:
 22:            goto 32;
            case 3:
 22:            goto 25;
            case 4:
 22:            goto 25;
            case 5:
 22:            goto 25;
            case 6:
 22:            goto 25;
            case 7:
 22:            goto 25;
            case 8:
 22:            goto 83;
            case 9:
 22:            goto 44;
            case 10:
 22:            goto 36;
            case 11:
 22:            goto 40;
            case 12:
 22:            goto 79;
            case 13:
 22:            goto 25;
            case 14:
 22:            goto 25;
            case 15:
 22:            goto 25;
            case 16:
 22:            goto 25;
            case 17:
 22:            goto 25;
            case 18:
 22:            goto 25;
            case 19:
 22:            goto 25;
            case 20:
 22:            goto 25;
            case 21:
 22:            goto 91;
            case 22:
 22:            goto 87;
            case 23:
 22:            goto 25;
            case 24:
 22:            goto 91;
            case 25:
 22:            goto 49;
            default:
        }
 27:    v0 = this.b.getString(v0);
 31:    return v0;
 32:    v0 = 2131951749;
 35:    goto 25;
 36:    v0 = 2131951748;
 39:    goto 25;
 40:    v0 = 2131951750;
 43:    goto 25;
 44:    v0 = this.b(p0);
 48:    goto 31;
 62:    if (this.a.dj().a(12626607))
 69:        v0 = this.b.getString(2131951755);
        else
 74:        v0 = this.b(p0);
 73:    goto 31;
 79:    v0 = 2131951758;
 82:    goto 25;
 83:    v0 = 2131951757;
 86:    goto 25;
 87:    v0 = 2131951756;
 90:    goto 25;
 91:    v0 = 2131951751;
 94:    goto 25;
    }

}
