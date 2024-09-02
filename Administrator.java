/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasMandiri2PBO;

/**
 *
 * @author Bintang
 */
// Nama: Ahmad Bintang Asyrof Sanny
// NIM: (09040623053)

// Penjelasan: 
// Kelas `Administrator` adalah subclass dari `Faculty` yang menambahkan atribut `responsibility`. 
// Ini adalah contoh dari pewarisan berlapis (multi-level inheritance).

public class Administrator extends Faculty {
    private String responsibility;

    public Administrator(String name, String NIM, String department, String rank, String responsibility) {
        super(name, NIM, department, rank);
        this.responsibility = responsibility;
    }

    @Override
    public void getInformation() {
        super.getInformation();
        System.out.println("Responsibility: " + responsibility);
    }
}
