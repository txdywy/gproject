package com.google.android.finsky.br;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.u;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.cv.a.am;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.jl;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.v;
import com.google.android.finsky.notification.u;
import com.google.wireless.android.finsky.a.a.i;
import com.google.wireless.android.finsky.dfe.c.a.eb;
import java.util.Collection;

public abstract class com.google.android.finsky.br.b
{

    public abstract PendingIntent a(com.google.android.finsky.notification.u p0, Context p1, int p2, com.google.android.finsky.d.w p3);

    public abstract Intent a(int p0, com.google.wireless.android.finsky.a.a.i p1, Bundle p2, com.google.android.finsky.d.w p3);

    public abstract Intent a(Account p0, Context p1, com.google.android.finsky.ba.e p2, Document p3, com.google.android.finsky.d.w p4, PurchaseParams p5, com.google.wireless.android.finsky.dfe.c.a.eb p6, boolean p7, boolean p8);

    public abstract Intent a(Account p0, Context p1, PurchaseParams p2, com.google.android.finsky.ba.e p3);

    public abstract Intent a(Account p0, Context p1, PurchaseParams p2, com.google.android.finsky.dfemodel.v p3, String p4, com.google.android.finsky.ba.e p5);

    public abstract Intent a(Account p0, PurchaseParams p1);

    public abstract Intent a(Account p0, PurchaseParams p1, com.google.android.finsky.d.w p2);

    public abstract Intent a(Account p0, Document p1, String p2, int p3, com.google.android.finsky.d.w p4);

    public abstract Intent a(Account p0, Document p1, String p2, int p3, com.google.android.finsky.dfemodel.v p4, String p5, String p6, boolean p7, int p8, com.google.android.finsky.d.w p9);

    public abstract Intent a(Account p0, String p1, String p2, com.google.android.finsky.d.w p3);

    public abstract Intent a(Context p0);

    public abstract Intent a(Context p0, int p1, DfeToc p2);

    public abstract Intent a(Context p0, com.google.android.finsky.cv.a.am p1, String p2, PurchaseFlowConfig p3, com.google.android.finsky.d.w p4);

    public abstract Intent a(Context p0, com.google.android.finsky.cv.a.jl p1, int p2, int p3, String p4, com.google.android.finsky.d.w p5);

    public abstract Intent a(Context p0, com.google.android.finsky.d.w p1);

    public abstract Intent a(Context p0, Document p1, int p2, int p3);

    public abstract Intent a(Context p0, Document p1, com.google.android.finsky.d.w p2);

    public abstract Intent a(Context p0, Document p1, String p2, boolean p3, com.google.android.finsky.d.w p4);

    public abstract Intent a(Context p0, String p1);

    public abstract Intent a(Context p0, String p1, int p2, String p3, com.google.android.finsky.d.w p4);

    public abstract Intent a(Context p0, String p1, com.google.android.finsky.cv.a.ax p2, long p3, byte[] p5, com.google.android.finsky.d.w p6);

    public abstract Intent a(Context p0, String p1, com.google.android.finsky.d.w p2);

    public abstract Intent a(Context p0, String p1, DfeToc p2);

    public abstract Intent a(Context p0, String p1, String p2, int p3, com.google.android.finsky.d.w p4);

    public abstract Intent a(Context p0, String p1, String p2, Document p3, boolean p4, com.google.android.finsky.d.w p5);

    public abstract Intent a(Context p0, String p1, String p2, Document p3, boolean p4, boolean p5, String p6, com.google.android.finsky.d.w p7);

    public abstract Intent a(Context p0, String p1, String p2, String p3, String p4, com.google.android.finsky.d.w p5);

    public abstract Intent a(Context p0, String p1, String p2, String p3, String p4, boolean p5, com.google.android.finsky.d.w p6);

    public abstract Intent a(Context p0, Collection p1, com.google.android.finsky.d.w p2, boolean p3);

    public abstract Intent a(String p0, String p1, String p2, com.google.android.finsky.d.w p3);

    public abstract com.google.android.finsky.notification.u a();

    public abstract com.google.android.finsky.notification.u a(String p0);

    public abstract com.google.android.finsky.notification.u a(String p0, String p1, String p2, String p3);

    public abstract void a(android.support.v4.app.u p0, com.google.android.finsky.d.w p1);

    public abstract Intent b(Context p0);

    public abstract Intent b(Context p0, com.google.android.finsky.d.w p1);

    public abstract Intent b(Context p0, String p1);

    public abstract Intent b(Context p0, String p1, com.google.android.finsky.cv.a.ax p2, long p3, byte[] p5, com.google.android.finsky.d.w p6);

    public abstract Intent b(Context p0, String p1, com.google.android.finsky.d.w p2);

    public abstract Intent c(Context p0);

    public abstract Intent d(Context p0);

    public abstract Intent e(Context p0);

    public abstract Intent f(Context p0);

    public abstract Intent g(Context p0);

}
