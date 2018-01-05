package com.google.wireless.android.finsky.dfe.nano;

import com.google.android.finsky.cv.a.bd;
import com.google.protobuf.nano.C7213a;
import com.google.protobuf.nano.C7222l;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.i;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

public final class ContentFilters {

    public final class ContentFilterSettingsResponse extends b {
        public int f38273a;
        public bi[] f38274b;
        public String f38275c;
        public bd f38276d;
        public String f38277e;
        public String f38278f;
        public String f38279g;
        public String f38280h;
        public bf[] f38281i;
        public String f38282j;
        public String f38283k;
        public String f38284l;
        public String f38285m;
        public String f38286n;
        public boolean f38287o;

        public ContentFilterSettingsResponse() {
            this.f38273a = 0;
            this.f38274b = bi.m36079d();
            this.f38275c = "";
            this.f38276d = null;
            this.f38277e = "";
            this.f38278f = "";
            this.f38279g = "";
            this.f38280h = "";
            this.f38281i = bf.m36065d();
            this.f38282j = "";
            this.f38283k = "";
            this.f38284l = "";
            this.f38285m = "";
            this.f38286n = "";
            this.f38287o = false;
            this.aO = null;
            this.aP = -1;
        }

        public final void m35959a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            int i = 0;
            if (this.f38274b != null && this.f38274b.length > 0) {
                for (i iVar : this.f38274b) {
                    if (iVar != null) {
                        codedOutputByteBufferNano.m33532b(1, iVar);
                    }
                }
            }
            if ((this.f38273a & 1) != 0) {
                codedOutputByteBufferNano.m33521a(2, this.f38275c);
            }
            if (this.f38276d != null) {
                codedOutputByteBufferNano.m33532b(3, this.f38276d);
            }
            if ((this.f38273a & 2) != 0) {
                codedOutputByteBufferNano.m33521a(4, this.f38277e);
            }
            if ((this.f38273a & 4) != 0) {
                codedOutputByteBufferNano.m33521a(5, this.f38278f);
            }
            if ((this.f38273a & 8) != 0) {
                codedOutputByteBufferNano.m33521a(6, this.f38279g);
            }
            if ((this.f38273a & 32) != 0) {
                codedOutputByteBufferNano.m33521a(7, this.f38282j);
            }
            if ((this.f38273a & 64) != 0) {
                codedOutputByteBufferNano.m33521a(8, this.f38283k);
            }
            if ((this.f38273a & 128) != 0) {
                codedOutputByteBufferNano.m33521a(9, this.f38284l);
            }
            if ((this.f38273a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
                codedOutputByteBufferNano.m33522a(10, this.f38287o);
            }
            if ((this.f38273a & 16) != 0) {
                codedOutputByteBufferNano.m33521a(11, this.f38280h);
            }
            if ((this.f38273a & 256) != 0) {
                codedOutputByteBufferNano.m33521a(12, this.f38285m);
            }
            if ((this.f38273a & 512) != 0) {
                codedOutputByteBufferNano.m33521a(13, this.f38286n);
            }
            if (this.f38281i != null && this.f38281i.length > 0) {
                while (i < this.f38281i.length) {
                    i iVar2 = this.f38281i[i];
                    if (iVar2 != null) {
                        codedOutputByteBufferNano.m33532b(14, iVar2);
                    }
                    i++;
                }
            }
            super.a(codedOutputByteBufferNano);
        }

