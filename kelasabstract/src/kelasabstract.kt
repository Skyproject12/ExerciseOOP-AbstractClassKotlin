import java.util.*

fun main (args : Array<String>){
        var scan = Scanner (System.`in`)
    var repeat=""
    var nama=""
    var jenisKelamin = ""
    var kodeMakanan = ""
    var kodeMinuman = ""
    var namaMakanan =""
    var namaMinuman =""
    var jumlahMakanan=0.0
    var jumlahMinuman=0.0
    var hargaMakanan=0.0
    var hargaMinuman=0.0
    var umur=0
    var ulang=1
    do {
        println("== Warteg Mr.Kab ==")
        println("=====================")
        println("List Makanan : ");
        println("---------------------")
        println("1. MM1 \t : BASO SAPI -> Rp.5000")
        println("2. MM2 \t : MIE AYAM -> Rp.3000")
        println("======================")
        println("List Minuman : ")
        println("------------------------")
        println("1. NN1 \t: JOSUA -> Rp.1000")
        println("2. NN2 \t: NUTRISARI -> Rp.2000 ")
        println("=======================")
        println(" ")
        println("Silahkan Memesan ")
        println("Nama \t\t")
        nama = scan.next()
        println("Gender(L/P)")
        jenisKelamin=scan.next()
        println("Umur")
        umur=scan.nextInt()
        println("Kode Makanan")
        kodeMakanan=scan.next()
        println("Jumlah")
        jumlahMakanan=scan.nextDouble()
        println("Kode Minuman")
        kodeMinuman=scan.next()
        println("Jumlah")
        jumlahMinuman=scan.nextDouble()
        println("")

        if(kodeMakanan.equals("MM1")){
            namaMakanan="BASO SAPI"
            hargaMakanan=5000.0
        }
        else if (kodeMakanan.equals("MM2")){
            namaMakanan="MIE AYAM"
            hargaMakanan=3000.0
        }
        else {
            namaMakanan="-"
            hargaMakanan=0.0
        }
        if(kodeMinuman.equals("NN1")){
            namaMinuman="JOSSUA"
            hargaMinuman=1000.0
        }
        else if(kodeMakanan.equals("NN2")){
            namaMinuman="NUTRISARI"
            hargaMinuman=2000.0
        }
        else{
            namaMinuman="-"
            hargaMinuman=0.0
        }
        println("================")
        var makanan = Makanan(namaMakanan,hargaMakanan, kodeMakanan)
        var minuman = Minuman(namaMinuman,hargaMinuman, kodeMinuman)
        var pesanan = Pesanan(makanan,minuman)
        pesanan.getJumlahByr(jumlahMakanan,jumlahMinuman)
        var manusia = Manusia (nama, jenisKelamin,umur,pesanan)
        manusia.getPanggilans();
        manusia.tampilPesanan(jumlahMinuman,  jumlahMakanan)
        println()
        println("Ingin Pesan Lagi (y/n) :  ")
        repeat=  scan.next()
        if(repeat.equals("y")){
            ulang=  1
        }
        else {
            ulang=  0
        }
    }while(ulang==1)
}
