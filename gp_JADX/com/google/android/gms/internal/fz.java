package com.google.android.gms.internal;

import android.os.Build.VERSION;
import android.os.ConditionVariable;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class fz {
    public static final ConditionVariable f26765b = new ConditionVariable();
    public static volatile xs f26766c = null;
    public static volatile Random f26767e = null;
    public jp f26768a;
    public volatile Boolean f26769d;

    public fz(jp jpVar) {
        this.f26768a = jpVar;
        jpVar.f27074d.execute(new ga(this));
    }

    public static int m24381a() {
        try {
            return VERSION.SDK_INT >= 21 ? ThreadLocalRandom.current().nextInt() : m24383b().nextInt();
        } catch (RuntimeException e) {
            return m24383b().nextInt();
        }
    }

    private static Random m24383b() {
        if (f26767e == null) {
            synchronized (fz.class) {
                if (f26767e == null) {
                    f26767e = new Random();
                }
            }
        }
        return f26767e;
    }
}
