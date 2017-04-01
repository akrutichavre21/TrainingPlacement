<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Training & Placement</title>
        <asset:stylesheet src="material.min.css"/>
        <asset:stylesheet src="login.css"/>
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    </head>
    </body>
        <div class="materialContainer">


           <div class="box">

              <div class="title">LOGIN</div>

              <form id="login-form" action="/login/authenticate" method="post">
                  <div class="input">
                     <label for="username">Email-Id</label>
                     <input type="text" name="username" id="username">
                     <span class="spin"></span>
                  </div>

                  <div class="input">
                     <label for="password">Password</label>
                     <input type="password" name="password" id="password">
                     <span class="spin"></span>
                  </div>
                  <div class="button login">
                     <button><span>GO</span> <i class="fa fa-check"></i></button>
                  </div>
              </form>

           </div>

           <div class="overbox">
              <div class="material-button alt-2"><span class="shape"></span></div>

              <div class="title">REGISTER</div>

              <form action="/register/index" method="post">
                  <div class="input">
                     <label for="s_fullname">Full Name</label>
                     <input type="text" name="s_fullname" id="s_fullname">
                     <span class="spin"></span>
                  </div>
                  <div class="input">
                     <label for="s_email">Email</label>
                     <input type="text" name="s_email" id="s_email">
                     <span class="spin"></span>
                  </div>

                  <div class="input">
                     <label for="s_password">Password</label>
                     <input type="password" name="s_password" id="s_password">
                     <span class="spin"></span>
                  </div>

                  <div class="button">
                     <button><span>NEXT</span></button>
                  </div>
              </form>


           </div>

        </div>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <asset:javascript src="material.min.js"/>
        <asset:javascript src="login.js"/>

    </body>
</html>