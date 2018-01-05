package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.util.Log;
import com.squareup.haha.perflib.HprofParser;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;

public final class cy extends DefaultHandler2 {
    public C0722q f4463a = null;
    public bi f4464b = null;
    public boolean f4465c = false;
    public int f4466d;
    public boolean f4467e = false;
    public StringBuilder f4468f = null;
    public boolean f4469g = false;
    public StringBuilder f4470h = null;

    protected final C0722q m4747a(InputStream inputStream) {
        InputStream inputStream2;
        InputStream gZIPInputStream;
        SAXParserFactory newInstance;
        if (inputStream.markSupported()) {
            inputStream2 = inputStream;
        } else {
            inputStream2 = new BufferedInputStream(inputStream);
        }
        try {
            inputStream2.mark(3);
            int read = inputStream2.read() + (inputStream2.read() << 8);
            inputStream2.reset();
            if (read == 35615) {
                gZIPInputStream = new GZIPInputStream(inputStream2);
                newInstance = SAXParserFactory.newInstance();
                newInstance.setNamespaceAware(true);
                XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
                xMLReader.setContentHandler(this);
                xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", this);
                xMLReader.parse(new InputSource(gZIPInputStream));
                try {
                    gZIPInputStream.close();
                } catch (IOException e) {
                    Log.e("SVGParser", "Exception thrown closing input stream");
                }
                return this.f4463a;
            }
        } catch (IOException e2) {
        }
        gZIPInputStream = inputStream2;
        newInstance = SAXParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        try {
            XMLReader xMLReader2 = newInstance.newSAXParser().getXMLReader();
            xMLReader2.setContentHandler(this);
            xMLReader2.setProperty("http://xml.org/sax/properties/lexical-handler", this);
            xMLReader2.parse(new InputSource(gZIPInputStream));
            gZIPInputStream.close();
            return this.f4463a;
        } catch (Throwable e3) {
            throw new SVGParseException("File error", e3);
        } catch (Throwable e32) {
            throw new SVGParseException("XML Parser problem", e32);
        } catch (Throwable e322) {
            String str = "SVG parse error: ";
            String valueOf = String.valueOf(e322.getMessage());
            throw new SVGParseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e322);
        } catch (Throwable th) {
            try {
                gZIPInputStream.close();
            } catch (IOException e4) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public final void startDocument() {
        this.f4463a = new C0722q();
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        if (this.f4465c) {
            this.f4466d++;
        } else if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            bf acVar;
            ap aqVar;
            bq bsVar;
            switch (de.m4770a(str2).ordinal()) {
                case 0:
                    bq beVar = new be();
                    beVar.t = this.f4463a;
                    beVar.u = this.f4464b;
                    m4717a((bk) beVar, attributes);
                    m4733b((bk) beVar, attributes);
                    m4716a((bf) beVar, attributes);
                    m4721a(beVar, attributes);
                    for (int i = 0; i < attributes.getLength(); i++) {
                        String trim = attributes.getValue(i).trim();
                        switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                            case 25:
                                beVar.f4350d = m4734c(trim);
                                if (!beVar.f4350d.m4575b()) {
                                    break;
                                }
                                throw new SAXException("Invalid <svg> element. height cannot be negative");
                            case 81:
                                beVar.f4349c = m4734c(trim);
                                if (!beVar.f4349c.m4575b()) {
                                    break;
                                }
                                throw new SAXException("Invalid <svg> element. width cannot be negative");
                            case 82:
                                beVar.f4347a = m4734c(trim);
                                break;
                            case 83:
                                beVar.f4348b = m4734c(trim);
                                break;
                            default:
                                break;
                        }
                    }
                    if (this.f4464b == null) {
                        this.f4463a.f4614b = beVar;
                    } else {
                        this.f4464b.mo1096a(beVar);
                    }
                    this.f4464b = beVar;
                    return;
                case 1:
                case 7:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    acVar = new ac();
                    acVar.t = this.f4463a;
                    acVar.u = this.f4464b;
                    m4717a((bk) acVar, attributes);
                    m4733b((bk) acVar, attributes);
                    m4704a((ad) acVar, attributes);
                    m4716a(acVar, attributes);
                    this.f4464b.mo1096a(acVar);
                    this.f4464b = acVar;
                    return;
                case 2:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    C0725t c0725t = new C0725t();
                    c0725t.t = this.f4463a;
                    c0725t.u = this.f4464b;
                    m4717a((bk) c0725t, attributes);
                    m4733b((bk) c0725t, attributes);
                    m4704a((ad) c0725t, attributes);
                    m4716a((bf) c0725t, attributes);
                    m4726a(c0725t, attributes);
                    this.f4464b.mo1096a(c0725t);
                    return;
                case 3:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    C0726u c0726u = new C0726u();
                    c0726u.t = this.f4463a;
                    c0726u.u = this.f4464b;
                    m4717a((bk) c0726u, attributes);
                    m4733b((bk) c0726u, attributes);
                    m4704a((ad) c0726u, attributes);
                    m4716a((bf) c0726u, attributes);
                    m4727a(c0726u, attributes);
                    this.f4464b.mo1096a(c0726u);
                    this.f4464b = c0726u;
                    return;
                case 4:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ad c0729x = new C0729x();
                    c0729x.t = this.f4463a;
                    c0729x.u = this.f4464b;
                    m4717a((bk) c0729x, attributes);
                    m4733b((bk) c0729x, attributes);
                    m4704a(c0729x, attributes);
                    this.f4464b.mo1096a(c0729x);
                    this.f4464b = c0729x;
                    return;
                case 5:
                case 26:
                    this.f4467e = true;
                    return;
                case 6:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    C0730y c0730y = new C0730y();
                    c0730y.t = this.f4463a;
                    c0730y.u = this.f4464b;
                    m4717a((bk) c0730y, attributes);
                    m4733b((bk) c0730y, attributes);
                    m4704a((ad) c0730y, attributes);
                    m4716a((bf) c0730y, attributes);
                    m4728a(c0730y, attributes);
                    this.f4464b.mo1096a(c0730y);
                    return;
                case 8:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ae aeVar = new ae();
                    aeVar.t = this.f4463a;
                    aeVar.u = this.f4464b;
                    m4717a((bk) aeVar, attributes);
                    m4733b((bk) aeVar, attributes);
                    m4704a((ad) aeVar, attributes);
                    m4716a((bf) aeVar, attributes);
                    m4705a(aeVar, attributes);
                    this.f4464b.mo1096a(aeVar);
                    this.f4464b = aeVar;
                    return;
                case 9:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ag agVar = new ag();
                    agVar.t = this.f4463a;
                    agVar.u = this.f4464b;
                    m4717a((bk) agVar, attributes);
                    m4733b((bk) agVar, attributes);
                    m4704a((ad) agVar, attributes);
                    m4716a((bf) agVar, attributes);
                    m4706a(agVar, attributes);
                    this.f4464b.mo1096a(agVar);
                    return;
                case 10:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    bl blVar = new bl();
                    blVar.t = this.f4463a;
                    blVar.u = this.f4464b;
                    m4717a((bk) blVar, attributes);
                    m4733b((bk) blVar, attributes);
                    m4729a((C0707z) blVar, attributes);
                    m4718a(blVar, attributes);
                    this.f4464b.mo1096a(blVar);
                    this.f4464b = blVar;
                    return;
                case 11:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ah ahVar = new ah();
                    ahVar.t = this.f4463a;
                    ahVar.u = this.f4464b;
                    m4717a((bk) ahVar, attributes);
                    m4733b((bk) ahVar, attributes);
                    m4716a((bf) ahVar, attributes);
                    m4721a((bq) ahVar, attributes);
                    m4707a(ahVar, attributes);
                    this.f4464b.mo1096a(ahVar);
                    this.f4464b = ahVar;
                    return;
                case 12:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ai aiVar = new ai();
                    aiVar.t = this.f4463a;
                    aiVar.u = this.f4464b;
                    m4717a((bk) aiVar, attributes);
                    m4733b((bk) aiVar, attributes);
                    m4716a((bf) aiVar, attributes);
                    m4708a(aiVar, attributes);
                    this.f4464b.mo1096a(aiVar);
                    this.f4464b = aiVar;
                    return;
                case 13:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    al alVar = new al();
                    alVar.t = this.f4463a;
                    alVar.u = this.f4464b;
                    m4717a((bk) alVar, attributes);
                    m4733b((bk) alVar, attributes);
                    m4704a((ad) alVar, attributes);
                    m4716a((bf) alVar, attributes);
                    m4709a(alVar, attributes);
                    this.f4464b.mo1096a(alVar);
                    return;
                case 14:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ao aoVar = new ao();
                    aoVar.t = this.f4463a;
                    aoVar.u = this.f4464b;
                    m4717a((bk) aoVar, attributes);
                    m4733b((bk) aoVar, attributes);
                    m4716a((bf) aoVar, attributes);
                    m4721a((bq) aoVar, attributes);
                    m4710a(aoVar, attributes);
                    this.f4464b.mo1096a(aoVar);
                    this.f4464b = aoVar;
                    return;
                case 15:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    aqVar = new aq();
                    aqVar.t = this.f4463a;
                    aqVar.u = this.f4464b;
                    m4717a((bk) aqVar, attributes);
                    m4733b((bk) aqVar, attributes);
                    m4704a((ad) aqVar, attributes);
                    m4716a((bf) aqVar, attributes);
                    m4711a(aqVar, attributes, "polygon");
                    this.f4464b.mo1096a(aqVar);
                    return;
                case 16:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    aqVar = new ap();
                    aqVar.t = this.f4463a;
                    aqVar.u = this.f4464b;
                    m4717a((bk) aqVar, attributes);
                    m4733b((bk) aqVar, attributes);
                    m4704a((ad) aqVar, attributes);
                    m4716a((bf) aqVar, attributes);
                    m4711a(aqVar, attributes, "polyline");
                    this.f4464b.mo1096a(aqVar);
                    return;
                case 17:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    bp bpVar = new bp();
                    bpVar.t = this.f4463a;
                    bpVar.u = this.f4464b;
                    m4717a((bk) bpVar, attributes);
                    m4733b((bk) bpVar, attributes);
                    m4729a((C0707z) bpVar, attributes);
                    m4720a(bpVar, attributes);
                    this.f4464b.mo1096a(bpVar);
                    this.f4464b = bpVar;
                    return;
                case 18:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    ar arVar = new ar();
                    arVar.t = this.f4463a;
                    arVar.u = this.f4464b;
                    m4717a((bk) arVar, attributes);
                    m4733b((bk) arVar, attributes);
                    m4704a((ad) arVar, attributes);
                    m4716a((bf) arVar, attributes);
                    m4712a(arVar, attributes);
                    this.f4464b.mo1096a(arVar);
                    return;
                case 19:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    bk atVar = new at();
                    atVar.t = this.f4463a;
                    atVar.u = this.f4464b;
                    m4717a(atVar, attributes);
                    m4733b(atVar, attributes);
                    this.f4464b.mo1096a(atVar);
                    this.f4464b = atVar;
                    return;
                case 20:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    } else if (this.f4464b instanceof C0707z) {
                        au auVar = new au();
                        auVar.t = this.f4463a;
                        auVar.u = this.f4464b;
                        m4717a((bk) auVar, attributes);
                        m4733b((bk) auVar, attributes);
                        m4713a(auVar, attributes);
                        this.f4464b.mo1096a(auVar);
                        this.f4464b = auVar;
                        return;
                    } else {
                        throw new SAXException("Invalid document. <stop> elements are only valid inside <linearGradiant> or <radialGradient> elements.");
                    }
                case 21:
                    m4730a(attributes);
                    return;
                case 22:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    acVar = new br();
                    acVar.t = this.f4463a;
                    acVar.u = this.f4464b;
                    m4717a((bk) acVar, attributes);
                    m4733b((bk) acVar, attributes);
                    m4704a((ad) acVar, attributes);
                    m4716a(acVar, attributes);
                    this.f4464b.mo1096a(acVar);
                    this.f4464b = acVar;
                    return;
                case 23:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    bsVar = new bs();
                    bsVar.t = this.f4463a;
                    bsVar.u = this.f4464b;
                    m4717a((bk) bsVar, attributes);
                    m4733b((bk) bsVar, attributes);
                    m4716a((bf) bsVar, attributes);
                    m4721a(bsVar, attributes);
                    this.f4464b.mo1096a(bsVar);
                    this.f4464b = bsVar;
                    return;
                case 24:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    bz bvVar = new bv();
                    bvVar.t = this.f4463a;
                    bvVar.u = this.f4464b;
                    m4717a((bk) bvVar, attributes);
                    m4733b((bk) bvVar, attributes);
                    m4704a((ad) bvVar, attributes);
                    m4716a((bf) bvVar, attributes);
                    m4724a(bvVar, attributes);
                    this.f4464b.mo1096a(bvVar);
                    this.f4464b = bvVar;
                    return;
                case 25:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    by byVar = new by();
                    byVar.t = this.f4463a;
                    byVar.u = this.f4464b;
                    m4717a((bk) byVar, attributes);
                    m4733b((bk) byVar, attributes);
                    m4716a((bf) byVar, attributes);
                    m4723a(byVar, attributes);
                    this.f4464b.mo1096a(byVar);
                    this.f4464b = byVar;
                    if (byVar.u instanceof ca) {
                        byVar.f4375c = (ca) byVar.u;
                        return;
                    } else {
                        byVar.f4375c = ((bw) byVar.u).mo1103g();
                        return;
                    }
                case 27:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    } else if (this.f4464b instanceof bx) {
                        bt btVar = new bt();
                        btVar.t = this.f4463a;
                        btVar.u = this.f4464b;
                        m4717a((bk) btVar, attributes);
                        m4733b((bk) btVar, attributes);
                        m4716a((bf) btVar, attributes);
                        m4722a(btVar, attributes);
                        this.f4464b.mo1096a(btVar);
                        if (btVar.u instanceof ca) {
                            btVar.f4366b = (ca) btVar.u;
                            return;
                        } else {
                            btVar.f4366b = ((bw) btVar.u).mo1103g();
                            return;
                        }
                    } else {
                        throw new SAXException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                    }
                case 28:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    } else if (this.f4464b instanceof bx) {
                        bz buVar = new bu();
                        buVar.t = this.f4463a;
                        buVar.u = this.f4464b;
                        m4717a((bk) buVar, attributes);
                        m4733b((bk) buVar, attributes);
                        m4716a((bf) buVar, attributes);
                        m4724a(buVar, attributes);
                        this.f4464b.mo1096a(buVar);
                        this.f4464b = buVar;
                        if (buVar.u instanceof ca) {
                            buVar.f4371a = (ca) buVar.u;
                            return;
                        } else {
                            buVar.f4371a = ((bw) buVar.u).mo1103g();
                            return;
                        }
                    } else {
                        throw new SAXException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                    }
                case 29:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    cd cdVar = new cd();
                    cdVar.t = this.f4463a;
                    cdVar.u = this.f4464b;
                    m4717a((bk) cdVar, attributes);
                    m4733b((bk) cdVar, attributes);
                    m4704a((ad) cdVar, attributes);
                    m4716a((bf) cdVar, attributes);
                    m4725a(cdVar, attributes);
                    this.f4464b.mo1096a(cdVar);
                    this.f4464b = cdVar;
                    return;
                case 30:
                    if (this.f4464b == null) {
                        throw new SAXException("Invalid document. Root element must be <svg>");
                    }
                    bsVar = new ce();
                    bsVar.t = this.f4463a;
                    bsVar.u = this.f4464b;
                    m4717a((bk) bsVar, attributes);
                    m4716a((bf) bsVar, attributes);
                    m4721a(bsVar, attributes);
                    this.f4464b.mo1096a(bsVar);
                    this.f4464b = bsVar;
                    return;
                default:
                    this.f4465c = true;
                    this.f4466d = 1;
                    return;
            }
        }
    }

    public final void characters(char[] cArr, int i, int i2) {
        if (!this.f4465c) {
            if (this.f4467e) {
                if (this.f4468f == null) {
                    this.f4468f = new StringBuilder(i2);
                }
                this.f4468f.append(cArr, i, i2);
            } else if (this.f4469g) {
                if (this.f4470h == null) {
                    this.f4470h = new StringBuilder(i2);
                }
                this.f4470h.append(cArr, i, i2);
            } else if (this.f4464b instanceof bx) {
                bg bgVar = (bg) this.f4464b;
                int size = bgVar.f4217i.size();
                bm bmVar = size == 0 ? null : (bm) bgVar.f4217i.get(size - 1);
                if (bmVar instanceof cb) {
                    cb cbVar = (cb) bmVar;
                    String valueOf = String.valueOf(cbVar.f4381a);
                    String valueOf2 = String.valueOf(new String(cArr, i, i2));
                    cbVar.f4381a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                    return;
                }
                ((bg) this.f4464b).mo1096a(new cb(new String(cArr, i, i2)));
            }
        }
    }

    public final void comment(char[] cArr, int i, int i2) {
        if (!this.f4465c && this.f4469g) {
            if (this.f4470h == null) {
                this.f4470h = new StringBuilder(i2);
            }
            this.f4470h.append(cArr, i, i2);
        }
    }

    public final void endElement(String str, String str2, String str3) {
        if (this.f4465c) {
            int i = this.f4466d - 1;
            this.f4466d = i;
            if (i == 0) {
                this.f4465c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            switch (de.m4770a(str2).ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.f4464b = ((bm) this.f4464b).f4204u;
                    return;
                case 5:
                case 26:
                    this.f4467e = false;
                    this.f4468f.setLength(0);
                    return;
                case 21:
                    if (this.f4470h != null) {
                        this.f4469g = false;
                        String stringBuilder = this.f4470h.toString();
                        C0705a c0705a = new C0705a(C0711f.screen);
                        C0722q c0722q = this.f4463a;
                        df c0709d = new C0709d(stringBuilder);
                        c0709d.m4755c();
                        c0722q.f4617e.m4772a(c0705a.m4531a(c0709d));
                        this.f4470h.setLength(0);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    public final void endDocument() {
    }

    private static void m4725a(cd cdVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 25:
                    cdVar.f4397f = m4734c(trim);
                    if (!cdVar.f4397f.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <use> element. height cannot be negative");
                case 26:
                    if (!"http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        break;
                    }
                    cdVar.f4393a = trim;
                    break;
                case 81:
                    cdVar.f4396e = m4734c(trim);
                    if (!cdVar.f4396e.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <use> element. width cannot be negative");
                case 82:
                    cdVar.f4394c = m4734c(trim);
                    break;
                case 83:
                    cdVar.f4395d = m4734c(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static void m4705a(ae aeVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 25:
                    aeVar.f4228e = m4734c(trim);
                    if (!aeVar.f4228e.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <use> element. height cannot be negative");
                case 26:
                    if (!"http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        break;
                    }
                    aeVar.f4224a = trim;
                    break;
                case 48:
                    m4719a((bo) aeVar, trim);
                    break;
                case 81:
                    aeVar.f4227d = m4734c(trim);
                    if (!aeVar.f4227d.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <use> element. width cannot be negative");
                case 82:
                    aeVar.f4225b = m4734c(trim);
                    break;
                case 83:
                    aeVar.f4226c = m4734c(trim);
                    break;
                default:
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m4709a(com.caverock.androidsvg.al r18, org.xml.sax.Attributes r19) {
        /*
        r1 = 0;
        r9 = r1;
    L_0x0002:
        r1 = r19.getLength();
        if (r9 >= r1) goto L_0x03af;
    L_0x0008:
        r0 = r19;
        r1 = r0.getValue(r9);
        r1 = r1.trim();
        r0 = r19;
        r2 = r0.getLocalName(r9);
        r2 = com.caverock.androidsvg.dd.m4769a(r2);
        r2 = r2.ordinal();
        switch(r2) {
            case 13: goto L_0x0027;
            case 43: goto L_0x038e;
            default: goto L_0x0023;
        };
    L_0x0023:
        r1 = r9 + 1;
        r9 = r1;
        goto L_0x0002;
    L_0x0027:
        r14 = new com.caverock.androidsvg.df;
        r14.<init>(r1);
        r7 = 0;
        r6 = 0;
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r1 = new com.caverock.androidsvg.am;
        r1.<init>();
        r8 = r14.m4754b();
        if (r8 != 0) goto L_0x005d;
    L_0x003d:
        r8 = r14.m4759g();
        r8 = r8.intValue();
        r10 = 77;
        if (r8 == r10) goto L_0x004d;
    L_0x0049:
        r10 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r8 != r10) goto L_0x005d;
    L_0x004d:
        r10 = r4;
        r11 = r5;
        r12 = r8;
        r5 = r6;
        r6 = r7;
        r17 = r3;
        r3 = r2;
        r2 = r17;
    L_0x0057:
        r14.m4755c();
        switch(r12) {
            case 65: goto L_0x0313;
            case 67: goto L_0x0131;
            case 72: goto L_0x01f9;
            case 76: goto L_0x00f0;
            case 77: goto L_0x0062;
            case 81: goto L_0x027b;
            case 83: goto L_0x018e;
            case 84: goto L_0x02c7;
            case 86: goto L_0x023a;
            case 90: goto L_0x01eb;
            case 97: goto L_0x0313;
            case 99: goto L_0x0131;
            case 104: goto L_0x01f9;
            case 108: goto L_0x00f0;
            case 109: goto L_0x0062;
            case 113: goto L_0x027b;
            case 115: goto L_0x018e;
            case 116: goto L_0x02c7;
            case 118: goto L_0x023a;
            case 122: goto L_0x01eb;
            default: goto L_0x005d;
        };
    L_0x005d:
        r0 = r18;
        r0.f4251a = r1;
        goto L_0x0023;
    L_0x0062:
        r3 = r14.m4757e();
        r2 = r14.m4749a(r3);
        r4 = java.lang.Float.isNaN(r2);
        if (r4 == 0) goto L_0x0092;
    L_0x0070:
        r2 = "SVGParser";
        r3 = (char) r12;
        r4 = 34;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Bad path coords for ";
        r4 = r5.append(r4);
        r3 = r4.append(r3);
        r4 = " path segment";
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.e(r2, r3);
        goto L_0x005d;
    L_0x0092:
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r12 != r4) goto L_0x009f;
    L_0x0096:
        r4 = r1.f4254b;
        if (r4 != 0) goto L_0x00eb;
    L_0x009a:
        r4 = 1;
    L_0x009b:
        if (r4 != 0) goto L_0x009f;
    L_0x009d:
        r3 = r3 + r6;
        r2 = r2 + r5;
    L_0x009f:
        r1.mo1098a(r3, r2);
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        if (r12 != r4) goto L_0x00ed;
    L_0x00a6:
        r4 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
    L_0x00a8:
        r5 = r3;
        r6 = r2;
        r7 = r3;
        r8 = r4;
        r4 = r2;
    L_0x00ad:
        r14.m4756d();
        r10 = r14.m4754b();
        if (r10 != 0) goto L_0x005d;
    L_0x00b6:
        r10 = r14.f4473b;
        r11 = r14.f4474c;
        if (r10 == r11) goto L_0x038b;
    L_0x00bc:
        r10 = r14.f4472a;
        r11 = r14.f4473b;
        r10 = r10.charAt(r11);
        r11 = 97;
        if (r10 < r11) goto L_0x00cc;
    L_0x00c8:
        r11 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r10 <= r11) goto L_0x00d4;
    L_0x00cc:
        r11 = 65;
        if (r10 < r11) goto L_0x038b;
    L_0x00d0:
        r11 = 90;
        if (r10 > r11) goto L_0x038b;
    L_0x00d4:
        r10 = 1;
    L_0x00d5:
        if (r10 == 0) goto L_0x004d;
    L_0x00d7:
        r8 = r14.m4759g();
        r8 = r8.intValue();
        r10 = r4;
        r11 = r5;
        r12 = r8;
        r5 = r6;
        r6 = r7;
        r17 = r3;
        r3 = r2;
        r2 = r17;
        goto L_0x0057;
    L_0x00eb:
        r4 = 0;
        goto L_0x009b;
    L_0x00ed:
        r4 = 76;
        goto L_0x00a8;
    L_0x00f0:
        r3 = r14.m4757e();
        r2 = r14.m4749a(r3);
        r4 = java.lang.Float.isNaN(r2);
        if (r4 == 0) goto L_0x0121;
    L_0x00fe:
        r2 = "SVGParser";
        r3 = (char) r12;
        r4 = 34;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Bad path coords for ";
        r4 = r5.append(r4);
        r3 = r4.append(r3);
        r4 = " path segment";
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.e(r2, r3);
        goto L_0x005d;
    L_0x0121:
        r4 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        if (r12 != r4) goto L_0x0127;
    L_0x0125:
        r3 = r3 + r6;
        r2 = r2 + r5;
    L_0x0127:
        r1.mo1102b(r3, r2);
        r4 = r10;
        r5 = r11;
        r6 = r2;
        r7 = r3;
        r8 = r12;
        goto L_0x00ad;
    L_0x0131:
        r7 = r14.m4757e();
        r3 = r14.m4749a(r7);
        r4 = r14.m4749a(r3);
        r2 = r14.m4749a(r4);
        r13 = r14.m4749a(r2);
        r8 = r14.m4749a(r13);
        r15 = java.lang.Float.isNaN(r8);
        if (r15 == 0) goto L_0x0172;
    L_0x014f:
        r2 = "SVGParser";
        r3 = (char) r12;
        r4 = 34;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Bad path coords for ";
        r4 = r5.append(r4);
        r3 = r4.append(r3);
        r4 = " path segment";
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.e(r2, r3);
        goto L_0x005d;
    L_0x0172:
        r15 = 99;
        if (r12 != r15) goto L_0x03bf;
    L_0x0176:
        r13 = r13 + r6;
        r8 = r8 + r5;
        r7 = r7 + r6;
        r3 = r3 + r5;
        r4 = r4 + r6;
        r5 = r5 + r2;
        r2 = r7;
        r6 = r13;
        r7 = r8;
    L_0x017f:
        r1.mo1100a(r2, r3, r4, r5, r6, r7);
        r2 = r5;
        r3 = r4;
        r8 = r12;
        r5 = r11;
        r4 = r10;
        r17 = r6;
        r6 = r7;
        r7 = r17;
        goto L_0x00ad;
    L_0x018e:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = r4 * r6;
        r2 = r4 - r2;
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = r4 * r5;
        r3 = r4 - r3;
        r7 = r14.m4757e();
        r4 = r14.m4749a(r7);
        r13 = r14.m4749a(r4);
        r8 = r14.m4749a(r13);
        r15 = java.lang.Float.isNaN(r8);
        if (r15 == 0) goto L_0x01d1;
    L_0x01ae:
        r2 = "SVGParser";
        r3 = (char) r12;
        r4 = 34;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Bad path coords for ";
        r4 = r5.append(r4);
        r3 = r4.append(r3);
        r4 = " path segment";
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.e(r2, r3);
        goto L_0x005d;
    L_0x01d1:
        r15 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        if (r12 != r15) goto L_0x03b9;
    L_0x01d5:
        r13 = r13 + r6;
        r8 = r8 + r5;
        r6 = r6 + r7;
        r5 = r5 + r4;
        r4 = r6;
        r7 = r8;
        r6 = r13;
    L_0x01dc:
        r1.mo1100a(r2, r3, r4, r5, r6, r7);
        r2 = r5;
        r3 = r4;
        r8 = r12;
        r5 = r11;
        r4 = r10;
        r17 = r6;
        r6 = r7;
        r7 = r17;
        goto L_0x00ad;
    L_0x01eb:
        r2 = 8;
        r1.m4585a(r2);
        r2 = r10;
        r3 = r11;
        r4 = r10;
        r5 = r11;
        r6 = r10;
        r7 = r11;
        r8 = r12;
        goto L_0x00ad;
    L_0x01f9:
        r2 = r14.m4757e();
        r4 = java.lang.Float.isNaN(r2);
        if (r4 == 0) goto L_0x0226;
    L_0x0203:
        r2 = "SVGParser";
        r3 = (char) r12;
        r4 = 34;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Bad path coords for ";
        r4 = r5.append(r4);
        r3 = r4.append(r3);
        r4 = " path segment";
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.e(r2, r3);
        goto L_0x005d;
    L_0x0226:
        r4 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        if (r12 != r4) goto L_0x022b;
    L_0x022a:
        r2 = r2 + r6;
    L_0x022b:
        r1.mo1102b(r2, r5);
        r4 = r10;
        r6 = r5;
        r7 = r2;
        r8 = r12;
        r5 = r11;
        r17 = r3;
        r3 = r2;
        r2 = r17;
        goto L_0x00ad;
    L_0x023a:
        r3 = r14.m4757e();
        r4 = java.lang.Float.isNaN(r3);
        if (r4 == 0) goto L_0x0267;
    L_0x0244:
        r2 = "SVGParser";
        r3 = (char) r12;
        r4 = 34;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Bad path coords for ";
        r4 = r5.append(r4);
        r3 = r4.append(r3);
        r4 = " path segment";
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.e(r2, r3);
        goto L_0x005d;
    L_0x0267:
        r4 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        if (r12 != r4) goto L_0x026c;
    L_0x026b:
        r3 = r3 + r5;
    L_0x026c:
        r1.mo1102b(r6, r3);
        r4 = r10;
        r5 = r11;
        r7 = r6;
        r8 = r12;
        r6 = r3;
        r17 = r3;
        r3 = r2;
        r2 = r17;
        goto L_0x00ad;
    L_0x027b:
        r3 = r14.m4757e();
        r2 = r14.m4749a(r3);
        r7 = r14.m4749a(r2);
        r4 = r14.m4749a(r7);
        r8 = java.lang.Float.isNaN(r4);
        if (r8 == 0) goto L_0x02b4;
    L_0x0291:
        r2 = "SVGParser";
        r3 = (char) r12;
        r4 = 34;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Bad path coords for ";
        r4 = r5.append(r4);
        r3 = r4.append(r3);
        r4 = " path segment";
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.e(r2, r3);
        goto L_0x005d;
    L_0x02b4:
        r8 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        if (r12 != r8) goto L_0x03b6;
    L_0x02b8:
        r7 = r7 + r6;
        r4 = r4 + r5;
        r3 = r3 + r6;
        r2 = r2 + r5;
        r5 = r7;
    L_0x02bd:
        r1.mo1099a(r3, r2, r5, r4);
        r6 = r4;
        r7 = r5;
        r8 = r12;
        r5 = r11;
        r4 = r10;
        goto L_0x00ad;
    L_0x02c7:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = r4 * r6;
        r4 = r4 - r2;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 * r5;
        r8 = r2 - r3;
        r3 = r14.m4757e();
        r2 = r14.m4749a(r3);
        r7 = java.lang.Float.isNaN(r2);
        if (r7 == 0) goto L_0x0301;
    L_0x02de:
        r2 = "SVGParser";
        r3 = (char) r12;
        r4 = 34;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Bad path coords for ";
        r4 = r5.append(r4);
        r3 = r4.append(r3);
        r4 = " path segment";
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.e(r2, r3);
        goto L_0x005d;
    L_0x0301:
        r7 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        if (r12 != r7) goto L_0x0307;
    L_0x0305:
        r3 = r3 + r6;
        r2 = r2 + r5;
    L_0x0307:
        r1.mo1099a(r4, r8, r3, r2);
        r5 = r11;
        r6 = r2;
        r7 = r3;
        r2 = r8;
        r3 = r4;
        r4 = r10;
        r8 = r12;
        goto L_0x00ad;
    L_0x0313:
        r2 = r14.m4757e();
        r3 = r14.m4749a(r2);
        r4 = r14.m4749a(r3);
        r7 = java.lang.Float.valueOf(r4);
        r13 = r14.m4750a(r7);
        r15 = r14.m4750a(r13);
        if (r15 != 0) goto L_0x0365;
    L_0x032d:
        r7 = 2143289344; // 0x7fc00000 float:NaN double:1.058925634E-314;
        r8 = r7;
    L_0x0330:
        r16 = java.lang.Float.isNaN(r7);
        if (r16 != 0) goto L_0x0342;
    L_0x0336:
        r16 = 0;
        r16 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r16 < 0) goto L_0x0342;
    L_0x033c:
        r16 = 0;
        r16 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1));
        if (r16 >= 0) goto L_0x036e;
    L_0x0342:
        r2 = "SVGParser";
        r3 = (char) r12;
        r4 = 34;
        r5 = new java.lang.StringBuilder;
        r5.<init>(r4);
        r4 = "Bad path coords for ";
        r4 = r5.append(r4);
        r3 = r4.append(r3);
        r4 = " path segment";
        r3 = r3.append(r4);
        r3 = r3.toString();
        android.util.Log.e(r2, r3);
        goto L_0x005d;
    L_0x0365:
        r8 = r14.m4758f();
        r7 = r14.m4749a(r8);
        goto L_0x0330;
    L_0x036e:
        r16 = 97;
        r0 = r16;
        if (r12 != r0) goto L_0x03b0;
    L_0x0374:
        r6 = r6 + r8;
        r8 = r7 + r5;
        r7 = r6;
    L_0x0378:
        r5 = r13.booleanValue();
        r6 = r15.booleanValue();
        r1.mo1101a(r2, r3, r4, r5, r6, r7, r8);
        r2 = r8;
        r3 = r7;
        r4 = r10;
        r5 = r11;
        r6 = r8;
        r8 = r12;
        goto L_0x00ad;
    L_0x038b:
        r10 = 0;
        goto L_0x00d5;
    L_0x038e:
        r1 = m4736e(r1);
        r1 = java.lang.Float.valueOf(r1);
        r0 = r18;
        r0.f4252b = r1;
        r0 = r18;
        r1 = r0.f4252b;
        r1 = r1.floatValue();
        r2 = 0;
        r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1));
        if (r1 >= 0) goto L_0x0023;
    L_0x03a7:
        r1 = new org.xml.sax.SAXException;
        r2 = "Invalid <path> element. pathLength cannot be negative";
        r1.<init>(r2);
        throw r1;
    L_0x03af:
        return;
    L_0x03b0:
        r17 = r7;
        r7 = r8;
        r8 = r17;
        goto L_0x0378;
    L_0x03b6:
        r5 = r7;
        goto L_0x02bd;
    L_0x03b9:
        r5 = r4;
        r6 = r13;
        r4 = r7;
        r7 = r8;
        goto L_0x01dc;
    L_0x03bf:
        r5 = r2;
        r6 = r13;
        r2 = r7;
        r7 = r8;
        goto L_0x017f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.cy.a(com.caverock.androidsvg.al, org.xml.sax.Attributes):void");
    }

    private static void m4712a(ar arVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 25:
                    arVar.f4269d = m4734c(trim);
                    if (!arVar.f4269d.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <rect> element. height cannot be negative");
                case 56:
                    arVar.f4270f = m4734c(trim);
                    if (!arVar.f4270f.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <rect> element. rx cannot be negative");
                case 57:
                    arVar.f4271g = m4734c(trim);
                    if (!arVar.f4271g.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <rect> element. ry cannot be negative");
                case 81:
                    arVar.f4268c = m4734c(trim);
                    if (!arVar.f4268c.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <rect> element. width cannot be negative");
                case 82:
                    arVar.f4266a = m4734c(trim);
                    break;
                case 83:
                    arVar.f4267b = m4734c(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static void m4726a(C0725t c0725t, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 6:
                    c0725t.f4628a = m4734c(trim);
                    break;
                case 7:
                    c0725t.f4629b = m4734c(trim);
                    break;
                case 49:
                    c0725t.f4630c = m4734c(trim);
                    if (!c0725t.f4630c.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <circle> element. r cannot be negative");
                default:
                    break;
            }
        }
    }

    private static void m4728a(C0730y c0730y, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 6:
                    c0730y.f4635a = m4734c(trim);
                    break;
                case 7:
                    c0730y.f4636b = m4734c(trim);
                    break;
                case 56:
                    c0730y.f4637c = m4734c(trim);
                    if (!c0730y.f4637c.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <ellipse> element. rx cannot be negative");
                case 57:
                    c0730y.f4638d = m4734c(trim);
                    if (!c0730y.f4638d.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <ellipse> element. ry cannot be negative");
                default:
                    break;
            }
        }
    }

    private static void m4706a(ag agVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 84:
                    agVar.f4232a = m4734c(trim);
                    break;
                case 85:
                    agVar.f4233b = m4734c(trim);
                    break;
                case 86:
                    agVar.f4234c = m4734c(trim);
                    break;
                case 87:
                    agVar.f4235d = m4734c(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static void m4711a(ap apVar, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (dd.m4769a(attributes.getLocalName(i)) == dd.points) {
                df dfVar = new df(attributes.getValue(i));
                List arrayList = new ArrayList();
                dfVar.m4755c();
                while (!dfVar.m4754b()) {
                    float e = dfVar.m4757e();
                    if (Float.isNaN(e)) {
                        throw new SAXException(new StringBuilder(String.valueOf(str).length() + 66).append("Invalid <").append(str).append("> points attribute. Non-coordinate content found in list.").toString());
                    }
                    dfVar.m4756d();
                    float e2 = dfVar.m4757e();
                    if (Float.isNaN(e2)) {
                        throw new SAXException(new StringBuilder(String.valueOf(str).length() + 75).append("Invalid <").append(str).append("> points attribute. There should be an even number of coordinates.").toString());
                    }
                    dfVar.m4756d();
                    arrayList.add(Float.valueOf(e));
                    arrayList.add(Float.valueOf(e2));
                }
                apVar.f4265a = new float[arrayList.size()];
                ArrayList arrayList2 = (ArrayList) arrayList;
                int size = arrayList2.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    float floatValue = ((Float) obj).floatValue();
                    int i4 = i3 + 1;
                    apVar.f4265a[i3] = floatValue;
                    i3 = i4;
                }
            }
        }
    }

    private static void m4724a(bz bzVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 9:
                    bzVar.f4369d = m4735d(trim);
                    break;
                case 10:
                    bzVar.f4370e = m4735d(trim);
                    break;
                case 82:
                    bzVar.f4367b = m4735d(trim);
                    break;
                case 83:
                    bzVar.f4368c = m4735d(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static void m4722a(bt btVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 26:
                    if (!"http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        break;
                    }
                    btVar.f4365a = trim;
                    break;
                default:
                    break;
            }
        }
    }

    private static void m4716a(bf bfVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 52:
                    df dfVar = new df(trim);
                    Set hashSet = new HashSet();
                    while (!dfVar.m4754b()) {
                        String b = dfVar.m4753b(' ');
                        if (b.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            hashSet.add(b.substring(35));
                        } else {
                            hashSet.add("UNSUPPORTED");
                        }
                        dfVar.m4755c();
                    }
                    bfVar.mo1085a(hashSet);
                    break;
                case 53:
                    bfVar.mo1084a(trim);
                    break;
                case 54:
                    bfVar.mo1089c(m4746o(trim));
                    break;
                case 55:
                    Collection i2 = m4740i(trim);
                    bfVar.mo1091d(i2 != null ? new HashSet(i2) : new HashSet(0));
                    break;
                case 73:
                    bfVar.mo1087b(m4745n(trim));
                    break;
                default:
                    break;
            }
        }
    }

    private static void m4707a(ah ahVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 32:
                    ahVar.f4241e = m4734c(trim);
                    if (!ahVar.f4241e.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <marker> element. markerHeight cannot be negative");
                case 33:
                    if ("strokeWidth".equals(trim)) {
                        ahVar.f4237a = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        ahVar.f4237a = true;
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute markerUnits");
                    }
                case 34:
                    ahVar.f4240d = m4734c(trim);
                    if (!ahVar.f4240d.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <marker> element. markerWidth cannot be negative");
                case 41:
                    if (!"auto".equals(trim)) {
                        ahVar.f4242f = Float.valueOf(m4736e(trim));
                        break;
                    } else {
                        ahVar.f4242f = Float.valueOf(Float.NaN);
                        break;
                    }
                case 50:
                    ahVar.f4238b = m4734c(trim);
                    break;
                case 51:
                    ahVar.f4239c = m4734c(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static void m4729a(C0707z c0707z, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 23:
                    c0707z.f4353c = m4731b(trim);
                    break;
                case 24:
                    if ("objectBoundingBox".equals(trim)) {
                        c0707z.f4352b = Boolean.valueOf(false);
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        c0707z.f4352b = Boolean.valueOf(true);
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute gradientUnits");
                    }
                case 26:
                    if (!"http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        break;
                    }
                    c0707z.f4355e = trim;
                    break;
                case 60:
                    try {
                        c0707z.f4354d = aa.valueOf(trim);
                        break;
                    } catch (IllegalArgumentException e) {
                        throw new SAXException(new StringBuilder(String.valueOf(trim).length() + 56).append("Invalid spreadMethod attribute. \"").append(trim).append("\" is not a valid value.").toString());
                    }
                default:
                    break;
            }
        }
    }

    private static void m4718a(bl blVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 84:
                    blVar.f4356f = m4734c(trim);
                    break;
                case 85:
                    blVar.f4357g = m4734c(trim);
                    break;
                case 86:
                    blVar.f4358h = m4734c(trim);
                    break;
                case 87:
                    blVar.f4359i = m4734c(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static void m4720a(bp bpVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 6:
                    bpVar.f4360f = m4734c(trim);
                    break;
                case 7:
                    bpVar.f4361g = m4734c(trim);
                    break;
                case 11:
                    bpVar.f4363i = m4734c(trim);
                    break;
                case 12:
                    bpVar.f4364j = m4734c(trim);
                    break;
                case 49:
                    bpVar.f4362h = m4734c(trim);
                    if (!bpVar.f4362h.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <radialGradient> element. r cannot be negative");
                default:
                    break;
            }
        }
    }

    private static void m4713a(au auVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 39:
                    auVar.f4274a = m4703a(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static Float m4703a(String str) {
        float f = 0.0f;
        if (str.length() == 0) {
            throw new SAXException("Invalid offset value in <stop> (empty string)");
        }
        int i;
        Object obj;
        int length = str.length();
        if (str.charAt(str.length() - 1) == '%') {
            i = length - 1;
            obj = 1;
        } else {
            i = length;
            obj = null;
        }
        try {
            float a = m4699a(str, i);
            if (obj != null) {
                a /= 100.0f;
            }
            if (a >= 0.0f) {
                f = a > 100.0f ? 100.0f : a;
            }
            return Float.valueOf(f);
        } catch (Exception e) {
            Exception exception = e;
            String str2 = "Invalid offset value in <stop>: ";
            String valueOf = String.valueOf(str);
            throw new SAXException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), exception);
        }
    }

    private static void m4727a(C0726u c0726u, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 3:
                    if ("objectBoundingBox".equals(trim)) {
                        c0726u.f4631a = Boolean.valueOf(false);
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        c0726u.f4631a = Boolean.valueOf(true);
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute clipPathUnits");
                    }
                default:
                    break;
            }
        }
    }

    private static void m4723a(by byVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 26:
                    if (!"http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        break;
                    }
                    byVar.f4373a = trim;
                    break;
                case 61:
                    byVar.f4374b = m4734c(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static void m4710a(ao aoVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 25:
                    aoVar.f4263g = m4734c(trim);
                    if (!aoVar.f4263g.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <pattern> element. height cannot be negative");
                case 26:
                    if (!"http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        break;
                    }
                    aoVar.f4264h = trim;
                    break;
                case 44:
                    if ("objectBoundingBox".equals(trim)) {
                        aoVar.f4258b = Boolean.valueOf(false);
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        aoVar.f4258b = Boolean.valueOf(true);
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute patternContentUnits");
                    }
                case 45:
                    aoVar.f4259c = m4731b(trim);
                    break;
                case 46:
                    if ("objectBoundingBox".equals(trim)) {
                        aoVar.f4257a = Boolean.valueOf(false);
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        aoVar.f4257a = Boolean.valueOf(true);
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute patternUnits");
                    }
                case 81:
                    aoVar.f4262f = m4734c(trim);
                    if (!aoVar.f4262f.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <pattern> element. width cannot be negative");
                case 82:
                    aoVar.f4260d = m4734c(trim);
                    break;
                case 83:
                    aoVar.f4261e = m4734c(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static void m4708a(ai aiVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 25:
                    aiVar.f4248f = m4734c(trim);
                    if (!aiVar.f4248f.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <mask> element. height cannot be negative");
                case 36:
                    if ("objectBoundingBox".equals(trim)) {
                        aiVar.f4244b = Boolean.valueOf(false);
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        aiVar.f4244b = Boolean.valueOf(true);
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute maskContentUnits");
                    }
                case 37:
                    if ("objectBoundingBox".equals(trim)) {
                        aiVar.f4243a = Boolean.valueOf(false);
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        aiVar.f4243a = Boolean.valueOf(true);
                        break;
                    } else {
                        throw new SAXException("Invalid value for attribute maskUnits");
                    }
                case 81:
                    aiVar.f4247e = m4734c(trim);
                    if (!aiVar.f4247e.m4575b()) {
                        break;
                    }
                    throw new SAXException("Invalid <mask> element. width cannot be negative");
                case 82:
                    aiVar.f4245c = m4734c(trim);
                    break;
                case 83:
                    aiVar.f4246d = m4734c(trim);
                    break;
                default:
                    break;
            }
        }
    }

    private static void m4717a(bk bkVar, Attributes attributes) {
        int i = 0;
        while (i < attributes.getLength()) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                bkVar.f4205o = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    bkVar.f4206p = Boolean.FALSE;
                    return;
                } else if ("preserve".equals(trim)) {
                    bkVar.f4206p = Boolean.TRUE;
                    return;
                } else {
                    String str = "Invalid value for \"xml:space\" attribute: ";
                    trim = String.valueOf(trim);
                    throw new SAXException(trim.length() != 0 ? str.concat(trim) : new String(str));
                }
            } else {
                i++;
            }
        }
    }

    private static void m4733b(bk bkVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                String str;
                switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                    case 0:
                        df c0709d = new C0709d(trim);
                        List list = null;
                        while (!c0709d.m4754b()) {
                            String a = c0709d.m4766a();
                            if (a == null) {
                                str = "Invalid value for \"class\" attribute: ";
                                String valueOf = String.valueOf(trim);
                                throw new SAXException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                            }
                            if (list == null) {
                                list = new ArrayList();
                            }
                            list.add(a);
                            c0709d.m4755c();
                        }
                        bkVar.f4209s = list;
                        break;
                    case 72:
                        df dfVar = new df(trim.replaceAll("/\\*.*?\\*/", ""));
                        while (true) {
                            trim = dfVar.m4753b(':');
                            dfVar.m4755c();
                            if (!dfVar.m4751a(':')) {
                                break;
                            }
                            dfVar.m4755c();
                            str = dfVar.m4753b(';');
                            if (str == null) {
                                break;
                            }
                            dfVar.m4755c();
                            if (dfVar.m4754b() || dfVar.m4751a(';')) {
                                if (bkVar.f4208r == null) {
                                    bkVar.f4208r = new av();
                                }
                                m4715a(bkVar.f4208r, trim, str);
                                dfVar.m4755c();
                            }
                        }
                        break;
                    default:
                        if (bkVar.f4207q == null) {
                            bkVar.f4207q = new av();
                        }
                        m4715a(bkVar.f4207q, attributes.getLocalName(i), attributes.getValue(i).trim());
                        break;
                }
            }
        }
    }

    protected static void m4715a(av avVar, String str, String str2) {
        C0724s c0724s = null;
        if (str2.length() != 0 && !str2.equals("inherit")) {
            String str3;
            String valueOf;
            switch (dd.m4769a(str).ordinal()) {
                case 1:
                    if (!"auto".equals(str2)) {
                        if (str2.toLowerCase(Locale.US).startsWith("rect(")) {
                            df dfVar = new df(str2.substring(5));
                            dfVar.m4755c();
                            af a = m4701a(dfVar);
                            dfVar.m4756d();
                            af a2 = m4701a(dfVar);
                            dfVar.m4756d();
                            af a3 = m4701a(dfVar);
                            dfVar.m4756d();
                            af a4 = m4701a(dfVar);
                            dfVar.m4755c();
                            if (dfVar.m4751a(')')) {
                                c0724s = new C0724s(a, a2, a3, a4);
                            } else {
                                str3 = "Bad rect() clip definition: ";
                                valueOf = String.valueOf(str2);
                                throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                            }
                        }
                        throw new SAXException("Invalid clip attribute shape. Only rect() is supported.");
                    }
                    avVar.f4309w = c0724s;
                    avVar.f4287a |= 1048576;
                    return;
                case 2:
                    avVar.f4279E = m4732b(str2, str);
                    avVar.f4287a |= 268435456;
                    return;
                case 4:
                    avVar.f4280F = m4743l(str2);
                    avVar.f4287a |= 536870912;
                    return;
                case 5:
                    avVar.f4300n = m4739h(str2);
                    avVar.f4287a |= 4096;
                    return;
                case 8:
                    bc bcVar;
                    if ("ltr".equals(str2)) {
                        bcVar = bc.LTR;
                    } else if ("rtl".equals(str2)) {
                        bcVar = bc.RTL;
                    } else {
                        str3 = "Invalid direction property: ";
                        valueOf = String.valueOf(str2);
                        throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    avVar.f4306t = bcVar;
                    avVar.f4287a |= 68719476736L;
                    return;
                case 14:
                    if (str2.indexOf(124) >= 0 || "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".indexOf(new StringBuilder(String.valueOf(str2).length() + 2).append('|').append(str2).append('|').toString()) == -1) {
                        str3 = "Invalid value for \"display\" attribute: ";
                        valueOf = String.valueOf(str2);
                        throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    avVar.f4275A = Boolean.valueOf(!str2.equals("none"));
                    avVar.f4287a |= 16777216;
                    return;
                case 15:
                    avVar.f4288b = m4702a(str2, "fill");
                    avVar.f4287a |= 1;
                    return;
                case 16:
                    avVar.f4289c = m4743l(str2);
                    avVar.f4287a |= 2;
                    return;
                case 17:
                    avVar.f4290d = Float.valueOf(m4737f(str2));
                    avVar.f4287a |= 4;
                    return;
                case 18:
                    m4714a(avVar, str2);
                    return;
                case 19:
                    avVar.f4301o = m4740i(str2);
                    avVar.f4287a |= 8192;
                    return;
                case 20:
                    avVar.f4302p = m4741j(str2);
                    avVar.f4287a |= 16384;
                    return;
                case 21:
                    Integer a5 = dc.m4768a(str2);
                    if (a5 == null) {
                        str3 = "Invalid font-weight property: ";
                        valueOf = String.valueOf(str2);
                        throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    avVar.f4303q = a5;
                    avVar.f4287a |= 32768;
                    return;
                case 22:
                    ax k = m4742k(str2);
                    if (k != null) {
                        avVar.f4304r = k;
                        avVar.f4287a |= 65536;
                        return;
                    }
                    str3 = "Invalid font-style property: ";
                    valueOf = String.valueOf(str2);
                    throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                case 28:
                    avVar.f4310x = m4732b(str2, str);
                    avVar.f4311y = avVar.f4310x;
                    avVar.f4312z = avVar.f4310x;
                    avVar.f4287a |= 14680064;
                    return;
                case 29:
                    avVar.f4310x = m4732b(str2, str);
                    avVar.f4287a |= 2097152;
                    return;
                case 30:
                    avVar.f4311y = m4732b(str2, str);
                    avVar.f4287a |= 4194304;
                    return;
                case 31:
                    avVar.f4312z = m4732b(str2, str);
                    avVar.f4287a |= 8388608;
                    return;
                case 35:
                    avVar.f4281G = m4732b(str2, str);
                    avVar.f4287a |= 1073741824;
                    return;
                case 40:
                    avVar.f4299m = Float.valueOf(m4737f(str2));
                    avVar.f4287a |= 2048;
                    return;
                case 42:
                    Boolean bool;
                    if ("visible".equals(str2) || "auto".equals(str2)) {
                        bool = Boolean.TRUE;
                    } else if ("hidden".equals(str2) || "scroll".equals(str2)) {
                        bool = Boolean.FALSE;
                    } else {
                        str3 = "Invalid toverflow property: ";
                        valueOf = String.valueOf(str2);
                        throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    avVar.f4308v = bool;
                    avVar.f4287a |= 524288;
                    return;
                case 58:
                    if (str2.equals("currentColor")) {
                        avVar.f4282H = C0728w.f4634a;
                    } else {
                        avVar.f4282H = m4739h(str2);
                    }
                    avVar.f4287a |= 2147483648L;
                    return;
                case 59:
                    avVar.f4283I = Float.valueOf(m4737f(str2));
                    avVar.f4287a |= 4294967296L;
                    return;
                case 62:
                    if (str2.equals("currentColor")) {
                        avVar.f4277C = C0728w.f4634a;
                    } else {
                        avVar.f4277C = m4739h(str2);
                    }
                    avVar.f4287a |= 67108864;
                    return;
                case 63:
                    avVar.f4278D = Float.valueOf(m4737f(str2));
                    avVar.f4287a |= 134217728;
                    return;
                case 64:
                    avVar.f4291e = m4702a(str2, "stroke");
                    avVar.f4287a |= 8;
                    return;
                case 65:
                    if ("none".equals(str2)) {
                        avVar.f4297k = null;
                    } else {
                        avVar.f4297k = m4744m(str2);
                    }
                    avVar.f4287a |= 512;
                    return;
                case 66:
                    avVar.f4298l = m4734c(str2);
                    avVar.f4287a |= 1024;
                    return;
                case 67:
                    ay ayVar;
                    if ("butt".equals(str2)) {
                        ayVar = ay.Butt;
                    } else if ("round".equals(str2)) {
                        ayVar = ay.Round;
                    } else if ("square".equals(str2)) {
                        ayVar = ay.Square;
                    } else {
                        str3 = "Invalid stroke-linecap property: ";
                        valueOf = String.valueOf(str2);
                        throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    avVar.f4294h = ayVar;
                    avVar.f4287a |= 64;
                    return;
                case 68:
                    az azVar;
                    if ("miter".equals(str2)) {
                        azVar = az.Miter;
                    } else if ("round".equals(str2)) {
                        azVar = az.Round;
                    } else if ("bevel".equals(str2)) {
                        azVar = az.Bevel;
                    } else {
                        str3 = "Invalid stroke-linejoin property: ";
                        valueOf = String.valueOf(str2);
                        throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    avVar.f4295i = azVar;
                    avVar.f4287a |= 128;
                    return;
                case 69:
                    avVar.f4296j = Float.valueOf(m4736e(str2));
                    avVar.f4287a |= 256;
                    return;
                case 70:
                    avVar.f4292f = Float.valueOf(m4737f(str2));
                    avVar.f4287a |= 16;
                    return;
                case 71:
                    avVar.f4293g = m4734c(str2);
                    avVar.f4287a |= 32;
                    return;
                case 74:
                    ba baVar;
                    if ("start".equals(str2)) {
                        baVar = ba.Start;
                    } else if ("middle".equals(str2)) {
                        baVar = ba.Middle;
                    } else if ("end".equals(str2)) {
                        baVar = ba.End;
                    } else {
                        str3 = "Invalid text-anchor property: ";
                        valueOf = String.valueOf(str2);
                        throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    avVar.f4307u = baVar;
                    avVar.f4287a |= 262144;
                    return;
                case 75:
                    bb bbVar;
                    if ("none".equals(str2)) {
                        bbVar = bb.None;
                    } else if ("underline".equals(str2)) {
                        bbVar = bb.Underline;
                    } else if ("overline".equals(str2)) {
                        bbVar = bb.Overline;
                    } else if ("line-through".equals(str2)) {
                        bbVar = bb.LineThrough;
                    } else if ("blink".equals(str2)) {
                        bbVar = bb.Blink;
                    } else {
                        str3 = "Invalid text-decoration property: ";
                        valueOf = String.valueOf(str2);
                        throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    avVar.f4305s = bbVar;
                    avVar.f4287a |= 131072;
                    return;
                case 78:
                    bd bdVar;
                    if ("none".equals(str2)) {
                        bdVar = bd.None;
                    } else if ("non-scaling-stroke".equals(str2)) {
                        bdVar = bd.NonScalingStroke;
                    } else {
                        str3 = "Invalid vector-effect property: ";
                        valueOf = String.valueOf(str2);
                        throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    avVar.f4286L = bdVar;
                    avVar.f4287a |= 34359738368L;
                    return;
                case 88:
                    if (str2.equals("currentColor")) {
                        avVar.f4284J = C0728w.f4634a;
                    } else {
                        avVar.f4284J = m4739h(str2);
                    }
                    avVar.f4287a |= 8589934592L;
                    return;
                case 89:
                    avVar.f4285K = Float.valueOf(m4737f(str2));
                    avVar.f4287a |= 17179869184L;
                    return;
                case 90:
                    if (str2.indexOf(124) >= 0 || "|visible|hidden|collapse|".indexOf(new StringBuilder(String.valueOf(str2).length() + 2).append('|').append(str2).append('|').toString()) == -1) {
                        str3 = "Invalid value for \"visibility\" attribute: ";
                        valueOf = String.valueOf(str2);
                        throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    avVar.f4276B = Boolean.valueOf(str2.equals("visible"));
                    avVar.f4287a |= 33554432;
                    return;
                default:
                    return;
            }
        }
    }

    private static void m4721a(bq bqVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 48:
                    m4719a((bo) bqVar, trim);
                    break;
                case 80:
                    df dfVar = new df(trim);
                    dfVar.m4755c();
                    float e = dfVar.m4757e();
                    dfVar.m4756d();
                    float e2 = dfVar.m4757e();
                    dfVar.m4756d();
                    float e3 = dfVar.m4757e();
                    dfVar.m4756d();
                    float e4 = dfVar.m4757e();
                    if (!Float.isNaN(e) && !Float.isNaN(e2) && !Float.isNaN(e3) && !Float.isNaN(e4)) {
                        if (e3 >= 0.0f) {
                            if (e4 >= 0.0f) {
                                bqVar.f4236w = new C0723r(e, e2, e3, e4);
                                break;
                            }
                            throw new SAXException("Invalid viewBox. height cannot be negative");
                        }
                        throw new SAXException("Invalid viewBox. width cannot be negative");
                    }
                    throw new SAXException("Invalid viewBox definition - should have four numbers");
                    break;
                default:
                    break;
            }
        }
    }

    private static void m4704a(ad adVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (dd.m4769a(attributes.getLocalName(i)) == dd.transform) {
                adVar.mo1094a(m4731b(attributes.getValue(i)));
            }
        }
    }

    private static Matrix m4731b(String str) {
        Matrix matrix = new Matrix();
        df dfVar = new df(str);
        dfVar.m4755c();
        while (!dfVar.m4754b()) {
            String j = dfVar.m4762j();
            String valueOf;
            if (j != null) {
                float e;
                float e2;
                float e3;
                if (j.equals("matrix")) {
                    dfVar.m4755c();
                    e = dfVar.m4757e();
                    dfVar.m4756d();
                    e2 = dfVar.m4757e();
                    dfVar.m4756d();
                    e3 = dfVar.m4757e();
                    dfVar.m4756d();
                    float e4 = dfVar.m4757e();
                    dfVar.m4756d();
                    float e5 = dfVar.m4757e();
                    dfVar.m4756d();
                    float e6 = dfVar.m4757e();
                    dfVar.m4755c();
                    if (Float.isNaN(e6) || !dfVar.m4751a(')')) {
                        j = "Invalid transform list: ";
                        valueOf = String.valueOf(str);
                        throw new SAXException(valueOf.length() != 0 ? j.concat(valueOf) : new String(j));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{e, e3, e5, e2, e4, e6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                } else if (j.equals("translate")) {
                    dfVar.m4755c();
                    e = dfVar.m4757e();
                    e2 = dfVar.m4758f();
                    dfVar.m4755c();
                    if (Float.isNaN(e) || !dfVar.m4751a(')')) {
                        j = "Invalid transform list: ";
                        valueOf = String.valueOf(str);
                        throw new SAXException(valueOf.length() != 0 ? j.concat(valueOf) : new String(j));
                    } else if (Float.isNaN(e2)) {
                        matrix.preTranslate(e, 0.0f);
                    } else {
                        matrix.preTranslate(e, e2);
                    }
                } else if (j.equals("scale")) {
                    dfVar.m4755c();
                    e = dfVar.m4757e();
                    e2 = dfVar.m4758f();
                    dfVar.m4755c();
                    if (Float.isNaN(e) || !dfVar.m4751a(')')) {
                        j = "Invalid transform list: ";
                        valueOf = String.valueOf(str);
                        throw new SAXException(valueOf.length() != 0 ? j.concat(valueOf) : new String(j));
                    } else if (Float.isNaN(e2)) {
                        matrix.preScale(e, e);
                    } else {
                        matrix.preScale(e, e2);
                    }
                } else if (j.equals("rotate")) {
                    dfVar.m4755c();
                    e = dfVar.m4757e();
                    e2 = dfVar.m4758f();
                    e3 = dfVar.m4758f();
                    dfVar.m4755c();
                    if (Float.isNaN(e) || !dfVar.m4751a(')')) {
                        j = "Invalid transform list: ";
                        valueOf = String.valueOf(str);
                        throw new SAXException(valueOf.length() != 0 ? j.concat(valueOf) : new String(j));
                    } else if (Float.isNaN(e2)) {
                        matrix.preRotate(e);
                    } else if (Float.isNaN(e3)) {
                        j = "Invalid transform list: ";
                        valueOf = String.valueOf(str);
                        throw new SAXException(valueOf.length() != 0 ? j.concat(valueOf) : new String(j));
                    } else {
                        matrix.preRotate(e, e2, e3);
                    }
                } else if (j.equals("skewX")) {
                    dfVar.m4755c();
                    e = dfVar.m4757e();
                    dfVar.m4755c();
                    if (Float.isNaN(e) || !dfVar.m4751a(')')) {
                        j = "Invalid transform list: ";
                        valueOf = String.valueOf(str);
                        throw new SAXException(valueOf.length() != 0 ? j.concat(valueOf) : new String(j));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians((double) e)), 0.0f);
                } else if (j.equals("skewY")) {
                    dfVar.m4755c();
                    e = dfVar.m4757e();
                    dfVar.m4755c();
                    if (Float.isNaN(e) || !dfVar.m4751a(')')) {
                        j = "Invalid transform list: ";
                        valueOf = String.valueOf(str);
                        throw new SAXException(valueOf.length() != 0 ? j.concat(valueOf) : new String(j));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) e)));
                } else if (j != null) {
                    throw new SAXException(new StringBuilder(String.valueOf(j).length() + 28).append("Invalid transform list fn: ").append(j).append(")").toString());
                }
                if (dfVar.m4754b()) {
                    break;
                }
                dfVar.m4756d();
            } else {
                j = "Bad transform function encountered in transform list: ";
                valueOf = String.valueOf(str);
                throw new SAXException(valueOf.length() != 0 ? j.concat(valueOf) : new String(j));
            }
        }
        return matrix;
    }

    private static af m4734c(String str) {
        if (str.length() == 0) {
            throw new SAXException("Invalid length value (empty string)");
        }
        int length = str.length();
        cc ccVar = cc.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            ccVar = cc.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                ccVar = cc.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException e) {
                String str2 = "Invalid length unit specifier: ";
                String valueOf = String.valueOf(str);
                throw new SAXException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
        try {
            return new af(m4699a(str, length), ccVar);
        } catch (Exception e2) {
            Exception exception = e2;
            String str3 = "Invalid length value: ";
            valueOf = String.valueOf(str);
            throw new SAXException(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), exception);
        }
    }

    private static List m4735d(String str) {
        if (str.length() == 0) {
            throw new SAXException("Invalid length list (empty string)");
        }
        List arrayList = new ArrayList(1);
        df dfVar = new df(str);
        dfVar.m4755c();
        while (!dfVar.m4754b()) {
            float e = dfVar.m4757e();
            if (Float.isNaN(e)) {
                String str2 = "Invalid length list value: ";
                String valueOf = String.valueOf(dfVar.m4763k());
                throw new SAXException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            cc l = dfVar.m4764l();
            if (l == null) {
                l = cc.px;
            }
            arrayList.add(new af(e, l));
            dfVar.m4756d();
        }
        return arrayList;
    }

    private static float m4736e(String str) {
        int length = str.length();
        if (length != 0) {
            return m4699a(str, length);
        }
        throw new SAXException("Invalid float value (empty string)");
    }

    private static float m4699a(String str, int i) {
        float a = new C0717l().m4778a(str, 0, i);
        if (!Float.isNaN(a)) {
            return a;
        }
        String str2 = "Invalid float value: ";
        String valueOf = String.valueOf(str);
        throw new SAXException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    private static float m4737f(String str) {
        float e = m4736e(str);
        if (e < 0.0f) {
            return 0.0f;
        }
        return e > 1.0f ? 1.0f : e;
    }

    private static void m4719a(bo boVar, String str) {
        df dfVar = new df(str);
        dfVar.m4755c();
        C0720o c0720o = null;
        Object b = dfVar.m4753b(' ');
        if ("defer".equals(b)) {
            dfVar.m4755c();
            b = dfVar.m4753b(' ');
        }
        C0719n c0719n = (C0719n) cz.f4471a.get(b);
        dfVar.m4755c();
        if (!dfVar.m4754b()) {
            String b2 = dfVar.m4753b(' ');
            if (b2.equals("meet")) {
                c0720o = C0720o.Meet;
            } else if (b2.equals("slice")) {
                c0720o = C0720o.Slice;
            } else {
                String str2 = "Invalid preserveAspectRatio definition: ";
                String valueOf = String.valueOf(str);
                throw new SAXException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
        }
        boVar.f4223v = new C0718m(c0719n, c0720o);
    }

    private static bn m4702a(String str, String str2) {
        if (!str.startsWith("url(")) {
            return m4738g(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            throw new SAXException(new StringBuilder(String.valueOf(str2).length() + 44).append("Bad ").append(str2).append(" attribute. Unterminated url() reference").toString());
        }
        String trim = str.substring(4, indexOf).trim();
        bn bnVar = null;
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            bnVar = m4738g(trim2);
        }
        return new ak(trim, bnVar);
    }

    private static bn m4738g(String str) {
        if (str.equals("none")) {
            return null;
        }
        if (str.equals("currentColor")) {
            return C0728w.f4634a;
        }
        return m4739h(str);
    }

    private static C0727v m4739h(String str) {
        String str2;
        String valueOf;
        if (str.charAt(0) == '#') {
            C0716k c0716k;
            int i;
            int length = str.length();
            long j = 0;
            if (1 >= length) {
                c0716k = null;
            } else {
                i = 1;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if (charAt >= '0' && charAt <= '9') {
                        j = (j * 16) + ((long) (charAt - 48));
                    } else if (charAt < 'A' || charAt > 'F') {
                        if (charAt < 'a' || charAt > 'f') {
                            break;
                        }
                        j = ((j * 16) + ((long) (charAt - 97))) + 10;
                    } else {
                        j = ((j * 16) + ((long) (charAt - 65))) + 10;
                    }
                    if (j > 4294967295L) {
                        c0716k = null;
                        break;
                    }
                    i++;
                }
                if (i == 1) {
                    c0716k = null;
                } else {
                    c0716k = new C0716k(j, i);
                }
            }
            if (c0716k == null) {
                str2 = "Bad hex colour value: ";
                valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    valueOf = str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                throw new SAXException(valueOf);
            }
            int i2 = c0716k.f4589a;
            if (i2 == 7) {
                return new C0727v((int) c0716k.f4590b);
            }
            if (i2 == 4) {
                i2 = (int) c0716k.f4590b;
                i = i2 & 3840;
                int i3 = i2 & 240;
                int i4 = i2 & 15;
                return new C0727v((((((i << 12) | (i << 16)) | (i3 << 8)) | (i3 << 4)) | (i4 << 4)) | i4);
            }
            str2 = "Bad hex colour value: ";
            valueOf = String.valueOf(str);
            throw new SAXException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (str.toLowerCase(Locale.US).startsWith("rgb(")) {
            df dfVar = new df(str.substring(4));
            dfVar.m4755c();
            float e = dfVar.m4757e();
            if (!Float.isNaN(e) && dfVar.m4751a('%')) {
                e = (e * 256.0f) / 100.0f;
            }
            float a = dfVar.m4749a(e);
            if (!Float.isNaN(a) && dfVar.m4751a('%')) {
                a = (a * 256.0f) / 100.0f;
            }
            float a2 = dfVar.m4749a(a);
            if (!Float.isNaN(a2) && dfVar.m4751a('%')) {
                a2 = (a2 * 256.0f) / 100.0f;
            }
            dfVar.m4755c();
            if (!Float.isNaN(a2) && dfVar.m4751a(')')) {
                return new C0727v(((m4700a(e) << 16) | (m4700a(a) << 8)) | m4700a(a2));
            }
            str2 = "Bad rgb() colour value: ";
            valueOf = String.valueOf(str);
            throw new SAXException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            Integer num = (Integer) da.f4476a.get(str.toLowerCase(Locale.US));
            if (num != null) {
                return new C0727v(num.intValue());
            }
            str2 = "Invalid colour keyword: ";
            valueOf = String.valueOf(str);
            throw new SAXException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    private static int m4700a(float f) {
        if (f < 0.0f) {
            return 0;
        }
        return f > 255.0f ? HprofParser.ROOT_UNKNOWN : Math.round(f);
    }

    private static void m4714a(av avVar, String str) {
        String str2 = null;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".indexOf(new StringBuilder(String.valueOf(str).length() + 2).append('|').append(str).append('|').toString()) == -1) {
            String b;
            df dfVar = new df(str);
            String str3 = null;
            ax axVar = null;
            Integer num = null;
            while (true) {
                b = dfVar.m4753b('/');
                dfVar.m4755c();
                if (b != null) {
                    if (num == null || axVar == null) {
                        if (!b.equals("normal")) {
                            if (num == null) {
                                num = dc.m4768a(b);
                                if (num != null) {
                                    continue;
                                }
                            }
                            if (axVar == null) {
                                axVar = m4742k(b);
                                if (axVar != null) {
                                    continue;
                                }
                            }
                            if (str3 != null || !b.equals("small-caps")) {
                                break;
                            }
                            str3 = b;
                        }
                    } else {
                        break;
                    }
                }
                throw new SAXException("Invalid font style attribute: missing font size and family");
            }
            af j = m4741j(b);
            if (dfVar.m4751a('/')) {
                dfVar.m4755c();
                b = dfVar.m4753b(' ');
                if (b == null) {
                    throw new SAXException("Invalid font style attribute: missing line-height");
                }
                m4734c(b);
                dfVar.m4755c();
            }
            if (!dfVar.m4754b()) {
                int i = dfVar.f4473b;
                dfVar.f4473b = dfVar.f4474c;
                str2 = dfVar.f4472a.substring(i);
            }
            avVar.f4301o = m4740i(str2);
            avVar.f4302p = j;
            avVar.f4303q = Integer.valueOf(num == null ? 400 : num.intValue());
            if (axVar == null) {
                axVar = ax.Normal;
            }
            avVar.f4304r = axVar;
            avVar.f4287a |= 122880;
        }
    }

    private static List m4740i(String str) {
        List list = null;
        df dfVar = new df(str);
        do {
            Object m = dfVar.m4765m();
            if (m == null) {
                m = dfVar.m4753b(',');
            }
            if (m == null) {
                break;
            }
            if (list == null) {
                list = new ArrayList();
            }
            list.add(m);
            dfVar.m4756d();
        } while (!dfVar.m4754b());
        return list;
    }

    private static af m4741j(String str) {
        af afVar = (af) db.f4477a.get(str);
        if (afVar == null) {
            return m4734c(str);
        }
        return afVar;
    }

    private static ax m4742k(String str) {
        if ("italic".equals(str)) {
            return ax.Italic;
        }
        if ("normal".equals(str)) {
            return ax.Normal;
        }
        if ("oblique".equals(str)) {
            return ax.Oblique;
        }
        return null;
    }

    private static aw m4743l(String str) {
        if ("nonzero".equals(str)) {
            return aw.NonZero;
        }
        if ("evenodd".equals(str)) {
            return aw.EvenOdd;
        }
        String str2 = "Invalid fill-rule property: ";
        String valueOf = String.valueOf(str);
        throw new SAXException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    private static af[] m4744m(String str) {
        df dfVar = new df(str);
        dfVar.m4755c();
        if (dfVar.m4754b()) {
            return null;
        }
        af h = dfVar.m4760h();
        if (h == null) {
            return null;
        }
        if (h.m4575b()) {
            String str2 = "Invalid stroke-dasharray. Dash segemnts cannot be negative: ";
            String valueOf = String.valueOf(str);
            throw new SAXException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        float f = h.f4230a;
        List arrayList = new ArrayList();
        arrayList.add(h);
        while (!dfVar.m4754b()) {
            dfVar.m4756d();
            h = dfVar.m4760h();
            if (h == null) {
                str2 = "Invalid stroke-dasharray. Non-Length content found: ";
                valueOf = String.valueOf(str);
                throw new SAXException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            } else if (h.m4575b()) {
                str2 = "Invalid stroke-dasharray. Dash segemnts cannot be negative: ";
                valueOf = String.valueOf(str);
                throw new SAXException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            } else {
                arrayList.add(h);
                f += h.f4230a;
            }
        }
        if (f == 0.0f) {
            return null;
        }
        return (af[]) arrayList.toArray(new af[arrayList.size()]);
    }

    private static af m4701a(df dfVar) {
        if (dfVar.m4752a("auto")) {
            return new af(0.0f);
        }
        return dfVar.m4760h();
    }

    private static Set m4745n(String str) {
        df dfVar = new df(str);
        Set hashSet = new HashSet();
        while (!dfVar.m4754b()) {
            String b = dfVar.m4753b(' ');
            int indexOf = b.indexOf(45);
            if (indexOf != -1) {
                b = b.substring(0, indexOf);
            }
            hashSet.add(new Locale(b, "", "").getLanguage());
            dfVar.m4755c();
        }
        return hashSet;
    }

    private static Set m4746o(String str) {
        df dfVar = new df(str);
        Set hashSet = new HashSet();
        while (!dfVar.m4754b()) {
            hashSet.add(dfVar.m4753b(' '));
            dfVar.m4755c();
        }
        return hashSet;
    }

    private static String m4732b(String str, String str2) {
        if (str.equals("none")) {
            return null;
        }
        if (str.startsWith("url(") && str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        throw new SAXException(new StringBuilder(String.valueOf(str2).length() + 49).append("Bad ").append(str2).append(" attribute. Expected \"none\" or \"url()\" format").toString());
    }

    private final void m4730a(Attributes attributes) {
        if (this.f4464b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        int i = 0;
        boolean z = true;
        String str = "all";
        while (i < attributes.getLength()) {
            boolean z2;
            String trim = attributes.getValue(i).trim();
            switch (dd.m4769a(attributes.getLocalName(i)).ordinal()) {
                case 38:
                    str = trim;
                    z2 = z;
                    break;
                case 77:
                    z2 = trim.equals("text/css");
                    break;
                default:
                    z2 = z;
                    break;
            }
            i++;
            z = z2;
        }
        if (z && C0705a.m4526a(r0, C0711f.screen)) {
            this.f4469g = true;
            return;
        }
        this.f4465c = true;
        this.f4466d = 1;
    }
}
