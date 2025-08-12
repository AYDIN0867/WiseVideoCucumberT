

Feature: US1006 kullanıcı yanlıs bilgilerle giriş yapamaz

  @paralel1
  Scenario: TC11 kullanici gecerli email ve gecersiz password ile giris yapamamali

    Given kullanıcı testotomasyonu sayfasına gider
    Then account linkine basar
    And email olarak "toGecerliMail" girer
    And password olarak "toGecersizPassword" girer
    Then signIn butonuna basar
    When sisteme giris yapilamadıgını test eder
    And sayfayi kapatir

@paralel2
  Scenario: TC12 kullanici gecersiz email ve gecerli password ile giris yapamamali

    Given kullanıcı testotomasyonu sayfasına gider
    Then account linkine basar
    And email olarak "toGecersizMail" girer
    And password olarak "toGecerliPassword" girer
    Then signIn butonuna basar
    When sisteme giris yapilamadıgını test eder
    And sayfayi kapatir

  Scenario: TC13 kullanici gecersiz email ve gecersiz password ile giris yapamamali

    Given kullanıcı testotomasyonu sayfasına gider
    Then account linkine basar
    And email olarak "toGecersizMail" girer
    And password olarak "toGecersizPassword" girer
    Then signIn butonuna basar
    When sisteme giris yapilamadıgını test eder
    And sayfayi kapatir