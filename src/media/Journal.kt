package media

import Media
import Consultable

class Journal(private val titre: String, private val dateDeParution: String) :
    Media(titre, dateDeParution),
    Consultable
{
    override fun afficher(): Unit {
        println("Journal: Titre = '${titre}', Date de parution = '${dateDeParution}'")
    }

    override fun consulter(): Unit {
        println("Le journal '${titre}' du '${dateDeParution}' est consulté sur place.")
    }
}
