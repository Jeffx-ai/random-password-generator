fun main(args: Array<String>) {
    
    var password: String = ""

    var letters: Array<Char> = arrayOf('A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 'T', 't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z')

    var symbols: Array<Char> = arrayOf('~', '`', '!', '@', '#', '№', '$', ';', '%', '^', '&', '?', '*', '(', ')', '-', '_', '=', '+', '[', ']', '{', '}', '|', '/', ':', ',', '<', '.', '>')

    var passwordLength: Int = readLine()!!.toInt()

    for(i in 1..passwordLength)
    {

        var number: Int = (0..2).random()

        if(number == 0)
        {
            password += letters[(0..51).random()]
        }

        else if(number == 1)
        {
            password += symbols[(0..29).random()]
        }

        else if(number == 2)
        {
            password += (0..9).random().toString()
        }

    }

    println("Password: $password")

}
