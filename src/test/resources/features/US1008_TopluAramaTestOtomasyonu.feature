Feature: US1008 Kullanici toplu olarak verilen listedeki urunleri aratir

  Scenario Outline: TC15 kullanici verilen herbir kelimenin bulunabildigini test eder

    Given kullanıcı "toUrl" sayfasına gider
    When arama kutusuna "<AranacakKelimeler>" yazip aratir
    Then  testotomasyonu arama sonucunda urun bulunabildiğini test eder
    And kodları 1 saniye bekletir


    Examples:

    |AranacakKelimeler|
    |phone            |
    |apple            |
    |samsung          |
    |java             |
    |bag              |
    |travel           |
