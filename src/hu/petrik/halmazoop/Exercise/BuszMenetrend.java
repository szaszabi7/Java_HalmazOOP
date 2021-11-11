package hu.petrik.halmazoop.Exercise;

import hu.petrik.halmazoop.Set.Set;

public class BuszMenetrend {

    private static Set<String> hetesBuszMegalloi;
    private static Set<String> otosBuszMegalloi;

    public static void Run() {

        hetesBuszMegalloi = new Set<>();

        hetesBuszMegalloi.add("Albertfalva vasútállomás");
        hetesBuszMegalloi.add("Fonyód utca / Sáfrány utca");
        hetesBuszMegalloi.add("Herend utca");
        hetesBuszMegalloi.add("Nyírbátor utca");
        hetesBuszMegalloi.add("Csurgói út");
        hetesBuszMegalloi.add("Andor utca / Tétényi út");
        hetesBuszMegalloi.add("Bornemissza tér");
        hetesBuszMegalloi.add("Puskás Tivadar utca");
        hetesBuszMegalloi.add("Bikás park M");
        hetesBuszMegalloi.add("Tétényi út 30.");
        hetesBuszMegalloi.add("Szent Imre Kórház");
        hetesBuszMegalloi.add("Karolina út");
        hetesBuszMegalloi.add("Kosztolányi Dezső tér");
        hetesBuszMegalloi.add("Móricz Zsigmond körtér M");
        hetesBuszMegalloi.add("Gárdonyi tér");
        hetesBuszMegalloi.add("Szent Gellért tér - Műegyetem M");
        hetesBuszMegalloi.add("Rudas Gyógyfürdő");
        hetesBuszMegalloi.add("Március 15. tér");
        hetesBuszMegalloi.add("Ferenciek tere M");
        hetesBuszMegalloi.add("Astoria M");
        hetesBuszMegalloi.add("Uránia");
        hetesBuszMegalloi.add("Blaha Lujza tér M");
        hetesBuszMegalloi.add("Huszár utca");
        hetesBuszMegalloi.add("Keleti pályaudvar M");
        hetesBuszMegalloi.add("Reiner Frigyes park");
        hetesBuszMegalloi.add("Cházár András utca");
        hetesBuszMegalloi.add("Stefánia út / Thököly út");
        hetesBuszMegalloi.add("Zugló vasútállomás");
        hetesBuszMegalloi.add("Amerikai út");
        hetesBuszMegalloi.add("Tisza István tér");
        hetesBuszMegalloi.add("Bosnyák tér");
        hetesBuszMegalloi.add("Rákospatak utca / Csömöri út");
        hetesBuszMegalloi.add("Miskolci utca / Csömöri út");
        hetesBuszMegalloi.add("Cinkotai út");
        hetesBuszMegalloi.add("Molnár Viktor utca");
        hetesBuszMegalloi.add("Apolló utca");
        hetesBuszMegalloi.add("Madách utca");
        hetesBuszMegalloi.add("Fő tér");
        hetesBuszMegalloi.add("Vásárcsarnok");
        hetesBuszMegalloi.add("Újpalota, Nyírpalota út");

        otosBuszMegalloi = new Set<>();

        otosBuszMegalloi.add("Pasaréti tér");
        otosBuszMegalloi.add("Harangvirág utca");
        otosBuszMegalloi.add("Virág árok");
        otosBuszMegalloi.add("Gábor Áron utca / Pasaréti út");
        otosBuszMegalloi.add("Júlia utca");
        otosBuszMegalloi.add("Vasas sportpálya");
        otosBuszMegalloi.add("Városmajor");
        otosBuszMegalloi.add("Nyúl utca");
        otosBuszMegalloi.add("Széll Kálmán tér M (Csaba) utca)");
        otosBuszMegalloi.add("Körmöci utca");
        otosBuszMegalloi.add("Korlát utca");
        otosBuszMegalloi.add("Mikó utca");
        otosBuszMegalloi.add("Alagút utca");
        otosBuszMegalloi.add("Dózsa György tér");
        otosBuszMegalloi.add("Döbrentei tér");
        otosBuszMegalloi.add("Március 15. tér");
        otosBuszMegalloi.add("Ferenciek tere M");
        otosBuszMegalloi.add("Astoria M");
        otosBuszMegalloi.add("Uránia");
        otosBuszMegalloi.add("Blaha Lujza tér M");
        otosBuszMegalloi.add("Huszár utca");
        otosBuszMegalloi.add("Keleti pályaudvar M");
        otosBuszMegalloi.add("Reiner Frigyes park");
        otosBuszMegalloi.add("Cházár András utca");
        otosBuszMegalloi.add("Stefánia út / Thököly út");
        otosBuszMegalloi.add("Zugló vasútállomás");
        otosBuszMegalloi.add("Korong utca");
        otosBuszMegalloi.add("Erzsébet királyné útja, aluljáró");
        otosBuszMegalloi.add("Laky Adolf utca");
        otosBuszMegalloi.add("Nagy Lajos király útja / Czobor utca");
        otosBuszMegalloi.add("Fűrész utca");
        otosBuszMegalloi.add("Rákospatak utca");
        otosBuszMegalloi.add("Miskolci utca");
        otosBuszMegalloi.add("Öv utca");
        otosBuszMegalloi.add("Tóth István utca");
        otosBuszMegalloi.add("Vág utca");
        otosBuszMegalloi.add("Opál utca");
        otosBuszMegalloi.add("Széchenyi út");
        otosBuszMegalloi.add("Szent Korona útja");
        otosBuszMegalloi.add("Wesselényi utca");
        otosBuszMegalloi.add("Szerencs utca");
        otosBuszMegalloi.add("Rákos úti szakrendelő");
        otosBuszMegalloi.add("Illyés Gyula utca");
        otosBuszMegalloi.add("Epres sor");
        otosBuszMegalloi.add("Juhos utca");
        otosBuszMegalloi.add("Kossuth utca, lakótelep");
        otosBuszMegalloi.add("Rákospalota, Kossuth utca");

        System.out.println(String.format("%d db helyen áll meg a 7es busz.", hetesBuszMegalloi.getSize()) );
        System.out.println(String.format("%d db helyen áll meg a 5os busz.", otosBuszMegalloi.getSize()) );

        Set<String> kozosMegallok = hetesBuszMegalloi.intersect(otosBuszMegalloi);
        System.out.println(String.format("%d db helyen van közös megállója az 5-ös és 7-es busznak.", kozosMegallok.getSize()) );

        System.out.println("Közösmegállók:");
        System.out.println(kozosMegallok);

    }
}
