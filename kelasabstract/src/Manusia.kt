class Manusia  {
    var nama=""
    var jenisKelamin=""
    var panggilan=""
    var umur=0
    var pesanan = Pesanan()

    constructor(nama: String, jenisKelamin: String,  umur: Int, pesanan : Pesanan)  {
        this.nama=nama
        this.jenisKelamin=jenisKelamin
        this.umur=umur
        this.pesanan=pesanan
    }

    fun getNamas():String{
        return nama
    }
    fun setNamas(nama:String){
        this.nama=nama
    }
    fun getJeniskelamin () : String {
        return jenisKelamin  ;
    }
    fun setJeniskelamin  (jenisKelamin  : String) {
        this.jenisKelamin = jenisKelamin
    }
    fun getPanggilans():String{
        if(15 > umur){
            if("L".equals(jenisKelamin) || "P".equals(jenisKelamin)){
                panggilan="Adek"
            }
        }
        else if(umur > 15 || umur <30){
            if("L".equals(jenisKelamin)){
                panggilan="Mas"
            }
            else{
                panggilan="Mba"
            }
        }
        else if(umur >30 || umur < 50 ){
            if("L".equals(jenisKelamin)){
                panggilan="Bapan"
            }
            else{
                panggilan="Ibu"
            }
        }
        else if(umur>50){
            if("L".equals(jenisKelamin)){
                panggilan="Kakek"
            }
            else{
                panggilan="Nenek"
            }
        }
        return panggilan
    }
    fun setPanggilans (panggilan:  String){
        this.panggilan=panggilan
    }
    fun getUmurs ()  :  Int {
        return umur  ;
    }
    fun setUmurs  (umur : Int){
        this.umur=umur
    }
    fun getPesanans():Pesanan {
        return pesanan
    }
    fun setPesanans(pesanan: Pesanan){
        this.pesanan=pesanan
    }

    fun tampilPesanan(jumlahMakanan:  Double, jumlahMinuman:  Double ){
        println("Pesanan"+panggilan+" "+nama)
        println("Makanan"+pesanan.foods.getNama())
        println("Jumlah Makanan"+jumlahMakanan)
        println("Jumlah Minuman"+jumlahMinuman)
        println("Bayar"+pesanan.total)
        println("Minuman"+pesanan.drinks.getNama())
    }

}