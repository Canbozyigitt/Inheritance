public class Main {
    public static void main(String[] args) {
        Calisan c1=new Calisan("cano bozyiğit","054646964","cano@boz.dev");
        Akademisyen a1= new Akademisyen("hayta","0556484518","hayta@egemen.dev","ceng","docent");
        Memur m1=new Memur("ahmet","054546584","ahmet@info.dev","gang","4");
        m1.calis();

        System.out.println(a1.getEposta());
        a1.derseGir();


    }

    }