        protected final int m35960b() {
            int i = 0;
            int b = super.b();
            if (this.f38274b != null && this.f38274b.length > 0) {
                int i2 = b;
                for (i iVar : this.f38274b) {
                    if (iVar != null) {
                        i2 += CodedOutputByteBufferNano.m33503d(1, iVar);
                    }
                }
                b = i2;
            }
            if ((this.f38273a & 1) != 0) {
                b += CodedOutputByteBufferNano.m33493b(2, this.f38275c);
            }
            if (this.f38276d != null) {
                b += CodedOutputByteBufferNano.m33503d(3, this.f38276d);
            }
            if ((this.f38273a & 2) != 0) {
                b += CodedOutputByteBufferNano.m33493b(4, this.f38277e);
            }
            if ((this.f38273a & 4) != 0) {
                b += CodedOutputByteBufferNano.m33493b(5, this.f38278f);
            }
            if ((this.f38273a & 8) != 0) {
                b += CodedOutputByteBufferNano.m33493b(6, this.f38279g);
            }
            if ((this.f38273a & 32) != 0) {
                b += CodedOutputByteBufferNano.m33493b(7, this.f38282j);
            }
            if ((this.f38273a & 64) != 0) {
                b += CodedOutputByteBufferNano.m33493b(8, this.f38283k);
            }
            if ((this.f38273a & 128) != 0) {
                b += CodedOutputByteBufferNano.m33493b(9, this.f38284l);
            }
            if ((this.f38273a & MemoryMappedFileBuffer.DEFAULT_PADDING) != 0) {
                b += CodedOutputByteBufferNano.m33501d(10) + 1;
            }
            if ((this.f38273a & 16) != 0) {
                b += CodedOutputByteBufferNano.m33493b(11, this.f38280h);
            }
            if ((this.f38273a & 256) != 0) {
                b += CodedOutputByteBufferNano.m33493b(12, this.f38285m);
            }
            if ((this.f38273a & 512) != 0) {
                b += CodedOutputByteBufferNano.m33493b(13, this.f38286n);
            }
            if (this.f38281i != null && this.f38281i.length > 0) {
                while (i < this.f38281i.length) {
                    i iVar2 = this.f38281i[i];
                    if (iVar2 != null) {
                        b += CodedOutputByteBufferNano.m33503d(14, iVar2);
                    }
                    i++;
                }
            }
            return b;
        }

        public static ContentFilterSettingsResponse parseFrom(byte[] bArr) {
            return (ContentFilterSettingsResponse) i.a(new ContentFilterSettingsResponse(), bArr);
        }

        public final /* synthetic */ i m35958a(C7213a c7213a) {
            while (true) {
                int a = c7213a.m33550a();
                int a2;
                Object obj;
                switch (a) {
                    case 0:
                        break;
                    case 10:
                        a2 = C7222l.m33624a(c7213a, 10);
                        a = this.f38274b == null ? 0 : this.f38274b.length;
                        obj = new bi[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f38274b, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new bi();
                            c7213a.m33552a(obj[a]);
                            c7213a.m33550a();
                            a++;
                        }
                        obj[a] = new bi();
                        c7213a.m33552a(obj[a]);
                        this.f38274b = obj;
                        continue;
                    case 18:
                        this.f38275c = c7213a.m33564f();
                        this.f38273a |= 1;
                        continue;
                    case 26:
                        if (this.f38276d == null) {
                            this.f38276d = new bd();
                        }
                        c7213a.m33552a(this.f38276d);
                        continue;
                    case 34:
                        this.f38277e = c7213a.m33564f();
                        this.f38273a |= 2;
                        continue;
                    case 42:
                        this.f38278f = c7213a.m33564f();
                        this.f38273a |= 4;
                        continue;
                    case 50:
                        this.f38279g = c7213a.m33564f();
                        this.f38273a |= 8;
                        continue;
                    case 58:
                        this.f38282j = c7213a.m33564f();
                        this.f38273a |= 32;
                        continue;
                    case 66:
                        this.f38283k = c7213a.m33564f();
                        this.f38273a |= 64;
                        continue;
                    case 74:
                        this.f38284l = c7213a.m33564f();
                        this.f38273a |= 128;
                        continue;
                    case 80:
                        this.f38287o = c7213a.m33563e();
                        this.f38273a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
                        continue;
                    case 90:
                        this.f38280h = c7213a.m33564f();
                        this.f38273a |= 16;
                        continue;
                    case 98:
                        this.f38285m = c7213a.m33564f();
                        this.f38273a |= 256;
                        continue;
                    case 106:
                        this.f38286n = c7213a.m33564f();
                        this.f38273a |= 512;
                        continue;
                    case 114:
                        a2 = C7222l.m33624a(c7213a, 114);
                        a = this.f38281i == null ? 0 : this.f38281i.length;
                        obj = new bf[(a2 + a)];
                        if (a != 0) {
                            System.arraycopy(this.f38281i, 0, obj, 0, a);
                        }
                        while (a < obj.length - 1) {
                            obj[a] = new bf();
                            c7213a.m33552a(obj[a]);
                            c7213a.m33550a();
                            a++;
                        }
                        obj[a] = new bf();
                        c7213a.m33552a(obj[a]);
                        this.f38281i = obj;
                        continue;
                    default:
                        if (!super.a(c7213a, a)) {
                            break;
                        }
                        continue;
                }
                return this;
            }
        }
    }
}
