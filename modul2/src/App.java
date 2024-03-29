class mobil{
    String merk;
    int jumlahRoda;
    static String var1="awokwkkwkwkw";

    mobil(String merk, int jumlahRoda){
        this.merk=merk;
        this.jumlahRoda=jumlahRoda;
    }

    static void showVar1(){
        System.out.println(var1);
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        mobil mobil1=new mobil("BMW", 4);
        System.out.print("Mobil ini bermerk : ");
        System.out.println(mobil1.merk);
        System.out.print("Mobil ini berroda : ");
        System.out.println(mobil1.jumlahRoda);

        System.out.print("ini tambahan : ");
        mobil.showVar1();
    }
}
