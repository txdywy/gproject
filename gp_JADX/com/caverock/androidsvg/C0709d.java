package com.caverock.androidsvg;

import java.util.ArrayList;
import org.xml.sax.SAXException;

final class C0709d extends df {
    public C0709d(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public final String m4766a() {
        int i;
        if (m4754b()) {
            i = this.b;
        } else {
            int i2 = this.b;
            i = this.b;
            char charAt = this.a.charAt(this.b);
            if (charAt == '-') {
                charAt = m4761i();
            }
            if ((charAt >= 'A' && charAt <= 'Z') || ((charAt >= 'a' && charAt <= 'z') || charAt == '_')) {
                i = m4761i();
                while (true) {
                    if ((i < 65 || i > 90) && ((i < 97 || i > 122) && !((i >= 48 && i <= 57) || i == 45 || i == 95))) {
                        break;
                    }
                    i = m4761i();
                }
                i = this.b;
            }
            this.b = i2;
        }
        if (i == this.b) {
            return null;
        }
        String substring = this.a.substring(this.b, i);
        this.b = i;
        return substring;
    }

    public final boolean m4767a(C0714i c0714i) {
        if (m4754b()) {
            return false;
        }
        C0710e c0710e;
        String a;
        Object c0715j;
        String a2;
        C0708c c0708c;
        int i;
        int i2 = this.b;
        if (!c0714i.m4775b()) {
            if (m4751a('>')) {
                c0710e = C0710e.CHILD;
                m4755c();
            } else if (m4751a('+')) {
                c0710e = C0710e.FOLLOWS;
                m4755c();
            }
            if (m4751a('*')) {
                a = m4766a();
                if (a == null) {
                    c0715j = new C0715j(c0710e, a);
                    c0714i.f4584b++;
                } else {
                    c0715j = null;
                }
            } else {
                c0715j = new C0715j(c0710e, null);
            }
            while (!m4754b()) {
                if (m4751a('.')) {
                    if (m4751a('#')) {
                        if (c0715j == null) {
                            c0715j = new C0715j(c0710e, null);
                        }
                        a = m4766a();
                        if (a != null) {
                            throw new SAXException("Invalid \"#id\" selector in <style> element");
                        }
                        c0715j.m4777a("id", C0708c.EQUALS, a);
                        c0714i.f4584b += 10000;
                    }
                    if (c0715j == null) {
                        break;
                    } else if (m4751a('[')) {
                        m4755c();
                        a2 = m4766a();
                        if (a2 != null) {
                            throw new SAXException("Invalid attribute selector in <style> element");
                        }
                        m4755c();
                        if (m4751a('=')) {
                            c0708c = C0708c.EQUALS;
                        } else if (m4752a("~=")) {
                            c0708c = C0708c.INCLUDES;
                        } else if (m4752a("|=")) {
                            c0708c = null;
                        } else {
                            c0708c = C0708c.DASHMATCH;
                        }
                        if (c0708c == null) {
                            m4755c();
                            if (m4754b()) {
                                a = m4765m();
                                if (a == null) {
                                    a = m4766a();
                                }
                            } else {
                                a = null;
                            }
                            if (a != null) {
                                throw new SAXException("Invalid attribute selector in <style> element");
                            }
                            m4755c();
                        } else {
                            a = null;
                        }
                        if (m4751a(']')) {
                            throw new SAXException("Invalid attribute selector in <style> element");
                        }
                        if (c0708c == null) {
                            c0708c = C0708c.EXISTS;
                        }
                        c0715j.m4777a(a2, c0708c, a);
                        c0714i.m4776c();
                    } else if (m4751a(':')) {
                        i = this.b;
                        if (m4766a() != null) {
                            if (m4751a('(')) {
                                m4755c();
                                if (m4766a() != null) {
                                    m4755c();
                                    if (!m4751a(')')) {
                                        this.b = i - 1;
                                    }
                                }
                            }
                            String substring = this.a.substring(i, this.b);
                            if (c0715j.f4588d == null) {
                                c0715j.f4588d = new ArrayList();
                            }
                            c0715j.f4588d.add(substring);
                            c0714i.m4776c();
                        }
                    }
                } else {
                    if (c0715j == null) {
                        c0715j = new C0715j(c0710e, null);
                    }
                    a = m4766a();
                    if (a != null) {
                        throw new SAXException("Invalid \".class\" selector in <style> element");
                    }
                    c0715j.m4777a("class", C0708c.EQUALS, a);
                    c0714i.m4776c();
                }
            }
            if (c0715j == null) {
                if (c0714i.f4583a == null) {
                    c0714i.f4583a = new ArrayList();
                }
                c0714i.f4583a.add(c0715j);
                return true;
            }
            this.b = i2;
            return false;
        }
        c0710e = null;
        if (m4751a('*')) {
            a = m4766a();
            if (a == null) {
                c0715j = null;
            } else {
                c0715j = new C0715j(c0710e, a);
                c0714i.f4584b++;
            }
        } else {
            c0715j = new C0715j(c0710e, null);
        }
        while (!m4754b()) {
            if (m4751a('.')) {
                if (m4751a('#')) {
                    if (c0715j == null) {
                        c0715j = new C0715j(c0710e, null);
                    }
                    a = m4766a();
                    if (a != null) {
                        c0715j.m4777a("id", C0708c.EQUALS, a);
                        c0714i.f4584b += 10000;
                    } else {
                        throw new SAXException("Invalid \"#id\" selector in <style> element");
                    }
                }
                if (c0715j == null) {
                    break;
                } else if (m4751a('[')) {
                    m4755c();
                    a2 = m4766a();
                    if (a2 != null) {
                        m4755c();
                        if (m4751a('=')) {
                            c0708c = C0708c.EQUALS;
                        } else if (m4752a("~=")) {
                            c0708c = C0708c.INCLUDES;
                        } else if (m4752a("|=")) {
                            c0708c = null;
                        } else {
                            c0708c = C0708c.DASHMATCH;
                        }
                        if (c0708c == null) {
                            a = null;
                        } else {
                            m4755c();
                            if (m4754b()) {
                                a = m4765m();
                                if (a == null) {
                                    a = m4766a();
                                }
                            } else {
                                a = null;
                            }
                            if (a != null) {
                                m4755c();
                            } else {
                                throw new SAXException("Invalid attribute selector in <style> element");
                            }
                        }
                        if (m4751a(']')) {
                            if (c0708c == null) {
                                c0708c = C0708c.EXISTS;
                            }
                            c0715j.m4777a(a2, c0708c, a);
                            c0714i.m4776c();
                        } else {
                            throw new SAXException("Invalid attribute selector in <style> element");
                        }
                    }
                    throw new SAXException("Invalid attribute selector in <style> element");
                } else if (m4751a(':')) {
                    i = this.b;
                    if (m4766a() != null) {
                        if (m4751a('(')) {
                            m4755c();
                            if (m4766a() != null) {
                                m4755c();
                                if (m4751a(')')) {
                                    this.b = i - 1;
                                }
                            }
                        }
                        String substring2 = this.a.substring(i, this.b);
                        if (c0715j.f4588d == null) {
                            c0715j.f4588d = new ArrayList();
                        }
                        c0715j.f4588d.add(substring2);
                        c0714i.m4776c();
                    }
                }
            } else {
                if (c0715j == null) {
                    c0715j = new C0715j(c0710e, null);
                }
                a = m4766a();
                if (a != null) {
                    c0715j.m4777a("class", C0708c.EQUALS, a);
                    c0714i.m4776c();
                } else {
                    throw new SAXException("Invalid \".class\" selector in <style> element");
                }
            }
        }
        if (c0715j == null) {
            this.b = i2;
            return false;
        }
        if (c0714i.f4583a == null) {
            c0714i.f4583a = new ArrayList();
        }
        c0714i.f4583a.add(c0715j);
        return true;
    }
}
