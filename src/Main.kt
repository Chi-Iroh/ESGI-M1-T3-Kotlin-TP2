import media.Livre
import media.Magazine

fun main() {
    val livre = Livre("1984", "1972-01-01", "George Orwell", "Gallimard")
    val magazine = Magazine("National Geography", "2024-10-28", "10")

    livre.afficher()
    livre.consulter()
    livre.emprunter()
    livre.retourner()

    magazine.afficher()
    magazine.consulter()
}
