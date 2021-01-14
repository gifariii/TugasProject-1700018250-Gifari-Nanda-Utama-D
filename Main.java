package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        tanggal t = new tanggal();

        System.out.print("Masukkan tanggal awal : ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("Masukkan bulan awal : ");
        double b = Double.parseDouble(br.readLine());
        System.out.print("Masukkan tahun awal : ");
        double c = Double.parseDouble(br.readLine());
        System.out.print("Masukkan tanggal akhir : ");
        double a1 = Double.parseDouble(br.readLine());
        System.out.print("Masukkan bulan akhir : ");
        double b1 = Double.parseDouble(br.readLine());
        System.out.print("Masukkan tahun akhir : ");
        double c1 = Double.parseDouble(br.readLine());

        t = new tanggal(a,b,c,a1,b1,c1);
        System.out.println();

        System.out.println("hasil : "); t.selisih();


    }
}
