package pbo;

//class
public class Prajurit {
//    atribut dan enkapsulasi
    private String nama;
    private String nrp;
    
//    construktor
    public Prajurit(String nama, String nrp) {
        this.nama = nama;
        this.nrp = nrp;
    }
    
//    mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

//    accesor (getter)
    public String getNama() {
        return nama;
    }

    public String getNrp() {
        return nrp;
    }
    
    public String displayInfo(){
       return "Nama: "+getNama()+
              "\nNRP: "+getNrp(); 
    }
    
//    polymorphism (overloading)
    public String displayInfo(String data){
        return displayInfo() + "\nData: "+data;
    }
}
