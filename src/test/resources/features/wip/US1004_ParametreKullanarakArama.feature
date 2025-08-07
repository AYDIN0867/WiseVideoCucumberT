Feature: US1004 Kullanici parametre kullanarak istediği kelimeyi aratır

  @wip
  Scenario: TC08 Kullanici istedigi kelimeyi aratabilmeli

    Given kullanici trendyol anasayfaya gider
    When arama kutusuna "baby" yazip aratir
    Then arama sonucunda urun bulunabildiğini test eder
    And kodları 2 saniye bekletir
    And sayfayi kapatir





