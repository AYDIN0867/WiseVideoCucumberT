Feature: US1005 Kullanıcı gecerli bilgilerle sisteme giris yapar

@rapor
  Scenario: TC10 kullanıcı gecrli bilgilerle siteme giris yapabilmeli


    Given  kullanıcı testotomasyonu sayfasına gider
    When  account linkine basar
    Then email olarak "toGecerliMail" girer
    And password olarak "toGecersizPassword" girer
    And signIn butonuna basar
    Then basarili olarak giris yapılabildiğini test eder
    And kodları 2 saniye bekletir
    Then logout butonuna basarak cıkıs yapar
