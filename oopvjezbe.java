import java.util.Scanner;

public class oopvjezbe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nadji sifru koja otvara vrata, na osnovu trocifrenog broja mogu da se otvore vrata tako sto proizvod cifara tog broja oduzmemo broj cifara tog istog broja
        // System.out.print("Unesite trocifreni broj: ");
        // int n = sc.nextInt();

        // if (n < 100 || n > 999) {
        //     System.out.println("Broj nije trocifren!");
        //     return;
        // }

        // int a = n / 100;
        // int b = (n / 10) % 10;
        // int c = n % 10;

        // int proizvod = a * b * c;
        // int brojCifara = 3;

        // int sifra = proizvod - brojCifara;

        // System.out.println("Sifra za otvaranje vrata je: " + sifra);




        // Potrebno je napisati program kojim cemo provjeriti da li ce zavjesa prekriti prozor, poznato je da je oblik zavjese i prozora pravougaonik, za zavjesu i prozor poznata je gornja lijeva i donja desna koordinata 
    //     System.out.println("Unesi gornju lijevu tacku zavjese: (x i y)");
    //     int zx1 = sc.nextInt();
    //     int zy1 = sc.nextInt();
    //     System.out.println("Unesi donju desnu tacku zavjese: (x i y)");
    //     int zx2 = sc.nextInt();
    //     int zy2 = sc.nextInt();
    //     System.out.println("Unesi gornju lijevu tacku prozora: (x i y)");
    //     int px1 = sc.nextInt();
    //     int py1 = sc.nextInt();
    //     System.out.println("Unesi donju desnu tacku prozora: (x i y)");
    //     int px2 = sc.nextInt();
    //     int py2 = sc.nextInt();

    //     if (zx1 <= px1 && zx2 >= px2 && zy1 <= py1 && zy2 >= py2) {
    //         System.out.println("Zavjesa prekriva prozor.");
    //     } else {
    //         System.out.println("Zavjesa ne prekriva prozor.");
    //     }
    // }

        // Napisati program koji racuna povrsinu ekrana monitora pravougaonog oblika ukoliko je poznata duzina njegove dijagonale i odnos stranica. 
        // System.out.println("Unesi duzinu dijagonale monitora: ");
        // double d = sc.nextDouble();
        // System.out.println("Unesi prvi dio odnosa stranica (npr. 16): ");
        // double a = sc.nextDouble();
        // System.out.println("Unesi drugi dio odnosa stranica (npr. 9): ");
        // double b = sc.nextDouble();

        // double povrsina = (d * d) / (a * a + b * b) * a * b;

        // System.out.println("Povrsina ekrana monitora je: " + povrsina);


        // Napisati program koji racuna stepen broja x i n (x je broj koji se stepenuje)
        // System.out.println("Unesi broj koji se stepenuje: ");
        // double x = sc.nextDouble();
        // System.out.println("Unesi stepen: ");
        // int n = sc.nextInt();

        // double rezultat = 1;
        // for (int i = 0; i < n; i++) {
        //     rezultat *= x;
        // }
        // System.out.println(x + " na stepen " + n + " je: " + rezultat);

        
        // Date su cijene tri proizvoda, napisati program koji treba da nadje par proizvoda cija cijena u zbiru daje najvecu vrijednost
        System.out.println("Unesi cijenu prvog proizvoda: ");
        double p1 = sc.nextDouble();
        System.out.println("Unesi cijenu drugog proizvoda: ");
        double p2 = sc.nextDouble();
        System.out.println("Unesi cijenu treceg proizvoda: ");
        double p3 = sc.nextDouble();

        double maxZbir = 0;
        String parProizvoda = "";

        if (p1 + p2 > maxZbir) {
            maxZbir = p1 + p2;
            parProizvoda = "prvi i drugi proizvod";
        }
        if (p1 + p3 > maxZbir) {
            maxZbir = p1 + p3;
            parProizvoda = "prvi i treci proizvod"; 
    }
        if (p2 + p3 > maxZbir) {
            maxZbir = p2 + p3;
            parProizvoda = "drugi i treciproizvod";
        }

        System.out.println("Par proizvoda cija cijena u zbiru daje najvecu vrijednost je: " + parProizvoda + " sa zbirom: " + maxZbir);

        sc.close();
    }

}
