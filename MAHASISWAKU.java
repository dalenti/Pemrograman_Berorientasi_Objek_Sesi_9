/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapbo09;
/**NO.1
 *
 * @author LENOVO
 */
public class MAHASISWAKU {
   public static void main(String[] args) {
        Mahasiswa <String,String, Integer> m = new Mahasiswa <>();
        m. setNim("1102020");
        m. setName ("Ferdi");
        m. setClas(21);
        
        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}
class Mahasiswa <A,B,C> {

    private A nim;
    private B name;
    private C clas;
    
    public void setNim(A nim) {
        this.nim = nim;
    }
    
    public void setName(B name) {
        this.name = name;
    }
    
    public void setClas(C clas) {
        this.clas = clas;
    }
    
    public A getNim() {
        return this.nim;
    }
    
    public B getName() {
        return this.name;
    }
    
    public C getClas() {
        return this.clas;
    }
    
}
