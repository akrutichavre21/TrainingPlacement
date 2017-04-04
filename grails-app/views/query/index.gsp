<g:applyLayout name = "mainLayout">
<html>
<head></head>
<body>
<content tag = "body">





<g:each in="${abc}">

<div class="card" style=padding:"20px 20px 20px 20px">

<p> QueryTitle: ${it.queryTitle}</p>
<p> QueryBody: ${it.queryBody}</p>
<p>   Auther: ${it.author}</p>


<g:link controller="comment" action="index" id= "${it.id}"><button type = "button" name ="comment">COMMENT</button></g:link>




</g:each>





</content>
</body>
</html>
</g:applyLayout>