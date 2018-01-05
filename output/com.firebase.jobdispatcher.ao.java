package com.firebase.jobdispatcher;

import java.util.List;

public static class com.firebase.jobdispatcher.ao
{

    public static final com.firebase.jobdispatcher.aj a;

    static {
        com.firebase.jobdispatcher.ao.a = new com.firebase.jobdispatcher.aj();
    }

    public static com.firebase.jobdispatcher.ah a(List p0) {
        if (p0 == 0 || p0.isEmpty())
            throw new IllegalArgumentException("Uris must not be null or empty.");
        return new com.firebase.jobdispatcher.ah(p0);
    }

    public static com.firebase.jobdispatcher.ai a(int p0, int p1) {
        if (p0 < 0)
            throw new IllegalArgumentException("Window start can't be less than 0");
        if (p1 < p0)
            throw new IllegalArgumentException("Window end can't be less than window start");
        return new com.firebase.jobdispatcher.ai(p0, p1);
    }

}
