package media

import Media
import Consultable
import Empruntable

class Dvd(titre: String, dateDeParution: String, private val dureeEnSecondes: Int, private val genre: String) :
    Media(titre, dateDeParution),
    Consultable,
    Empruntable
{
    override var estEmprunte: Boolean = false

    override fun afficher(): Unit {
        val heures = dureeEnSecondes / 3_600
        val minutes = (dureeEnSecondes % 3_600) / 60
        val secondes = dureeEnSecondes % 60
        println("DVD: Titre = '${titre}', Durée = '${heures}h:${minutes}m:${secondes}s', Genre = '${genre}'")
    }

    override fun consulter(): Unit {
        println("Le DVD '${titre}' est consulté sur place.")
    }

    override fun emprunter(): Boolean {
        if (super.emprunter()) {
            println("Le DVD '${titre}' a été emprunté.")
            return true
        } else {
            println("Le DVD '${titre}' est déjà emprunté !")
            return false
        }
    }

    override fun retourner(): Boolean {
        if (super.retourner()) {
            println("Le DVD '${titre}' a été retourné.")
            return true
        } else {
            println("Le DVD '${titre}' est déjà retourné !")
            return false
        }
    }
}
