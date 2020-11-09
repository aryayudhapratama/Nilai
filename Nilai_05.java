package Nilai;

public class Nilai_05 {

    private int pengetahuan;
    private int keterampilan;

    public Nilai_05 (int nilaiPengetahuan, int nilaiKeterampilan){
        System.out.println("____NILAI PELAJARAN____");
        this.pengetahuan = nilaiPengetahuan;
        this.keterampilan = nilaiKeterampilan;
    }

    //Nilai Rapot
    void getnilai(){
        System.out.println("____NILAI RAPOT____");
        System.out.println("Nilai Pengetahuan =" + this.pengetahuan);
        System.out.println("Nilai Keterampilan =" + this.keterampilan);
    }

    //Konversi Nilai Rapot
    void getkonversi(){
        System.out.println("____NILAI KONVERSI____");

        //Konvesi Pengetahuan
        if (this.pengetahuan <=61){
            System.out.println("Nilai Pengetahuan = D");
        }
        else if(this.pengetahuan <=71){
            System.out.println("Nilai Pengetahuan = C");
        }
        else if(this.pengetahuan <=81){
            System.out.println("Nilai Pengetahuan = B");
        }
        else if(this.pengetahuan <=91){
            System.out.println("Nilai Pengetahuan = B+");
        }
        else if(this.pengetahuan <=101){
            System.out.println("Nilai Pengetahuan = A");
        }

        //Konversi Keterampilan
        if (this.keterampilan <=61){
            System.out.println("Nilai Keterampilan = D");
        }
        else if(this.keterampilan <=71){
            System.out.println("Nilai Keterampilan = C");
        }
        else if(this.keterampilan <=81){
            System.out.println("Nilai Keterampilan = B");
        }
        else if(this.keterampilan <=91){
            System.out.println("Nilai Keterampilan = B+");
        }
        else if(this.keterampilan <=101){
            System.out.println("Nilai Keterampilan = A");
        }
    }
}
