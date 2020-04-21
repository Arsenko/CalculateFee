package ru.minnullin.hwTwo

import kotlin.math.pow

fun main(){
    val mass:Float=46f;
    val height:Float=1.57f;
    massIndexPrint(mass,height)

}

fun massIndexPrint(mass:Float, height:Float){
    val massIndex:Double=mass/ height.toDouble().pow(2.0)
    when{
        massIndex>=40-> print("Выраженный дефицит массы тела")
        massIndex>=35 && massIndex<40-> print("Недостаточная (дефицит) масса тела")
        massIndex>=30 && massIndex<35-> print("Норма")
        massIndex>=25 && massIndex<30-> print("Избыточная масса тела (предожирение)")
        massIndex>=18.5 && massIndex<25-> print("Ожирение")
        massIndex>=16 && massIndex<18.5-> print("Ожирение резкое")
        massIndex<16-> print("Очень резкое ожирение")
    }
}