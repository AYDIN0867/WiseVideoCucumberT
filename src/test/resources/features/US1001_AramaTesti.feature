
  Feature: US1001 kullanici testotomasyonu sayfasinda arama yapar
   @smoke @regression
    Scenario:   TC01 kullanici testotomasyonu sayfasinda phone bulabilmeli

      Given kullanici trendyol anasayfaya gider
      When  arama kutusuna phone yazip aratir
      Then arama sonucunda urun bulunabildiğini test eder


@E2E_kullanıcı
Scenario: TC02 kullanici test otomasyonu sayfasinda dress bulunabilmeli

  Given  kullanici trendyol anasayfaya gider
  When arama kutusuna dress yazip aratir
  Then arama sonucunda urun bulunabildiğini test eder



Scenario: TC03 kullanici test otomasyonu sayfasinda travel kelimesi aratınca urun bulunabilmeli

  Given kullanici trendyol anasayfaya gider
  When arama kutusuna travel yazıp aratir
  And arama sonucunda urun bulunabildiğini test eder


