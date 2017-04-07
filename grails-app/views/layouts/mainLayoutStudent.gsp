<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Expense-Tracker</title>
    <asset:stylesheet src="bootstrap.min.css"/>
    <asset:stylesheet src="material.min.css"/>
    <asset:stylesheet src="animate.min.css"/>
    <asset:stylesheet src="timeline.css"/>
    <asset:stylesheet src="light-bootstrap-dashboard.css"/>
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>
    <asset:stylesheet src="pe-icon-7-stroke.css"/>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
          rel="stylesheet">
    <style>
        a {
            color: #ED2553;
        }
    </style>
    <g:layoutHead/>
</head>
<body>
    <div class="wrapper">
        <div class="sidebar" data-color="red" data-image="https://lh4.googleusercontent.com/-XplyTa1Za-I/VMSgIyAYkHI/AAAAAAAADxM/oL-rD6VP4ts/w1184-h666/Android-Lollipop-wallpapers-Google-Now-Wallpaper-2.png" data-image="assets/img/sidebar-5.jpg">

        <!--

            Tip 1: you can change the color of the sidebar using: data-color="blue | azure | green | orange | red | purple"
            Tip 2: you can also add an image using data-image tag

        -->

            <div class="sidebar-wrapper">
                <div class="logo">
                    <a href="/dashBoard/index" class="simple-text">
                        Training & Placement
                    </a>
                </div>

                <ul class="nav">
                    <li class="${params.controller == 'newsfeed' ? 'active':''}">
                        <a href="/newsfeed/index">
                            <i class="fa fa-fw fa-newspaper-o"></i>
                            <p>News Feed</p>
                        </a>
                    </li>

                    <li class="${params.controller == 'resume' ? 'active':''}">
                        <a href="/resume/index">
                            <i class="fa fa-fw fa-file-text-o"></i>
                            <p>Resume</p>
                        </a>
                     </li>

                    <li  class="${params.controller == 'question' ? 'active':''}">
                        <a href="/question/index">
                            <i class="fa fa-fw fa-question-circle"></i>
                            <p>Questions</p>
                        </a>
                    </li>

                    <li  class="${params.controller == 'feedback' ? 'active':''}">
                        <a href="/feedback/index">
                            <i class="fa fa-fw fa-comments-o"></i>
                            <p>Feed Back</p>
                        </a>
                    </li>

                    <li class="${params.controller == 'settings' && params.action == 'studentProfile' ? 'active':''}">
                        <a href="/settings/studentProfile">
                            <i class="fa fa-fw fa-user"></i>
                            <p>Profile</p>
                        </a>
                    </li>

                    <li class="${params.controller == 'settings' && params.action == 's_index' ? 'active':''}">
                        <a href="/settings/s_index">
                            <i class="fa fa-fw fa-cog"></i>
                            <p>Settings</p>
                        </a>
                    </li>
                    </hr>
                </ul>
            </div>
        </div>

        <div class="main-panel">
            <nav class="navbar navbar-default navbar-fixed">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand text-capitalize" href="#">${params.controller}</a>
                    </div>
                    <div class="collapse navbar-collapse">

                        <ul class="nav navbar-nav navbar-right">
                            <li>
                               <a href="/logout">
                                   Logout
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>


            <div class="content">
                <div class="container-fluid">
                   <g:pageProperty name="page.body"/>
                </div>
            </div>


            <footer class="footer">
                <div class="container-fluid">
                    <nav class="pull-left">
                        <ul>
                            <li>
                                <a href="#">
                                    Home
                                </a>
                            </li>

                        </ul>
                    </nav>
                    <p class="copyright pull-right">
                        &copy; <script>document.write(new Date().getFullYear())</script> <b>Akanksha Dewangan, Akruti Chavre, Akshata Nerkar</b>, made with love for a better web
                    </p>
                </div>
            </footer>

        </div>
    </div>
</body>

<asset:javascript src="jquery-1.10.2.js"/>
<asset:javascript src="bootstrap.min.js"/>
<asset:javascript src="bootstrap-checkbox-radio.swith.js"/>
<asset:javascript src="chartist.js"/>
<asset:javascript src="bootstrap.notify.js"/>
<asset:javascript src="light-bootstrap-dashboard.js"/>
<asset:javascript src="demo.js"/>
<asset:javascript src="material.min.js"/>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
</html>