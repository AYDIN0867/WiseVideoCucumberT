Scenario: Subscribe Now text should be visible


Given user goes to "instulearnUrl"
Given user waits 2 seconds
When user scrolls the page until "SubscribeNow!" text
Then page should display "Subscribe Now"



Scenario: (Bronze, Gold, Silver) membership cards should be visible under Subscribe Now!
in the main body section.clicked, it should redirect to the Login page for membership transactions


Given user goes to "instulearnUrl"
Given user waits 2 seconds
When user scrolls the page until "SubscribeNow!" text
Then membership cards should display
Then purchase button under membership cards should clickable