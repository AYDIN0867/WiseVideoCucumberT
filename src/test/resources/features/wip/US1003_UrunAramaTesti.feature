Feature: US1003 kullanici aradigi kelime icin uygun sonuc bulur

  @wip
  Scenario: TC07 Kullanici aradigi kelime sonucunda bulunan urun isimlerini arattirdigi
             kelimeyi icerdigini test edebilmeli


    Given kullanici trendyol anasayfaya gider
    When arama kutusuna phone yazip aratir
    And arama sonucunda urun bulunabildiğini test eder
    Then ilk urunu tıklar
    And acilan sayfadaki urun isminin case sensetive olmadan phone icerdigini test eder
    And sayfayi kapatir




