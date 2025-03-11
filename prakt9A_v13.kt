// Использование класса товар
fun main() {
    val tovar1 = Tovar("Книга", 500.0, "шт", "Книги", 10)
    val produkt1 = Produkt("Молоко", 50.0, "л", "Продукты питания", 20, "10 дней")
    val Nofood1 = Nofood("Телевизор", 80050.0, "шт", "Техника", 1, "2 года")
    println(tovar1.Inf())
    println(produkt1.Inf())
    println(Nofood1.Inf())
}