<g:applyLayout name = "mainLayout">
<html>
<head></head>
<body>
<content tag = "body">

<g:form controller="comment" action="save" method="post">

<input type="text" name="id" value= "${viewInstance.id}">
<p> QueryTitle: ${viewInstance.queryTitle}</p>
<p> QueryBody: ${viewInstance.queryBody}</p>
<p>   Author: ${viewInstance.author}</p>

 COMMENT:
 <br>

 <textarea name="answer" rows="5" cols="40"> </textarea>
 <br>
 <br>

<input type = "submit" name =" submit" value="submit">

</g:form>


</content>
</body>
</html>
</g:applyLayout>