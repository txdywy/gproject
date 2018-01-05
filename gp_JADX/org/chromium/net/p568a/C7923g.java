package org.chromium.net.p568a;

import android.annotation.SuppressLint;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.chromium.net.C7931e;
import org.chromium.net.au;
import org.chromium.net.av;
import org.chromium.net.ay;

public class C7923g extends HttpURLConnection {
    public final C7931e f40628a;
    public final C7926k f40629b = new C7926k();
    public au f40630c;
    public final List f40631d = new ArrayList();
    public C7925i f40632e = new C7925i(this);
    public C7916j f40633f;
    public ay f40634g;
    public IOException f40635h;
    public boolean f40636i;
    public boolean f40637j;
    public List f40638k;
    public Map f40639l;

    public C7923g(URL url, C7931e c7931e) {
        super(url);
        this.f40628a = c7931e;
    }

    public void connect() {
        getOutputStream();
        m37903b();
    }

    public void disconnect() {
        if (this.connected) {
            this.f40630c.mo6599c();
        }
    }

    public String getResponseMessage() {
        m37905c();
        return this.f40634g.mo6628b();
    }

    public int getResponseCode() {
        m37905c();
        return this.f40634g.mo6627a();
    }

    public Map getHeaderFields() {
        try {
            m37905c();
            return m37908e();
        } catch (IOException e) {
            return Collections.emptyMap();
        }
    }

    public final String getHeaderField(String str) {
        try {
            m37905c();
            Map e = m37908e();
            if (!e.containsKey(str)) {
                return null;
            }
            List list = (List) e.get(str);
            return (String) list.get(list.size() - 1);
        } catch (IOException e2) {
            return null;
        }
    }

    public final String getHeaderFieldKey(int i) {
        Entry a = m37901a(i);
        if (a == null) {
            return null;
        }
        return (String) a.getKey();
    }

    public final String getHeaderField(int i) {
        Entry a = m37901a(i);
        if (a == null) {
            return null;
        }
        return (String) a.getValue();
    }

    public InputStream getInputStream() {
        m37905c();
        if (!this.instanceFollowRedirects && this.f40636i) {
            throw new IOException("Cannot read response body of a redirect.");
        } else if (this.f40634g.mo6627a() < 400) {
            return this.f40632e;
        } else {
            throw new FileNotFoundException(this.url.toString());
        }
    }

    public OutputStream getOutputStream() {
        if (this.f40633f == null && this.doOutput) {
            if (this.connected) {
                throw new ProtocolException("Cannot write to OutputStream after receiving response.");
            } else if (m37907d()) {
                this.f40633f = new C7919c(this, this.chunkLength, this.f40629b);
                m37903b();
            } else {
                long a = m37898a();
                if (a != -1) {
                    this.f40633f = new C7921e(this, a, this.f40629b);
                    m37903b();
                } else {
                    String requestProperty = getRequestProperty("Content-Length");
                    if (requestProperty == null) {
                        this.f40633f = new C7917a(this);
                    } else {
                        this.f40633f = new C7917a(this, Long.parseLong(requestProperty));
                    }
                }
            }
        }
        return this.f40633f;
    }

    @SuppressLint({"NewApi"})
    private final long m37898a() {
        long j = (long) this.fixedContentLength;
        try {
            long j2 = getClass().getField("fixedContentLengthLong").getLong(this);
            if (j2 != -1) {
                return j2;
            }
        } catch (NoSuchFieldException e) {
        } catch (IllegalAccessException e2) {
        }
        return j;
    }

    private final void m37903b() {
        if (!this.connected) {
            av a = this.f40628a.mo6600a(getURL().toString(), new C7924h(this), this.f40629b);
            if (this.doOutput) {
                if (this.method.equals("GET")) {
                    this.method = "POST";
                }
                if (this.f40633f != null) {
                    a.mo6619b(this.f40633f.mo6575c(), this.f40629b);
                    if (getRequestProperty("Content-Length") == null && !m37907d()) {
                        addRequestProperty("Content-Length", Long.toString(this.f40633f.mo6575c().mo6576a()));
                    }
                    this.f40633f.mo6573a();
                } else if (getRequestProperty("Content-Length") == null) {
                    addRequestProperty("Content-Length", "0");
                }
                if (getRequestProperty("Content-Type") == null) {
                    addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                }
            }
            for (Pair pair : this.f40631d) {
                a.mo6618b((String) pair.first, (String) pair.second);
            }
            if (!getUseCaches()) {
                a.mo6621d();
            }
            a.mo6617b(this.method);
            this.connected = true;
            this.f40630c = a.mo6620c();
            this.f40630c.mo6593a();
        }
    }

