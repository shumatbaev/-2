fun main(){
println("Введите число")
    val n= readLine().toString().toInt()
    var max=0
    var num=n
    while(num>0){
        val pop=num%10
        if(pop>max){
            max=pop
        }
        num/=10
    }
    println(max)
}