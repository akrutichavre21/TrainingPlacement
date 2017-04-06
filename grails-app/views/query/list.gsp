<g:applyLayout name = "mainLayout">
<html>
<head> </head>
<body>
<content tag = "body">


<g:if test="${newsfeed}">
    <g:each in="${newsfeed}">

    <div class="card" style=padding:"20px 20px 20px 20px">

     <p>Q:${it.queryTitle}</p>
    <g:link controller="comment" action="index" id= "${it.id}"> <button type ="button" name ="edit">Comment</button></g:link>

    </div>

</g:each>
</g:if>
<g:else>
    <p> No Query.</p>
</g:else>

 </content>
 </body>
 </html>
 </g:applyLayout>



















