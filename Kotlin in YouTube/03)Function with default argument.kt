object Main {
//Создайте функцию log с 2 аргументами header:String и body:String и аргумент body должен иметь дефолтное значение

    @JvmStatic
    fun main(args:Array<String>){
        log("header1")
        log("header2","body2")
    }

    fun log(header:String,body:String = ""){
        if(header.isEmpty()){
            print(header)
        }
        if(body.isEmpty()){
            print(body)
        }
    }
}
