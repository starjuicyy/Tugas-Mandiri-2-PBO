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
// Kelas `CommunityMember` adalah kelas dasar (superclass) yang mewakili semua anggota komunitas di kampus. 
// Kelas ini menunjukkan konsep enkapsulasi dengan atribut yang disembunyikan menggunakan akses `protected`.

public class CommunityMember {
    protected String name;
    protected String NIM;

    public CommunityMember(String name, String NIM) {
        this.name = name;
        this.NIM = NIM;
    }

    public void getInformation() {
        System.out.println("Name: " + name + ", NIM: " + NIM);
    }
}
