Feature: US1002 kullanici testotomasyonu sayfasinda arama yapar
    Background:
    Given kullanici trendyol anasayfaya gider

  Scenario:   TC04 kullanici trendyol sayfasinda phone bulabilmeli

    When  arama kutusuna phone yazip aratir
    Then arama sonucunda urun bulunabildiğini test eder


    @smoke
  Scenario: TC05 kullanici test otomasyonu sayfasinda dress bulunabilmeli

    When arama kutusuna dress yazip aratir
    Then arama sonucunda urun bulunabildiğini test eder



  Scenario: TC06 kullanici test otomasyonu sayfasinda travel kelimesi aratınca urun bulunabilmeli

    When arama kutusuna travel yazıp aratir
    And arama sonucunda urun bulunabildiğini test eder

