package hu.petrik.halmazoop.Exercise;

import hu.petrik.halmazoop.Set.Set;

public class BuszMenetrend {

    private static Set<String> hetesBuszMegalloi;
    private static Set<String> otosBuszMegalloi;

    public static void Run() {

        hetesBuszMegalloi = new Set<>();

        //adat itt

        otosBuszMegalloi = new Set<>();

        //adat itt is

        Set<String> kozosMegallok = hetesBuszMegalloi.intersect(otosBuszMegalloi);
        System.out.println(String.format("%d db hely közös", kozosMegallok.getSize()));

        System.out.println("Közös mehállók:");
        System.out.println(kozosMegallok);
    }
}
