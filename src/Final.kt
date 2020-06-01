import java.util.*

fun randomSuffix() : String {
    val suffix= arrayOf ("Cool", "Official", "Ninja", "")
    return suffix[Random().nextInt(suffix.size)]
}

fun indexmatcher(index: Int, i: Int) = index == i

fun email(name:String) {
    var delimiter = " "
    val parts = name.split(delimiter)
    val index=Random().nextInt(parts.size)
    var ans = ""
    for((i,x) in parts.withIndex())
    {
        if(indexmatcher(index,i))
            ans = ans + x.get(0)
        else
            ans = ans + x
    }
    val mail: (String) -> String = { ans -> ans + randomSuffix() + "@gmail.com" }
    ans = mail(ans)
    print("Generated email : $ans")
}
fun main(args: Array<String>) {
    print("Enter your full name: ")
    var name = readLine()
    if(name.isNullOrEmpty())
        print("You entered an invalid name!")
    else
        email(name)
}