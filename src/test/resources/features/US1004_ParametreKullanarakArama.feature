Feature: US1004 Kullanici parametre kullanarak istediği kelimeyi aratır

  Scenario: TC08 Kullanici istedigi kelimeyi aratabilmeli

    Given kullanici trendyol anasayfaya gider
    When arama kutusuna "baby" yazip aratir
    Then arama sonucunda urun bulunabildiğini test eder
    And kodları 2 saniye bekletir


    Scenario: TC09 kullanici bazi kelimeleri bulamamalı

      Given kullanici trendyol anasayfaya gider
      When  arama kutusuna "iddis" yazip aratir
      Then  arama sonucunda urun bulunamadıgını test eder
      And kodları 1 saniye bekletir




