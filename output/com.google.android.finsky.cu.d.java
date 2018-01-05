package com.google.android.finsky.cu;

import android.media.AudioManager;
import android.media.AudioManager$OnAudioFocusChangeListener;
import android.media.MediaPlayer$OnCompletionListener;
import android.media.MediaPlayer$OnPreparedListener;
import android.net.Uri;
import android.net.Uri$Builder;
import com.android.volley.a.z;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.w;
import com.android.volley.x;
import com.google.android.finsky.api.x;
import com.google.android.finsky.cv.a.jw;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.bb;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public final class com.google.android.finsky.cu.d
{

    public final com.google.android.finsky.cu.l a;
    public final com.google.android.finsky.cu.a b;
    public final Queue c;
    public final List d;
    public com.google.android.finsky.cv.a.jw e;
    public com.android.volley.r f;
    public com.android.volley.a.z g;
    public AudioManager h;
    public int i;
    public final com.android.volley.w j;
    public final com.android.volley.x k;
    public final AudioManager$OnAudioFocusChangeListener l;
    public final MediaPlayer$OnPreparedListener m;
    public final MediaPlayer$OnCompletionListener n;

    d() {
        this.a = new com.google.android.finsky.cu.e(this);
        this.b = new com.google.android.finsky.cu.a(this.a);
        this.c = new LinkedList();
        this.d = new ArrayList();
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = -1;
        this.j = new com.google.android.finsky.cu.f(this);
        this.k = new com.google.android.finsky.cu.g(this);
        this.l = new com.google.android.finsky.cu.h(this);
        this.m = new com.google.android.finsky.cu.i(this);
        this.n = new com.google.android.finsky.cu.j(this);
    }

    static String a(String p0) {
        v3 = new ArrayList(URLEncodedUtils.parse(URI.create(p0), "UTF-8"));
        v1 = 0;
        while (true) {
            if (v1 >= v3.size()) {
                v0 = 0;
                if (v0 != 0)
                    v3.remove(v0);
                v3.add(new BasicNameValuePair("mode", "streaming"));
                return Uri.parse(p0).buildUpon().encodedQuery(URLEncodedUtils.format(v3, "UTF-8")).build().toString();
            }
            v0 = (NameValuePair)v3.get(v1);
            if ("mode".equals(v0.getName()))
                break;
            v1 = v1 + 1;
        }
        if (v0 != 0)
            v3.remove(v0);
        v3.add(new BasicNameValuePair("mode", "streaming"));
        return Uri.parse(p0).buildUpon().encodedQuery(URLEncodedUtils.format(v3, "UTF-8")).build().toString();
    }

    public final void a() {
        this.a.h();
        this.b.reset();
        this.e = 0;
    }

    public final void b() {
        this.a.a(this.c.size());
    }

    public final boolean c() {
        com.google.android.finsky.utils.bb.a();
        v0 = this.c.isEmpty();
        if (v0 == 0 && this.i != 1) {
            this.h.requestAudioFocus(this.l, 3, 1);
            this.i = 1;
        }
        else if (v0 != 0 && this.i != -1) {
            this.h.abandonAudioFocus(this.l);
            this.i = -1;
        }
        this.b.a();
        if (this.c.isEmpty()) {
            this.e = 0;
            v0 = 0;
        }
        else {
            this.a.c();
            if (this.g != 0)
                this.g.f();
            this.e = (com.google.android.finsky.cv.a.jw)this.c.remove();
            this.b();
            this.g = new com.google.android.finsky.api.x(com.google.android.finsky.cu.d.a(this.e.f), this.k, this.j);
            com.google.android.finsky.m.a.a(this.f);
            this.f.a(this.g);
            this.a.f();
            v0 = 1;
        }
        return v0;
    }

}
