package Conceptos;


public class CasteoDatos {

    public static void main(String[] args) {

        //En un año Ubocar 30 Mascotas
        //cuantos promedio al mes

        double promedioMascotas = 30.0/12.0;
        System.out.println(promedioMascotas);

        //Estimacion no redondea elimina depsues del punto
        int estimatePromedioMascotas = (int)promedioMascotas;
        System.out.println(estimatePromedioMascotas);

        //extactitud
        int a = 30;
        int b = 12;
        System.out.println((double) a/b);

        //forzar el castong ya qie no lo hace desde la raiz
        double c = (double) a/b;
        System.out.println(c);//para tener precision

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);

    }
}
