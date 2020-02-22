

<jsp:include page="/header" />
<section style="padding: 10px; min-height: 400px;">
	
<h3>Visitor Registration</h3>
<form method="post">
<lable>Name:
<input type="text" name="firstName" placeholder="first name" required/>
<input type="text" name="lastName" placeholder="last name" required/>
</lable>
<br/><br/>
<lable>DateOfBirth
<input type="date" name="dateOfbirth" required/>
</lable>
<br/><br/>
<button>REGISTER</button>
</form>
</section>
<jsp:include page="/footer"/>