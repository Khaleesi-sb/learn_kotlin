data class Book(val name : String, val price: Int)

// does not get any instances created.
object BookSelf { // Its a Singleton
    var books = arrayListOf<Book>() // Only one instance exists.
    fun showBooks(){ // It is created lazily (when first used).
        for(i in books){ // You don't need to write a constructor or getInstance() method.
            println(i)
        }
    }
}

fun main() {
    BookSelf.books.add(Book("Java", 50))
    BookSelf.books.add(Book("Dart", 30))
    BookSelf.books.add(Book("Kotlin", 45))
    BookSelf.showBooks()
}