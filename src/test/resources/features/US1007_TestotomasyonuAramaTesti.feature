Feature: US1007 kullanici arama yaptigi urunun bulundugunu test eder

  Scenario: TC14 kulanıcı aradıgı kelimeyi barindıran urun bulunabildigini test eder

    Given kullanıcı "toUrl" sayfasına gider
    When arama kutusuna config dosyasindaki toAranacakKelime yazip aratir
    And kodları 3 saniye bekletir
    Then testotomasyonu sayfasındaki ilk urunu tıklar
    And acilan sayfadaki urun isminin case sensetive olmadan config dosyasindaki toAranacakKelime icerdigini test eder
