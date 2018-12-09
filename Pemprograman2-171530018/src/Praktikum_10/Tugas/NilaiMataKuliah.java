/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_10.Tugas;

/**
 *
 * @author Martono
 */
public class NilaiMataKuliah extends Matakuliah {
    public Double bobot_uts;
    public Double bobot_uas;
    public Double bobot_lain2;
    public Double nilai_uts;
    public  Double nilai_uas;
    public  Double nilai_lain2;
    public  Double nilai_akhir;
    public  String grade;
   
     Mahasiswa mhs;
   

    public NilaiMataKuliah() {     
       
    }
    public Double hitungNilai(){
        nilai_akhir=((0.3*nilai_uts)+(0.3*nilai_uas)+(0.4*nilai_lain2));
        return nilai_akhir;
    }
    public void hitungGrade(){
        if (nilai_akhir >= 80 && nilai_akhir <=100){
            System.out.println("Grade A");
        }else if (nilai_akhir >=76 && nilai_akhir <=79){
            System.out.println("Grade AB");
        }else if (nilai_akhir >=70 && nilai_akhir <=75){
            System.out.println("Grade B");
        }else if (nilai_akhir >=66 && nilai_akhir <=69){
            System.out.println("Grade BC");
        }else if (nilai_akhir >=60 && nilai_akhir <=65){
            System.out.println("Grade C");
        }else if (nilai_akhir >=56 && nilai_akhir <=59){
            System.out.println("Grade CD");
        }else if (nilai_akhir >=50 && nilai_akhir <=55){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade E");
        }
    }

}
