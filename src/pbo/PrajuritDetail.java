package pbo;
//inheritance
public class PrajuritDetail extends Prajurit{
//    overriding
    public PrajuritDetail(String nama, String nrp) {
        super(nama, nrp);
    }
    
    public String getPangkat(){
        String kodePangkat = getNrp().substring(0, 2);
//        seleksi switch
        switch (kodePangkat){
            case "31":
                return "TAMTAMA";
            case "21":
                return "BINTARA";
            case "11":
                return "PERWIRA";
            default:
                return "PANGKAT TIDAK TERDETEKSI";
        }
    }
    
    
     public String getKesatuan(){
        String kodeKesatuan = getNrp().substring(2, 5);
//        seleksi switch
        switch (kodeKesatuan){
            case "411":
                return "INFANTERI";
            case "522":
                return "ARTILERI";
            case "633":
                return "KAVALERI";
            default:
                return "KESATUAN TIDAK TERDETEKSI";
        }
    }
     
     
    public int getTahunLahir() {
        return Integer.parseInt(getNrp().substring(5, 7)) + 1900;
    }
    
//    polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo() +
                "\nPangkat: "+getPangkat()+
                "\nKesatuan: "+getKesatuan()+
                "\nTahun Lahir: "+getTahunLahir();
    }
}

