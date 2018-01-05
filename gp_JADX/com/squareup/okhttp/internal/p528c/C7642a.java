package com.squareup.okhttp.internal.p528c;

import javax.security.auth.x500.X500Principal;

final class C7642a {
    public final String f39571a;
    public final int f39572b = this.f39571a.length();
    public int f39573c;
    public int f39574d;
    public int f39575e;
    public int f39576f;
    public char[] f39577g;

    public C7642a(X500Principal x500Principal) {
        this.f39571a = x500Principal.getName("RFC2253");
    }

    final String m36865a() {
        while (this.f39573c < this.f39572b && this.f39577g[this.f39573c] == ' ') {
            this.f39573c++;
        }
        if (this.f39573c == this.f39572b) {
            return null;
        }
        this.f39574d = this.f39573c;
        this.f39573c++;
        while (this.f39573c < this.f39572b && this.f39577g[this.f39573c] != '=' && this.f39577g[this.f39573c] != ' ') {
            this.f39573c++;
        }
        if (this.f39573c >= this.f39572b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f39571a);
        }
        this.f39575e = this.f39573c;
        if (this.f39577g[this.f39573c] == ' ') {
            while (this.f39573c < this.f39572b && this.f39577g[this.f39573c] != '=' && this.f39577g[this.f39573c] == ' ') {
                this.f39573c++;
            }
            if (this.f39577g[this.f39573c] != '=' || this.f39573c == this.f39572b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f39571a);
            }
        }
        do {
            this.f39573c++;
            if (this.f39573c >= this.f39572b) {
                break;
            }
        } while (this.f39577g[this.f39573c] == ' ');
        if (this.f39575e - this.f39574d > 4 && this.f39577g[this.f39574d + 3] == '.' && ((this.f39577g[this.f39574d] == 'O' || this.f39577g[this.f39574d] == 'o') && ((this.f39577g[this.f39574d + 1] == 'I' || this.f39577g[this.f39574d + 1] == 'i') && (this.f39577g[this.f39574d + 2] == 'D' || this.f39577g[this.f39574d + 2] == 'd')))) {
            this.f39574d += 4;
        }
        return new String(this.f39577g, this.f39574d, this.f39575e - this.f39574d);
    }

    final String m36866b() {
        if (this.f39573c + 4 >= this.f39572b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f39571a);
        }
        int i;
        this.f39574d = this.f39573c;
        this.f39573c++;
        while (this.f39573c != this.f39572b && this.f39577g[this.f39573c] != '+' && this.f39577g[this.f39573c] != ',' && this.f39577g[this.f39573c] != ';') {
            int i2;
            if (this.f39577g[this.f39573c] == ' ') {
                this.f39575e = this.f39573c;
                this.f39573c++;
                while (this.f39573c < this.f39572b && this.f39577g[this.f39573c] == ' ') {
                    this.f39573c++;
                }
                i = this.f39575e - this.f39574d;
                if (i >= 5 || (i & 1) == 0) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.f39571a);
                }
                byte[] bArr = new byte[(i / 2)];
                int i3 = this.f39574d + 1;
                for (i2 = 0; i2 < bArr.length; i2++) {
                    bArr[i2] = (byte) m36863a(i3);
                    i3 += 2;
                }
                return new String(this.f39577g, this.f39574d, i);
            }
            if (this.f39577g[this.f39573c] >= 'A' && this.f39577g[this.f39573c] <= 'F') {
                char[] cArr = this.f39577g;
                i2 = this.f39573c;
                cArr[i2] = (char) (cArr[i2] + 32);
            }
            this.f39573c++;
        }
        this.f39575e = this.f39573c;
        i = this.f39575e - this.f39574d;
        if (i >= 5) {
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f39571a);
    }

    final String m36867c() {
        this.f39574d = this.f39573c;
        this.f39575e = this.f39573c;
        while (this.f39573c < this.f39572b) {
            char[] cArr;
            int i;
            switch (this.f39577g[this.f39573c]) {
                case ' ':
                    this.f39576f = this.f39575e;
                    this.f39573c++;
                    cArr = this.f39577g;
                    i = this.f39575e;
                    this.f39575e = i + 1;
                    cArr[i] = ' ';
                    while (this.f39573c < this.f39572b && this.f39577g[this.f39573c] == ' ') {
                        cArr = this.f39577g;
                        i = this.f39575e;
                        this.f39575e = i + 1;
                        cArr[i] = ' ';
                        this.f39573c++;
                    }
                    if (this.f39573c != this.f39572b && this.f39577g[this.f39573c] != ',' && this.f39577g[this.f39573c] != '+' && this.f39577g[this.f39573c] != ';') {
                        break;
                    }
                    return new String(this.f39577g, this.f39574d, this.f39576f - this.f39574d);
                    break;
                case '+':
                case ',':
                case ';':
                    return new String(this.f39577g, this.f39574d, this.f39575e - this.f39574d);
                case '\\':
                    cArr = this.f39577g;
                    i = this.f39575e;
                    this.f39575e = i + 1;
                    cArr[i] = m36868d();
                    this.f39573c++;
                    break;
                default:
                    cArr = this.f39577g;
                    i = this.f39575e;
                    this.f39575e = i + 1;
                    cArr[i] = this.f39577g[this.f39573c];
                    this.f39573c++;
                    break;
            }
        }
        return new String(this.f39577g, this.f39574d, this.f39575e - this.f39574d);
    }

    final char m36868d() {
        this.f39573c++;
        if (this.f39573c == this.f39572b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f39571a);
        }
        switch (this.f39577g[this.f39573c]) {
            case ' ':
            case '\"':
            case '#':
            case '%':
            case '*':
            case '+':
            case ',':
            case ';':
            case '<':
            case '=':
            case '>':
            case '\\':
            case '_':
                return this.f39577g[this.f39573c];
            default:
                return m36864e();
        }
    }

    private final char m36864e() {
        int a = m36863a(this.f39573c);
        this.f39573c++;
        if (a < 128) {
            return (char) a;
        }
        if (a < 192 || a > 247) {
            return '?';
        }
        int i;
        if (a <= 223) {
            i = 1;
            a &= 31;
        } else if (a <= 239) {
            i = 2;
            a &= 15;
        } else {
            i = 3;
            a &= 7;
        }
        int i2 = a;
        for (a = 0; a < i; a++) {
            this.f39573c++;
            if (this.f39573c == this.f39572b || this.f39577g[this.f39573c] != '\\') {
                return '?';
            }
            this.f39573c++;
            int a2 = m36863a(this.f39573c);
            this.f39573c++;
            if ((a2 & 192) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (a2 & 63);
        }
        return (char) i2;
    }

    private final int m36863a(int i) {
        if (i + 1 >= this.f39572b) {
            throw new IllegalStateException("Malformed DN: " + this.f39571a);
        }
        int i2;
        int i3;
        char c = this.f39577g[i];
        if (c >= '0' && c <= '9') {
            i2 = c - 48;
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 87;
        } else if (c < 'A' || c > 'F') {
            throw new IllegalStateException("Malformed DN: " + this.f39571a);
        } else {
            i2 = c - 55;
        }
        char c2 = this.f39577g[i + 1];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - 48;
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 87;
        } else if (c2 < 'A' || c2 > 'F') {
            throw new IllegalStateException("Malformed DN: " + this.f39571a);
        } else {
            i3 = c2 - 55;
        }
        return (i2 << 4) + i3;
    }
}