    public InputStream getErrorStream() {
        try {
            m37905c();
            if (this.f40634g.mo6627a() >= 400) {
                return this.f40632e;
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    public final void addRequestProperty(String str, String str2) {
        m37902a(str, str2, false);
    }

    public final void setRequestProperty(String str, String str2) {
        m37902a(str, str2, true);
    }

    private final void m37902a(String str, String str2, boolean z) {
        if (this.connected) {
            throw new IllegalStateException("Cannot modify request property after connection is made.");
        }
        int a = m37897a(str);
        if (a >= 0) {
            if (z) {
                this.f40631d.remove(a);
            } else {
                throw new UnsupportedOperationException("Cannot add multiple headers of the same key, " + str + ". crbug.com/432719.");
            }
        }
        this.f40631d.add(Pair.create(str, str2));
    }

    public Map getRequestProperties() {
        if (this.connected) {
            throw new IllegalStateException("Cannot access request headers after connection is set.");
        }
        Map treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Pair pair : this.f40631d) {
            if (treeMap.containsKey(pair.first)) {
                throw new IllegalStateException("Should not have multiple values.");
            }
            List arrayList = new ArrayList();
            arrayList.add((String) pair.second);
            treeMap.put((String) pair.first, Collections.unmodifiableList(arrayList));
        }
        return Collections.unmodifiableMap(treeMap);
    }

    public String getRequestProperty(String str) {
        int a = m37897a(str);
        if (a >= 0) {
            return (String) ((Pair) this.f40631d.get(a)).second;
        }
        return null;
    }

    public boolean usingProxy() {
        return false;
    }

    public void setConnectTimeout(int i) {
    }

    private final int m37897a(String str) {
        for (int i = 0; i < this.f40631d.size(); i++) {
            if (((String) ((Pair) this.f40631d.get(i)).first).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    private final void m37905c() {
        if (this.f40633f != null) {
            this.f40633f.mo6574b();
            if (m37907d()) {
                this.f40633f.close();
            }
        }
        if (!this.f40637j) {
            m37903b();
            this.f40629b.m37926a(0);
        }
        if (!this.f40637j) {
            throw new IllegalStateException("No response.");
        } else if (this.f40635h != null) {
            throw this.f40635h;
        } else if (this.f40634g == null) {
            throw new NullPointerException("Response info is null when there is no exception.");
        }
    }

    private final Entry m37901a(int i) {
        try {
            m37905c();
            List f = m37909f();
            if (i >= f.size()) {
                return null;
            }
            return (Entry) f.get(i);
        } catch (IOException e) {
            return null;
        }
    }

    private final boolean m37907d() {
        return this.chunkLength > 0;
    }

    private final Map m37908e() {
        if (this.f40639l != null) {
            return this.f40639l;
        }
        Map treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (Entry entry : m37909f()) {
            List arrayList = new ArrayList();
            if (treeMap.containsKey(entry.getKey())) {
                arrayList.addAll((Collection) treeMap.get(entry.getKey()));
            }
            arrayList.add((String) entry.getValue());
            treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
        }
        this.f40639l = Collections.unmodifiableMap(treeMap);
        return this.f40639l;
    }

    private final List m37909f() {
        if (this.f40638k != null) {
            return this.f40638k;
        }
        this.f40638k = new ArrayList();
        for (Entry entry : this.f40634g.mo6629c()) {
            if (!((String) entry.getKey()).equalsIgnoreCase("Content-Encoding")) {
                this.f40638k.add(new SimpleImmutableEntry(entry));
            }
        }
        this.f40638k = Collections.unmodifiableList(this.f40638k);
        return this.f40638k;
    }

    static {
        C7923g.class.getSimpleName();
    }
}
