#Author: Tayahi jihen

Feature: Maison Connectee page 

 Scenario: Effecture le tri et selectionner un produit 
    Given admin is on the page Maison Connectee 
    When admin choosing the sorting option " Tri par tarif croissant" and click on product "Mi Compact Bluetooth Speaker 2"
    Then admin is directed to the product page "Mi Compact Bluetooth Speaker 2"

