package  library

interface LibrarySystem
{
    fun newest(new:String)
    fun lending(bookname: String)
    fun returning(returnbook:String)
}



class books(var bookname:String,var idea:String):LibrarySystem
{
    var booktitle:String =""
    var bloob:String=bookname
    override fun lending(bookname:String) {
        var booktitle=bookname
        if(booktitle==bloob)
        {
            println("you can lend $bookname")
        }
        else
        {
            println("Sorry you cant lend book $booktitle its not in the system")
        }


    }
    override fun returning(returnbook: String)
    {

    }
    override fun newest(new:String)
    {

    }
}
class Users(var username:String):LibrarySystem
{

    override fun lending(bookname:String)
    {

    }
    override fun returning(returnbook: String)
    {

    }
    override fun newest(new: String)
    {

    }

}

fun main(args: Array<String>) {
    // var user1 = Users("johnny")

    var book1 = books("switch hero","123bk")
    book1.lending("switch hero")

}