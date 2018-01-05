package org.chromium.net;

public final class ad {
    public final boolean f40655a;
    public final int f40656b;
    public final int f40657c;
    public final String f40658d;

    public ad(boolean z, int i, int i2, String str) {
        this.f40655a = z;
        this.f40656b = i;
        this.f40657c = i2;
        if (str == null) {
            str = "";
        }
        this.f40658d = str;
    }

    public final int m37927a() {
        if (this.f40655a) {
            return NetworkChangeNotifierAutoDetect.m37847a(this.f40656b, this.f40657c);
        }
        return 6;
    }

    public final int m37928b() {
        if (!this.f40655a) {
            return 1;
        }
        switch (this.f40656b) {
            case 0:
                switch (this.f40657c) {
                    case 1:
                        return 7;
                    case 2:
                        return 8;
                    case 3:
                        return 9;
                    case 4:
                        return 5;
                    case 5:
                        return 10;
                    case 6:
                        return 11;
                    case 7:
                        return 6;
                    case 8:
                        return 14;
                    case 9:
                        return 15;
                    case 10:
                        return 12;
                    case 11:
                        return 4;
                    case 12:
                        return 13;
                    case 13:
                        return 18;
                    case 14:
                        return 16;
                    case 15:
                        return 17;
                    default:
                        return 0;
                }
            case 1:
            case 6:
            case 7:
            case 9:
                return 0;
            default:
                return 0;
        }
    }
}
