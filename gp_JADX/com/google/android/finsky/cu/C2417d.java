package com.google.android.finsky.cu;

import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0700r;
import com.android.volley.p060a.C0683z;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1300x;
import com.google.android.finsky.cv.p177a.jw;
import com.google.android.finsky.utils.bb;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public final class C2417d {
    public final C2418l f11726a = new C2419e(this);
    public final C2414a f11727b = new C2414a(this.f11726a);
    public final Queue f11728c = new LinkedList();
    public final List f11729d = new ArrayList();
    public jw f11730e = null;
    public C0700r f11731f = null;
    public C0683z f11732g = null;
    public AudioManager f11733h = null;
    public int f11734i = -1;
    public final C0657w f11735j = new C2420f(this);
    public final C0660x f11736k = new C2421g(this);
    public final OnAudioFocusChangeListener f11737l = new C2422h(this);
    public final OnPreparedListener f11738m = new C2423i(this);
    public final OnCompletionListener f11739n = new C2424j(this);

    public final void m12129a() {
        this.f11726a.mo2909h();
        this.f11727b.reset();
        this.f11730e = null;
    }

    public final void m12130b() {
        this.f11726a.mo2902a(this.f11728c.size());
    }

    public final boolean m12131c() {
        bb.m21791a();
        boolean isEmpty = this.f11728c.isEmpty();
        if (!isEmpty && this.f11734i != 1) {
            this.f11733h.requestAudioFocus(this.f11737l, 3, 1);
            this.f11734i = 1;
        } else if (isEmpty && this.f11734i != -1) {
            this.f11733h.abandonAudioFocus(this.f11737l);
            this.f11734i = -1;
        }
        this.f11727b.m12123a();
        if (this.f11728c.isEmpty()) {
            this.f11730e = null;
            return false;
        }
        this.f11726a.mo2904c();
        if (this.f11732g != null) {
            this.f11732g.mo1057f();
        }
        this.f11730e = (jw) this.f11728c.remove();
        m12130b();
        this.f11732g = new C1300x(C2417d.m12128a(this.f11730e.f12832f), this.f11736k, this.f11735j);
        C1473m.f7980a.mo2056a(this.f11731f);
        this.f11731f.m4510a(this.f11732g);
        this.f11726a.mo2907f();
        return true;
    }

    static String m12128a(String str) {
        Object obj;
        List arrayList = new ArrayList(URLEncodedUtils.parse(URI.create(str), "UTF-8"));
        for (int i = 0; i < arrayList.size(); i++) {
            obj = (NameValuePair) arrayList.get(i);
            if ("mode".equals(obj.getName())) {
                break;
            }
        }
        obj = null;
        if (obj != null) {
            arrayList.remove(obj);
        }
        arrayList.add(new BasicNameValuePair("mode", "streaming"));
        return Uri.parse(str).buildUpon().encodedQuery(URLEncodedUtils.format(arrayList, "UTF-8")).build().toString();
    }
}
