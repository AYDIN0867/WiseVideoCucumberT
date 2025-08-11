Feature: US1012 kullanici alisveris yapar

  @wip
  Scenario: TC19 Kullanici istedigi urunu sepete ekledigini test eder

    Given kullanıcı "sauceUrl" sayfasına gider
    And kodları 2 saniye bekletir
    Then saucedemo username kutusuna "standard_user" yazar
    And saucedemo password kutusuna "secret_sauce" yazar
    And kodları 2 saniye bekletir
    Then saucedemo login tusuna basar
    And ilk urunun ismini kaydeder ve bu urunun sayfasina gider
    When saucedemo add to Cart butonuna basar
    Then saucedemo alisveris sepetine tiklar
    And kodları 2 saniye bekletir
    And sectigi urunun basarili olarak sepete eklendigini test eder
    And kodları 2 saniye bekletir