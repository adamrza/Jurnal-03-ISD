import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>("Data");
        Scanner s = new Scanner(System.in);

        boolean condition = true;
        while (condition) {
            System.out.println("Pilih menu: ");
            System.out.println("1. Input Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cetak");
            System.out.println("4. Keluar");
            int pick = s.nextInt();
            switch (pick) {
                case 1:
                    System.out.println("Masukkan data (nip, nama, divisi)");
                    String nip = s.next();
                    String nama = s.next();
                    String divisi = s.next();
                    System.out.println("Tambah data di awal list? (y/n)");
                    if (s.next().equalsIgnoreCase("y")) {
                        linkedList.insertAtFront(new Pegawai(nip, nama, divisi));
                    } else {
                        linkedList.insertAtBack(new Pegawai(nip, nama, divisi));
                    }
                    break;
                case 2:
                    System.out.println("Hapuskan data di akhir list? (y/n)");
                    if (s.next().equalsIgnoreCase("n")) {
                        linkedList.removeFromFront();

                    } else {
                        linkedList.removeFromBack();
                    }
                    break;
                case 3:
                    linkedList.print();
                    break;
                default:
                    condition = false;
            }
            System.out.println("Pilih menu: ");
            System.out.println("1. Input Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cetak");
            System.out.println("4. Keluar");
        }
    }

}

