Feature: US1010 Belirlenen bilgilerle giris yapılamadıgı kontrol edilir

 @paralel2
  Scenario Outline: TC17 Belirlenen  gecersiz bilgilerle  giris yapamamalı

    Given kullanıcı "toUrl" sayfasına gider
    Then account linkine basar
    When email olarak "<verilenEmail>" girer
    And password olarak "<verilenPassword>" girer
    And kodları 2 saniye bekletir
    And signIn butonuna basar
    Then sisteme giris yapilamadıgını test eder


    Examples:
      |verilenEmail                |verilenPassword     |
      |toGecerliMail               |toGecersizPassword  |
      |toGecersizMail              |toGecersizPassword  |
      |toGecersizMail2             |toGecersizPassword2 |
      |toGecersizMail              |toGecersizPassword  |
      |toGecersizMail              |toGecerliPassword   |
      |toGecersizMail2             |toGecersizPassword  |