<g:applyLayout name="mainLayout">
<!DOCTYPE html>
<html>
	<head>
		<title></title>
	</head>
	<body>
    <content tag="body">
		<form id="resume-form" action="/resume/save" method="post">
		   Name:<br>

		   Aggregate:<br>
		   <input type="number" name="r_agg" id="r_agg" value="${editinstance.aggregate}"><br><br>
		   Father's Name:<br>
		   <input type="text" name="r_fathername" id="r_fathername" value="${editinstance.fatherName}"><br><br>
           Mother's Name:<br>
           <input type="text" name="r_mothername" id="r_mothername" value="${editinstance.motherName}"><br><br>
           Hobbies:<br>
           <input type="text" name="r_hobbies" id="r_hobbies" value="${editinstance.hobbies}"><br><br>
           Biodata:<br>
           <textarea name="r_biodata" id="r_biodata">${editinstance.bioData}</textarea><br><br>
           TwelfthPerrcentage:<br>
           <input type="number" name="r_twelfth" id="r_twelfth" value="${editinstance.twelfthPercentage}"><br><br>
           TenthPercentage:<br>
           <input type="number" name="r_tenth" id="r_tenth" value="${editinstance.tenthPercentage}"><br><br>
           Alive backlog:<br>
           <input type="text" name="r_alivebacklog" id="r_alivebacklog" value="${editinstance.aliveBacklog}"><br><br>
           Address:<br>
           <textarea name="r_address" id="r_address">${editinstance.address}</textarea><br><br>
           Achievments:<br>
           <textarea name="r_achievments" id="r_achievments">${editinstance.achievements}</textarea><br><br>
           <input type="submit" value="submit">
       </form>
       </content>
	</body>
</html>
</g:applyLayout>



