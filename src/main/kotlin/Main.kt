 import java . util . Scanner

    fun main() {
        val sc = Scanner(System.`in`)
        print("Кол-во элементов последовательности Фибаначчи: \n>")
        val amount = sc.nextInt()
        //if (amout)
        val list = mutableListOf<Long>(0)
        var before: Long = 1
        var bbefore: Long = 0
        var now: Long = 0
        for (i in 1..amount) {
            bbefore = before
            before = now
            now = bbefore + before
            list.add(now)
        }

        println(list.joinToString(", "))
    }
