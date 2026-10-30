public class VolumeBangunRuang {
    public static void main(String[] args) {
        { // 1. Volume Kubus
            int s1 = 2;
            int s2 = 4;
            int s3 = 6;
            int VKubus = s1 * s2 * s3;
            System.out.println("Volume Kubus = " + VKubus);
        }
        { // 2. Volume Balok
            int p = 3;
            int l = 5;
            int t = 7;
            int VBalok = p * t * l;
            System.out.println("Volume Balok = " + VBalok);
        }
        { // 3. Volume Prisma Segitiga
            int LAlas = 8;
            int t = 8;
            int VPrismaSegitiga = LAlas * t;
            System.out.println("Volume Prisma Segitiga = " + VPrismaSegitiga);
        }
        { // 4. Volume Tabung
            int r1 = 7;
            int r2 = 4;
            int t = 5;
            double VTabung = 22.0 / 7.0 * r1 * r2 * t;
            System.out.println("Volume Tabung = " + VTabung);
        }
        { // 5. Volume Bola
            int r1 = 3;
            int r2 = 4;
            int r3 = 7;
            double VBola = 4.0 / 3.0 * r1 * 22.0 / 7.0 * r3 * r2;
            System.out.println("Volume Bola = " + VBola);
        }
        { // 6. Volume Limas
            int LAlas = 6;
            int t = 6;
            double VLimas = 1.0 / 3.0 * LAlas * t;
            System.out.println("Volume Limas = " + VLimas);
        }
    }
}
