public class ApotekBCM {
    public static void main(String[] args){
        Obat Kolesterol = new Obat();
        Kolesterol.nama = "Simvastatin 10 mg";
        Kolesterol.harga = "5000";
        Kolesterol.kategori = "Obat Keras";

        Obat DarahTinggi = new Obat();
        DarahTinggi.nama = "Amlodipine 5 mg";
        DarahTinggi.harga = "5500";
        DarahTinggi.kategori = "Obat Keras";

        System.out.println(Kolesterol.harga);

        Kolesterol.mendapatkanDiskon();
        System.out.println(Kolesterol.harga + DarahTinggi.harga);
    }
}
