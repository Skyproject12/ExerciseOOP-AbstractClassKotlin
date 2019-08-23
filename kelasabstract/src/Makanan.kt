class Makanan {
    var name=""
    var harga=0.0
    var kodeMakanan=""

    constructor(){

    }

    constructor(name: String,price : Double, kodeMakanan : String){
        this.name =name
        this.harga=price
        this.kodeMakanan=kodeMakanan
    }

    fun getNama():String  {
        return name
    }

    fun setNama(nama:String) {
        this.name=nama
    }

    fun getPrice():Double  {
        return harga
    }
    fun setPrice(price:Double) {
        this.harga=price
    }

    fun getCodeMakanan():String  {
        return kodeMakanan
    }
    fun setCodeMakanan(kodeMakanan: String) {
        this.kodeMakanan=kodeMakanan
    }
}