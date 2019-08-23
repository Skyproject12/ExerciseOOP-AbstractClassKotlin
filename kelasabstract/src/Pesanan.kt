class Pesanan  {
    var foods = Makanan()
    var drinks = Minuman ()
    var total =0.000
    constructor(){

    }

    constructor(foods : Makanan, drink : Minuman) {
        this.foods=foods
        this.drinks=drinks
    }

    fun Pesanan (food: Makanan, drink:Minuman){
        this.foods=food
        this.drinks=drink
    }
    fun getFood():Makanan{
        return foods
    }
    fun setFood (foods: Makanan){
        this.foods=foods
    }
    fun getDrink():Minuman{
        return drinks
    }
    fun setDrink (drinks: Minuman){
        this.drinks=drinks
    }
    fun getJumlahByr (jumlahMakanan: Double, jumlahMinuman: Double):  Double{
        total = ((foods.getPrice()*jumlahMakanan)) + (drinks.getPrice()*jumlahMinuman)
        return total
    }
    fun total ()  :  Double {
        return total
    }

}