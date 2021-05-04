def fib(n){
    a=0
    b=1
    println("the fibonacci series are ")
    while(b < n) {
        t = a
        a = b
        b = a + t
        println(a)
    }
    }
fib(100)