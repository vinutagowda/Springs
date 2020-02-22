<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<jsp:include page="/header" />
<section style="padding: 10px; min-height: 400px;">
	<h2>${msg }</h2>
	<form>
	<lable>Select salutation:</lable>
	<select name="salut">
	<option value="">----------select----------</option>
	<option value="Mr">Mister</option>
	<option value="Mrs">Misses</option>
	<option value="Ms">Miss</option>
	<option value="Dr">doctor</option>
	</select>
	<lable>Enter username:<input type="text" name="unm"></lable>
		<button>Done</button>
	</form>
</section>
<jsp:include page="/footer"/>