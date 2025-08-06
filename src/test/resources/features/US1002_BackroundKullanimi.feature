Feature: US1002 kullanici testotomasyonu sayfasinda arama yapar
    Background:
    Given kullanici trendyol anasayfaya gider

  Scenario:   TC04 kullanici testotomasyonu sayfasinda phone bulabilmeli

    When  arama kutusuna phone yazip aratir
    Then arama sonucunda urun bulunabildiğini test eder
    And sayfayi kapatir

    @smoke
  Scenario: TC05 kullanici test otomasyonu sayfasinda dress bulunabilmeli

    When arama kutusuna dress yazip aratir
    Then arama sonucunda urun bulunabildiğini test eder
    And sayfayi kapatir


  Scenario: TC06 kullanici test otomasyonu sayfasinda travel kelimesi aratınca urun bulunabilmeli

    When arama kutusuna travel yazıp aratir
    And arama sonucunda urun bulunabildiğini test eder
    Then sayfayi kapatir
