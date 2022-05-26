import test.outputNum.printCurrentCount
    /*
    1.  화면에 숫자 0을 기본 값으로 출력한다.
    2. +가 입력되면 숫자가 1 증가한다.
    3. -가 읿력되면 숫자가 1 감소한다.
    4. 0에서는 음수로 숫자가 감소하지 않는다.
    5. 1을 입력하면 프로그램이 종료된다.
     */

    object inputView{
        fun readCountControlSymbol()  = readLine() ?:"null 값 입니다."  //숫자값을 변경할 수 있는 기호를 입력받는 일
    }

    object outputNum{
        fun printCurrentCount(num:Int){
            println(num)    //숫자값을 출력
        }
    }

    class Counter{
        var num = 0 //현재 어떤 숫자값 저장하는 일

        fun decraseCount(){
            {        //숫자값을 감소 시켜주는 일
                if(num>0) num--
            }
        }

        fun incraseCount(){
            num++    //숫자값을 증가시켜주는 일
        }
    }
}
fun main(){
    while(true){    //프로그램이 1을 입력받기 전까지 돌아가도록 하는 일
        printCurrentCount(3)
        when(inputView.readCountControlSymbol()){
            "+" -> Counter().incraseCount()
            "-" -> Counter().decraseCount()
            "1" -> return   //프로그램을 종료해주는 일
            else ->throw java.lang.IllegalArgumentException("처리할 수 없는 입력 ")
        }
    }
}


/*밖에서 못건들이게 하는거
private var _count =0       내부에서는 변경할 수 있는 친구
val count get() = _count    밖에 공개하고 싶은 친구
엘비스 연산자 디폴트 값 넣어주는 것
원시타입에서는 ltateinit이 사용 안됨
    */
