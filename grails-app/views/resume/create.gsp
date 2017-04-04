<g:applyLayout name="mainLayout">
<!DOCTYPE html>
<html>
	<head>
		<title>resume</title>
	</head>
	<body>
    <content tag="body">
		<form id="resume-form" action="/resume/save" method="post">
		   Aggregate:<br>
		   <input type="number" name="r_agg" id="r_agg"><br><br>
		   Father's Name:<br>
		   <input type="text" name="r_fathername" id="r_fathername"><br><br>
           Mother's Name:<br>
           <input type="text" name="r_mothername" id="r_mothername"><br><br>
           Hobbies:<br>
           <input type="text" name="r_hobbies" id="r_hobbies"><br><br>
           Biodata:<br>
           <textarea name="r_biodata" id="r_biodata" ></textarea><br><br>
           TwelfthPerrcentage:<br>
           <input type="number" name="r_twelfth" id="r_twelfth"><br><br>
           TenthPerrcentage:<br>
           <input type="number" name="r_tenth" id="r_tenth"><br><br>
           Alive backlog:<br>
           <input type="text" name="r_alivebacklog" id="r_alivebacklog"><br><br>
           Address:<br>
           <textarea name="r_address" id="r_address" ></textarea><br><br>
           Achievments:<br>
           <textarea name="r_achievments" id="r_achievments" ></textarea><br><br>
           <input type="submit" value="submit">
       </form>
       </content>
	</body>
</html>
</g:applyLayout>



