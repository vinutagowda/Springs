<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<jsp:include page="/header" />
<section style="padding:10px;min-height:400px;">
<h3>Hello! ${v.firstName } ${v.lastName} !</h3>
<h4>we are happy to confirm your registration</h4>
<h4>Oh! you are only ${v.age } years old</h4>
</section>

<jsp:include page="/footer"/>