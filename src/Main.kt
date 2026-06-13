import media.Livre
import media.Magazine

fun main() {
    val bibliotheque = Bibliotheque()
    val livre = Livre("1984", "1972-01-01", "George Orwell", "Gallimard")
    val magazine = Magazine("National Geography", "2024-10-28", "10")

    // On emprunte et consulte
    bibliotheque.emprunter(livre)
    bibliotheque.consulter(magazine)

    // On vérifie que les médias sont bien empruntés
    bibliotheque.afficherEmprunts()

    // On rend les médias
    bibliotheque.retourner(livre)

    // On vérifie qu'ils ont tous été rendus
    bibliotheque.afficherEmprunts()
}
