#sujet f



# Films

Retourner les films prochainement diffusés selon le site Allocine.

## Requête HTTP
GET /films
Pour récupérer les films prochainement (?) diffusés au format RSS, http://rss.allocine.fr/ac/cine/prochainement?format=xml

URL API

https://qlyqjipa58.execute-api.us-east-1.amazonaws.com/prod/films


## Réponse HTTP : 200
{
  "Response":"200",
    "films":[
        {
            "categorie":"Animation",
            "description":"<p>À la suite d’une chute lors de la cueillette du gui,...",
            "titre":"Astérix - Le Secret de la Potion Magique"
        },
        {

        }
    ]
}


##Réponse HTTP : error 500
{
  "Response":"500",
  "error": "Le serveur à rencontrer une erreur"
}


##Réponse HTTP : error 502/503
{
  "Response":"502/503",
  "error": "Le serveur ne répond pas ou est indisponible"
}


##Réponse HTTP error 504
{
  "Response":"504",
  "error": "Le temps d'attente pour atteindre le serveur a expiré"
}