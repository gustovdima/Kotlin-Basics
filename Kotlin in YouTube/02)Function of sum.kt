object Main {
    //Создайте функцию sum которая будет возвращать сумму двух чисел
    
    @JvmStatic
    fun main(args:Array<String>){
        print(sum(1,2))
    }

    fun sum(a: Int,b: Int) : Int = a + b
}
