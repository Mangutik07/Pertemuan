import java.text.DecimalFormat;
import java.util.Scanner;

public class konvertSuhu {
    private Double Hasil,C,F;
    int opsi;

    Scanner input = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("##.##");

    public void SetC(Double Nilai){
        this.C = Nilai;
    }
    public void SetF(Double Nilai){
        this.F = Nilai;
    }

    public void ShowOpsi(){
        System.out.print("Masukan Opsi: ");
        this.opsi = input.nextInt();
        if (opsi == 1){
            System.out.print("Masukan Nilai C: ");
            this.SetC(input.nextDouble());
            this.ConvertC();
            this.hasilConvert();
        }else if (opsi == 2){
            System.out.print("Masukan Nilai F: ");
            this.SetF(input.nextDouble());
            this.ConvertF();
            this.hasilConvert();
        }else{
            System.out.println("Opsi Tidak Tersedia");
        }
    }

    private void ConvertC(){
        // konversi suhu dari C ke F dengan rumus : ( C*9/5 ) + 32
        this.Hasil = (this.C*9/5)+32;
    }

    private void ConvertF(){
        // konversi suhu dari F ke C dengan rumus : ( F-32 ) * 5/9
        this.Hasil = (this.F-32)*5/9;
    }

    public void hasilConvert(){
        if (opsi == 1){
            System.out.println("Nilai Dalam F: " + this.Hasil);
        }else if(opsi == 2){
            System.out.println("Nilai Dalam C: " + df.format(this.Hasil));
        }
    }
}
