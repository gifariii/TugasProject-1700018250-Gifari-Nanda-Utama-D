package com.company;

public class tanggal implements Operasi {
    private double tgl_start;
    private double bln_start;
    private double th_start;
    private double tgl_end;
    private double bln_end;
    private double th_end;

    tanggal() {

    }


    tanggal(double a, double b, double c, double a1, double b1, double c1) {
        this.tgl_start = a;
        this.bln_start = b;
        this.th_start = c;
        this.tgl_end = a1;
        this.bln_end = b1;
        this.th_end = c1;

    }

    public void selisih() {
        if ((tgl_end > tgl_start) && (bln_end > (bln_start - 1))) {
            System.out.println(tgl_start + 30 - tgl_end + "hari");
            System.out.println((bln_start - 1) + 12 - bln_end + "bulan");
            System.out.println((th_start - 1) - th_end + "tahun");
        } else if ((tgl_end > tgl_start) && (bln_end <= (bln_start - 1))) {
            System.out.println(tgl_start + 30 - tgl_end + "hari");
            System.out.println(bln_start - 1 - bln_end + "bulan");
            System.out.println(th_start - th_end + "tahun");
        } else if ((tgl_end <= tgl_start) && (bln_end > bln_start)) {

            System.out.println(tgl_start - tgl_end + "hari");
            System.out.println(bln_start + 12 - bln_end + "bulan");
            System.out.println((th_start - 1) - th_end + "tahun");
        } else {
            System.out.println(tgl_start - tgl_end + "hari");
            System.out.println(bln_start - bln_end + "bulan");
            System.out.println(th_start - th_end + "tahun");
        }
    }
}

