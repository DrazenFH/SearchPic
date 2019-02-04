Background:
  Given Open https://searchpic.herokuapp.com/

  Scenario Test login and logut
  Given Login with user 'admin'
  When I press logout
  Then I see the login page