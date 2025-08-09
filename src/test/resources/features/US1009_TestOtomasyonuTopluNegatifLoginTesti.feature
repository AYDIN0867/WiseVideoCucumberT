
Feature: US1009 kullanici liste olarak verilen bilgilerle giris yapamaz

  @wip
  Scenario Outline: TC16 liste olarak verilen bilgilerle giris yapamamalı

    Given kullanıcı "toUrl" sayfasına gider
    Then account linkine basar
    When email olarak listede verilen "<verilenEmail>" girer
    And password olarak listede verilen "<verilenPassword>" girer
    And kodları 2 saniye bekletir
    And signIn butonuna basar
    Then sisteme giris yapilamadıgını test eder
    And sayfayi kapatir

    Examples: 
    |verilenEmail                |verilenPassword     |
    |esra@fmail.com              |1234555             |
    |gamze@gmail.com             |mesela123           |
    |zehra@zmail.com             |asdf4321            |
    |ayca@amail.com              |6543241tre65        |
    |gulnur@amail.com            |123ert678           |
    
    