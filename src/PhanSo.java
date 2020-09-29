public class PhanSo {


    private int tu;
    private int mau;

    public PhanSo() {
        this.tu = 1;
        this.mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo(String s) {
        String[] tokens = s.split("/");
        this.tu = Integer.parseInt(tokens[0]);
        this.mau = Integer.parseInt(tokens[1]);
    }

    public PhanSo(PhanSo ps) {
        this.tu = ps.tu;
        this.mau = ps.mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }

    public boolean laToiGian() {
        if (Helper.UCLN(tu, mau) == 1) return true;
        return false;
    }

    public void rutGonPhanSo() {
        int ucln = Helper.UCLN(tu, mau);
        this.tu = this.tu / ucln;
        this.mau = this.mau / ucln;

    }

    public String quyDong(PhanSo ps2) {
        PhanSo s1 = new PhanSo(this);
        PhanSo s2 = new PhanSo(ps2);
        int bcnn = Helper.BCNN(s1.mau, s2.mau);
        int hs1 = bcnn / s1.mau;
        int hs2 = bcnn / s2.mau;
        s1.tu = s1.tu * hs1;
        s1.mau = bcnn;
        s2.tu = s2.tu * hs2;
        s2.mau = bcnn;
        return s1.toString() + " + " + s2.toString();
    }

    public PhanSo cong(PhanSo ps2) {
        PhanSo kq = new PhanSo(this.tu * ps2.mau + this.mau * ps2.tu, this.mau * ps2.mau);
        kq.rutGonPhanSo();
        return kq;
    }

    public PhanSo tru(PhanSo ps2) {
        PhanSo kq = new PhanSo(this.tu * ps2.mau - this.mau * ps2.tu, this.mau * ps2.mau);
        kq.rutGonPhanSo();
        return kq;
    }

    public PhanSo nhan(PhanSo ps2) {
        PhanSo kq = new PhanSo(this.tu * ps2.tu, this.mau * ps2.mau);
        kq.rutGonPhanSo();
        return kq;
    }

    public PhanSo chia(PhanSo ps2) {
        PhanSo kq = new PhanSo(this.tu * ps2.mau, this.mau * ps2.tu);
        kq.rutGonPhanSo();
        return kq;
    }

}
