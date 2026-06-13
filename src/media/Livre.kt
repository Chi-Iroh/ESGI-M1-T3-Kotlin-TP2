package media

import Media
import Consultable
import Empruntable

class Livre(private val titre: String, private val dateDeParution: String, private val auteur: String, private val editeur: String) :
    Media(titre, dateDeParution),
    Consultable,
    Empruntable
{
    override var estEmprunte: Boolean = false

    override fun afficher(): Unit {
        println("Livre: Titre = '${titre}', Auteur = '${auteur}', Éditeur = '${editeur}', Date de parution = '${dateDeParution}'")
    }

    override fun consulter(): Unit {
        println("Le livre '${titre}' de '${auteur}' est consulté sur place.")
    }

    override fun emprunter(): Boolean {
        if (super.emprunter()) {
            println("Le livre '${titre}' de '${auteur}' a été emprunté.")
            return true
        } else {
            println("Le livre '${titre}' de '${auteur}' est déjà emprunté !")
            return false
        }
    }

    override fun retourner(): Boolean {
        if (super.retourner()) {
            println("Le livre '${titre}' de '${auteur}' a été retourné.")
            return true
        } else {
            println("Le livre '${titre}' de '${auteur}' est déjà retourné !")
            return false
        }
    }
}
