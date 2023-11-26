#Author: Tayahi Jihen


Feature: Xiaomi Home page 
  
 Scenario: Accéder à la page maison connectée
    Given admin is on HomePage
    When admin mouseHover on menu "Smart Home" 
    And admin click on submenu "Maison connectée"
    Then admin is directed to the page "Maison Connectée"
