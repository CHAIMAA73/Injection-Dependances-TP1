# Activité Pratique N°1 - Injection des Dépendances

## Nom et Classe
- Nom : Chaimaa Zandar
- Filiére : GLSID II


---

## Objectif
L'objectif de ce TP est de comprendre et mettre en œuvre l'injection des dépendances en Java.  
Cette pratique permet de réduire le couplage entre les classes, d'améliorer la maintenabilité du code et de faciliter l'évolution du projet.

---

## Partie 1 : Description des étapes

1. **Créer l'interface IDao avec une méthode getData**
    - Cette interface définit le contrat pour accéder aux données.
    - Elle permet de séparer l'accès aux données de leur utilisation dans la logique métier.

2. **Créer une implémentation de cette interface**
    - L'implémentation concrète fournit les données réelles ou simulées.
    - Elle peut être modifiée sans affecter la logique métier grâce à l'interface.

3. **Créer l'interface IMetier avec une méthode calcul**
    - Cette interface représente la logique métier du projet.
    - Elle définit les opérations principales qui utilisent les données fournies par le DAO.

4. **Créer une implémentation de cette interface en utilisant le couplage faible**
    - L'implémentation dépend uniquement des interfaces, et non des classes concrètes.
    - Cela permet de remplacer facilement une implémentation par une autre sans modifier le reste du code.

5. **Faire l'injection des dépendances**  
   a. **Par instanciation statique**
    - Les objets nécessaires sont créés manuellement dans le code et injectés dans la classe dépendante.
    - Simple mais peu flexible, toutes les dépendances sont définies au moment de la compilation.

   b. **Par instanciation dynamique**
    - Les objets sont créés dynamiquement, par exemple via reflection ou configuration externe.
    - Plus flexible, permet de changer les implémentations sans modifier le code principal.

   c. **En utilisant le Framework Spring**
    - **Version XML** : Définition des beans et de leurs relations dans un fichier XML, Spring gère automatiquement l’injection des dépendances.
    - **Version annotations** : Utilisation d’annotations (`@Component`, `@Autowired`) pour que Spring détecte et injecte automatiquement les dépendances au démarrage de l’application.

---

## Conclusion
Cette activité pratique permet de comprendre différentes méthodes pour gérer les dépendances dans un projet Java.
- L’injection statique est simple mais rigide.
- L’injection dynamique est plus flexible et facilite la maintenance.
- L’utilisation de Spring permet d’automatiser la gestion des dépendances et de réduire le couplage, ce qui est essentiel dans les projets professionnels.

