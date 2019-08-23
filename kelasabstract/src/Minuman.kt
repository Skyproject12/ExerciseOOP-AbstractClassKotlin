class Minuman {
    var name=""
    var harga=0.0
    var kodeMinuman=""

    constructor(){
    }

    constructor(name: String,price : Double, kodeMinuman : String){
        this.name =name
        this.harga=price
        this.kodeMinuman=kodeMinuman
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

    fun getCodeMinuman():String  {
        return kodeMinuman
    }
    fun setCodeMinuman(kodeMinuman: String) {
        this.kodeMinuman=kodeMinuman
    }
}