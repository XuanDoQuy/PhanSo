public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(10,15);
        PhanSo ps2 = new PhanSo(4,7);
        ps1.rutGonPhanSo();
        System.out.println(ps1.toString());
        ps2.rutGonPhanSo();
        System.out.println(ps2.toString());
        System.out.println(ps1.cong(ps2));
        System.out.println(ps1.tru(ps2));
        System.out.println(ps1.nhan(ps2));
        System.out.println(ps1.chia(ps2));
    }
}
