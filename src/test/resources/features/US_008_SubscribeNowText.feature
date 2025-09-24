Feature: Subscribe Now Text Visibility
  Scenario: Subscribe Now text should be visible

    @subscribeNow
    Scenario: User scrolls to Subscribe Now text
      Given user goes to "instaLearnUrl"
      Given user waits "2" seconds
      When user scrolls the page until "SubscribeNow!" text
      And user waits "2" seconds
      Then page should display "Subscribe Now"
