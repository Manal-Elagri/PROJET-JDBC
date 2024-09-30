# Projet à Soumettre : Suivi des Scripts des Développeurs

## Description
Ce projet a pour objectif de suivre l'avancement des scripts développés par les membres d'une équipe. Chaque semaine, le chef de projet rédige un rapport qui compile le nombre de scripts réalisés quotidiennement par les développeurs. Les données sont stockées dans une base de données MySQL, et l'application utilise JDBC pour les opérations de gestion.

## Structure de la Base de Données
- *Table :* devdata
- *Colonnes :*
  - Développeur (VARCHAR)
  - Jour (VARCHAR)
  - NBScripts (INT)

### Exemple de Données :
| Développeur | Jour    | NBScripts |
|-------------|---------|-----------|
| ALAMI       | Lundi   | 2         |
| WAFI        | Lundi   | 1         |
| SALAMI      | Mardi   | 9         |

## Technologies Employées
- *Langage :* Java
- *Base de Données :* MySQL
- *JDBC :* Pour l'interaction avec la base de données

## Étapes pour Lancer l’Application
1. Cloner le dépôt depuis GitHub.
2. Créer la base de données et la table conformément à la structure définie dans le fichier SQL.
3. Ajuster les informations de connexion dans le fichier Java (URL, nom d'utilisateur, mot de passe).
4. Compiler et exécuter le programme Java pour interagir avec la base de données et suivre les scripts des développeurs.

## Vidéo 

https://github.com/user-attachments/assets/960bf00f-6928-473b-be65-e8704af0a924


# TP JDBC 

## Description
Ce TP vise à concevoir l' insertion et la récupération des données

## Structure de la Base de Données
- *Table :* site
- *Colonnes :*
  - id (INT, clé primaire) : Identifiant unique de la ville
  - nom (VARCHAR) : Nom de la ville

### Exemples de Données :
| id  | nom        |
|-----|------------|
| 1   | SAFI       |
| 2   | MARRAKECH  |
| 3   | EL JADIDA  |

Ces données représentent les villes présentes dans la base.

## Vidéo

https://github.com/user-attachments/assets/e05e1cab-3b80-4e1a-9da5-0263454e34b3




